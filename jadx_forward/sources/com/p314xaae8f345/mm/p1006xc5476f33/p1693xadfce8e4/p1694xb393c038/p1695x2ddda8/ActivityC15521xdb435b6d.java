package com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI */
/* loaded from: classes9.dex */
public class ActivityC15521xdb435b6d extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f218514d;

    /* renamed from: e, reason: collision with root package name */
    public lz2.n f218515e;

    /* renamed from: f, reason: collision with root package name */
    public int f218516f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f218517g = false;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f218518h = "verifyFail";

    public void U6(java.lang.String str) {
        db5.e1.E(this, str, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj), false, new lz2.f(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aap;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.g6j);
        this.f218514d = button;
        button.setOnClickListener(new lz2.e(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: isTransparent */
    public boolean mo63463x4510f9c8() {
        return this.f218515e.d();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f218516f = getIntent().getIntExtra("key_scene", 1);
        boolean booleanExtra = getIntent().getBooleanExtra("key_show_succ_toast", true);
        this.f218517g = ih.a.h("clicfg_android_pay_liteapp_success_page", false) || ((h45.q) i95.n0.c(h45.q.class)).mo24776x1e9bb12b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdAuthUI", "scene: %s", java.lang.Integer.valueOf(this.f218516f));
        int i17 = this.f218516f;
        if (i17 == 0) {
            lz2.k kVar = new lz2.k(this);
            this.f218515e = kVar;
            kVar.f403873f = booleanExtra;
        } else if (i17 == 1) {
            this.f218515e = new lz2.i(this, this.f218517g);
        }
        super.onCreate(bundle);
        mo54448x9c8c0d33(new lz2.d(this));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.c8y);
        this.f218515e.f();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (this.f218517g && !this.f218518h.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdAuthUI", "useLiteApp successpage");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("event_name", "openFaceIdPayFail");
                jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, this.f218518h);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdAuthUI", "JSONException %s", e17.toString());
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.k(com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3192xff8cc88a.WX_PAY_CASHIER_LITE_APP_ID, "pay.notifyAll", jSONObject);
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onProgressFinish */
    public boolean mo63464xa6efccdf() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return this.f218515e.i(i17, i18, str, m1Var);
    }
}
