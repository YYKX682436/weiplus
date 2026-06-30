package ml2;

/* loaded from: classes3.dex */
public final class f0 {
    public static final ml2.d0 A = new ml2.d0(null);

    /* renamed from: a, reason: collision with root package name */
    public final so2.j5 f408929a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f408930b;

    /* renamed from: c, reason: collision with root package name */
    public final int f408931c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f408932d;

    /* renamed from: e, reason: collision with root package name */
    public final long f408933e;

    /* renamed from: f, reason: collision with root package name */
    public final long f408934f;

    /* renamed from: g, reason: collision with root package name */
    public ml2.x1 f408935g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f408936h;

    /* renamed from: i, reason: collision with root package name */
    public final int f408937i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f408938j;

    /* renamed from: k, reason: collision with root package name */
    public final ml2.e0 f408939k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f408940l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f408941m;

    /* renamed from: n, reason: collision with root package name */
    public final int f408942n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f408943o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f408944p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f408945q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f408946r;

    /* renamed from: s, reason: collision with root package name */
    public final long f408947s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f408948t;

    /* renamed from: u, reason: collision with root package name */
    public final int f408949u;

    /* renamed from: v, reason: collision with root package name */
    public final long f408950v;

    /* renamed from: w, reason: collision with root package name */
    public final int f408951w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f408952x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f408953y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Integer f408954z;

    public f0(so2.j5 j5Var, java.lang.String str, int i17, java.lang.String feedId, long j17, long j18, ml2.x1 actionType, java.lang.String commentscene, int i18, java.lang.String str2, ml2.e0 e0Var, boolean z17, boolean z18, int i19, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j19, java.lang.String str7, int i27, long j27, int i28, java.lang.String str8, java.lang.String str9, java.lang.Integer num, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String str10 = (i29 & 2) != 0 ? "" : str;
        int i37 = (i29 & 256) != 0 ? -1 : i18;
        java.lang.String nickName = (i29 & 512) != 0 ? "" : str2;
        ml2.e0 liveStatus = (i29 & 1024) != 0 ? ml2.e0.f408902d : e0Var;
        boolean z19 = (i29 & 2048) != 0 ? false : z17;
        boolean z27 = (i29 & 4096) != 0 ? false : z18;
        int i38 = (i29 & 8192) != 0 ? 0 : i19;
        java.lang.String clickTabContextId = (i29 & 16384) != 0 ? "" : str3;
        java.lang.String clickSubTabContextId = (32768 & i29) != 0 ? "" : str4;
        java.lang.String str11 = (i29 & 65536) != 0 ? "" : str5;
        java.lang.String str12 = (i29 & 131072) != 0 ? "" : str6;
        long j28 = (i29 & 262144) != 0 ? 0L : j19;
        java.lang.String str13 = (i29 & 524288) != 0 ? "" : str7;
        int i39 = (i29 & 1048576) != 0 ? 0 : i27;
        long j29 = (i29 & 2097152) != 0 ? 0L : j27;
        int i47 = (i29 & 4194304) != 0 ? 0 : i28;
        java.lang.String gmsgId = (i29 & 8388608) == 0 ? str8 : "";
        java.lang.String str14 = (i29 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) != 0 ? null : str9;
        java.lang.Integer num2 = (i29 & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432) != 0 ? 0 : num;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveStatus, "liveStatus");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickTabContextId, "clickTabContextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickSubTabContextId, "clickSubTabContextId");
        java.lang.Integer num3 = num2;
        java.lang.String chnlExtra = str11;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chnlExtra, "chnlExtra");
        java.lang.String talkerUsername = str13;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerUsername, "talkerUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gmsgId, "gmsgId");
        this.f408929a = j5Var;
        this.f408930b = str10;
        this.f408931c = i17;
        this.f408932d = feedId;
        this.f408933e = j17;
        this.f408934f = j18;
        this.f408935g = actionType;
        this.f408936h = commentscene;
        this.f408937i = i37;
        this.f408938j = nickName;
        this.f408939k = liveStatus;
        this.f408940l = z19;
        this.f408941m = z27;
        this.f408942n = i38;
        this.f408943o = clickTabContextId;
        this.f408944p = clickSubTabContextId;
        this.f408945q = str11;
        this.f408946r = str12;
        this.f408947s = j28;
        this.f408948t = talkerUsername;
        this.f408949u = i39;
        this.f408950v = j29;
        this.f408951w = i47;
        this.f408952x = gmsgId;
        this.f408953y = str14;
        this.f408954z = num3;
    }

    /* renamed from: equals */
    public boolean m147503xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml2.f0)) {
            return false;
        }
        ml2.f0 f0Var = (ml2.f0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408929a, f0Var.f408929a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408930b, f0Var.f408930b) && this.f408931c == f0Var.f408931c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408932d, f0Var.f408932d) && this.f408933e == f0Var.f408933e && this.f408934f == f0Var.f408934f && this.f408935g == f0Var.f408935g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408936h, f0Var.f408936h) && this.f408937i == f0Var.f408937i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408938j, f0Var.f408938j) && this.f408939k == f0Var.f408939k && this.f408940l == f0Var.f408940l && this.f408941m == f0Var.f408941m && this.f408942n == f0Var.f408942n && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408943o, f0Var.f408943o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408944p, f0Var.f408944p) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408945q, f0Var.f408945q) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408946r, f0Var.f408946r) && this.f408947s == f0Var.f408947s && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408948t, f0Var.f408948t) && this.f408949u == f0Var.f408949u && this.f408950v == f0Var.f408950v && this.f408951w == f0Var.f408951w && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408952x, f0Var.f408952x) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408953y, f0Var.f408953y) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408954z, f0Var.f408954z);
    }

    /* renamed from: hashCode */
    public int m147504x8cdac1b() {
        so2.j5 j5Var = this.f408929a;
        int hashCode = (j5Var == null ? 0 : j5Var.hashCode()) * 31;
        java.lang.String str = this.f408930b;
        int hashCode2 = (((((((((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f408931c)) * 31) + this.f408932d.hashCode()) * 31) + java.lang.Long.hashCode(this.f408933e)) * 31) + java.lang.Long.hashCode(this.f408934f)) * 31) + this.f408935g.hashCode()) * 31) + this.f408936h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f408937i)) * 31) + this.f408938j.hashCode()) * 31) + this.f408939k.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f408940l)) * 31) + java.lang.Boolean.hashCode(this.f408941m)) * 31) + java.lang.Integer.hashCode(this.f408942n)) * 31) + this.f408943o.hashCode()) * 31) + this.f408944p.hashCode()) * 31) + this.f408945q.hashCode()) * 31;
        java.lang.String str2 = this.f408946r;
        int hashCode3 = (((((((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Long.hashCode(this.f408947s)) * 31) + this.f408948t.hashCode()) * 31) + java.lang.Integer.hashCode(this.f408949u)) * 31) + java.lang.Long.hashCode(this.f408950v)) * 31) + java.lang.Integer.hashCode(this.f408951w)) * 31) + this.f408952x.hashCode()) * 31;
        java.lang.String str3 = this.f408953y;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Integer num = this.f408954z;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m147505x9616526c() {
        return "HellLiveFeed(feed=" + this.f408929a + ", userName=" + this.f408930b + ", pos=" + this.f408931c + ", feedId=" + this.f408932d + ", feedIdL=" + this.f408933e + ", liveId=" + this.f408934f + ", actionType=" + this.f408935g + ", commentscene=" + this.f408936h + ", onlineNum=" + this.f408937i + ", nickName=" + this.f408938j + ", liveStatus=" + this.f408939k + ", isLiveCard=" + this.f408940l + ", isSingleLiveAvatar=" + this.f408941m + ", shareType=" + this.f408942n + ", clickTabContextId=" + this.f408943o + ", clickSubTabContextId=" + this.f408944p + ", chnlExtra=" + this.f408945q + ", fromUsername=" + this.f408946r + ", enterIconType=" + this.f408947s + ", talkerUsername=" + this.f408948t + ", fromFeedType=" + this.f408949u + ", fromFeedId=" + this.f408950v + ", fromCommentScene=" + this.f408951w + ", gmsgId=" + this.f408952x + ", contextId=" + this.f408953y + ", liveShareScene=" + this.f408954z + ')';
    }
}
