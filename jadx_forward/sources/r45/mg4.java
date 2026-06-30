package r45;

/* loaded from: classes2.dex */
public class mg4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;
    public final java.util.LinkedList B = new java.util.LinkedList();
    public long C;
    public long D;
    public long E;
    public r45.rg4 F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f462008J;
    public long K;
    public boolean L;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462009d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462010e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462011f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462012g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462013h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462014i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462015m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f462016n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f462017o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f462018p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f462019q;

    /* renamed from: r, reason: collision with root package name */
    public long f462020r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f462021s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f462022t;

    /* renamed from: u, reason: collision with root package name */
    public int f462023u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f462024v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f462025w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f462026x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f462027y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f462028z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mg4)) {
            return false;
        }
        r45.mg4 mg4Var = (r45.mg4) fVar;
        return n51.f.a(this.f462009d, mg4Var.f462009d) && n51.f.a(this.f462010e, mg4Var.f462010e) && n51.f.a(this.f462011f, mg4Var.f462011f) && n51.f.a(this.f462012g, mg4Var.f462012g) && n51.f.a(this.f462013h, mg4Var.f462013h) && n51.f.a(this.f462014i, mg4Var.f462014i) && n51.f.a(this.f462015m, mg4Var.f462015m) && n51.f.a(this.f462016n, mg4Var.f462016n) && n51.f.a(this.f462017o, mg4Var.f462017o) && n51.f.a(this.f462018p, mg4Var.f462018p) && n51.f.a(this.f462019q, mg4Var.f462019q) && n51.f.a(java.lang.Long.valueOf(this.f462020r), java.lang.Long.valueOf(mg4Var.f462020r)) && n51.f.a(this.f462021s, mg4Var.f462021s) && n51.f.a(this.f462022t, mg4Var.f462022t) && n51.f.a(java.lang.Integer.valueOf(this.f462023u), java.lang.Integer.valueOf(mg4Var.f462023u)) && n51.f.a(this.f462024v, mg4Var.f462024v) && n51.f.a(this.f462025w, mg4Var.f462025w) && n51.f.a(java.lang.Boolean.valueOf(this.f462026x), java.lang.Boolean.valueOf(mg4Var.f462026x)) && n51.f.a(java.lang.Boolean.valueOf(this.f462027y), java.lang.Boolean.valueOf(mg4Var.f462027y)) && n51.f.a(this.f462028z, mg4Var.f462028z) && n51.f.a(this.A, mg4Var.A) && n51.f.a(this.B, mg4Var.B) && n51.f.a(java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(mg4Var.C)) && n51.f.a(java.lang.Long.valueOf(this.D), java.lang.Long.valueOf(mg4Var.D)) && n51.f.a(java.lang.Long.valueOf(this.E), java.lang.Long.valueOf(mg4Var.E)) && n51.f.a(this.F, mg4Var.F) && n51.f.a(this.G, mg4Var.G) && n51.f.a(this.H, mg4Var.H) && n51.f.a(this.I, mg4Var.I) && n51.f.a(this.f462008J, mg4Var.f462008J) && n51.f.a(java.lang.Long.valueOf(this.K), java.lang.Long.valueOf(mg4Var.K)) && n51.f.a(java.lang.Boolean.valueOf(this.L), java.lang.Boolean.valueOf(mg4Var.L));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.B;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462009d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f462010e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f462011f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f462012g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f462013h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f462014i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f462015m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f462016n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f462017o;
            if (str9 != null) {
                fVar.j(9, str9);
            }
            java.lang.String str10 = this.f462018p;
            if (str10 != null) {
                fVar.j(10, str10);
            }
            java.lang.String str11 = this.f462019q;
            if (str11 != null) {
                fVar.j(11, str11);
            }
            fVar.h(12, this.f462020r);
            java.lang.String str12 = this.f462021s;
            if (str12 != null) {
                fVar.j(13, str12);
            }
            java.lang.String str13 = this.f462022t;
            if (str13 != null) {
                fVar.j(14, str13);
            }
            fVar.e(15, this.f462023u);
            java.lang.String str14 = this.f462024v;
            if (str14 != null) {
                fVar.j(16, str14);
            }
            java.lang.String str15 = this.f462025w;
            if (str15 != null) {
                fVar.j(17, str15);
            }
            fVar.a(18, this.f462026x);
            fVar.a(19, this.f462027y);
            java.lang.String str16 = this.f462028z;
            if (str16 != null) {
                fVar.j(20, str16);
            }
            java.lang.String str17 = this.A;
            if (str17 != null) {
                fVar.j(21, str17);
            }
            fVar.g(22, 8, linkedList);
            fVar.h(23, this.C);
            fVar.h(26, this.D);
            fVar.h(29, this.E);
            r45.rg4 rg4Var = this.F;
            if (rg4Var != null) {
                fVar.i(30, rg4Var.mo75928xcd1e8d8());
                this.F.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str18 = this.G;
            if (str18 != null) {
                fVar.j(31, str18);
            }
            java.lang.String str19 = this.H;
            if (str19 != null) {
                fVar.j(32, str19);
            }
            java.lang.String str20 = this.I;
            if (str20 != null) {
                fVar.j(40, str20);
            }
            java.lang.String str21 = this.f462008J;
            if (str21 != null) {
                fVar.j(42, str21);
            }
            fVar.h(45, this.K);
            fVar.a(52, this.L);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str22 = this.f462009d;
            int j17 = str22 != null ? b36.f.j(1, str22) + 0 : 0;
            java.lang.String str23 = this.f462010e;
            if (str23 != null) {
                j17 += b36.f.j(2, str23);
            }
            java.lang.String str24 = this.f462011f;
            if (str24 != null) {
                j17 += b36.f.j(3, str24);
            }
            java.lang.String str25 = this.f462012g;
            if (str25 != null) {
                j17 += b36.f.j(4, str25);
            }
            java.lang.String str26 = this.f462013h;
            if (str26 != null) {
                j17 += b36.f.j(5, str26);
            }
            java.lang.String str27 = this.f462014i;
            if (str27 != null) {
                j17 += b36.f.j(6, str27);
            }
            java.lang.String str28 = this.f462015m;
            if (str28 != null) {
                j17 += b36.f.j(7, str28);
            }
            java.lang.String str29 = this.f462016n;
            if (str29 != null) {
                j17 += b36.f.j(8, str29);
            }
            java.lang.String str30 = this.f462017o;
            if (str30 != null) {
                j17 += b36.f.j(9, str30);
            }
            java.lang.String str31 = this.f462018p;
            if (str31 != null) {
                j17 += b36.f.j(10, str31);
            }
            java.lang.String str32 = this.f462019q;
            if (str32 != null) {
                j17 += b36.f.j(11, str32);
            }
            int h17 = j17 + b36.f.h(12, this.f462020r);
            java.lang.String str33 = this.f462021s;
            if (str33 != null) {
                h17 += b36.f.j(13, str33);
            }
            java.lang.String str34 = this.f462022t;
            if (str34 != null) {
                h17 += b36.f.j(14, str34);
            }
            int e17 = h17 + b36.f.e(15, this.f462023u);
            java.lang.String str35 = this.f462024v;
            if (str35 != null) {
                e17 += b36.f.j(16, str35);
            }
            java.lang.String str36 = this.f462025w;
            if (str36 != null) {
                e17 += b36.f.j(17, str36);
            }
            int a17 = e17 + b36.f.a(18, this.f462026x) + b36.f.a(19, this.f462027y);
            java.lang.String str37 = this.f462028z;
            if (str37 != null) {
                a17 += b36.f.j(20, str37);
            }
            java.lang.String str38 = this.A;
            if (str38 != null) {
                a17 += b36.f.j(21, str38);
            }
            int g17 = a17 + b36.f.g(22, 8, linkedList) + b36.f.h(23, this.C) + b36.f.h(26, this.D) + b36.f.h(29, this.E);
            r45.rg4 rg4Var2 = this.F;
            if (rg4Var2 != null) {
                g17 += b36.f.i(30, rg4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str39 = this.G;
            if (str39 != null) {
                g17 += b36.f.j(31, str39);
            }
            java.lang.String str40 = this.H;
            if (str40 != null) {
                g17 += b36.f.j(32, str40);
            }
            java.lang.String str41 = this.I;
            if (str41 != null) {
                g17 += b36.f.j(40, str41);
            }
            java.lang.String str42 = this.f462008J;
            if (str42 != null) {
                g17 += b36.f.j(42, str42);
            }
            return g17 + b36.f.h(45, this.K) + b36.f.a(52, this.L);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.mg4 mg4Var = (r45.mg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 26) {
            mg4Var.D = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 40) {
            mg4Var.I = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 42) {
            mg4Var.f462008J = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 45) {
            mg4Var.K = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 52) {
            mg4Var.L = aVar2.c(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                mg4Var.f462009d = aVar2.k(intValue);
                return 0;
            case 2:
                mg4Var.f462010e = aVar2.k(intValue);
                return 0;
            case 3:
                mg4Var.f462011f = aVar2.k(intValue);
                return 0;
            case 4:
                mg4Var.f462012g = aVar2.k(intValue);
                return 0;
            case 5:
                mg4Var.f462013h = aVar2.k(intValue);
                return 0;
            case 6:
                mg4Var.f462014i = aVar2.k(intValue);
                return 0;
            case 7:
                mg4Var.f462015m = aVar2.k(intValue);
                return 0;
            case 8:
                mg4Var.f462016n = aVar2.k(intValue);
                return 0;
            case 9:
                mg4Var.f462017o = aVar2.k(intValue);
                return 0;
            case 10:
                mg4Var.f462018p = aVar2.k(intValue);
                return 0;
            case 11:
                mg4Var.f462019q = aVar2.k(intValue);
                return 0;
            case 12:
                mg4Var.f462020r = aVar2.i(intValue);
                return 0;
            case 13:
                mg4Var.f462021s = aVar2.k(intValue);
                return 0;
            case 14:
                mg4Var.f462022t = aVar2.k(intValue);
                return 0;
            case 15:
                mg4Var.f462023u = aVar2.g(intValue);
                return 0;
            case 16:
                mg4Var.f462024v = aVar2.k(intValue);
                return 0;
            case 17:
                mg4Var.f462025w = aVar2.k(intValue);
                return 0;
            case 18:
                mg4Var.f462026x = aVar2.c(intValue);
                return 0;
            case 19:
                mg4Var.f462027y = aVar2.c(intValue);
                return 0;
            case 20:
                mg4Var.f462028z = aVar2.k(intValue);
                return 0;
            case 21:
                mg4Var.A = aVar2.k(intValue);
                return 0;
            case 22:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.qg4 qg4Var = new r45.qg4();
                    if (bArr2 != null && bArr2.length > 0) {
                        qg4Var.mo11468x92b714fd(bArr2);
                    }
                    mg4Var.B.add(qg4Var);
                }
                return 0;
            case 23:
                mg4Var.C = aVar2.i(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 29:
                        mg4Var.E = aVar2.i(intValue);
                        return 0;
                    case 30:
                        java.util.LinkedList j19 = aVar2.j(intValue);
                        int size2 = j19.size();
                        for (int i19 = 0; i19 < size2; i19++) {
                            byte[] bArr3 = (byte[]) j19.get(i19);
                            r45.rg4 rg4Var3 = new r45.rg4();
                            if (bArr3 != null && bArr3.length > 0) {
                                rg4Var3.mo11468x92b714fd(bArr3);
                            }
                            mg4Var.F = rg4Var3;
                        }
                        return 0;
                    case 31:
                        mg4Var.G = aVar2.k(intValue);
                        return 0;
                    case 32:
                        mg4Var.H = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
