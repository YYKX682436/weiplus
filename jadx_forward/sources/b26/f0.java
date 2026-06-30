package b26;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f98964a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f98965b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f98966c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f98967d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f98968e;

    /* renamed from: f, reason: collision with root package name */
    public final n16.b f98969f;

    public f0(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.String filePath, n16.b classId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        this.f98964a = obj;
        this.f98965b = obj2;
        this.f98966c = obj3;
        this.f98967d = obj4;
        this.f98968e = filePath;
        this.f98969f = classId;
    }

    /* renamed from: equals */
    public boolean m9676xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b26.f0)) {
            return false;
        }
        b26.f0 f0Var = (b26.f0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98964a, f0Var.f98964a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98965b, f0Var.f98965b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98966c, f0Var.f98966c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98967d, f0Var.f98967d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98968e, f0Var.f98968e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98969f, f0Var.f98969f);
    }

    /* renamed from: hashCode */
    public int m9677x8cdac1b() {
        java.lang.Object obj = this.f98964a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f98965b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        java.lang.Object obj3 = this.f98966c;
        int hashCode3 = (hashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        java.lang.Object obj4 = this.f98967d;
        return ((((hashCode3 + (obj4 != null ? obj4.hashCode() : 0)) * 31) + this.f98968e.hashCode()) * 31) + this.f98969f.m148881x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m9678x9616526c() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f98964a + ", compilerVersion=" + this.f98965b + ", languageVersion=" + this.f98966c + ", expectedVersion=" + this.f98967d + ", filePath=" + this.f98968e + ", classId=" + this.f98969f + ')';
    }
}
