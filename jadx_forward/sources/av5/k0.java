package av5;

/* loaded from: classes16.dex */
public final class k0 extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final int f95936e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95937f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95938g;

    public k0(int i17, int i18, int i19, int i27) {
        super(i17);
        this.f95936e = i18;
        this.f95937f = i19;
        this.f95938g = i27;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.k0 k0Var) {
        int f17 = cv5.c.f(this.f95936e, k0Var.f95936e);
        if (f17 != 0) {
            return f17;
        }
        int f18 = cv5.c.f(this.f95937f, k0Var.f95937f);
        return f18 != 0 ? f18 : cv5.c.c(this.f95938g, k0Var.f95938g);
    }

    @Override // av5.m0
    /* renamed from: equals */
    public boolean mo9117xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof av5.k0) && compareTo((av5.k0) obj) == 0;
    }

    @Override // av5.m0
    /* renamed from: hashCode */
    public int mo9118x8cdac1b() {
        return cv5.e.a(java.lang.Integer.valueOf(this.f95936e), java.lang.Integer.valueOf(this.f95937f), java.lang.Integer.valueOf(this.f95938g));
    }
}
