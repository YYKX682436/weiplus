package aj5;

/* loaded from: classes.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f5480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f5481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f5482f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wi5.z f5483g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f5484h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(kotlinx.coroutines.flow.i2 i2Var, aj5.r0 r0Var, wi5.z zVar, java.util.HashMap hashMap, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5481e = i2Var;
        this.f5482f = r0Var;
        this.f5483g = zVar;
        this.f5484h = hashMap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aj5.n0(this.f5481e, this.f5482f, this.f5483g, this.f5484h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((aj5.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f5480d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            aj5.m0 m0Var = new aj5.m0(this.f5482f, this.f5483g, this.f5484h);
            this.f5480d = 1;
            if (this.f5481e.a(m0Var, this) == aVar) {
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
