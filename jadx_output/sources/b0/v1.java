package b0;

/* loaded from: classes14.dex */
public final class v1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16561d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.w1 f16563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f16564g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(b0.w1 w1Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16563f = w1Var;
        this.f16564g = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.v1 v1Var = new b0.v1(this.f16563f, this.f16564g, continuation);
        v1Var.f16562e = obj;
        return v1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.v1) create((b0.u0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16561d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            b0.u0 u0Var = (b0.u0) this.f16562e;
            b0.w1 w1Var = this.f16563f;
            w1Var.f16573b = u0Var;
            this.f16561d = 1;
            if (this.f16564g.invoke(w1Var, this) == aVar) {
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
