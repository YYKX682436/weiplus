package av5;

/* loaded from: classes16.dex */
public final class l extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final int f14406e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14407f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14408g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14409h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f14410i;

    /* renamed from: m, reason: collision with root package name */
    public final av5.k[] f14411m;

    /* renamed from: n, reason: collision with root package name */
    public final av5.j[] f14412n;

    public l(int i17, int i18, int i19, int i27, int i28, short[] sArr, av5.k[] kVarArr, av5.j[] jVarArr) {
        super(i17);
        this.f14406e = i18;
        this.f14407f = i19;
        this.f14408g = i27;
        this.f14409h = i28;
        this.f14410i = sArr;
        this.f14411m = kVarArr;
        this.f14412n = jVarArr;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.l lVar) {
        int c17 = cv5.c.c(this.f14406e, lVar.f14406e);
        if (c17 != 0) {
            return c17;
        }
        int c18 = cv5.c.c(this.f14407f, lVar.f14407f);
        if (c18 != 0) {
            return c18;
        }
        int c19 = cv5.c.c(this.f14408g, lVar.f14408g);
        if (c19 != 0) {
            return c19;
        }
        int c27 = cv5.c.c(this.f14409h, lVar.f14409h);
        if (c27 != 0) {
            return c27;
        }
        int e17 = cv5.c.e(this.f14410i, lVar.f14410i);
        if (e17 != 0) {
            return e17;
        }
        int a17 = cv5.c.a(this.f14411m, lVar.f14411m);
        return a17 != 0 ? a17 : cv5.c.a(this.f14412n, lVar.f14412n);
    }

    @Override // av5.m0
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof av5.l) && compareTo((av5.l) obj) == 0;
    }

    @Override // av5.m0
    public int hashCode() {
        return cv5.e.a(java.lang.Integer.valueOf(this.f14406e), java.lang.Integer.valueOf(this.f14407f), java.lang.Integer.valueOf(this.f14408g), java.lang.Integer.valueOf(this.f14409h), this.f14410i, this.f14411m, this.f14412n);
    }
}
