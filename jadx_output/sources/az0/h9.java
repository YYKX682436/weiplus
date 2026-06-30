package az0;

/* loaded from: classes5.dex */
public final class h9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f15537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f15538f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(az0.s9 s9Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15537e = s9Var;
        this.f15538f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.h9(this.f15537e, this.f15538f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.h9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15536d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yz5.l lVar = this.f15538f;
            az0.s9 s9Var = this.f15537e;
            az0.g9 g9Var = new az0.g9(s9Var, lVar);
            this.f15536d = 1;
            if (s9Var.c("1008", g9Var, this) == aVar) {
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
