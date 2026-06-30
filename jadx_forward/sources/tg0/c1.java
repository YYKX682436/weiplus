package tg0;

/* loaded from: classes8.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public int f500562a;

    /* renamed from: b, reason: collision with root package name */
    public final int f500563b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f500564c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f500565d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f500566e;

    /* renamed from: f, reason: collision with root package name */
    public final int f500567f;

    /* renamed from: g, reason: collision with root package name */
    public final int f500568g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f500569h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f500570i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f500571j;

    /* renamed from: k, reason: collision with root package name */
    public final int f500572k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f500573l;

    /* renamed from: m, reason: collision with root package name */
    public final int f500574m;

    /* renamed from: n, reason: collision with root package name */
    public final int f500575n;

    /* renamed from: o, reason: collision with root package name */
    public final int f500576o;

    /* renamed from: p, reason: collision with root package name */
    public double f500577p;

    /* renamed from: q, reason: collision with root package name */
    public final long f500578q;

    public c1(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19, int i27, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i28, java.lang.String str7, int i29, int i37, int i38, double d17, long j17, int i39, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i47 = (i39 & 1) != 0 ? 0 : i17;
        int i48 = (i39 & 2) != 0 ? 0 : i18;
        java.lang.String sessionId = (i39 & 4) != 0 ? "" : str;
        java.lang.String query = (i39 & 8) != 0 ? "" : str2;
        java.lang.String resultJson = (i39 & 16) != 0 ? "" : str3;
        int i49 = (i39 & 32) != 0 ? 14 : i19;
        int i57 = (i39 & 64) != 0 ? 0 : i27;
        java.lang.String requestId = (i39 & 128) != 0 ? "" : str4;
        java.lang.String parentSearchId = (i39 & 256) != 0 ? "" : str5;
        java.lang.String filter = (i39 & 512) != 0 ? "" : str6;
        int i58 = (i39 & 1024) != 0 ? 1 : i28;
        java.lang.String mixerCommonContext = (i39 & 2048) == 0 ? str7 : "";
        int i59 = (i39 & 4096) != 0 ? 123 : i29;
        int i66 = (i39 & 8192) != 0 ? 14 : i37;
        int i67 = (i39 & 16384) != 0 ? 0 : i38;
        double d18 = (i39 & 32768) != 0 ? 0.0d : d17;
        long j18 = (i39 & 65536) != 0 ? 0L : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultJson, "resultJson");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentSearchId, "parentSearchId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filter, "filter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixerCommonContext, "mixerCommonContext");
        this.f500562a = i47;
        this.f500563b = i48;
        this.f500564c = sessionId;
        this.f500565d = query;
        this.f500566e = resultJson;
        this.f500567f = i49;
        this.f500568g = i57;
        this.f500569h = requestId;
        this.f500570i = parentSearchId;
        this.f500571j = filter;
        this.f500572k = i58;
        this.f500573l = mixerCommonContext;
        this.f500574m = i59;
        this.f500575n = i66;
        this.f500576o = i67;
        this.f500577p = d18;
        this.f500578q = j18;
    }

    /* renamed from: equals */
    public boolean m166439xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg0.c1)) {
            return false;
        }
        tg0.c1 c1Var = (tg0.c1) obj;
        return this.f500562a == c1Var.f500562a && this.f500563b == c1Var.f500563b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500564c, c1Var.f500564c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500565d, c1Var.f500565d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500566e, c1Var.f500566e) && this.f500567f == c1Var.f500567f && this.f500568g == c1Var.f500568g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500569h, c1Var.f500569h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500570i, c1Var.f500570i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500571j, c1Var.f500571j) && this.f500572k == c1Var.f500572k && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500573l, c1Var.f500573l) && this.f500574m == c1Var.f500574m && this.f500575n == c1Var.f500575n && this.f500576o == c1Var.f500576o && java.lang.Double.compare(this.f500577p, c1Var.f500577p) == 0 && this.f500578q == c1Var.f500578q;
    }

    /* renamed from: hashCode */
    public int m166440x8cdac1b() {
        return (((((((((((((((((((((((((((((((java.lang.Integer.hashCode(this.f500562a) * 31) + java.lang.Integer.hashCode(this.f500563b)) * 31) + this.f500564c.hashCode()) * 31) + this.f500565d.hashCode()) * 31) + this.f500566e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f500567f)) * 31) + java.lang.Integer.hashCode(this.f500568g)) * 31) + this.f500569h.hashCode()) * 31) + this.f500570i.hashCode()) * 31) + this.f500571j.hashCode()) * 31) + java.lang.Integer.hashCode(this.f500572k)) * 31) + this.f500573l.hashCode()) * 31) + java.lang.Integer.hashCode(this.f500574m)) * 31) + java.lang.Integer.hashCode(this.f500575n)) * 31) + java.lang.Integer.hashCode(this.f500576o)) * 31) + java.lang.Double.hashCode(this.f500577p)) * 31) + java.lang.Long.hashCode(this.f500578q);
    }

    /* renamed from: toString */
    public java.lang.String m166441x9616526c() {
        return "FlutterSearchResult(sugVisible=" + this.f500562a + ", searchType=" + this.f500563b + ", sessionId=" + this.f500564c + ", query=" + this.f500565d + ", businessType=" + this.f500567f + ", offset=" + this.f500568g + ", requestId=" + this.f500569h + ", parentSearchId=" + this.f500570i + ", filter=" + this.f500571j + ", newQuery=" + this.f500572k + ", mixerCommonContext=" + this.f500573l + ", scene=" + this.f500574m + ", type=" + this.f500575n + ", preFetch=" + this.f500576o + ", initH5BoxHeight=" + this.f500577p + ", responseTime=" + this.f500578q + ')';
    }
}
