package aj5;

/* loaded from: classes.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f5420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f5421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f5422f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ aj5.g1 f5423g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wi5.z f5424h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(kotlinx.coroutines.flow.i2 i2Var, java.util.HashMap hashMap, aj5.g1 g1Var, wi5.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5421e = i2Var;
        this.f5422f = hashMap;
        this.f5423g = g1Var;
        this.f5424h = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aj5.e1(this.f5421e, this.f5422f, this.f5423g, this.f5424h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((aj5.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f5420d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            aj5.d1 d1Var = new aj5.d1(this.f5422f, this.f5423g, this.f5424h);
            this.f5420d = 1;
            if (this.f5421e.a(d1Var, this) == aVar) {
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
