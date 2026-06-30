package az0;

/* loaded from: classes5.dex */
public final class u6 implements com.tencent.maas.instamovie.MJMovieSession.OnMusicRecommendComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.q f15939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f15940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15941c;

    public u6(yz5.q qVar, long j17, long j18) {
        this.f15939a = qVar;
        this.f15940b = j17;
        this.f15941c = j18;
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.OnMusicRecommendComplete
    public final void onRecommendComplete(com.tencent.maas.model.MJMusicInfo[] mJMusicInfoArr, com.tencent.maas.instamovie.base.MJError mJError) {
        yz5.q qVar = this.f15939a;
        if (qVar != null) {
            qVar.invoke(mJError, mJMusicInfoArr, java.lang.Long.valueOf(this.f15940b));
        }
        az0.rc.i("282", this.f15941c, mJError, false, 0, 24, null);
    }
}
