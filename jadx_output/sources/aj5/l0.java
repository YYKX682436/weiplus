package aj5;

/* loaded from: classes.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f5466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f5467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f5468f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5469g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f5470h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wi5.z f5471i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f5472m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f5473n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(kotlinx.coroutines.flow.i2 i2Var, java.util.HashMap hashMap, int i17, aj5.r0 r0Var, wi5.z zVar, java.util.List list, kotlinx.coroutines.flow.i2 i2Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5467e = i2Var;
        this.f5468f = hashMap;
        this.f5469g = i17;
        this.f5470h = r0Var;
        this.f5471i = zVar;
        this.f5472m = list;
        this.f5473n = i2Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aj5.l0(this.f5467e, this.f5468f, this.f5469g, this.f5470h, this.f5471i, this.f5472m, this.f5473n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((aj5.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f5466d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            aj5.k0 k0Var = new aj5.k0(this.f5468f, this.f5469g, this.f5470h, this.f5471i, this.f5472m, this.f5473n);
            this.f5466d = 1;
            if (this.f5467e.a(k0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
