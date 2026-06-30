package a0;

/* loaded from: classes14.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f137f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.o f138g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(boolean z17, n0.v2 v2Var, c0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136e = z17;
        this.f137f = v2Var;
        this.f138g = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a0.g1(this.f136e, this.f137f, this.f138g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f135d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!this.f136e) {
                this.f135d = 1;
                if (a0.l1.d(this.f137f, this.f138g, this) == aVar) {
                    return aVar;
                }
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
