package uv2;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final r45.h70 f512934a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z f512935b;

    /* renamed from: c, reason: collision with root package name */
    public float f512936c;

    /* renamed from: d, reason: collision with root package name */
    public int f512937d;

    /* renamed from: e, reason: collision with root package name */
    public int f512938e;

    /* renamed from: f, reason: collision with root package name */
    public int f512939f;

    public n(r45.h70 compositionInfo, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z exportResult, float f17, int i17, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f17 = (i27 & 4) != 0 ? 0.0f : f17;
        i17 = (i27 & 8) != 0 ? -1 : i17;
        i18 = (i27 & 16) != 0 ? 0 : i18;
        i19 = (i27 & 32) != 0 ? 0 : i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compositionInfo, "compositionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exportResult, "exportResult");
        this.f512934a = compositionInfo;
        this.f512935b = exportResult;
        this.f512936c = f17;
        this.f512937d = i17;
        this.f512938e = i18;
        this.f512939f = i19;
    }

    /* renamed from: equals */
    public boolean m170598xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv2.n)) {
            return false;
        }
        uv2.n nVar = (uv2.n) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f512934a, nVar.f512934a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f512935b, nVar.f512935b) && java.lang.Float.compare(this.f512936c, nVar.f512936c) == 0 && this.f512937d == nVar.f512937d && this.f512938e == nVar.f512938e && this.f512939f == nVar.f512939f;
    }

    /* renamed from: hashCode */
    public int m170599x8cdac1b() {
        return (((((((((this.f512934a.hashCode() * 31) + this.f512935b.m72521x8cdac1b()) * 31) + java.lang.Float.hashCode(this.f512936c)) * 31) + java.lang.Integer.hashCode(this.f512937d)) * 31) + java.lang.Integer.hashCode(this.f512938e)) * 31) + java.lang.Integer.hashCode(this.f512939f);
    }

    /* renamed from: toString */
    public java.lang.String m170600x9616526c() {
        return "ProcessResult(compositionInfo=" + this.f512934a + ", exportResult=" + this.f512935b + ", videoQuality=" + this.f512936c + ", retCode=" + this.f512937d + ", zipRetCode=" + this.f512938e + ", zipTime=" + this.f512939f + ')';
    }
}
