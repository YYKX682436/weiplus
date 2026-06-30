package com.qcloud.qvb;

/* loaded from: classes10.dex */
public abstract class Logger {
    private static com.qcloud.qvb.Logger logger;

    public static void debug(java.lang.String str) {
        com.qcloud.qvb.Logger logger2 = logger;
        if (logger2 != null) {
            logger2.d(str);
        }
    }

    public static void error(java.lang.String str) {
        com.qcloud.qvb.Logger logger2 = logger;
        if (logger2 != null) {
            logger2.e(str);
        }
    }

    public static void info(java.lang.String str) {
        com.qcloud.qvb.Logger logger2 = logger;
        if (logger2 != null) {
            logger2.i(str);
        }
    }

    public static void setLogger(com.qcloud.qvb.Logger logger2) {
        logger = logger2;
    }

    public static void verbose(java.lang.String str) {
        com.qcloud.qvb.Logger logger2 = logger;
        if (logger2 != null) {
            logger2.v(str);
        }
    }

    public static void warn(java.lang.String str) {
        com.qcloud.qvb.Logger logger2 = logger;
        if (logger2 != null) {
            logger2.w(str);
        }
    }

    public abstract void d(java.lang.String str);

    public abstract void e(java.lang.String str);

    public abstract void i(java.lang.String str);

    public abstract void v(java.lang.String str);

    public abstract void w(java.lang.String str);
}
