package az0;

/* loaded from: classes5.dex */
public final class c6 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJExportSettings f15387f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15388g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ az0.b0 f15389h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f15390i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(java.lang.String str, java.lang.String str2, com.tencent.maas.instamovie.MJExportSettings mJExportSettings, az0.n7 n7Var, az0.b0 b0Var, long j17) {
        super(2);
        this.f15385d = str;
        this.f15386e = str2;
        this.f15387f = mJExportSettings;
        this.f15388g = n7Var;
        this.f15389h = b0Var;
        this.f15390i = j17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onProgress = (com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress) obj;
        com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete = (com.tencent.maas.instamovie.MJMovieSession.OnComplete) obj2;
        kotlin.jvm.internal.o.g(onProgress, "onProgress");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("export to ");
        sb6.append(this.f15385d);
        sb6.append(", realPath: ");
        sb6.append(this.f15386e);
        sb6.append(", dimen:");
        com.tencent.maas.instamovie.MJExportSettings mJExportSettings = this.f15387f;
        sb6.append(mJExportSettings.getVideoDimensionLevel());
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", sb6.toString());
        com.tencent.maas.instamovie.MJExportSettings mJExportSettings2 = this.f15387f;
        com.tencent.maas.instamovie.MJAsyncTaskInfo startExporting = this.f15388g.f15742a.startExporting(this.f15386e, com.tencent.maas.model.time.MJTimeRange.PositiveInfiniteTimeRange, mJExportSettings2, onProgress, new az0.b6(mJExportSettings2, this.f15385d, this.f15389h, this.f15390i, onComplete));
        if ((startExporting != null ? startExporting.f48104a : null) != null) {
            bz0.f fVar = bz0.f.f36735a;
            com.tencent.maas.instamovie.base.MJError error = startExporting.f48104a;
            kotlin.jvm.internal.o.f(error, "error");
            fVar.a(error);
            py0.a0 a0Var = py0.a0.f358966a;
            rg.c a17 = rg.c.a(mJExportSettings.getVideoDimensionLevel());
            kotlin.jvm.internal.o.f(a17, "valueOf(...)");
            a0Var.b(a17);
        }
        return startExporting;
    }
}
