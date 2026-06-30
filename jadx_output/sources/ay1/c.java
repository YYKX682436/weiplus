package ay1;

/* loaded from: classes2.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ay1.l f15203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f15204f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ay1.l lVar, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15203e = lVar;
        this.f15204f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ay1.c(this.f15203e, this.f15204f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ay1.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15202d;
        ay1.l lVar = this.f15203e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            oz5.l f11582e = lVar.d().getF11582e();
            ay1.b bVar = new ay1.b(lVar, this.f15204f, null);
            this.f15202d = 1;
            if (kotlinx.coroutines.l.g(f11582e, bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        lVar.f15230f = null;
        return jz5.f0.f302826a;
    }
}
