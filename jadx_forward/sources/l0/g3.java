package l0;

/* loaded from: classes14.dex */
public final class g3 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.i0 f395744d;

    public g3(x0.i0 i0Var) {
        this.f395744d = i0Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        c0.m mVar = (c0.m) obj;
        boolean z17 = mVar instanceof c0.r;
        x0.i0 i0Var = this.f395744d;
        if (z17) {
            i0Var.add(mVar);
        } else if (mVar instanceof c0.s) {
            i0Var.remove(((c0.s) mVar).f118477a);
        } else if (mVar instanceof c0.q) {
            i0Var.remove(((c0.q) mVar).f118475a);
        } else if (mVar instanceof c0.b) {
            i0Var.add(mVar);
        } else if (mVar instanceof c0.c) {
            i0Var.remove(((c0.c) mVar).f118461a);
        } else if (mVar instanceof c0.a) {
            i0Var.remove(((c0.a) mVar).f118460a);
        }
        return jz5.f0.f384359a;
    }
}
