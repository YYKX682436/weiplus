package v26;

/* loaded from: classes14.dex */
public abstract class n extends v26.g {

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j f514567g;

    public n(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, oz5.l lVar, int i17, u26.u uVar) {
        super(lVar, i17, uVar);
        this.f514567g = jVar;
    }

    @Override // v26.g, p3325xe03a0797.p3326xc267989b.p3328x30012e.j
    public java.lang.Object a(p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object a17;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (this.f514536e == -3) {
            oz5.l mo48699x76847179 = interfaceC29045xdcb5ca57.mo48699x76847179();
            oz5.l mo7096x348d9a = mo48699x76847179.mo7096x348d9a(this.f514535d);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo7096x348d9a, mo48699x76847179)) {
                a17 = j(kVar, interfaceC29045xdcb5ca57);
                if (a17 != pz5.a.f440719d) {
                    return f0Var;
                }
            } else {
                int i17 = oz5.f.Y0;
                oz5.e eVar = oz5.e.f431860d;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo7096x348d9a.get(eVar), mo48699x76847179.get(eVar))) {
                    oz5.l mo48699x768471792 = interfaceC29045xdcb5ca57.mo48699x76847179();
                    if (!(kVar instanceof v26.q0 ? true : kVar instanceof v26.j0)) {
                        kVar = new v26.u0(kVar, mo48699x768471792);
                    }
                    a17 = v26.h.a(mo7096x348d9a, kVar, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.r0.b(mo7096x348d9a), new v26.m(this, null), interfaceC29045xdcb5ca57);
                    pz5.a aVar = pz5.a.f440719d;
                    if (a17 != aVar) {
                        a17 = f0Var;
                    }
                    if (a17 != aVar) {
                        return f0Var;
                    }
                }
            }
            return a17;
        }
        a17 = super.a(kVar, interfaceC29045xdcb5ca57);
        if (a17 != pz5.a.f440719d) {
            return f0Var;
        }
        return a17;
    }

    @Override // v26.g
    public java.lang.Object f(u26.r0 r0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object j17 = j(new v26.q0(r0Var), interfaceC29045xdcb5ca57);
        return j17 == pz5.a.f440719d ? j17 : jz5.f0.f384359a;
    }

    public abstract java.lang.Object j(p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    @Override // v26.g
    /* renamed from: toString */
    public java.lang.String mo144002x9616526c() {
        return this.f514567g + " -> " + super.mo144002x9616526c();
    }
}
