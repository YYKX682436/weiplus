package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsIntroUI */
/* loaded from: classes8.dex */
public class ActivityC16723x347a332a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f233618d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f233619e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c67;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f233619e = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.bpr, null);
        ((android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.k5n)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.q(this));
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).Ni(13L);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.r(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.h6j);
        mo43517x10010bd5();
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.NearbyPersonFragment);
        aVar.Rj(this, iy1.a.PeopleNearby);
        aVar.ik(this, 40, 24184);
    }
}
