package ch2;

/* loaded from: classes3.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f41352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.q f41353e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ch2.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41353e = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.g(this.f41353e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((ch2.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f41352d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ch2.q qVar = this.f41353e;
            kotlinx.coroutines.flow.i2 i2Var = ((om2.l) qVar.business(om2.l.class)).f346342g;
            ch2.f fVar = new ch2.f(qVar);
            this.f41352d = 1;
            kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) i2Var;
            q2Var.getClass();
            if (kotlinx.coroutines.flow.q2.l(q2Var, fVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
