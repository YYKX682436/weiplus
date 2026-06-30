package ml2;

/* loaded from: classes3.dex */
public final class k5 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f409187a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f409188b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f409189c;

    /* renamed from: d, reason: collision with root package name */
    public long f409190d;

    /* renamed from: e, reason: collision with root package name */
    public long f409191e;

    /* renamed from: f, reason: collision with root package name */
    public long f409192f;

    /* renamed from: g, reason: collision with root package name */
    public long f409193g;

    /* renamed from: h, reason: collision with root package name */
    public long f409194h;

    /* renamed from: i, reason: collision with root package name */
    public long f409195i;

    /* renamed from: j, reason: collision with root package name */
    public long f409196j;

    /* renamed from: k, reason: collision with root package name */
    public int f409197k;

    /* renamed from: l, reason: collision with root package name */
    public long f409198l;

    /* renamed from: m, reason: collision with root package name */
    public long f409199m;

    /* renamed from: n, reason: collision with root package name */
    public long f409200n;

    /* renamed from: o, reason: collision with root package name */
    public long f409201o;

    /* renamed from: p, reason: collision with root package name */
    public long f409202p;

    /* renamed from: q, reason: collision with root package name */
    public long f409203q;

    /* renamed from: r, reason: collision with root package name */
    public long f409204r;

    /* renamed from: s, reason: collision with root package name */
    public long f409205s;

    /* renamed from: t, reason: collision with root package name */
    public long f409206t;

    /* renamed from: u, reason: collision with root package name */
    public long f409207u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f409208v;

    /* renamed from: w, reason: collision with root package name */
    public long f409209w;

    /* renamed from: x, reason: collision with root package name */
    public long f409210x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f409211y;

    public k5(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, long j18, long j19, long j27, long j28, long j29, long j37, int i17, long j38, long j39, long j47, long j48, long j49, long j57, long j58, long j59, long j66, long j67, java.util.HashMap hashMap, long j68, long j69, java.lang.String str4, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String liveId = (i18 & 1) != 0 ? "" : str;
        java.lang.String feedId = (i18 & 2) != 0 ? "" : str2;
        java.lang.String description = (i18 & 4) != 0 ? "" : str3;
        long j76 = (i18 & 8) != 0 ? 0L : j17;
        long j77 = (i18 & 16) != 0 ? 0L : j18;
        long j78 = (i18 & 32) != 0 ? 0L : j19;
        long j79 = (i18 & 64) != 0 ? 0L : j27;
        long j86 = (i18 & 128) != 0 ? 0L : j28;
        long j87 = (i18 & 256) != 0 ? 0L : j29;
        long j88 = (i18 & 512) != 0 ? 0L : j37;
        int i19 = (i18 & 1024) != 0 ? 0 : i17;
        long j89 = (i18 & 2048) != 0 ? 0L : j38;
        long j96 = (i18 & 4096) != 0 ? 0L : j39;
        long j97 = (i18 & 8192) != 0 ? 0L : j47;
        long j98 = (i18 & 16384) != 0 ? 0L : j48;
        long j99 = (32768 & i18) != 0 ? 0L : j49;
        long j100 = (65536 & i18) != 0 ? 0L : j57;
        long j101 = (131072 & i18) != 0 ? 0L : j58;
        long j102 = (262144 & i18) != 0 ? 0L : j59;
        long j103 = (524288 & i18) != 0 ? 0L : j66;
        long j104 = (1048576 & i18) != 0 ? 0L : j67;
        java.util.HashMap promoteGoods = (2097152 & i18) != 0 ? new java.util.HashMap() : hashMap;
        long j105 = (i18 & 4194304) != 0 ? 0L : j68;
        long j106 = (i18 & 8388608) != 0 ? 0L : j69;
        java.lang.String shopWindowId = (i18 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) != 0 ? "" : str4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveId, "liveId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(description, "description");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(promoteGoods, "promoteGoods");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shopWindowId, "shopWindowId");
        this.f409187a = liveId;
        this.f409188b = feedId;
        this.f409189c = description;
        this.f409190d = j76;
        this.f409191e = j77;
        this.f409192f = j78;
        this.f409193g = j79;
        this.f409194h = j86;
        this.f409195i = j87;
        this.f409196j = j88;
        this.f409197k = i19;
        this.f409198l = j89;
        this.f409199m = j96;
        this.f409200n = j97;
        this.f409201o = j98;
        this.f409202p = j99;
        this.f409203q = j100;
        this.f409204r = j101;
        this.f409205s = j102;
        this.f409206t = j103;
        this.f409207u = j104;
        this.f409208v = promoteGoods;
        this.f409209w = j105;
        this.f409210x = j106;
        this.f409211y = shopWindowId;
    }

    public final long a() {
        return this.f409198l;
    }

    public final long b() {
        return this.f409209w;
    }

    public final void c(long j17) {
        this.f409198l = j17;
    }

    public final void d(long j17) {
        this.f409209w = j17;
    }

    /* renamed from: equals */
    public boolean m147606xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml2.k5)) {
            return false;
        }
        ml2.k5 k5Var = (ml2.k5) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409187a, k5Var.f409187a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409188b, k5Var.f409188b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409189c, k5Var.f409189c) && this.f409190d == k5Var.f409190d && this.f409191e == k5Var.f409191e && this.f409192f == k5Var.f409192f && this.f409193g == k5Var.f409193g && this.f409194h == k5Var.f409194h && this.f409195i == k5Var.f409195i && this.f409196j == k5Var.f409196j && this.f409197k == k5Var.f409197k && this.f409198l == k5Var.f409198l && this.f409199m == k5Var.f409199m && this.f409200n == k5Var.f409200n && this.f409201o == k5Var.f409201o && this.f409202p == k5Var.f409202p && this.f409203q == k5Var.f409203q && this.f409204r == k5Var.f409204r && this.f409205s == k5Var.f409205s && this.f409206t == k5Var.f409206t && this.f409207u == k5Var.f409207u && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409208v, k5Var.f409208v) && this.f409209w == k5Var.f409209w && this.f409210x == k5Var.f409210x && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409211y, k5Var.f409211y);
    }

    /* renamed from: hashCode */
    public int m147607x8cdac1b() {
        return (((((((((((((((((((((((((((((((((((((((((((((((this.f409187a.hashCode() * 31) + this.f409188b.hashCode()) * 31) + this.f409189c.hashCode()) * 31) + java.lang.Long.hashCode(this.f409190d)) * 31) + java.lang.Long.hashCode(this.f409191e)) * 31) + java.lang.Long.hashCode(this.f409192f)) * 31) + java.lang.Long.hashCode(this.f409193g)) * 31) + java.lang.Long.hashCode(this.f409194h)) * 31) + java.lang.Long.hashCode(this.f409195i)) * 31) + java.lang.Long.hashCode(this.f409196j)) * 31) + java.lang.Integer.hashCode(this.f409197k)) * 31) + java.lang.Long.hashCode(this.f409198l)) * 31) + java.lang.Long.hashCode(this.f409199m)) * 31) + java.lang.Long.hashCode(this.f409200n)) * 31) + java.lang.Long.hashCode(this.f409201o)) * 31) + java.lang.Long.hashCode(this.f409202p)) * 31) + java.lang.Long.hashCode(this.f409203q)) * 31) + java.lang.Long.hashCode(this.f409204r)) * 31) + java.lang.Long.hashCode(this.f409205s)) * 31) + java.lang.Long.hashCode(this.f409206t)) * 31) + java.lang.Long.hashCode(this.f409207u)) * 31) + this.f409208v.hashCode()) * 31) + java.lang.Long.hashCode(this.f409209w)) * 31) + java.lang.Long.hashCode(this.f409210x)) * 31) + this.f409211y.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m147608x9616526c() {
        return "LiveStaticsData_21056(liveId=" + this.f409187a + ", feedId=" + this.f409188b + ", description=" + this.f409189c + ", liveStartTimeMs=" + this.f409190d + ", liveEndTimeMs=" + this.f409191e + ", oriFansCount=" + this.f409192f + ", liveDurationSeconds=" + this.f409193g + ", audienceCount=" + this.f409194h + ", likeCount=" + this.f409195i + ", newFansNum=" + this.f409196j + ", errorCode=" + this.f409197k + ", floatingCount=" + this.f409198l + ", shareSnsCount=" + this.f409199m + ", shareSessionCount=" + this.f409200n + ", exchangeCameraCount=" + this.f409201o + ", complainCount=" + this.f409202p + ", allCommentCloseCount=" + this.f409203q + ", allCommentOpenCount=" + this.f409204r + ", personalCommentCloseCount=" + this.f409205s + ", personalCommentOpenCount=" + this.f409206t + ", kickOutCount=" + this.f409207u + ", promoteGoods=" + this.f409208v + ", topComment=" + this.f409209w + ", tickleTimes=" + this.f409210x + ", shopWindowId=" + this.f409211y + ')';
    }
}
