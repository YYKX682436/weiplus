package l2;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f396654a;

    /* renamed from: equals */
    public boolean m144911xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof l2.h) {
            return this.f396654a == ((l2.h) obj).f396654a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m144912x8cdac1b() {
        return java.lang.Integer.hashCode(this.f396654a);
    }

    /* renamed from: toString */
    public java.lang.String m144913x9616526c() {
        int i17 = this.f396654a;
        if (i17 == 1) {
            return "Ltr";
        }
        if (i17 == 2) {
            return "Rtl";
        }
        if (i17 == 3) {
            return "Content";
        }
        if (i17 == 4) {
            return "ContentOrLtr";
        }
        return i17 == 5 ? "ContentOrRtl" : "Invalid";
    }
}
