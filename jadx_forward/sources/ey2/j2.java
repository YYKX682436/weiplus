package ey2;

/* loaded from: classes2.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f338941a;

    /* renamed from: b, reason: collision with root package name */
    public r45.lw0 f338942b = new r45.lw0();

    public j2(int i17) {
        this.f338941a = i17;
    }

    /* renamed from: equals */
    public boolean m128343xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey2.j2) && this.f338941a == ((ey2.j2) obj).f338941a;
    }

    /* renamed from: hashCode */
    public int m128344x8cdac1b() {
        return java.lang.Integer.hashCode(this.f338941a);
    }

    /* renamed from: toString */
    public java.lang.String m128345x9616526c() {
        return "Cache(tabType=" + this.f338941a + ')';
    }
}
