package bt;

/* loaded from: classes5.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f24121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bt.u0 f24122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f24123f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(bt.u0 u0Var, java.lang.StringBuilder sb6, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f24122e = u0Var;
        this.f24123f = sb6;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bt.t0(this.f24122e, this.f24123f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bt.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f24121d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            bt.s0 s0Var = new bt.s0(this.f24122e, this.f24123f, null);
            this.f24121d = 1;
            obj = kotlinx.coroutines.l.g(g3Var, s0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
