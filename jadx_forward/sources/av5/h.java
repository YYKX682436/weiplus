package av5;

/* loaded from: classes16.dex */
public final class h extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final av5.f[] f95910e;

    /* renamed from: f, reason: collision with root package name */
    public final av5.f[] f95911f;

    /* renamed from: g, reason: collision with root package name */
    public final av5.g[] f95912g;

    /* renamed from: h, reason: collision with root package name */
    public final av5.g[] f95913h;

    public h(int i17, av5.f[] fVarArr, av5.f[] fVarArr2, av5.g[] gVarArr, av5.g[] gVarArr2) {
        super(i17);
        this.f95910e = fVarArr;
        this.f95911f = fVarArr2;
        this.f95912g = gVarArr;
        this.f95913h = gVarArr2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.h hVar) {
        int a17 = cv5.c.a(this.f95910e, hVar.f95910e);
        if (a17 != 0) {
            return a17;
        }
        int a18 = cv5.c.a(this.f95911f, hVar.f95911f);
        if (a18 != 0) {
            return a18;
        }
        int a19 = cv5.c.a(this.f95912g, hVar.f95912g);
        return a19 != 0 ? a19 : cv5.c.a(this.f95913h, hVar.f95913h);
    }

    @Override // av5.m0
    /* renamed from: equals */
    public boolean mo9117xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof av5.h) && compareTo((av5.h) obj) == 0;
    }

    @Override // av5.m0
    /* renamed from: hashCode */
    public int mo9118x8cdac1b() {
        return cv5.e.a(this.f95910e, this.f95911f, this.f95912g, this.f95913h);
    }
}
