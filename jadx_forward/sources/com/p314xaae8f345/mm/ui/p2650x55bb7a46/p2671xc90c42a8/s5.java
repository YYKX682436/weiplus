package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class s5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f283994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f283996f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f283997g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.a3 f283998h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f283999i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f284000m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 f284001n;

    public s5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 b6Var, int i17, int i18, java.util.List list, java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f284001n = b6Var;
        this.f283994d = i17;
        this.f283995e = i18;
        this.f283996f = list;
        this.f283997g = map;
        this.f283998h = a3Var;
        this.f283999i = concurrentLinkedQueue;
        this.f284000m = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z5 p17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 b6Var = this.f284001n;
        java.util.concurrent.CountDownLatch countDownLatch = this.f284000m;
        try {
            for (int i17 = this.f283994d; i17 < this.f283995e && !b6Var.f283672s.get(); i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f283997g.get(java.lang.Long.valueOf(((java.lang.Long) this.f283996f.get(i17)).longValue()));
                if (f9Var != null && (p17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6.p(b6Var, f9Var, this.f283998h)) != null) {
                    this.f283999i.add(p17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
