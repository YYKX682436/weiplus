package co5;

/* loaded from: classes11.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f43865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ co5.p f43866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f43867f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(co5.p pVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f43866e = pVar;
        this.f43867f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new co5.m(this.f43866e, this.f43867f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((co5.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f43865d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f43865d = 1;
            if (co5.p.wi(this.f43866e, this.f43867f, this) == aVar) {
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
