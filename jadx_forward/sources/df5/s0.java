package df5;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f313736a;

    /* renamed from: b, reason: collision with root package name */
    public final int f313737b;

    public s0(int i17, int i18) {
        this.f313736a = i17;
        this.f313737b = i18;
    }

    /* renamed from: equals */
    public boolean m124361xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.s0)) {
            return false;
        }
        df5.s0 s0Var = (df5.s0) obj;
        return this.f313736a == s0Var.f313736a && this.f313737b == s0Var.f313737b;
    }

    /* renamed from: hashCode */
    public int m124362x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f313736a) * 31) + java.lang.Integer.hashCode(this.f313737b);
    }

    /* renamed from: toString */
    public java.lang.String m124363x9616526c() {
        return "ListSegmentKey(level=" + this.f313736a + ", seq=" + this.f313737b + ')';
    }
}
