package wn1;

/* loaded from: classes11.dex */
public class t extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f529009d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f529010e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f529011f;

    /* renamed from: g, reason: collision with root package name */
    public int f529012g;

    /* renamed from: h, reason: collision with root package name */
    public int f529013h;

    /* renamed from: i, reason: collision with root package name */
    public int f529014i;

    /* renamed from: m, reason: collision with root package name */
    public int f529015m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.t)) {
            return false;
        }
        wn1.t tVar = (wn1.t) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f529009d), java.lang.Integer.valueOf(tVar.f529009d)) && n51.f.a(this.f529010e, tVar.f529010e) && n51.f.a(this.f529011f, tVar.f529011f) && n51.f.a(java.lang.Integer.valueOf(this.f529012g), java.lang.Integer.valueOf(tVar.f529012g)) && n51.f.a(java.lang.Integer.valueOf(this.f529013h), java.lang.Integer.valueOf(tVar.f529013h)) && n51.f.a(java.lang.Integer.valueOf(this.f529014i), java.lang.Integer.valueOf(tVar.f529014i)) && n51.f.a(java.lang.Integer.valueOf(this.f529015m), java.lang.Integer.valueOf(tVar.f529015m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f529009d);
            java.lang.String str = this.f529010e;
            if (str != null) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f529011f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f529012g);
            fVar.e(5, this.f529013h);
            fVar.e(6, this.f529014i);
            fVar.e(7, this.f529015m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f529009d) + 0;
            java.lang.String str2 = this.f529010e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f529011f;
            if (gVar2 != null) {
                e17 += b36.f.b(3, gVar2);
            }
            return e17 + b36.f.e(4, this.f529012g) + b36.f.e(5, this.f529013h) + b36.f.e(6, this.f529014i) + b36.f.e(7, this.f529015m);
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
        wn1.t tVar = (wn1.t) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tVar.f529009d = aVar2.g(intValue);
                return 0;
            case 2:
                tVar.f529010e = aVar2.k(intValue);
                return 0;
            case 3:
                tVar.f529011f = aVar2.d(intValue);
                return 0;
            case 4:
                tVar.f529012g = aVar2.g(intValue);
                return 0;
            case 5:
                tVar.f529013h = aVar2.g(intValue);
                return 0;
            case 6:
                tVar.f529014i = aVar2.g(intValue);
                return 0;
            case 7:
                tVar.f529015m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
