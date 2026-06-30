package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.scheduler.c f67674d;

    public a(com.tencent.mm.feature.performance.scheduler.c cVar) {
        this.f67674d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BgScheduler", "check for every 30min");
        com.tencent.mm.feature.performance.scheduler.c.wi(this.f67674d);
        ku5.u0 u0Var = ku5.t0.f312615d;
        long millis = java.util.concurrent.TimeUnit.MINUTES.toMillis(30L);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(this, millis, null);
    }
}
