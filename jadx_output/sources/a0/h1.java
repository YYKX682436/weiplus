package a0;

/* loaded from: classes14.dex */
public final class h1 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f156e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f157f;

    public h1(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        a0.h1 h1Var = new a0.h1(continuation);
        h1Var.f157f = obj;
        return h1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.h1) create((p1.c) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f156e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p1.c cVar = (p1.c) this.f157f;
            this.f156e = 1;
            obj = p1.b.a(cVar, null, this, 1, null);
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
