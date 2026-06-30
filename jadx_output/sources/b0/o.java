package b0;

/* loaded from: classes14.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16450d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.r f16452f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f16453g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b0.r rVar, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16452f = rVar;
        this.f16453g = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.o oVar = new b0.o(this.f16452f, this.f16453g, continuation);
        oVar.f16451e = obj;
        return oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.o) create((b0.p2) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16450d;
        b0.r rVar = this.f16452f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                b0.p2 p2Var = (b0.p2) this.f16451e;
                ((n0.q4) rVar.f16489d).setValue(java.lang.Boolean.TRUE);
                yz5.p pVar = this.f16453g;
                this.f16450d = 1;
                if (pVar.invoke(p2Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            ((n0.q4) rVar.f16489d).setValue(java.lang.Boolean.FALSE);
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            ((n0.q4) rVar.f16489d).setValue(java.lang.Boolean.FALSE);
            throw th6;
        }
    }
}
