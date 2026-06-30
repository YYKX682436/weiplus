package aq;

/* loaded from: classes14.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f12899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aq.n f12900e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(aq.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12900e = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq.m(this.f12900e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f12899d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            aq.r0 r0Var = aq.r0.f12940a;
            this.f12899d = 1;
            if (r0Var.k(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageDataManager", "sdk core stop finish");
        this.f12900e.f12910e = false;
        this.f12900e.f12906a = aq.b.f12835d;
        return jz5.f0.f302826a;
    }
}
