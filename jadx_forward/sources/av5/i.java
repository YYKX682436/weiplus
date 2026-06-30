package av5;

/* loaded from: classes16.dex */
public final class i extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final int f95918e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95919f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95920g;

    /* renamed from: h, reason: collision with root package name */
    public final int f95921h;

    /* renamed from: i, reason: collision with root package name */
    public final int f95922i;

    /* renamed from: m, reason: collision with root package name */
    public final int f95923m;

    /* renamed from: n, reason: collision with root package name */
    public final int f95924n;

    /* renamed from: o, reason: collision with root package name */
    public final int f95925o;

    public i(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39) {
        super(i17);
        this.f95918e = i18;
        this.f95919f = i19;
        this.f95920g = i27;
        this.f95921h = i28;
        this.f95922i = i29;
        this.f95923m = i37;
        this.f95924n = i38;
        this.f95925o = i39;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.i iVar) {
        int f17 = cv5.c.f(this.f95918e, iVar.f95918e);
        if (f17 != 0) {
            return f17;
        }
        int c17 = cv5.c.c(this.f95919f, iVar.f95919f);
        if (c17 != 0) {
            return c17;
        }
        int f18 = cv5.c.f(this.f95920g, iVar.f95920g);
        if (f18 != 0) {
            return f18;
        }
        int c18 = cv5.c.c(this.f95921h, iVar.f95921h);
        if (c18 != 0) {
            return c18;
        }
        int f19 = cv5.c.f(this.f95922i, iVar.f95922i);
        if (f19 != 0) {
            return f19;
        }
        int c19 = cv5.c.c(this.f95923m, iVar.f95923m);
        if (c19 != 0) {
            return c19;
        }
        int c27 = cv5.c.c(this.f95924n, iVar.f95924n);
        return c27 != 0 ? c27 : cv5.c.c(this.f95925o, iVar.f95925o);
    }

    @Override // av5.m0
    /* renamed from: equals */
    public boolean mo9117xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof av5.i) && compareTo((av5.i) obj) == 0;
    }

    @Override // av5.m0
    /* renamed from: hashCode */
    public int mo9118x8cdac1b() {
        return cv5.e.a(java.lang.Integer.valueOf(this.f95918e), java.lang.Integer.valueOf(this.f95919f), java.lang.Integer.valueOf(this.f95920g), java.lang.Integer.valueOf(this.f95921h), java.lang.Integer.valueOf(this.f95922i), java.lang.Integer.valueOf(this.f95923m), java.lang.Integer.valueOf(this.f95924n), java.lang.Integer.valueOf(this.f95925o));
    }
}
