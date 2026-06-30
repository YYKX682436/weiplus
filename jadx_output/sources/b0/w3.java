package b0;

/* loaded from: classes14.dex */
public final class w3 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f16575e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16576f;

    public w3(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.w3 w3Var = new b0.w3(continuation);
        w3Var.f16576f = obj;
        return w3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.w3) create((p1.c) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16575e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p1.c cVar = (p1.c) this.f16576f;
            this.f16575e = 1;
            obj = b0.d4.f(cVar, this);
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
