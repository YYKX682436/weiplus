package xt2;

/* loaded from: classes3.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f538614a;

    /* renamed from: b, reason: collision with root package name */
    public final int f538615b;

    public w1(int i17, int i18) {
        this.f538614a = i17;
        this.f538615b = i18;
    }

    /* renamed from: equals */
    public boolean m175962xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt2.w1)) {
            return false;
        }
        xt2.w1 w1Var = (xt2.w1) obj;
        return this.f538614a == w1Var.f538614a && this.f538615b == w1Var.f538615b;
    }

    /* renamed from: hashCode */
    public int m175963x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f538614a) * 31) + java.lang.Integer.hashCode(this.f538615b);
    }

    /* renamed from: toString */
    public java.lang.String m175964x9616526c() {
        return "MeasureCacheResult(measuredWidth=" + this.f538614a + ", measuredHeight=" + this.f538615b + ')';
    }
}
