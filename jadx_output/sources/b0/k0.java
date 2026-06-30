package b0;

/* loaded from: classes14.dex */
public final class k0 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f16376e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16377f;

    public k0(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.k0 k0Var = new b0.k0(continuation);
        k0Var.f16377f = obj;
        return k0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.k0) create((p1.c) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16376e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p1.c cVar = (p1.c) this.f16377f;
            this.f16376e = 1;
            obj = b0.d4.c(cVar, p1.n.Main, false, this);
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
