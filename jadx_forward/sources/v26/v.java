package v26;

/* loaded from: classes14.dex */
public final class v extends v26.g {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Iterable f514602g;

    public v(java.lang.Iterable iterable, oz5.l lVar, int i17, u26.u uVar) {
        super(lVar, i17, uVar);
        this.f514602g = iterable;
    }

    @Override // v26.g
    public java.lang.Object f(u26.r0 r0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        v26.q0 q0Var = new v26.q0(r0Var);
        java.util.Iterator it = this.f514602g.iterator();
        while (it.hasNext()) {
            p3325xe03a0797.p3326xc267989b.l.d(r0Var, null, null, new v26.u((p3325xe03a0797.p3326xc267989b.p3328x30012e.j) it.next(), q0Var, null), 3, null);
        }
        return jz5.f0.f384359a;
    }

    @Override // v26.g
    public v26.g g(oz5.l lVar, int i17, u26.u uVar) {
        return new v26.v(this.f514602g, lVar, i17, uVar);
    }

    @Override // v26.g
    public u26.t0 i(p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        yz5.p fVar = new v26.f(this, null);
        u26.u uVar = u26.u.SUSPEND;
        p3325xe03a0797.p3326xc267989b.a1 a1Var = p3325xe03a0797.p3326xc267989b.a1.DEFAULT;
        u26.q0 q0Var = new u26.q0(p3325xe03a0797.p3326xc267989b.m0.b(y0Var, this.f514535d), u26.z.a(this.f514536e, uVar, null, 4, null));
        q0Var.j0(a1Var, q0Var, fVar);
        return q0Var;
    }
}
