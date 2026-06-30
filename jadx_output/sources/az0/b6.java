package az0;

/* loaded from: classes5.dex */
public final class b6 implements com.tencent.maas.instamovie.MJMovieSession.OnExportComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJExportSettings f15359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ az0.b0 f15361c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f15362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJMovieSession.OnComplete f15363e;

    public b6(com.tencent.maas.instamovie.MJExportSettings mJExportSettings, java.lang.String str, az0.b0 b0Var, long j17, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        this.f15359a = mJExportSettings;
        this.f15360b = str;
        this.f15361c = b0Var;
        this.f15362d = j17;
        this.f15363e = onComplete;
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.OnExportComplete
    public final void onExportComplete(java.lang.String str, com.tencent.maas.instamovie.base.MJError mJError) {
        if (mJError != null) {
            bz0.f.f36735a.a(mJError);
            if (mJError.f48175ec == com.tencent.maas.instamovie.base.MJError.MaasEC.VideoEncodeFailed) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MaasMovieSessionManager", "export encode error, mark");
                py0.a0 a0Var = py0.a0.f358966a;
                rg.c a17 = rg.c.a(this.f15359a.getVideoDimensionLevel());
                kotlin.jvm.internal.o.f(a17, "valueOf(...)");
                a0Var.b(a17);
            }
        } else {
            bz0.f fVar = bz0.f.f36735a;
            java.lang.String videoPath = this.f15360b;
            kotlin.jvm.internal.o.g(videoPath, "videoPath");
            bz0.f.f36738d = kotlinx.coroutines.l.d(bz0.f.f36736b, null, null, new bz0.c(bz0.f.f36738d, videoPath, null), 3, null);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            kotlin.jvm.internal.o.d(str);
            az0.b0 b0Var = this.f15361c;
            b0Var.getClass();
            b0Var.f15339b = str;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "onExportComplete: " + str);
        bz0.f fVar2 = bz0.f.f36735a;
        bz0.f.f36737c.f58943r = java.lang.System.currentTimeMillis() - this.f15362d;
        this.f15363e.onComplete(mJError);
    }
}
