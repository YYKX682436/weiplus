package ch2;

/* loaded from: classes10.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f41411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41412e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(ch2.o2 o2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41412e = o2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.n0(this.f41412e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f41411d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f41411d = 1;
            if (kotlinx.coroutines.k1.b(20L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f41412e.q7().P6(new om2.v(), false);
        return jz5.f0.f302826a;
    }
}
