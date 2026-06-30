package bs2;

/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f23842a;

    /* renamed from: b, reason: collision with root package name */
    public bs2.h0 f23843b;

    public g0(boolean z17) {
        this.f23842a = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bs2.g0) && this.f23842a == ((bs2.g0) obj).f23842a;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f23842a);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f23842a);
        sb6.append('@');
        sb6.append(this.f23843b);
        return sb6.toString();
    }
}
