package ly0;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ly0.n f403747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ly0.o f403748e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ly0.n nVar, ly0.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f403747d = nVar;
        this.f403748e = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ly0.m(this.f403747d, this.f403748e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ly0.m mVar = (ly0.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        mVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ky0.a aVar;
        pz5.a aVar2 = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ky0.b bVar = ky0.b.f394985a;
        int ordinal = this.f403747d.f403749a.ordinal();
        if (ordinal == 0) {
            aVar = ky0.a.f394982d;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            aVar = ky0.a.f394983e;
        }
        bVar.a(aVar, this.f403747d.f403757i);
        this.f403747d.f403752d = ly0.e.f403725e;
        ly0.d dVar = (ly0.d) p3325xe03a0797.p3326xc267989b.l.f(null, new ly0.l(this.f403747d, null), 1, null);
        this.f403747d.f403754f = dVar;
        if (dVar.f403722c <= 0 || dVar.f403723d <= 0) {
            this.f403747d.f403752d = ly0.e.f403726f;
        } else {
            this.f403747d.f403752d = ly0.e.f403727g;
            ly0.n nVar = this.f403747d;
            nVar.getClass();
            nVar.f403755g = p3325xe03a0797.p3326xc267989b.l.d(nVar.f403753e, nVar.f403760l, null, new ly0.j(new ly0.h(dVar, nVar, null), null), 2, null);
            ly0.o oVar = this.f403748e;
            if (oVar != null) {
                oVar.b();
            }
        }
        this.f403747d.getClass();
        return jz5.f0.f384359a;
    }
}
