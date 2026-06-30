package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f206915d;

    public u1(int i17) {
        this.f206915d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206932g;
        int i17 = this.f206915d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r1 r1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r1) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (r1Var == null) {
            r1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.e(i17);
        }
        boolean z17 = false;
        if (r1Var != null && r1Var.f206830d > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLoadingTimeReporter", "reportViewPagerFirsFrameTime: tabType=" + i17 + " viewPagerFirstFrameCost=" + (c01.id.c() - r1Var.f206830d) + "ms");
            r1Var.f206849m0 = c01.id.c() - r1Var.f206830d;
            z17 = true;
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLoadingTimeReporter", "reportViewPagerFirsFrameTime: report failed, tabType=" + i17);
    }
}
