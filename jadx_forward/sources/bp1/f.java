package bp1;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f104576a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f104577b;

    public f(java.lang.String name, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f104576a = name;
        this.f104577b = str;
    }

    /* renamed from: equals */
    public boolean m10971xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp1.f)) {
            return false;
        }
        bp1.f fVar = (bp1.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f104576a, fVar.f104576a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f104577b, fVar.f104577b);
    }

    /* renamed from: hashCode */
    public int m10972x8cdac1b() {
        int hashCode = this.f104576a.hashCode() * 31;
        java.lang.String str = this.f104577b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m10973x9616526c() {
        return "RequiredPermission(name=" + this.f104576a + ", reason=" + this.f104577b + ')';
    }
}
