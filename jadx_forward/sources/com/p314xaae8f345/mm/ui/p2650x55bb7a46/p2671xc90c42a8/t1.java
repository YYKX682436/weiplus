package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f284006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f284007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f284008f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f284009g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f284010h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f284011i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f284012m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1 f284013n;

    public t1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1 p1Var, int i17, int i18, java.util.Map map, java.util.List list, boolean z17, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f284013n = p1Var;
        this.f284006d = i17;
        this.f284007e = i18;
        this.f284008f = map;
        this.f284009g = list;
        this.f284010h = z17;
        this.f284011i = concurrentLinkedQueue;
        this.f284012m = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y1 q17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1 p1Var = this.f284013n;
        java.util.concurrent.CountDownLatch countDownLatch = this.f284012m;
        try {
            for (int i17 = this.f284006d; i17 < this.f284007e && !p1Var.f283952s.get(); i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f284008f.get(this.f284009g.get(i17));
                if (f9Var != null && (q17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p1.q(p1Var, f9Var, this.f284010h)) != null) {
                    this.f284011i.add(q17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
