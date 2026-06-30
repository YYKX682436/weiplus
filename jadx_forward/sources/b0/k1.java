package b0;

/* loaded from: classes14.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97911d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f97913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f97914g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f97915h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0.y1 f97916i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u26.w f97917m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f97918n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(boolean z17, n0.e5 e5Var, n0.e5 e5Var2, b0.y1 y1Var, u26.w wVar, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97913f = z17;
        this.f97914g = e5Var;
        this.f97915h = e5Var2;
        this.f97916i = y1Var;
        this.f97917m = wVar;
        this.f97918n = z18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.k1 k1Var = new b0.k1(this.f97913f, this.f97914g, this.f97915h, this.f97916i, this.f97917m, this.f97918n, interfaceC29045xdcb5ca57);
        k1Var.f97912e = obj;
        return k1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.k1) mo148xaf65a0fc((p1.a0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97911d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p1.a0 a0Var = (p1.a0) this.f97912e;
            if (!this.f97913f) {
                return f0Var;
            }
            b0.j1 j1Var = new b0.j1(a0Var, this.f97914g, this.f97915h, this.f97916i, this.f97917m, this.f97918n, null);
            this.f97911d = 1;
            if (p3325xe03a0797.p3326xc267989b.z0.f(j1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
