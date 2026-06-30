package a82;

/* loaded from: classes11.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f83584a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f83585b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f83586c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f83587d;

    /* renamed from: e, reason: collision with root package name */
    public final int f83588e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f83589f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f83590g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f83591h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f83592i;

    /* renamed from: j, reason: collision with root package name */
    public int f83593j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f83594k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f83595l;

    /* renamed from: m, reason: collision with root package name */
    public final o72.o4 f83596m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p947xba6de98f.v2 f83597n;

    public k1(long j17, java.lang.String md52, java.lang.String cdnUrl, java.lang.String cdnKey, int i17, java.lang.String targetLocalPath, java.lang.String tempPath, boolean z17, java.lang.String str, int i18, boolean z18, boolean z19, o72.o4 o4Var, com.p314xaae8f345.mm.p947xba6de98f.v2 v2Var, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String htmlId = (i19 & 256) != 0 ? "" : str;
        int i27 = (i19 & 512) != 0 ? 0 : i18;
        boolean z27 = (i19 & 1024) != 0 ? false : z18;
        boolean z28 = (i19 & 2048) == 0 ? z19 : false;
        o72.o4 o4Var2 = (i19 & 4096) != 0 ? null : o4Var;
        com.p314xaae8f345.mm.p947xba6de98f.v2 v2Var2 = (i19 & 8192) == 0 ? v2Var : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnUrl, "cdnUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnKey, "cdnKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetLocalPath, "targetLocalPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tempPath, "tempPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(htmlId, "htmlId");
        this.f83584a = j17;
        this.f83585b = md52;
        this.f83586c = cdnUrl;
        this.f83587d = cdnKey;
        this.f83588e = i17;
        this.f83589f = targetLocalPath;
        this.f83590g = tempPath;
        this.f83591h = z17;
        this.f83592i = htmlId;
        this.f83593j = i27;
        this.f83594k = z27;
        this.f83595l = z28;
        this.f83596m = o4Var2;
        this.f83597n = v2Var2;
    }

    /* renamed from: equals */
    public boolean m824xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a82.k1)) {
            return false;
        }
        a82.k1 k1Var = (a82.k1) obj;
        return this.f83584a == k1Var.f83584a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f83585b, k1Var.f83585b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f83586c, k1Var.f83586c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f83587d, k1Var.f83587d) && this.f83588e == k1Var.f83588e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f83589f, k1Var.f83589f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f83590g, k1Var.f83590g) && this.f83591h == k1Var.f83591h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f83592i, k1Var.f83592i) && this.f83593j == k1Var.f83593j && this.f83594k == k1Var.f83594k && this.f83595l == k1Var.f83595l && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f83596m, k1Var.f83596m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f83597n, k1Var.f83597n);
    }

    /* renamed from: hashCode */
    public int m825x8cdac1b() {
        int hashCode = ((((((((((((((((((((((java.lang.Long.hashCode(this.f83584a) * 31) + this.f83585b.hashCode()) * 31) + this.f83586c.hashCode()) * 31) + this.f83587d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f83588e)) * 31) + this.f83589f.hashCode()) * 31) + this.f83590g.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f83591h)) * 31) + this.f83592i.hashCode()) * 31) + java.lang.Integer.hashCode(this.f83593j)) * 31) + java.lang.Boolean.hashCode(this.f83594k)) * 31) + java.lang.Boolean.hashCode(this.f83595l)) * 31;
        o72.o4 o4Var = this.f83596m;
        int hashCode2 = (hashCode + (o4Var == null ? 0 : o4Var.hashCode())) * 31;
        com.p314xaae8f345.mm.p947xba6de98f.v2 v2Var = this.f83597n;
        return hashCode2 + (v2Var != null ? v2Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m826x9616526c() {
        return "DownloadTask(size=" + this.f83584a + ", md5=" + this.f83585b + ", cdnUrl=" + this.f83586c + ", cdnKey=" + this.f83587d + ", fieldType=" + this.f83588e + ", targetLocalPath=" + this.f83589f + ", tempPath=" + this.f83590g + ", isStreamMedia=" + this.f83591h + ", htmlId=" + this.f83592i + ", retryCount=" + this.f83593j + ", isDownloading=" + this.f83594k + ", isCancelled=" + this.f83595l + ", progressListener=" + this.f83596m + ", innerCdnSynCallback=" + this.f83597n + ')';
    }
}
