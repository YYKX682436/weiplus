package az0;

/* loaded from: classes16.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f15934e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(az0.f2 f2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15934e = f2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.u1(this.f15934e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.u1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15933d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            az0.f2 f2Var = this.f15934e;
            az0.t1 t1Var = new az0.t1(f2Var);
            this.f15933d = 1;
            if (f2Var.c("1008", t1Var, this) == aVar) {
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
