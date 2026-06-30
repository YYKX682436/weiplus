package a0;

/* loaded from: classes14.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f310d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f312f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.o f313g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f314h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f315i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f316m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z17, c0.o oVar, n0.v2 v2Var, n0.e5 e5Var, n0.e5 e5Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312f = z17;
        this.f313g = oVar;
        this.f314h = v2Var;
        this.f315i = e5Var;
        this.f316m = e5Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        a0.v vVar = new a0.v(this.f312f, this.f313g, this.f314h, this.f315i, this.f316m, continuation);
        vVar.f311e = obj;
        return vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.v) create((p1.a0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p1.a0 a0Var = (p1.a0) this.f311e;
            a0.t tVar = new a0.t(this.f312f, this.f313g, this.f314h, this.f315i, null);
            a0.u uVar = new a0.u(this.f312f, this.f316m);
            this.f310d = 1;
            if (b0.d4.d(a0Var, tVar, uVar, this) == aVar) {
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
