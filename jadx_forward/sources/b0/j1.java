package b0;

/* loaded from: classes14.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97892d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1.a0 f97894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f97895g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f97896h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0.y1 f97897i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u26.w f97898m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f97899n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(p1.a0 a0Var, n0.e5 e5Var, n0.e5 e5Var2, b0.y1 y1Var, u26.w wVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97894f = a0Var;
        this.f97895g = e5Var;
        this.f97896h = e5Var2;
        this.f97897i = y1Var;
        this.f97898m = wVar;
        this.f97899n = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.j1 j1Var = new b0.j1(this.f97894f, this.f97895g, this.f97896h, this.f97897i, this.f97898m, this.f97899n, interfaceC29045xdcb5ca57);
        j1Var.f97893e = obj;
        return j1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.j1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97892d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b0.i1 i1Var = new b0.i1(this.f97895g, this.f97896h, this.f97897i, this.f97898m, this.f97899n, (p3325xe03a0797.p3326xc267989b.y0) this.f97893e, null);
            this.f97892d = 1;
            if (b0.u1.b(this.f97894f, i1Var, this) == aVar) {
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
