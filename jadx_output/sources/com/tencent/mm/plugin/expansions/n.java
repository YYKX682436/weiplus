package com.tencent.mm.plugin.expansions;

/* loaded from: classes13.dex */
public class n implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r.a f99768d;

    public n(com.tencent.mm.plugin.expansions.ExpansionsGlobal$CP expansionsGlobal$CP, r.a aVar) {
        this.f99768d = aVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        boolean z17;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        while (true) {
            synchronized (com.tencent.mm.plugin.expansions.i0.f99751a) {
                z17 = com.tencent.mm.plugin.expansions.i0.f99753c != null;
            }
            if (z17) {
                if (!com.tencent.mm.plugin.expansions.i0.d()) {
                    com.tencent.mm.plugin.expansions.i0.c(new com.tencent.mm.plugin.expansions.m(this));
                    return null;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.exp.ExpansionsGlobal", "expansions is ready");
                this.f99768d.apply(1);
                return null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.exp.ExpansionsGlobal", "expansions not ready for global, just wait");
            if (atomicInteger.getAndIncrement() >= 3) {
                throw new java.util.concurrent.TimeoutException("wait for global timeout");
            }
            java.lang.Thread.sleep(1000L);
        }
    }
}
