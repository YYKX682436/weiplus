package av5;

/* loaded from: classes16.dex */
public final class i0 extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final int f95926e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95927f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95928g;

    public i0(int i17, int i18, int i19, int i27) {
        super(i17);
        this.f95926e = i18;
        this.f95927f = i19;
        this.f95928g = i27;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.i0 i0Var) {
        int i17 = i0Var.f95926e;
        int i18 = this.f95926e;
        if (i18 != i17) {
            return cv5.c.f(i18, i17);
        }
        int i19 = this.f95928g;
        int i27 = i0Var.f95928g;
        return i19 != i27 ? cv5.c.f(i19, i27) : cv5.c.f(this.f95927f, i0Var.f95927f);
    }

    @Override // av5.m0
    /* renamed from: equals */
    public boolean mo9117xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof av5.i0) && compareTo((av5.i0) obj) == 0;
    }

    @Override // av5.m0
    /* renamed from: hashCode */
    public int mo9118x8cdac1b() {
        return cv5.e.a(java.lang.Integer.valueOf(this.f95926e), java.lang.Integer.valueOf(this.f95927f), java.lang.Integer.valueOf(this.f95928g));
    }
}
