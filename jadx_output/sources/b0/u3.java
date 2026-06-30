package b0;

/* loaded from: classes14.dex */
public final class u3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16548d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.h2 f16550f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f16551g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16552h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(b0.h2 h2Var, yz5.q qVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16550f = h2Var;
        this.f16551g = qVar;
        this.f16552h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.u3 u3Var = new b0.u3(this.f16550f, this.f16551g, this.f16552h, continuation);
        u3Var.f16549e = obj;
        return u3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.u3) create((p1.a0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16548d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            b0.t3 t3Var = new b0.t3(this.f16550f, (p1.a0) this.f16549e, this.f16551g, this.f16552h, null);
            this.f16548d = 1;
            if (kotlinx.coroutines.z0.f(t3Var, this) == aVar) {
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
