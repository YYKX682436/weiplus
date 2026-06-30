package com.tencent.midas.comm;

/* loaded from: classes13.dex */
public class APLogUtil {
    private static boolean HAS_INIT_LOG_IN_MAIN_PROCESS;
    private static boolean HAS_INIT_LOG_IN_NEW_PROCESS;
    public static boolean IS_IN_NEW_PROCESS;

    public static void flushIfNewProcess() {
        if (!IS_IN_NEW_PROCESS || com.tencent.midas.comm.APLog.getLogInfo() == null || com.tencent.midas.comm.APLog.getLogInfo().isAutoFlush()) {
            return;
        }
        com.tencent.midas.comm.APLog.flush();
    }

    public static void initAPLogIfNewProcess(final android.content.Context context, boolean z17, final boolean z18, final java.lang.String str) {
        if (!z17 || HAS_INIT_LOG_IN_NEW_PROCESS) {
            return;
        }
        IS_IN_NEW_PROCESS = true;
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.midas.comm.APLogUtil.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.tencent.midas.comm.APLogInfo aPLogInfo = new com.tencent.midas.comm.APLogInfo();
                    com.tencent.midas.comm.log.util.APLogDataReporter.getInstance().setReporter(new com.tencent.midas.comm.log.util.APLogDataReporter.Reporter() { // from class: com.tencent.midas.comm.APLogUtil.1.1
                        @Override // com.tencent.midas.comm.log.util.APLogDataReporter.Reporter
                        public void report(java.lang.String str2, java.lang.String str3, java.lang.String str4) {
                            com.tencent.midas.data.APPluginReportManager.getInstance().insertData(str2, str3, "", str4);
                        }
                    });
                    aPLogInfo.setContext(context);
                    aPLogInfo.setLogEnable(z18);
                    aPLogInfo.setAutoFlush(true);
                    aPLogInfo.setLogTag("TencentPay");
                    aPLogInfo.setLogCallbackClassName(str);
                    com.tencent.midas.comm.APLog.init(aPLogInfo);
                    boolean unused = com.tencent.midas.comm.APLogUtil.HAS_INIT_LOG_IN_NEW_PROCESS = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.midas.comm.APLog.e("APLogUtil init", th6.toString());
                }
            }
        }).start();
    }

    public static void initAPLogInPlugin(final android.content.Context context, final boolean z17, final java.lang.String str) {
        if (HAS_INIT_LOG_IN_MAIN_PROCESS) {
            return;
        }
        HAS_INIT_LOG_IN_MAIN_PROCESS = true;
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.midas.comm.APLogUtil.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.tencent.midas.comm.APLogInfo aPLogInfo = new com.tencent.midas.comm.APLogInfo();
                    com.tencent.midas.comm.log.util.APLogDataReporter.getInstance().setReporter(new com.tencent.midas.comm.log.util.APLogDataReporter.Reporter() { // from class: com.tencent.midas.comm.APLogUtil.2.1
                        @Override // com.tencent.midas.comm.log.util.APLogDataReporter.Reporter
                        public void report(java.lang.String str2, java.lang.String str3, java.lang.String str4) {
                            com.tencent.midas.data.APPluginReportManager.getInstance().insertData(str2, str3, "", str4);
                        }
                    });
                    aPLogInfo.setContext(context);
                    aPLogInfo.setLogEnable(z17);
                    aPLogInfo.setAutoFlush(true);
                    aPLogInfo.setLogTag("TencentPay");
                    aPLogInfo.setLogCallbackClassName(str);
                    com.tencent.midas.comm.APLog.init(aPLogInfo);
                } catch (java.lang.Throwable th6) {
                    com.tencent.midas.comm.APLog.e("APLogUtil init", th6.toString());
                }
            }
        }).start();
    }
}
