package az0;

/* loaded from: classes.dex */
public final class a5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15320d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f15322f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15322f = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        az0.a5 a5Var = new az0.a5(this.f15322f, continuation);
        a5Var.f15321e = obj;
        return a5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.a5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15320d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f15321e;
            this.f15320d = 1;
            obj = this.f15322f.invoke(y0Var, this);
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
