package av5;

/* loaded from: classes16.dex */
public final class h extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final av5.f[] f14377e;

    /* renamed from: f, reason: collision with root package name */
    public final av5.f[] f14378f;

    /* renamed from: g, reason: collision with root package name */
    public final av5.g[] f14379g;

    /* renamed from: h, reason: collision with root package name */
    public final av5.g[] f14380h;

    public h(int i17, av5.f[] fVarArr, av5.f[] fVarArr2, av5.g[] gVarArr, av5.g[] gVarArr2) {
        super(i17);
        this.f14377e = fVarArr;
        this.f14378f = fVarArr2;
        this.f14379g = gVarArr;
        this.f14380h = gVarArr2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(av5.h hVar) {
        int a17 = cv5.c.a(this.f14377e, hVar.f14377e);
        if (a17 != 0) {
            return a17;
        }
        int a18 = cv5.c.a(this.f14378f, hVar.f14378f);
        if (a18 != 0) {
            return a18;
        }
        int a19 = cv5.c.a(this.f14379g, hVar.f14379g);
        return a19 != 0 ? a19 : cv5.c.a(this.f14380h, hVar.f14380h);
    }

    @Override // av5.m0
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof av5.h) && compareTo((av5.h) obj) == 0;
    }

    @Override // av5.m0
    public int hashCode() {
        return cv5.e.a(this.f14377e, this.f14378f, this.f14379g, this.f14380h);
    }
}
