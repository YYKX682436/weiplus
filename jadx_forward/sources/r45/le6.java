package r45;

/* loaded from: classes4.dex */
public class le6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f460916d;

    /* renamed from: e, reason: collision with root package name */
    public int f460917e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460918f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460919g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460920h;

    /* renamed from: i, reason: collision with root package name */
    public int f460921i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f460922m;

    /* renamed from: n, reason: collision with root package name */
    public int f460923n;

    /* renamed from: o, reason: collision with root package name */
    public int f460924o;

    /* renamed from: p, reason: collision with root package name */
    public int f460925p;

    /* renamed from: q, reason: collision with root package name */
    public int f460926q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f460927r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f460928s;

    /* renamed from: t, reason: collision with root package name */
    public int f460929t;

    /* renamed from: u, reason: collision with root package name */
    public int f460930u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.le6)) {
            return false;
        }
        r45.le6 le6Var = (r45.le6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f460916d), java.lang.Long.valueOf(le6Var.f460916d)) && n51.f.a(java.lang.Integer.valueOf(this.f460917e), java.lang.Integer.valueOf(le6Var.f460917e)) && n51.f.a(this.f460918f, le6Var.f460918f) && n51.f.a(this.f460919g, le6Var.f460919g) && n51.f.a(this.f460920h, le6Var.f460920h) && n51.f.a(java.lang.Integer.valueOf(this.f460921i), java.lang.Integer.valueOf(le6Var.f460921i)) && n51.f.a(this.f460922m, le6Var.f460922m) && n51.f.a(java.lang.Integer.valueOf(this.f460923n), java.lang.Integer.valueOf(le6Var.f460923n)) && n51.f.a(java.lang.Integer.valueOf(this.f460924o), java.lang.Integer.valueOf(le6Var.f460924o)) && n51.f.a(java.lang.Integer.valueOf(this.f460925p), java.lang.Integer.valueOf(le6Var.f460925p)) && n51.f.a(java.lang.Integer.valueOf(this.f460926q), java.lang.Integer.valueOf(le6Var.f460926q)) && n51.f.a(this.f460927r, le6Var.f460927r) && n51.f.a(this.f460928s, le6Var.f460928s) && n51.f.a(java.lang.Integer.valueOf(this.f460929t), java.lang.Integer.valueOf(le6Var.f460929t)) && n51.f.a(java.lang.Integer.valueOf(this.f460930u), java.lang.Integer.valueOf(le6Var.f460930u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f460916d);
            fVar.e(2, this.f460917e);
            java.lang.String str = this.f460918f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f460919g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f460920h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f460921i);
            java.lang.String str4 = this.f460922m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f460923n);
            fVar.e(9, this.f460924o);
            fVar.e(10, this.f460925p);
            fVar.e(11, this.f460926q);
            java.lang.String str5 = this.f460927r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            java.lang.String str6 = this.f460928s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            fVar.e(14, this.f460929t);
            fVar.e(15, this.f460930u);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f460916d) + 0 + b36.f.e(2, this.f460917e);
            java.lang.String str7 = this.f460918f;
            if (str7 != null) {
                h17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f460919g;
            if (str8 != null) {
                h17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f460920h;
            if (str9 != null) {
                h17 += b36.f.j(5, str9);
            }
            int e17 = h17 + b36.f.e(6, this.f460921i);
            java.lang.String str10 = this.f460922m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            int e18 = e17 + b36.f.e(8, this.f460923n) + b36.f.e(9, this.f460924o) + b36.f.e(10, this.f460925p) + b36.f.e(11, this.f460926q);
            java.lang.String str11 = this.f460927r;
            if (str11 != null) {
                e18 += b36.f.j(12, str11);
            }
            java.lang.String str12 = this.f460928s;
            if (str12 != null) {
                e18 += b36.f.j(13, str12);
            }
            return e18 + b36.f.e(14, this.f460929t) + b36.f.e(15, this.f460930u);
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
        r45.le6 le6Var = (r45.le6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                le6Var.f460916d = aVar2.i(intValue);
                return 0;
            case 2:
                le6Var.f460917e = aVar2.g(intValue);
                return 0;
            case 3:
                le6Var.f460918f = aVar2.k(intValue);
                return 0;
            case 4:
                le6Var.f460919g = aVar2.k(intValue);
                return 0;
            case 5:
                le6Var.f460920h = aVar2.k(intValue);
                return 0;
            case 6:
                le6Var.f460921i = aVar2.g(intValue);
                return 0;
            case 7:
                le6Var.f460922m = aVar2.k(intValue);
                return 0;
            case 8:
                le6Var.f460923n = aVar2.g(intValue);
                return 0;
            case 9:
                le6Var.f460924o = aVar2.g(intValue);
                return 0;
            case 10:
                le6Var.f460925p = aVar2.g(intValue);
                return 0;
            case 11:
                le6Var.f460926q = aVar2.g(intValue);
                return 0;
            case 12:
                le6Var.f460927r = aVar2.k(intValue);
                return 0;
            case 13:
                le6Var.f460928s = aVar2.k(intValue);
                return 0;
            case 14:
                le6Var.f460929t = aVar2.g(intValue);
                return 0;
            case 15:
                le6Var.f460930u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
