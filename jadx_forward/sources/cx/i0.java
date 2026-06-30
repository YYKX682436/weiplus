package cx;

/* loaded from: classes14.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f305944a;

    /* renamed from: b, reason: collision with root package name */
    public final int f305945b;

    /* renamed from: c, reason: collision with root package name */
    public final int f305946c;

    /* renamed from: d, reason: collision with root package name */
    public final int f305947d;

    /* renamed from: e, reason: collision with root package name */
    public final int f305948e;

    public i0(int i17, int i18, int i19, int i27, int i28) {
        this.f305944a = i17;
        this.f305945b = i18;
        this.f305946c = i19;
        this.f305947d = i27;
        this.f305948e = i28;
    }

    /* renamed from: equals */
    public boolean m123026xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx.i0)) {
            return false;
        }
        cx.i0 i0Var = (cx.i0) obj;
        return this.f305944a == i0Var.f305944a && this.f305945b == i0Var.f305945b && this.f305946c == i0Var.f305946c && this.f305947d == i0Var.f305947d && this.f305948e == i0Var.f305948e;
    }

    /* renamed from: hashCode */
    public int m123027x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f305944a) * 31) + java.lang.Integer.hashCode(this.f305945b)) * 31) + java.lang.Integer.hashCode(this.f305946c)) * 31) + java.lang.Integer.hashCode(this.f305947d)) * 31) + java.lang.Integer.hashCode(this.f305948e);
    }

    /* renamed from: toString */
    public java.lang.String m123028x9616526c() {
        return "BrandCoverViewAttribute(left=" + this.f305944a + ", top=" + this.f305945b + ", width=" + this.f305946c + ", height=" + this.f305947d + ", hide=" + this.f305948e + ')';
    }
}
