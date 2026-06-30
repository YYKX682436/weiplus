package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f283713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f283715f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f283716g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.a3 f283717h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f283718i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f283719m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n f283720n;

    public e(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n nVar, int i17, int i18, java.util.List list, java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f283720n = nVar;
        this.f283713d = i17;
        this.f283714e = i18;
        this.f283715f = list;
        this.f283716g = map;
        this.f283717h = a3Var;
        this.f283718i = concurrentLinkedQueue;
        this.f283719m = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l r17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n nVar = this.f283720n;
        java.util.concurrent.CountDownLatch countDownLatch = this.f283719m;
        try {
            for (int i17 = this.f283713d; i17 < this.f283714e && !nVar.f283885s.get(); i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f283716g.get(java.lang.Long.valueOf(((java.lang.Long) this.f283715f.get(i17)).longValue()));
                if (f9Var != null && (r17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n.r(nVar, f9Var, this.f283717h)) != null) {
                    this.f283718i.add(r17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
