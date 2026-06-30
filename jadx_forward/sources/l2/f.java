package l2;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f396649a;

    /* renamed from: equals */
    public boolean m144904xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof l2.f) {
            return this.f396649a == ((l2.f) obj).f396649a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m144905x8cdac1b() {
        return java.lang.Integer.hashCode(this.f396649a);
    }

    /* renamed from: toString */
    public java.lang.String m144906x9616526c() {
        int i17 = this.f396649a;
        if (i17 == 1) {
            return "Left";
        }
        if (i17 == 2) {
            return "Right";
        }
        if (i17 == 3) {
            return "Center";
        }
        if (i17 == 4) {
            return "Justify";
        }
        if (i17 == 5) {
            return "Start";
        }
        return i17 == 6 ? "End" : "Invalid";
    }
}
