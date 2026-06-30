package gm2;

/* loaded from: classes3.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public float f355025a;

    /* renamed from: b, reason: collision with root package name */
    public final int f355026b;

    /* renamed from: c, reason: collision with root package name */
    public final int f355027c;

    /* renamed from: d, reason: collision with root package name */
    public final int f355028d;

    /* renamed from: e, reason: collision with root package name */
    public final int f355029e;

    /* renamed from: f, reason: collision with root package name */
    public final float f355030f;

    public u1(float f17, int i17, int i18, int i19, int i27, float f18) {
        this.f355025a = f17;
        this.f355026b = i17;
        this.f355027c = i18;
        this.f355028d = i19;
        this.f355029e = i27;
        this.f355030f = f18;
    }

    /* renamed from: equals */
    public boolean m131855xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm2.u1)) {
            return false;
        }
        gm2.u1 u1Var = (gm2.u1) obj;
        return java.lang.Float.compare(this.f355025a, u1Var.f355025a) == 0 && this.f355026b == u1Var.f355026b && this.f355027c == u1Var.f355027c && this.f355028d == u1Var.f355028d && this.f355029e == u1Var.f355029e && java.lang.Float.compare(this.f355030f, u1Var.f355030f) == 0;
    }

    /* renamed from: hashCode */
    public int m131856x8cdac1b() {
        return (((((((((java.lang.Float.hashCode(this.f355025a) * 31) + java.lang.Integer.hashCode(this.f355026b)) * 31) + java.lang.Integer.hashCode(this.f355027c)) * 31) + java.lang.Integer.hashCode(this.f355028d)) * 31) + java.lang.Integer.hashCode(this.f355029e)) * 31) + java.lang.Float.hashCode(this.f355030f);
    }

    /* renamed from: toString */
    public java.lang.String m131857x9616526c() {
        return "BgParams(bgRadius=" + this.f355025a + ", bgLeftTopColor=" + this.f355026b + ", bgRightBottomColor=" + this.f355027c + ", bgMaskColor=" + this.f355028d + ", borderColor=" + this.f355029e + ", borderWidth=" + this.f355030f + ')';
    }
}
