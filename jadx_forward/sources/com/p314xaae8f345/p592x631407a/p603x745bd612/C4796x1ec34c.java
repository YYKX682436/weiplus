package com.p314xaae8f345.p592x631407a.p603x745bd612;

/* renamed from: com.tencent.midas.jsbridge.APX5 */
/* loaded from: classes13.dex */
public class C4796x1ec34c {
    /* renamed from: getTbsVersion */
    private static java.lang.String m41997x840f5549() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.tencent.smtt.sdk.TbsConfig");
            java.lang.reflect.Field field = cls.getField("TBS_SDK_VERSIONNAME");
            field.setAccessible(true);
            return (java.lang.String) field.get(cls);
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchFieldException unused) {
            return com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
    }

    /* renamed from: hasInitX5Method */
    private static boolean m41998xfa5392e8() {
        try {
            return java.lang.Class.forName("com.tencent.smtt.sdk.QbSdk").getMethod("initX5Environment", android.content.Context.class, java.lang.Class.forName("com.tencent.smtt.sdk.QbSdk$PreInitCallback")) != null;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            return false;
        }
    }

    /* renamed from: initTbs */
    private static boolean m41999x74210895(android.content.Context context) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APX5", "init Tbs Start");
        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20640xee101700, "", "");
        boolean z17 = false;
        try {
            java.lang.String m41997x840f5549 = m41997x840f5549();
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APX5", "get tbs version: " + m41997x840f5549);
            if (m41998xfa5392e8()) {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APX5", "tbs has initX5 method");
                m42001x28f3a7e6(context);
                z17 = true;
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APX5", "init Tbs Success. use X5 instead of Native WebView");
            } else {
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APX5", "tbs has no initX5 method");
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APX5", "unsupported tbs, version: " + m41997x840f5549);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("APX5", "init tbs failed, use native WebView!");
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("APX5", "unsupported tbs: exception: " + th6.getMessage());
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APX5", "initTbs End");
        com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.m41839xa6eb780b().m41849x19e1b490(), z17 ? com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20642x4c1989a4 : com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.f20641xa0c1d0fd, "", "");
        return z17;
    }

    /* renamed from: initX5 */
    public static void m42000xb96c6bed(android.content.Context context) {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APX5", ">>>>>>> initX5 Start <<<<<<<");
        if (m42002x4b37b7ba(context)) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APX5", ">>>>>>> initX5 End <<<<<<<");
        } else {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APX5", ">>>>>>> X5 is missed or disabled, use native WebView");
        }
    }

    /* renamed from: initX5Environment */
    private static void m42001x28f3a7e6(final android.content.Context context) {
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.midas.jsbridge.APX5.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    java.lang.reflect.Method method = java.lang.Class.forName("com.tencent.smtt.sdk.QbSdk").getMethod("initX5Environment", android.content.Context.class, java.lang.Class.forName("com.tencent.smtt.sdk.QbSdk$PreInitCallback"));
                    if (method != null) {
                        method.setAccessible(true);
                        method.invoke(null, context.getApplicationContext(), null);
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
        }).start();
    }

    /* renamed from: isX5Enabled */
    public static boolean m42002x4b37b7ba(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        java.lang.String m41663xfb7e5820 = com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4760xb2df5dcf.m41663xfb7e5820(applicationContext, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.f20554x1a22ef, "enableX5");
        boolean z17 = !android.text.TextUtils.isEmpty(m41663xfb7e5820) ? !m41663xfb7e5820.equals("0") : true;
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APX5", "is enable X5: " + m41663xfb7e5820);
        return z17 && m41999x74210895(applicationContext);
    }

    /* renamed from: isX5WebView */
    public static boolean m42003xf414dc92(android.content.Context context) {
        boolean z17 = !android.text.TextUtils.isEmpty(com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4760xb2df5dcf.m41663xfb7e5820(context.getApplicationContext(), com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.f20554x1a22ef, "enableX5")) ? !r2.equals("0") : false;
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.d("APX5", "isX5WebView: " + z17);
        return z17;
    }

    /* renamed from: needDownloadTbs */
    private static boolean m42004xef1757a7(android.content.Context context) {
        try {
            java.lang.reflect.Method method = java.lang.Class.forName("com.tencent.smtt.sdk.TbsDownloader").getMethod("needDownload", android.content.Context.class);
            if (method != null) {
                method.setAccessible(true);
                return ((java.lang.Boolean) method.invoke(null, context)).booleanValue();
            }
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
        }
        return false;
    }

    /* renamed from: preInit */
    private static void m42005xecf48253(android.content.Context context) {
        try {
            java.lang.reflect.Method method = java.lang.Class.forName("com.tencent.smtt.sdk.QbSdk").getMethod("preInit", android.content.Context.class);
            if (method != null) {
                method.setAccessible(true);
                method.invoke(null, context);
            }
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
        }
    }
}
