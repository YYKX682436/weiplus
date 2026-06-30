package uv4;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f512971a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f512972b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f512973c;

    public l(int i17, java.lang.String location, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        this.f512971a = i17;
        this.f512972b = location;
        this.f512973c = z17;
    }

    /* renamed from: equals */
    public boolean m170611xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv4.l)) {
            return false;
        }
        uv4.l lVar = (uv4.l) obj;
        return this.f512971a == lVar.f512971a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f512972b, lVar.f512972b) && this.f512973c == lVar.f512973c;
    }

    /* renamed from: hashCode */
    public int m170612x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f512971a) * 31) + this.f512972b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f512973c);
    }

    /* renamed from: toString */
    public java.lang.String m170613x9616526c() {
        return "VersionInfo(version=" + this.f512971a + ", location=" + this.f512972b + ", isRootDir=" + this.f512973c + ')';
    }
}
