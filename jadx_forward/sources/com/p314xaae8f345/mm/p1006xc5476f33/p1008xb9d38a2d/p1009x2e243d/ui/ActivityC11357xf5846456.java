package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI */
/* loaded from: classes3.dex */
public class ActivityC11357xf5846456 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f154450d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f154451e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f154452f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f154453g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f154455i;

    /* renamed from: m, reason: collision with root package name */
    public android.app.ProgressDialog f154456m;

    /* renamed from: n, reason: collision with root package name */
    public r61.c1 f154457n;

    /* renamed from: o, reason: collision with root package name */
    public int f154458o;

    /* renamed from: h, reason: collision with root package name */
    public boolean f154454h = false;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnClickListener f154459p = new p61.b(this);

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View.OnClickListener f154460q = new p61.e(this);

    public final void T6() {
        this.f154453g.setVisibility(8);
        this.f154452f.setVisibility(0);
        this.f154450d.setVisibility(0);
        this.f154451e.setVisibility(0);
        this.f154451e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.afo);
        this.f154452f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.afm);
        this.f154452f.setOnClickListener(this.f154459p);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.k_;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54448x9c8c0d33(new p61.f(this));
        this.f154450d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f568391mo0);
        this.f154451e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568392mo1);
        this.f154452f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.mnz);
        this.f154453g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.mon);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 == -1) {
            if (i17 == 2005) {
                intent.getBooleanExtra("gpservices", false);
            }
        } else if (i17 == 2005) {
            intent.getBooleanExtra("gpservices", false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.afp);
        this.f154458o = getIntent().getIntExtra("enter_scene", 0);
        if (r61.r0.b(this)) {
            startActivityForResult(new android.content.Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46359x61685111);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(208903, null);
        this.f154455i = str;
        if (android.text.TextUtils.isEmpty(str)) {
            this.f154454h = false;
        } else {
            this.f154454h = true;
        }
        mo43517x10010bd5();
        if (this.f154454h) {
            this.f154453g.setVisibility(0);
            this.f154452f.setVisibility(8);
            this.f154451e.setVisibility(0);
            this.f154451e.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.afn, this.f154455i));
            this.f154453g.setOnClickListener(this.f154460q);
        } else {
            T6();
        }
        gm0.j1.d().a(487, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        if (android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        objArr[2] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", objArr);
        android.app.ProgressDialog progressDialog = this.f154456m;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f154456m.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "unbind failed");
            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.fqz, 0).show();
            return;
        }
        gm0.j1.u().c().w(208903, "");
        gm0.j1.u().c().w(208901, "");
        gm0.j1.u().c().w(208902, "");
        gm0.j1.u().c().w(208905, java.lang.Boolean.TRUE);
        gm0.j1.u().c().i(true);
        T6();
        db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.k2e));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        gm0.j1.d().q(487, this);
    }
}
