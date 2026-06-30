package b0;

/* loaded from: classes14.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1.a0 f16222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f16223f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f16224g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p1.a0 a0Var, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16222e = a0Var;
        this.f16223f = h0Var;
        this.f16224g = h0Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b0.b0(this.f16222e, this.f16223f, this.f16224g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16221d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            b0.a0 a0Var = new b0.a0(this.f16223f, this.f16224g, null);
            this.f16221d = 1;
            if (((p1.q0) this.f16222e).v(a0Var, this) == aVar) {
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
