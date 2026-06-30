package c1;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f119265a;

    /* renamed from: equals */
    public boolean m13993xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof c1.d) {
            return this.f119265a == ((c1.d) obj).f119265a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m13994x8cdac1b() {
        return java.lang.Integer.hashCode(this.f119265a);
    }

    /* renamed from: toString */
    public java.lang.String m13995x9616526c() {
        int i17 = this.f119265a;
        if (i17 == 1) {
            return "Next";
        }
        if (i17 == 2) {
            return "Previous";
        }
        if (i17 == 3) {
            return "Left";
        }
        if (i17 == 4) {
            return "Right";
        }
        if (i17 == 5) {
            return "Up";
        }
        if (i17 == 6) {
            return "Down";
        }
        if (i17 == 7) {
            return "In";
        }
        return i17 == 8 ? "Out" : "Invalid FocusDirection";
    }
}
