package gr3;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f356371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f356373f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f356374g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f356375h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f356376i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f356377m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f356378n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f356379o;

    public a(long j17, java.lang.String str, long j18, java.lang.Long l17, java.lang.Long l18, long j19, int i17, int i18, int i19) {
        this.f356371d = j17;
        this.f356372e = str;
        this.f356373f = j18;
        this.f356374g = l17;
        this.f356375h = l18;
        this.f356376i = j19;
        this.f356377m = i17;
        this.f356378n = i18;
        this.f356379o = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6349x3d547058 c6349x3d547058 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6349x3d547058();
        long j17 = this.f356371d;
        if (j17 == 0) {
            byte[] decode = android.util.Base64.decode(((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s.class)).Bi(), 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
            j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(new java.lang.String(decode, r26.c.f450398a), 0L);
        }
        java.lang.String str = this.f356372e;
        boolean z17 = str == null || str.length() == 0;
        long j18 = this.f356373f;
        if (z17 || j18 != 1) {
            if (this.f356374g == null) {
                c6349x3d547058.f136971e = 0L;
            } else {
                c6349x3d547058.f136971e = ((int) r6.longValue()) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
            }
        } else {
            c6349x3d547058.f136971e = gr3.e.a(str, "").f356387a;
        }
        c6349x3d547058.f136970d = j17;
        java.lang.Long l17 = this.f356375h;
        c6349x3d547058.f136972f = l17 != null ? l17.longValue() : 0L;
        c6349x3d547058.f136973g = this.f356376i;
        c6349x3d547058.f136974h = j18;
        c6349x3d547058.f136976j = this.f356377m;
        c6349x3d547058.f136975i = c6349x3d547058.b("SessionId", java.lang.String.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275336a), true);
        c6349x3d547058.f136978l = this.f356378n;
        c6349x3d547058.f136977k = this.f356379o;
        c6349x3d547058.k();
    }
}
