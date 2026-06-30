package a50;

/* loaded from: classes9.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f83065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f83066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f83067f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a50.a0 a0Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f83066e = a0Var;
        this.f83067f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a50.s(this.f83066e, this.f83067f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a50.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f83065d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2621x8fb0427b.y2 y2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z2.f277923a;
            this.f83065d = 1;
            obj = y2Var.a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.q(new a50.r(this.f83066e, this.f83067f, (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.d1) obj));
        return jz5.f0.f384359a;
    }
}
