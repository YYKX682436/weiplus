package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public abstract class e4 {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f171212a = jz5.h.a(jz5.i.f384363e, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.d4.f171191d);

    public static final boolean a() {
        if (g()) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("AppBrandDebugUI").getBoolean("CLEAN_COMM_LIB_ON_WECHAT_COLD_LAUNCH", false);
        }
        return false;
    }

    public static final boolean b() {
        if (g()) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("AppBrandDebugUI").getBoolean("ENABLE_COMM_LIB_DOWNLOAD_PKG_WEAKNET_MOCK", false);
        }
        return false;
    }

    public static final boolean c() {
        if (g()) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("AppBrandDebugUI").getBoolean("FORCE_AUTO_CLEAN_TASK_AND_DUMP", false);
        }
        return false;
    }

    public static final long d() {
        if (g()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.m48889xc55ddd52().getLong("AppBrandDebugUI.PAGE_CONTAINER_NAVIGATION_PUSH_TIMEOUT", 500L);
        }
        return 500L;
    }

    public static final boolean e() {
        if (!g()) {
            return false;
        }
        android.content.SharedPreferences m48889xc55ddd52 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.m48889xc55ddd52();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return m48889xc55ddd52.getBoolean("AppBrandDebugUI.SHOW_DEBUG_HINT_FOR_WXA_APP_LAUNCH_PROCESS", false);
    }

    public static final boolean f() {
        if (g()) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.m48889xc55ddd52().getBoolean("AppBrandDebugUI.WEAPP_ALL_CONTACT_TRANSPARENT_BACKGROUND_ENABLED", false);
        }
        return false;
    }

    public static final boolean g() {
        return ((java.lang.Boolean) f171212a.mo141623x754a37bb()).booleanValue();
    }
}
