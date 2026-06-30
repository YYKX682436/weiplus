package az0;

/* loaded from: classes5.dex */
public final class h2 extends qz5.l implements yz5.p {
    public h2(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.h2(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        az0.h2 h2Var = new az0.h2((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        az0.l2 l2Var = az0.l2.f15656a;
        ((java.lang.Boolean) ((jz5.n) az0.l2.f15659d).getValue()).booleanValue();
        return jz5.f0.f302826a;
    }
}
