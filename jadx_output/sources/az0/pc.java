package az0;

/* loaded from: classes5.dex */
public final class pc implements com.tencent.maas.instamovie.MJMoviePlayer.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f15818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15819c;

    public pc(java.lang.String str, kotlin.coroutines.Continuation continuation, long j17) {
        this.f15817a = str;
        this.f15818b = continuation;
        this.f15819c = j17;
    }

    @Override // com.tencent.maas.instamovie.MJMoviePlayer.OnComplete
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        long j17 = this.f15819c;
        bz0.b bVar = bz0.b.f36724a;
        kotlin.coroutines.Continuation continuation = this.f15818b;
        if (mJError == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
            bz0.b.d(bVar, this.f15817a, java.lang.System.currentTimeMillis() - j17, 0, 4, null);
            return;
        }
        com.tencent.mars.xlog.Log.e("MaasFuncUtils", this.f15817a + " call error: " + mJError.f48175ec + ' ' + mJError.message, new java.lang.Throwable());
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        bz0.b.b(bVar, this.f15817a, mJError, java.lang.System.currentTimeMillis() - j17, 0, 8, null);
    }
}
