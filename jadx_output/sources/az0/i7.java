package az0;

/* loaded from: classes5.dex */
public final class i7 implements com.tencent.maas.instamovie.MJMovieSession.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f15583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJMovieSession.OnComplete f15584b;

    public i7(long j17, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        this.f15583a = j17;
        this.f15584b = onComplete;
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.OnComplete
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        long j17 = this.f15583a;
        bz0.b bVar = bz0.b.f36724a;
        if (mJError != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MaasMovieSessionManager", mJError.f48175ec + ' ' + mJError.message, new java.lang.Throwable());
            bz0.b.b(bVar, "203", mJError, java.lang.System.currentTimeMillis() - j17, 0, 8, null);
        } else {
            bVar.c("203", java.lang.System.currentTimeMillis() - j17, bz0.a.f36723b);
        }
        this.f15584b.onComplete(mJError);
    }
}
