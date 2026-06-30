package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes8.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f280346d;

    public r(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.s sVar, java.util.List list) {
        this.f280346d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = 0;
        int i17 = 0;
        while (true) {
            java.util.List list = this.f280346d;
            if (i17 >= list.size()) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6858x7a92a6b7 c6858x7a92a6b7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6858x7a92a6b7();
                c6858x7a92a6b7.f141768d = 1L;
                c6858x7a92a6b7.f141769e = c01.id.a();
                c6858x7a92a6b7.f141770f = j17;
                c6858x7a92a6b7.k();
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) list.get(i17);
            if (l4Var != null && !c01.e2.d(l4Var.h1()) && !c01.e2.Q(l4Var.h1())) {
                j17 += l4Var.d1();
            }
            i17++;
        }
    }
}
