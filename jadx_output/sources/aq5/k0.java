package aq5;

/* loaded from: classes5.dex */
public final class k0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f13249d;

    public k0(kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new aq5.k0(continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return new aq5.k0((kotlin.coroutines.Continuation) obj).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f13249d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            aq5.p0 p0Var = aq5.p0.f13273a;
            this.f13249d = 1;
            obj = p0Var.c(this);
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
