package v26;

/* loaded from: classes14.dex */
public final class l extends v26.g {

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j f514556g;

    /* renamed from: h, reason: collision with root package name */
    public final int f514557h;

    public l(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, int i17, oz5.l lVar, int i18, u26.u uVar) {
        super(lVar, i18, uVar);
        this.f514556g = jVar;
        this.f514557h = i17;
    }

    @Override // v26.g
    public java.lang.String c() {
        return "concurrency=" + this.f514557h;
    }

    @Override // v26.g
    public java.lang.Object f(u26.r0 r0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.m a17 = p3325xe03a0797.p3326xc267989b.p3332x361a9b.p.a(this.f514557h, 0, 2, null);
        v26.q0 q0Var = new v26.q0(r0Var);
        oz5.l mo48699x76847179 = interfaceC29045xdcb5ca57.mo48699x76847179();
        int i17 = p3325xe03a0797.p3326xc267989b.r2.O0;
        java.lang.Object a18 = this.f514556g.a(new v26.k((p3325xe03a0797.p3326xc267989b.r2) mo48699x76847179.get(p3325xe03a0797.p3326xc267989b.q2.f392104d), a17, r0Var, q0Var), interfaceC29045xdcb5ca57);
        return a18 == pz5.a.f440719d ? a18 : jz5.f0.f384359a;
    }

    @Override // v26.g
    public v26.g g(oz5.l lVar, int i17, u26.u uVar) {
        return new v26.l(this.f514556g, this.f514557h, lVar, i17, uVar);
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
