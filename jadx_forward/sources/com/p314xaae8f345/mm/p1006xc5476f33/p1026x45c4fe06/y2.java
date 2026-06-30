package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class y2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f173936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3 f173937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f173938f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f3 f173939g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f173940h;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g3 g3Var, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f3 f3Var) {
        this.f173940h = c11510xdd90c2f2;
        this.f173936d = concurrentLinkedQueue;
        this.f173937e = g3Var;
        this.f173938f = atomicBoolean;
        this.f173939g = f3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f3
    public void a() {
        if (!this.f173936d.remove(this.f173937e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntime", "AppBrandRuntime[%s].prepare() duplicate ready() called, PrepareProcess[%s]", this.f173940h.f156336n, this.f173937e);
            return;
        }
        this.f173940h.K("prepare() PrepareProcess[%s] done", this.f173937e);
        if (this.f173936d.isEmpty() && this.f173938f.compareAndSet(false, true)) {
            this.f173939g.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f173940h;
            java.util.concurrent.ExecutorService executorService = c11510xdd90c2f2.M1;
            if (executorService == null || ((ku5.f) executorService).isShutdown()) {
                return;
            }
            ((ku5.f) c11510xdd90c2f2.M1).shutdownNow();
        }
    }
}
