package wn1;

/* loaded from: classes12.dex */
public class u extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f529016d;

    /* renamed from: e, reason: collision with root package name */
    public int f529017e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f529018f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f529019g;

    /* renamed from: h, reason: collision with root package name */
    public int f529020h;

    /* renamed from: i, reason: collision with root package name */
    public int f529021i;

    /* renamed from: m, reason: collision with root package name */
    public int f529022m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f529023n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.u)) {
            return false;
        }
        wn1.u uVar = (wn1.u) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f529016d), java.lang.Integer.valueOf(uVar.f529016d)) && n51.f.a(java.lang.Integer.valueOf(this.f529017e), java.lang.Integer.valueOf(uVar.f529017e)) && n51.f.a(this.f529018f, uVar.f529018f) && n51.f.a(this.f529019g, uVar.f529019g) && n51.f.a(java.lang.Integer.valueOf(this.f529020h), java.lang.Integer.valueOf(uVar.f529020h)) && n51.f.a(java.lang.Integer.valueOf(this.f529021i), java.lang.Integer.valueOf(uVar.f529021i)) && n51.f.a(java.lang.Integer.valueOf(this.f529022m), java.lang.Integer.valueOf(uVar.f529022m)) && n51.f.a(this.f529023n, uVar.f529023n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f529016d);
            fVar.e(2, this.f529017e);
            java.lang.String str = this.f529018f;
            if (str != null) {
                fVar.j(3, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f529019g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f529020h);
            fVar.e(6, this.f529021i);
            fVar.e(7, this.f529022m);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f529023n;
            if (gVar2 != null) {
                fVar.b(8, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f529016d) + 0 + b36.f.e(2, this.f529017e);
            java.lang.String str2 = this.f529018f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f529019g;
            if (gVar3 != null) {
                e17 += b36.f.b(4, gVar3);
            }
            int e18 = e17 + b36.f.e(5, this.f529020h) + b36.f.e(6, this.f529021i) + b36.f.e(7, this.f529022m);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f529023n;
            return gVar4 != null ? e18 + b36.f.b(8, gVar4) : e18;
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
        wn1.u uVar = (wn1.u) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uVar.f529016d = aVar2.g(intValue);
                return 0;
            case 2:
                uVar.f529017e = aVar2.g(intValue);
                return 0;
            case 3:
                uVar.f529018f = aVar2.k(intValue);
                return 0;
            case 4:
                uVar.f529019g = aVar2.d(intValue);
                return 0;
            case 5:
                uVar.f529020h = aVar2.g(intValue);
                return 0;
            case 6:
                uVar.f529021i = aVar2.g(intValue);
                return 0;
            case 7:
                uVar.f529022m = aVar2.g(intValue);
                return 0;
            case 8:
                uVar.f529023n = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
