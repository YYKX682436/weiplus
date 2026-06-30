package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* renamed from: com.tencent.mm.pluginsdk.ui.BioHelperUI */
/* loaded from: classes.dex */
public class ActivityC19635xb390e7ca extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public int f271291d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f271292e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f271293f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f271294g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f271295h;

    /* renamed from: i, reason: collision with root package name */
    public int f271296i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.g0 f271297m;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569742kj;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Boolean.valueOf(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BioHelperUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
        this.f271297m.e(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.g0 f0Var;
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("k_type", 1);
        this.f271291d = intExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BioHelperUI", "hy: starting to bio helper ui, type: %d", java.lang.Integer.valueOf(intExtra));
        java.lang.String stringExtra = getIntent().getStringExtra("Kusername");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.g0 g0Var = null;
        if (stringExtra == null) {
            stringExtra = null;
        }
        this.f271292e = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("Kvertify_key");
        if (stringExtra2 == null) {
            stringExtra2 = null;
        }
        this.f271293f = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("KVoiceHelpUrl");
        if (stringExtra3 == null) {
            stringExtra3 = null;
        }
        this.f271294g = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("KVoiceHelpWording");
        if (stringExtra4 == null) {
            stringExtra4 = null;
        }
        this.f271295h = stringExtra4;
        this.f271296i = getIntent().getIntExtra("KVoiceHelpCode", 0);
        int i17 = this.f271291d;
        if (i17 == 0) {
            f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.h0(this, null);
        } else {
            if (i17 != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BioHelperUI", "hy: invalid type!!!");
                this.f271297m = g0Var;
                if (g0Var != null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271292e) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271293f)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BioHelperUI", "type or username or ticket is null and finish");
                    finish();
                }
                android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564920aj0);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271295h)) {
                    textView.setText(this.f271297m.d());
                } else {
                    textView.setText(this.f271295h);
                }
                mo54450xbf7c1df6(this.f271297m.b());
                ((android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.aiy)).setImageResource(this.f271297m.a());
                mo54448x9c8c0d33(new com.p314xaae8f345.mm.p2470x93e71c27.ui.c0(this));
                this.f271297m.f(getIntent());
                android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f564921aj1);
                button.setText(this.f271297m.c());
                button.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.d0(this));
                findViewById(com.p314xaae8f345.mm.R.id.aiz).setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.e0(this));
                return;
            }
            f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.f0(this, null);
        }
        g0Var = f0Var;
        this.f271297m = g0Var;
        if (g0Var != null) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BioHelperUI", "type or username or ticket is null and finish");
        finish();
    }
}
