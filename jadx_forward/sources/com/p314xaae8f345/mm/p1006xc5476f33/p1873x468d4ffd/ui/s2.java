package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d f230950d;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d, int i17, int i18) {
        this.f230950d = activityC16554x70dcab5d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230950d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SightCaptureUI", "call stop callback now, currentStatus: %s", activityC16554x70dcab5d.h7(activityC16554x70dcab5d.f230764g));
        this.f230950d.f230766i.m(di3.l.Stoping);
        this.f230950d.Z6();
        long n17 = ai3.d.n("TIME_RECODER_2_PLAY");
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.r2(this, n17));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "stop finish, filepath: %s %s time_takevideo %s", this.f230950d.f230768m.mo127744x5000ed37(), java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(this.f230950d.f230768m.mo127744x5000ed37())), java.lang.Long.valueOf(n17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d2 = this.f230950d;
        activityC16554x70dcab5d2.C1 = activityC16554x70dcab5d2.f230768m.mo127746xb5885648();
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d.U6(this.f230950d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d3 = this.f230950d;
        activityC16554x70dcab5d3.getClass();
        di3.u.f314296a.m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u2(activityC16554x70dcab5d3));
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d4 = this.f230950d;
        activityC16554x70dcab5d4.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "start preview");
        fp.e eVar = activityC16554x70dcab5d4.f230782x0;
        if (eVar != null) {
            eVar.b();
        }
        activityC16554x70dcab5d4.H.setVisibility(0);
        activityC16554x70dcab5d4.H.setAlpha(0.0f);
        activityC16554x70dcab5d4.H.mo69327xab3268fe(activityC16554x70dcab5d4.f230768m.mo127744x5000ed37());
        activityC16554x70dcab5d4.H.mo69317x764cf626(true);
        activityC16554x70dcab5d4.H.m75828x772f3ddc(true);
        activityC16554x70dcab5d4.H.mo69326x360a109e(activityC16554x70dcab5d4.M1);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f230950d.L1, 1000L);
        int i17 = this.f230950d.V.f230358o;
        if (i17 == 1 || i17 == 2 || i17 == 7) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13819, 2, java.lang.Integer.valueOf(this.f230950d.V.f230358o), this.f230950d.V.f230360q, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
        }
    }
}
