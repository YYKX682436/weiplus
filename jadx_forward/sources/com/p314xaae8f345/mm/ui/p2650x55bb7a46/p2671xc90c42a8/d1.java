package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f283693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f283694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1 f283695f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f283696g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f283697h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f283698i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f283699m;

    public d1(int i17, int i18, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1 o1Var, java.util.Map map, java.util.List list, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f283693d = i17;
        this.f283694e = i18;
        this.f283695f = o1Var;
        this.f283696g = map;
        this.f283697h = list;
        this.f283698i = concurrentLinkedQueue;
        this.f283699m = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.bu2 c17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1 o1Var = this.f283695f;
        java.util.concurrent.CountDownLatch countDownLatch = this.f283699m;
        try {
            for (int i17 = this.f283693d; i17 < this.f283694e && !o1Var.f283927m.get(); i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f283696g.get(this.f283697h.get(i17));
                if (f9Var != null && (c17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o1.c(o1Var, f9Var)) != null) {
                    this.f283698i.add(c17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
