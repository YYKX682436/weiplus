package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f90636d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f90637e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f90638f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f90639g;

    public z3(java.lang.Runnable runnable, int i17, java.lang.Runnable runnable2) {
        kotlin.jvm.internal.o.g(runnable, "runnable");
        this.f90636d = runnable;
        this.f90637e = runnable2;
        this.f90639g = new java.util.concurrent.atomic.AtomicInteger(i17);
    }

    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("countdown, curCount: ");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f90639g;
        sb6.append(atomicInteger.decrementAndGet());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OneshotCancelableCountDownAbleRunnable", sb6.toString());
        if (atomicInteger.get() <= 0) {
            run();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!(this.f90639g.get() <= 0)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OneshotCancelableCountDownAbleRunnable", "run, reach0 is false, just return");
        } else if (this.f90638f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OneshotCancelableCountDownAbleRunnable", "run, hasRun");
        } else {
            this.f90636d.run();
            this.f90638f = true;
        }
    }
}
