package b0;

/* loaded from: classes14.dex */
public final class r3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f16500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.h2 f16501f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1.s f16502g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(yz5.q qVar, b0.h2 h2Var, p1.s sVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16500e = qVar;
        this.f16501f = h2Var;
        this.f16502g = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b0.r3(this.f16500e, this.f16501f, this.f16502g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.r3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16499d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            d1.e eVar = new d1.e(this.f16502g.f350881c);
            this.f16499d = 1;
            if (this.f16500e.invoke(this.f16501f, eVar, this) == aVar) {
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
