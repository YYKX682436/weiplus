package b0;

/* loaded from: classes14.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.r f98000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.k2 f98001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f98002g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(b0.r rVar, a0.k2 k2Var, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f98000e = rVar;
        this.f98001f = k2Var;
        this.f98002g = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b0.p(this.f98000e, this.f98001f, this.f98002g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97999d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b0.r rVar = this.f98000e;
            a0.n2 n2Var = rVar.f98021c;
            b0.p2 p2Var = rVar.f98020b;
            b0.o oVar = new b0.o(rVar, this.f98002g, null);
            this.f97999d = 1;
            a0.k2 k2Var = this.f98001f;
            n2Var.getClass();
            if (p3325xe03a0797.p3326xc267989b.z0.f(new a0.m2(k2Var, n2Var, oVar, p2Var, null), this) == aVar) {
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
