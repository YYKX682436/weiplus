package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29;

/* loaded from: classes8.dex */
public class k implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: g, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.k f224007g;

    /* renamed from: d, reason: collision with root package name */
    public int f224008d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f224009e = false;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f224010f;

    public k() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f224010f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80>(a0Var) { // from class: com.tencent.mm.plugin.ipcall.model.IPCallCoutryConfigUpdater$1
            {
                this.f39173x3fe91575 = -443124368;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80 c5313xa7be6d80) {
                if (c5313xa7be6d80 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_COUNTRY_CODE_RESTRCTION_INT;
                    int intValue = ((java.lang.Integer) p17.m(u3Var, 0)).intValue();
                    int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("WeChatOutCountryCodeRestrictionPackageID", 0);
                    if (intValue != b17) {
                        c01.d9.b().p().x(u3Var, java.lang.Integer.valueOf(b17));
                        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
                        f21.r0.Bi().n0(26);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j.a();
                        a17.getClass();
                        try {
                            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(lp0.b.e() + "ipcallCountryCodeConfig.cfg");
                            if (r6Var.m()) {
                                r6Var.l();
                            }
                            a17.f224006c = false;
                            a17.f224005b.clear();
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallCountryCodeConfig", "deleteRestrictionCountryConfigIfExist, error: %s", e17.getMessage());
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.k.this.d(true);
                    }
                }
                return false;
            }
        };
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.k a() {
        if (f224007g == null) {
            f224007g = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.k();
        }
        return f224007g;
    }

    public final void b() {
        this.f224009e = false;
        this.f224008d = 0;
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_COUNTRY_CODE_LASTUPDATE_TIME_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final void c() {
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.i0[] D0 = f21.r0.Bi().D0(26);
        c01.d9.e().g(new f21.g0(26, D0 != null && D0.length > 0));
    }

    public void d(boolean z17) {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate, acc not ready");
            return;
        }
        if (this.f224009e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate updating");
            return;
        }
        if (!z17) {
            long longValue = ((java.lang.Long) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_COUNTRY_CODE_LASTUPDATE_TIME_LONG, 0L)).longValue();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (longValue != 0 && java.lang.Math.abs(currentTimeMillis - longValue) < 86400000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate, not reach the update time limit");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallCoutryConfigUpdater", "try update now");
        this.f224009e = true;
        c01.d9.e().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de, this);
        c01.d9.e().a(160, this);
        c();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (this.f224009e) {
            boolean z17 = i17 == 0 || i18 == 0;
            if (m1Var.mo808xfb85f7b0() != 159) {
                if (m1Var.mo808xfb85f7b0() == 160 && z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j.a().b(true);
                    b();
                    return;
                }
                return;
            }
            if (!z17) {
                int i19 = this.f224008d;
                if (i19 >= 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallCoutryConfigUpdater", "reach retry limit");
                    return;
                } else {
                    this.f224008d = i19 + 1;
                    c();
                    return;
                }
            }
            ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
            f21.i0[] D0 = f21.r0.Bi().D0(26);
            if (D0 == null || D0.length == 0) {
                b();
                return;
            }
            f21.i0 i0Var = D0[0];
            int i27 = i0Var.f340452g;
            int i28 = i0Var.f340451f;
            if (i28 == 3) {
                return;
            }
            if (i28 == 5) {
                c01.d9.e().g(new f21.f0(i0Var.f340446a, 26));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j.a().b(true);
                b();
            }
        }
    }
}
