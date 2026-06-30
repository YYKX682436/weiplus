package av5;

/* loaded from: classes16.dex */
public final class e0 extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final int f95900e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95901f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95902g;

    public e0(int i17, int i18, int i19, int i27) {
        super(i17);
        this.f95900e = i18;
        this.f95901f = i19;
        this.f95902g = i27;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.e0 e0Var) {
        int i17 = e0Var.f95900e;
        int i18 = this.f95900e;
        if (i18 != i17) {
            return cv5.c.f(i18, i17);
        }
        int i19 = this.f95902g;
        int i27 = e0Var.f95902g;
        return i19 != i27 ? cv5.c.f(i19, i27) : cv5.c.f(this.f95901f, e0Var.f95901f);
    }

    @Override // av5.m0
    /* renamed from: equals */
    public boolean mo9117xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof av5.e0) && compareTo((av5.e0) obj) == 0;
    }

    @Override // av5.m0
    /* renamed from: hashCode */
    public int mo9118x8cdac1b() {
        return cv5.e.a(java.lang.Integer.valueOf(this.f95900e), java.lang.Integer.valueOf(this.f95901f), java.lang.Integer.valueOf(this.f95902g));
    }
}
