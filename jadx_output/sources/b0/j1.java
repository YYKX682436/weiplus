package b0;

/* loaded from: classes14.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16359d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1.a0 f16361f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f16362g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f16363h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0.y1 f16364i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u26.w f16365m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f16366n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(p1.a0 a0Var, n0.e5 e5Var, n0.e5 e5Var2, b0.y1 y1Var, u26.w wVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16361f = a0Var;
        this.f16362g = e5Var;
        this.f16363h = e5Var2;
        this.f16364i = y1Var;
        this.f16365m = wVar;
        this.f16366n = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.j1 j1Var = new b0.j1(this.f16361f, this.f16362g, this.f16363h, this.f16364i, this.f16365m, this.f16366n, continuation);
        j1Var.f16360e = obj;
        return j1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16359d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            b0.i1 i1Var = new b0.i1(this.f16362g, this.f16363h, this.f16364i, this.f16365m, this.f16366n, (kotlinx.coroutines.y0) this.f16360e, null);
            this.f16359d = 1;
            if (b0.u1.b(this.f16361f, i1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
