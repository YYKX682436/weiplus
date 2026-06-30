package n0;

/* loaded from: classes14.dex */
public final class u4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f415250d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f415251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f415252f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f415253g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(yz5.p pVar, n0.v2 v2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f415252f = pVar;
        this.f415253g = v2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        n0.u4 u4Var = new n0.u4(this.f415252f, this.f415253g, interfaceC29045xdcb5ca57);
        u4Var.f415251e = obj;
        return u4Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((n0.u4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f415250d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            n0.g3 g3Var = new n0.g3(this.f415253g, ((p3325xe03a0797.p3326xc267989b.y0) this.f415251e).getF93115e());
            this.f415250d = 1;
            if (this.f415252f.mo149xb9724478(g3Var, this) == aVar) {
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
