package com.tencent.midas.jsbridge;

/* loaded from: classes13.dex */
public class APX5 {
    private static java.lang.String getTbsVersion() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.tencent.smtt.sdk.TbsConfig");
            java.lang.reflect.Field field = cls.getField("TBS_SDK_VERSIONNAME");
            field.setAccessible(true);
            return (java.lang.String) field.get(cls);
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchFieldException unused) {
            return com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
    }

    private static boolean hasInitX5Method() {
        try {
            return java.lang.Class.forName("com.tencent.smtt.sdk.QbSdk").getMethod("initX5Environment", android.content.Context.class, java.lang.Class.forName("com.tencent.smtt.sdk.QbSdk$PreInitCallback")) != null;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            return false;
        }
    }

    private static boolean initTbs(android.content.Context context) {
        com.tencent.midas.comm.APLog.d("APX5", "init Tbs Start");
        com.tencent.midas.data.APPluginReportManager.getInstance().insertData(com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface(), com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_X5_INIT, "", "");
        boolean z17 = false;
        try {
            java.lang.String tbsVersion = getTbsVersion();
            com.tencent.midas.comm.APLog.d("APX5", "get tbs version: " + tbsVersion);
            if (hasInitX5Method()) {
                com.tencent.midas.comm.APLog.d("APX5", "tbs has initX5 method");
                initX5Environment(context);
                z17 = true;
                com.tencent.midas.comm.APLog.d("APX5", "init Tbs Success. use X5 instead of Native WebView");
            } else {
                com.tencent.midas.comm.APLog.d("APX5", "tbs has no initX5 method");
                com.tencent.midas.comm.APLog.d("APX5", "unsupported tbs, version: " + tbsVersion);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.midas.comm.APLog.e("APX5", "init tbs failed, use native WebView!");
            com.tencent.midas.comm.APLog.e("APX5", "unsupported tbs: exception: " + th6.getMessage());
        }
        com.tencent.midas.comm.APLog.d("APX5", "initTbs End");
        com.tencent.midas.data.APPluginReportManager.getInstance().insertData(com.tencent.midas.data.APPluginDataInterface.singleton().getLaunchInterface(), z17 ? com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_X5_INIT_SUCCESS : com.tencent.midas.data.APPluginReportManager.MIDASPLUGIN_X5_INIT_FAIL, "", "");
        return z17;
    }

    public static void initX5(android.content.Context context) {
        com.tencent.midas.comm.APLog.d("APX5", ">>>>>>> initX5 Start <<<<<<<");
        if (isX5Enabled(context)) {
            com.tencent.midas.comm.APLog.d("APX5", ">>>>>>> initX5 End <<<<<<<");
        } else {
            com.tencent.midas.comm.APLog.d("APX5", ">>>>>>> X5 is missed or disabled, use native WebView");
        }
    }

    private static void initX5Environment(final android.content.Context context) {
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

    public static boolean isX5Enabled(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        java.lang.String data = com.tencent.midas.comm.APPluginDataStorage.getData(applicationContext, com.tencent.midas.data.APPluginDataInterface.SHARE_PREFERENCE_NAME, "enableX5");
        boolean z17 = !android.text.TextUtils.isEmpty(data) ? !data.equals("0") : true;
        com.tencent.midas.comm.APLog.d("APX5", "is enable X5: " + data);
        return z17 && initTbs(applicationContext);
    }

    public static boolean isX5WebView(android.content.Context context) {
        boolean z17 = !android.text.TextUtils.isEmpty(com.tencent.midas.comm.APPluginDataStorage.getData(context.getApplicationContext(), com.tencent.midas.data.APPluginDataInterface.SHARE_PREFERENCE_NAME, "enableX5")) ? !r2.equals("0") : false;
        com.tencent.midas.comm.APLog.d("APX5", "isX5WebView: " + z17);
        return z17;
    }

    private static boolean needDownloadTbs(android.content.Context context) {
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

    private static void preInit(android.content.Context context) {
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
