package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public abstract class t7 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f90228a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f90229b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f90230c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Boolean f90231d;

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f90232e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f90233f;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.String[] p17 = u46.l.p(j62.e.g().a("clicfg_android_appbrand_in_mm_fallback_scenes", "", true, true), ';');
        if (p17 != null) {
            f90232e = new int[p17.length];
            for (int i17 = 0; i17 < p17.length; i17++) {
                f90232e[i17] = com.tencent.mm.sdk.platformtools.t8.P(p17[i17], 0);
            }
        } else {
            f90232e = new int[0];
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.String[] p18 = u46.l.p(j62.e.g().a("clicfg_android_appbrand_in_mm_appids", "", true, true), ';');
        if (p18 != null) {
            f90233f = p18;
        } else {
            f90233f = new java.lang.String[0];
        }
    }

    public static boolean a() {
        java.lang.Boolean bool = f90230c;
        if (bool != null) {
            return bool.booleanValue();
        }
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        int i17 = (a17 == null || !com.tencent.mm.plugin.appbrand.ui.e4.g()) ? Integer.MIN_VALUE : a17.getInt("pref_key_run_in_mm_strategy_mmkv_config", Integer.MIN_VALUE);
        if (Integer.MIN_VALUE == i17) {
            i17 = !wo.w0.q() ? 0 : j62.e.g().i("clicfg_android_appbrand_in_mm_strategy", 0, true, true);
        }
        return 1 == i17;
    }

    public static boolean b() {
        if (!com.tencent.mm.plugin.appbrand.ui.e4.g()) {
            return true;
        }
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        return a17 != null && a17.getBoolean("enable_multi_system_recent_tasks", true);
    }

    public static void c(boolean z17) {
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        if (a17 != null && a17.getInt("pref_key_run_in_mm_strategy_mmkv_config", Integer.MIN_VALUE) != 2) {
            a17.putInt("pref_key_run_in_mm_strategy_mmkv_config", z17 ? 1 : 0);
        }
        f90230c = java.lang.Boolean.valueOf(z17);
    }

    public static boolean d(boolean z17) {
        if (!com.tencent.mm.plugin.appbrand.ui.e4.g()) {
            return false;
        }
        try {
            com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
            if (a17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "setUseSingleProcessMMDispatchStrategy: [%b]", java.lang.Boolean.valueOf(z17));
                if (a17.getInt("pref_key_run_in_mm_strategy_mmkv_config", 2) != 1) {
                    return a17.A("pref_key_run_in_mm_strategy_mmkv_config", z17 ? 2 : 0);
                }
            }
            return false;
        } finally {
            f90231d = java.lang.Boolean.valueOf(z17);
        }
    }

    public static void e(boolean z17) {
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        if (a17 != null) {
            a17.putInt("enable_single_task_dispatch", z17 ? 1 : 0);
        }
        f90228a = java.lang.Boolean.valueOf(z17);
    }

    public static void f(boolean z17) {
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        if (a17 != null) {
            a17.putInt("enable_three_proc_tasks_dispatch", z17 ? 1 : 0);
        }
        f90229b = java.lang.Boolean.valueOf(z17);
    }

    public static boolean g() {
        java.lang.Boolean bool = f90231d;
        if (bool != null) {
            return bool.booleanValue();
        }
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        int i17 = (a17 == null || !com.tencent.mm.plugin.appbrand.ui.e4.g()) ? Integer.MIN_VALUE : a17.getInt("pref_key_run_in_mm_strategy_mmkv_config", Integer.MIN_VALUE);
        if (Integer.MIN_VALUE == i17) {
            i17 = !wo.w0.q() ? 0 : j62.e.g().i("clicfg_android_appbrand_in_mm_strategy", 0, true, true);
        }
        return 2 == i17;
    }

    public static boolean h() {
        java.lang.Boolean bool = f90228a;
        if (bool != null) {
            return bool.booleanValue();
        }
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useSingleTaskDispatchStrategy: mmkv is null");
            return false;
        }
        int i17 = a17.getInt("enable_single_task_dispatch", 2);
        if (i17 == 1) {
            f90228a = java.lang.Boolean.TRUE;
        } else if (i17 == 0) {
            f90228a = java.lang.Boolean.FALSE;
        } else {
            int i18 = j62.e.g().i("clicfg_android_appbrand_enable_task_single_strategy", 0, true, true);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(i18 == 1);
            f90228a = valueOf;
            if (valueOf.booleanValue() && !wo.w0.q()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useSingleTaskDispatchStrategy: test is64BitRuntime fail");
                f90228a = java.lang.Boolean.FALSE;
            }
            f90228a.booleanValue();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useSingleTaskDispatchStrategy: [%b]", f90228a);
        return f90228a.booleanValue();
    }

    public static boolean i() {
        java.lang.Boolean bool = f90229b;
        if (bool != null) {
            return bool.booleanValue();
        }
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useThreeTasksDispatchStrategy: mmkv is null");
            return false;
        }
        int i17 = a17.getInt("enable_three_proc_tasks_dispatch", 2);
        if (i17 == 1) {
            f90229b = java.lang.Boolean.TRUE;
        } else if (i17 == 0) {
            f90229b = java.lang.Boolean.FALSE;
        } else {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(j62.e.g().i("clicfg_android_appbrand_enable_task_single_strategy", 0, true, true) == 2);
            f90229b = valueOf;
            if (valueOf.booleanValue() && !wo.w0.q()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useThreeTasksDispatchStrategy: test is64BitRuntime fail");
                f90229b = java.lang.Boolean.FALSE;
            }
            f90229b.booleanValue();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.AppBrandTaskTestSwitcher", "useThreeTasksDispatchStrategy: [%b]", f90229b);
        return f90229b.booleanValue();
    }
}
