package com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd;

/* renamed from: com.tencent.midas.comm.log.internal.APCallbackLogger */
/* loaded from: classes8.dex */
public class C4764x69105044 {

    /* renamed from: logCallbackObj */
    private static java.lang.Object f20322x9fb4848e;

    /* renamed from: onLoggingMethod */
    private static java.lang.reflect.Method f20323x9e8c2981;

    /* renamed from: init */
    public static boolean m41672x316510(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            f20322x9fb4848e = cls.newInstance();
            f20323x9e8c2981 = cls.getDeclaredMethod("onLogging", java.lang.Integer.TYPE, java.lang.String.class, java.lang.String.class);
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
                java.lang.Object obj = f20322x9fb4848e;
                if (obj != null && (method = f20323x9e8c2981) != null) {
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

    /* renamed from: release */
    public static void m41673x41012807() {
        f20322x9fb4848e = null;
        f20323x9e8c2981 = null;
    }
}
