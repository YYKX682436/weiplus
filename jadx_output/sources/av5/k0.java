package av5;

/* loaded from: classes16.dex */
public final class k0 extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final int f14403e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14404f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14405g;

    public k0(int i17, int i18, int i19, int i27) {
        super(i17);
        this.f14403e = i18;
        this.f14404f = i19;
        this.f14405g = i27;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.k0 k0Var) {
        int f17 = cv5.c.f(this.f14403e, k0Var.f14403e);
        if (f17 != 0) {
            return f17;
        }
        int f18 = cv5.c.f(this.f14404f, k0Var.f14404f);
        return f18 != 0 ? f18 : cv5.c.c(this.f14405g, k0Var.f14405g);
    }

    @Override // av5.m0
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof av5.k0) && compareTo((av5.k0) obj) == 0;
    }

    @Override // av5.m0
    public int hashCode() {
        return cv5.e.a(java.lang.Integer.valueOf(this.f14403e), java.lang.Integer.valueOf(this.f14404f), java.lang.Integer.valueOf(this.f14405g));
    }
}
