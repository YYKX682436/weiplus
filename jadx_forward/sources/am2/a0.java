package am2;

/* loaded from: classes10.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f90157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ am2.s0 f90158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.u4 f90159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.wy f90160g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(am2.s0 s0Var, dk2.u4 u4Var, df2.wy wyVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f90158e = s0Var;
        this.f90159f = u4Var;
        this.f90160g = wyVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new am2.a0(this.f90158e, this.f90159f, this.f90160g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((am2.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.List<km2.k> list;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f90157d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        do {
            am2.s0 s0Var = this.f90158e;
            boolean z17 = !s0Var.f90277d.isEmpty();
            df2.wy wyVar = this.f90160g;
            if (!z17) {
                wyVar.f313277u = false;
                return jz5.f0.f384359a;
            }
            r45.ja0 ja0Var = (r45.ja0) kz5.h0.C(s0Var.f90277d);
            dk2.u4 u4Var = this.f90159f;
            if (u4Var != null && (list = u4Var.f315692f) != null) {
                for (km2.k kVar : list) {
                    kVar.f390653g = 12345L;
                    kVar.f390652f = ja0Var;
                }
            }
            if (u4Var != null) {
                r45.gd2 gd2Var = new r45.gd2();
                gd2Var.set(4, java.lang.Long.valueOf(c01.id.e()));
                u4Var.f315697k = gd2Var;
            }
            wyVar.b7(u4Var);
            this.f90157d = 1;
        } while (p3325xe03a0797.p3326xc267989b.k1.b(5000L, this) != aVar);
        return aVar;
    }
}
