package aq;

/* loaded from: classes4.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final aq.s0 f12975a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f12976b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12977c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12978d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12979e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12980f;

    /* renamed from: g, reason: collision with root package name */
    public final long f12981g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12982h;

    public u0(aq.s0 result, java.lang.String videoPath, int i17, int i18, int i19, int i27, long j17, int i28) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        this.f12975a = result;
        this.f12976b = videoPath;
        this.f12977c = i17;
        this.f12978d = i18;
        this.f12979e = i19;
        this.f12980f = i27;
        this.f12981g = j17;
        this.f12982h = i28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq.u0)) {
            return false;
        }
        aq.u0 u0Var = (aq.u0) obj;
        return kotlin.jvm.internal.o.b(this.f12975a, u0Var.f12975a) && kotlin.jvm.internal.o.b(this.f12976b, u0Var.f12976b) && this.f12977c == u0Var.f12977c && this.f12978d == u0Var.f12978d && this.f12979e == u0Var.f12979e && this.f12980f == u0Var.f12980f && this.f12981g == u0Var.f12981g && this.f12982h == u0Var.f12982h;
    }

    public int hashCode() {
        return (((((((((((((this.f12975a.hashCode() * 31) + this.f12976b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f12977c)) * 31) + java.lang.Integer.hashCode(this.f12978d)) * 31) + java.lang.Integer.hashCode(this.f12979e)) * 31) + java.lang.Integer.hashCode(this.f12980f)) * 31) + java.lang.Long.hashCode(this.f12981g)) * 31) + java.lang.Integer.hashCode(this.f12982h);
    }

    public java.lang.String toString() {
        return "MMLivePhotoVideoData(result=" + this.f12975a + ", videoPath=" + this.f12976b + ", videoSize=" + this.f12977c + ", videoHeight=" + this.f12978d + ", videoWidth=" + this.f12979e + ", videoDuration=" + this.f12980f + ", coverTimeStampMs=" + this.f12981g + ", coverDegree=" + this.f12982h + ')';
    }

    public /* synthetic */ u0(aq.s0 s0Var, java.lang.String str, int i17, int i18, int i19, int i27, long j17, int i28, int i29, kotlin.jvm.internal.i iVar) {
        this(s0Var, (i29 & 2) != 0 ? "" : str, (i29 & 4) != 0 ? 0 : i17, (i29 & 8) != 0 ? 0 : i18, (i29 & 16) != 0 ? 0 : i19, (i29 & 32) != 0 ? 0 : i27, (i29 & 64) != 0 ? 0L : j17, (i29 & 128) == 0 ? i28 : 0);
    }
}
