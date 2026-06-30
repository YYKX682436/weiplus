package az0;

/* loaded from: classes5.dex */
public final class j7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTimeRange f15604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f15606f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(com.tencent.maas.model.time.MJTimeRange mJTimeRange, az0.n7 n7Var, com.tencent.maas.model.time.MJTime mJTime) {
        super(1);
        this.f15604d = mJTimeRange;
        this.f15605e = n7Var;
        this.f15606f = mJTime;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.MJMovieSession.OnComplete it = (com.tencent.maas.instamovie.MJMovieSession.OnComplete) obj;
        kotlin.jvm.internal.o.g(it, "it");
        az0.n7 n7Var = this.f15605e;
        com.tencent.maas.model.time.MJTimeRange mJTimeRange = this.f15604d;
        if (mJTimeRange == null) {
            mJTimeRange = com.tencent.maas.model.time.MJTimeRange.fromStartEnd(com.tencent.maas.model.time.MJTime.ZeroTime, n7Var.f15742a.getPlaybackDuration());
        }
        com.tencent.maas.instamovie.base.MJError startPlaying = n7Var.f15742a.startPlaying(mJTimeRange, this.f15606f, 999, true, it);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "startPlay: err=" + startPlaying);
        return startPlaying;
    }
}
