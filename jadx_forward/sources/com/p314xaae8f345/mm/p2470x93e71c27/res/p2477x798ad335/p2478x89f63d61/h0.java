package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61;

/* loaded from: classes12.dex */
public final class h0 extends com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n implements ob0.p2 {

    /* renamed from: c, reason: collision with root package name */
    public final ku5.f f271119c = new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j(this, "MicroMsg.ResDownloader.CheckResUpdate.DecryptExecutor", 0, Integer.MAX_VALUE, new java.util.concurrent.SynchronousQueue());

    public h0() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) ((ob0.q2) i95.n0.c(ob0.q2.class))).getClass();
        gi.i0 i0Var = gi.i0.f353587a;
        synchronized (i0Var.a()) {
            i0Var.a().add(this);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n
    public ku5.f c() {
        return this.f271119c;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n
    public com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.m e(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.k kVar) {
        return new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.g0((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.a) kVar);
    }

    public void g(boolean z17) {
        if (com.p314xaae8f345.mm.p849xbf8d97c1.c0.b(81) && z17 && !((java.util.concurrent.ConcurrentHashMap) this.f271225b).isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ResDownloader.CheckResUpdate.DecryptExecutor", "#onAppLowEnergy, cancel all bg tasks");
            com.p314xaae8f345.mm.p849xbf8d97c1.c0.a(81);
            b();
        }
    }
}
