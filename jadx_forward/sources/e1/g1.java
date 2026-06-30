package e1;

/* loaded from: classes13.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f327792a;

    public static java.lang.String a(int i17) {
        if (i17 == 0) {
            return "Miter";
        }
        if (i17 == 1) {
            return "Round";
        }
        return i17 == 2 ? "Bevel" : "Unknown";
    }

    /* renamed from: equals */
    public boolean m126643xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof e1.g1) {
            return this.f327792a == ((e1.g1) obj).f327792a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m126644x8cdac1b() {
        return java.lang.Integer.hashCode(this.f327792a);
    }

    /* renamed from: toString */
    public java.lang.String m126645x9616526c() {
        return a(this.f327792a);
    }
}
