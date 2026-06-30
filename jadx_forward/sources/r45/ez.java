package r45;

/* loaded from: classes12.dex */
public class ez extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455365d;

    /* renamed from: e, reason: collision with root package name */
    public double f455366e;

    /* renamed from: f, reason: collision with root package name */
    public double f455367f;

    /* renamed from: g, reason: collision with root package name */
    public double f455368g;

    /* renamed from: h, reason: collision with root package name */
    public double f455369h;

    /* renamed from: i, reason: collision with root package name */
    public double f455370i;

    /* renamed from: m, reason: collision with root package name */
    public int f455371m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ez)) {
            return false;
        }
        r45.ez ezVar = (r45.ez) fVar;
        return n51.f.a(this.f455365d, ezVar.f455365d) && n51.f.a(java.lang.Double.valueOf(this.f455366e), java.lang.Double.valueOf(ezVar.f455366e)) && n51.f.a(java.lang.Double.valueOf(this.f455367f), java.lang.Double.valueOf(ezVar.f455367f)) && n51.f.a(java.lang.Double.valueOf(this.f455368g), java.lang.Double.valueOf(ezVar.f455368g)) && n51.f.a(java.lang.Double.valueOf(this.f455369h), java.lang.Double.valueOf(ezVar.f455369h)) && n51.f.a(java.lang.Double.valueOf(this.f455370i), java.lang.Double.valueOf(ezVar.f455370i)) && n51.f.a(java.lang.Integer.valueOf(this.f455371m), java.lang.Integer.valueOf(ezVar.f455371m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f455365d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.c(2, this.f455366e);
            fVar.c(3, this.f455367f);
            fVar.c(4, this.f455368g);
            fVar.c(5, this.f455369h);
            fVar.c(6, this.f455370i);
            fVar.e(7, this.f455371m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f455365d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.c(2, this.f455366e) + b36.f.c(3, this.f455367f) + b36.f.c(4, this.f455368g) + b36.f.c(5, this.f455369h) + b36.f.c(6, this.f455370i) + b36.f.e(7, this.f455371m);
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
        r45.ez ezVar = (r45.ez) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ezVar.f455365d = aVar2.k(intValue);
                return 0;
            case 2:
                ezVar.f455366e = aVar2.e(intValue);
                return 0;
            case 3:
                ezVar.f455367f = aVar2.e(intValue);
                return 0;
            case 4:
                ezVar.f455368g = aVar2.e(intValue);
                return 0;
            case 5:
                ezVar.f455369h = aVar2.e(intValue);
                return 0;
            case 6:
                ezVar.f455370i = aVar2.e(intValue);
                return 0;
            case 7:
                ezVar.f455371m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
