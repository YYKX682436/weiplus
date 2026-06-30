package r45;

/* loaded from: classes9.dex */
public class lm3 extends r45.js5 {
    public r45.q34 A;
    public boolean B;
    public boolean C;
    public boolean D;
    public java.lang.String F;
    public java.lang.String G;
    public boolean H;
    public r45.sc6 I;

    /* renamed from: d, reason: collision with root package name */
    public int f461133d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461134e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461135f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461136g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461137h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461138i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f461139m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f461140n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f461141o;

    /* renamed from: p, reason: collision with root package name */
    public long f461142p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f461143q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f461144r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f461145s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f461146t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f461147u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f461148v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f461149w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f461150x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f461152z;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f461151y = new java.util.LinkedList();
    public final java.util.LinkedList E = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lm3)) {
            return false;
        }
        r45.lm3 lm3Var = (r45.lm3) fVar;
        return n51.f.a(this.f76492x92037252, lm3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f461133d), java.lang.Integer.valueOf(lm3Var.f461133d)) && n51.f.a(this.f461134e, lm3Var.f461134e) && n51.f.a(this.f461135f, lm3Var.f461135f) && n51.f.a(this.f461136g, lm3Var.f461136g) && n51.f.a(this.f461137h, lm3Var.f461137h) && n51.f.a(this.f461138i, lm3Var.f461138i) && n51.f.a(this.f461139m, lm3Var.f461139m) && n51.f.a(java.lang.Boolean.valueOf(this.f461140n), java.lang.Boolean.valueOf(lm3Var.f461140n)) && n51.f.a(this.f461141o, lm3Var.f461141o) && n51.f.a(java.lang.Long.valueOf(this.f461142p), java.lang.Long.valueOf(lm3Var.f461142p)) && n51.f.a(java.lang.Boolean.valueOf(this.f461143q), java.lang.Boolean.valueOf(lm3Var.f461143q)) && n51.f.a(java.lang.Boolean.valueOf(this.f461144r), java.lang.Boolean.valueOf(lm3Var.f461144r)) && n51.f.a(java.lang.Boolean.valueOf(this.f461145s), java.lang.Boolean.valueOf(lm3Var.f461145s)) && n51.f.a(this.f461146t, lm3Var.f461146t) && n51.f.a(this.f461147u, lm3Var.f461147u) && n51.f.a(this.f461148v, lm3Var.f461148v) && n51.f.a(this.f461149w, lm3Var.f461149w) && n51.f.a(java.lang.Boolean.valueOf(this.f461150x), java.lang.Boolean.valueOf(lm3Var.f461150x)) && n51.f.a(this.f461151y, lm3Var.f461151y) && n51.f.a(java.lang.Boolean.valueOf(this.f461152z), java.lang.Boolean.valueOf(lm3Var.f461152z)) && n51.f.a(this.A, lm3Var.A) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(lm3Var.B)) && n51.f.a(java.lang.Boolean.valueOf(this.C), java.lang.Boolean.valueOf(lm3Var.C)) && n51.f.a(java.lang.Boolean.valueOf(this.D), java.lang.Boolean.valueOf(lm3Var.D)) && n51.f.a(this.E, lm3Var.E) && n51.f.a(this.F, lm3Var.F) && n51.f.a(this.G, lm3Var.G) && n51.f.a(java.lang.Boolean.valueOf(this.H), java.lang.Boolean.valueOf(lm3Var.H)) && n51.f.a(this.I, lm3Var.I);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.E;
        java.util.LinkedList linkedList2 = this.f461151y;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f461133d);
            java.lang.String str = this.f461134e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f461135f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f461136g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f461137h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f461138i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f461139m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.a(9, this.f461140n);
            java.lang.String str7 = this.f461141o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            fVar.h(11, this.f461142p);
            fVar.a(12, this.f461143q);
            fVar.a(13, this.f461144r);
            fVar.a(14, this.f461145s);
            java.lang.String str8 = this.f461146t;
            if (str8 != null) {
                fVar.j(15, str8);
            }
            java.lang.String str9 = this.f461147u;
            if (str9 != null) {
                fVar.j(16, str9);
            }
            java.lang.String str10 = this.f461148v;
            if (str10 != null) {
                fVar.j(17, str10);
            }
            java.lang.String str11 = this.f461149w;
            if (str11 != null) {
                fVar.j(18, str11);
            }
            fVar.a(19, this.f461150x);
            fVar.g(20, 1, linkedList2);
            fVar.a(21, this.f461152z);
            r45.q34 q34Var = this.A;
            if (q34Var != null) {
                fVar.i(22, q34Var.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            fVar.a(23, this.B);
            fVar.a(26, this.C);
            fVar.a(27, this.D);
            fVar.g(28, 8, linkedList);
            java.lang.String str12 = this.F;
            if (str12 != null) {
                fVar.j(29, str12);
            }
            java.lang.String str13 = this.G;
            if (str13 != null) {
                fVar.j(30, str13);
            }
            fVar.a(31, this.H);
            r45.sc6 sc6Var = this.I;
            if (sc6Var != null) {
                fVar.i(32, sc6Var.mo75928xcd1e8d8());
                this.I.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f461133d);
            java.lang.String str14 = this.f461134e;
            if (str14 != null) {
                i18 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f461135f;
            if (str15 != null) {
                i18 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f461136g;
            if (str16 != null) {
                i18 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f461137h;
            if (str17 != null) {
                i18 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f461138i;
            if (str18 != null) {
                i18 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f461139m;
            if (str19 != null) {
                i18 += b36.f.j(8, str19);
            }
            int a17 = i18 + b36.f.a(9, this.f461140n);
            java.lang.String str20 = this.f461141o;
            if (str20 != null) {
                a17 += b36.f.j(10, str20);
            }
            int h17 = a17 + b36.f.h(11, this.f461142p) + b36.f.a(12, this.f461143q) + b36.f.a(13, this.f461144r) + b36.f.a(14, this.f461145s);
            java.lang.String str21 = this.f461146t;
            if (str21 != null) {
                h17 += b36.f.j(15, str21);
            }
            java.lang.String str22 = this.f461147u;
            if (str22 != null) {
                h17 += b36.f.j(16, str22);
            }
            java.lang.String str23 = this.f461148v;
            if (str23 != null) {
                h17 += b36.f.j(17, str23);
            }
            java.lang.String str24 = this.f461149w;
            if (str24 != null) {
                h17 += b36.f.j(18, str24);
            }
            int a18 = h17 + b36.f.a(19, this.f461150x) + b36.f.g(20, 1, linkedList2) + b36.f.a(21, this.f461152z);
            r45.q34 q34Var2 = this.A;
            if (q34Var2 != null) {
                a18 += b36.f.i(22, q34Var2.mo75928xcd1e8d8());
            }
            int a19 = a18 + b36.f.a(23, this.B) + b36.f.a(26, this.C) + b36.f.a(27, this.D) + b36.f.g(28, 8, linkedList);
            java.lang.String str25 = this.F;
            if (str25 != null) {
                a19 += b36.f.j(29, str25);
            }
            java.lang.String str26 = this.G;
            if (str26 != null) {
                a19 += b36.f.j(30, str26);
            }
            int a27 = a19 + b36.f.a(31, this.H);
            r45.sc6 sc6Var2 = this.I;
            return sc6Var2 != null ? a27 + b36.f.i(32, sc6Var2.mo75928xcd1e8d8()) : a27;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.lm3 lm3Var = (r45.lm3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    lm3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                lm3Var.f461133d = aVar2.g(intValue);
                return 0;
            case 3:
                lm3Var.f461134e = aVar2.k(intValue);
                return 0;
            case 4:
                lm3Var.f461135f = aVar2.k(intValue);
                return 0;
            case 5:
                lm3Var.f461136g = aVar2.k(intValue);
                return 0;
            case 6:
                lm3Var.f461137h = aVar2.k(intValue);
                return 0;
            case 7:
                lm3Var.f461138i = aVar2.k(intValue);
                return 0;
            case 8:
                lm3Var.f461139m = aVar2.k(intValue);
                return 0;
            case 9:
                lm3Var.f461140n = aVar2.c(intValue);
                return 0;
            case 10:
                lm3Var.f461141o = aVar2.k(intValue);
                return 0;
            case 11:
                lm3Var.f461142p = aVar2.i(intValue);
                return 0;
            case 12:
                lm3Var.f461143q = aVar2.c(intValue);
                return 0;
            case 13:
                lm3Var.f461144r = aVar2.c(intValue);
                return 0;
            case 14:
                lm3Var.f461145s = aVar2.c(intValue);
                return 0;
            case 15:
                lm3Var.f461146t = aVar2.k(intValue);
                return 0;
            case 16:
                lm3Var.f461147u = aVar2.k(intValue);
                return 0;
            case 17:
                lm3Var.f461148v = aVar2.k(intValue);
                return 0;
            case 18:
                lm3Var.f461149w = aVar2.k(intValue);
                return 0;
            case 19:
                lm3Var.f461150x = aVar2.c(intValue);
                return 0;
            case 20:
                lm3Var.f461151y.add(aVar2.k(intValue));
                return 0;
            case 21:
                lm3Var.f461152z = aVar2.c(intValue);
                return 0;
            case 22:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.q34 q34Var3 = new r45.q34();
                    if (bArr3 != null && bArr3.length > 0) {
                        q34Var3.mo11468x92b714fd(bArr3);
                    }
                    lm3Var.A = q34Var3;
                }
                return 0;
            case 23:
                lm3Var.B = aVar2.c(intValue);
                return 0;
            case 24:
            case 25:
            default:
                return -1;
            case 26:
                lm3Var.C = aVar2.c(intValue);
                return 0;
            case 27:
                lm3Var.D = aVar2.c(intValue);
                return 0;
            case 28:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.mj5 mj5Var = new r45.mj5();
                    if (bArr4 != null && bArr4.length > 0) {
                        mj5Var.mo11468x92b714fd(bArr4);
                    }
                    lm3Var.E.add(mj5Var);
                }
                return 0;
            case 29:
                lm3Var.F = aVar2.k(intValue);
                return 0;
            case 30:
                lm3Var.G = aVar2.k(intValue);
                return 0;
            case 31:
                lm3Var.H = aVar2.c(intValue);
                return 0;
            case 32:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.sc6 sc6Var3 = new r45.sc6();
                    if (bArr5 != null && bArr5.length > 0) {
                        sc6Var3.mo11468x92b714fd(bArr5);
                    }
                    lm3Var.I = sc6Var3;
                }
                return 0;
        }
    }
}
