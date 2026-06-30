package b0;

/* loaded from: classes14.dex */
public final class n3 extends qz5.l implements yz5.q {
    public n3(kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long j17 = ((d1.e) obj2).f225627a;
        b0.n3 n3Var = new b0.n3((kotlin.coroutines.Continuation) obj3);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return jz5.f0.f302826a;
    }
}
