package ai4;

/* loaded from: classes11.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f5185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5187f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f5188g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i17, java.lang.String str, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5186e = i17;
        this.f5187f = str;
        this.f5188g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ai4.p(this.f5186e, this.f5187f, this.f5188g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ai4.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f5185d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qj4.s.f363958a.r(1L, (r20 & 2) != 0 ? null : new java.lang.Integer(this.f5186e), (r20 & 4) != 0 ? null : new java.lang.Integer(ai4.b0.f5128f), (r20 & 8) != 0 ? null : this.f5187f, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? null : null);
            this.f5185d = 1;
            obj = this.f5188g.invoke(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
