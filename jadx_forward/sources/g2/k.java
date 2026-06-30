package g2;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f349247a;

    public static java.lang.String a(int i17) {
        if (i17 == 0) {
            return "None";
        }
        if (i17 == 1) {
            return "Default";
        }
        if (i17 == 2) {
            return "Go";
        }
        if (i17 == 3) {
            return "Search";
        }
        if (i17 == 4) {
            return "Send";
        }
        if (i17 == 5) {
            return "Previous";
        }
        if (i17 == 6) {
            return "Next";
        }
        return i17 == 7 ? "Done" : "Invalid";
    }

    /* renamed from: equals */
    public boolean m130696xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof g2.k) {
            return this.f349247a == ((g2.k) obj).f349247a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m130697x8cdac1b() {
        return java.lang.Integer.hashCode(this.f349247a);
    }

    /* renamed from: toString */
    public java.lang.String m130698x9616526c() {
        return a(this.f349247a);
    }
}
