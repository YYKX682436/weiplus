package dh2;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f313987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dh2.x f313988e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(dh2.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313988e = xVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dh2.o(this.f313988e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dh2.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f313987d;
        if (i17 != 0) {
            if (i17 == 1) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                throw new jz5.d();
            }
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        dh2.x xVar = this.f313988e;
        int ordinal = xVar.f314005i.ordinal();
        if (ordinal == 0) {
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = ((om2.e) xVar.f314001e.a(om2.e.class)).f427823f;
            dh2.l lVar = new dh2.l(xVar);
            this.f313987d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).a(lVar, this) == aVar) {
                return aVar;
            }
            throw new jz5.d();
        }
        if (ordinal == 1) {
            mm2.m6 m6Var = (mm2.m6) xVar.f314001e.a(mm2.m6.class);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.f2 f2Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.f2(m6Var.f410789x, m6Var.f410784s, new dh2.m(null));
            dh2.n nVar = new dh2.n(xVar);
            this.f313987d = 2;
            if (f2Var.a(nVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
