package b0;

/* loaded from: classes14.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97983d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.r f97985f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f97986g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b0.r rVar, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97985f = rVar;
        this.f97986g = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.o oVar = new b0.o(this.f97985f, this.f97986g, interfaceC29045xdcb5ca57);
        oVar.f97984e = obj;
        return oVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.o) mo148xaf65a0fc((b0.p2) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97983d;
        b0.r rVar = this.f97985f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                b0.p2 p2Var = (b0.p2) this.f97984e;
                ((n0.q4) rVar.f98022d).mo148714x53d8522f(java.lang.Boolean.TRUE);
                yz5.p pVar = this.f97986g;
                this.f97983d = 1;
                if (pVar.mo149xb9724478(p2Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            ((n0.q4) rVar.f98022d).mo148714x53d8522f(java.lang.Boolean.FALSE);
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            ((n0.q4) rVar.f98022d).mo148714x53d8522f(java.lang.Boolean.FALSE);
            throw th6;
        }
    }
}
