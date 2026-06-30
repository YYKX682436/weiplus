package ai4;

/* loaded from: classes11.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f86691a;

    /* renamed from: b, reason: collision with root package name */
    public final long f86692b;

    /* renamed from: c, reason: collision with root package name */
    public final long f86693c;

    public j0(boolean z17, long j17, long j18) {
        this.f86691a = z17;
        this.f86692b = j17;
        this.f86693c = j18;
    }

    /* renamed from: equals */
    public boolean m2092xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai4.j0)) {
            return false;
        }
        ai4.j0 j0Var = (ai4.j0) obj;
        return this.f86691a == j0Var.f86691a && this.f86692b == j0Var.f86692b && this.f86693c == j0Var.f86693c;
    }

    /* renamed from: hashCode */
    public int m2093x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f86691a) * 31) + java.lang.Long.hashCode(this.f86692b)) * 31) + java.lang.Long.hashCode(this.f86693c);
    }

    /* renamed from: toString */
    public java.lang.String m2094x9616526c() {
        return "StatusAffTransferJobResult(isComplete=" + this.f86691a + ", oldDBCount=" + this.f86692b + ", successCount=" + this.f86693c + ')';
    }
}
