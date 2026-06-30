package c0;

/* loaded from: classes14.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f36938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.n f36939e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f36940f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(c0.n nVar, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f36939e = nVar;
        this.f36940f = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c0.l(this.f36939e, this.f36940f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((c0.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f36938d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            kotlinx.coroutines.flow.i2 i2Var = ((c0.p) this.f36939e).f36941a;
            c0.k kVar = new c0.k(arrayList, this.f36940f);
            this.f36938d = 1;
            kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) i2Var;
            q2Var.getClass();
            if (kotlinx.coroutines.flow.q2.l(q2Var, kVar, this) == aVar) {
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
