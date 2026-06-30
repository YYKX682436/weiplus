package az0;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f15927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(az0.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15927e = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.u(this.f15927e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15926d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f15926d = 1;
            az0.a0 a0Var = this.f15927e;
            a0Var.getClass();
            obj = az0.rc.f("2003", new az0.q(a0Var), this);
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
