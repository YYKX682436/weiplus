package bp1;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f23043a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f23044b;

    public f(java.lang.String name, java.lang.String str) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f23043a = name;
        this.f23044b = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp1.f)) {
            return false;
        }
        bp1.f fVar = (bp1.f) obj;
        return kotlin.jvm.internal.o.b(this.f23043a, fVar.f23043a) && kotlin.jvm.internal.o.b(this.f23044b, fVar.f23044b);
    }

    public int hashCode() {
        int hashCode = this.f23043a.hashCode() * 31;
        java.lang.String str = this.f23044b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "RequiredPermission(name=" + this.f23043a + ", reason=" + this.f23044b + ')';
    }
}
