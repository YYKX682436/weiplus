package fm3;

/* loaded from: classes9.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f345615a;

    /* renamed from: b, reason: collision with root package name */
    public final long f345616b;

    /* renamed from: c, reason: collision with root package name */
    public final long f345617c;

    public k0(long j17, long j18, long j19) {
        this.f345615a = j17;
        this.f345616b = j18;
        this.f345617c = j19;
    }

    /* renamed from: equals */
    public boolean m129777xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm3.k0)) {
            return false;
        }
        fm3.k0 k0Var = (fm3.k0) obj;
        return this.f345615a == k0Var.f345615a && this.f345616b == k0Var.f345616b && this.f345617c == k0Var.f345617c;
    }

    /* renamed from: hashCode */
    public int m129778x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f345615a) * 31) + java.lang.Long.hashCode(this.f345616b)) * 31) + java.lang.Long.hashCode(this.f345617c);
    }

    /* renamed from: toString */
    public java.lang.String m129779x9616526c() {
        return "OnlineUserObj(pcu=" + this.f345615a + ", fcu=" + this.f345616b + ", mcu=" + this.f345617c + ')';
    }
}
