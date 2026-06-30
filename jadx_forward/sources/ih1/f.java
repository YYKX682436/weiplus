package ih1;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f373022a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f373023b;

    /* renamed from: c, reason: collision with root package name */
    public final tp0.j f373024c;

    public f(java.lang.String frameSetName, java.lang.String frameSetRootPath, tp0.j coverViewNormalData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetRootPath, "frameSetRootPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverViewNormalData, "coverViewNormalData");
        this.f373022a = frameSetName;
        this.f373023b = frameSetRootPath;
        this.f373024c = coverViewNormalData;
    }

    /* renamed from: equals */
    public boolean m136617xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih1.f)) {
            return false;
        }
        ih1.f fVar = (ih1.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373022a, fVar.f373022a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373023b, fVar.f373023b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373024c, fVar.f373024c);
    }

    /* renamed from: hashCode */
    public int m136618x8cdac1b() {
        return (((this.f373022a.hashCode() * 31) + this.f373023b.hashCode()) * 31) + this.f373024c.m166846x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m136619x9616526c() {
        return "CoverViewExtendedFrameSetData(frameSetName=" + this.f373022a + ", frameSetRootPath=" + this.f373023b + ", coverViewNormalData=" + this.f373024c + ')';
    }
}
