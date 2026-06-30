package r45;

/* loaded from: classes4.dex */
public class hh4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457682d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f457683e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457684f;

    /* renamed from: g, reason: collision with root package name */
    public int f457685g;

    /* renamed from: h, reason: collision with root package name */
    public int f457686h;

    /* renamed from: i, reason: collision with root package name */
    public int f457687i;

    /* renamed from: m, reason: collision with root package name */
    public int f457688m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f457689n;

    /* renamed from: o, reason: collision with root package name */
    public int f457690o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f457691p;

    /* renamed from: q, reason: collision with root package name */
    public int f457692q;

    /* renamed from: r, reason: collision with root package name */
    public int f457693r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hh4)) {
            return false;
        }
        r45.hh4 hh4Var = (r45.hh4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457682d), java.lang.Integer.valueOf(hh4Var.f457682d)) && n51.f.a(java.lang.Integer.valueOf(this.f457683e), java.lang.Integer.valueOf(hh4Var.f457683e)) && n51.f.a(this.f457684f, hh4Var.f457684f) && n51.f.a(java.lang.Integer.valueOf(this.f457685g), java.lang.Integer.valueOf(hh4Var.f457685g)) && n51.f.a(java.lang.Integer.valueOf(this.f457686h), java.lang.Integer.valueOf(hh4Var.f457686h)) && n51.f.a(java.lang.Integer.valueOf(this.f457687i), java.lang.Integer.valueOf(hh4Var.f457687i)) && n51.f.a(java.lang.Integer.valueOf(this.f457688m), java.lang.Integer.valueOf(hh4Var.f457688m)) && n51.f.a(this.f457689n, hh4Var.f457689n) && n51.f.a(java.lang.Integer.valueOf(this.f457690o), java.lang.Integer.valueOf(hh4Var.f457690o)) && n51.f.a(this.f457691p, hh4Var.f457691p) && n51.f.a(java.lang.Integer.valueOf(this.f457692q), java.lang.Integer.valueOf(hh4Var.f457692q)) && n51.f.a(java.lang.Integer.valueOf(this.f457693r), java.lang.Integer.valueOf(hh4Var.f457693r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457682d);
            fVar.e(2, this.f457683e);
            java.lang.String str = this.f457684f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f457685g);
            fVar.e(5, this.f457686h);
            fVar.e(6, this.f457687i);
            fVar.e(7, this.f457688m);
            java.lang.String str2 = this.f457689n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            fVar.e(9, this.f457690o);
            java.lang.String str3 = this.f457691p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            fVar.e(11, this.f457692q);
            fVar.e(12, this.f457693r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f457682d) + 0 + b36.f.e(2, this.f457683e);
            java.lang.String str4 = this.f457684f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            int e18 = e17 + b36.f.e(4, this.f457685g) + b36.f.e(5, this.f457686h) + b36.f.e(6, this.f457687i) + b36.f.e(7, this.f457688m);
            java.lang.String str5 = this.f457689n;
            if (str5 != null) {
                e18 += b36.f.j(8, str5);
            }
            int e19 = e18 + b36.f.e(9, this.f457690o);
            java.lang.String str6 = this.f457691p;
            if (str6 != null) {
                e19 += b36.f.j(10, str6);
            }
            return e19 + b36.f.e(11, this.f457692q) + b36.f.e(12, this.f457693r);
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
        r45.hh4 hh4Var = (r45.hh4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hh4Var.f457682d = aVar2.g(intValue);
                return 0;
            case 2:
                hh4Var.f457683e = aVar2.g(intValue);
                return 0;
            case 3:
                hh4Var.f457684f = aVar2.k(intValue);
                return 0;
            case 4:
                hh4Var.f457685g = aVar2.g(intValue);
                return 0;
            case 5:
                hh4Var.f457686h = aVar2.g(intValue);
                return 0;
            case 6:
                hh4Var.f457687i = aVar2.g(intValue);
                return 0;
            case 7:
                hh4Var.f457688m = aVar2.g(intValue);
                return 0;
            case 8:
                hh4Var.f457689n = aVar2.k(intValue);
                return 0;
            case 9:
                hh4Var.f457690o = aVar2.g(intValue);
                return 0;
            case 10:
                hh4Var.f457691p = aVar2.k(intValue);
                return 0;
            case 11:
                hh4Var.f457692q = aVar2.g(intValue);
                return 0;
            case 12:
                hh4Var.f457693r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
