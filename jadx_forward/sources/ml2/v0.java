package ml2;

/* loaded from: classes3.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f409655a;

    /* renamed from: b, reason: collision with root package name */
    public final long f409656b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f409657c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f409658d;

    /* renamed from: e, reason: collision with root package name */
    public final long f409659e;

    /* renamed from: f, reason: collision with root package name */
    public final long f409660f;

    /* renamed from: g, reason: collision with root package name */
    public final ml2.x1 f409661g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f409662h;

    /* renamed from: i, reason: collision with root package name */
    public final long f409663i;

    /* renamed from: j, reason: collision with root package name */
    public final long f409664j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f409665k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f409666l;

    /* renamed from: m, reason: collision with root package name */
    public final int f409667m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f409668n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f409669o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f409670p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f409671q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f409672r;

    public v0(long j17, long j18, java.lang.String str, java.lang.String str2, long j19, long j27, ml2.x1 actionType, java.lang.String str3, long j28, long j29, java.lang.String str4, java.lang.String str5, int i17, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        long j37 = (i18 & 1) != 0 ? 0L : j17;
        long j38 = (i18 & 2) != 0 ? 0L : j18;
        java.lang.String str10 = (i18 & 4) != 0 ? null : str;
        java.lang.String userName = (i18 & 8) != 0 ? "" : str2;
        long j39 = (i18 & 16) != 0 ? 0L : j19;
        long j47 = (i18 & 32) != 0 ? -1L : j27;
        java.lang.String commentscene = (i18 & 128) != 0 ? "" : str3;
        long j48 = (i18 & 256) != 0 ? 0L : j28;
        long j49 = (i18 & 512) != 0 ? 0L : j29;
        java.lang.String shareUserName = (i18 & 1024) != 0 ? "" : str4;
        java.lang.String str11 = (i18 & 2048) != 0 ? "" : str5;
        int i19 = (i18 & 4096) != 0 ? 0 : i17;
        java.lang.String clickTabContextId = (i18 & 8192) != 0 ? "" : str6;
        long j57 = j47;
        java.lang.String clickSubTabContextId = (i18 & 16384) != 0 ? "" : str7;
        java.lang.String chnlExtra = (32768 & i18) != 0 ? "" : str8;
        java.lang.String str12 = (i18 & 65536) != 0 ? null : str9;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (i18 & 131072) != 0 ? null : c19792x256d2725;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareUserName, "shareUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickTabContextId, "clickTabContextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickSubTabContextId, "clickSubTabContextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chnlExtra, "chnlExtra");
        this.f409655a = j37;
        this.f409656b = j38;
        this.f409657c = str10;
        this.f409658d = userName;
        this.f409659e = j39;
        this.f409660f = j57;
        this.f409661g = actionType;
        this.f409662h = commentscene;
        this.f409663i = j48;
        this.f409664j = j49;
        this.f409665k = shareUserName;
        this.f409666l = str11;
        this.f409667m = i19;
        this.f409668n = clickTabContextId;
        this.f409669o = clickSubTabContextId;
        this.f409670p = chnlExtra;
        this.f409671q = str12;
        this.f409672r = c19792x256d27252;
    }

    /* renamed from: equals */
    public boolean m147759xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml2.v0)) {
            return false;
        }
        ml2.v0 v0Var = (ml2.v0) obj;
        return this.f409655a == v0Var.f409655a && this.f409656b == v0Var.f409656b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409657c, v0Var.f409657c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409658d, v0Var.f409658d) && this.f409659e == v0Var.f409659e && this.f409660f == v0Var.f409660f && this.f409661g == v0Var.f409661g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409662h, v0Var.f409662h) && this.f409663i == v0Var.f409663i && this.f409664j == v0Var.f409664j && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409665k, v0Var.f409665k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409666l, v0Var.f409666l) && this.f409667m == v0Var.f409667m && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409668n, v0Var.f409668n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409669o, v0Var.f409669o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409670p, v0Var.f409670p) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409671q, v0Var.f409671q) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f409672r, v0Var.f409672r);
    }

    /* renamed from: hashCode */
    public int m147760x8cdac1b() {
        int hashCode = ((java.lang.Long.hashCode(this.f409655a) * 31) + java.lang.Long.hashCode(this.f409656b)) * 31;
        java.lang.String str = this.f409657c;
        int hashCode2 = (((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f409658d.hashCode()) * 31) + java.lang.Long.hashCode(this.f409659e)) * 31) + java.lang.Long.hashCode(this.f409660f)) * 31) + this.f409661g.hashCode()) * 31) + this.f409662h.hashCode()) * 31) + java.lang.Long.hashCode(this.f409663i)) * 31) + java.lang.Long.hashCode(this.f409664j)) * 31) + this.f409665k.hashCode()) * 31;
        java.lang.String str2 = this.f409666l;
        int hashCode3 = (((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Integer.hashCode(this.f409667m)) * 31) + this.f409668n.hashCode()) * 31) + this.f409669o.hashCode()) * 31) + this.f409670p.hashCode()) * 31;
        java.lang.String str3 = this.f409671q;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f409672r;
        return hashCode4 + (c19792x256d2725 != null ? c19792x256d2725.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m147761x9616526c() {
        return "HellVisitorClickData(feedId=" + this.f409655a + ", liveId=" + this.f409656b + ", dupFlag=" + this.f409657c + ", userName=" + this.f409658d + ", index=" + this.f409659e + ", onlineNum=" + this.f409660f + ", actionType=" + this.f409661g + ", commentscene=" + this.f409662h + ", enterStatus=" + this.f409663i + ", shareType=" + this.f409664j + ", shareUserName=" + this.f409665k + ", snsFeedid=" + this.f409666l + ", enterIconType=" + this.f409667m + ", clickTabContextId=" + this.f409668n + ", clickSubTabContextId=" + this.f409669o + ", chnlExtra=" + this.f409670p + ", contextId=" + this.f409671q + ", finderObject=" + this.f409672r + ')';
    }
}
