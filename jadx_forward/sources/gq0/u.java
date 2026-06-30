package gq0;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f356021a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f356022b;

    public u(java.lang.String frameSetName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        this.f356021a = frameSetName;
        this.f356022b = z17;
    }

    /* renamed from: equals */
    public boolean m132000xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq0.u)) {
            return false;
        }
        gq0.u uVar = (gq0.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f356021a, uVar.f356021a) && this.f356022b == uVar.f356022b;
    }

    /* renamed from: hashCode */
    public int m132001x8cdac1b() {
        return (this.f356021a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f356022b);
    }

    /* renamed from: toString */
    public java.lang.String m132002x9616526c() {
        return "FrameSetReportInfo(frameSetName=" + this.f356021a + ", isExposed=" + this.f356022b + ')';
    }
}
