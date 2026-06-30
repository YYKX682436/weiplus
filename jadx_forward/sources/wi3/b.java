package wi3;

/* loaded from: classes4.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f527700d;

    /* renamed from: e, reason: collision with root package name */
    public int f527701e;

    /* renamed from: f, reason: collision with root package name */
    public int f527702f;

    /* renamed from: g, reason: collision with root package name */
    public long f527703g;

    /* renamed from: h, reason: collision with root package name */
    public long f527704h;

    /* renamed from: i, reason: collision with root package name */
    public double f527705i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f527706m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f527707n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wi3.b)) {
            return false;
        }
        wi3.b bVar = (wi3.b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f527700d), java.lang.Integer.valueOf(bVar.f527700d)) && n51.f.a(java.lang.Integer.valueOf(this.f527701e), java.lang.Integer.valueOf(bVar.f527701e)) && n51.f.a(java.lang.Integer.valueOf(this.f527702f), java.lang.Integer.valueOf(bVar.f527702f)) && n51.f.a(java.lang.Long.valueOf(this.f527703g), java.lang.Long.valueOf(bVar.f527703g)) && n51.f.a(java.lang.Long.valueOf(this.f527704h), java.lang.Long.valueOf(bVar.f527704h)) && n51.f.a(java.lang.Double.valueOf(this.f527705i), java.lang.Double.valueOf(bVar.f527705i)) && n51.f.a(this.f527706m, bVar.f527706m) && n51.f.a(this.f527707n, bVar.f527707n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f527700d);
            fVar.e(2, this.f527701e);
            fVar.e(3, this.f527702f);
            fVar.h(4, this.f527703g);
            fVar.h(5, this.f527704h);
            fVar.c(6, this.f527705i);
            java.lang.String str = this.f527706m;
            if (str != null) {
                fVar.j(7, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f527707n;
            if (gVar != null) {
                fVar.b(8, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f527700d) + 0 + b36.f.e(2, this.f527701e) + b36.f.e(3, this.f527702f) + b36.f.h(4, this.f527703g) + b36.f.h(5, this.f527704h) + b36.f.c(6, this.f527705i);
            java.lang.String str2 = this.f527706m;
            if (str2 != null) {
                e17 += b36.f.j(7, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f527707n;
            return gVar2 != null ? e17 + b36.f.b(8, gVar2) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        wi3.b bVar = (wi3.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bVar.f527700d = aVar2.g(intValue);
                return 0;
            case 2:
                bVar.f527701e = aVar2.g(intValue);
                return 0;
            case 3:
                bVar.f527702f = aVar2.g(intValue);
                return 0;
            case 4:
                bVar.f527703g = aVar2.i(intValue);
                return 0;
            case 5:
                bVar.f527704h = aVar2.i(intValue);
                return 0;
            case 6:
                bVar.f527705i = aVar2.e(intValue);
                return 0;
            case 7:
                bVar.f527706m = aVar2.k(intValue);
                return 0;
            case 8:
                bVar.f527707n = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
