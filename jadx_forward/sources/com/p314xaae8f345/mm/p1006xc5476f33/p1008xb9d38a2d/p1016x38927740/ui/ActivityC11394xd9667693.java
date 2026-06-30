package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui;

/* renamed from: com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI */
/* loaded from: classes14.dex */
public class ActivityC11394xd9667693 extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String f154757p = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?lang=%s&t=w_unprotect&step=1&f=Android";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f154758e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f154759f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f154760g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f154761h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f154762i = false;

    /* renamed from: m, reason: collision with root package name */
    public android.app.ProgressDialog f154763m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f154764n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f154765o;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570973cj4;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i86);
        findViewById(com.p314xaae8f345.mm.R.id.kju).setOnClickListener(new h71.d0(this));
        if (!this.f154762i) {
            this.f154764n = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.byy);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154760g)) {
                this.f154764n.setText(this.f154760g);
            }
            this.f154764n.setVisibility(0);
            this.f154764n.setOnClickListener(new h71.e0(this));
        }
        mo54448x9c8c0d33(new h71.f0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.Map d17;
        super.onCreate(bundle);
        this.f154758e = getIntent().getStringExtra("auth_ticket");
        this.f154759f = getIntent().getStringExtra("binded_mobile");
        this.f154762i = getIntent().getBooleanExtra("re_open_verify", false);
        java.lang.String stringExtra = getIntent().getStringExtra("close_safe_device_style");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecurityAccountIntroUI", "summerphone authTicket[%s], showStyle[%s]", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(this.f154758e), stringExtra);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(stringExtra, "wording", null)) != null) {
            this.f154760g = (java.lang.String) d17.get(".wording.title");
            java.lang.String str = (java.lang.String) d17.get(".wording.url");
            this.f154761h = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecurityAccountIntroUI", "summerphone closeBtnText[%s], jumpUrl[%s]", this.f154760g, str);
        }
        this.f154765o = n71.a.a();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        n71.a.e(this.f154765o);
        T6();
        W6(1);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.d().q(145, this);
        gm0.j1.d().q(132, this);
        if (this.f154762i) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L600_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L600_100"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(145, this);
        gm0.j1.d().a(132, this);
        if (this.f154762i) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L600_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L600_100"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        n71.a.d("L600_100");
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.app.ProgressDialog progressDialog = this.f154763m;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f154763m.dismiss();
            this.f154763m = null;
        }
        boolean z17 = true;
        if (i17 == 0 && i18 == 0) {
            java.lang.String str2 = !this.f154762i ? ((h11.d) ((h11.e) m1Var).f359604d).f359602b.f424458a.f455050o : ((r45.ei) ((r61.e1) m1Var).f474393d.f152244b.f152233a).f455050o;
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11395xb9d37a9a.class);
            intent.putExtra("auth_ticket", str2);
            intent.putExtra("binded_mobile", this.f154759f);
            intent.putExtra("re_open_verify", this.f154762i);
            intent.putExtra("from_source", getIntent().getIntExtra("from_source", 1));
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(this, intent);
            if (getIntent().getIntExtra("from_source", 1) == 3) {
                finish();
                return;
            }
            return;
        }
        if (i18 != -74) {
            if (i18 != -57) {
                if (i18 == -41) {
                    dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.ag6, 0).show();
                } else if (i18 == -34) {
                    dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.ag7, 0).show();
                } else if (i18 != -1) {
                    z17 = false;
                }
            }
            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.f571924to, 0).show();
        } else {
            db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.f572245ag3, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, null);
        }
        if (z17) {
            return;
        }
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        if (com.p314xaae8f345.mm.ui.pc.a(this, i17, i18, str, 4)) {
            return;
        }
        dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574446i81, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
    }
}
