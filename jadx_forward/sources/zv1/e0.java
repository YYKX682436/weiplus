package zv1;

/* loaded from: classes10.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f557823a;

    /* renamed from: b, reason: collision with root package name */
    public final long f557824b;

    public e0(long j17, long j18) {
        this.f557823a = j17;
        this.f557824b = j18;
    }

    /* renamed from: equals */
    public boolean m179737xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.e0)) {
            return false;
        }
        zv1.e0 e0Var = (zv1.e0) obj;
        return this.f557823a == e0Var.f557823a && this.f557824b == e0Var.f557824b;
    }

    /* renamed from: hashCode */
    public int m179738x8cdac1b() {
        return (java.lang.Long.hashCode(this.f557823a) * 31) + java.lang.Long.hashCode(this.f557824b);
    }

    /* renamed from: toString */
    public java.lang.String m179739x9616526c() {
        return "CleanCacheThreshold(bizThreshold=" + this.f557823a + ", totalThreshold=" + this.f557824b + ')';
    }
}
