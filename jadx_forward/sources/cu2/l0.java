package cu2;

/* loaded from: classes2.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f303951a;

    /* renamed from: b, reason: collision with root package name */
    public final float f303952b;

    public l0(long j17, float f17) {
        this.f303951a = j17;
        this.f303952b = f17;
    }

    /* renamed from: equals */
    public boolean m122723xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu2.l0)) {
            return false;
        }
        cu2.l0 l0Var = (cu2.l0) obj;
        return this.f303951a == l0Var.f303951a && java.lang.Float.compare(this.f303952b, l0Var.f303952b) == 0;
    }

    /* renamed from: hashCode */
    public int m122724x8cdac1b() {
        return (java.lang.Long.hashCode(this.f303951a) * 31) + java.lang.Float.hashCode(this.f303952b);
    }

    /* renamed from: toString */
    public java.lang.String m122725x9616526c() {
        return "MaxProgressData(feedId=" + this.f303951a + ", maxProgress=" + this.f303952b + ')';
    }
}
