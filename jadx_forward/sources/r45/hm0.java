package r45;

/* loaded from: classes9.dex */
public class hm0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457816d;

    /* renamed from: e, reason: collision with root package name */
    public int f457817e;

    /* renamed from: f, reason: collision with root package name */
    public int f457818f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457819g;

    /* renamed from: h, reason: collision with root package name */
    public int f457820h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457821i;

    /* renamed from: m, reason: collision with root package name */
    public int f457822m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hm0)) {
            return false;
        }
        r45.hm0 hm0Var = (r45.hm0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457816d), java.lang.Integer.valueOf(hm0Var.f457816d)) && n51.f.a(java.lang.Integer.valueOf(this.f457817e), java.lang.Integer.valueOf(hm0Var.f457817e)) && n51.f.a(java.lang.Integer.valueOf(this.f457818f), java.lang.Integer.valueOf(hm0Var.f457818f)) && n51.f.a(this.f457819g, hm0Var.f457819g) && n51.f.a(java.lang.Integer.valueOf(this.f457820h), java.lang.Integer.valueOf(hm0Var.f457820h)) && n51.f.a(this.f457821i, hm0Var.f457821i) && n51.f.a(java.lang.Integer.valueOf(this.f457822m), java.lang.Integer.valueOf(hm0Var.f457822m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457816d);
            fVar.e(2, this.f457817e);
            fVar.e(3, this.f457818f);
            java.lang.String str = this.f457819g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f457820h);
            java.lang.String str2 = this.f457821i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f457822m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f457816d) + 0 + b36.f.e(2, this.f457817e) + b36.f.e(3, this.f457818f);
            java.lang.String str3 = this.f457819g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            int e18 = e17 + b36.f.e(5, this.f457820h);
            java.lang.String str4 = this.f457821i;
            if (str4 != null) {
                e18 += b36.f.j(6, str4);
            }
            return e18 + b36.f.e(7, this.f457822m);
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
        r45.hm0 hm0Var = (r45.hm0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hm0Var.f457816d = aVar2.g(intValue);
                return 0;
            case 2:
                hm0Var.f457817e = aVar2.g(intValue);
                return 0;
            case 3:
                hm0Var.f457818f = aVar2.g(intValue);
                return 0;
            case 4:
                hm0Var.f457819g = aVar2.k(intValue);
                return 0;
            case 5:
                hm0Var.f457820h = aVar2.g(intValue);
                return 0;
            case 6:
                hm0Var.f457821i = aVar2.k(intValue);
                return 0;
            case 7:
                hm0Var.f457822m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
