package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes15.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.console.g f77664d;

    public f(com.tencent.mm.plugin.appbrand.debugger.console.g gVar) {
        this.f77664d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long elapsedRealtime = this.f77664d.f77670d - android.os.SystemClock.elapsedRealtime();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsoleDebugLogImpl", "run#flushLogBufferTask, remainDelayTime: " + elapsedRealtime);
        if (elapsedRealtime <= 0) {
            com.tencent.mm.plugin.appbrand.debugger.console.g.a(this.f77664d);
            return;
        }
        com.tencent.mm.plugin.appbrand.debugger.console.g gVar = this.f77664d;
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
        t0Var.getClass();
        gVar.f77671e = t0Var.t(this, elapsedRealtime, null);
    }
}
