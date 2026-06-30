package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandOpenWeRunSettingUI */
/* loaded from: classes9.dex */
public class ActivityC12649xf1df9617 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f170903d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f170904e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f170905f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f170906g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f170907h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f170908i = null;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f170909m;

    public final void T6() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f170903d, this.f170908i.d1(), null);
        this.f170904e.setText(this.f170908i.g2());
        if (!this.f170908i.r2()) {
            this.f170905f.setTextColor(com.p314xaae8f345.mm.ui.p2740x696c9db.gd.a(mo55332x76847179()));
            this.f170905f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.iwu);
            this.f170905f.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.C30861xcebc809e.bnh, 0, 0, 0);
            this.f170907h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.iwn);
            this.f170907h.setClickable(true);
            return;
        }
        android.widget.TextView textView = this.f170905f;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        iz5.a.g(null, mo55332x76847179 != null);
        textView.setTextColor(new com.p314xaae8f345.mm.ui.p2740x696c9db.gd(mo55332x76847179).f291981a[0]);
        this.f170905f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.iwo);
        this.f170905f.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.C30861xcebc809e.bni, 0, 0, 0);
        this.f170907h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.iwo);
        this.f170907h.setClickable(false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569589fn;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571745o3));
        this.f170903d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.kj_);
        this.f170904e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kja);
        this.f170905f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kjc);
        this.f170906g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kje);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kjb);
        this.f170907h = textView;
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z5(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.a6(this));
        java.lang.String stringExtra = getIntent().getStringExtra("OpenWeRunSettingName");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_43f2581f6fd6", true);
        this.f170908i = n17;
        if (n17 == null || ((int) n17.E2) == 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, null);
            this.f170909m = Q;
            Q.show();
            ((c01.k7) c01.n8.a()).b("gh_43f2581f6fd6", 21, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b6(this));
        }
        this.f170906g.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571747o5, stringExtra));
        T6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        qk.o oVar;
        if (m1Var instanceof ns.l) {
            gm0.j1.n().f354821b.q(30, this);
            if (i17 == 0 && i18 == 0) {
                java.lang.String J2 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) ((ns.l) m1Var)).J();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenWeRunSettingUI", "bind fitness contact %s success", J2);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_43f2581f6fd6", true);
                this.f170908i = n17;
                if (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandOpenWeRunSettingUI", "respUsername == " + J2 + ", contact = " + n17);
                } else {
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(n17.d1())) {
                        java.lang.String d17 = n17.d1();
                        if (d17 == null) {
                            d17 = "";
                        }
                        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).getClass();
                        oVar = r01.z.b(d17);
                        if (oVar != null) {
                            oVar.f66748xdec927b = J2;
                        }
                        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).wi(d17);
                        n17.K1(d17);
                    } else {
                        oVar = null;
                    }
                    n17.X1(J2);
                    if (((int) n17.E2) == 0) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().i0(n17);
                    }
                    if (((int) n17.E2) <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandOpenWeRunSettingUI", "addContact : insert contact failed");
                    } else {
                        c01.e2.m0(n17);
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(n17.d1(), true);
                        if (oVar != null) {
                            ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Bi(oVar);
                        } else {
                            rv.v2 v2Var = (rv.v2) i95.n0.c(rv.v2.class);
                            java.lang.String d18 = n18.d1();
                            ((qv.q) v2Var).getClass();
                            qk.o b17 = r01.z.b(d18);
                            if (b17 == null || b17.U0()) {
                                c01.n8.a().c(n18.d1(), 19);
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            } else if (n18.X4()) {
                                c01.n8.a().c(n18.d1(), 19);
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(n18.d1());
                            }
                        }
                    }
                }
                ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Di(((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Ai(this.f170908i.d1()));
                gm0.j1.u().c().w(327825, java.lang.Boolean.TRUE);
                setResult(-1);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c6(this), 1500L);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandOpenWeRunSettingUI", "errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                if (i17 == 4 && i18 == -24 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
                }
                setResult(1);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f170909m;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            T6();
        }
    }
}
