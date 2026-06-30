package a24;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f908a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class f909b;

    public u(java.lang.Class parentGroup, java.lang.Class cls) {
        kotlin.jvm.internal.o.g(parentGroup, "parentGroup");
        this.f908a = parentGroup;
        this.f909b = cls;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a24.u)) {
            return false;
        }
        a24.u uVar = (a24.u) obj;
        return kotlin.jvm.internal.o.b(this.f908a, uVar.f908a) && kotlin.jvm.internal.o.b(this.f909b, uVar.f909b);
    }

    public int hashCode() {
        int hashCode = this.f908a.hashCode() * 31;
        java.lang.Class cls = this.f909b;
        return hashCode + (cls == null ? 0 : cls.hashCode());
    }

    public java.lang.String toString() {
        return "SettingLocation(parentGroup=" + this.f908a + ", frontItem=" + this.f909b + ')';
    }
}
