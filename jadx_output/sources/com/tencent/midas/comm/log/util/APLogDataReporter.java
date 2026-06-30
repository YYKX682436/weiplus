package com.tencent.midas.comm.log.util;

/* loaded from: classes13.dex */
public class APLogDataReporter {
    public static final java.lang.String MIDAS_LOG_ERROR_APPEND = "sdk.log.error.append";
    public static final java.lang.String MIDAS_LOG_ERROR_CLOSE = "sdk.log.error.close";
    public static final java.lang.String MIDAS_LOG_ERROR_FLUSH = "sdk.log.error.flush";
    public static final java.lang.String MIDAS_LOG_ERROR_INIT = "sdk.log.error.init";
    public static final java.lang.String MIDAS_LOG_ERROR_MMAP_OPEN = "sdk.log.error.mmap.open";
    public static final java.lang.String MIDAS_LOG_ERROR_PRINT = "sdk.log.error.print";
    public static final java.lang.String MIDAS_LOG_ERROR_PROCESS = "sdk.log.error.process";
    public static final java.lang.String MIDAS_LOG_ERROR_WRITE = "sdk.log.error.write";
    public static final java.lang.String MIDAS_LOG_INIT = "sdk.log.init";
    private com.tencent.midas.comm.log.util.APLogDataReporter.Reporter reporter;

    /* loaded from: classes13.dex */
    public static class Holder {
        private static final com.tencent.midas.comm.log.util.APLogDataReporter INSTANCE = new com.tencent.midas.comm.log.util.APLogDataReporter();

        private Holder() {
        }
    }

    /* loaded from: classes13.dex */
    public interface Reporter {
        void report(java.lang.String str, java.lang.String str2, java.lang.String str3);
    }

    public static com.tencent.midas.comm.log.util.APLogDataReporter getInstance() {
        return com.tencent.midas.comm.log.util.APLogDataReporter.Holder.INSTANCE;
    }

    public com.tencent.midas.comm.log.util.APLogDataReporter.Reporter getReporter() {
        return this.reporter;
    }

    public void report(java.lang.String str, java.lang.String str2) {
        report(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY, str, str2);
    }

    public void reportTimeEx(java.lang.String str, long j17) {
        report(str, java.lang.String.valueOf(java.lang.System.currentTimeMillis() - j17));
    }

    public void setReporter(com.tencent.midas.comm.log.util.APLogDataReporter.Reporter reporter) {
        this.reporter = reporter;
    }

    private APLogDataReporter() {
    }

    public void report(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            com.tencent.midas.comm.log.util.APLogDataReporter.Reporter reporter = this.reporter;
            if (reporter != null) {
                reporter.report(str, str2, str3);
            }
        } catch (java.lang.Throwable th6) {
            th6.getMessage();
        }
    }
}
