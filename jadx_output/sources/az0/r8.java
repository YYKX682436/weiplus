package az0;

/* loaded from: classes5.dex */
public final class r8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camstudio.MJCamSession f15866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.s9 f15867f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(com.tencent.maas.camstudio.MJCamSession mJCamSession, az0.s9 s9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15866e = mJCamSession;
        this.f15867f = s9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.r8(this.f15866e, this.f15867f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.r8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15865d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            az0.q8 q8Var = new az0.q8(this.f15866e, this.f15867f);
            this.f15865d = 1;
            if (az0.j.b("1023", q8Var, this) == aVar) {
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
