package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

@db5.a(m123858x6ac9171 = 8192)
/* renamed from: com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI */
/* loaded from: classes8.dex */
public class ActivityC16472xf5823d43 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f229762o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f229763d;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f229765f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f229766g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.r f229767h;

    /* renamed from: i, reason: collision with root package name */
    public int f229768i;

    /* renamed from: n, reason: collision with root package name */
    public ef3.b f229770n;

    /* renamed from: e, reason: collision with root package name */
    public final int f229764e = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 40);

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f229769m = new java.util.ArrayList();

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bvx;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f229763d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.jip);
        this.f229767h = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.r(this, null);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.bvu, null);
        this.f229763d.addHeaderView(viewGroup, null, false);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(mo55332x76847179());
        linearLayout.setMinimumHeight(i65.a.b(mo55332x76847179(), 80));
        this.f229763d.addFooterView(linearLayout, null, false);
        this.f229763d.setAdapter((android.widget.ListAdapter) this.f229767h);
        this.f229765f = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.jih);
        this.f229766g = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.jig);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        this.f229768i = intValue;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallFunctionSettingsUI", "wallet region: %s", java.lang.Integer.valueOf(intValue));
        mo43517x10010bd5();
        mo54450xbf7c1df6("");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallFunctionSettingsUI", "do get function list");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallFunctionSettingsUI", " walletMallV2 is ：%s", java.lang.Boolean.TRUE);
        ef3.b bVar = new ef3.b(this.f229768i, 0, 1, 1);
        this.f229770n = bVar;
        bVar.l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.p(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f229770n.j();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(gf3.c.class);
    }
}
