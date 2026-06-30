package com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47;

/* loaded from: classes12.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df f156231d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df activityC11503x9e50b8df) {
        this.f156231d = activityC11503x9e50b8df;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df.f156208p1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df activityC11503x9e50b8df = this.f156231d;
        activityC11503x9e50b8df.r7(4);
        int intExtra = activityC11503x9e50b8df.getIntent().getIntExtra("from_scene", 0);
        activityC11503x9e50b8df.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7001x77668b26 c7001x77668b26 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7001x77668b26();
        c7001x77668b26.f143160d = c7001x77668b26.b("ChatName", activityC11503x9e50b8df.K, true);
        c7001x77668b26.f143163g = c01.e2.I(activityC11503x9e50b8df.K) ? 0L : 1L;
        c7001x77668b26.f143162f = activityC11503x9e50b8df.M;
        c7001x77668b26.f143165i = c7001x77668b26.b("NoticeId", "" + activityC11503x9e50b8df.W, true);
        if (activityC11503x9e50b8df.R) {
            j17 = 1;
        } else {
            j17 = activityC11503x9e50b8df.S ? 2 : 3;
        }
        c7001x77668b26.f143161e = j17;
        c7001x77668b26.f143166j = activityC11503x9e50b8df.p7() ? 0L : 1L;
        c7001x77668b26.f143164h = intExtra;
        c7001x77668b26.k();
        activityC11503x9e50b8df.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.j(this));
    }
}
