package ml2;

/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f409689a;

    /* renamed from: b, reason: collision with root package name */
    public final long f409690b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f409691c;

    /* renamed from: d, reason: collision with root package name */
    public final long f409692d;

    /* renamed from: e, reason: collision with root package name */
    public final long f409693e;

    /* renamed from: f, reason: collision with root package name */
    public final ml2.x1 f409694f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f409695g;

    /* renamed from: h, reason: collision with root package name */
    public final long f409696h;

    /* renamed from: i, reason: collision with root package name */
    public final long f409697i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f409698j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f409699k;

    /* renamed from: l, reason: collision with root package name */
    public final long f409700l;

    /* renamed from: m, reason: collision with root package name */
    public final ml2.i4 f409701m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f409702n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f409703o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f409704p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f409705q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f409706r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f409707s;

    public w0(long j17, long j18, java.lang.String str, long j19, long j27, ml2.x1 actionType, java.lang.String str2, long j28, long j29, java.lang.String str3, java.lang.String str4, long j37, ml2.i4 enterType, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        long j38 = (i17 & 1) != 0 ? 0L : j17;
        long j39 = (i17 & 2) != 0 ? 0L : j18;
        java.lang.String userName = (i17 & 4) != 0 ? "" : str;
        long j47 = (i17 & 8) != 0 ? 0L : j19;
        long j48 = (i17 & 16) != 0 ? -1L : j27;
        java.lang.String commentscene = (i17 & 64) != 0 ? "" : str2;
        long j49 = (i17 & 128) != 0 ? 0L : j28;
        long j57 = (i17 & 256) != 0 ? 0L : j29;
        java.lang.String shareUserName = (i17 & 512) != 0 ? "" : str3;
        java.lang.String snsFeedid = (i17 & 1024) != 0 ? "" : str4;
        long j58 = j48;
        java.lang.String sessionBuf = (i17 & 8192) != 0 ? "" : str5;
        java.lang.String clickTabContextId = (i17 & 16384) != 0 ? "" : str6;
        long j59 = j47;
        java.lang.String clickSubTabContextId = (i17 & 32768) != 0 ? "" : str7;
        java.lang.String chnlExtra = (65536 & i17) != 0 ? "" : str8;
        long j66 = j39;
        java.lang.String talkerUsername = (i17 & 131072) != 0 ? "" : str9;
        java.lang.String gmsgId = (i17 & 262144) != 0 ? "" : str10;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareUserName, "shareUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsFeedid, "snsFeedid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterType, "enterType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionBuf, "sessionBuf");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickTabContextId, "clickTabContextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickSubTabContextId, "clickSubTabContextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chnlExtra, "chnlExtra");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerUsername, "talkerUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gmsgId, "gmsgId");
        this.f409689a = j38;
        this.f409690b = j66;
        this.f409691c = userName;
        this.f409692d = j59;
        this.f409693e = j58;
        this.f409694f = actionType;
        this.f409695g = commentscene;
        this.f409696h = j49;
        this.f409697i = j57;
        this.f409698j = shareUserName;
        this.f409699k = snsFeedid;
        this.f409700l = j37;
        this.f409701m = enterType;
        this.f409702n = sessionBuf;
        this.f409703o = clickTabContextId;
        this.f409704p = clickSubTabContextId;
        this.f409705q = chnlExtra;
        this.f409706r = talkerUsername;
        this.f409707s = gmsgId;
    }

    /* renamed from: equals */
    public boolean m147775xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml2.w0)) {
            return false;
        }
        ml2.w0 w0Var = (ml2.w0) obj;
        return this.f409689a == w0Var.f409689a && this.f409690b == w0Var.f409690b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409691c, w0Var.f409691c) && this.f409692d == w0Var.f409692d && this.f409693e == w0Var.f409693e && this.f409694f == w0Var.f409694f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409695g, w0Var.f409695g) && this.f409696h == w0Var.f409696h && this.f409697i == w0Var.f409697i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409698j, w0Var.f409698j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409699k, w0Var.f409699k) && this.f409700l == w0Var.f409700l && this.f409701m == w0Var.f409701m && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409702n, w0Var.f409702n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409703o, w0Var.f409703o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409704p, w0Var.f409704p) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409705q, w0Var.f409705q) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409706r, w0Var.f409706r) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409707s, w0Var.f409707s);
    }

    /* renamed from: hashCode */
    public int m147776x8cdac1b() {
        return (((((((((((((((((((((((((((((((((((java.lang.Long.hashCode(this.f409689a) * 31) + java.lang.Long.hashCode(this.f409690b)) * 31) + this.f409691c.hashCode()) * 31) + java.lang.Long.hashCode(this.f409692d)) * 31) + java.lang.Long.hashCode(this.f409693e)) * 31) + this.f409694f.hashCode()) * 31) + this.f409695g.hashCode()) * 31) + java.lang.Long.hashCode(this.f409696h)) * 31) + java.lang.Long.hashCode(this.f409697i)) * 31) + this.f409698j.hashCode()) * 31) + this.f409699k.hashCode()) * 31) + java.lang.Long.hashCode(this.f409700l)) * 31) + this.f409701m.hashCode()) * 31) + this.f409702n.hashCode()) * 31) + this.f409703o.hashCode()) * 31) + this.f409704p.hashCode()) * 31) + this.f409705q.hashCode()) * 31) + this.f409706r.hashCode()) * 31) + this.f409707s.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m147777x9616526c() {
        return "HellVisitorEnterData(feedId=" + this.f409689a + ", liveId=" + this.f409690b + ", userName=" + this.f409691c + ", index=" + this.f409692d + ", onlineNum=" + this.f409693e + ", actionType=" + this.f409694f + ", commentscene=" + this.f409695g + ", enterStatus=" + this.f409696h + ", shareType=" + this.f409697i + ", shareUserName=" + this.f409698j + ", snsFeedid=" + this.f409699k + ", enterTime=" + this.f409700l + ", enterType=" + this.f409701m + ", sessionBuf=" + this.f409702n + ", clickTabContextId=" + this.f409703o + ", clickSubTabContextId=" + this.f409704p + ", chnlExtra=" + this.f409705q + ", talkerUsername=" + this.f409706r + ", gmsgId=" + this.f409707s + ')';
    }
}
