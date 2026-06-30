package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f283724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l2 f283726f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f283727g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f283728h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f283729i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.a3 f283730m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f283731n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f283732o;

    public e2(int i17, int i18, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l2 l2Var, java.util.Map map, java.util.List list, boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f283724d = i17;
        this.f283725e = i18;
        this.f283726f = l2Var;
        this.f283727g = map;
        this.f283728h = list;
        this.f283729i = z17;
        this.f283730m = a3Var;
        this.f283731n = concurrentLinkedQueue;
        this.f283732o = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a2 p17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l2 l2Var = this.f283726f;
        java.util.concurrent.CountDownLatch countDownLatch = this.f283732o;
        try {
            for (int i17 = this.f283724d; i17 < this.f283725e && !l2Var.f283857s.get(); i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f283727g.get(this.f283728h.get(i17));
                if (f9Var != null && (p17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l2.p(l2Var, f9Var, this.f283729i, this.f283730m)) != null) {
                    this.f283731n.add(p17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
