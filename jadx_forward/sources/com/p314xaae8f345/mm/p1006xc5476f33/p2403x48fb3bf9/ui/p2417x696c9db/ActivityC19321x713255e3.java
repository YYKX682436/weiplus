package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

@db5.a(m123858x6ac9171 = 3)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthGetA8KeyUI */
/* loaded from: classes8.dex */
public class ActivityC19321x713255e3 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f265222n = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f265223d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f265224e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f265225f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f265226g;

    /* renamed from: h, reason: collision with root package name */
    public int f265227h = -1;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f265228i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f265229m;

    public final void T6(com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 abstractC11230x9d3d6a61, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        abstractC11230x9d3d6a61.mo48431x792022dd(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32706x6a744ba6 = str;
        args.f32701xaddf3082 = bundle;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.h(bundle);
        args.f32703x5cfee87 = 268435456;
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(this, args);
    }

    public final void U6() {
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11253x74652733.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11253x74652733.Resp();
        resp.f32867xa7c470f2 = -2;
        T6(resp, this.f265226g);
    }

    public final void V6() {
        int i17 = getResources().getConfiguration().orientation;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f567182uc1);
        if (findViewById != null) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.bottomMargin = i17 == 2 ? i65.a.b(this, 12) : i17 == 1 ? i65.a.b(this, 96) : 0;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570968en5;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        V6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, this);
        this.f265223d = getIntent().getStringExtra("key_url");
        java.lang.String stringExtra = getIntent().getStringExtra("key_app_id");
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(stringExtra);
        if (h17 != null) {
            this.f265224e = h17.f67372x453d1e07;
            this.f265225f = h17.f67369x5e556d3a;
            this.f265226g = h17.f67386xa1e9e82c;
        }
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        mo78514x143f1b92().X0(this, b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78514x143f1b92().E0(b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.vi8)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.r1(this));
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.hk8);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.u6u);
        o11.f fVar = new o11.f();
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f80704x478452f2;
        fVar.f423630u = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a9i);
        fVar.f423629t = true;
        n11.a.b().h(this.f265225f, imageView, fVar.a());
        textView.setText(this.f265224e);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.olw);
        textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.h8g);
        textView2.getPaint().setFakeBoldText(true);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564612w0)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.oaq);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.slq);
        android.widget.Button button2 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.sm6);
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s1(this));
        button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t1(this));
        V6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        U6();
        finish();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof w60.k) {
            com.p314xaae8f345.mm.p957x53236a1b.k0 k0Var = (com.p314xaae8f345.mm.p957x53236a1b.k0) ((w60.k) m1Var);
            if (k0Var.O() == this.f265227h) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f265228i;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
                if (i17 == 0 && i18 == 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOAuthGetA8KeyUI", "onGetA8KeySceneEnd, redirectUrl = " + k0Var.Q());
                    com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11253x74652733.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11253x74652733.Resp();
                    resp.f32971x7570f7f3 = k0Var.Q();
                    T6(resp, this.f265226g);
                    finish();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDKOAuthGetA8KeyUI", "onGetA8KeySceneEnd, errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str);
                com.p314xaae8f345.mm.p944x882e457a.o oVar = k0Var.f152889e;
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.s83) oVar.f152244b.f152233a).f467096y) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8c) : ((r45.s83) oVar.f152244b.f152233a).f467096y;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f265229m;
                if (j0Var != null) {
                    j0Var.dismiss();
                }
                this.f265229m = db5.e1.G(this, string, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ooo), true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.v1(this, str));
            }
        }
    }
}
