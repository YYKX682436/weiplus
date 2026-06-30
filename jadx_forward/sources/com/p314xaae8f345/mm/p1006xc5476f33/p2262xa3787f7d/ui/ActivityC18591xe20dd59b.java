package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* renamed from: com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI */
/* loaded from: classes.dex */
public class ActivityC18591xe20dd59b extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a implements com.p314xaae8f345.mm.p944x882e457a.u0, al5.e0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f254444p = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f254445e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f254446f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f254447g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.EditText f254448h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ScrollView f254449i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 f254450m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f254451n;

    /* renamed from: o, reason: collision with root package name */
    public int f254452o;

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VerifyPwdUI", "keyboard show %s, keyboardHeight %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f254447g.getLayoutParams();
        if (!z17) {
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu);
            layoutParams.topMargin = 0;
            this.f254447g.setLayoutParams(layoutParams);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = this.f254450m;
            c22607x763d2049.setPadding(c22607x763d2049.getPaddingLeft(), this.f254450m.getPaddingTop(), this.f254450m.getPaddingRight(), 0);
            this.f254449i.scrollBy(0, 0);
            return;
        }
        layoutParams.bottomMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        layoutParams.topMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        this.f254447g.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d20492 = this.f254450m;
        c22607x763d20492.setPadding(c22607x763d20492.getPaddingLeft(), this.f254450m.getPaddingTop(), this.f254450m.getPaddingRight(), i17);
        int height = this.f254449i.getHeight();
        this.f254450m.requestLayout();
        this.f254450m.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.m7(this, height));
    }

    public final void Z6(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f254446f.setVisibility(8);
        } else {
            this.f254446f.setVisibility(0);
            this.f254446f.setText(str);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d38;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f254449i = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.mcm);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049) findViewById(com.p314xaae8f345.mm.R.id.hdf);
        this.f254450m = c22607x763d2049;
        c22607x763d2049.e(this);
        this.f254446f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dhj);
        this.f254445e = findViewById(com.p314xaae8f345.mm.R.id.gcs);
        this.f254448h = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.f568017ld5);
        com.p314xaae8f345.mm.ui.fk.b((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oxc));
        this.f254448h.requestFocus();
        this.f254448h.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.i7(this));
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        this.f254447g = button;
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.j7(this));
        this.f254445e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.k7(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.l7(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(384, this);
        ((uh4.c0) i95.n0.c(uh4.c0.class)).T(7);
        this.f254452o = getIntent().getIntExtra("key_scenen", 3);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(384, this);
        mo48674x36654fab();
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VerifyPwdUI", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f254451n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (i17 == 0 && i18 == 0) {
            ((vh4.t1) i95.n0.c(vh4.t1.class)).T(2);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.n7(this), 1000L);
            return;
        }
        ((vh4.t1) i95.n0.c(vh4.t1.class)).T(6);
        if (i17 != 4) {
            Z6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571924to));
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            Z6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571924to));
            return;
        }
        tm.a b17 = tm.a.b(str);
        if (b17 != null) {
            Z6(b17.f501932b);
        } else {
            Z6(str);
        }
    }
}
