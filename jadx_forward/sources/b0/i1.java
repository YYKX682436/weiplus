package b0;

/* loaded from: classes14.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97875d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f97877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f97878g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0.y1 f97879h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u26.w f97880i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f97881m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f97882n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(n0.e5 e5Var, n0.e5 e5Var2, b0.y1 y1Var, u26.w wVar, boolean z17, p3325xe03a0797.p3326xc267989b.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97877f = e5Var;
        this.f97878g = e5Var2;
        this.f97879h = y1Var;
        this.f97880i = wVar;
        this.f97881m = z17;
        this.f97882n = y0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.i1 i1Var = new b0.i1(this.f97877f, this.f97878g, this.f97879h, this.f97880i, this.f97881m, this.f97882n, interfaceC29045xdcb5ca57);
        i1Var.f97876e = obj;
        return i1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.i1) mo148xaf65a0fc((p1.a0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97875d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p1.a0 a0Var = (p1.a0) this.f97876e;
            b0.h1 h1Var = new b0.h1(this.f97877f, this.f97878g, this.f97879h, this.f97880i, this.f97881m, this.f97882n, null);
            this.f97875d = 1;
            if (((p1.q0) a0Var).v(h1Var, this) == aVar) {
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
