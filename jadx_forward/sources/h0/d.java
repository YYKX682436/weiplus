package h0;

/* loaded from: classes14.dex */
public final class d extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f359311d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f359312e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ long f359313f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f359314g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.o f359315h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f359316i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f359317m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z17, c0.o oVar, n0.v2 v2Var, n0.e5 e5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f359314g = z17;
        this.f359315h = oVar;
        this.f359316i = v2Var;
        this.f359317m = e5Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long j17 = ((d1.e) obj2).f307160a;
        h0.d dVar = new h0.d(this.f359314g, this.f359315h, this.f359316i, this.f359317m, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        dVar.f359312e = (b0.f2) obj;
        dVar.f359313f = j17;
        return dVar.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f359311d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b0.f2 f2Var = (b0.f2) this.f359312e;
            long j17 = this.f359313f;
            if (this.f359314g) {
                c0.o oVar = this.f359315h;
                n0.v2 v2Var = this.f359316i;
                n0.e5 e5Var = this.f359317m;
                this.f359311d = 1;
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
