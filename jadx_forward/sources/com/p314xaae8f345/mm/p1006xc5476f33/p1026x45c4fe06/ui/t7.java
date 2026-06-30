package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public abstract class t7 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f171761a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f171762b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f171763c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Boolean f171764d;

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f171765e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f171766f;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.lang.String[] p17 = u46.l.p(j62.e.g().a("clicfg_android_appbrand_in_mm_fallback_scenes", "", true, true), ';');
        if (p17 != null) {
            f171765e = new int[p17.length];
            for (int i17 = 0; i17 < p17.length; i17++) {
                f171765e[i17] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(p17[i17], 0);
            }
        } else {
            f171765e = new int[0];
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.lang.String[] p18 = u46.l.p(j62.e.g().a("clicfg_android_appbrand_in_mm_appids", "", true, true), ';');
        if (p18 != null) {
            f171766f = p18;
        } else {
            f171766f = new java.lang.String[0];
        }
    }

    public static boolean a() {
        java.lang.Boolean bool = f171763c;
        if (bool != null) {
            return bool.booleanValue();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        int i17 = (a17 == null || !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.g()) ? Integer.MIN_VALUE : a17.getInt("pref_key_run_in_mm_strategy_mmkv_config", Integer.MIN_VALUE);
        if (Integer.MIN_VALUE == i17) {
            i17 = !wo.w0.q() ? 0 : j62.e.g().i("clicfg_android_appbrand_in_mm_strategy", 0, true, true);
        }
        return 1 == i17;
    }

    public static boolean b() {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.g()) {
            return true;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        return a17 != null && a17.getBoolean("enable_multi_system_recent_tasks", true);
    }

    public static void c(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        if (a17 != null && a17.getInt("pref_key_run_in_mm_strategy_mmkv_config", Integer.MIN_VALUE) != 2) {
            a17.putInt("pref_key_run_in_mm_strategy_mmkv_config", z17 ? 1 : 0);
        }
        f171763c = java.lang.Boolean.valueOf(z17);
    }

    public static boolean d(boolean z17) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.g()) {
            return false;
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
            if (a17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "setUseSingleProcessMMDispatchStrategy: [%b]", java.lang.Boolean.valueOf(z17));
                if (a17.getInt("pref_key_run_in_mm_strategy_mmkv_config", 2) != 1) {
                    return a17.A("pref_key_run_in_mm_strategy_mmkv_config", z17 ? 2 : 0);
                }
            }
            return false;
        } finally {
            f171764d = java.lang.Boolean.valueOf(z17);
        }
    }

    public static void e(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        if (a17 != null) {
            a17.putInt("enable_single_task_dispatch", z17 ? 1 : 0);
        }
        f171761a = java.lang.Boolean.valueOf(z17);
    }

    public static void f(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        if (a17 != null) {
            a17.putInt("enable_three_proc_tasks_dispatch", z17 ? 1 : 0);
        }
        f171762b = java.lang.Boolean.valueOf(z17);
    }

    public static boolean g() {
        java.lang.Boolean bool = f171764d;
        if (bool != null) {
            return bool.booleanValue();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        int i17 = (a17 == null || !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.g()) ? Integer.MIN_VALUE : a17.getInt("pref_key_run_in_mm_strategy_mmkv_config", Integer.MIN_VALUE);
        if (Integer.MIN_VALUE == i17) {
            i17 = !wo.w0.q() ? 0 : j62.e.g().i("clicfg_android_appbrand_in_mm_strategy", 0, true, true);
        }
        return 2 == i17;
    }

    public static boolean h() {
        java.lang.Boolean bool = f171761a;
        if (bool != null) {
            return bool.booleanValue();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useSingleTaskDispatchStrategy: mmkv is null");
            return false;
        }
        int i17 = a17.getInt("enable_single_task_dispatch", 2);
        if (i17 == 1) {
            f171761a = java.lang.Boolean.TRUE;
        } else if (i17 == 0) {
            f171761a = java.lang.Boolean.FALSE;
        } else {
            int i18 = j62.e.g().i("clicfg_android_appbrand_enable_task_single_strategy", 0, true, true);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(i18 == 1);
            f171761a = valueOf;
            if (valueOf.booleanValue() && !wo.w0.q()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useSingleTaskDispatchStrategy: test is64BitRuntime fail");
                f171761a = java.lang.Boolean.FALSE;
            }
            f171761a.booleanValue();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useSingleTaskDispatchStrategy: [%b]", f171761a);
        return f171761a.booleanValue();
    }

    public static boolean i() {
        java.lang.Boolean bool = f171762b;
        if (bool != null) {
            return bool.booleanValue();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useThreeTasksDispatchStrategy: mmkv is null");
            return false;
        }
        int i17 = a17.getInt("enable_three_proc_tasks_dispatch", 2);
        if (i17 == 1) {
            f171762b = java.lang.Boolean.TRUE;
        } else if (i17 == 0) {
            f171762b = java.lang.Boolean.FALSE;
        } else {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(j62.e.g().i("clicfg_android_appbrand_enable_task_single_strategy", 0, true, true) == 2);
            f171762b = valueOf;
            if (valueOf.booleanValue() && !wo.w0.q()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useThreeTasksDispatchStrategy: test is64BitRuntime fail");
                f171762b = java.lang.Boolean.FALSE;
            }
            f171762b.booleanValue();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useThreeTasksDispatchStrategy: [%b]", f171762b);
        return f171762b.booleanValue();
    }
}
