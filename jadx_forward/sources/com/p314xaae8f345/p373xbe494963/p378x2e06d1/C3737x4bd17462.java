package com.p314xaae8f345.p373xbe494963.p378x2e06d1;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "base::android")
/* renamed from: com.tencent.liteav.base.ContextUtils */
/* loaded from: classes13.dex */
public class C3737x4bd17462 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f14597x7118e671 = false;
    private static final java.lang.String TAG = "ContextUtils";

    /* renamed from: sApplicationContext */
    private static android.content.Context f14598x2c57d412;

    /* renamed from: com.tencent.liteav.base.ContextUtils$a */
    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static android.content.SharedPreferences f127810a = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29235xbbd77af0();
    }

    /* renamed from: access$000 */
    public static /* synthetic */ android.content.SharedPreferences m29235xbbd77af0() {
        return m29237x4fc5f0c();
    }

    /* renamed from: activityFromContext */
    public static android.app.Activity m29236x68f02816(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: fetchAppSharedPreferences */
    private static android.content.SharedPreferences m29237x4fc5f0c() {
        return android.preference.PreferenceManager.getDefaultSharedPreferences(f14598x2c57d412);
    }

    /* renamed from: getAppSharedPreferences */
    public static android.content.SharedPreferences m29238xccd281a8() {
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.a.f127810a;
    }

    /* renamed from: getApplicationAssets */
    public static android.content.res.AssetManager m29239x2168b03d() {
        android.content.Context m29240x6e669035 = m29240x6e669035();
        while (m29240x6e669035 instanceof android.content.ContextWrapper) {
            m29240x6e669035 = ((android.content.ContextWrapper) m29240x6e669035).getBaseContext();
        }
        return m29240x6e669035.getAssets();
    }

    /* renamed from: getApplicationContext */
    public static android.content.Context m29240x6e669035() {
        return f14598x2c57d412;
    }

    /* renamed from: initApplicationContext */
    public static void m29241x91f62b6f(android.content.Context context) {
        m29244xda96bde8(context);
    }

    /* renamed from: initApplicationContextForTests */
    public static void m29242x23051767(android.content.Context context) {
        m29244xda96bde8(context);
        android.content.SharedPreferences unused = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.a.f127810a = m29237x4fc5f0c();
    }

    /* renamed from: initContextFromNative */
    public static void m29243x19360c40(java.lang.String str) {
        try {
            java.lang.reflect.Method method = java.lang.Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new java.lang.Class[0]);
            method.setAccessible(true);
            java.lang.Object invoke = method.invoke(null, new java.lang.Object[0]);
            java.lang.Object invoke2 = invoke.getClass().getMethod("getApplication", new java.lang.Class[0]).invoke(invoke, new java.lang.Object[0]);
            if (invoke2 instanceof android.content.Context) {
                m29241x91f62b6f((android.content.Context) invoke2);
                m29246xa5f59752(str);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: initJavaSideApplicationContext */
    private static void m29244xda96bde8(android.content.Context context) {
        f14598x2c57d412 = context;
    }

    /* renamed from: isIsolatedProcess */
    public static boolean m29245xa9d1348c() {
        return android.os.Process.isIsolated();
    }

    /* renamed from: setDataDirectorySuffix */
    public static void m29246xa5f59752(java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.AbstractC3741x6063ab6c.m29276xe60cf293(str, null);
    }
}
