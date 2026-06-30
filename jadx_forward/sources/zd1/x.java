package zd1;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final long f553114a;

    /* renamed from: b, reason: collision with root package name */
    public final int f553115b;

    public x(long j17, int i17) {
        this.f553114a = j17;
        this.f553115b = i17;
    }

    /* renamed from: equals */
    public boolean m178725xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd1.x)) {
            return false;
        }
        zd1.x xVar = (zd1.x) obj;
        return this.f553114a == xVar.f553114a && this.f553115b == xVar.f553115b;
    }

    /* renamed from: hashCode */
    public int m178726x8cdac1b() {
        return (java.lang.Long.hashCode(this.f553114a) * 31) + java.lang.Integer.hashCode(this.f553115b);
    }

    /* renamed from: toString */
    public java.lang.String m178727x9616526c() {
        return "StartArgs(intervalMillis=" + this.f553114a + ", shortEdge=" + this.f553115b + ')';
    }
}
