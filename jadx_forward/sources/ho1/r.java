package ho1;

/* loaded from: classes15.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f364328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364329e;

    public r(ho1.v vVar, long j17) {
        this.f364328d = vVar;
        this.f364329e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ho1.v vVar = this.f364328d;
        vVar.f364366e = null;
        ro1.g gVar = vVar.f364364c;
        long j17 = this.f364329e;
        if (gVar != null) {
            if (gVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mUDiskChannel");
                throw null;
            }
            if (gVar.mo162784xcde67f29()) {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var = vVar.f364369h;
                if (t0Var != null) {
                    t0Var.P(j17, 0);
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var2 = vVar.f364369h;
        if (t0Var2 != null) {
            t0Var2.P(j17, -1);
        }
    }
}
