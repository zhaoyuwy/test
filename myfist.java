/*
 * 文 件 名:  RetCode.java
  * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
   * 描    述:  <描述>
    * 修 改 人:  y00151418
     * 修改时间:  Dec 4, 2012
      * 跟踪单号:  <跟踪单号>
       * 修改单号:  <修改单号>
        * 修改内容:  <修改内容>
	 */
	 package com.huawei.upgradetool.common.constats;

	 /**
	  * <一句话功能简述>响应消息码定义
	   * <功能详细描述>工具需要对定义的返回码做逻辑处理
	    * 
	     * @author  y00151418
	      * @version  [版本号, Dec 4, 2012]
	       * @see  [相关类/方法]
	        * @since  [产品/模块版本]
		 */
		 public interface RetCode
		 {
		     /**
		          * 解析XML失败
			       */
			           int PARSE_XML_FAILED = 110;
				       
				           /**
					        * 资源冲突
						     */
						         int CONFLICT = 409;
							     
							         /**
								      * 内部错误
								           */
									       int INNER_ERROR = 500;
									           
										       /**
										            * 获取节点信息失败
											         */
												     int GET_NODE_INFO_ERROR = 501;
												         
													     /**
													          * 获取FA节点信息失败
														       */
														           int GET_FA_NODE_INFO_ERROR = 9001;
															       
															           /**
																        * 任务超时
																	     */
																	         int TASK_TIMOUT_OUT = 502;
																		     
																		         /**
																			      * 未找到
																			           */
																				       int NOT_FOUND = 404;
																				           
																					       /**
																					            * OK
																						         */
																							     int OK = 200;
																							         
																								     /**
																								          * openstack关闭或启动虚拟机返回成功
																									       */
																									           int OPENSTACK_OK = 202;
																										       
																										           
																											       
																											           /**
																												        * 定时任务执行时，如果任务的执行条件不满足，则返回该值，表示还将继续下一次执行
																													     */
																													         int GO_ON = 201;
																														     
																														         /**
																															      * 用于前台后接口中,表示有错误发生
																															           */
																																       int ERROR_OCCUR = 400;
																																           
																																	       /**
																																	            * 不能执指定操作
																																		         */
																																			     int CANOT_OP = 401;
																																			         
																																				     /**
																																				          * openStack 灰度升级条件不满足
																																					       */
																																					           
																																						       int OSTACK_GRAY = 701;
																																						           
																																							       /**
																																							            * 未授权
																																								         */
																																									     String SC_UNAUTHORIZED = "401";
																																									         
																																										     /**
																																										          * 鉴权失败
																																											       */
																																											           int UN_AUTHORIZED = 401;
																																												       
																																												           /**
																																													        * 登录失败
																																														     */
																																														         int LOGIN_ERROR = 402;
																																															     
																																															         /**
																																																      * 软件包格式错误
																																																           */
																																																	       //    int INVALID_FORMAT = 403;
																																																	           int INVALID_FORMAT = 405;
																																																		       
																																																		           /**
																																																			        * 主、备倒换中
																																																				     */
																																																				         int SWITCH_RUNNING = 207;
																																																					     
																																																					         /**
																																																						      * ssh 命令执行成功
																																																						           */
																																																							       int SSH_OK = 0;
																																																							           
																																																								       /**
																																																								            * 执行命令失败
																																																									         */
																																																										     int SSH_CMD_ERROR = 1;
																																																										         
																																																											     /**
																																																											          * ssh 鉴权失败
																																																												       */
																																																												           int SSH_AUTH_ERROR = 2;
																																																													       
																																																													           /**
																																																														        * 连接超时
																																																															     */
																																																															         int SSH_TIME_OUT = 3;
																																																																     
																																																																         /**
																																																																	      * 文件不存在
																																																																	           */
																																																																		       int SSH_NOT_EXISTS = 4;
																																																																		           
																																																																			       /**
																																																																			            * SHA校验失败
																																																																				         */
																																																																					     //    int SHA_FAILED = 700;
																																																																					         int SHA_FAILED = 401;
																																																																						     
																																																																						         /**
																																																																							      * RSET交互失败
																																																																							           */
																																																																								       int RSET_FAILED = 10;
																																																																								           
																																																																									       /**
																																																																									            * rest通信，io异常
																																																																										         */
																																																																											     int REST_IO_ERROR = 7014;
																																																																											         
																																																																												     /**
																																																																												          * DSM未升级成功
																																																																													       */
																																																																													           int DSM_NOT_UPGRADE = 7018;
																																																																														       
																																																																														           /**
																																																																															        * DSA未回退成功
																																																																																     */
																																																																																         int DSA_NOT_ROLLBACK_SUCCESS = 7020;
																																																																																	     
																																																																																	         /**
																																																																																		      * rest连接超时
																																																																																		           */
																																																																																			       int REST_CONNECT_TIME_OUT = 7008;
																																																																																			           
																																																																																				       /**
																																																																																				            * 主备未同步操作
																																																																																					         */
																																																																																						     int MASTER_SLAVE_NOT_SYN = 7037;
																																																																																						         
																																																																																							     /**
																																																																																							          * 只支持一批DSA任务运行
																																																																																								       */
																																																																																								           int ONLY_SUPPORT_ONE_BATCH_DSA_TASK = 7047;
																																																																																									       
																																																																																									           /**
																																																																																										        * 没有节点能够执行当前操作，如果有任务正在执行，请稍后重试
																																																																																											     */
																																																																																											         int NO_NODE_CAN_DO_THIS_TASK = 7087;
																																																																																												     
																																																																																												         /**
																																																																																													      * 没有DSA节点能够执行当前操作，请去除所勾选的DSA节点再试
																																																																																													           */
																																																																																														       int NO_DSA_NODE_CAN_DO_THIS_TASK = 7108;
																																																																																														           
																																																																																															       /**
																																																																																															            * 多套公用VBS，需要参照FAQ勾选节点
																																																																																																         */
																																																																																																	     int COMMON_VBS_PLEASE_READ_FAQ = 7107;
																																																																																																	         
																																																																																																		     /**
																																																																																																		          * 所选节点上有任务正在执行，请稍后重试
																																																																																																			       */
																																																																																																			           int SELECT_NODES_ARE_RUNNING_TASK = 7088;
																																																																																																				       
																																																																																																				           /**
																																																																																																					        * 本套FusionStorage有节点正在执行非分发任务
																																																																																																						     */
																																																																																																						         int OTHER_NODES_ARE_RUNNING_OTHER_TASK = 7089;
																																																																																																							     
																																																																																																							         /**
																																																																																																								      * FSM未升级成功
																																																																																																								           */
																																																																																																									       int FSM_NOT_UPGRADE = 7090;
																																																																																																									               
																																																																																																										           /**
																																																																																																											        * 节点版本号不一致
																																																																																																												     */
																																																																																																												         int NODE_VERSION_IS_NOT_IN_COMMON = 7105;
																																																																																																													     
																																																																																																													         /**
																																																																																																														      * MDC未升级成功
																																																																																																														           */
																																																																																																															       int MDC_NOT_UPGRADE = 7091;
																																																																																																															           
																																																																																																																       /**
																																																																																																																            * VBS,OSD未全部回退
																																																																																																																	         */
																																																																																																																		     int VBS_OSD_NOT_ROLLBACK_All = 7092;
																																																																																																																		         
																																																																																																																			     /**
																																																																																																																			          * MDC未全部回退
																																																																																																																				       */
																																																																																																																				           int MDC_NOT_ROLLBACK_ALL = 7093;
																																																																																																																					       
																																																																																																																					           /**
																																																																																																																						        * MDC未全部选中
																																																																																																																							     */
																																																																																																																							         int MDC_NOT_CHECKED_ALL = 7094;
																																																																																																																								     
																																																																																																																								         
																																																																																																																									     /**
																																																																																																																									          * 工程属性中缺少至少一套FSM的配置信息
																																																																																																																										       */
																																																																																																																										           int LACK_FSM_INFO = 7096;
																																																																																																																											       
																																																																																																																											           /**
																																																																																																																												        * 同一批次分发软件包节点数目不能超过50个。
																																																																																																																													     */
																																																																																																																													         int DISTRIBUTE_CAN_NOT_MORE_THAN_50 = 7098;
																																																																																																																														        
																																																																																																																															    /**
																																																																																																																															         * 操作节点数超过工具所支持的最大节点数
																																																																																																																																      */
																																																																																																																																          int DSWARE_BATCH_NODES_OVER_RANGE = 7099;
																																																																																																																																	      
																																																																																																																																	          /**
																																																																																																																																		       * 网络异常
																																																																																																																																		            */
																																																																																																																																			        int NETWORK_EXCEPTION = 7014;
																																																																																																																																				    
																																																																																																																																				        /**
																																																																																																																																					     * 本套FusionStorage有节点正在执行分发任务
																																																																																																																																					          */
																																																																																																																																						      int OTHER_NODES_DISTRIBUTE_RUNNING_TASK = 7109;
																																																																																																																																						          
																																																																																																																																							      /**
																																																																																																																																							           * 有流程正在执行
																																																																																																																																								        */
																																																																																																																																									    int REPEAT_REQUEST = 5600;
																																																																																																																																									        
																																																																																																																																										    /**
																																																																																																																																										         * 任务重复
																																																																																																																																											      */
																																																																																																																																											          int TASK_REQUEST = 5614;
																																																																																																																																												      
																																																																																																																																												          /**
																																																																																																																																													       * 软件包找不到
																																																																																																																																													            */
																																																																																																																																														        int PKG_NOT_EXIST = 404;
																																																																																																																																															    
																																																																																																																																															        /**
																																																																																																																																																     * SHA256校验文件不存在
																																																																																																																																																          */
																																																																																																																																																	      int SHA256_NOT_EXIST = 406;
																																																																																																																																																	          
																																																																																																																																																		      /**
																																																																																																																																																		           * 软件包内容错误
																																																																																																																																																			        */
																																																																																																																																																				    int PKG_CFG_INVALID = 405;
																																																																																																																																																				        
																																																																																																																																																					    /**
																																																																																																																																																					         * 软件包类型不匹配
																																																																																																																																																						      */
																																																																																																																																																						          int PKG_TYPE_INVALID = 407;
																																																																																																																																																							      
																																																																																																																																																							          /**
																																																																																																																																																								       * 有正在运行的任务关联配置
																																																																																																																																																								            */
																																																																																																																																																									        int TASK_RELATED_CFG = 408;
																																																																																																																																																										    
																																																																																																																																																										        /**
																																																																																																																																																											     * 文件不存在
																																																																																																																																																											          */
																																																																																																																																																												      int FILE_PATH_NOT_EXIST = 410;
																																																																																																																																																												          
																																																																																																																																																													      /**
																																																																																																																																																													           * 文件配置项错误
																																																																																																																																																														        */
																																																																																																																																																															    int FILE_CONFIGURE_ERROR = 411;
																																																																																																																																																															        
																																																																																																																																																																    /**
																																																																																																																																																																         * 手工分批表固有属性与CNA节点表不匹配，说明被手工修改过或者出错
																																																																																																																																																																	      */
																																																																																																																																																																	          int FILE_NOT_MATCH = 412;
																																																																																																																																																																		      
																																																																																																																																																																		          /**
																																																																																																																																																																			       * 主备VRM所在CNA不能在同一手工分批批次中
																																																																																																																																																																			            */
																																																																																																																																																																				        int MCNA_NOT_IN_SAME_BATCH = 413;
																																																																																																																																																																					    
																																																																																																																																																																					        /**
																																																																																																																																																																						     * 一个集群中存在多个相同的IP
																																																																																																																																																																						          */
																																																																																																																																																																							      int CLUSTER_IN_SAME_IP = 414;
																																																																																																																																																																							          
																																																																																																																																																																								      /**
																																																																																																																																																																								           * 当前节点有升级或回退任务正在运行
																																																																																																																																																																									        */
																																																																																																																																																																										    int HAS_OTHE_TASK_RUNNING = 7068;

																																																																																																																																																																										        /**
																																																																																																																																																																											     * 软件包正在分发
																																																																																																																																																																											          */
																																																																																																																																																																												      int PKG_IS_DISTRIBUTEING = 7067;
																																																																																																																																																																												      /**
																																																																																																																																																																												       * VRM回退中
																																																																																																																																																																												        */
																																																																																																																																																																													    int VRM_IS_ROLL_BACKING = 7071;
																																																																																																																																																																													        

																																																																																																																																																																														    /**
																																																																																																																																																																														         * 服务不可用
																																																																																																																																																																															      */
																																																																																																																																																																															          int SERVICE_UNAVAILABLE = 503;
																																																																																																																																																																																      
																																																																																																																																																																																          /**
																																																																																																																																																																																	       * 系统不支持该服务功能
																																																																																																																																																																																	            */
																																																																																																																																																																																		        int NOT_IMPLEMENTED = 501;
																																																																																																																																																																																			    
																																																																																																																																																																																			        /**
																																																																																																																																																																																				     * 服务端不执行此请求操作
																																																																																																																																																																																				          */
																																																																																																																																																																																					      int INTERNAL_HOST_ERROR = 500;
																																																																																																																																																																																					          
																																																																																																																																																																																						      /**
																																																																																																																																																																																						           * 此资源不支持该方法
																																																																																																																																																																																							        */
																																																																																																																																																																																								    int METHODE_NOT_ALLOWED = 405;
																																																																																																																																																																																								        
																																																																																																																																																																																									    /**
																																																																																																																																																																																									         * 用户无该操作权限
																																																																																																																																																																																										      */
																																																																																																																																																																																										          int FORBIDDEN = 403;
																																																																																																																																																																																											      
																																																																																																																																																																																											          /**
																																																																																																																																																																																												       * 请求不合法
																																																																																																																																																																																												            */
																																																																																																																																																																																													        int BAD_REQUEST = 400;
																																																																																																																																																																																														    
																																																																																																																																																																																														        /**
																																																																																																																																																																																															     * rest通信异常
																																																																																																																																																																																															          */
																																																																																																																																																																																																      int REST_EXCEPTION = 7014;
																																																																																																																																																																																																          
																																																																																																																																																																																																	      /**
																																																																																																																																																																																																	           * ROOT密码错误
																																																																																																																																																																																																		        */
																																																																																																																																																																																																			    int INVALID_ROOT_PWD = 7073;
																																																																																																																																																																																																			        
																																																																																																																																																																																																				    /**
																																																																																																																																																																																																				         * IP配置冲突
																																																																																																																																																																																																					      */
																																																																																																																																																																																																					          int INVALID_IP_CFG = 7079;
																																																																																																																																																																																																						      
																																																																																																																																																																																																						          /**
																																																																																																																																																																																																							       * GE rest用户名或者密码错误
																																																																																																																																																																																																							            */
																																																																																																																																																																																																								        int GE_REST_AUTH_FAILED = 10100103;
																																																																																																																																																																																																									    
																																																																																																																																																																																																									        /**
																																																																																																																																																																																																										     * CNA的重启策略不同
																																																																																																																																																																																																										          */
																																																																																																																																																																																																											      int CNA_REBOOT_TYPE_NOT_SAME = 8000;
																																																																																																																																																																																																											          
																																																																																																																																																																																																												      /**
																																																																																																																																																																																																												           * CNA的重启策略未知
																																																																																																																																																																																																													        */
																																																																																																																																																																																																														    int CNA_REBOOT_TYPE_UNKNOWN = 8001;
																																																																																																																																																																																																														        
																																																																																																																																																																																																															    /**
																																																																																																																																																																																																															         * 待升级的CNA节点的源版本号不同
																																																																																																																																																																																																																      */
																																																																																																																																																																																																																          int CNA_SRC_VERSION_NOT_SAME = 8002;
																																																																																																																																																																																																																	      
																																																																																																																																																																																																																	          /**
																																																																																																																																																																																																																		       * 有管理节点升级或是回退失败
																																																																																																																																																																																																																		            */
																																																																																																																																																																																																																			        int MANAGE_NODE_UPGRADE_FAIL = 521;
																																																																																																																																																																																																																				    
																																																																																																																																																																																																																				        /**
																																																																																																																																																																																																																					     * 有节点升级或是回退失败
																																																																																																																																																																																																																					          */
																																																																																																																																																																																																																						      int NODE_UPGRADE_FAIL = 522;
																																																																																																																																																																																																																						          
																																																																																																																																																																																																																							      /**
																																																																																																																																																																																																																							           * HOST节点尚未执行升级
																																																																																																																																																																																																																								        */
																																																																																																																																																																																																																									    int HOST_NOT_UPGRADE = 523;
																																																																																																																																																																																																																									        
																																																																																																																																																																																																																										    int HOST_COMMIT_FAILED = 526;
																																																																																																																																																																																																																										        
																																																																																																																																																																																																																											    /**
																																																																																																																																																																																																																											         * FusionStorage升级后提交前需要切换消息版本号和转换元数据，请确认已经执行该操作
																																																																																																																																																																																																																												      */
																																																																																																																																																																																																																												          int ALTER_VERSION_AND_TRANS_METEDATE = 524;
																																																																																																																																																																																																																													      	
																																																																																																																																																																																																																														    /**
																																																																																																																																																																																																																														         * 获取Region信息失败
																																																																																																																																																																																																																															      */
																																																																																																																																																																																																																															          int QUERY_REGION_INFO_FAILED = 8004;
																																																																																																																																																																																																																																      
																																																																																																																																																																																																																																          /**
																																																																																																																																																																																																																																	       * 所选择的region中不包含cps或者upgrade服务
																																																																																																																																																																																																																																	            */
																																																																																																																																																																																																																																		        int CPS_OR_UPG_ERROR = 8005;
																																																																																																																																																																																																																																			    
																																																																																																																																																																																																																																			        /**
																																																																																																																																																																																																																																				     * 软件包已经分发成功
																																																																																																																																																																																																																																				          */
																																																																																																																																																																																																																																					      int PKG_DISTRIBUTE_SUCCESS_ALREADY = 8009;
																																																																																																																																																																																																																																					          :
																																																																																																																																																																																																																																						      int VM_AFFECTED_UNKNOWN = 8017;
																																																																																																																																																																																																																																						          
																																																																																																																																																																																																																																							      int VM_AFFECTED_TYPE_NOT_SAME = 8018;

																																																																																																																																																																																																																																							          int UPGRADE_PACKAGE_NOT_SUPPORT = 8024;
																																																																																																																																																																																																																																								      
																																																																																																																																																																																																																																								          int PACKAGE_REPEAT = 8033;
																																																																																																																																																																																																																																									      
																																																																																																																																																																																																																																									          int PACKAGE_REPEAT2 = 8038;
																																																																																																																																																																																																																																										      
																																																																																																																																																																																																																																										          //重定向
																																																																																																																																																																																																																																											      int REDIRECT_STATUS = 302;
																																																																																																																																																																																																																																											          
																																																																																																																																																																																																																																												      //账户已锁定
																																																																																																																																																																																																																																												          int LOGIN_LOCKED_ALLREADY = 601;
																																																																																																																																																																																																																																													      //登录失败
																																																																																																																																																																																																																																													          int LOGIN_FAILED = 602;
																																																																																																																																																																																																																																														      //首次登录
																																																																																																																																																																																																																																														          int LOGIN_FIRST = 603;
																																																																																																																																																																																																																																															      //登陆成功
																																																																																																																																																																																																																																															          int LOGIN_SUCCESS = 604;
																																																																																																																																																																																																																																																      //登录锁定
																																																																																																																																																																																																																																																          int LOGIN_LOCKED = 605;
																																																																																																																																																																																																																																																	      
																																																																																																																																																																																																																																																	          //两次输入的密码不相同
																																																																																																																																																																																																																																																		      int RESET_PWD_NOT_SAME = 606;
																																																																																																																																																																																																																																																		          
																																																																																																																																																																																																																																																			      //新密码不满足复杂度要求
																																																																																																																																																																																																																																																			          int RESET_PWD_NOT_SECURITY = 607;
																																																																																																																																																																																																																																																				      
																																																																																																																																																																																																																																																				          int MIGRATE_VM_ERROR = 8036;
																																																																																																																																																																																																																																																					      //上分节点的当前状态不支持分发软件包操作
																																																																																																																																																																																																																																																					          int DISTRIBUTE_SOME_FLOW_NOT_FINISHED = 8039;
																																																																																																																																																																																																																																																						      //角色变更
																																																																																																																																																																																																																																																						          int ROLE_CHANGE = 10021;
																																																																																																																																																																																																																																																							      //上一轮工程未提交
																																																																																																																																																																																																																																																							          int PRE_PROJECT_UNCOMMIT = 10053;
																																																																																																																																																																																																																																																								      //上一轮工程自动提交失败
																																																																																																																																																																																																																																																								          int AUTO_COMMIT_FAILED = 525;
																																																																																																																																																																																																																																																									      //超过线程池最大线程数
																																																																																																																																																																																																																																																									          int OUT_OF_POOL_SIZE = 8041;
																																																																																																																																																																																																																																																										      
																																																																																																																																																																																																																																																										          
																																																																																																																																																																																																																																																											      int NOT_SAME_STATUS = 527;
																																																																																																																																																																																																																																																											          
																																																																																																																																																																																																																																																												      int SERVICE_IS_PRECHECKING = 528;
																																																																																																																																																																																																																																																												          
																																																																																																																																																																																																																																																													      int SELECT_REBOOT_NOT_REBOOT_SERVICE = 529;
																																																																																																																																																																																																																																																													          
																																																																																																																																																																																																																																																														      int HAVE_FAIL_TASK = 530;
																																																																																																																																																																																																																																																														          
																																																																																																																																																																																																																																																															      int ONLY_COMPUTE_NODE_SELECT = 531;
																																																																																																																																																																																																																																																															          
																																																																																																																																																																																																																																																																      int ONLY_REBOOT_COMPUTE_NODE_SELECT = 535;
																																																																																																																																																																																																																																																																          
																																																																																																																																																																																																																																																																	      int MANAGE_SERVICE_NOT_UPGRADE_SUCCESS = 532;
																																																																																																																																																																																																																																																																	          
																																																																																																																																																																																																																																																																		      int SELECT_NOT_REBOOT_SERVICE = 533;
																																																																																																																																																																																																																																																																		          
																																																																																																																																																																																																																																																																			      int SELECT_REBOOT_SERVICE = 534;
																																																																																																																																																																																																																																																																			          
																																																																																																																																																																																																																																																																				      int SELECT_NOT_REBOOT_SERVICE_PREROLLBACK = 536;
																																																																																																																																																																																																																																																																				          
																																																																																																																																																																																																																																																																					      int NO_NODE_CAN_OPERATE = 537;
																																																																																																																																																																																																																																																																					          
																																																																																																																																																																																																																																																																						      //选择的服务中存在部分节点不能进行此操作
																																																																																																																																																																																																																																																																						          int SOME_NODE_STATUS_ERROR = 8043;
																																																																																																																																																																																																																																																																							      //所有失败节点必须同时处理
																																																																																																																																																																																																																																																																							          int ERROR_NODE_SURPLUS_ERROR = 8044;
																																																																																																																																																																																																																																																																								      int VERSION_NOT_SAME_ERROR = 8045;
																																																																																																																																																																																																																																																																								          int COMPUTE_UPGRADE_FIRST_ERROR = 8046;
																																																																																																																																																																																																																																																																									      int REBOOT_SERVICE_ROLLBACK_FIRST = 8047;

																																																																																																																																																																																																																																																																									          //2017年1月18日10:15:41 DsWare激活去激活，返回操作  7700-8000;
																																																																																																																																																																																																																																																																										      int DSWARE_ACTIVE_HAS_NOT_UPGRADE_SECEDED = 7700;
																																																																																																																																																																																																																																																																										          int DSWARE_ACTIVE_IS_ALREADY_ACTIVE_SECEDED = 7701;
																																																																																																																																																																																																																																																																											      
																																																																																																																																																																																																																																																																											          int DSWARE_DEACTIVE_SERVICE_NOT_ACTIVE = 7771;
																																																																																																																																																																																																																																																																												      int DSWARE_DEACTIVE_IS_ALREADY_DEACTIVE_SECEDED = 7771;
																																																																																																																																																																																																																																																																												      }

