package b92;

/* loaded from: classes10.dex */
public final class l2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.m2 f99995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f99996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f99997f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f99998g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f99999h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100000i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f100001m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f100002n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100003o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100004p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f100005q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f100006r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f100007s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f100008t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(b92.m2 m2Var, long j17, int i17, int i18, int i19, int i27, int i28, int i29, java.lang.String str, java.lang.String str2, boolean z17, int i37, long j18, long j19) {
        super(0);
        this.f99995d = m2Var;
        this.f99996e = j17;
        this.f99997f = i17;
        this.f99998g = i18;
        this.f99999h = i19;
        this.f100000i = i27;
        this.f100001m = i28;
        this.f100002n = i29;
        this.f100003o = str;
        this.f100004p = str2;
        this.f100005q = z17;
        this.f100006r = i37;
        this.f100007s = j18;
        this.f100008t = j19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        java.lang.Long l17 = (java.lang.Long) this.f99995d.f100018h.get(java.lang.Long.valueOf(this.f99996e));
        if (l17 == null) {
            l17 = 0L;
        }
        long longValue = l17.longValue();
        long c17 = c01.id.c();
        this.f99995d.f100018h.put(java.lang.Long.valueOf(this.f99996e), java.lang.Long.valueOf(c17));
        r45.he2 he2Var = new r45.he2();
        long j17 = this.f100007s;
        long j18 = this.f100008t;
        java.lang.String str = this.f100003o;
        java.lang.String str2 = this.f100004p;
        int i18 = this.f99997f;
        int i19 = this.f99998g;
        int i27 = this.f99999h;
        int i28 = this.f100000i;
        int i29 = this.f100001m;
        int i37 = this.f100002n;
        he2Var.set(2, java.lang.Long.valueOf(longValue));
        he2Var.set(3, java.lang.Long.valueOf(c17));
        he2Var.set(0, java.lang.Long.valueOf(j17));
        he2Var.set(1, java.lang.Long.valueOf(j18));
        he2Var.set(5, str);
        he2Var.set(4, str2);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!r75.d.f474794h) {
            i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(context);
        } else if (r75.d.f474791e == -100) {
            i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(context);
            r75.d.f474791e = i17;
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetWorkCache", "getIOSNetTypeFromCache, iosNetworkType = " + r75.d.f474791e);
            i17 = r75.d.f474791e;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveQosReportService", "onNetStatus: renderFps=" + this.f99997f + ", videoLightBlockCnt=" + this.f99998g + ", videoMediumBlockCnt=" + this.f99999h + ", videoLargeBlockCnt=" + this.f100000i + ", videoBlockTime=" + this.f100001m + ", avgBitrate=" + this.f100002n + ", startTime=" + longValue + ", endTime=" + c17 + ", deltaTime=" + (c17 - longValue) + ", commentScene=" + this.f100003o + ", sessionId=" + this.f100004p + ", network_type=" + he2Var.m75939xb282bd08(6) + ", isNeedReportCgi=" + this.f100005q + ", qosReportThreshold=" + this.f100006r + ", objectId=" + pm0.v.u(this.f100007s) + ", liveId=" + pm0.v.u(this.f100008t) + ", tickerHashCode=" + this.f99996e);
        b92.m2 m2Var = this.f99995d;
        m2Var.getClass();
        pm0.v.X(new b92.f2(m2Var, he2Var, "onNetStatus"));
        return jz5.f0.f384359a;
    }
}
