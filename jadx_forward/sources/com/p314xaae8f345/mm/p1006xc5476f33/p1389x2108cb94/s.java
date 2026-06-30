package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* loaded from: classes13.dex */
public class s implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r.a f181307d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.t tVar, r.a aVar) {
        this.f181307d = aVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        boolean z17;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        while (true) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.f181284a) {
                z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.f181286c != null;
            }
            if (z17) {
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.d()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.r(this));
                    return null;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exp.ExpansionsGlobal", "expansions is ready");
                this.f181307d.mo1850x58b836e(java.lang.Boolean.TRUE);
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exp.ExpansionsGlobal", "expansions not ready for global, just wait");
            if (atomicInteger.getAndIncrement() >= 3) {
                throw new java.util.concurrent.TimeoutException("wait for global timeout");
            }
            java.lang.Thread.sleep(1000L);
        }
    }
}
