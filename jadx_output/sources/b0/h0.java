package b0;

/* loaded from: classes14.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16310d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16312f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f16313g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f16314h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f16315i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(yz5.l lVar, yz5.p pVar, yz5.a aVar, yz5.a aVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16312f = lVar;
        this.f16313g = pVar;
        this.f16314h = aVar;
        this.f16315i = aVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.h0 h0Var = new b0.h0(this.f16312f, this.f16313g, this.f16314h, this.f16315i, continuation);
        h0Var.f16311e = obj;
        return h0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.h0) create((p1.a0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16310d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p1.a0 a0Var = (p1.a0) this.f16311e;
            b0.g0 g0Var = new b0.g0(this.f16312f, this.f16313g, this.f16314h, this.f16315i, null);
            this.f16310d = 1;
            if (((p1.q0) a0Var).v(g0Var, this) == aVar) {
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
