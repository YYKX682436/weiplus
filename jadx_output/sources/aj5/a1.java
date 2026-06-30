package aj5;

/* loaded from: classes.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f5386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f5387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f5388f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5389g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ aj5.g1 f5390h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wi5.z f5391i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f5392m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f5393n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(kotlinx.coroutines.flow.i2 i2Var, java.util.HashMap hashMap, int i17, aj5.g1 g1Var, wi5.z zVar, java.util.List list, kotlinx.coroutines.flow.i2 i2Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5387e = i2Var;
        this.f5388f = hashMap;
        this.f5389g = i17;
        this.f5390h = g1Var;
        this.f5391i = zVar;
        this.f5392m = list;
        this.f5393n = i2Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aj5.a1(this.f5387e, this.f5388f, this.f5389g, this.f5390h, this.f5391i, this.f5392m, this.f5393n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((aj5.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f5386d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            aj5.z0 z0Var = new aj5.z0(this.f5388f, this.f5389g, this.f5390h, this.f5391i, this.f5392m, this.f5393n);
            this.f5386d = 1;
            if (this.f5387e.a(z0Var, this) == aVar) {
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
