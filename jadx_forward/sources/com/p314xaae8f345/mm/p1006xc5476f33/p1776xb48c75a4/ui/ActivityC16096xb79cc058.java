package com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardBackUI */
/* loaded from: classes9.dex */
public class ActivityC16096xb79cc058 extends com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312 {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f223795f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab f223796g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f223797h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f223798i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f223799m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f223800n;

    /* renamed from: o, reason: collision with root package name */
    public r45.an6 f223801o;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bjg;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f223795f = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.h1z);
        this.f223796g = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) findViewById(com.p314xaae8f345.mm.R.id.f566790h23);
        this.f223797h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566791h24);
        this.f223798i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566787h20);
        this.f223799m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566789h22);
        this.f223796g.b();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f223793d, "unbind success");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5778x426a2e60 c5778x426a2e60 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5778x426a2e60();
            am.dm dmVar = c5778x426a2e60.f136091g;
            dmVar.f88010a = 2;
            dmVar.f88011b = this.f223800n;
            c5778x426a2e60.e();
            finish();
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f223794e = com.p314xaae8f345.mm.R.C30859x5a72f63.f560769to;
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo54448x9c8c0d33(new v73.b(this));
        m83090x14f40144(2851);
        this.f223800n = getIntent().getStringExtra("key_card_no");
        mo43517x10010bd5();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f223793d, "do qry card detail: %s", this.f223800n);
        r73.k kVar = new r73.k(this.f223800n);
        kVar.K(this);
        m83099x5406100e(kVar, true);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(2851);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof r73.k)) {
            return true;
        }
        r73.k kVar = (r73.k) m1Var;
        kVar.O(new v73.c(this, kVar));
        return true;
    }
}
