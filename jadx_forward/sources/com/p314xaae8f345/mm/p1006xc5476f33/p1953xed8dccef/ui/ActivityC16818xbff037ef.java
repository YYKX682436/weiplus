package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.product.ui.MallProductUI */
/* loaded from: classes15.dex */
public class ActivityC16818xbff037ef extends com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.AbstractActivityC16810x42519079 implements y60.e {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f234780e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f234781f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f234782g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f234783h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f234784i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f234785m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.C16808xf9c47a5d f234786n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.C16808xf9c47a5d f234787o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f234788p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ListView f234789q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.h f234790r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ListView f234791s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.u0 f234792t = null;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f234793u;

    /* renamed from: v, reason: collision with root package name */
    public wq3.j f234794v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w f234795w;

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (str == null || !str.equals(this.f234794v.f530091k)) {
            return;
        }
        this.f234782g.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.p1(this, bitmap));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.can;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.gsi);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.i1(this));
        this.f234780e = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.j_p);
        this.f234781f = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.ja_);
        this.f234782g = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j_n);
        this.f234783h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j_j);
        this.f234784i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j_s);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j_q);
        this.f234785m = textView;
        textView.getPaint().setFlags(16);
        this.f234788p = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.j_l);
        this.f234786n = (com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.C16808xf9c47a5d) findViewById(com.p314xaae8f345.mm.R.id.j_k);
        this.f234787o = (com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.C16808xf9c47a5d) findViewById(com.p314xaae8f345.mm.R.id.j_r);
        this.f234789q = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.j_i);
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.h(this);
        this.f234790r = hVar;
        this.f234789q.setAdapter((android.widget.ListAdapter) hVar);
        this.f234789q.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.j1(this));
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f567376ja2)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.k1(this));
        this.f234791s = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.jaa);
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.u0(this);
        this.f234792t = u0Var;
        u0Var.f234893f = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.l1(this);
        this.f234791s.setAdapter((android.widget.ListAdapter) u0Var);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.j_m);
        this.f234793u = button;
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.m1(this));
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.o1(this));
        mo74408xb0dfae51(false);
        this.f234782g.setFocusable(true);
        this.f234782g.setFocusableInTouchMode(true);
        this.f234782g.requestFocus();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.AbstractActivityC16810x42519079, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo67598xf0aced2e(8);
        boolean booleanExtra = getIntent().getBooleanExtra("key_go_finish", false);
        setResult(-1);
        if (booleanExtra) {
            finish();
            return;
        }
        mo43517x10010bd5();
        this.f234794v = vq3.e.wi().Ai();
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w(mo55332x76847179(), new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.h1(this));
        this.f234795w = wVar;
        gm0.j1.e().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.t(wVar, getIntent(), new wq3.t()));
        wVar.f234898e = true;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5868xe54ea839 c5868xe54ea839 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5868xe54ea839();
        c5868xe54ea839.f136177h.f88786a = -1;
        c5868xe54ea839.f273897d = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.u(wVar, c5868xe54ea839);
        c5868xe54ea839.b(android.os.Looper.getMainLooper());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        this.f234795w.d();
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f234795w.c();
    }
}
