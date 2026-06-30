package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI */
/* loaded from: classes12.dex */
public class ActivityC12985xde48fa36 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements or1.q {

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f175576d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f175577e = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22520x90c681bf f175578f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12976x62b3a916 f175579g;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a2r;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.bke);
        mo54448x9c8c0d33(new or1.h2(this));
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22520x90c681bf c22520x90c681bf = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22520x90c681bf) findViewById(com.p314xaae8f345.mm.R.id.mfo);
        this.f175578f = c22520x90c681bf;
        c22520x90c681bf.m81099x4e8adcd9(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        this.f175578f.m81101xf206aa51(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bke));
        this.f175578f.m81102x7b05f92(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560764tj));
        this.f175578f.m81103xf2070843(0);
        this.f175578f.m81105xe2d9699f(false);
        this.f175578f.m81097x6c4032e7(new or1.j2(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12976x62b3a916 c12976x62b3a916 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12976x62b3a916) findViewById(com.p314xaae8f345.mm.R.id.md_);
        this.f175579g = c12976x62b3a916;
        c12976x62b3a916.setOnTouchListener(new or1.i2(this));
        or1.d2 d2Var = new or1.d2(this);
        d2Var.f429006t = lr1.f0.H();
        this.f175579g.m54302x6cab2c8d(d2Var);
        this.f175579g.m54304x752ba357(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12976x62b3a916 c12976x62b3a9162 = this.f175579g;
        or1.m mVar = c12976x62b3a9162.f175515e;
        mVar.f429066p = false;
        mVar.f429065o = false;
        c12976x62b3a9162.m54306x764d6925(1);
        this.f175579g.m54308x53aed94a(this.f175577e);
        this.f175579g.m54305xadb6a185(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getIntent().getIntExtra("intent_extra_entry_flag", 0);
        this.f175577e = getIntent().getIntExtra("fromScene", 0);
        mo43517x10010bd5();
        if (java.lang.System.currentTimeMillis() - lr1.f0.f402192f > 3600000) {
            gm0.j1.d().a(456, new or1.f2(this));
            gm0.j1.d().g(new lr1.f0());
        }
        java.lang.String stringExtra = getIntent().getStringExtra("Search_Str");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            return;
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new or1.g2(this, stringExtra));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((java.util.ArrayList) r01.q3.pj().f449808a).clear();
    }
}
