package f2;

/* loaded from: classes14.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f340349a;

    /* renamed from: equals */
    public boolean m128749xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof f2.p) {
            return this.f340349a == ((f2.p) obj).f340349a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m128750x8cdac1b() {
        return java.lang.Integer.hashCode(this.f340349a);
    }

    /* renamed from: toString */
    public java.lang.String m128751x9616526c() {
        int i17 = this.f340349a;
        if (i17 == 0) {
            return "Normal";
        }
        return i17 == 1 ? "Italic" : "Invalid";
    }
}
