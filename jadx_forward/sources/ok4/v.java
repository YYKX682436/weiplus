package ok4;

/* loaded from: classes4.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ok4.w f427576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ok4.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f427576d = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ok4.v(this.f427576d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ok4.v vVar = (ok4.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        vVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ok4.w wVar = this.f427576d;
        if (com.p314xaae8f345.mm.vfs.w6.j(wVar.f427592p) && (d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(wVar.f427592p, true)) != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc c6953x6177b4fc = wVar.f427577a;
            c6953x6177b4fc.L = d17.f243921g;
            c6953x6177b4fc.M = d17.f243920f;
            c6953x6177b4fc.f142576J = d17.f243922h;
            c6953x6177b4fc.C = d17.f243916b;
            c6953x6177b4fc.G = d17.f243915a;
            c6953x6177b4fc.E = d17.f243917c;
            c6953x6177b4fc.F = d17.f243918d;
            c6953x6177b4fc.H = d17.f243919e;
            c6953x6177b4fc.f142583e0 = c6953x6177b4fc.b("VideoCodeCTAG", d17.f243934t, true);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc c6953x6177b4fc2 = wVar.f427577a;
            c6953x6177b4fc2.f142585f0 = c6953x6177b4fc2.b("AudioCodeCTAG", d17.f243933s, true);
            if (d17.f243927m) {
                wVar.f427577a.D = 1L;
            } else if (t21.u2.b(wVar.f427592p)) {
                wVar.f427577a.D = 2L;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc c6953x6177b4fc3 = wVar.f427577a;
            if (c6953x6177b4fc3.f142587h <= 0) {
                c6953x6177b4fc3.f142587h = com.p314xaae8f345.mm.vfs.w6.k(wVar.f427592p);
            }
        }
        wVar.f427577a.k();
        return jz5.f0.f384359a;
    }
}
