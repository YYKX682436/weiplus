package b92;

/* loaded from: classes10.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.m2 f18462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f18463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18465g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18466h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18467i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f18468m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f18469n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18470o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18471p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f18472q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18473r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f18474s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f18475t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(b92.m2 m2Var, long j17, int i17, int i18, int i19, int i27, int i28, int i29, java.lang.String str, java.lang.String str2, boolean z17, int i37, long j18, long j19) {
        super(0);
        this.f18462d = m2Var;
        this.f18463e = j17;
        this.f18464f = i17;
        this.f18465g = i18;
        this.f18466h = i19;
        this.f18467i = i27;
        this.f18468m = i28;
        this.f18469n = i29;
        this.f18470o = str;
        this.f18471p = str2;
        this.f18472q = z17;
        this.f18473r = i37;
        this.f18474s = j18;
        this.f18475t = j19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        java.lang.Long l17 = (java.lang.Long) this.f18462d.f18485h.get(java.lang.Long.valueOf(this.f18463e));
        if (l17 == null) {
            l17 = 0L;
        }
        long longValue = l17.longValue();
        long c17 = c01.id.c();
        this.f18462d.f18485h.put(java.lang.Long.valueOf(this.f18463e), java.lang.Long.valueOf(c17));
        r45.he2 he2Var = new r45.he2();
        long j17 = this.f18474s;
        long j18 = this.f18475t;
        java.lang.String str = this.f18470o;
        java.lang.String str2 = this.f18471p;
        int i18 = this.f18464f;
        int i19 = this.f18465g;
        int i27 = this.f18466h;
        int i28 = this.f18467i;
        int i29 = this.f18468m;
        int i37 = this.f18469n;
        he2Var.set(2, java.lang.Long.valueOf(longValue));
        he2Var.set(3, java.lang.Long.valueOf(c17));
        he2Var.set(0, java.lang.Long.valueOf(j17));
        he2Var.set(1, java.lang.Long.valueOf(j18));
        he2Var.set(5, str);
        he2Var.set(4, str2);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393261h) {
            i17 = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(context);
        } else if (r75.d.f393258e == -100) {
            i17 = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(context);
            r75.d.f393258e = i17;
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            com.tencent.mars.xlog.Log.i("NetWorkCache", "getIOSNetTypeFromCache, iosNetworkType = " + r75.d.f393258e);
            i17 = r75.d.f393258e;
        }
        he2Var.set(6, java.lang.Integer.valueOf(i17));
        he2Var.set(13, -1);
        he2Var.set(14, -1);
        he2Var.set(7, java.lang.Integer.valueOf(i18));
        he2Var.set(8, java.lang.Integer.valueOf(i19));
        he2Var.set(9, java.lang.Integer.valueOf(i27));
        he2Var.set(10, java.lang.Integer.valueOf(i28));
        he2Var.set(11, java.lang.Integer.valueOf(i29));
        he2Var.set(12, java.lang.Integer.valueOf(i37));
        com.tencent.mars.xlog.Log.i("FinderLiveQosReportService", "onNetStatus: renderFps=" + this.f18464f + ", videoLightBlockCnt=" + this.f18465g + ", videoMediumBlockCnt=" + this.f18466h + ", videoLargeBlockCnt=" + this.f18467i + ", videoBlockTime=" + this.f18468m + ", avgBitrate=" + this.f18469n + ", startTime=" + longValue + ", endTime=" + c17 + ", deltaTime=" + (c17 - longValue) + ", commentScene=" + this.f18470o + ", sessionId=" + this.f18471p + ", network_type=" + he2Var.getInteger(6) + ", isNeedReportCgi=" + this.f18472q + ", qosReportThreshold=" + this.f18473r + ", objectId=" + pm0.v.u(this.f18474s) + ", liveId=" + pm0.v.u(this.f18475t) + ", tickerHashCode=" + this.f18463e);
        b92.m2 m2Var = this.f18462d;
        m2Var.getClass();
        pm0.v.X(new b92.f2(m2Var, he2Var, "onNetStatus"));
        return jz5.f0.f302826a;
    }
}
