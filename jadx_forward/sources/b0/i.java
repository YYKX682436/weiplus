package b0;

/* loaded from: classes14.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.k f97871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.k2 f97872f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f97873g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b0.k kVar, a0.k2 k2Var, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97871e = kVar;
        this.f97872f = k2Var;
        this.f97873g = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b0.i(this.f97871e, this.f97872f, this.f97873g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97870d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b0.k kVar = this.f97871e;
            a0.n2 n2Var = kVar.f97908c;
            b0.u0 u0Var = kVar.f97907b;
            this.f97870d = 1;
            a0.k2 k2Var = this.f97872f;
            yz5.p pVar = this.f97873g;
            n2Var.getClass();
            if (p3325xe03a0797.p3326xc267989b.z0.f(new a0.m2(k2Var, n2Var, pVar, u0Var, null), this) == aVar) {
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
