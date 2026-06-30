package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI */
/* loaded from: classes5.dex */
public class ActivityC11363xeff3735d extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f154533r = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f154534e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f154535f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f154536g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f154537h;

    /* renamed from: n, reason: collision with root package name */
    public android.content.SharedPreferences f154540n;

    /* renamed from: p, reason: collision with root package name */
    public s61.m1 f154542p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f154543q;

    /* renamed from: i, reason: collision with root package name */
    public boolean f154538i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f154539m = true;

    /* renamed from: o, reason: collision with root package name */
    public int f154541o = 0;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569737ke;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f154535f = (java.lang.String) gm0.j1.u().c().l(4097, null);
        this.f154534e = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.aid);
        this.f154538i = getIntent().getBooleanExtra("KEnterFromBanner", false);
        this.f154541o = getIntent().getIntExtra("bind_scene", 0);
        this.f154537h = getIntent().getStringExtra("policy_ticket");
        this.f154539m = getIntent().getBooleanExtra("back_to_status", true);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.aia);
        java.lang.String str = this.f154535f;
        if (str == null || str.equals("")) {
            this.f154535f = (java.lang.String) gm0.j1.u().c().l(6, null);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154535f)) {
            this.f154535f = getIntent().getStringExtra("bindmcontact_mobile");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMContactVerifyUI", "mobile %s", this.f154535f);
        this.f154534e.setFilters(new android.text.InputFilter[]{new p61.u1(this)});
        this.f154536g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.aif);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.aib)).setVisibility(8);
        button.setOnClickListener(new p61.v1(this));
        mo54448x9c8c0d33(new p61.w1(this));
        this.f154536g.setVisibility(u11.c.b(this.f154535f) ? 0 : 8);
        this.f154536g.setOnClickListener(new p61.x1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.Map map;
        super.onActivityResult(i17, i18, intent);
        if (i17 != 100 || intent == null || (map = (java.util.Map) intent.getBundleExtra("result_data").getSerializable("next_params")) == null) {
            return;
        }
        java.lang.String str = (java.lang.String) map.get("next_step");
        if ("end_bind_mobile".equalsIgnoreCase(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5.g7();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.addFlags(67108864);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.u(intent2, this);
            return;
        }
        if ("bind_mobile_take_over".equalsIgnoreCase(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMContactVerifyUI", "bind_mobile_take_over");
            this.f154542p.e(this.f154535f, this.f154534e.getText().toString().trim(), 25, this.f154543q);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572252ah4);
        this.f154540n = getSharedPreferences(getPackageName() + "_preferences", 0);
        c01.z1.p();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        s61.m1 m1Var = this.f154542p;
        if (m1Var != null) {
            m1Var.b();
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        W6(1);
        return true;
    }
}
