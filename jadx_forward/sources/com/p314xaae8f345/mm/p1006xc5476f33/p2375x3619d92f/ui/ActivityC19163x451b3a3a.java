package com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui;

/* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardLogoutUI */
/* loaded from: classes9.dex */
public class ActivityC19163x451b3a3a extends com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.AbstractActivityC19158x4b7e6cc1 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f262560o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f262561d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f262562e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f262563f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f262564g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f262565h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f262566i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f262567m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f262568n;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570251a51;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f262561d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.d_g);
        this.f262562e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.d_f);
        this.f262564g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.d_e);
        this.f262563f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.d__);
        this.f262566i = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.d_b);
        this.f262565h = findViewById(com.p314xaae8f345.mm.R.id.d_d);
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.d_c)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.l(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m83090x14f40144(2931);
        mo43517x10010bd5();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bte);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletECardLogoutUI", "do qry logout desc");
        jt4.k kVar = new jt4.k(1L);
        kVar.K(this);
        m83099x5406100e(kVar, true);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(2931);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof jt4.k)) {
            return false;
        }
        jt4.k kVar = (jt4.k) m1Var;
        kVar.O(new com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.m(this, kVar));
        return true;
    }
}
