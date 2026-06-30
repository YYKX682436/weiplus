package k91;

/* loaded from: classes7.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f387262a;

    /* renamed from: b, reason: collision with root package name */
    public long f387263b;

    public q0(boolean z17, long j17) {
        this.f387262a = z17;
        this.f387263b = j17;
    }

    /* renamed from: equals */
    public boolean m142198xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k91.q0)) {
            return false;
        }
        k91.q0 q0Var = (k91.q0) obj;
        return this.f387262a == q0Var.f387262a && this.f387263b == q0Var.f387263b;
    }

    /* renamed from: hashCode */
    public int m142199x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f387262a) * 31) + java.lang.Long.hashCode(this.f387263b);
    }

    /* renamed from: toString */
    public java.lang.String m142200x9616526c() {
        return "AppBrandOptimizationInfo(needDownload=" + this.f387262a + ", startTime=" + this.f387263b + ')';
    }

    public /* synthetic */ q0(boolean z17, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? false : z17, (i17 & 2) != 0 ? 0L : j17);
    }
}
