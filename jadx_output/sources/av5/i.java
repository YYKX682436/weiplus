package av5;

/* loaded from: classes16.dex */
public final class i extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final int f14385e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14386f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14387g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14388h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14389i;

    /* renamed from: m, reason: collision with root package name */
    public final int f14390m;

    /* renamed from: n, reason: collision with root package name */
    public final int f14391n;

    /* renamed from: o, reason: collision with root package name */
    public final int f14392o;

    public i(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39) {
        super(i17);
        this.f14385e = i18;
        this.f14386f = i19;
        this.f14387g = i27;
        this.f14388h = i28;
        this.f14389i = i29;
        this.f14390m = i37;
        this.f14391n = i38;
        this.f14392o = i39;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.i iVar) {
        int f17 = cv5.c.f(this.f14385e, iVar.f14385e);
        if (f17 != 0) {
            return f17;
        }
        int c17 = cv5.c.c(this.f14386f, iVar.f14386f);
        if (c17 != 0) {
            return c17;
        }
        int f18 = cv5.c.f(this.f14387g, iVar.f14387g);
        if (f18 != 0) {
            return f18;
        }
        int c18 = cv5.c.c(this.f14388h, iVar.f14388h);
        if (c18 != 0) {
            return c18;
        }
        int f19 = cv5.c.f(this.f14389i, iVar.f14389i);
        if (f19 != 0) {
            return f19;
        }
        int c19 = cv5.c.c(this.f14390m, iVar.f14390m);
        if (c19 != 0) {
            return c19;
        }
        int c27 = cv5.c.c(this.f14391n, iVar.f14391n);
        return c27 != 0 ? c27 : cv5.c.c(this.f14392o, iVar.f14392o);
    }

    @Override // av5.m0
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof av5.i) && compareTo((av5.i) obj) == 0;
    }

    @Override // av5.m0
    public int hashCode() {
        return cv5.e.a(java.lang.Integer.valueOf(this.f14385e), java.lang.Integer.valueOf(this.f14386f), java.lang.Integer.valueOf(this.f14387g), java.lang.Integer.valueOf(this.f14388h), java.lang.Integer.valueOf(this.f14389i), java.lang.Integer.valueOf(this.f14390m), java.lang.Integer.valueOf(this.f14391n), java.lang.Integer.valueOf(this.f14392o));
    }
}
