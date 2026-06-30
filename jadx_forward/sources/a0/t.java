package a0;

/* loaded from: classes14.dex */
public final class t extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f81819d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f81820e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ long f81821f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f81822g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.o f81823h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f81824i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f81825m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z17, c0.o oVar, n0.v2 v2Var, n0.e5 e5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f81822g = z17;
        this.f81823h = oVar;
        this.f81824i = v2Var;
        this.f81825m = e5Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long j17 = ((d1.e) obj2).f307160a;
        a0.t tVar = new a0.t(this.f81822g, this.f81823h, this.f81824i, this.f81825m, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        tVar.f81820e = (b0.f2) obj;
        tVar.f81821f = j17;
        return tVar.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f81819d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b0.f2 f2Var = (b0.f2) this.f81820e;
            long j17 = this.f81821f;
            if (this.f81822g) {
                c0.o oVar = this.f81823h;
                n0.v2 v2Var = this.f81824i;
                n0.e5 e5Var = this.f81825m;
                this.f81819d = 1;
                java.lang.Object f17 = p3325xe03a0797.p3326xc267989b.z0.f(new a0.c0(f2Var, j17, oVar, v2Var, e5Var, null), this);
                if (f17 != aVar) {
                    f17 = f0Var;
                }
                if (f17 == aVar) {
                    return aVar;
                }
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
