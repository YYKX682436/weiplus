package e1;

/* loaded from: classes8.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f327819a;

    /* renamed from: equals */
    public boolean m126668xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof e1.r0) {
            return this.f327819a == ((e1.r0) obj).f327819a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m126669x8cdac1b() {
        return java.lang.Integer.hashCode(this.f327819a);
    }

    /* renamed from: toString */
    public java.lang.String m126670x9616526c() {
        int i17 = this.f327819a;
        if (i17 == 0) {
            return "NonZero";
        }
        return i17 == 1 ? "EvenOdd" : "Unknown";
    }
}
