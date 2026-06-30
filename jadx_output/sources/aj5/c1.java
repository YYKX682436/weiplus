package aj5;

/* loaded from: classes.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f5406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f5407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aj5.g1 f5408f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.z f5409g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f5410h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(kotlinx.coroutines.flow.i2 i2Var, aj5.g1 g1Var, wi5.z zVar, java.util.HashMap hashMap, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5407e = i2Var;
        this.f5408f = g1Var;
        this.f5409g = zVar;
        this.f5410h = hashMap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aj5.c1(this.f5407e, this.f5408f, this.f5409g, this.f5410h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((aj5.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f5406d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            aj5.b1 b1Var = new aj5.b1(this.f5408f, this.f5409g, this.f5410h);
            this.f5406d = 1;
            if (this.f5407e.a(b1Var, this) == aVar) {
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
