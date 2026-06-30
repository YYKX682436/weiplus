package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class d5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f283705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m5 f283707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f283708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f283709h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.a3 f283710i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f283711m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f283712n;

    public d5(int i17, int i18, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m5 m5Var, java.util.List list, java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f283705d = i17;
        this.f283706e = i18;
        this.f283707f = m5Var;
        this.f283708g = list;
        this.f283709h = map;
        this.f283710i = a3Var;
        this.f283711m = concurrentLinkedQueue;
        this.f283712n = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z4 p17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m5 m5Var = this.f283707f;
        java.util.concurrent.CountDownLatch countDownLatch = this.f283712n;
        try {
            for (int i17 = this.f283705d; i17 < this.f283706e && !m5Var.f283881s.get(); i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f283709h.get(java.lang.Long.valueOf(((java.lang.Number) this.f283708g.get(i17)).longValue()));
                if (f9Var != null && (p17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m5.p(m5Var, f9Var, this.f283710i)) != null) {
                    this.f283711m.add(p17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
