package a82;

/* loaded from: classes11.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2051a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f2052b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f2053c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f2054d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2055e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f2056f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f2057g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2058h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f2059i;

    /* renamed from: j, reason: collision with root package name */
    public int f2060j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2061k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2062l;

    /* renamed from: m, reason: collision with root package name */
    public final o72.o4 f2063m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.modelcdntran.v2 f2064n;

    public k1(long j17, java.lang.String md52, java.lang.String cdnUrl, java.lang.String cdnKey, int i17, java.lang.String targetLocalPath, java.lang.String tempPath, boolean z17, java.lang.String str, int i18, boolean z18, boolean z19, o72.o4 o4Var, com.tencent.mm.modelcdntran.v2 v2Var, int i19, kotlin.jvm.internal.i iVar) {
        java.lang.String htmlId = (i19 & 256) != 0 ? "" : str;
        int i27 = (i19 & 512) != 0 ? 0 : i18;
        boolean z27 = (i19 & 1024) != 0 ? false : z18;
        boolean z28 = (i19 & 2048) == 0 ? z19 : false;
        o72.o4 o4Var2 = (i19 & 4096) != 0 ? null : o4Var;
        com.tencent.mm.modelcdntran.v2 v2Var2 = (i19 & 8192) == 0 ? v2Var : null;
        kotlin.jvm.internal.o.g(md52, "md5");
        kotlin.jvm.internal.o.g(cdnUrl, "cdnUrl");
        kotlin.jvm.internal.o.g(cdnKey, "cdnKey");
        kotlin.jvm.internal.o.g(targetLocalPath, "targetLocalPath");
        kotlin.jvm.internal.o.g(tempPath, "tempPath");
        kotlin.jvm.internal.o.g(htmlId, "htmlId");
        this.f2051a = j17;
        this.f2052b = md52;
        this.f2053c = cdnUrl;
        this.f2054d = cdnKey;
        this.f2055e = i17;
        this.f2056f = targetLocalPath;
        this.f2057g = tempPath;
        this.f2058h = z17;
        this.f2059i = htmlId;
        this.f2060j = i27;
        this.f2061k = z27;
        this.f2062l = z28;
        this.f2063m = o4Var2;
        this.f2064n = v2Var2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a82.k1)) {
            return false;
        }
        a82.k1 k1Var = (a82.k1) obj;
        return this.f2051a == k1Var.f2051a && kotlin.jvm.internal.o.b(this.f2052b, k1Var.f2052b) && kotlin.jvm.internal.o.b(this.f2053c, k1Var.f2053c) && kotlin.jvm.internal.o.b(this.f2054d, k1Var.f2054d) && this.f2055e == k1Var.f2055e && kotlin.jvm.internal.o.b(this.f2056f, k1Var.f2056f) && kotlin.jvm.internal.o.b(this.f2057g, k1Var.f2057g) && this.f2058h == k1Var.f2058h && kotlin.jvm.internal.o.b(this.f2059i, k1Var.f2059i) && this.f2060j == k1Var.f2060j && this.f2061k == k1Var.f2061k && this.f2062l == k1Var.f2062l && kotlin.jvm.internal.o.b(this.f2063m, k1Var.f2063m) && kotlin.jvm.internal.o.b(this.f2064n, k1Var.f2064n);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((java.lang.Long.hashCode(this.f2051a) * 31) + this.f2052b.hashCode()) * 31) + this.f2053c.hashCode()) * 31) + this.f2054d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f2055e)) * 31) + this.f2056f.hashCode()) * 31) + this.f2057g.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f2058h)) * 31) + this.f2059i.hashCode()) * 31) + java.lang.Integer.hashCode(this.f2060j)) * 31) + java.lang.Boolean.hashCode(this.f2061k)) * 31) + java.lang.Boolean.hashCode(this.f2062l)) * 31;
        o72.o4 o4Var = this.f2063m;
        int hashCode2 = (hashCode + (o4Var == null ? 0 : o4Var.hashCode())) * 31;
        com.tencent.mm.modelcdntran.v2 v2Var = this.f2064n;
        return hashCode2 + (v2Var != null ? v2Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "DownloadTask(size=" + this.f2051a + ", md5=" + this.f2052b + ", cdnUrl=" + this.f2053c + ", cdnKey=" + this.f2054d + ", fieldType=" + this.f2055e + ", targetLocalPath=" + this.f2056f + ", tempPath=" + this.f2057g + ", isStreamMedia=" + this.f2058h + ", htmlId=" + this.f2059i + ", retryCount=" + this.f2060j + ", isDownloading=" + this.f2061k + ", isCancelled=" + this.f2062l + ", progressListener=" + this.f2063m + ", innerCdnSynCallback=" + this.f2064n + ')';
    }
}
