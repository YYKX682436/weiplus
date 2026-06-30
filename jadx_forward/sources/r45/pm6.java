package r45;

/* loaded from: classes8.dex */
public class pm6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f464719d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464720e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464721f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f464722g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464723h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464724i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464725m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f464726n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f464727o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f464728p;

    /* renamed from: q, reason: collision with root package name */
    public int f464729q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f464730r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f464731s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f464732t;

    /* renamed from: u, reason: collision with root package name */
    public int f464733u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f464734v;

    /* renamed from: w, reason: collision with root package name */
    public int f464735w;

    /* renamed from: x, reason: collision with root package name */
    public r45.om6 f464736x;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pm6)) {
            return false;
        }
        r45.pm6 pm6Var = (r45.pm6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f464719d), java.lang.Integer.valueOf(pm6Var.f464719d)) && n51.f.a(this.f464720e, pm6Var.f464720e) && n51.f.a(this.f464721f, pm6Var.f464721f) && n51.f.a(this.f464722g, pm6Var.f464722g) && n51.f.a(this.f464723h, pm6Var.f464723h) && n51.f.a(this.f464724i, pm6Var.f464724i) && n51.f.a(this.f464725m, pm6Var.f464725m) && n51.f.a(this.f464726n, pm6Var.f464726n) && n51.f.a(java.lang.Boolean.valueOf(this.f464727o), java.lang.Boolean.valueOf(pm6Var.f464727o)) && n51.f.a(this.f464728p, pm6Var.f464728p) && n51.f.a(java.lang.Integer.valueOf(this.f464729q), java.lang.Integer.valueOf(pm6Var.f464729q)) && n51.f.a(this.f464730r, pm6Var.f464730r) && n51.f.a(this.f464731s, pm6Var.f464731s) && n51.f.a(this.f464732t, pm6Var.f464732t) && n51.f.a(java.lang.Integer.valueOf(this.f464733u), java.lang.Integer.valueOf(pm6Var.f464733u)) && n51.f.a(this.f464734v, pm6Var.f464734v) && n51.f.a(java.lang.Integer.valueOf(this.f464735w), java.lang.Integer.valueOf(pm6Var.f464735w)) && n51.f.a(this.f464736x, pm6Var.f464736x);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f464719d);
            java.lang.String str = this.f464720e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f464721f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 1, this.f464722g);
            java.lang.String str3 = this.f464723h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f464724i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f464725m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f464726n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.a(9, this.f464727o);
            java.lang.String str7 = this.f464728p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            fVar.e(11, this.f464729q);
            java.lang.String str8 = this.f464730r;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f464731s;
            if (str9 != null) {
                fVar.j(13, str9);
            }
            java.lang.String str10 = this.f464732t;
            if (str10 != null) {
                fVar.j(14, str10);
            }
            fVar.e(15, this.f464733u);
            java.lang.String str11 = this.f464734v;
            if (str11 != null) {
                fVar.j(16, str11);
            }
            fVar.e(17, this.f464735w);
            r45.om6 om6Var = this.f464736x;
            if (om6Var != null) {
                fVar.i(18, om6Var.mo75928xcd1e8d8());
                this.f464736x.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f464719d) + 0;
            java.lang.String str12 = this.f464720e;
            if (str12 != null) {
                e17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f464721f;
            if (str13 != null) {
                e17 += b36.f.j(3, str13);
            }
            int g17 = e17 + b36.f.g(4, 1, this.f464722g);
            java.lang.String str14 = this.f464723h;
            if (str14 != null) {
                g17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f464724i;
            if (str15 != null) {
                g17 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f464725m;
            if (str16 != null) {
                g17 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f464726n;
            if (str17 != null) {
                g17 += b36.f.j(8, str17);
            }
            int a17 = g17 + b36.f.a(9, this.f464727o);
            java.lang.String str18 = this.f464728p;
            if (str18 != null) {
                a17 += b36.f.j(10, str18);
            }
            int e18 = a17 + b36.f.e(11, this.f464729q);
            java.lang.String str19 = this.f464730r;
            if (str19 != null) {
                e18 += b36.f.j(12, str19);
            }
            java.lang.String str20 = this.f464731s;
            if (str20 != null) {
                e18 += b36.f.j(13, str20);
            }
            java.lang.String str21 = this.f464732t;
            if (str21 != null) {
                e18 += b36.f.j(14, str21);
            }
            int e19 = e18 + b36.f.e(15, this.f464733u);
            java.lang.String str22 = this.f464734v;
            if (str22 != null) {
                e19 += b36.f.j(16, str22);
            }
            int e27 = e19 + b36.f.e(17, this.f464735w);
            r45.om6 om6Var2 = this.f464736x;
            return om6Var2 != null ? e27 + b36.f.i(18, om6Var2.mo75928xcd1e8d8()) : e27;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f464722g.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.pm6 pm6Var = (r45.pm6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pm6Var.f464719d = aVar2.g(intValue);
                return 0;
            case 2:
                pm6Var.f464720e = aVar2.k(intValue);
                return 0;
            case 3:
                pm6Var.f464721f = aVar2.k(intValue);
                return 0;
            case 4:
                pm6Var.f464722g.add(aVar2.k(intValue));
                return 0;
            case 5:
                pm6Var.f464723h = aVar2.k(intValue);
                return 0;
            case 6:
                pm6Var.f464724i = aVar2.k(intValue);
                return 0;
            case 7:
                pm6Var.f464725m = aVar2.k(intValue);
                return 0;
            case 8:
                pm6Var.f464726n = aVar2.k(intValue);
                return 0;
            case 9:
                pm6Var.f464727o = aVar2.c(intValue);
                return 0;
            case 10:
                pm6Var.f464728p = aVar2.k(intValue);
                return 0;
            case 11:
                pm6Var.f464729q = aVar2.g(intValue);
                return 0;
            case 12:
                pm6Var.f464730r = aVar2.k(intValue);
                return 0;
            case 13:
                pm6Var.f464731s = aVar2.k(intValue);
                return 0;
            case 14:
                pm6Var.f464732t = aVar2.k(intValue);
                return 0;
            case 15:
                pm6Var.f464733u = aVar2.g(intValue);
                return 0;
            case 16:
                pm6Var.f464734v = aVar2.k(intValue);
                return 0;
            case 17:
                pm6Var.f464735w = aVar2.g(intValue);
                return 0;
            case 18:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.om6 om6Var3 = new r45.om6();
                    if (bArr2 != null && bArr2.length > 0) {
                        om6Var3.mo11468x92b714fd(bArr2);
                    }
                    pm6Var.f464736x = om6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
