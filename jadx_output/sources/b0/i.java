package b0;

/* loaded from: classes14.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.k f16338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.k2 f16339f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f16340g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b0.k kVar, a0.k2 k2Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16338e = kVar;
        this.f16339f = k2Var;
        this.f16340g = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b0.i(this.f16338e, this.f16339f, this.f16340g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16337d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            b0.k kVar = this.f16338e;
            a0.n2 n2Var = kVar.f16375c;
            b0.u0 u0Var = kVar.f16374b;
            this.f16337d = 1;
            a0.k2 k2Var = this.f16339f;
            yz5.p pVar = this.f16340g;
            n2Var.getClass();
            if (kotlinx.coroutines.z0.f(new a0.m2(k2Var, n2Var, pVar, u0Var, null), this) == aVar) {
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
