package mx0;

/* loaded from: classes5.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f413865d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f413866e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f413867f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f413868g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f413869h;

    /* renamed from: i, reason: collision with root package name */
    public int f413870i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f413871m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f413872n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413873o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413874p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 f413875q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b f413876r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(mx0.e1 e1Var, yz5.l lVar, java.lang.String str, java.lang.String str2, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x74642117, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413871m = e1Var;
        this.f413872n = lVar;
        this.f413873o = str;
        this.f413874p = str2;
        this.f413875q = c4084x74642117;
        this.f413876r = c3978x9b06196b;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.t0(this.f413871m, this.f413872n, this.f413873o, this.f413874p, this.f413875q, this.f413876r, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.t0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413870i;
        mx0.e1 e1Var = this.f413871m;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str = this.f413873o;
            java.lang.String str2 = this.f413874p;
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x74642117 = this.f413875q;
            com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b = this.f413876r;
            this.f413865d = e1Var;
            this.f413866e = str;
            this.f413867f = str2;
            this.f413868g = c4084x74642117;
            this.f413869h = c3978x9b06196b;
            this.f413870i = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            e1Var.f413467a.h0(str, str2, c4084x74642117, c3978x9b06196b, new mx0.s0(nVar));
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        e1Var.f(booleanValue ? mx0.d0.f413436q : mx0.d0.f413426d);
        e1Var.f413474h = true;
        this.f413872n.mo146xb9724478(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}
