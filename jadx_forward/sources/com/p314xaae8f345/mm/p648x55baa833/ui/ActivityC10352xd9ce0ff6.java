package com.p314xaae8f345.mm.p648x55baa833.ui;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.chatroom.ui.RoomAnnouncementUI */
/* loaded from: classes8.dex */
public class ActivityC10352xd9ce0ff6 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f145373d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f145374e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145375f;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.s_;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574442i74);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) findViewById(com.p314xaae8f345.mm.R.id.phz);
        c22633x83752a59.getClass();
        this.f145373d = c22633x83752a59;
        c22633x83752a59.mo120153xd15cf999().E(true);
        this.f145373d.mo120153xd15cf999().z(true);
        this.f145373d.mo120153xd15cf999().r(true);
        this.f145373d.mo120153xd15cf999().P(true);
        this.f145373d.mo120153xd15cf999().G(true);
        this.f145373d.mo120153xd15cf999().M(false);
        this.f145373d.mo120153xd15cf999().L(false);
        this.f145373d.mo120153xd15cf999().C(false);
        this.f145373d.mo120153xd15cf999().D(false);
        this.f145373d.mo81410x6fd49b97(new com.p314xaae8f345.mm.p648x55baa833.ui.l8(this));
        this.f145373d.mo74800x23d27c02(new com.p314xaae8f345.mm.p648x55baa833.ui.m8(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.n8(this));
        this.f145373d.mo32265x141096a9(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572376b03, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f145374e = getIntent().getBooleanExtra("need_bind_mobile", false);
        this.f145375f = getIntent().getStringExtra("RoomInfo_Id");
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = this.f145373d;
        if (c27816xac2547f9 != null) {
            c27816xac2547f9.setVisibility(8);
            ((android.view.ViewGroup) this.f145373d.getParent()).removeView(this.f145373d);
            this.f145373d.removeAllViews();
            this.f145373d.mo52095x5cd39ffa();
            this.f145373d = null;
            java.lang.System.gc();
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
