package b0;

/* loaded from: classes14.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.r f16467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0.k2 f16468f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f16469g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(b0.r rVar, a0.k2 k2Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16467e = rVar;
        this.f16468f = k2Var;
        this.f16469g = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b0.p(this.f16467e, this.f16468f, this.f16469g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16466d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            b0.r rVar = this.f16467e;
            a0.n2 n2Var = rVar.f16488c;
            b0.p2 p2Var = rVar.f16487b;
            b0.o oVar = new b0.o(rVar, this.f16469g, null);
            this.f16466d = 1;
            a0.k2 k2Var = this.f16468f;
            n2Var.getClass();
            if (kotlinx.coroutines.z0.f(new a0.m2(k2Var, n2Var, oVar, p2Var, null), this) == aVar) {
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
