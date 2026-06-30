package b0;

/* loaded from: classes14.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16342d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f16344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f16345g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0.y1 f16346h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u26.w f16347i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f16348m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f16349n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(n0.e5 e5Var, n0.e5 e5Var2, b0.y1 y1Var, u26.w wVar, boolean z17, kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16344f = e5Var;
        this.f16345g = e5Var2;
        this.f16346h = y1Var;
        this.f16347i = wVar;
        this.f16348m = z17;
        this.f16349n = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.i1 i1Var = new b0.i1(this.f16344f, this.f16345g, this.f16346h, this.f16347i, this.f16348m, this.f16349n, continuation);
        i1Var.f16343e = obj;
        return i1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.i1) create((p1.a0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16342d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p1.a0 a0Var = (p1.a0) this.f16343e;
            b0.h1 h1Var = new b0.h1(this.f16344f, this.f16345g, this.f16346h, this.f16347i, this.f16348m, this.f16349n, null);
            this.f16342d = 1;
            if (((p1.q0) a0Var).v(h1Var, this) == aVar) {
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
