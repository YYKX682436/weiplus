package ay;

/* loaded from: classes14.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ay.v f15179e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ay.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15179e = vVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ay.r(this.f15179e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ay.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15178d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f15178d = 1;
            if (kotlinx.coroutines.k1.b(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ay.v vVar = this.f15179e;
        vVar.P6(ay.e.a((ay.e) vVar.N6(), null, null, false, false, false, 0.0f, false, 123, null));
        return jz5.f0.f302826a;
    }
}
