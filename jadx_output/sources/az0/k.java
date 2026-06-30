package az0;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f15617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTimeRange f15618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f15619f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15620g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f15621h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(az0.a0 a0Var, com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.model.time.MJTime mJTime, int i17, boolean z17) {
        super(1);
        this.f15617d = a0Var;
        this.f15618e = mJTimeRange;
        this.f15619f = mJTime;
        this.f15620g = i17;
        this.f15621h = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.MJMoviePlayer.OnComplete onComplete = (com.tencent.maas.instamovie.MJMoviePlayer.OnComplete) obj;
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        az0.a0 a0Var = this.f15617d;
        java.lang.String str = a0Var.f15311c;
        com.tencent.maas.model.time.MJTimeRange mJTimeRange = this.f15618e;
        if (mJTimeRange == null) {
            mJTimeRange = com.tencent.maas.model.time.MJTimeRange.fromStartEnd(com.tencent.maas.model.time.MJTime.ZeroTime, a0Var.f15309a.getPlaybackDuration());
        }
        return a0Var.f15309a.startPlaying(mJTimeRange, this.f15619f, this.f15620g, this.f15621h, onComplete);
    }
}
