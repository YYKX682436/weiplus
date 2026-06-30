package aq;

/* loaded from: classes4.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final aq.s0 f94508a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f94509b;

    /* renamed from: c, reason: collision with root package name */
    public final int f94510c;

    /* renamed from: d, reason: collision with root package name */
    public final int f94511d;

    /* renamed from: e, reason: collision with root package name */
    public final int f94512e;

    /* renamed from: f, reason: collision with root package name */
    public final int f94513f;

    /* renamed from: g, reason: collision with root package name */
    public final long f94514g;

    /* renamed from: h, reason: collision with root package name */
    public final int f94515h;

    public u0(aq.s0 result, java.lang.String videoPath, int i17, int i18, int i19, int i27, long j17, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        this.f94508a = result;
        this.f94509b = videoPath;
        this.f94510c = i17;
        this.f94511d = i18;
        this.f94512e = i19;
        this.f94513f = i27;
        this.f94514g = j17;
        this.f94515h = i28;
    }

    /* renamed from: equals */
    public boolean m8806xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq.u0)) {
            return false;
        }
        aq.u0 u0Var = (aq.u0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94508a, u0Var.f94508a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94509b, u0Var.f94509b) && this.f94510c == u0Var.f94510c && this.f94511d == u0Var.f94511d && this.f94512e == u0Var.f94512e && this.f94513f == u0Var.f94513f && this.f94514g == u0Var.f94514g && this.f94515h == u0Var.f94515h;
    }

    /* renamed from: hashCode */
    public int m8807x8cdac1b() {
        return (((((((((((((this.f94508a.m8801x8cdac1b() * 31) + this.f94509b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f94510c)) * 31) + java.lang.Integer.hashCode(this.f94511d)) * 31) + java.lang.Integer.hashCode(this.f94512e)) * 31) + java.lang.Integer.hashCode(this.f94513f)) * 31) + java.lang.Long.hashCode(this.f94514g)) * 31) + java.lang.Integer.hashCode(this.f94515h);
    }

    /* renamed from: toString */
    public java.lang.String m8808x9616526c() {
        return "MMLivePhotoVideoData(result=" + this.f94508a + ", videoPath=" + this.f94509b + ", videoSize=" + this.f94510c + ", videoHeight=" + this.f94511d + ", videoWidth=" + this.f94512e + ", videoDuration=" + this.f94513f + ", coverTimeStampMs=" + this.f94514g + ", coverDegree=" + this.f94515h + ')';
    }

    public /* synthetic */ u0(aq.s0 s0Var, java.lang.String str, int i17, int i18, int i19, int i27, long j17, int i28, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(s0Var, (i29 & 2) != 0 ? "" : str, (i29 & 4) != 0 ? 0 : i17, (i29 & 8) != 0 ? 0 : i18, (i29 & 16) != 0 ? 0 : i19, (i29 & 32) != 0 ? 0 : i27, (i29 & 64) != 0 ? 0L : j17, (i29 & 128) == 0 ? i28 : 0);
    }
}
