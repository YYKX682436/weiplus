package com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2382xaf65a0fc.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUStartOpenUI */
/* loaded from: classes9.dex */
public class ActivityC19183xa778cd1a extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f262782m = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21491x5f1c5be9 f262783d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f262784e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.EditText f262785f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f262786g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f262787h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f262788i;

    public final void U6() {
        if (this.f262783d.getVisibility() == 0) {
            if (!((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(V6()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262785f.getText().toString())) ? false : true)) {
                this.f262786g.setEnabled(false);
                return;
            }
            this.f262788i = V6();
            this.f262787h = this.f262783d.m78943xc8806901();
            this.f262786g.setEnabled(true);
        }
    }

    public final java.lang.String V6() {
        return this.f262783d.m78941x81cc056d().startsWith("+") ? this.f262783d.m78941x81cc056d().substring(1) : this.f262783d.m78941x81cc056d();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c97;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: needConfirmFinish */
    public boolean mo73847x7d641a7d() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f262787h = m83105x7498fe14().getString("key_mobile");
        java.lang.String string = m83105x7498fe14().getString("dial_code");
        this.f262788i = string;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            this.f262788i = "27";
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2382xaf65a0fc.ui.C19182xecb10d41) findViewById(com.p314xaae8f345.mm.R.id.hec)).m73992x9165ebcb(new tt4.a[]{new tt4.a(com.p314xaae8f345.mm.R.C30861xcebc809e.ccr, com.p314xaae8f345.mm.R.C30867xcad56011.kwg, com.p314xaae8f345.mm.R.C30867xcad56011.kwb), new tt4.a(com.p314xaae8f345.mm.R.C30861xcebc809e.ccs, com.p314xaae8f345.mm.R.C30867xcad56011.kwh, com.p314xaae8f345.mm.R.C30867xcad56011.kwc), new tt4.a(com.p314xaae8f345.mm.R.C30861xcebc809e.cct, com.p314xaae8f345.mm.R.C30867xcad56011.kwi, com.p314xaae8f345.mm.R.C30867xcad56011.kwd)});
        this.f262783d = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21491x5f1c5be9) findViewById(com.p314xaae8f345.mm.R.id.ngr);
        this.f262786g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ngc);
        this.f262784e = this.f262783d.m78942xd071bee4();
        this.f262785f = this.f262783d.m78944x51a34e78();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262787h)) {
            this.f262785f.setText(this.f262787h);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262788i)) {
            this.f262784e.setText(this.f262788i);
        }
        ut4.c cVar = new ut4.c(this);
        this.f262785f.addTextChangedListener(cVar);
        this.f262784e.addTextChangedListener(cVar);
        this.f262786g.setOnClickListener(new ut4.d(this));
        vt4.c.a(this, (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ngo));
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ngt)).setText(c01.z1.I() ? com.p314xaae8f345.mm.R.C30867xcad56011.kwm : com.p314xaae8f345.mm.R.C30867xcad56011.kwn);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        U6();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
