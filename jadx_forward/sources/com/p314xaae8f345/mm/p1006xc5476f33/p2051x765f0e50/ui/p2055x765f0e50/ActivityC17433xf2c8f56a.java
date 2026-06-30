package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI */
/* loaded from: classes9.dex */
public class ActivityC17433xf2c8f56a extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f242024q = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f242025d;

    /* renamed from: h, reason: collision with root package name */
    public int f242029h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f242026e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f242027f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f242028g = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public boolean f242030i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f242031m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f242032n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f242033o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f242034p = true;

    public void V6() {
        java.util.HashMap hashMap = this.f242028g;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            java.util.HashMap hashMap2 = this.f242027f;
            if (hashMap2.containsKey(java.lang.Integer.valueOf(intValue)) && hashMap2.get(java.lang.Integer.valueOf(intValue)) != hashMap.get(java.lang.Integer.valueOf(intValue))) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15185, java.lang.Integer.valueOf(intValue), hashMap.get(java.lang.Integer.valueOf(intValue)), 1);
                if (intValue == 0) {
                    if (((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(intValue))).intValue() == 0) {
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_ENTRY_SWITCH_INT, -1);
                    } else if (((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(intValue))).intValue() == 1) {
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_ENTRY_SWITCH_INT, 1);
                    }
                }
            }
        }
    }

    public boolean W6(long j17) {
        return (j17 & this.f242025d) != 0;
    }

    public boolean X6(long j17) {
        return (j17 & ((long) this.f242029h)) == 0;
    }

    public void Y6() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6019x2a86117b c6019x2a86117b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6019x2a86117b();
        c6019x2a86117b.f136312g.f88995a = true;
        c6019x2a86117b.e();
        boolean z17 = c6019x2a86117b.f136313h.f89109a;
        boolean z18 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() && ((uh4.c0) i95.n0.c(uh4.c0.class)).G8() == 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "shouldShowMiniProgram %s, isTeenModeAndNotAccessRight:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_miniprogram_switch");
        c21541x1c1b08fe.f279318v = false;
        if (!z17 || z18) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_miniprogram_switch", true);
        } else {
            boolean W6 = W6(16777216L);
            java.util.HashMap hashMap = this.f242027f;
            if (W6) {
                c21541x1c1b08fe.O(false);
                hashMap.put(8, 0);
            } else {
                c21541x1c1b08fe.O(true);
                hashMap.put(8, 1);
            }
        }
        j7(com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryAppbrand, "settings_miniprogram_switch");
    }

    public void Z6() {
        boolean el6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "showFinder %s", java.lang.Boolean.valueOf(el6));
        boolean z17 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7() && ((uh4.c0) i95.n0.c(uh4.c0.class)).G8() == 2;
        if (!el6 || z17) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_finder_switch", true);
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_finder_switch");
        c21541x1c1b08fe.f279318v = false;
        boolean W6 = W6(34359738368L);
        java.util.HashMap hashMap = this.f242027f;
        if (W6) {
            c21541x1c1b08fe.O(false);
            hashMap.put(11, 0);
        } else {
            c21541x1c1b08fe.O(true);
            hashMap.put(11, 1);
        }
        j7(com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryChannels, "settings_finder_switch");
    }

    public void a7() {
        m33.b1 a17 = m33.a1.a();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_game_switch");
        c21541x1c1b08fe.f279318v = false;
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        if (a17 == null || !((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.h0) a17).Vi(this) || mo168058x74219ae7) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_game_switch", true);
        } else {
            boolean W6 = W6(8388608L);
            java.util.HashMap hashMap = this.f242027f;
            if (W6) {
                c21541x1c1b08fe.O(false);
                hashMap.put(7, 0);
            } else {
                c21541x1c1b08fe.O(true);
                hashMap.put(7, 1);
            }
        }
        j7(com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryGame, "settings_game_switch");
    }

    public void b7() {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        boolean f17 = vd2.t3.f517454a.f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "showFinderLiveEntry %s", java.lang.Boolean.valueOf(f17));
        if (((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Bi()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_finder_live_switch", true);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_finder_live_above_look_switch", true);
        }
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        if (!f17 || mo168058x74219ae7) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_finder_live_switch", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_finder_live_above_look_switch", true);
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h(((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).wi());
        c21541x1c1b08fe.f279318v = false;
        boolean W6 = W6(9007199254740992L);
        java.util.HashMap hashMap = this.f242027f;
        if (W6) {
            c21541x1c1b08fe.O(false);
            hashMap.put(13, 0);
        } else {
            c21541x1c1b08fe.O(true);
            hashMap.put(13, 1);
        }
        j7(com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryFinderLive, ((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).wi());
    }

    public void c7() {
        boolean z17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_look_switch");
        c21541x1c1b08fe.f279318v = false;
        boolean z18 = !W6(67108864L);
        if (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_look_switch", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "european user");
            z18 = false;
            z17 = false;
        } else {
            z17 = true;
        }
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "isInExperiment %s ,openLook %s, isTeenMode:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(mo168058x74219ae7));
        java.util.HashMap hashMap = this.f242027f;
        if (z17 && z18 && !mo168058x74219ae7) {
            c21541x1c1b08fe.O(true);
            hashMap.put(10, 1);
        } else if (!z17 || mo168058x74219ae7) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_look_switch", true);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_look_switch", false);
            c21541x1c1b08fe.O(false);
            hashMap.put(10, 0);
        }
        j7(com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryLooks, "settings_look_switch");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: createAdapter */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 mo43515x4153c6b3(android.content.SharedPreferences sharedPreferences) {
        return new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.b(this, m79335xcc101dd9(), sharedPreferences);
    }

    public void d7() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_search_switch");
        c21541x1c1b08fe.f279318v = false;
        boolean W6 = W6(2097152L);
        java.util.HashMap hashMap = this.f242027f;
        if (W6) {
            c21541x1c1b08fe.O(false);
            hashMap.put(3, 0);
        } else {
            c21541x1c1b08fe.O(true);
            hashMap.put(3, 1);
        }
        j7(com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoverySearch, "settings_search_switch");
    }

    public final void e7(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe, int i17, java.lang.String str, java.lang.String str2, wd0.o1 o1Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574517ik0);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijz);
        }
        v24.o0.g(this, str, str2, "", new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ag(this, c21541x1c1b08fe, i17, o1Var));
    }

    public void f7(boolean z17) {
        ((ty4.n) ((uy4.v) i95.n0.c(uy4.v.class))).Ni("labs_browse", z17);
        if (z17) {
            this.f242025d &= -67108865;
        } else {
            this.f242025d |= 67108864;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        if (!(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17435x7d616a9a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "oplog extstatus:" + this.f242025d + ",pluginFlag:" + this.f242029h);
            gm0.j1.u().c().w(147457, java.lang.Long.valueOf(this.f242025d));
            gm0.j1.u().c().w(34, java.lang.Integer.valueOf(this.f242029h));
            java.util.HashMap hashMap = this.f242026e;
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((java.lang.Integer) entry.getKey()).intValue();
                int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
                r45.p53 p53Var = new r45.p53();
                p53Var.f464294d = intValue;
                p53Var.f464295e = intValue2;
                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
            }
            hashMap.clear();
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", this.f242029h, "", 0, "", 0));
        }
        V6();
    }

    public void g7(boolean z17, long j17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "switch ext change : open = " + z17 + " item value = " + j17 + " functionId = " + i17);
        if (z17) {
            this.f242025d = (~j17) & this.f242025d;
        } else {
            this.f242025d = j17 | this.f242025d;
        }
        this.f242026e.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? 1 : 2));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        boolean a07 = c01.e2.a0();
        this.f242032n = a07;
        return a07 ? com.p314xaae8f345.mm.R.xml.f576474c9 : com.p314xaae8f345.mm.R.xml.f576472c7;
    }

    public final void h7(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "switch plugin flag, open %s, flag %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (z17) {
            this.f242029h &= ~i17;
        } else {
            this.f242029h |= i17;
        }
    }

    public void i7(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe, boolean z17, boolean z18) {
        if (z17) {
            if (z18) {
                return;
            }
            g7(z17, 2097152L, 50);
        } else {
            su4.g1 g1Var = (su4.g1) i95.n0.c(su4.g1.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.dg dgVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.dg(this, c21541x1c1b08fe, z18, z17);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2) g1Var).wi();
            dgVar.run();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.is_);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bg(this));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_sns_switch");
        c21541x1c1b08fe.f279318v = false;
        boolean X6 = X6(32768L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "openSns %s", java.lang.Boolean.valueOf(X6));
        java.util.HashMap hashMap = this.f242027f;
        if (X6) {
            c21541x1c1b08fe.O(true);
            hashMap.put(0, 1);
        } else {
            c21541x1c1b08fe.O(false);
            hashMap.put(0, 0);
        }
        Z6();
        b7();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_scan_switch");
        c21541x1c1b08fe2.f279318v = false;
        if (W6(1048576L)) {
            c21541x1c1b08fe2.O(false);
            hashMap.put(1, 0);
        } else {
            c21541x1c1b08fe2.O(true);
            hashMap.put(1, 1);
        }
        j7(com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.GlobalScan, "settings_scan_switch");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_shake_switch");
        c21541x1c1b08fe3.f279318v = false;
        boolean X62 = X6(256L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "openShake %s", java.lang.Boolean.valueOf(X62));
        if (X62) {
            c21541x1c1b08fe3.O(true);
            hashMap.put(2, 1);
        } else {
            c21541x1c1b08fe3.O(false);
            hashMap.put(2, 0);
        }
        j7(com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryShake, "settings_shake_switch");
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_shake_switch", true);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_shake_switch", false);
        }
        c7();
        d7();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        vd2.t3 t3Var = vd2.t3.f517454a;
        if (t3Var.g()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_nearby_switch", true);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe4 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_nearby_live_friend_switch");
            c21541x1c1b08fe4.f279318v = false;
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            if (t3Var.f()) {
                c21541x1c1b08fe4.L(mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cfp));
            } else {
                c21541x1c1b08fe4.L(mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h6s));
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe5 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_nearby_live_friend_person_switch");
            c21541x1c1b08fe5.f279318v = false;
            boolean z17 = !W6(70368744177664L);
            boolean X63 = X6(512L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "openNearbyLiveFriends:%s openNearbyLiveFriendsPerson:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(X63));
            if (z17) {
                c21541x1c1b08fe4.O(true);
                hashMap.put(5, 1);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_nearby_live_friend_person_switch", false);
            } else {
                c21541x1c1b08fe4.O(false);
                hashMap.put(5, 0);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_nearby_live_friend_person_switch", true);
            }
            if (X63) {
                c21541x1c1b08fe5.O(true);
                hashMap.put(4, 1);
            } else {
                c21541x1c1b08fe5.O(false);
                hashMap.put(4, 0);
            }
            j7(com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryNearbyLiveFriends, "settings_nearby_live_friend_switch");
            j7(com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryNearbyLiveFriendsPerson, "settings_nearby_live_friend_person_switch");
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_nearby_live_friend_switch", true);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_nearby_live_friend_person_switch", true);
            } else {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_nearby_live_friend_switch", false);
            }
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_nearby_live_friend_switch", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_nearby_live_friend_person_switch", true);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe6 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_nearby_switch");
            c21541x1c1b08fe6.f279318v = false;
            boolean X64 = X6(512L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "openNearby %s", java.lang.Boolean.valueOf(X64));
            if (X64) {
                c21541x1c1b08fe6.O(true);
                hashMap.put(4, 1);
            } else {
                c21541x1c1b08fe6.O(false);
                hashMap.put(4, 0);
            }
            j7(com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryNearby, "settings_nearby_switch");
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_nearby_switch", true);
            } else {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_nearby_switch", false);
            }
        }
        k35.q a17 = k35.r.a();
        boolean z18 = a17 != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.p2244x604ad99.q) a17).aj();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "showShopping %s", java.lang.Boolean.valueOf(z18));
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe7 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_shopping_switch");
        c21541x1c1b08fe7.f279318v = false;
        if (!z18 || mo168058x74219ae7) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_shopping_switch", true);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_shopping_switch", false);
        }
        if (W6(4194304L)) {
            c21541x1c1b08fe7.O(false);
            hashMap.put(6, 0);
        } else {
            c21541x1c1b08fe7.O(true);
            hashMap.put(6, 1);
        }
        j7(com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryShop, "settings_shopping_switch");
        a7();
        Y6();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe8 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("settings_wechatout_switch");
        boolean z19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("WCOEntranceSwitch", 0) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "showWeChatOut %s", java.lang.Boolean.valueOf(z19));
        if (z19) {
            c21541x1c1b08fe8.f279318v = false;
            if (W6(33554432L)) {
                c21541x1c1b08fe8.O(false);
                hashMap.put(9, 0);
            } else {
                c21541x1c1b08fe8.O(true);
                hashMap.put(9, 1);
            }
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_wechatout_switch", true);
        }
        j7(com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryWeChatOut, "settings_wechatout_switch");
        if (c01.e2.a0()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_switch_bottom_tip", true);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).notifyDataSetChanged();
    }

    public final void j7(com.p314xaae8f345.mm.sdk.p2603x2137b148.f9 f9Var, java.lang.String str) {
        if (f9Var.n()) {
            if (f9Var.h()) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m(str, true);
                return;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h(str);
            c21541x1c1b08fe.w(false);
            c21541x1c1b08fe.T();
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.cg cgVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.cg(this, f9Var);
            c21541x1c1b08fe.T = cgVar;
            android.view.View view = c21541x1c1b08fe.S;
            if (view != null) {
                view.setOnClickListener(cgVar);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f242031m = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ExtFunctionSwitchEntry", 0) == 1;
        this.f242030i = c01.z1.H().booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "onCreate isShowWechatUserDialog = " + this.f242031m + "， isOverseaNewUser = " + this.f242030i);
        this.f242025d = c01.z1.j();
        this.f242032n = c01.e2.a0();
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(this);
        if ("zh_CN".equals(f17) || "zh_HK".equals(f17) || "zh_TW".equals(f17)) {
            this.f242033o = true;
        } else {
            this.f242033o = false;
        }
        this.f242029h = c01.z1.n();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "onCreate extStatus %d, pluginFlag %d", java.lang.Long.valueOf(this.f242025d), java.lang.Integer.valueOf(this.f242029h));
        mo43517x10010bd5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        int i17;
        int i18;
        boolean z17;
        int i19;
        int i27;
        int i28;
        boolean z18;
        if (!(c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe)) {
            return true;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb;
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "click pref key %s", str);
        boolean z19 = false;
        if (str.equals("settings_sns_switch")) {
            h7(c21541x1c1b08fe.N(), 32768);
            i27 = 0;
        } else if (str.equals("settings_scan_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.GlobalScan.k(this, null)) {
                return true;
            }
            g7(c21541x1c1b08fe.N(), 1048576L, 49);
            i27 = 1;
        } else if (str.equals("settings_search_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoverySearch.k(this, null)) {
                return true;
            }
            if (this.f242032n && this.f242031m && c21541x1c1b08fe.N()) {
                v24.o0.h(this, 2097152L, c21541x1c1b08fe, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vf(this, c21541x1c1b08fe), 2);
                i17 = -1;
                i27 = i17;
                z19 = false;
            } else {
                i17 = 3;
                if (this.f242032n && this.f242031m && !c21541x1c1b08fe.N()) {
                    e7(c21541x1c1b08fe, 3, mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijy), mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijx), null);
                    i27 = i17;
                    z19 = true;
                } else {
                    i7(c21541x1c1b08fe, c21541x1c1b08fe.N(), false);
                    i27 = 3;
                }
            }
        } else if (str.equals("settings_shopping_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryShop.k(this, null)) {
                return true;
            }
            g7(c21541x1c1b08fe.N(), 4194304L, 51);
            i27 = 6;
        } else if (str.equals("settings_game_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryGame.k(this, null)) {
                return true;
            }
            g7(c21541x1c1b08fe.N(), 8388608L, 52);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(848L, c21541x1c1b08fe.N() ? 0L : 1L, 1L, false);
            i27 = 7;
        } else if (str.equals("settings_miniprogram_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryAppbrand.k(this, null)) {
                return true;
            }
            java.lang.Object[] objArr = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_oversea_close_service_dialog_enable, 0) == 1;
            if (this.f242032n && this.f242031m && c21541x1c1b08fe.N()) {
                v24.o0.h(this, 16777216L, c21541x1c1b08fe, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.wf(this, c21541x1c1b08fe), 2);
                z18 = false;
                i28 = -1;
            } else if (this.f242032n && this.f242031m && objArr == true && !c21541x1c1b08fe.N()) {
                i28 = 8;
                e7(c21541x1c1b08fe, 8, mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iju), mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijt), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xf(this));
                z18 = true;
            } else {
                g7(c21541x1c1b08fe.N(), 16777216L, 53);
                if (!c21541x1c1b08fe.N()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Ai();
                }
                i28 = 8;
                z18 = false;
            }
            int i29 = i28;
            z19 = z18;
            i27 = i29;
        } else if (str.equals("settings_wechatout_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryWeChatOut.k(this, null)) {
                return true;
            }
            g7(c21541x1c1b08fe.N(), 33554432L, 54);
            i27 = 9;
        } else if (str.equals("settings_shake_switch")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryShake.k(this, null)) {
                return true;
            }
            h7(c21541x1c1b08fe.N(), 256);
            i27 = 2;
        } else if (!str.equals("settings_nearby_switch")) {
            if (str.equals("settings_nearby_live_friend_switch")) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryNearbyLiveFriends.k(this, null)) {
                    return true;
                }
                g7(c21541x1c1b08fe.N(), 70368744177664L, 61);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("settings_nearby_live_friend_person_switch", !c21541x1c1b08fe.N());
                long j17 = c21541x1c1b08fe.N() ? 1L : 0L;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6392xb3465581 c6392xb3465581 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6392xb3465581();
                c6392xb3465581.f137370d = 12L;
                c6392xb3465581.f137371e = j17;
                c6392xb3465581.f137372f = 1L;
                c6392xb3465581.k();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FindMoreSettingReport", "reportSwitch " + c6392xb3465581.n());
                i17 = 5;
            } else if (str.equals("settings_nearby_live_friend_person_switch")) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryNearbyLiveFriendsPerson.k(this, null)) {
                    return true;
                }
                h7(c21541x1c1b08fe.N(), 512);
                long j18 = c21541x1c1b08fe.N() ? 1L : 0L;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6392xb3465581 c6392xb34655812 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6392xb3465581();
                c6392xb34655812.f137370d = 12L;
                c6392xb34655812.f137371e = j18;
                c6392xb34655812.f137372f = 1L;
                c6392xb34655812.k();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FindMoreSettingReport", "reportSwitch " + c6392xb34655812.n());
                i17 = 12;
            } else if (str.equals("settings_look_switch")) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryLooks.k(this, null)) {
                    return true;
                }
                if (this.f242032n && this.f242031m && c21541x1c1b08fe.N()) {
                    v24.o0.h(this, 67108864L, c21541x1c1b08fe, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yf(this, c21541x1c1b08fe), 2);
                    i17 = -1;
                } else {
                    i17 = 10;
                    if (this.f242034p || !this.f242032n || !this.f242031m || c21541x1c1b08fe.N()) {
                        f7(c21541x1c1b08fe.N());
                    } else {
                        e7(c21541x1c1b08fe, 10, mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574517ik0), mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijz), null);
                        i27 = i17;
                        z19 = true;
                    }
                }
            } else if (!str.equals("settings_finder_switch")) {
                if (str.equals(((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).wi())) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryFinderLive.k(this, null)) {
                        return true;
                    }
                    g7(c21541x1c1b08fe.N(), 9007199254740992L, 65);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsManageFindMoreUI", "switch finderlive 65");
                    long j19 = c21541x1c1b08fe.N() ? 1L : 0L;
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6392xb3465581 c6392xb34655813 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6392xb3465581();
                    c6392xb34655813.f137370d = 13L;
                    c6392xb34655813.f137371e = j19;
                    c6392xb34655813.f137372f = 1L;
                    c6392xb34655813.k();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FindMoreSettingReport", "reportSwitch " + c6392xb34655813.n());
                    i17 = 13;
                }
                i17 = -1;
            } else {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryChannels.k(this, null)) {
                    return true;
                }
                boolean z27 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_oversea_close_service_dialog_enable, 1) == 1;
                if (this.f242032n && this.f242031m && c21541x1c1b08fe.N()) {
                    v24.o0.h(this, 34359738368L, c21541x1c1b08fe, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.zf(this, c21541x1c1b08fe), 2);
                    i18 = -1;
                } else {
                    i18 = 11;
                    if (this.f242032n && this.f242031m && z27 && !c21541x1c1b08fe.N()) {
                        e7(c21541x1c1b08fe, 11, mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijw), mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ijv), null);
                        z17 = true;
                        i19 = 11;
                        i27 = i19;
                        z19 = z17;
                    } else {
                        g7(c21541x1c1b08fe.N(), 34359738368L, 57);
                    }
                }
                i19 = i18;
                z17 = false;
                i27 = i19;
                z19 = z17;
            }
            i27 = i17;
            z19 = false;
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetDiscoveryNearby.k(this, null)) {
                return true;
            }
            h7(c21541x1c1b08fe.N(), 512);
            i27 = 4;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsManageFindMoreUI", "needShowCloseSwitchDilaogTips = %s", java.lang.Boolean.valueOf(z19));
        if (!z19) {
            boolean N = c21541x1c1b08fe.N();
            if (i27 >= 0) {
                this.f242028g.put(java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(N ? 1 : 0));
            }
        }
        return true;
    }
}
