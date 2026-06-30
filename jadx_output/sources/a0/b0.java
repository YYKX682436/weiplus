package a0;

/* loaded from: classes14.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f74d;

    /* renamed from: e, reason: collision with root package name */
    public int f75e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f76f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f77g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.o f78h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f79i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(n0.e5 e5Var, long j17, c0.o oVar, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f76f = e5Var;
        this.f77g = j17;
        this.f78h = oVar;
        this.f79i = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a0.b0(this.f76f, this.f77g, this.f78h, this.f79i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a0.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        c0.r rVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f75e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (((java.lang.Boolean) ((yz5.a) this.f76f.getValue()).invoke()).booleanValue()) {
                long j17 = a0.f0.f122a;
                this.f75e = 1;
                if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = (c0.r) this.f74d;
                kotlin.ResultKt.throwOnFailure(obj);
                this.f79i.setValue(rVar);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        c0.r rVar2 = new c0.r(this.f77g, null);
        this.f74d = rVar2;
        this.f75e = 2;
        if (((c0.p) this.f78h).a(rVar2, this) == aVar) {
            return aVar;
        }
        rVar = rVar2;
        this.f79i.setValue(rVar);
        return jz5.f0.f302826a;
    }
}
