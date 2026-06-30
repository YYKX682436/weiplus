package f65;

/* loaded from: classes12.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public long f341496a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f341497b;

    /* renamed from: c, reason: collision with root package name */
    public long f341498c;

    /* renamed from: d, reason: collision with root package name */
    public long f341499d;

    /* renamed from: e, reason: collision with root package name */
    public long f341500e;

    /* renamed from: f, reason: collision with root package name */
    public long f341501f;

    /* renamed from: g, reason: collision with root package name */
    public long f341502g;

    /* renamed from: h, reason: collision with root package name */
    public long f341503h;

    /* renamed from: i, reason: collision with root package name */
    public long f341504i;

    /* renamed from: j, reason: collision with root package name */
    public int f341505j;

    /* renamed from: k, reason: collision with root package name */
    public int f341506k;

    public s(long j17, java.lang.String str, long j18, long j19, long j27, long j28, long j29, long j37, long j38, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        long j39 = (i19 & 1) != 0 ? 0L : j17;
        java.lang.String fromUser = (i19 & 2) != 0 ? "" : str;
        long j47 = (i19 & 4) != 0 ? 0L : j18;
        long j48 = (i19 & 8) != 0 ? 0L : j19;
        long j49 = (i19 & 16) != 0 ? 0L : j27;
        long j57 = (i19 & 32) != 0 ? 0L : j28;
        long j58 = (i19 & 64) != 0 ? 0L : j29;
        long j59 = (i19 & 128) != 0 ? 0L : j37;
        long j66 = (i19 & 256) != 0 ? 0L : j38;
        int i27 = (i19 & 512) != 0 ? 0 : i17;
        int i28 = (i19 & 1024) != 0 ? 0 : i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUser, "fromUser");
        this.f341496a = j39;
        this.f341497b = fromUser;
        this.f341498c = j47;
        this.f341499d = j48;
        this.f341500e = j49;
        this.f341501f = j57;
        this.f341502g = j58;
        this.f341503h = j59;
        this.f341504i = j66;
        this.f341505j = i27;
        this.f341506k = i28;
    }

    /* renamed from: equals */
    public boolean m129134xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f65.s)) {
            return false;
        }
        f65.s sVar = (f65.s) obj;
        return this.f341496a == sVar.f341496a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f341497b, sVar.f341497b) && this.f341498c == sVar.f341498c && this.f341499d == sVar.f341499d && this.f341500e == sVar.f341500e && this.f341501f == sVar.f341501f && this.f341502g == sVar.f341502g && this.f341503h == sVar.f341503h && this.f341504i == sVar.f341504i && this.f341505j == sVar.f341505j && this.f341506k == sVar.f341506k;
    }

    /* renamed from: hashCode */
    public int m129135x8cdac1b() {
        return (((((((((((((((((((java.lang.Long.hashCode(this.f341496a) * 31) + this.f341497b.hashCode()) * 31) + java.lang.Long.hashCode(this.f341498c)) * 31) + java.lang.Long.hashCode(this.f341499d)) * 31) + java.lang.Long.hashCode(this.f341500e)) * 31) + java.lang.Long.hashCode(this.f341501f)) * 31) + java.lang.Long.hashCode(this.f341502g)) * 31) + java.lang.Long.hashCode(this.f341503h)) * 31) + java.lang.Long.hashCode(this.f341504i)) * 31) + java.lang.Integer.hashCode(this.f341505j)) * 31) + java.lang.Integer.hashCode(this.f341506k);
    }

    /* renamed from: toString */
    public java.lang.String m129136x9616526c() {
        return "VideoMsgPreloadData(msgSvrId=" + this.f341496a + ", fromUser=" + this.f341497b + ", cdnUrlSize=" + this.f341498c + ", cdnUrlPri=" + this.f341499d + ", cdnUrlPd=" + this.f341500e + ", cdnRawUrlSize=" + this.f341501f + ", cdnRawUrlPri=" + this.f341502g + ", cdnRawUrlPd=" + this.f341503h + ", createTime=" + this.f341504i + ", preloadStatus=" + this.f341505j + ", resourceStatus=" + this.f341506k + ')';
    }
}
