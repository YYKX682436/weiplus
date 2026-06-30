package az0;

/* loaded from: classes5.dex */
public final class i6 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15582e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(az0.n7 n7Var, java.lang.String str) {
        super(2);
        this.f15581d = n7Var;
        this.f15582e = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onProgress = (com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress) obj;
        com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete = (com.tencent.maas.instamovie.MJMovieSession.OnComplete) obj2;
        kotlin.jvm.internal.o.g(onProgress, "onProgress");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "recreateWithBlankTemplate");
        az0.n7 n7Var = this.f15581d;
        return n7Var.f15742a.recreateUsingBlankTemplate(this.f15582e, n7Var.f15744c, onProgress, onComplete);
    }
}
