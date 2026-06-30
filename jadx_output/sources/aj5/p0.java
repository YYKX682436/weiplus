package aj5;

/* loaded from: classes.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f5490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f5491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f5492f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f5493g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wi5.z f5494h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(kotlinx.coroutines.flow.i2 i2Var, java.util.HashMap hashMap, aj5.r0 r0Var, wi5.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5491e = i2Var;
        this.f5492f = hashMap;
        this.f5493g = r0Var;
        this.f5494h = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aj5.p0(this.f5491e, this.f5492f, this.f5493g, this.f5494h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((aj5.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f5490d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            aj5.o0 o0Var = new aj5.o0(this.f5492f, this.f5493g, this.f5494h);
            this.f5490d = 1;
            if (this.f5491e.a(o0Var, this) == aVar) {
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
