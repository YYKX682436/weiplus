package ww1;

/* loaded from: classes15.dex */
public class g2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f531728d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f531729e;

    /* renamed from: f, reason: collision with root package name */
    public double f531730f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f531731g;

    /* renamed from: h, reason: collision with root package name */
    public int f531732h;

    /* renamed from: i, reason: collision with root package name */
    public int f531733i;

    /* renamed from: m, reason: collision with root package name */
    public int f531734m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f531735n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f531736o;

    /* renamed from: p, reason: collision with root package name */
    public int f531737p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f531738q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f531739r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ww1.g2)) {
            return false;
        }
        ww1.g2 g2Var = (ww1.g2) fVar;
        return n51.f.a(this.f531728d, g2Var.f531728d) && n51.f.a(this.f531729e, g2Var.f531729e) && n51.f.a(java.lang.Double.valueOf(this.f531730f), java.lang.Double.valueOf(g2Var.f531730f)) && n51.f.a(this.f531731g, g2Var.f531731g) && n51.f.a(java.lang.Integer.valueOf(this.f531732h), java.lang.Integer.valueOf(g2Var.f531732h)) && n51.f.a(java.lang.Integer.valueOf(this.f531733i), java.lang.Integer.valueOf(g2Var.f531733i)) && n51.f.a(java.lang.Integer.valueOf(this.f531734m), java.lang.Integer.valueOf(g2Var.f531734m)) && n51.f.a(this.f531735n, g2Var.f531735n) && n51.f.a(this.f531736o, g2Var.f531736o) && n51.f.a(java.lang.Integer.valueOf(this.f531737p), java.lang.Integer.valueOf(g2Var.f531737p)) && n51.f.a(this.f531738q, g2Var.f531738q) && n51.f.a(this.f531739r, g2Var.f531739r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f531728d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f531729e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.c(3, this.f531730f);
            java.lang.String str3 = this.f531731g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f531732h);
            fVar.e(6, this.f531733i);
            fVar.e(7, this.f531734m);
            java.lang.String str4 = this.f531735n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f531736o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f531737p);
            java.lang.String str6 = this.f531738q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f531739r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f531728d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f531729e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int c17 = j17 + b36.f.c(3, this.f531730f);
            java.lang.String str10 = this.f531731g;
            if (str10 != null) {
                c17 += b36.f.j(4, str10);
            }
            int e17 = c17 + b36.f.e(5, this.f531732h) + b36.f.e(6, this.f531733i) + b36.f.e(7, this.f531734m);
            java.lang.String str11 = this.f531735n;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f531736o;
            if (str12 != null) {
                e17 += b36.f.j(9, str12);
            }
            int e18 = e17 + b36.f.e(10, this.f531737p);
            java.lang.String str13 = this.f531738q;
            if (str13 != null) {
                e18 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f531739r;
            return str14 != null ? e18 + b36.f.j(12, str14) : e18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        ww1.g2 g2Var = (ww1.g2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g2Var.f531728d = aVar2.k(intValue);
                return 0;
            case 2:
                g2Var.f531729e = aVar2.k(intValue);
                return 0;
            case 3:
                g2Var.f531730f = aVar2.e(intValue);
                return 0;
            case 4:
                g2Var.f531731g = aVar2.k(intValue);
                return 0;
            case 5:
                g2Var.f531732h = aVar2.g(intValue);
                return 0;
            case 6:
                g2Var.f531733i = aVar2.g(intValue);
                return 0;
            case 7:
                g2Var.f531734m = aVar2.g(intValue);
                return 0;
            case 8:
                g2Var.f531735n = aVar2.k(intValue);
                return 0;
            case 9:
                g2Var.f531736o = aVar2.k(intValue);
                return 0;
            case 10:
                g2Var.f531737p = aVar2.g(intValue);
                return 0;
            case 11:
                g2Var.f531738q = aVar2.k(intValue);
                return 0;
            case 12:
                g2Var.f531739r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
