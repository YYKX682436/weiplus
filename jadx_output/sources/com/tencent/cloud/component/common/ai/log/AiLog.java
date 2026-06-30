package com.tencent.cloud.component.common.ai.log;

/* loaded from: classes14.dex */
public class AiLog {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final java.lang.String TAG = "AiLog";
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    public static boolean isInit;
    public static com.tencent.cloud.component.common.ai.log.AiLogger logger;

    public static boolean assertInitLogger() {
        return isInit;
    }

    public static void asset(java.lang.String str, java.lang.String str2) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.asset(str, str2);
    }

    public static void debug(java.lang.String str, java.lang.String str2) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.debug(str, str2);
    }

    public static void error(java.lang.String str, java.lang.String str2) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.error(str, str2);
    }

    public static void info(java.lang.String str, java.lang.String str2) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.info(str, str2);
    }

    public static void init(com.tencent.cloud.component.common.ai.log.AiLogger aiLogger) {
        if (aiLogger == null) {
            throw new java.lang.IllegalStateException("init AiLogger is null!");
        }
        logger = aiLogger;
        isInit = true;
    }

    public static void release() {
        com.tencent.cloud.component.common.ai.log.AiLogger aiLogger = logger;
        if (aiLogger != null) {
            aiLogger.release();
        }
    }

    public static void verbose(java.lang.String str, java.lang.String str2) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.verbose(str, str2);
    }

    public static void warn(java.lang.String str, java.lang.String str2) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.warn(str, str2);
    }

    public static void asset(java.lang.String str) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.asset(str);
    }

    public static void debug(java.lang.String str) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.debug(str);
    }

    public static void error(java.lang.String str) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.error(str);
    }

    public static void info(java.lang.String str) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.info(str);
    }

    public static void verbose(java.lang.String str) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.verbose(str);
    }

    public static void warn(java.lang.String str) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.warn(str);
    }

    public static void asset(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.asset(str, str2, objArr);
    }

    public static void debug(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.debug(str, str2, objArr);
    }

    public static void error(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.error(str, str2, objArr);
    }

    public static void info(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.info(str, str2, objArr);
    }

    public static void verbose(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.verbose(str, str2, objArr);
    }

    public static void warn(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (logger == null || !assertInitLogger()) {
            return;
        }
        logger.warn(str, str2, objArr);
    }
}
