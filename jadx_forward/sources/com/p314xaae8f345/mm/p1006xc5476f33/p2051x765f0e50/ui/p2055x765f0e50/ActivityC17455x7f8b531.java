package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI */
/* loaded from: classes11.dex */
public class ActivityC17455x7f8b531 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f242140f = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.al();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f242141d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f242142e;

    public final void V6() {
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242141d).t();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242141d).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(this, null), -1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        boolean s17 = c01.z1.s();
        if (!s17) {
            s17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BindQQSwitch"), 1) == 1;
        }
        if (!s17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPluginsUI", "summerqq BindQQSwitch off");
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.f9 f9Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.HomePluginQQMail;
        if (!f9Var.h() && s17) {
            j45.l.g("qqmail");
            com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e c16804xd92b288e = new com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e(this, null);
            if (c16804xd92b288e.M("qqmail")) {
                c16804xd92b288e.L(c16804xd92b288e.M);
                if ((c01.z1.n() & 1) == 0) {
                    arrayList.add(c16804xd92b288e);
                } else if (u11.c.d()) {
                    arrayList2.add(c16804xd92b288e);
                }
            }
        }
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20305xd648a222()) == 1 && !c01.e2.a0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPluginsUI", "add QQAssistant to Settings");
            com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e c16804xd92b288e2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e(this, null);
            c16804xd92b288e2.N("gh_051d9102de63", getString(com.p314xaae8f345.mm.R.C30867xcad56011.nfj));
            c16804xd92b288e2.L(c16804xd92b288e2.M);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_051d9102de63", true);
            if (n17 != null) {
                if (n17.r2()) {
                    arrayList.add(c16804xd92b288e2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPluginsUI", "QQAssistant installed");
                } else {
                    arrayList2.add(c16804xd92b288e2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPluginsUI", "QQAssistant uninstalled");
                }
            }
        }
        if (!f9Var.h()) {
            j45.l.g("readerapp");
            if (!((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e c16804xd92b288e3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e(this, null);
                if (c16804xd92b288e3.M("newsapp")) {
                    c16804xd92b288e3.L(c16804xd92b288e3.M);
                    if ((c01.z1.n() & 524288) == 0) {
                        arrayList.add(c16804xd92b288e3);
                    } else if (u11.c.d()) {
                        arrayList2.add(c16804xd92b288e3);
                    }
                }
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetSecurityFacebook.h()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e c16804xd92b288e4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e(this, null);
            if (c16804xd92b288e4.M("facebookapp")) {
                c16804xd92b288e4.L(c16804xd92b288e4.M);
                if ((c01.z1.n() & 8192) == 0) {
                    arrayList.add(c16804xd92b288e4);
                } else if (u11.c.c()) {
                    arrayList2.add(c16804xd92b288e4);
                }
            }
        }
        j45.l.g("masssend");
        if (!c01.z1.x()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e c16804xd92b288e5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e(this, null);
            if (c16804xd92b288e5.M("masssendapp")) {
                c16804xd92b288e5.L(c16804xd92b288e5.M);
                if ((c01.z1.n() & 65536) == 0) {
                    arrayList.add(c16804xd92b288e5);
                } else {
                    arrayList2.add(c16804xd92b288e5);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e c16804xd92b288e6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e(this, null);
        c16804xd92b288e6.N("gh_43f2581f6fd6", getString(com.p314xaae8f345.mm.R.C30867xcad56011.c5n));
        c16804xd92b288e6.L(c16804xd92b288e6.M);
        ((ue4.w) ((ve4.e) i95.n0.c(ve4.e.class))).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.e()) {
            arrayList.add(c16804xd92b288e6);
        } else {
            arrayList2.add(c16804xd92b288e6);
        }
        boolean e17 = rn3.i.Ai().e(1);
        this.f242142e = e17;
        c16804xd92b288e6.R = e17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e c16804xd92b288e7 = new com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e(this, null);
        c16804xd92b288e7.N("gh_3dfda90e39d6", getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvz));
        c16804xd92b288e7.L(c16804xd92b288e7.M);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_3dfda90e39d6", true);
        if (n18 != null ? n18.r2() : false) {
            arrayList.add(c16804xd92b288e7);
        } else {
            arrayList2.add(c16804xd92b288e7);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e c16804xd92b288e8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e(this, null);
        c16804xd92b288e8.N("gh_b4af18eac3d5", getString(com.p314xaae8f345.mm.R.C30867xcad56011.hkx));
        c16804xd92b288e8.L(c16804xd92b288e8.M);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_b4af18eac3d5", true);
        if (n19 != null ? n19.r2() : false) {
            arrayList.add(c16804xd92b288e8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e c16804xd92b288e9 = new com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e(this, null);
        c16804xd92b288e9.N("gh_f0a92aa7146c", getString(com.p314xaae8f345.mm.R.C30867xcad56011.hkw));
        c16804xd92b288e9.L(c16804xd92b288e9.M);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_f0a92aa7146c", true);
        if (n27 != null ? n27.r2() : false) {
            arrayList.add(c16804xd92b288e9);
        } else {
            gm0.j1.i();
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_PLUGIN_SHOW_PAY_COLLECTION_FLAG_INT_SYNC, 0)).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPluginsUI", "SETTING_PLUGIN_SHOW_PAY_COLLECTION Flag :%s", java.lang.Integer.valueOf(intValue));
            if (intValue == 1) {
                arrayList2.add(c16804xd92b288e9);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e c16804xd92b288e10 = new com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e(this, null);
        c16804xd92b288e10.N("gh_e087bb5b95e6", getString(com.p314xaae8f345.mm.R.C30867xcad56011.hkv));
        c16804xd92b288e10.L(c16804xd92b288e10.M);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n28 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_e087bb5b95e6", true);
        if (n28 != null ? n28.r2() : false) {
            arrayList.add(c16804xd92b288e10);
        } else {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_add_pay_business_collection_open_config, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPluginsUI", "addPayBusinessCollection openConfig ：%s ", java.lang.Boolean.valueOf(fj6));
            if (fj6) {
                arrayList2.add(c16804xd92b288e10);
            }
        }
        if (1 != ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_minishop_plugin_enabled, 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPluginsUI", "addMiniShopHelperIfNeed, not need");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e c16804xd92b288e11 = new com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e(this, null);
            c16804xd92b288e11.N("gh_579db1f2cf89", getString(com.p314xaae8f345.mm.R.C30867xcad56011.fuv));
            c16804xd92b288e11.L(c16804xd92b288e11.M);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n29 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_579db1f2cf89", true);
            if (n29 != null ? n29.r2() : false) {
                arrayList.add(c16804xd92b288e11);
            } else {
                int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_PLUGIN_SHOW_MINI_SHOP_HELPER_FLAG_INT_SYNC, 0)).intValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPluginsUI", "addMiniShopHelperIfNeed, USERINFO_SETTING_PLUGIN_SHOW_MINI_SHOP_HELPER_FLAG_INT_SYNC: " + intValue2);
                if (1 == intValue2) {
                    arrayList2.add(c16804xd92b288e11);
                }
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.HomePluginWeGame.h() && !((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e c16804xd92b288e12 = new com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e(this, null);
            c16804xd92b288e12.N("gh_25d9ac85a4bc", getString(com.p314xaae8f345.mm.R.C30867xcad56011.fvy));
            c16804xd92b288e12.L(c16804xd92b288e12.M);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_25d9ac85a4bc", true);
            if (n37 != null ? n37.r2() : false) {
                arrayList.add(c16804xd92b288e12);
            } else {
                arrayList2.add(c16804xd92b288e12);
            }
        }
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("LinkedinPluginClose");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(d17, 0) == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e c16804xd92b288e13 = new com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e(this, null);
            if (c16804xd92b288e13.M("linkedinplugin")) {
                c16804xd92b288e13.L(c16804xd92b288e13.M);
                boolean z17 = (c01.z1.n() & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) == 0;
                boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) gm0.j1.u().c().l(286721, null));
                if (z17 && z18) {
                    arrayList.add(c16804xd92b288e13);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21559xfbc1641b c21559xfbc1641b = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21559xfbc1641b(this);
            c21559xfbc1641b.N = com.p314xaae8f345.mm.R.raw.f81023xb52d4e5e;
            c21559xfbc1641b.P = c21559xfbc1641b.f279303d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iwp);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242141d).d(c21559xfbc1641b, -1);
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_PLUGIN_SWITCH_NAMES_STRING, "");
        java.util.Iterator it = arrayList.iterator();
        com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e c16804xd92b288e14 = null;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e c16804xd92b288e15 = (com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e) it.next();
            c16804xd92b288e15.T = 1.0f;
            if (str.contains(c16804xd92b288e15.L)) {
                c16804xd92b288e15.R = true;
                if (c16804xd92b288e14 == null) {
                    c16804xd92b288e14 = c16804xd92b288e15;
                }
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242141d).d(c16804xd92b288e15, -1);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242141d).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(this, null), -1);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21559xfbc1641b c21559xfbc1641b2 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21559xfbc1641b(this);
        c21559xfbc1641b2.N = com.p314xaae8f345.mm.R.raw.f81024xf80e2ce5;
        c21559xfbc1641b2.P = c21559xfbc1641b2.f279303d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iwv);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242141d).d(c21559xfbc1641b2, -1);
        if (arrayList2.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17378xddd59e42 c17378xddd59e42 = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17378xddd59e42(this, null, 0);
            c17378xddd59e42.M = getString(com.p314xaae8f345.mm.R.C30867xcad56011.iwj);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242141d).d(c17378xddd59e42, -1);
        }
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e c16804xd92b288e16 = (com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb.C16804xd92b288e) it6.next();
            c16804xd92b288e16.T = 0.5f;
            if (str.contains(c16804xd92b288e16.L)) {
                c16804xd92b288e16.R = true;
                if (c16804xd92b288e14 == null) {
                    c16804xd92b288e14 = c16804xd92b288e16;
                }
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242141d).d(c16804xd92b288e16, -1);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242141d).d(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21567x4b9b05ea(this, null), -1);
        if (c16804xd92b288e14 != null) {
            m79341xf579a34a(((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f242141d).o(c16804xd92b288e14.f279313q));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576482ch;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iwi);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bl(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f242141d = m79336x8b97809d();
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(14098, 5);
        g0Var.d(12846, 1);
        c01.n8.a().c("gh_43f2581f6fd6", 23);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0069, code lost:
    
        if (r7.equals("qqmail") == false) goto L12;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x006d. Please report as an issue. */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r r7, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb r8) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17455x7f8b531.mo26755x5cc6f590(com.tencent.mm.ui.base.preference.r, com.tencent.mm.ui.base.preference.Preference):boolean");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeLongClick */
    public boolean mo60896x898ea874(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb, android.view.View view) {
        return super.mo60896x898ea874(rVar, c21560x1fce98fb, view);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_f0a92aa7146c", true);
        boolean r27 = n17 != null ? n17.r2() : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPluginsUI", "needGetReceipAssistPlugin result：%s", java.lang.Boolean.valueOf(r27));
        if (!r27) {
            gm0.j1.d().a(2745, this);
            gm0.j1.d().g(new k14.a0());
        }
        if (1 != ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_minishop_plugin_enabled, 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPluginsUI", "fetchMiniShopHelperPluginShowStatusIfNeed, not need");
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_579db1f2cf89", true);
            boolean r28 = n18 != null ? true ^ n18.r2() : true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPluginsUI", "fetchMiniShopHelperPluginShowStatusIfNeed, needFetch: " + r28);
            if (r28) {
                gm0.j1.d().a(4158, this);
                gm0.j1.d().g(new k14.z());
            }
        }
        V6();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPluginsUI", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.mo808xfb85f7b0());
        if (!(m1Var instanceof k14.a0)) {
            if (m1Var instanceof k14.z) {
                gm0.j1.d().q(4158, this);
                if (i17 != 0 && i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsPluginsUI", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                    return;
                }
                if (((k14.z) m1Var).f384954f) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPluginsUI", "need to show unstall MiniShopHelperPlugin");
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_PLUGIN_SHOW_MINI_SHOP_HELPER_FLAG_INT_SYNC, 1);
                } else {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_PLUGIN_SHOW_MINI_SHOP_HELPER_FLAG_INT_SYNC, 0);
                }
                V6();
                return;
            }
            return;
        }
        gm0.j1.d().q(2745, this);
        if (i17 != 0 && i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsPluginsUI", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return;
        }
        r45.rm3 rm3Var = ((k14.a0) m1Var).f384831f;
        if (rm3Var == null) {
            rm3Var = new r45.rm3();
        }
        if (rm3Var.f466544d == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsPluginsUI", "need to show unstall ReceipAssistPlugin");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_PLUGIN_SHOW_PAY_COLLECTION_FLAG_INT_SYNC, 1);
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_PLUGIN_SHOW_PAY_COLLECTION_FLAG_INT_SYNC, 0);
        }
        V6();
    }
}
