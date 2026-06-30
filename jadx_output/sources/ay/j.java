package ay;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ay.l f15157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ay.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15157e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ay.j(this.f15157e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ay.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15156d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f15156d = 1;
            if (kotlinx.coroutines.k1.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f15157e.Q6(false, true);
        return jz5.f0.f302826a;
    }
}
