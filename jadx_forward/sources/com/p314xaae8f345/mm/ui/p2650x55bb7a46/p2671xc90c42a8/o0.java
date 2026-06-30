package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f283913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f283915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f283916g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.a3 f283917h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f283918i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f283919m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 f283920n;

    public o0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 z0Var, int i17, int i18, java.util.List list, java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f283920n = z0Var;
        this.f283913d = i17;
        this.f283914e = i18;
        this.f283915f = list;
        this.f283916g = map;
        this.f283917h = a3Var;
        this.f283918i = concurrentLinkedQueue;
        this.f283919m = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w0 p17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0 z0Var = this.f283920n;
        java.util.concurrent.CountDownLatch countDownLatch = this.f283919m;
        try {
            for (int i17 = this.f283913d; i17 < this.f283914e && !z0Var.f284105s.get(); i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f283916g.get(java.lang.Long.valueOf(((java.lang.Long) this.f283915f.get(i17)).longValue()));
                if (f9Var != null && (p17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z0.p(z0Var, f9Var, this.f283917h)) != null) {
                    this.f283918i.add(p17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
