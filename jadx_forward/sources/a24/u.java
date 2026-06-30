package a24;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f82441a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class f82442b;

    public u(java.lang.Class parentGroup, java.lang.Class cls) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentGroup, "parentGroup");
        this.f82441a = parentGroup;
        this.f82442b = cls;
    }

    /* renamed from: equals */
    public boolean m455xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a24.u)) {
            return false;
        }
        a24.u uVar = (a24.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82441a, uVar.f82441a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82442b, uVar.f82442b);
    }

    /* renamed from: hashCode */
    public int m456x8cdac1b() {
        int hashCode = this.f82441a.hashCode() * 31;
        java.lang.Class cls = this.f82442b;
        return hashCode + (cls == null ? 0 : cls.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m457x9616526c() {
        return "SettingLocation(parentGroup=" + this.f82441a + ", frontItem=" + this.f82442b + ')';
    }
}
