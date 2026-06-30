package com.tencent.midas.comm;

/* loaded from: classes13.dex */
public class APLog {
    private static com.tencent.midas.comm.log.internal.APLogger logger;
    private static com.tencent.midas.comm.APLogInfo logInfo = new com.tencent.midas.comm.APLogInfo();
    private static boolean shouldWriteLog = false;
    private static boolean shouldPrintLog = true;
    private static boolean hasLogCallback = false;

    private APLog() {
    }

    public static void closeLog() {
        flush();
    }

    private static java.lang.String composeLogMsg(java.lang.String str, java.lang.String str2) {
        return str + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG + java.lang.Thread.currentThread().getName() + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG + str2 + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE;
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        java.lang.String composeLogMsg = composeLogMsg(str, str2);
        if (hasLogCallback) {
            com.tencent.midas.comm.log.internal.APCallbackLogger.log(2, logInfo.getLogTag(), composeLogMsg);
            return;
        }
        if (shouldPrintLog) {
            com.tencent.midas.comm.log.internal.APLogger.log(2, logInfo.getLogTag(), composeLogMsg);
        }
        writeLog(composeLogMsg);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        java.lang.String composeLogMsg = composeLogMsg(str, str2);
        if (hasLogCallback) {
            com.tencent.midas.comm.log.internal.APCallbackLogger.log(5, logInfo.getLogTag(), composeLogMsg);
            return;
        }
        if (shouldPrintLog) {
            com.tencent.midas.comm.log.internal.APLogger.log(5, logInfo.getLogTag(), composeLogMsg);
        }
        writeLog(composeLogMsg);
    }

    public static void flush() {
        try {
            com.tencent.midas.comm.log.internal.APLogger aPLogger = logger;
            if (aPLogger != null) {
                aPLogger.flush();
            }
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
    }

    public static com.tencent.midas.comm.APLogInfo getLogInfo() {
        return logInfo;
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        java.lang.String composeLogMsg = composeLogMsg(str, str2);
        if (hasLogCallback) {
            com.tencent.midas.comm.log.internal.APCallbackLogger.log(3, logInfo.getLogTag(), composeLogMsg);
            return;
        }
        if (shouldPrintLog) {
            com.tencent.midas.comm.log.internal.APLogger.log(3, logInfo.getLogTag(), composeLogMsg);
        }
        writeLog(composeLogMsg);
    }

    public static void init(com.tencent.midas.comm.APLogInfo aPLogInfo) {
        if (aPLogInfo == null) {
            return;
        }
        try {
            logInfo = aPLogInfo;
            if (android.text.TextUtils.isEmpty(aPLogInfo.getLogCallbackClassName())) {
                hasLogCallback = false;
                com.tencent.midas.comm.log.internal.APCallbackLogger.release();
            } else if (com.tencent.midas.comm.log.internal.APCallbackLogger.init(aPLogInfo.getLogCallbackClassName())) {
                hasLogCallback = true;
                return;
            }
            logInfo.init();
            com.tencent.midas.comm.log.APLogFileInfo.create();
            com.tencent.midas.comm.log.util.APLogFileUtil.readLogKeepConf(logInfo.getContext());
            shouldPrintLog = logInfo.shouldPrintLog();
            if (com.tencent.midas.comm.log.util.APLogFileUtil.initLogDir(com.tencent.midas.comm.log.APLogFileInfo.dirName)) {
                shouldWriteLog = logInfo.isWriteLog();
                if (logger == null) {
                    logger = com.tencent.midas.comm.log.internal.APLogger.open();
                }
            }
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
    }

    public static void s(boolean z17, java.lang.String str, java.lang.String str2) {
        java.lang.String composeLogMsg = composeLogMsg(str, str2);
        if (hasLogCallback) {
            com.tencent.midas.comm.log.internal.APCallbackLogger.log(6, logInfo.getLogTag(), composeLogMsg);
            return;
        }
        if (shouldPrintLog && !z17) {
            com.tencent.midas.comm.log.internal.APLogger.log(6, logInfo.getLogTag(), composeLogMsg);
        }
        writeLog(composeLogMsg);
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        java.lang.String composeLogMsg = composeLogMsg(str, str2);
        if (hasLogCallback) {
            com.tencent.midas.comm.log.internal.APCallbackLogger.log(1, logInfo.getLogTag(), composeLogMsg);
            return;
        }
        if (shouldPrintLog) {
            com.tencent.midas.comm.log.internal.APLogger.log(1, logInfo.getLogTag(), composeLogMsg);
        }
        writeLog(composeLogMsg);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        java.lang.String composeLogMsg = composeLogMsg(str, str2);
        if (hasLogCallback) {
            com.tencent.midas.comm.log.internal.APCallbackLogger.log(4, logInfo.getLogTag(), composeLogMsg);
            return;
        }
        if (shouldPrintLog) {
            com.tencent.midas.comm.log.internal.APLogger.log(4, logInfo.getLogTag(), composeLogMsg);
        }
        writeLog(composeLogMsg);
    }

    private static void write(java.lang.String str) {
        try {
            com.tencent.midas.comm.log.internal.APLogger aPLogger = logger;
            if (aPLogger != null) {
                aPLogger.write(str);
            }
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
    }

    private static void writeLog(java.lang.String str) {
        if (shouldWriteLog) {
            write(str);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        d(str, java.lang.String.format(str2, objArr));
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        e(str, java.lang.String.format(str2, objArr));
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        i(str, java.lang.String.format(str2, objArr));
    }

    public static void s(boolean z17, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        s(z17, str, java.lang.String.format(str2, objArr));
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        v(str, java.lang.String.format(str2, objArr));
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        w(str, java.lang.String.format(str2, objArr));
    }

    public static void s(java.lang.String str, java.lang.String str2) {
        writeLog(composeLogMsg(str, str2));
    }

    public static void s(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        s(str, java.lang.String.format(str2, objArr));
    }
}
