package b0;

/* loaded from: classes14.dex */
public final class a4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16200d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.h2 f16202f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f16203g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f16204h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16205i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16206m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16207n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(b0.h2 h2Var, yz5.q qVar, kotlinx.coroutines.y0 y0Var, yz5.l lVar, yz5.l lVar2, yz5.l lVar3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16202f = h2Var;
        this.f16203g = qVar;
        this.f16204h = y0Var;
        this.f16205i = lVar;
        this.f16206m = lVar2;
        this.f16207n = lVar3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.a4 a4Var = new b0.a4(this.f16202f, this.f16203g, this.f16204h, this.f16205i, this.f16206m, this.f16207n, continuation);
        a4Var.f16201e = obj;
        return a4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.a4) create((p1.a0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16200d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            p1.a0 a0Var = (p1.a0) this.f16201e;
            b0.z3 z3Var = new b0.z3(this.f16202f, this.f16203g, this.f16204h, this.f16205i, this.f16206m, this.f16207n, null);
            this.f16200d = 1;
            if (((p1.q0) a0Var).v(z3Var, this) == aVar) {
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
