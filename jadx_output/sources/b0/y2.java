package b0;

/* loaded from: classes14.dex */
public final class y2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f16605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f16606f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(n0.e5 e5Var, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16605e = e5Var;
        this.f16606f = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b0.y2(this.f16605e, this.f16606f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.y2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16604d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            b0.m3 m3Var = (b0.m3) this.f16605e.getValue();
            this.f16604d = 1;
            if (m3Var.c(this.f16606f, this) == aVar) {
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
