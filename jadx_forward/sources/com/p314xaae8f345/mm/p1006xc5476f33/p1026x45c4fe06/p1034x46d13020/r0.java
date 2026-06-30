package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public abstract class r0 {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a().getInt(".sysmsg.UpdateWxaUserSwitchNotify.DiscoveryEntranceUseFake", 0) == 1) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(boolean r5) {
        /*
            com.tencent.mm.accessibility.uitl.AccUtil r0 = com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495
            boolean r0 = r0.m42840x2061f65d()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.lang.String r0 = "AppBrandLauncherUIForceEntryConfig"
            com.tencent.mm.sdk.platformtools.o4 r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R(r0)
            java.lang.String r3 = "getSingleMMKV(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            java.lang.String r4 = "KEY_FORCE_WE_USE_FAKE_NATIVE"
            boolean r2 = r2.getBoolean(r4, r1)
            r4 = 1
            if (r2 == 0) goto L21
            if (r5 != 0) goto L21
            return r4
        L21:
            com.tencent.mm.sdk.platformtools.o4 r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R(r0)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r3)
            java.lang.String r2 = "KEY_FORCE_NATIVE_LAUNCHER"
            boolean r0 = r0.getBoolean(r2, r1)
            boolean r2 = ek1.a.c()
            if (r2 != 0) goto L47
            com.tencent.mm.plugin.appbrand.app.q0 r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a
            com.tencent.mm.sdk.platformtools.o4 r2 = r2.a()
            java.lang.String r3 = ".sysmsg.UpdateWxaUserSwitchNotify.DiscoveryEntranceUseFake"
            int r2 = r2.getInt(r3, r1)
            if (r2 != r4) goto L44
            r2 = r4
            goto L45
        L44:
            r2 = r1
        L45:
            if (r2 == 0) goto L4c
        L47:
            if (r0 != 0) goto L4c
            if (r5 != 0) goto L4c
            return r4
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r0.a(boolean):boolean");
    }

    public static boolean b() {
        java.lang.Integer num = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.x2.f158178d;
        if (gm0.j1.a()) {
            return ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_USAGE_RECORD_HAS_FAVORITE_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue();
        }
        return false;
    }

    public static boolean c() {
        if (gm0.j1.a()) {
            return ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_USAGE_RECORD_HAS_HISTORY_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue();
        }
        return false;
    }

    public static boolean d() {
        if (!gm0.j1.a()) {
            return false;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("WeAppForbiddenSwitch", 0) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEntranceLogic", "showInFindMore, WeAppForbiddenSwitch == 1, not show");
            return false;
        }
        if (!(b() || c())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f2[] f2VarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f2.f157964d;
            if (!(!gm0.j1.a() ? false : ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_SHOW_RED_DOT_ONCE_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue())) {
                return false;
            }
        }
        return true;
    }

    public static boolean e() {
        if (gm0.j1.a()) {
            return ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_SHOW_NEW_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue();
        }
        return false;
    }

    public static void f(boolean z17, boolean z18, java.lang.String str) {
        if (gm0.j1.a()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_USAGE_RECORD_HAS_HISTORY_BOOLEAN;
            java.lang.Boolean bool = (java.lang.Boolean) c17.m(u3Var, null);
            boolean z19 = false;
            if (bool != null && !bool.booleanValue() && z17) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_SHOW_NEW_BOOLEAN, java.lang.Boolean.TRUE);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                g0Var.d(14112, 1, "", 0L, 1, 1);
                z19 = true;
            }
            gm0.j1.u().c().x(u3Var, java.lang.Boolean.valueOf(z17));
            if (z18 && z19) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d.f157939a;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d.f157941c) {
                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e.f157953a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.e.f157953a.set(true);
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b5 Vi = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Vi();
                if (Vi != null) {
                    Vi.f171104d = -1;
                    Vi.f171105e = str;
                }
            }
        }
    }
}
