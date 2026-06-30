package c23;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public boolean f119590a;

    public u(boolean z17) {
        this.f119590a = z17;
    }

    /* renamed from: equals */
    public boolean m14050xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c23.u) && this.f119590a == ((c23.u) obj).f119590a;
    }

    /* renamed from: hashCode */
    public int m14051x8cdac1b() {
        return java.lang.Boolean.hashCode(this.f119590a);
    }

    /* renamed from: toString */
    public java.lang.String m14052x9616526c() {
        return "BooleanBox(value=" + this.f119590a + ')';
    }
}
