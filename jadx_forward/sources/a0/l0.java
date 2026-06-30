package a0;

/* loaded from: classes14.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f81739d;

    /* renamed from: e, reason: collision with root package name */
    public int f81740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f81741f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.o f81742g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0.v2 v2Var, c0.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f81741f = v2Var;
        this.f81742g = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a0.l0(this.f81741f, this.f81742g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.l0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        n0.v2 v2Var;
        n0.v2 v2Var2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f81740e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            v2Var = this.f81741f;
            c0.d dVar = (c0.d) v2Var.mo128745x754a37bb();
            if (dVar != null) {
                c0.e eVar = new c0.e(dVar);
                c0.o oVar = this.f81742g;
                if (oVar != null) {
                    this.f81739d = v2Var;
                    this.f81740e = 1;
                    if (((c0.p) oVar).a(eVar, this) == aVar) {
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
        v2Var2 = (n0.v2) this.f81739d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        v2Var = v2Var2;
        v2Var.mo148714x53d8522f(null);
        return jz5.f0.f384359a;
    }
}
