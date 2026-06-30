package ls1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f402516a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f402517b;

    public f(java.lang.String path, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f402516a = path;
        this.f402517b = z17;
    }

    /* renamed from: equals */
    public boolean m146256xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls1.f)) {
            return false;
        }
        ls1.f fVar = (ls1.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f402516a, fVar.f402516a) && this.f402517b == fVar.f402517b;
    }

    /* renamed from: hashCode */
    public int m146257x8cdac1b() {
        return (this.f402516a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f402517b);
    }

    /* renamed from: toString */
    public java.lang.String m146258x9616526c() {
        return "InterceptInfo(path=" + this.f402516a + ", isZip=" + this.f402517b + ')';
    }
}
