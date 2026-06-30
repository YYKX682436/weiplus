package aq;

/* loaded from: classes4.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f94498a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f94499b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f94500c;

    /* renamed from: d, reason: collision with root package name */
    public final long f94501d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f94502e;

    public t0(java.lang.String videoPath, java.lang.String coverPath, java.lang.String exportPath, long j17, android.os.Bundle extras) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverPath, "coverPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exportPath, "exportPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extras, "extras");
        this.f94498a = videoPath;
        this.f94499b = coverPath;
        this.f94500c = exportPath;
        this.f94501d = j17;
        this.f94502e = extras;
    }

    /* renamed from: equals */
    public boolean m8803xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq.t0)) {
            return false;
        }
        aq.t0 t0Var = (aq.t0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94498a, t0Var.f94498a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94499b, t0Var.f94499b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94500c, t0Var.f94500c) && this.f94501d == t0Var.f94501d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94502e, t0Var.f94502e);
    }

    /* renamed from: hashCode */
    public int m8804x8cdac1b() {
        return (((((((this.f94498a.hashCode() * 31) + this.f94499b.hashCode()) * 31) + this.f94500c.hashCode()) * 31) + java.lang.Long.hashCode(this.f94501d)) * 31) + this.f94502e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m8805x9616526c() {
        return "MMLivePhotoExportData(videoPath=" + this.f94498a + ", coverPath=" + this.f94499b + ", exportPath=" + this.f94500c + ", coverTimeStampMs=" + this.f94501d + ", extras=" + this.f94502e + ')';
    }

    public /* synthetic */ t0(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, android.os.Bundle bundle, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, str2, str3, (i17 & 8) != 0 ? 0L : j17, (i17 & 16) != 0 ? new android.os.Bundle() : bundle);
    }
}
