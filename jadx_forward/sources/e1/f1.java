package e1;

/* loaded from: classes13.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f327786a;

    public static java.lang.String a(int i17) {
        if (i17 == 0) {
            return "Butt";
        }
        if (i17 == 1) {
            return "Round";
        }
        return i17 == 2 ? "Square" : "Unknown";
    }

    /* renamed from: equals */
    public boolean m126640xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof e1.f1) {
            return this.f327786a == ((e1.f1) obj).f327786a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m126641x8cdac1b() {
        return java.lang.Integer.hashCode(this.f327786a);
    }

    /* renamed from: toString */
    public java.lang.String m126642x9616526c() {
        return a(this.f327786a);
    }
}
