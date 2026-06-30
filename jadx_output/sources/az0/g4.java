package az0;

/* loaded from: classes5.dex */
public final class g4 extends qz5.l implements yz5.p {
    public g4(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new az0.g4(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        az0.g4 g4Var = new az0.g4((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.maas.instamovie.MJResourcePreloader mJResourcePreloader = az0.i5.f15574r;
        if (mJResourcePreloader != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "release: teardown resource preloader");
            mJResourcePreloader.c();
        }
        az0.i5 i5Var = az0.i5.f15557a;
        az0.i5.f15574r = null;
        az0.i5.f15557a.q().b();
        return jz5.f0.f302826a;
    }
}
