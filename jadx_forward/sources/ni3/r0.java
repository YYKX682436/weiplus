package ni3;

/* loaded from: classes10.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f419252a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f419253b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f419254c;

    /* renamed from: d, reason: collision with root package name */
    public long f419255d;

    /* renamed from: e, reason: collision with root package name */
    public long f419256e;

    /* renamed from: f, reason: collision with root package name */
    public long f419257f;

    /* renamed from: g, reason: collision with root package name */
    public long f419258g;

    /* renamed from: h, reason: collision with root package name */
    public long f419259h;

    /* renamed from: i, reason: collision with root package name */
    public long f419260i;

    /* renamed from: j, reason: collision with root package name */
    public long f419261j;

    public r0(java.lang.String mediaId, java.lang.String filePath, boolean z17, long j17, long j18, long j19, long j27, long j28, long j29, long j37) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        this.f419252a = mediaId;
        this.f419253b = filePath;
        this.f419254c = z17;
        this.f419255d = j17;
        this.f419256e = j18;
        this.f419257f = j19;
        this.f419258g = j27;
        this.f419259h = j28;
        this.f419260i = j29;
        this.f419261j = j37;
    }

    /* renamed from: equals */
    public boolean m149674xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.r0)) {
            return false;
        }
        ni3.r0 r0Var = (ni3.r0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419252a, r0Var.f419252a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419253b, r0Var.f419253b) && this.f419254c == r0Var.f419254c && this.f419255d == r0Var.f419255d && this.f419256e == r0Var.f419256e && this.f419257f == r0Var.f419257f && this.f419258g == r0Var.f419258g && this.f419259h == r0Var.f419259h && this.f419260i == r0Var.f419260i && this.f419261j == r0Var.f419261j;
    }

    /* renamed from: hashCode */
    public int m149675x8cdac1b() {
        return (((((((((((((((((this.f419252a.hashCode() * 31) + this.f419253b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f419254c)) * 31) + java.lang.Long.hashCode(this.f419255d)) * 31) + java.lang.Long.hashCode(this.f419256e)) * 31) + java.lang.Long.hashCode(this.f419257f)) * 31) + java.lang.Long.hashCode(this.f419258g)) * 31) + java.lang.Long.hashCode(this.f419259h)) * 31) + java.lang.Long.hashCode(this.f419260i)) * 31) + java.lang.Long.hashCode(this.f419261j);
    }

    /* renamed from: toString */
    public java.lang.String m149676x9616526c() {
        return "FeedPlayInfo(mediaId=" + this.f419252a + ", filePath=" + this.f419253b + ", isFirstPlay=" + this.f419254c + ", exposeTime=" + this.f419255d + ", playTime=" + this.f419256e + ", firstLoadTime=" + this.f419257f + ", firstFrameTime=" + this.f419258g + ", userFirstFrameTime=" + this.f419259h + ", bufferCount=" + this.f419260i + ", bufferTotalTime=" + this.f419261j + ')';
    }
}
