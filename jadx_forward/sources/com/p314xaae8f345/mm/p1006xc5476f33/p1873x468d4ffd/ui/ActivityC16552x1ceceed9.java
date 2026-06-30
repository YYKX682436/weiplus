package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightRecordViewTestUI */
/* loaded from: classes7.dex */
public class ActivityC16552x1ceceed9 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 f230747d;

    /* renamed from: e, reason: collision with root package name */
    public final int f230748e = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf;

    /* renamed from: f, reason: collision with root package name */
    public final float f230749f = 0.67f;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c1v;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.k0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da53 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53) findViewById(com.p314xaae8f345.mm.R.id.lpz);
        this.f230747d = c16529x1336da53;
        c16529x1336da53.m66788xf6c2fdeb(this.f230749f);
        this.f230747d.m66797x14794dd4(this.f230748e);
        this.f230747d.d(100000, 4800000, 30, 64000, 44100);
        this.f230747d.m66800x1474a01a(lp0.b.D() + "mmsighttest.mp4");
        this.f230747d.m66786x6da83fed(true);
        this.f230747d.m66787x84a70c6a(true);
        ((kt3.n) this.f230747d.f230365d).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppRecordViewImpl", "setHalfPreviewVideoSize");
        this.f230747d.m66792x175c5771(3);
        this.f230747d.m66793x6554ffda(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.l0(this));
        this.f230747d.f();
        this.f230747d.f230365d.getClass();
        findViewById(com.p314xaae8f345.mm.R.id.nxn).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.n0(this));
        findViewById(com.p314xaae8f345.mm.R.id.ngv).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.q0(this));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.r0(this, (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565563cr4)), 1000L);
        findViewById(com.p314xaae8f345.mm.R.id.ntq).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.s0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        kt3.n nVar = (kt3.n) this.f230747d.f230365d;
        kt3.l lVar = nVar.f393540d;
        if (lVar != null) {
            lVar.mo9065x41012807();
        }
        nVar.f393549p = null;
    }
}
