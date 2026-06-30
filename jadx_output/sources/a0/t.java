package a0;

/* loaded from: classes14.dex */
public final class t extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f286d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f287e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ long f288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f289g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0.o f290h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f291i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f292m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z17, c0.o oVar, n0.v2 v2Var, n0.e5 e5Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f289g = z17;
        this.f290h = oVar;
        this.f291i = v2Var;
        this.f292m = e5Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        long j17 = ((d1.e) obj2).f225627a;
        a0.t tVar = new a0.t(this.f289g, this.f290h, this.f291i, this.f292m, (kotlin.coroutines.Continuation) obj3);
        tVar.f287e = (b0.f2) obj;
        tVar.f288f = j17;
        return tVar.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f286d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            b0.f2 f2Var = (b0.f2) this.f287e;
            long j17 = this.f288f;
            if (this.f289g) {
                c0.o oVar = this.f290h;
                n0.v2 v2Var = this.f291i;
                n0.e5 e5Var = this.f292m;
                this.f286d = 1;
                java.lang.Object f17 = kotlinx.coroutines.z0.f(new a0.c0(f2Var, j17, oVar, v2Var, e5Var, null), this);
                if (f17 != aVar) {
                    f17 = f0Var;
                }
                if (f17 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
