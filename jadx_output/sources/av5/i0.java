package av5;

/* loaded from: classes16.dex */
public final class i0 extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final int f14393e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14394f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14395g;

    public i0(int i17, int i18, int i19, int i27) {
        super(i17);
        this.f14393e = i18;
        this.f14394f = i19;
        this.f14395g = i27;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.i0 i0Var) {
        int i17 = i0Var.f14393e;
        int i18 = this.f14393e;
        if (i18 != i17) {
            return cv5.c.f(i18, i17);
        }
        int i19 = this.f14395g;
        int i27 = i0Var.f14395g;
        return i19 != i27 ? cv5.c.f(i19, i27) : cv5.c.f(this.f14394f, i0Var.f14394f);
    }

    @Override // av5.m0
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof av5.i0) && compareTo((av5.i0) obj) == 0;
    }

    @Override // av5.m0
    public int hashCode() {
        return cv5.e.a(java.lang.Integer.valueOf(this.f14393e), java.lang.Integer.valueOf(this.f14394f), java.lang.Integer.valueOf(this.f14395g));
    }
}
