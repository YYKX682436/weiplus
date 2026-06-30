package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class z2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d f230987a;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d) {
        this.f230987a = activityC16554x70dcab5d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.z1
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "on video edit error");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230987a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var = activityC16554x70dcab5d.K;
        if (a2Var != null) {
            a2Var.e();
            activityC16554x70dcab5d.K = null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.y2(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.z1
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "on video edit finish");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230987a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var = activityC16554x70dcab5d.K;
        if (a2Var != null) {
            java.lang.String str = a2Var.A;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            activityC16554x70dcab5d.C1 = str;
            a2Var.f(false, activityC16554x70dcab5d.V.f230360q);
            this.f230987a.K.e();
            this.f230987a.K = null;
        }
        this.f230987a.f230771p.setVisibility(0);
        this.f230987a.f230774q.setVisibility(0);
        this.f230987a.f230781x.setVisibility(0);
        this.f230987a.H.mo69303x360802();
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d2 = this.f230987a;
        activityC16554x70dcab5d2.H.mo69327xab3268fe(activityC16554x70dcab5d2.f230768m.mo127744x5000ed37());
        this.f230987a.H.mo69317x764cf626(true);
        this.f230987a.H.m75828x772f3ddc(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d3 = this.f230987a;
        activityC16554x70dcab5d3.H.mo69326x360a109e(activityC16554x70dcab5d3.M1);
        this.f230987a.m78583x85ccfe01(8);
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.x2(this));
        this.f230987a.A1 = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.z1
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "on video edit exit");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230987a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var = activityC16554x70dcab5d.K;
        if (a2Var != null) {
            a2Var.f(true, activityC16554x70dcab5d.V.f230360q);
            activityC16554x70dcab5d.K.e();
            activityC16554x70dcab5d.K = null;
        }
        activityC16554x70dcab5d.m78583x85ccfe01(8);
        activityC16554x70dcab5d.f230771p.setVisibility(0);
        activityC16554x70dcab5d.f230774q.setVisibility(0);
        activityC16554x70dcab5d.f230781x.setVisibility(0);
    }
}
