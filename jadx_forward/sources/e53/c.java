package e53;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f331148a;

    /* renamed from: b, reason: collision with root package name */
    public final int f331149b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f331150c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f331151d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f331152e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f331153f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f331154g;

    /* renamed from: h, reason: collision with root package name */
    public long f331155h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f331156i;

    /* renamed from: j, reason: collision with root package name */
    public long f331157j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f331158k;

    public c(java.lang.String key, int i17, boolean z17, java.lang.String reportStr, java.lang.String str, boolean z18, boolean z19, long j17, boolean z27, long j18, boolean z28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportStr, "reportStr");
        this.f331148a = key;
        this.f331149b = i17;
        this.f331150c = z17;
        this.f331151d = reportStr;
        this.f331152e = str;
        this.f331153f = z18;
        this.f331154g = z19;
        this.f331155h = j17;
        this.f331156i = z27;
        this.f331157j = j18;
        this.f331158k = z28;
    }

    /* renamed from: equals */
    public boolean m127003xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e53.c)) {
            return false;
        }
        e53.c cVar = (e53.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331148a, cVar.f331148a) && this.f331149b == cVar.f331149b && this.f331150c == cVar.f331150c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331151d, cVar.f331151d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331152e, cVar.f331152e) && this.f331153f == cVar.f331153f && this.f331154g == cVar.f331154g && this.f331155h == cVar.f331155h && this.f331156i == cVar.f331156i && this.f331157j == cVar.f331157j && this.f331158k == cVar.f331158k;
    }

    /* renamed from: hashCode */
    public int m127004x8cdac1b() {
        int hashCode = ((((((this.f331148a.hashCode() * 31) + java.lang.Integer.hashCode(this.f331149b)) * 31) + java.lang.Boolean.hashCode(this.f331150c)) * 31) + this.f331151d.hashCode()) * 31;
        java.lang.String str = this.f331152e;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f331153f)) * 31) + java.lang.Boolean.hashCode(this.f331154g)) * 31) + java.lang.Long.hashCode(this.f331155h)) * 31) + java.lang.Boolean.hashCode(this.f331156i)) * 31) + java.lang.Long.hashCode(this.f331157j)) * 31) + java.lang.Boolean.hashCode(this.f331158k);
    }

    /* renamed from: toString */
    public java.lang.String m127005x9616526c() {
        return "FeedTimeReportStruct(key=" + this.f331148a + ", logId=" + this.f331149b + ", reportOnExit=" + this.f331150c + ", reportStr=" + this.f331151d + ", timePlaceHolderKey=" + this.f331152e + ", markTimeStart=" + this.f331153f + ", isReportNow=" + this.f331154g + ", reportDuration=" + this.f331155h + ", isTimeMillSecond=" + this.f331156i + ", startTime=" + this.f331157j + ", recordOpenOtherPage=" + this.f331158k + ')';
    }
}
