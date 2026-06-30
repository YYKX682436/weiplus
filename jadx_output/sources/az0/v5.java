package az0;

/* loaded from: classes5.dex */
public final class v5 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJExportSettings f15966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f15967f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(com.tencent.maas.instamovie.MJExportSettings mJExportSettings, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f15966e = mJExportSettings;
        this.f15967f = c0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        az0.v5 v5Var = new az0.v5(this.f15966e, this.f15967f, (kotlin.coroutines.Continuation) obj3);
        v5Var.f15965d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        v5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f15965d;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_maas_export_disable_export_retry, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasAlbumTemplateGlobalConfig", "disableExportRetry " + fj6);
        if (!(!fj6)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "export: disable retry");
            throw th6;
        }
        com.tencent.maas.instamovie.MJExportSettings mJExportSettings = this.f15966e;
        if (!kotlin.jvm.internal.o.b(mJExportSettings.getVideoEncoderName(), "VideoEncoderAMCHardware")) {
            throw th6;
        }
        this.f15967f.f310112d = true;
        mJExportSettings.f48114i = "VideoEncoderVCodec";
        return jz5.f0.f302826a;
    }
}
