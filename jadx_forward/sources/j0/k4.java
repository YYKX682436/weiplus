package j0;

/* loaded from: classes14.dex */
public final class k4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f377946d;

    /* renamed from: e, reason: collision with root package name */
    public int f377947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f377948f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f377949g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.o f377950h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(n0.v2 v2Var, boolean z17, c0.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f377948f = v2Var;
        this.f377949g = z17;
        this.f377950h = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new j0.k4(this.f377948f, this.f377949g, this.f377950h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((j0.k4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        n0.v2 v2Var;
        n0.v2 v2Var2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f377947e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            v2Var = this.f377948f;
            c0.r rVar = (c0.r) v2Var.mo128745x754a37bb();
            if (rVar != null) {
                c0.m sVar = this.f377949g ? new c0.s(rVar) : new c0.q(rVar);
                c0.o oVar = this.f377950h;
                if (oVar != null) {
                    this.f377946d = v2Var;
                    this.f377947e = 1;
                    if (((c0.p) oVar).a(sVar, this) == aVar) {
                        return aVar;
                    }
                    v2Var2 = v2Var;
                }
                v2Var.mo148714x53d8522f(null);
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        v2Var2 = (n0.v2) this.f377946d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        v2Var = v2Var2;
        v2Var.mo148714x53d8522f(null);
        return jz5.f0.f384359a;
    }
}
