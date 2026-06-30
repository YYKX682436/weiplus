package az0;

/* loaded from: classes.dex */
public final class b5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15356d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f15358f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15358f = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        az0.b5 b5Var = new az0.b5(this.f15358f, continuation);
        b5Var.f15357e = obj;
        return b5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.b5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15356d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f15357e;
            this.f15356d = 1;
            obj = this.f15358f.invoke(y0Var, this);
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
