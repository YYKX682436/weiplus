package az0;

/* loaded from: classes5.dex */
public final class l implements com.tencent.maas.instamovie.MJMoviePlayer.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f15651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJMoviePlayer.OnComplete f15652b;

    public l(az0.a0 a0Var, com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete) {
        this.f15651a = a0Var;
        this.f15652b = onComplete;
    }

    @Override // com.tencent.maas.instamovie.MJMoviePlayer.OnComplete
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        this.f15651a.f15312d = mJError == null;
        this.f15652b.onComplete(mJError);
    }
}
