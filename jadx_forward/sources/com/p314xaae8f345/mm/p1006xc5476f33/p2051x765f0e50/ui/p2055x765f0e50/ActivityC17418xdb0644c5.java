package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI */
/* loaded from: classes.dex */
public class ActivityC17418xdb0644c5 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f241904d;

    /* renamed from: f, reason: collision with root package name */
    public k14.y f241906f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f241907g;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f241909i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f241910m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f241911n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f241912o;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f241905e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241908h = false;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f241913p = null;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cla;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bln);
        this.f241909i = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a_4);
        this.f241910m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kbq);
        this.f241911n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ovg);
        this.f241912o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jpv);
        this.f241904d = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.ls6);
        java.lang.String r17 = c01.z1.r();
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.y3(r17)) {
            this.f241904d.setText(c01.z1.r());
            this.f241911n.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571536i5, r17));
        }
        android.widget.EditText editText = this.f241904d;
        editText.setSelection(editText.getText().length());
        this.f241904d.setFocusable(true);
        this.f241904d.setFocusableInTouchMode(true);
        this.f241904d.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.x9(this));
        android.widget.TextView textView = this.f241910m;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String l17 = c01.z1.l();
        float textSize = this.f241910m.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, l17, textSize));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f241909i, r17, null);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.y9(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572080y6), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.aa(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        m78501x43e00957(false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f241908h = getIntent().getBooleanExtra("KFromSetAliasTips", false);
        mo43517x10010bd5();
        gm0.j1.d().a(177, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (this.f241906f != null) {
            gm0.j1.d().d(this.f241906f);
        }
        gm0.j1.d().q(177, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            if (this.f241908h) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10358, java.lang.String.valueOf(1));
            }
            mo48674x36654fab();
            gm0.j1.u().c().w(42, this.f241907g);
            com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.da daVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.da(this);
            this.f241913p = daVar;
            d17.a(255, daVar);
            gm0.j1.d().g(new com.p314xaae8f345.mm.p957x53236a1b.w0(1));
            return;
        }
        android.app.ProgressDialog progressDialog = this.f241905e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f241905e = null;
        }
        o25.s1 a17 = f14.g.a();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((com.p314xaae8f345.mm.app.o7) a17).getClass();
        if (!com.p314xaae8f345.mm.ui.pc.a(mo55332x76847179, i17, i18, str, 4) && i17 == 4) {
            if (i18 == -7 || i18 == -10) {
                db5.e1.i(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574326hv5, com.p314xaae8f345.mm.R.C30867xcad56011.gyf);
            }
        }
    }
}
