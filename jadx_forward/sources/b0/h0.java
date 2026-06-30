package b0;

/* loaded from: classes14.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97843d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f97846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f97847h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f97848i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(yz5.l lVar, yz5.p pVar, yz5.a aVar, yz5.a aVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97845f = lVar;
        this.f97846g = pVar;
        this.f97847h = aVar;
        this.f97848i = aVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.h0 h0Var = new b0.h0(this.f97845f, this.f97846g, this.f97847h, this.f97848i, interfaceC29045xdcb5ca57);
        h0Var.f97844e = obj;
        return h0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.h0) mo148xaf65a0fc((p1.a0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97843d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p1.a0 a0Var = (p1.a0) this.f97844e;
            b0.g0 g0Var = new b0.g0(this.f97845f, this.f97846g, this.f97847h, this.f97848i, null);
            this.f97843d = 1;
            if (((p1.q0) a0Var).v(g0Var, this) == aVar) {
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
