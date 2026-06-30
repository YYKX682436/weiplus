package az0;

/* loaded from: classes5.dex */
public final class z4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f16099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJMovieSession f16100e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(com.tencent.maas.instamovie.MJMovieSession mJMovieSession, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f16100e = mJMovieSession;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.z4(this.f16100e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.z4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f16099d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            az0.y4 y4Var = new az0.y4(this.f16100e);
            this.f16099d = 1;
            if (az0.rc.d("280", y4Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f16100e.release();
        az0.i5 i5Var = az0.i5.f15557a;
        az0.i5.f15571o = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "setSessionKey , field: " + bz0.a.f36722a);
        bz0.a.f36722a = "";
        return jz5.f0.f302826a;
    }
}
