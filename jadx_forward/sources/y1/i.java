package y1;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f540251a;

    /* renamed from: equals */
    public boolean m176332xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof y1.i) {
            return this.f540251a == ((y1.i) obj).f540251a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m176333x8cdac1b() {
        return java.lang.Integer.hashCode(this.f540251a);
    }

    /* renamed from: toString */
    public java.lang.String m176334x9616526c() {
        int i17 = this.f540251a;
        if (i17 == 0) {
            return "Button";
        }
        if (i17 == 1) {
            return "Checkbox";
        }
        if (i17 == 2) {
            return "Switch";
        }
        if (i17 == 3) {
            return "RadioButton";
        }
        if (i17 == 4) {
            return "Tab";
        }
        return i17 == 5 ? "Image" : "Unknown";
    }
}
