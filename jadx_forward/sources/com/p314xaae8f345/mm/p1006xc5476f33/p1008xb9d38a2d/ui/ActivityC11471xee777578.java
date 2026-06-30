package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.VerifyPwdUI */
/* loaded from: classes5.dex */
public class ActivityC11471xee777578 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, al5.e0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f155208o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f155209d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f155210e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f155211f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.EditText f155212g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ScrollView f155213h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 f155214i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f155215m;

    /* renamed from: n, reason: collision with root package name */
    public int f155216n;

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VerifyPwdUI", "keyboard show %s, keyboardHeight %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (!z17) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f155211f.getLayoutParams();
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu);
            layoutParams.topMargin = 0;
            this.f155211f.setLayoutParams(layoutParams);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = this.f155214i;
            c22607x763d2049.setPadding(c22607x763d2049.getPaddingLeft(), this.f155214i.getPaddingTop(), this.f155214i.getPaddingRight(), 0);
            this.f155213h.scrollBy(0, 0);
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f155211f.getLayoutParams();
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        layoutParams2.topMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        this.f155211f.setLayoutParams(layoutParams2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d20492 = this.f155214i;
        c22607x763d20492.setPadding(c22607x763d20492.getPaddingLeft(), this.f155214i.getPaddingTop(), this.f155214i.getPaddingRight(), i17);
        int height = this.f155213h.getHeight();
        this.f155214i.requestLayout();
        this.f155214i.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.zi(this, height));
    }

    public final void T6(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f155210e.setVisibility(8);
        } else {
            this.f155210e.setVisibility(0);
            this.f155210e.setText(str);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d37;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f155213h = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.mcm);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049) findViewById(com.p314xaae8f345.mm.R.id.hdf);
        this.f155214i = c22607x763d2049;
        c22607x763d2049.e(this);
        this.f155210e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dhj);
        this.f155209d = findViewById(com.p314xaae8f345.mm.R.id.gcs);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.f568017ld5);
        this.f155212g = editText;
        editText.requestFocus();
        this.f155212g.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.vi(this));
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        this.f155211f = button;
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.wi(this));
        this.f155209d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.xi(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.yi(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(384, this);
        this.f155216n = getIntent().getIntExtra("key_scenen", 0);
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
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f155215m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (i17 == 0 && i18 == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_ticket", ((com.p314xaae8f345.mm.p957x53236a1b.l1) m1Var).H());
            setResult(-1, intent);
            db5.t7.h(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.k68));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.aj(this), 500L);
            return;
        }
        if (i17 != 4) {
            T6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571924to));
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            T6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571924to));
            return;
        }
        tm.a b17 = tm.a.b(str);
        if (b17 != null) {
            T6(b17.f501932b);
        } else {
            T6(str);
        }
    }
}
