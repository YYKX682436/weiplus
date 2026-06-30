package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI */
/* loaded from: classes12.dex */
public abstract class AbstractActivityC13589x120fb59a extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f182136d = false;

    /* renamed from: e, reason: collision with root package name */
    public v82.b f182137e;

    /* renamed from: f, reason: collision with root package name */
    public long f182138f;

    public void U6(int i17) {
        if (this.f182136d) {
            this.f182137e.f515603d = ((int) (java.lang.System.currentTimeMillis() - this.f182138f)) / 1000;
            v82.b bVar = this.f182137e;
            bVar.f515600a = i17;
            bVar.b();
        }
        if (i17 == 3) {
            ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(5);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).wi();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f182137e = new v82.b();
        this.f182136d = this.f182137e.d((r45.fq0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ri(this, 1, 17, r45.fq0.class));
        this.f182138f = java.lang.System.currentTimeMillis();
        this.f182137e.f515606g = v82.b.a();
        this.f182137e.f515610k = this.f182138f;
    }
}
