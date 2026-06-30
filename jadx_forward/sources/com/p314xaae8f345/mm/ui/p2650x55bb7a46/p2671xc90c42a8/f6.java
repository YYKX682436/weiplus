package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class f6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f283748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f283750f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f283751g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.a3 f283752h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f283753i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f283754m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c6 f283755n;

    public f6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c6 c6Var, int i17, int i18, java.util.Map map, java.util.List list, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f283755n = c6Var;
        this.f283748d = i17;
        this.f283749e = i18;
        this.f283750f = map;
        this.f283751g = list;
        this.f283752h = a3Var;
        this.f283753i = concurrentLinkedQueue;
        this.f283754m = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n6 p17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c6 c6Var = this.f283755n;
        java.util.concurrent.CountDownLatch countDownLatch = this.f283754m;
        try {
            for (int i17 = this.f283748d; i17 < this.f283749e && !c6Var.f283685t.get(); i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f283750f.get(this.f283751g.get(i17));
                if (f9Var != null && (p17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c6.p(c6Var, f9Var, this.f283752h)) != null) {
                    this.f283753i.add(p17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
