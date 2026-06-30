package b0;

/* loaded from: classes14.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16231d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f16232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1.a0 f16233f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f16234g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16235h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16236i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f16237m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(p1.a0 a0Var, yz5.q qVar, yz5.l lVar, yz5.l lVar2, yz5.l lVar3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16233f = a0Var;
        this.f16234g = qVar;
        this.f16235h = lVar;
        this.f16236i = lVar2;
        this.f16237m = lVar3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        b0.b4 b4Var = new b0.b4(this.f16233f, this.f16234g, this.f16235h, this.f16236i, this.f16237m, continuation);
        b4Var.f16232e = obj;
        return b4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.b4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16231d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f16232e;
            p1.a0 a0Var = this.f16233f;
            b0.a4 a4Var = new b0.a4(new b0.h2(a0Var), this.f16234g, y0Var, this.f16235h, this.f16236i, this.f16237m, null);
            this.f16231d = 1;
            if (b0.u1.b(a0Var, a4Var, this) == aVar) {
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
