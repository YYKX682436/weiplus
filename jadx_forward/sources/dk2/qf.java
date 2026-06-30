package dk2;

/* loaded from: classes3.dex */
public final class qf implements java.io.Serializable {
    public java.lang.String A;
    public int B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public boolean F;
    public final java.util.List G;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Long f315503d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f315504e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Long f315505f;

    /* renamed from: g, reason: collision with root package name */
    public int f315506g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f315507h;

    /* renamed from: i, reason: collision with root package name */
    public int f315508i;

    /* renamed from: m, reason: collision with root package name */
    public int f315509m;

    /* renamed from: n, reason: collision with root package name */
    public int f315510n;

    /* renamed from: o, reason: collision with root package name */
    public int f315511o;

    /* renamed from: p, reason: collision with root package name */
    public long f315512p;

    /* renamed from: q, reason: collision with root package name */
    public long f315513q;

    /* renamed from: r, reason: collision with root package name */
    public long f315514r;

    /* renamed from: s, reason: collision with root package name */
    public long f315515s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f315516t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f315517u;

    /* renamed from: v, reason: collision with root package name */
    public long f315518v;

    /* renamed from: w, reason: collision with root package name */
    public dk2.na f315519w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f315520x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f315521y;

    /* renamed from: z, reason: collision with root package name */
    public long f315522z;

    public qf(java.lang.Long l17, java.lang.String str, java.lang.Long l18, int i17, boolean z17, int i18, int i19, int i27, int i28, long j17, long j18, long j19, long j27, boolean z18, boolean z19, long j28, dk2.na naVar, boolean z27, boolean z28, long j29, java.lang.String str2, int i29, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z29, java.util.List list, int i37, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.Long l19 = (i37 & 1) != 0 ? null : l17;
        java.lang.String str6 = (i37 & 2) != 0 ? null : str;
        java.lang.Long l27 = (i37 & 4) != 0 ? null : l18;
        int i38 = (i37 & 8) != 0 ? 0 : i17;
        boolean z37 = (i37 & 16) != 0 ? false : z17;
        int i39 = (i37 & 32) != 0 ? 0 : i18;
        int i47 = (i37 & 64) != 0 ? 0 : i19;
        int i48 = (i37 & 128) != 0 ? 0 : i27;
        int i49 = (i37 & 256) != 0 ? 0 : i28;
        long j37 = (i37 & 512) != 0 ? 0L : j17;
        long j38 = (i37 & 1024) != 0 ? 0L : j18;
        long j39 = (i37 & 2048) != 0 ? 0L : j19;
        long j47 = (i37 & 4096) != 0 ? 0L : j27;
        boolean z38 = (i37 & 8192) != 0 ? false : z18;
        boolean z39 = (i37 & 16384) != 0 ? false : z19;
        long j48 = (i37 & 32768) != 0 ? 0L : j28;
        dk2.na curStatus = (i37 & 65536) != 0 ? dk2.na.f315339e : naVar;
        boolean z47 = (i37 & 131072) != 0 ? false : z27;
        boolean z48 = (i37 & 262144) != 0 ? false : z28;
        long j49 = (i37 & 524288) != 0 ? 0L : j29;
        java.lang.String str7 = (i37 & 1048576) != 0 ? null : str2;
        int i57 = (i37 & 2097152) != 0 ? -1 : i29;
        java.lang.String str8 = (i37 & 4194304) != 0 ? null : str3;
        java.lang.String str9 = (i37 & 8388608) != 0 ? null : str4;
        java.lang.String str10 = (i37 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) != 0 ? null : str5;
        boolean z49 = (i37 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432) != 0 ? false : z29;
        java.util.List micReplayInfoList = (i37 & 67108864) != 0 ? new java.util.ArrayList() : list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curStatus, "curStatus");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micReplayInfoList, "micReplayInfoList");
        this.f315503d = l19;
        this.f315504e = str6;
        this.f315505f = l27;
        this.f315506g = i38;
        this.f315507h = z37;
        this.f315508i = i39;
        this.f315509m = i47;
        this.f315510n = i48;
        this.f315511o = i49;
        this.f315512p = j37;
        this.f315513q = j38;
        this.f315514r = j39;
        this.f315515s = j47;
        this.f315516t = z38;
        this.f315517u = z39;
        this.f315518v = j48;
        this.f315519w = curStatus;
        this.f315520x = z47;
        this.f315521y = z48;
        this.f315522z = j49;
        this.A = str7;
        this.B = i57;
        this.C = str8;
        this.D = str9;
        this.E = str10;
        this.F = z49;
        this.G = micReplayInfoList;
    }

    /* renamed from: equals */
    public boolean m124641xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.qf)) {
            return false;
        }
        dk2.qf qfVar = (dk2.qf) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315503d, qfVar.f315503d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315504e, qfVar.f315504e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315505f, qfVar.f315505f) && this.f315506g == qfVar.f315506g && this.f315507h == qfVar.f315507h && this.f315508i == qfVar.f315508i && this.f315509m == qfVar.f315509m && this.f315510n == qfVar.f315510n && this.f315511o == qfVar.f315511o && this.f315512p == qfVar.f315512p && this.f315513q == qfVar.f315513q && this.f315514r == qfVar.f315514r && this.f315515s == qfVar.f315515s && this.f315516t == qfVar.f315516t && this.f315517u == qfVar.f315517u && this.f315518v == qfVar.f315518v && this.f315519w == qfVar.f315519w && this.f315520x == qfVar.f315520x && this.f315521y == qfVar.f315521y && this.f315522z == qfVar.f315522z && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.A, qfVar.A) && this.B == qfVar.B && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.C, qfVar.C) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.D, qfVar.D) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.E, qfVar.E) && this.F == qfVar.F && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.G, qfVar.G);
    }

    /* renamed from: hashCode */
    public int m124642x8cdac1b() {
        java.lang.Long l17 = this.f315503d;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.String str = this.f315504e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Long l18 = this.f315505f;
        int hashCode3 = (((((((((((((((((((((((((((((((((((hashCode2 + (l18 == null ? 0 : l18.hashCode())) * 31) + java.lang.Integer.hashCode(this.f315506g)) * 31) + java.lang.Boolean.hashCode(this.f315507h)) * 31) + java.lang.Integer.hashCode(this.f315508i)) * 31) + java.lang.Integer.hashCode(this.f315509m)) * 31) + java.lang.Integer.hashCode(this.f315510n)) * 31) + java.lang.Integer.hashCode(this.f315511o)) * 31) + java.lang.Long.hashCode(this.f315512p)) * 31) + java.lang.Long.hashCode(this.f315513q)) * 31) + java.lang.Long.hashCode(this.f315514r)) * 31) + java.lang.Long.hashCode(this.f315515s)) * 31) + java.lang.Boolean.hashCode(this.f315516t)) * 31) + java.lang.Boolean.hashCode(this.f315517u)) * 31) + java.lang.Long.hashCode(this.f315518v)) * 31) + this.f315519w.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f315520x)) * 31) + java.lang.Boolean.hashCode(this.f315521y)) * 31) + java.lang.Long.hashCode(this.f315522z)) * 31;
        java.lang.String str2 = this.A;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Integer.hashCode(this.B)) * 31;
        java.lang.String str3 = this.C;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.D;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.E;
        return ((((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.F)) * 31) + this.G.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124643x9616526c() {
        return "FinderLiveVisitorMicReplayData(liveId=" + this.f315503d + ", micId=" + this.f315504e + ", objectId=" + this.f315505f + ", minMicDuration=" + this.f315506g + ", haveChangeLiveMode=" + this.f315507h + ", beginLiveMode=" + this.f315508i + ", beginLiveSubMode=" + this.f315509m + ", curLiveMode=" + this.f315510n + ", curLiveSubMode=" + this.f315511o + ", duration=" + this.f315512p + ", uv=" + this.f315513q + ", heatCount=" + this.f315514r + ", likeCount=" + this.f315515s + ", enableGenerateReplay=" + this.f315516t + ", enableGenerateKTVReplay=" + this.f315517u + ", songsCount=" + this.f315518v + ", curStatus=" + this.f315519w + ", isVisitorMicReplayReplayVisible=" + this.f315520x + ", isVisitorLastConnectingMic=" + this.f315521y + ", visitorLastConnectingMicTime=" + this.f315522z + ", selfHeadUrl=" + this.A + ", selfRoleType=" + this.B + ", selfNickname=" + this.C + ", anchorHeadUrl=" + this.D + ", anchorNickname=" + this.E + ", isPurchaseMic=" + this.F + ", micReplayInfoList=" + this.G + ')';
    }
}
