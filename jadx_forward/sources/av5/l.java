package av5;

/* loaded from: classes16.dex */
public final class l extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final int f95939e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95940f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95941g;

    /* renamed from: h, reason: collision with root package name */
    public final int f95942h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f95943i;

    /* renamed from: m, reason: collision with root package name */
    public final av5.k[] f95944m;

    /* renamed from: n, reason: collision with root package name */
    public final av5.j[] f95945n;

    public l(int i17, int i18, int i19, int i27, int i28, short[] sArr, av5.k[] kVarArr, av5.j[] jVarArr) {
        super(i17);
        this.f95939e = i18;
        this.f95940f = i19;
        this.f95941g = i27;
        this.f95942h = i28;
        this.f95943i = sArr;
        this.f95944m = kVarArr;
        this.f95945n = jVarArr;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.l lVar) {
        int c17 = cv5.c.c(this.f95939e, lVar.f95939e);
        if (c17 != 0) {
            return c17;
        }
        int c18 = cv5.c.c(this.f95940f, lVar.f95940f);
        if (c18 != 0) {
            return c18;
        }
        int c19 = cv5.c.c(this.f95941g, lVar.f95941g);
        if (c19 != 0) {
            return c19;
        }
        int c27 = cv5.c.c(this.f95942h, lVar.f95942h);
        if (c27 != 0) {
            return c27;
        }
        int e17 = cv5.c.e(this.f95943i, lVar.f95943i);
        if (e17 != 0) {
            return e17;
        }
        int a17 = cv5.c.a(this.f95944m, lVar.f95944m);
        return a17 != 0 ? a17 : cv5.c.a(this.f95945n, lVar.f95945n);
    }

    @Override // av5.m0
    /* renamed from: equals */
    public boolean mo9117xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof av5.l) && compareTo((av5.l) obj) == 0;
    }

    @Override // av5.m0
    /* renamed from: hashCode */
    public int mo9118x8cdac1b() {
        return cv5.e.a(java.lang.Integer.valueOf(this.f95939e), java.lang.Integer.valueOf(this.f95940f), java.lang.Integer.valueOf(this.f95941g), java.lang.Integer.valueOf(this.f95942h), this.f95943i, this.f95944m, this.f95945n);
    }
}
