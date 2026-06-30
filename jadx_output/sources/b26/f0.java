package b26;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f17431a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f17432b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f17433c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f17434d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f17435e;

    /* renamed from: f, reason: collision with root package name */
    public final n16.b f17436f;

    public f0(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.String filePath, n16.b classId) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(classId, "classId");
        this.f17431a = obj;
        this.f17432b = obj2;
        this.f17433c = obj3;
        this.f17434d = obj4;
        this.f17435e = filePath;
        this.f17436f = classId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b26.f0)) {
            return false;
        }
        b26.f0 f0Var = (b26.f0) obj;
        return kotlin.jvm.internal.o.b(this.f17431a, f0Var.f17431a) && kotlin.jvm.internal.o.b(this.f17432b, f0Var.f17432b) && kotlin.jvm.internal.o.b(this.f17433c, f0Var.f17433c) && kotlin.jvm.internal.o.b(this.f17434d, f0Var.f17434d) && kotlin.jvm.internal.o.b(this.f17435e, f0Var.f17435e) && kotlin.jvm.internal.o.b(this.f17436f, f0Var.f17436f);
    }

    public int hashCode() {
        java.lang.Object obj = this.f17431a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f17432b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        java.lang.Object obj3 = this.f17433c;
        int hashCode3 = (hashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        java.lang.Object obj4 = this.f17434d;
        return ((((hashCode3 + (obj4 != null ? obj4.hashCode() : 0)) * 31) + this.f17435e.hashCode()) * 31) + this.f17436f.hashCode();
    }

    public java.lang.String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f17431a + ", compilerVersion=" + this.f17432b + ", languageVersion=" + this.f17433c + ", expectedVersion=" + this.f17434d + ", filePath=" + this.f17435e + ", classId=" + this.f17436f + ')';
    }
}
