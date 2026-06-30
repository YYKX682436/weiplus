package mm2;

/* loaded from: classes3.dex */
public final class g7 {

    /* renamed from: a, reason: collision with root package name */
    public final int f410627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f410628b;

    /* renamed from: c, reason: collision with root package name */
    public final int f410629c;

    /* renamed from: d, reason: collision with root package name */
    public final int f410630d;

    public g7(int i17, int i18, int i19, int i27) {
        this.f410627a = i17;
        this.f410628b = i18;
        this.f410629c = i19;
        this.f410630d = i27;
    }

    /* renamed from: equals */
    public boolean m147932xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.g7)) {
            return false;
        }
        mm2.g7 g7Var = (mm2.g7) obj;
        return this.f410627a == g7Var.f410627a && this.f410628b == g7Var.f410628b && this.f410629c == g7Var.f410629c && this.f410630d == g7Var.f410630d;
    }

    /* renamed from: hashCode */
    public int m147933x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f410627a) * 31) + java.lang.Integer.hashCode(this.f410628b)) * 31) + java.lang.Integer.hashCode(this.f410629c)) * 31) + java.lang.Integer.hashCode(this.f410630d);
    }

    /* renamed from: toString */
    public java.lang.String m147934x9616526c() {
        return "IndicatorData(pos=" + this.f410627a + ", viewX=" + this.f410628b + ", viewY=" + this.f410629c + ", viewHeight=" + this.f410630d + ')';
    }
}
