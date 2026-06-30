package az0;

/* loaded from: classes5.dex */
public final class ic implements com.tencent.maas.instamovie.MJMovieSession.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f15593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15595c;

    public ic(kotlin.coroutines.Continuation continuation, java.lang.String str, long j17) {
        this.f15593a = continuation;
        this.f15594b = str;
        this.f15595c = j17;
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.OnComplete
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        kotlin.coroutines.Continuation continuation = this.f15593a;
        if (mJError == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
            return;
        }
        com.tencent.mars.xlog.Log.e("MaasFuncUtils", mJError.f48175ec + ' ' + mJError.message, new java.lang.Throwable());
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        bz0.b.b(bz0.b.f36724a, this.f15594b, mJError, java.lang.System.currentTimeMillis() - this.f15595c, 0, 8, null);
    }
}
