package com.tencent.liteav.base;

@com.tencent.liteav.base.annotations.JNINamespace("base::android")
/* loaded from: classes13.dex */
public class ContextUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "ContextUtils";
    private static android.content.Context sApplicationContext;

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static android.content.SharedPreferences f46277a = com.tencent.liteav.base.ContextUtils.access$000();
    }

    public static /* synthetic */ android.content.SharedPreferences access$000() {
        return fetchAppSharedPreferences();
    }

    public static android.app.Activity activityFromContext(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private static android.content.SharedPreferences fetchAppSharedPreferences() {
        return android.preference.PreferenceManager.getDefaultSharedPreferences(sApplicationContext);
    }

    public static android.content.SharedPreferences getAppSharedPreferences() {
        return com.tencent.liteav.base.ContextUtils.a.f46277a;
    }

    public static android.content.res.AssetManager getApplicationAssets() {
        android.content.Context applicationContext = getApplicationContext();
        while (applicationContext instanceof android.content.ContextWrapper) {
            applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
        }
        return applicationContext.getAssets();
    }

    public static android.content.Context getApplicationContext() {
        return sApplicationContext;
    }

    public static void initApplicationContext(android.content.Context context) {
        initJavaSideApplicationContext(context);
    }

    public static void initApplicationContextForTests(android.content.Context context) {
        initJavaSideApplicationContext(context);
        android.content.SharedPreferences unused = com.tencent.liteav.base.ContextUtils.a.f46277a = fetchAppSharedPreferences();
    }

    public static void initContextFromNative(java.lang.String str) {
        try {
            java.lang.reflect.Method method = java.lang.Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new java.lang.Class[0]);
            method.setAccessible(true);
            java.lang.Object invoke = method.invoke(null, new java.lang.Object[0]);
            java.lang.Object invoke2 = invoke.getClass().getMethod("getApplication", new java.lang.Class[0]).invoke(invoke, new java.lang.Object[0]);
            if (invoke2 instanceof android.content.Context) {
                initApplicationContext((android.content.Context) invoke2);
                setDataDirectorySuffix(str);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private static void initJavaSideApplicationContext(android.content.Context context) {
        sApplicationContext = context;
    }

    public static boolean isIsolatedProcess() {
        return android.os.Process.isIsolated();
    }

    public static void setDataDirectorySuffix(java.lang.String str) {
        com.tencent.liteav.base.PathUtils.setPrivateDataDirectorySuffix(str, null);
    }
}
