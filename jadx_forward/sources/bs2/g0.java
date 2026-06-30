package bs2;

/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f105375a;

    /* renamed from: b, reason: collision with root package name */
    public bs2.h0 f105376b;

    public g0(boolean z17) {
        this.f105375a = z17;
    }

    /* renamed from: equals */
    public boolean m11102xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bs2.g0) && this.f105375a == ((bs2.g0) obj).f105375a;
    }

    /* renamed from: hashCode */
    public int m11103x8cdac1b() {
        return java.lang.Boolean.hashCode(this.f105375a);
    }

    /* renamed from: toString */
    public java.lang.String m11104x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f105375a);
        sb6.append('@');
        sb6.append(this.f105376b);
        return sb6.toString();
    }
}
