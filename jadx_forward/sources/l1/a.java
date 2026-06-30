package l1;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f396502a;

    /* renamed from: equals */
    public boolean m144847xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof l1.a) {
            return this.f396502a == ((l1.a) obj).f396502a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m144848x8cdac1b() {
        return java.lang.Integer.hashCode(this.f396502a);
    }

    /* renamed from: toString */
    public java.lang.String m144849x9616526c() {
        int i17 = this.f396502a;
        if (i17 == 1) {
            return "Touch";
        }
        return i17 == 2 ? "Keyboard" : "Error";
    }
}
