package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f172169d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f172170e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f172171f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f172172g;

    public z3(java.lang.Runnable runnable, int i17, java.lang.Runnable runnable2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runnable, "runnable");
        this.f172169d = runnable;
        this.f172170e = runnable2;
        this.f172172g = new java.util.concurrent.atomic.AtomicInteger(i17);
    }

    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("countdown, curCount: ");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f172172g;
        sb6.append(atomicInteger.decrementAndGet());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OneshotCancelableCountDownAbleRunnable", sb6.toString());
        if (atomicInteger.get() <= 0) {
            run();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!(this.f172172g.get() <= 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OneshotCancelableCountDownAbleRunnable", "run, reach0 is false, just return");
        } else if (this.f172171f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OneshotCancelableCountDownAbleRunnable", "run, hasRun");
        } else {
            this.f172169d.run();
            this.f172171f = true;
        }
    }
}
