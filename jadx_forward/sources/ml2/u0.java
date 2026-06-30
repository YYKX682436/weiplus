package ml2;

/* loaded from: classes3.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public long f409562a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f409563b;

    public u0(long j17, boolean z17) {
        this.f409562a = j17;
        this.f409563b = z17;
    }

    /* renamed from: equals */
    public boolean m147740xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml2.u0)) {
            return false;
        }
        ml2.u0 u0Var = (ml2.u0) obj;
        return this.f409562a == u0Var.f409562a && this.f409563b == u0Var.f409563b;
    }

    /* renamed from: hashCode */
    public int m147741x8cdac1b() {
        return (java.lang.Long.hashCode(this.f409562a) * 31) + java.lang.Boolean.hashCode(this.f409563b);
    }

    /* renamed from: toString */
    public java.lang.String m147742x9616526c() {
        return "HellPair(time=" + this.f409562a + ", state=" + this.f409563b + ')';
    }
}
