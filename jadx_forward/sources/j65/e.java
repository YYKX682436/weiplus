package j65;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final hq.a f379460a = new j65.d();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f379461b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f379462c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f379463d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f379464e = false;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f379465f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f379466g = false;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f379467h = true;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f379468i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f379469j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f379470k;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.Boolean f379471l;

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a() {
        gm0.m.i();
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("care_mode_" + gm0.m.i());
    }

    public static boolean b() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMCareModeManager", "not main process!!");
            return false;
        }
        if (!gm0.j1.h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMCareModeManager", "mmkernel not initialized");
            return false;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMCareModeManager", "accout not ready");
            return false;
        }
        if (!f379462c) {
            f379461b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_STATE_BOOLEAN_SYNC, false)));
            f379462c = true;
        }
        return f379461b;
    }

    public static boolean c() {
        return !gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_HEARING_AID_MODE_LOCAL_STRING, "CLOSE").equals("CLOSE");
    }

    public static boolean d() {
        if (f379471l == null) {
            try {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_care_mode_switch", "1", false, true), 1) > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCareModeManager", "openCareModeEntrance!!");
                    f379471l = java.lang.Boolean.TRUE;
                } else {
                    f379471l = java.lang.Boolean.FALSE;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMCareModeManager", e17, "closeCareModeEntrance", new java.lang.Object[0]);
                f379471l = java.lang.Boolean.FALSE;
            }
        }
        if (!f379471l.booleanValue()) {
            return true;
        }
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("DisableCareModeEntry");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCareModeManager", "isHideCareModeEntrance, ShowCareMode is null");
            return false;
        }
        int parseInt = java.lang.Integer.parseInt(d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCareModeManager", "isHideCareModeEntrance, val is %s", java.lang.Integer.valueOf(parseInt));
        return d17 != null && parseInt > 0;
    }

    public static boolean e() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMCareModeManager", "not main process!!");
            return false;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMCareModeManager", "accout not ready");
            return false;
        }
        if (!f379468i) {
            f379467h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_LARGE_FONT_BOOLEAN, true)));
            f379468i = true;
        }
        return f379467h;
    }

    public static boolean f() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMCareModeManager", "not main process!!");
            return false;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMCareModeManager", "accout not ready");
            return false;
        }
        if (!f379464e) {
            f379463d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_LISTEN_BOOLEAN, false)));
            f379464e = true;
        }
        return f379463d;
    }

    public static boolean g() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMCareModeManager", "not main process!!");
            return false;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMCareModeManager", "accout not ready");
            return false;
        }
        if (!f379466g) {
            f379465f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_MUTE_BOOLEAN, false)));
            f379466g = true;
        }
        return f379465f;
    }

    public static boolean h() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMCareModeManager", "not main process!!");
            return false;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMCareModeManager", "accout not ready");
            return false;
        }
        if (!f379470k) {
            f379469j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_TEMPORARY_PLAY_BOOLEAN, false)));
            f379470k = true;
        }
        return f379469j;
    }

    public static void i(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = a();
        a17.getClass();
        a17.putBoolean("care_mode_change", z17).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCareModeManager", "setCareModeChange:%s", java.lang.Boolean.valueOf(z17));
    }

    public static void j(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = a();
        a17.getClass();
        a17.putInt("care_mode_font_size", i17).commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCareModeManager", "setCareModeFontSize:%s", java.lang.Integer.valueOf(i17));
    }

    public static void k(boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_LARGE_FONT_BOOLEAN;
        c17.x(u3Var, java.lang.Boolean.valueOf(z17));
        f379467h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(u3Var, true)));
        f379468i = false;
    }

    public static void l(boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_MUTE_BOOLEAN;
        c17.x(u3Var, java.lang.Boolean.valueOf(z17));
        f379465f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(u3Var, false)));
        f379466g = false;
    }

    public static void m(boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_TEMPORARY_PLAY_BOOLEAN;
        c17.x(u3Var, java.lang.Boolean.valueOf(z17));
        f379469j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(u3Var, false)));
        f379470k = false;
    }

    public static void n(boolean z17) {
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_STATE_BOOLEAN_SYNC, false)));
        if (z17 && n17 != f379461b) {
            i(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMCareModeManager", "care mode state change, before:%s, now:%s", java.lang.Boolean.valueOf(f379461b), java.lang.Boolean.valueOf(n17));
        }
        f379461b = n17;
    }

    public static void o() {
        f379463d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_LISTEN_BOOLEAN, false)));
        f379464e = false;
    }
}
