package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class y2 implements com.tencent.mm.plugin.appbrand.f3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f92403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.g3 f92404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f92405f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.f3 f92406g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f92407h;

    public y2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, com.tencent.mm.plugin.appbrand.g3 g3Var, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.tencent.mm.plugin.appbrand.f3 f3Var) {
        this.f92407h = appBrandRuntime;
        this.f92403d = concurrentLinkedQueue;
        this.f92404e = g3Var;
        this.f92405f = atomicBoolean;
        this.f92406g = f3Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.f3
    public void a() {
        if (!this.f92403d.remove(this.f92404e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntime", "AppBrandRuntime[%s].prepare() duplicate ready() called, PrepareProcess[%s]", this.f92407h.f74803n, this.f92404e);
            return;
        }
        this.f92407h.K("prepare() PrepareProcess[%s] done", this.f92404e);
        if (this.f92403d.isEmpty() && this.f92405f.compareAndSet(false, true)) {
            this.f92406g.a();
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f92407h;
            java.util.concurrent.ExecutorService executorService = appBrandRuntime.M1;
            if (executorService == null || ((ku5.f) executorService).isShutdown()) {
                return;
            }
            ((ku5.f) appBrandRuntime.M1).shutdownNow();
        }
    }
}
