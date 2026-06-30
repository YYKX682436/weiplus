package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.ArtistUI */
/* loaded from: classes4.dex */
public class ActivityC17940xbaa2983b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f247734r = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y f247735d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f247736e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4 f247737f;

    /* renamed from: i, reason: collision with root package name */
    public android.content.SharedPreferences f247740i;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f247738g = "";

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f247739h = null;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f247741m = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj();

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 f247742n = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 f247743o = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj();

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f247744p = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l0(this);

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f247745q = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m0(this);

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y T6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b activityC17940xbaa2983b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y yVar = activityC17940xbaa2983b.f247735d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        return yVar;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4 U6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17940xbaa2983b activityC17940xbaa2983b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4 c17939xe65f30d4 = activityC17940xbaa2983b.f247737f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        return c17939xe65f30d4;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cqs;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iyk);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a5o));
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a5o));
        this.f247736e = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.n6m);
        this.f247739h = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572002vy), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n0(this));
        this.f247735d = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y(this, this.f247738g, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o0(this), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p0(this));
        this.f247736e.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4 c17939xe65f30d4 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4(this);
        this.f247737f = c17939xe65f30d4;
        this.f247736e.addHeaderView(c17939xe65f30d4);
        this.f247736e.setAdapter((android.widget.ListAdapter) this.f247735d);
        this.f247735d.notifyDataSetChanged();
        this.f247737f.setVisibility(8);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.r0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("filterLan", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        java.lang.String o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), this);
        if (o17.equals("zh_CN") || o17.equals("en") || o17.equals("zh_TW")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterLan", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        } else {
            o17 = o17.equals("zh_HK") ? "zh_TW" : "en";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterLan", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        }
        this.f247738g = o17;
        gm0.j1.i();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de, this);
        this.f247740i = getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4 c17939xe65f30d4 = this.f247737f;
        c17939xe65f30d4.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAttach", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().c(c17939xe65f30d4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAttach", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        super.onDestroy();
        if (this.f247739h != null) {
            this.f247739h = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4 c17939xe65f30d4 = this.f247737f;
        if (c17939xe65f30d4 != null) {
            c17939xe65f30d4.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetch", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().v(c17939xe65f30d4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetch", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().N(this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y yVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        if (!(m1Var instanceof com.p314xaae8f345.mm.p944x882e457a.q1) || ((com.p314xaae8f345.mm.p944x882e457a.q1) m1Var).u() != 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.ArtistUI");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ArtistUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " type = " + m1Var.mo808xfb85f7b0() + " @" + hashCode());
        if (i17 == 0 && i18 == 0) {
            if (m1Var.mo808xfb85f7b0() == 159 && (yVar = this.f247735d) != null) {
                yVar.a();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.ArtistUI");
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 159 && (u3Var = this.f247739h) != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.ArtistUI");
    }
}
