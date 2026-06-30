package com.qcloud.qvb;

/* loaded from: classes10.dex */
public final class XNet {
    public static int LOG_DEBUG = 3;
    public static int LOG_ERROR = 0;
    public static int LOG_INFO = 2;
    public static int LOG_NONE = -1;
    public static int LOG_WARN = 1;
    private static java.lang.String SDK_VERSION = null;
    static final java.lang.String TAG = "[TencentXP2P][XNet]";
    private static java.lang.ref.WeakReference<android.content.Context> appCtx = null;
    private static java.lang.String archCpuAbi = "";
    private static java.lang.String cacheDir = null;
    private static java.lang.String filesDir = null;
    private static boolean sEnableDebug = false;
    private static boolean sIsSoLoaded = false;
    private static int sLogLevel = 3;
    private byte _hellAccFlag_;

    public static void destroy() {
        if (sIsSoLoaded) {
            jni_destroy();
        } else {
            com.qcloud.qvb.Logger.error("so not loaded, ignore jni_destroy call");
        }
    }

    public static void disableDebug() {
        sEnableDebug = false;
        if (sIsSoLoaded) {
            jni_disableDebug();
        } else {
            com.qcloud.qvb.Logger.error("so not loaded, ignore jni_disableDebug call");
        }
    }

    public static void enableDebug() {
        sEnableDebug = true;
        if (sIsSoLoaded) {
            jni_enableDebug();
        } else {
            com.qcloud.qvb.Logger.error("so not loaded, ignore jni_enableDebug call");
        }
    }

    private static java.lang.String getArchABI() {
        if (archCpuAbi.isEmpty()) {
            archCpuAbi = jni_targetArchABI();
        }
        return isArchValid(archCpuAbi) ? archCpuAbi : "";
    }

    private static java.lang.String getCacheDir() {
        java.lang.String str = cacheDir;
        if (str != null) {
            return str;
        }
        android.content.Context context = appCtx.get();
        return context != null ? context.getCacheDir().getAbsolutePath() : "/";
    }

    private static java.lang.String getDiskDir() {
        java.lang.String str = filesDir;
        if (str != null) {
            return str;
        }
        android.content.Context context = appCtx.get();
        return context != null ? context.getFilesDir().getAbsolutePath() : "/";
    }

    public static java.lang.String getHost() {
        if (sIsSoLoaded) {
            return jni_host();
        }
        com.qcloud.qvb.Logger.error("so not loaded, ignore jni_host call");
        return "";
    }

    public static java.lang.String getVersion() {
        if (!sIsSoLoaded) {
            com.qcloud.qvb.Logger.error("so not loaded, ignore jni_version call");
        } else if (SDK_VERSION == null) {
            SDK_VERSION = jni_version();
        }
        return SDK_VERSION;
    }

    public static void init(android.content.Context context, com.qcloud.qvb.a aVar) {
        throw null;
    }

    private static boolean isArchValid(java.lang.String str) {
        return java.util.Arrays.asList(vb.a.f434460a).contains(str);
    }

    private static native void jni_alias(java.lang.String str, java.lang.String str2);

    private static native void jni_destroy();

    private static native void jni_disableDebug();

    private static native void jni_enableDebug();

    private static native java.lang.String jni_host();

    private static native int jni_init(java.lang.String str, android.content.Context context);

    private static native int jni_resume();

    private static native void jni_setInfo(java.lang.String str, java.lang.String str2, java.lang.String str3);

    private static native void jni_setLogLevel(int i17);

    private static native void jni_setLogger();

    private static native java.lang.String jni_targetArchABI();

    private static native java.lang.String jni_version();

    public static void loadLibrary(android.content.Context context) {
        java.lang.String str;
        if (sIsSoLoaded) {
            return;
        }
        str = "load library failed.";
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("AdvanceP2P");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/qcloud/qvb/XNet", "loadLibrary", "(Landroid/content/Context;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/qcloud/qvb/XNet", "loadLibrary", "(Landroid/content/Context;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            sIsSoLoaded = true;
        } catch (java.lang.Exception | java.lang.UnsatisfiedLinkError e17) {
            str = android.text.TextUtils.isEmpty(e17.getMessage()) ? "load library failed." : e17.getMessage();
            com.qcloud.qvb.Logger.error(str);
        }
        if (!sIsSoLoaded) {
            throw new java.lang.Exception(str);
        }
    }

    private static boolean loadSoFromSdcard(vb.a aVar) {
        try {
            throw null;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static java.lang.String proxyOf(java.lang.String str) {
        java.lang.String host = getHost();
        if (host.isEmpty()) {
            return "";
        }
        return host + "/" + str + "/";
    }

    public static int resume() {
        if (!sIsSoLoaded) {
            com.qcloud.qvb.Logger.error("so not loaded, ignore jni_resume call");
            return -1;
        }
        int jni_resume = jni_resume();
        com.qcloud.qvb.Logger.info("resume, ret: " + jni_resume);
        return jni_resume;
    }

    public static void setCacheDir(java.lang.String str) {
        cacheDir = str;
    }

    public static void setFilesDir(java.lang.String str) {
        filesDir = str;
    }

    public static void setInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null || str2 == null || str3 == null) {
            throw new java.lang.NullPointerException("appId or appKey or appSecretKey can't be null!");
        }
        if (sIsSoLoaded) {
            jni_setInfo(str, str2, str3);
        } else {
            com.qcloud.qvb.Logger.error("so not loaded, ignore jni_setInfo call");
        }
    }

    public static void setLogLevel(int i17) {
        sLogLevel = i17;
        if (sIsSoLoaded) {
            jni_setLogLevel(i17);
        } else {
            com.qcloud.qvb.Logger.error("so not loaded, ignore setLogLevel call");
        }
    }

    public static void setLogger(com.qcloud.qvb.Logger logger) {
        com.qcloud.qvb.Logger.setLogger(logger);
        if (sIsSoLoaded) {
            jni_setLogger();
        } else {
            com.qcloud.qvb.Logger.error("so not loaded, ignore jni_setLogger call");
        }
    }

    public static void init(android.content.Context context, java.lang.String str) {
        com.qcloud.qvb.Logger.info("init XNet.");
        if (context == null || str == null) {
            throw new java.lang.NullPointerException("context/config can't be null when init XNet!");
        }
        appCtx = new java.lang.ref.WeakReference<>(context);
        loadLibrary(context);
        if (sIsSoLoaded && sEnableDebug) {
            enableDebug();
        }
        if (sIsSoLoaded) {
            setLogLevel(sLogLevel);
        }
        int jni_init = jni_init(str, ((android.content.ContextWrapper) context).getBaseContext());
        if (jni_init != 0) {
            throw new java.lang.IllegalStateException("init sdk error, ret=" + jni_init);
        }
        android.content.SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("BuglySdkInfos", 0).edit();
        edit.putString("e30245116c", getVersion());
        edit.apply();
    }
}
