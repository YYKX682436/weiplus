package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.card.ui.CardGiftImageUI */
/* loaded from: classes12.dex */
public class ActivityC13050xc93b9c8f extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements lu1.b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e f176336d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f176337e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f176338f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f176339g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 f176340h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ProgressBar f176341i;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.s6 f176343n;

    /* renamed from: o, reason: collision with root package name */
    public android.os.Bundle f176344o;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.s4 f176346q;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.d1 f176351v;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f176342m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    public boolean f176345p = false;

    /* renamed from: r, reason: collision with root package name */
    public int f176347r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f176348s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f176349t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f176350u = 0;

    @Override // lu1.b
    public void I1(java.lang.String str, java.lang.String str2) {
        this.f176342m.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.c1(this, str2));
    }

    @Override // lu1.b
    public void J(java.lang.String str) {
    }

    public void T6() {
        this.f176346q.e(this.f176348s, this.f176347r, this.f176349t, this.f176350u);
        this.f176346q.d(this.f176339g, this.f176338f, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.a1(this), null);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        T6();
        return true;
    }

    @Override // lu1.b
    public void g2(java.lang.String str, int i17, int i18) {
        this.f176342m.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569835pk;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f176338f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ght);
        this.f176341i = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.h_0);
        this.f176339g = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.h_t);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89) findViewById(com.p314xaae8f345.mm.R.id.ghs);
        this.f176340h = c22506x89e75b89;
        c22506x89e75b89.setVerticalFadingEdgeEnabled(false);
        this.f176340h.setHorizontalFadingEdgeEnabled(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.d1 d1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.d1(this, null);
        this.f176351v = d1Var;
        this.f176340h.setAdapter((android.widget.SpinnerAdapter) d1Var);
        this.f176340h.mo55657x3be48126(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.u0(this));
        this.f176340h.setOnItemLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v0(this));
        this.f176346q = new com.p314xaae8f345.mm.ui.p2740x696c9db.s4(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (getIntent().getExtras() != null) {
            getIntent().getExtras().setClassLoader(getClass().getClassLoader());
        }
        super.onCreate(bundle);
        m78531x8f8cf1fb();
        this.f176344o = bundle;
        getWindow().setFlags(1024, 1024);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e) getIntent().getParcelableExtra("key_gift_into");
        this.f176336d = c13037x580b4d4e;
        if (c13037x580b4d4e != null) {
            c13037x580b4d4e.m54441x9616526c();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftImageUI", "imgPath:%s", this.f176337e);
        mo43517x10010bd5();
        lu1.c.b(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e2 = this.f176336d;
        if (c13037x580b4d4e2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c13037x580b4d4e2.f176184h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftImageUI", "fromUserContentPicUrl is null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e3 = this.f176336d;
            lu1.c.a(c13037x580b4d4e3.f176184h, c13037x580b4d4e3.f176187n, c13037x580b4d4e3.f176198x, 2);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        lu1.c.c(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.d1 d1Var = this.f176351v;
        if (d1Var != null) {
            d1Var.notifyDataSetChanged();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        android.os.Bundle bundle = this.f176344o;
        if (!this.f176345p) {
            this.f176345p = true;
            this.f176347r = getIntent().getIntExtra("img_top", 0);
            this.f176348s = getIntent().getIntExtra("img_left", 0);
            this.f176349t = getIntent().getIntExtra("img_width", 0);
            int intExtra = getIntent().getIntExtra("img_height", 0);
            this.f176350u = intExtra;
            this.f176346q.e(this.f176348s, this.f176347r, this.f176349t, intExtra);
            if (bundle == null) {
                this.f176339g.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.y0(this));
            }
        }
        super.onStart();
    }
}
