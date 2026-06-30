package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f284015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f284016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f284017f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f284018g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.a3 f284019h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f284020i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f284021m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o3 f284022n;

    public t3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o3 o3Var, int i17, int i18, java.util.List list, java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f284022n = o3Var;
        this.f284015d = i17;
        this.f284016e = i18;
        this.f284017f = list;
        this.f284018g = map;
        this.f284019h = a3Var;
        this.f284020i = concurrentLinkedQueue;
        this.f284021m = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.a4 r17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o3 o3Var = this.f284022n;
        java.util.concurrent.CountDownLatch countDownLatch = this.f284021m;
        try {
            for (int i17 = this.f284015d; i17 < this.f284016e && !o3Var.f283939s.get(); i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f284018g.get(java.lang.Long.valueOf(((java.lang.Long) this.f284017f.get(i17)).longValue()));
                if (f9Var != null && (r17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o3.r(o3Var, f9Var, this.f284019h)) != null) {
                    this.f284020i.add(r17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
