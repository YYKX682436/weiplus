package qt;

/* loaded from: classes9.dex */
public final class c extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt.d f448020d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qt.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f448020d = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qt.c(this.f448020d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((qt.c) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        v05.b k17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        pt0.e0 e0Var = pt0.f0.f439742b1;
        qt.d dVar = this.f448020d;
        oi3.e eVar = dVar.f448021o.f493721j;
        java.lang.String m75945x2fec8307 = eVar != null ? eVar.m75945x2fec8307(eVar.f427150d + 3) : null;
        oi3.e eVar2 = dVar.f448021o.f493721j;
        boolean z17 = false;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k18 = e0Var.k(m75945x2fec8307, eVar2 != null ? eVar2.m75942xfb822ef2(eVar2.f427150d + 0) : 0L);
        if (k18 == null) {
            return null;
        }
        qi3.d0 d0Var = dVar.f448021o.f493726o;
        if (d0Var != null && d0Var.f445218c == 0) {
            if (d0Var != null && d0Var.f445219d == 0) {
                java.lang.Object obj2 = d0Var != null ? d0Var.f445222g : null;
                if ((obj2 instanceof r45.qy5 ? (r45.qy5) obj2 : null) != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(k18.Q0())) {
                    l15.c cVar = dVar.f448021o.f493713b;
                    if (cVar != null && (k17 = cVar.k()) != null && k17.m75939xb282bd08(k17.f513848e + 75) == 1) {
                        z17 = true;
                    }
                    if (z17) {
                        ((hn.h0) ((vg3.h4) i95.n0.c(vg3.h4.class))).getClass();
                        kn.j0.a(k18, ot0.q.v(k18.S1()));
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
