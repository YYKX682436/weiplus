package yr2;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f546202a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f546203b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f546204c;

    public f(java.lang.String aesKey, java.lang.String initialIv, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aesKey, "aesKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initialIv, "initialIv");
        this.f546202a = aesKey;
        this.f546203b = initialIv;
        this.f546204c = z17;
    }

    /* renamed from: equals */
    public boolean m177553xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr2.f)) {
            return false;
        }
        yr2.f fVar = (yr2.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546202a, fVar.f546202a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546203b, fVar.f546203b) && this.f546204c == fVar.f546204c;
    }

    /* renamed from: hashCode */
    public int m177554x8cdac1b() {
        return (((this.f546202a.hashCode() * 31) + this.f546203b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f546204c);
    }

    /* renamed from: toString */
    public java.lang.String m177555x9616526c() {
        return "HlsTaskInfo(aesKey=" + this.f546202a + ", initialIv=" + this.f546203b + ", isHLSVideo=" + this.f546204c + ')';
    }
}
