package zv0;

/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f557710a;

    /* renamed from: b, reason: collision with root package name */
    public final int f557711b;

    public g0(int i17, int i18) {
        this.f557710a = i17;
        this.f557711b = i18;
    }

    /* renamed from: equals */
    public boolean m179705xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv0.g0)) {
            return false;
        }
        zv0.g0 g0Var = (zv0.g0) obj;
        return this.f557710a == g0Var.f557710a && this.f557711b == g0Var.f557711b;
    }

    /* renamed from: hashCode */
    public int m179706x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f557710a) * 31) + java.lang.Integer.hashCode(this.f557711b);
    }

    /* renamed from: toString */
    public java.lang.String m179707x9616526c() {
        return "TransitionSelectedPack(preIndex=" + this.f557710a + ", selectedIndex=" + this.f557711b + ')';
    }
}
