package h0;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f359320d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f359321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f359322f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.o f359323g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f359324h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f359325i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f359326m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z17, c0.o oVar, n0.v2 v2Var, n0.e5 e5Var, n0.e5 e5Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f359322f = z17;
        this.f359323g = oVar;
        this.f359324h = v2Var;
        this.f359325i = e5Var;
        this.f359326m = e5Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        h0.f fVar = new h0.f(this.f359322f, this.f359323g, this.f359324h, this.f359325i, this.f359326m, interfaceC29045xdcb5ca57);
        fVar.f359321e = obj;
        return fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((h0.f) mo148xaf65a0fc((p1.a0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f359320d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p1.a0 a0Var = (p1.a0) this.f359321e;
            h0.d dVar = new h0.d(this.f359322f, this.f359323g, this.f359324h, this.f359325i, null);
            h0.e eVar = new h0.e(this.f359322f, this.f359326m);
            this.f359320d = 1;
            if (b0.d4.d(a0Var, dVar, eVar, this) == aVar) {
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
