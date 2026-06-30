package at2;

/* loaded from: classes.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f13741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f13742e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f13742e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new at2.r1(this.f13742e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((at2.r1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f13741d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f13741d = 1;
            if (kotlinx.coroutines.k1.b(3000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveReplayerPlugin", "detachBlock timeout");
        this.f13742e.invoke();
        return jz5.f0.f302826a;
    }
}
