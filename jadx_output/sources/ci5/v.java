package ci5;

/* loaded from: classes12.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f41790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg3.c f41792f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ci5.b0 f41793g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mf3.k f41794h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41795i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, gg3.c cVar, ci5.b0 b0Var, mf3.k kVar, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41791e = str;
        this.f41792f = cVar;
        this.f41793g = b0Var;
        this.f41794h = kVar;
        this.f41795i = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ci5.v(this.f41791e, this.f41792f, this.f41793g, this.f41794h, this.f41795i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ci5.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f41790d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            ci5.u uVar = new ci5.u(this.f41791e, this.f41792f, this.f41793g, this.f41794h, this.f41795i, null);
            this.f41790d = 1;
            if (kotlinx.coroutines.l.g(p0Var, uVar, this) == aVar) {
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
