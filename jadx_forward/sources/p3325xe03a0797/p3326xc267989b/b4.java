package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class b4 extends p3325xe03a0797.p3326xc267989b.p0 {

    /* renamed from: e, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.b4 f391678e = new p3325xe03a0797.p3326xc267989b.b4();

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void D(oz5.l lVar, java.lang.Runnable runnable) {
        p3325xe03a0797.p3326xc267989b.f4 f4Var = (p3325xe03a0797.p3326xc267989b.f4) lVar.get(p3325xe03a0797.p3326xc267989b.f4.f391716e);
        if (f4Var == null) {
            throw new java.lang.UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        f4Var.f391717d = true;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public p3325xe03a0797.p3326xc267989b.p0 J(int i17) {
        throw new java.lang.UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    /* renamed from: toString */
    public java.lang.String mo143973x9616526c() {
        return "Dispatchers.Unconfined";
    }
}
