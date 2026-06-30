package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public abstract class e4 {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f89679a = jz5.h.a(jz5.i.f302830e, com.tencent.mm.plugin.appbrand.ui.d4.f89658d);

    public static final boolean a() {
        if (g()) {
            return com.tencent.mm.sdk.platformtools.o4.M("AppBrandDebugUI").getBoolean("CLEAN_COMM_LIB_ON_WECHAT_COLD_LAUNCH", false);
        }
        return false;
    }

    public static final boolean b() {
        if (g()) {
            return com.tencent.mm.sdk.platformtools.o4.M("AppBrandDebugUI").getBoolean("ENABLE_COMM_LIB_DOWNLOAD_PKG_WEAKNET_MOCK", false);
        }
        return false;
    }

    public static final boolean c() {
        if (g()) {
            return com.tencent.mm.sdk.platformtools.o4.M("AppBrandDebugUI").getBoolean("FORCE_AUTO_CLEAN_TASK_AND_DUMP", false);
        }
        return false;
    }

    public static final long d() {
        if (g()) {
            return com.tencent.mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs().getLong("AppBrandDebugUI.PAGE_CONTAINER_NAVIGATION_PUSH_TIMEOUT", 500L);
        }
        return 500L;
    }

    public static final boolean e() {
        if (!g()) {
            return false;
        }
        android.content.SharedPreferences processSharedPrefs = com.tencent.mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return processSharedPrefs.getBoolean("AppBrandDebugUI.SHOW_DEBUG_HINT_FOR_WXA_APP_LAUNCH_PROCESS", false);
    }

    public static final boolean f() {
        if (g()) {
            return com.tencent.mm.plugin.appbrand.app.PluginAppBrand.getProcessSharedPrefs().getBoolean("AppBrandDebugUI.WEAPP_ALL_CONTACT_TRANSPARENT_BACKGROUND_ENABLED", false);
        }
        return false;
    }

    public static final boolean g() {
        return ((java.lang.Boolean) f89679a.getValue()).booleanValue();
    }
}
