package b0;

/* loaded from: classes14.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16378d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f16380f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f16381g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f16382h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0.y1 f16383i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u26.w f16384m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f16385n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(boolean z17, n0.e5 e5Var, n0.e5 e5Var2, b0.y1 y1Var, u26.w wVar, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16380f = z17;
        this.f16381g = e5Var;
        this.f16382h = e5Var2;
        this.f16383i = y1Var;
        this.f16384m = wVar;
        this.f16385n = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.k1 k1Var = new b0.k1(this.f16380f, this.f16381g, this.f16382h, this.f16383i, this.f16384m, this.f16385n, continuation);
        k1Var.f16379e = obj;
        return k1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.k1) create((p1.a0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16378d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p1.a0 a0Var = (p1.a0) this.f16379e;
            if (!this.f16380f) {
                return f0Var;
            }
            b0.j1 j1Var = new b0.j1(a0Var, this.f16381g, this.f16382h, this.f16383i, this.f16384m, this.f16385n, null);
            this.f16378d = 1;
            if (kotlinx.coroutines.z0.f(j1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
