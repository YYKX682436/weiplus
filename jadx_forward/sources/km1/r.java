package km1;

/* loaded from: classes7.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f390558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f390559e;

    public r(km1.s sVar, int i17) {
        this.f390558d = sVar;
        this.f390559e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        km1.s sVar = this.f390558d;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = sVar.f390578y;
        int i17 = this.f390559e;
        if (atomicInteger.compareAndSet(i17, 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f390562f, "stopCustomVideoCaptureIfNeed, release the existBuffer");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h0 r17 = sVar.r();
            if (r17 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) r17).a0(i17);
            }
        }
    }
}
