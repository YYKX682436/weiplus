package av5;

/* loaded from: classes16.dex */
public final class e0 extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final int f14367e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14368f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14369g;

    public e0(int i17, int i18, int i19, int i27) {
        super(i17);
        this.f14367e = i18;
        this.f14368f = i19;
        this.f14369g = i27;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.e0 e0Var) {
        int i17 = e0Var.f14367e;
        int i18 = this.f14367e;
        if (i18 != i17) {
            return cv5.c.f(i18, i17);
        }
        int i19 = this.f14369g;
        int i27 = e0Var.f14369g;
        return i19 != i27 ? cv5.c.f(i19, i27) : cv5.c.f(this.f14368f, e0Var.f14368f);
    }

    @Override // av5.m0
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof av5.e0) && compareTo((av5.e0) obj) == 0;
    }

    @Override // av5.m0
    public int hashCode() {
        return cv5.e.a(java.lang.Integer.valueOf(this.f14367e), java.lang.Integer.valueOf(this.f14368f), java.lang.Integer.valueOf(this.f14369g));
    }
}
