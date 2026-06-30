package km2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f390584a;

    /* renamed from: b, reason: collision with root package name */
    public final int f390585b;

    /* renamed from: c, reason: collision with root package name */
    public final long f390586c;

    /* renamed from: d, reason: collision with root package name */
    public final int f390587d;

    /* renamed from: e, reason: collision with root package name */
    public final long f390588e;

    /* renamed from: f, reason: collision with root package name */
    public final int f390589f;

    /* renamed from: g, reason: collision with root package name */
    public final int f390590g;

    /* renamed from: h, reason: collision with root package name */
    public final long f390591h;

    /* renamed from: i, reason: collision with root package name */
    public final int f390592i;

    /* renamed from: j, reason: collision with root package name */
    public final long f390593j;

    /* renamed from: k, reason: collision with root package name */
    public final long f390594k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f390595l;

    /* renamed from: m, reason: collision with root package name */
    public final long f390596m;

    /* renamed from: n, reason: collision with root package name */
    public final long f390597n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f390598o;

    /* renamed from: p, reason: collision with root package name */
    public final int f390599p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f390600q;

    /* renamed from: r, reason: collision with root package name */
    public final int f390601r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f390602s;

    /* renamed from: t, reason: collision with root package name */
    public r45.nw1 f390603t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.sl1 f390604u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.l71 f390605v;

    /* renamed from: w, reason: collision with root package name */
    public r45.pf2 f390606w;

    public b(int i17, int i18, long j17, int i19, long j18, int i27, int i28, long j19, int i29, long j27, long j28, boolean z17, long j29, long j37, java.util.LinkedList linkedList, int i37, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, int i38, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622, r45.nw1 nw1Var, r45.sl1 sl1Var, r45.l71 l71Var, r45.pf2 pf2Var, int i39, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i47 = (i39 & 1) != 0 ? 0 : i17;
        int i48 = (i39 & 2) != 0 ? 0 : i18;
        long j38 = (i39 & 4) != 0 ? 0L : j17;
        int i49 = (i39 & 8) != 0 ? 0 : i19;
        long j39 = (i39 & 16) != 0 ? 0L : j18;
        int i57 = (i39 & 32) != 0 ? 0 : i27;
        int i58 = (i39 & 64) != 0 ? 0 : i28;
        long j47 = (i39 & 128) != 0 ? 0L : j19;
        int i59 = (i39 & 256) != 0 ? 0 : i29;
        long j48 = (i39 & 512) != 0 ? 0L : j27;
        long j49 = (i39 & 1024) != 0 ? 0L : j28;
        boolean z18 = (i39 & 2048) != 0 ? false : z17;
        long j57 = (i39 & 4096) != 0 ? 0L : j29;
        long j58 = (i39 & 8192) != 0 ? 0L : j37;
        java.util.LinkedList jumpInfos = (i39 & 16384) != 0 ? new java.util.LinkedList() : linkedList;
        int i66 = (i39 & 32768) != 0 ? 0 : i37;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28623 = (i39 & 65536) != 0 ? null : c19786x6a1e2862;
        int i67 = (i39 & 131072) != 0 ? 0 : i38;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28624 = (i39 & 262144) != 0 ? null : c19786x6a1e28622;
        r45.nw1 nw1Var2 = (i39 & 524288) != 0 ? null : nw1Var;
        r45.sl1 sl1Var2 = (i39 & 1048576) != 0 ? null : sl1Var;
        r45.l71 l71Var2 = (i39 & 2097152) != 0 ? null : l71Var;
        r45.pf2 pf2Var2 = (i39 & 4194304) != 0 ? null : pf2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfos, "jumpInfos");
        this.f390584a = i47;
        this.f390585b = i48;
        this.f390586c = j38;
        this.f390587d = i49;
        this.f390588e = j39;
        this.f390589f = i57;
        this.f390590g = i58;
        this.f390591h = j47;
        this.f390592i = i59;
        this.f390593j = j48;
        this.f390594k = j49;
        this.f390595l = z18;
        this.f390596m = j57;
        this.f390597n = j58;
        this.f390598o = jumpInfos;
        this.f390599p = i66;
        this.f390600q = c19786x6a1e28623;
        this.f390601r = i67;
        this.f390602s = c19786x6a1e28624;
        this.f390603t = nw1Var2;
        this.f390604u = sl1Var2;
        this.f390605v = l71Var2;
        this.f390606w = pf2Var2;
    }

    /* renamed from: equals */
    public boolean m143644xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.b)) {
            return false;
        }
        km2.b bVar = (km2.b) obj;
        return this.f390584a == bVar.f390584a && this.f390585b == bVar.f390585b && this.f390586c == bVar.f390586c && this.f390587d == bVar.f390587d && this.f390588e == bVar.f390588e && this.f390589f == bVar.f390589f && this.f390590g == bVar.f390590g && this.f390591h == bVar.f390591h && this.f390592i == bVar.f390592i && this.f390593j == bVar.f390593j && this.f390594k == bVar.f390594k && this.f390595l == bVar.f390595l && this.f390596m == bVar.f390596m && this.f390597n == bVar.f390597n && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390598o, bVar.f390598o) && this.f390599p == bVar.f390599p && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390600q, bVar.f390600q) && this.f390601r == bVar.f390601r && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390602s, bVar.f390602s) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390603t, bVar.f390603t) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390604u, bVar.f390604u) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390605v, bVar.f390605v) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390606w, bVar.f390606w);
    }

    /* renamed from: hashCode */
    public int m143645x8cdac1b() {
        int hashCode = ((((((((((((((((((((((((((((((java.lang.Integer.hashCode(this.f390584a) * 31) + java.lang.Integer.hashCode(this.f390585b)) * 31) + java.lang.Long.hashCode(this.f390586c)) * 31) + java.lang.Integer.hashCode(this.f390587d)) * 31) + java.lang.Long.hashCode(this.f390588e)) * 31) + java.lang.Integer.hashCode(this.f390589f)) * 31) + java.lang.Integer.hashCode(this.f390590g)) * 31) + java.lang.Long.hashCode(this.f390591h)) * 31) + java.lang.Integer.hashCode(this.f390592i)) * 31) + java.lang.Long.hashCode(this.f390593j)) * 31) + java.lang.Long.hashCode(this.f390594k)) * 31) + java.lang.Boolean.hashCode(this.f390595l)) * 31) + java.lang.Long.hashCode(this.f390596m)) * 31) + java.lang.Long.hashCode(this.f390597n)) * 31) + this.f390598o.hashCode()) * 31) + java.lang.Integer.hashCode(this.f390599p)) * 31;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f390600q;
        int hashCode2 = (((hashCode + (c19786x6a1e2862 == null ? 0 : c19786x6a1e2862.hashCode())) * 31) + java.lang.Integer.hashCode(this.f390601r)) * 31;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = this.f390602s;
        int hashCode3 = (hashCode2 + (c19786x6a1e28622 == null ? 0 : c19786x6a1e28622.hashCode())) * 31;
        r45.nw1 nw1Var = this.f390603t;
        int hashCode4 = (hashCode3 + (nw1Var == null ? 0 : nw1Var.hashCode())) * 31;
        r45.sl1 sl1Var = this.f390604u;
        int hashCode5 = (hashCode4 + (sl1Var == null ? 0 : sl1Var.hashCode())) * 31;
        r45.l71 l71Var = this.f390605v;
        int hashCode6 = (hashCode5 + (l71Var == null ? 0 : l71Var.hashCode())) * 31;
        r45.pf2 pf2Var = this.f390606w;
        return hashCode6 + (pf2Var != null ? pf2Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m143646x9616526c() {
        return "AnchorFinishInfo(duration=" + this.f390584a + ", audienceNum=" + this.f390585b + ", likeCount=" + this.f390586c + ", newFans=" + this.f390587d + ", wecoinHot=" + this.f390588e + ", maxOnlineCnt=" + this.f390589f + ", avgDuration=" + this.f390590g + ", totalGift=" + this.f390591h + ", bizLiveNewFansNum=" + this.f390592i + ",replayPrivilege:" + this.f390599p + ')';
    }
}
