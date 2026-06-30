package p75;

/* loaded from: classes4.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f434200a;

    /* renamed from: b, reason: collision with root package name */
    public final int f434201b;

    public j0(int i17, int i18) {
        this.f434200a = i17;
        this.f434201b = i18;
    }

    /* renamed from: equals */
    public boolean m157945xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p75.j0)) {
            return false;
        }
        p75.j0 j0Var = (p75.j0) obj;
        return this.f434200a == j0Var.f434200a && this.f434201b == j0Var.f434201b;
    }

    /* renamed from: hashCode */
    public int m157946x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f434200a) * 31) + java.lang.Integer.hashCode(this.f434201b);
    }

    /* renamed from: toString */
    public java.lang.String m157947x9616526c() {
        return "Limit(limit=" + this.f434200a + ", offset=" + this.f434201b + ')';
    }
}
