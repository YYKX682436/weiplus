package vm5;

/* loaded from: classes10.dex */
public final class f implements com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25832xf9968465 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f519687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f519688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vm5.g f519689c;

    public f(long j17, long j18, vm5.g gVar) {
        this.f519687a = j17;
        this.f519688b = j18;
        this.f519689c = gVar;
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25832xf9968465
    /* renamed from: call */
    public final void mo98027x2e7a5e() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f519687a;
        xm5.b.c("VideoCompositionPlayer", "seekTo:" + this.f519688b + " completed", new java.lang.Object[0]);
        vm5.c cVar = this.f519689c.f519699j;
        if (cVar != null) {
            java.util.ArrayList arrayList = ((bp4.e0) cVar).f104682a.f104751q.f382565a;
            if (arrayList.size() < 50) {
                arrayList.add(java.lang.Long.valueOf(currentTimeMillis));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.B(1468L, 1L);
            g0Var.C(1468L, 2L, currentTimeMillis);
            if (currentTimeMillis <= 30) {
                g0Var.B(1468L, 4L);
                return;
            }
            if (currentTimeMillis <= 100) {
                g0Var.B(1468L, 5L);
                return;
            }
            if (currentTimeMillis <= 500) {
                g0Var.B(1468L, 6L);
            } else if (currentTimeMillis <= 1000) {
                g0Var.B(1468L, 7L);
            } else {
                g0Var.B(1468L, 8L);
            }
        }
    }
}
