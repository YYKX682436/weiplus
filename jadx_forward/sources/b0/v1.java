package b0;

/* loaded from: classes14.dex */
public final class v1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f98094d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f98095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.w1 f98096f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f98097g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(b0.w1 w1Var, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f98096f = w1Var;
        this.f98097g = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.v1 v1Var = new b0.v1(this.f98096f, this.f98097g, interfaceC29045xdcb5ca57);
        v1Var.f98095e = obj;
        return v1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.v1) mo148xaf65a0fc((b0.u0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f98094d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b0.u0 u0Var = (b0.u0) this.f98095e;
            b0.w1 w1Var = this.f98096f;
            w1Var.f98106b = u0Var;
            this.f98094d = 1;
            if (this.f98097g.mo149xb9724478(w1Var, this) == aVar) {
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
