package az0;

/* loaded from: classes5.dex */
public final class v4 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f15963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJMoviePlayer f15964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(com.tencent.maas.instamovie.MJMoviePlayer mJMoviePlayer, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f15964e = mJMoviePlayer;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new az0.v4(this.f15964e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((az0.v4) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f15963d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            az0.u4 u4Var = new az0.u4(this.f15964e);
            this.f15963d = 1;
            obj = az0.rc.f("2001", u4Var, this);
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
