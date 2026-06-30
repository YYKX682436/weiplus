package l0;

/* loaded from: classes14.dex */
public final class r implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.i0 f396026d;

    public r(x0.i0 i0Var) {
        this.f396026d = i0Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        c0.m mVar = (c0.m) obj;
        boolean z17 = mVar instanceof c0.i;
        x0.i0 i0Var = this.f396026d;
        if (z17) {
            i0Var.add(mVar);
        } else if (mVar instanceof c0.j) {
            i0Var.remove(((c0.j) mVar).f118468a);
        } else if (mVar instanceof c0.d) {
            i0Var.add(mVar);
        } else if (mVar instanceof c0.e) {
            i0Var.remove(((c0.e) mVar).f118462a);
        } else if (mVar instanceof c0.r) {
            i0Var.add(mVar);
        } else if (mVar instanceof c0.s) {
            i0Var.remove(((c0.s) mVar).f118477a);
        } else if (mVar instanceof c0.q) {
            i0Var.remove(((c0.q) mVar).f118475a);
        }
        return jz5.f0.f384359a;
    }
}
