package oc2;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f425682a;

    /* renamed from: b, reason: collision with root package name */
    public final float f425683b;

    /* renamed from: c, reason: collision with root package name */
    public final float f425684c;

    public a0(int i17, float f17, float f18) {
        this.f425682a = i17;
        this.f425683b = f17;
        this.f425684c = f18;
    }

    /* renamed from: equals */
    public boolean m150976xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2.a0)) {
            return false;
        }
        oc2.a0 a0Var = (oc2.a0) obj;
        return this.f425682a == a0Var.f425682a && java.lang.Float.compare(this.f425683b, a0Var.f425683b) == 0 && java.lang.Float.compare(this.f425684c, a0Var.f425684c) == 0;
    }

    /* renamed from: hashCode */
    public int m150977x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f425682a) * 31) + java.lang.Float.hashCode(this.f425683b)) * 31) + java.lang.Float.hashCode(this.f425684c);
    }

    /* renamed from: toString */
    public java.lang.String m150978x9616526c() {
        return "BalanceFallbackTextResult(maxWidth=" + this.f425682a + ", line1Width=" + this.f425683b + ", line2Width=" + this.f425684c + ')';
    }
}
