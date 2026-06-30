package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAddMeUI */
/* loaded from: classes4.dex */
public class ActivityC17411x484cfcaa extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f241838g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f241839h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f241840i;

    /* renamed from: m, reason: collision with root package name */
    public int f241841m;

    /* renamed from: n, reason: collision with root package name */
    public long f241842n;

    /* renamed from: o, reason: collision with root package name */
    public long f241843o;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef
    public int V6() {
        return 3;
    }

    public final void X6(boolean z17, int i17, int i18) {
        if (z17) {
            this.f241840i = i17 | this.f241840i;
        } else {
            this.f241840i = (~i17) & this.f241840i;
        }
        this.f241839h.put(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(z17 ? 1 : 2));
    }

    public final void Y6(boolean z17, long j17, int i17) {
        if (z17) {
            this.f241842n = j17 | this.f241842n;
        } else {
            this.f241842n = (~j17) & this.f241842n;
        }
        this.f241839h.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? 1 : 2));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: createAdapter */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 mo43515x4153c6b3(android.content.SharedPreferences sharedPreferences) {
        return new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.b(this, m79335xcc101dd9(), sharedPreferences);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576462bv;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        boolean z17;
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ip_);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.r6(this));
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).t();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).g(com.p314xaae8f345.mm.R.xml.f576462bv);
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(9, null);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).h("settings_find_me_by_QQ");
        c21541x1c1b08fe.f279318v = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetPrivacyAddByQQ.h() || num == null || num.intValue() == 0) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).v(c21541x1c1b08fe);
        } else {
            int i17 = this.f241840i;
            if ((8 & i17) != 0) {
                if ((i17 & 16) != 0) {
                    z17 = false;
                    c21541x1c1b08fe.O(z17);
                }
            }
            z17 = true;
            c21541x1c1b08fe.O(z17);
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).h("settings_find_me_by_mobile");
        c21541x1c1b08fe2.f279318v = false;
        if (str == null || str.length() <= 0) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).v(c21541x1c1b08fe2);
        } else {
            c21541x1c1b08fe2.O(!((this.f241840i & 512) != 0));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).h("settings_find_me_by_weixin");
        c21541x1c1b08fe3.f279318v = false;
        if ((512 & this.f241841m) != 0) {
            c21541x1c1b08fe3.O(false);
        } else {
            c21541x1c1b08fe3.O(true);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe4 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).h("settings_find_me_by_google");
        c21541x1c1b08fe4.O(!((this.f241840i & 524288) != 0));
        c21541x1c1b08fe4.f279318v = false;
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(208903, null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P0(this) || android.text.TextUtils.isEmpty(str2)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).v(c21541x1c1b08fe4);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe5 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).h("settings_add_me_by_chatroom");
        c21541x1c1b08fe5.f279318v = false;
        if ((this.f241842n & 1) != 0) {
            c21541x1c1b08fe5.O(false);
        } else {
            c21541x1c1b08fe5.O(true);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe6 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).h("settings_add_me_by_qrcode");
        c21541x1c1b08fe6.f279318v = false;
        if ((this.f241842n & 2) != 0) {
            c21541x1c1b08fe6.O(false);
        } else {
            c21541x1c1b08fe6.O(true);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe7 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).h("settings_add_me_by_namecard");
        c21541x1c1b08fe7.f279318v = false;
        if ((this.f241842n & 4) != 0) {
            c21541x1c1b08fe7.O(false);
        } else {
            c21541x1c1b08fe7.O(true);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe8 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).h("settings_add_me_by_others");
        if (gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_OTHER_SEARCH_METHODS_VISIBLE_CLIENT_GRAY_BOOLEAN_SYNC, false)) {
            c21541x1c1b08fe8.G(com.p314xaae8f345.mm.R.C30867xcad56011.p9p);
            c21541x1c1b08fe8.f279318v = false;
            c21541x1c1b08fe8.O((this.f241843o & 140737488355328L) == 0);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).w("settings_add_me_by_others");
        }
        if (c01.e2.a0() && ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).w("settings_find_me_title");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).w("settings_find_me_by_weixin");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).w("settings_find_me_by_mobile");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).w("settings_find_me_by_QQ");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).w("settings_find_me_by_google");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).w("settings_add_me_by_namecard");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).w("settings_add_me_by_others");
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241838g).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f241838g = m79336x8b97809d();
        this.f241841m = c01.z1.o();
        this.f241840i = c01.z1.p();
        this.f241842n = c01.z1.j();
        this.f241843o = c01.z1.i();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.u().c().w(7, java.lang.Integer.valueOf(this.f241840i));
        gm0.j1.u().c().w(40, java.lang.Integer.valueOf(this.f241841m));
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(this.f241842n));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(this.f241843o));
        java.util.HashMap hashMap = this.f241839h;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = intValue;
            p53Var.f464295e = intValue2;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        hashMap.clear();
        W6(this.f241838g, "settings_find_me_by_QQ");
        W6(this.f241838g, "settings_find_me_by_weixin");
        W6(this.f241838g, "settings_find_me_by_mobile");
        W6(this.f241838g, "settings_find_me_by_google");
        W6(this.f241838g, "settings_add_me_by_chatroom");
        W6(this.f241838g, "settings_add_me_by_qrcode");
        W6(this.f241838g, "settings_add_me_by_namecard");
        W6(this.f241838g, "settings_add_me_by_others");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAddMeUI", str + " item has been clicked!");
        boolean z17 = true;
        if (str.equals("settings_find_me_by_QQ")) {
            boolean z18 = !((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("settings_find_me_by_QQ")).N();
            X6(z18, 8, 2);
            X6(z18, 16, 3);
        } else {
            boolean equals = str.equals("settings_find_me_by_weixin");
            java.util.HashMap hashMap = this.f241839h;
            if (equals) {
                boolean z19 = !((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("settings_find_me_by_weixin")).N();
                if (z19) {
                    this.f241841m |= 512;
                } else {
                    this.f241841m &= -513;
                }
                hashMap.put(25, java.lang.Integer.valueOf(z19 ? 1 : 2));
            } else if (str.equals("settings_find_me_by_mobile")) {
                X6(!((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("settings_find_me_by_mobile")).N(), 512, 8);
            } else if (str.equals("settings_find_me_by_google")) {
                X6(!((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("settings_find_me_by_google")).N(), 524288, 30);
            } else if (str.equals("settings_add_me_by_chatroom")) {
                Y6(!((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("settings_add_me_by_chatroom")).N(), 1L, 38);
            } else if (str.equals("settings_add_me_by_qrcode")) {
                Y6(!((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("settings_add_me_by_qrcode")).N(), 2L, 39);
            } else if (str.equals("settings_add_me_by_namecard")) {
                Y6(!((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("settings_add_me_by_namecard")).N(), 4L, 40);
            } else if (str.equals("settings_add_me_by_others")) {
                boolean z27 = !((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("settings_add_me_by_others")).N();
                if (z27) {
                    this.f241843o |= 140737488355328L;
                } else {
                    this.f241843o &= -140737488355329L;
                }
                hashMap.put(105, java.lang.Integer.valueOf(z27 ? 1 : 2));
            } else {
                z17 = false;
            }
        }
        W6(this.f241838g, c21560x1fce98fb.f279313q);
        return z17;
    }
}
