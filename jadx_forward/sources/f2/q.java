package f2;

/* loaded from: classes14.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f340350a;

    public static java.lang.String a(int i17) {
        if (i17 == 0) {
            return "None";
        }
        if (i17 == 1) {
            return "All";
        }
        if (i17 == 2) {
            return "Weight";
        }
        return i17 == 3 ? "Style" : "Invalid";
    }

    /* renamed from: equals */
    public boolean m128752xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof f2.q) {
            return this.f340350a == ((f2.q) obj).f340350a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m128753x8cdac1b() {
        return java.lang.Integer.hashCode(this.f340350a);
    }

    /* renamed from: toString */
    public java.lang.String m128754x9616526c() {
        return a(this.f340350a);
    }
}
