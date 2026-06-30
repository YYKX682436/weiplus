package k0;

/* loaded from: classes14.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f384444d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f384445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f384446f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z.e f384447g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(n0.e5 e5Var, z.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f384446f = e5Var;
        this.f384447g = eVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        k0.g0 g0Var = new k0.g0(this.f384446f, this.f384447g, interfaceC29045xdcb5ca57);
        g0Var.f384445e = obj;
        return g0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((k0.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f384444d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f384445e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j f17 = n0.s4.f(new k0.d0(this.f384446f));
            k0.f0 f0Var = new k0.f0(this.f384447g, y0Var);
            this.f384444d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.b) f17).a(f0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
