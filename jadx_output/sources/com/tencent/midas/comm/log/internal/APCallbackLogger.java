package com.tencent.midas.comm.log.internal;

/* loaded from: classes8.dex */
public class APCallbackLogger {
    private static java.lang.Object logCallbackObj;
    private static java.lang.reflect.Method onLoggingMethod;

    public static boolean init(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            logCallbackObj = cls.newInstance();
            onLoggingMethod = cls.getDeclaredMethod("onLogging", java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static void log(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.reflect.Method method;
        int i18 = 0;
        while (i18 < str2.length()) {
            try {
                int i19 = i18 + 3600;
                java.lang.String substring = str2.length() <= i19 ? str2.substring(i18) : str2.substring(i18, i19);
                java.lang.Object obj = logCallbackObj;
                if (obj != null && (method = onLoggingMethod) != null) {
                    try {
                        method.invoke(obj, java.lang.Integer.valueOf(i17), str, substring);
                    } catch (java.lang.Exception unused) {
                    }
                }
                i18 = i19;
            } catch (java.lang.Throwable th6) {
                java.lang.String.format(java.util.Locale.CHINA, "print log error: <%s>%s", th6.getClass().getName(), th6.getMessage());
                return;
            }
        }
    }

    public static void release() {
        logCallbackObj = null;
        onLoggingMethod = null;
    }
}
