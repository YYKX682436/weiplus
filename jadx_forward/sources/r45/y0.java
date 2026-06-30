package r45;

/* loaded from: classes15.dex */
public class y0 extends r45.js5 {
    public java.lang.String A;
    public java.lang.String B;
    public int C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f472176J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String P;
    public int Q;
    public java.lang.String R;
    public java.lang.String S;
    public java.lang.String T;
    public java.lang.String U;
    public java.lang.String V;
    public java.lang.String W;
    public int X;
    public java.lang.String Y;
    public java.lang.String Z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472177d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472178e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472179f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472180g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472181h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f472182i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f472183m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f472184n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f472185o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f472186p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f472187p0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f472188q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f472189r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f472190s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f472191t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f472192u;

    /* renamed from: w, reason: collision with root package name */
    public int f472194w;

    /* renamed from: x, reason: collision with root package name */
    public int f472195x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f472196x0;

    /* renamed from: y, reason: collision with root package name */
    public int f472197y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f472198z;

    /* renamed from: v, reason: collision with root package name */
    public boolean f472193v = false;
    public final java.util.LinkedList M = new java.util.LinkedList();
    public final java.util.LinkedList N = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y0)) {
            return false;
        }
        r45.y0 y0Var = (r45.y0) fVar;
        return n51.f.a(this.f76492x92037252, y0Var.f76492x92037252) && n51.f.a(this.f472177d, y0Var.f472177d) && n51.f.a(this.f472178e, y0Var.f472178e) && n51.f.a(this.f472179f, y0Var.f472179f) && n51.f.a(this.f472180g, y0Var.f472180g) && n51.f.a(this.f472181h, y0Var.f472181h) && n51.f.a(this.f472182i, y0Var.f472182i) && n51.f.a(this.f472183m, y0Var.f472183m) && n51.f.a(this.f472184n, y0Var.f472184n) && n51.f.a(this.f472185o, y0Var.f472185o) && n51.f.a(this.f472186p, y0Var.f472186p) && n51.f.a(this.f472188q, y0Var.f472188q) && n51.f.a(this.f472189r, y0Var.f472189r) && n51.f.a(this.f472190s, y0Var.f472190s) && n51.f.a(this.f472191t, y0Var.f472191t) && n51.f.a(this.f472192u, y0Var.f472192u) && n51.f.a(java.lang.Boolean.valueOf(this.f472193v), java.lang.Boolean.valueOf(y0Var.f472193v)) && n51.f.a(java.lang.Integer.valueOf(this.f472194w), java.lang.Integer.valueOf(y0Var.f472194w)) && n51.f.a(java.lang.Integer.valueOf(this.f472195x), java.lang.Integer.valueOf(y0Var.f472195x)) && n51.f.a(java.lang.Integer.valueOf(this.f472197y), java.lang.Integer.valueOf(y0Var.f472197y)) && n51.f.a(this.f472198z, y0Var.f472198z) && n51.f.a(this.A, y0Var.A) && n51.f.a(this.B, y0Var.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(y0Var.C)) && n51.f.a(this.D, y0Var.D) && n51.f.a(this.E, y0Var.E) && n51.f.a(this.F, y0Var.F) && n51.f.a(this.G, y0Var.G) && n51.f.a(this.H, y0Var.H) && n51.f.a(this.I, y0Var.I) && n51.f.a(this.f472176J, y0Var.f472176J) && n51.f.a(this.K, y0Var.K) && n51.f.a(this.L, y0Var.L) && n51.f.a(this.M, y0Var.M) && n51.f.a(this.N, y0Var.N) && n51.f.a(this.P, y0Var.P) && n51.f.a(java.lang.Integer.valueOf(this.Q), java.lang.Integer.valueOf(y0Var.Q)) && n51.f.a(this.R, y0Var.R) && n51.f.a(this.S, y0Var.S) && n51.f.a(this.T, y0Var.T) && n51.f.a(this.U, y0Var.U) && n51.f.a(this.V, y0Var.V) && n51.f.a(this.W, y0Var.W) && n51.f.a(java.lang.Integer.valueOf(this.X), java.lang.Integer.valueOf(y0Var.X)) && n51.f.a(this.Y, y0Var.Y) && n51.f.a(this.Z, y0Var.Z) && n51.f.a(this.f472187p0, y0Var.f472187p0) && n51.f.a(this.f472196x0, y0Var.f472196x0);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.N;
        java.util.LinkedList linkedList2 = this.M;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f472177d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f472178e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f472179f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f472180g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f472181h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f472182i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f472183m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f472184n;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f472185o;
            if (str9 != null) {
                fVar.j(10, str9);
            }
            java.lang.String str10 = this.f472186p;
            if (str10 != null) {
                fVar.j(11, str10);
            }
            java.lang.String str11 = this.f472188q;
            if (str11 != null) {
                fVar.j(12, str11);
            }
            java.lang.String str12 = this.f472189r;
            if (str12 != null) {
                fVar.j(13, str12);
            }
            java.lang.String str13 = this.f472190s;
            if (str13 != null) {
                fVar.j(14, str13);
            }
            java.lang.String str14 = this.f472191t;
            if (str14 != null) {
                fVar.j(15, str14);
            }
            java.lang.String str15 = this.f472192u;
            if (str15 != null) {
                fVar.j(16, str15);
            }
            fVar.a(17, this.f472193v);
            fVar.e(18, this.f472194w);
            fVar.e(19, this.f472195x);
            fVar.e(20, this.f472197y);
            java.lang.String str16 = this.f472198z;
            if (str16 != null) {
                fVar.j(21, str16);
            }
            java.lang.String str17 = this.A;
            if (str17 != null) {
                fVar.j(22, str17);
            }
            java.lang.String str18 = this.B;
            if (str18 != null) {
                fVar.j(23, str18);
            }
            fVar.e(24, this.C);
            java.lang.String str19 = this.D;
            if (str19 != null) {
                fVar.j(25, str19);
            }
            java.lang.String str20 = this.E;
            if (str20 != null) {
                fVar.j(26, str20);
            }
            java.lang.String str21 = this.F;
            if (str21 != null) {
                fVar.j(27, str21);
            }
            java.lang.String str22 = this.G;
            if (str22 != null) {
                fVar.j(28, str22);
            }
            java.lang.String str23 = this.H;
            if (str23 != null) {
                fVar.j(29, str23);
            }
            java.lang.String str24 = this.I;
            if (str24 != null) {
                fVar.j(30, str24);
            }
            java.lang.String str25 = this.f472176J;
            if (str25 != null) {
                fVar.j(31, str25);
            }
            java.lang.String str26 = this.K;
            if (str26 != null) {
                fVar.j(32, str26);
            }
            java.lang.String str27 = this.L;
            if (str27 != null) {
                fVar.j(33, str27);
            }
            fVar.g(34, 8, linkedList2);
            fVar.g(35, 8, linkedList);
            java.lang.String str28 = this.P;
            if (str28 != null) {
                fVar.j(36, str28);
            }
            fVar.e(37, this.Q);
            java.lang.String str29 = this.R;
            if (str29 != null) {
                fVar.j(38, str29);
            }
            java.lang.String str30 = this.S;
            if (str30 != null) {
                fVar.j(39, str30);
            }
            java.lang.String str31 = this.T;
            if (str31 != null) {
                fVar.j(40, str31);
            }
            java.lang.String str32 = this.U;
            if (str32 != null) {
                fVar.j(41, str32);
            }
            java.lang.String str33 = this.V;
            if (str33 != null) {
                fVar.j(42, str33);
            }
            java.lang.String str34 = this.W;
            if (str34 != null) {
                fVar.j(43, str34);
            }
            fVar.e(44, this.X);
            java.lang.String str35 = this.Y;
            if (str35 != null) {
                fVar.j(45, str35);
            }
            java.lang.String str36 = this.Z;
            if (str36 != null) {
                fVar.j(46, str36);
            }
            java.lang.String str37 = this.f472187p0;
            if (str37 != null) {
                fVar.j(47, str37);
            }
            java.lang.String str38 = this.f472196x0;
            if (str38 != null) {
                fVar.j(48, str38);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0;
            java.lang.String str39 = this.f472177d;
            if (str39 != null) {
                i18 += b36.f.j(2, str39);
            }
            java.lang.String str40 = this.f472178e;
            if (str40 != null) {
                i18 += b36.f.j(3, str40);
            }
            java.lang.String str41 = this.f472179f;
            if (str41 != null) {
                i18 += b36.f.j(4, str41);
            }
            java.lang.String str42 = this.f472180g;
            if (str42 != null) {
                i18 += b36.f.j(5, str42);
            }
            java.lang.String str43 = this.f472181h;
            if (str43 != null) {
                i18 += b36.f.j(6, str43);
            }
            java.lang.String str44 = this.f472182i;
            if (str44 != null) {
                i18 += b36.f.j(7, str44);
            }
            java.lang.String str45 = this.f472183m;
            if (str45 != null) {
                i18 += b36.f.j(8, str45);
            }
            java.lang.String str46 = this.f472184n;
            if (str46 != null) {
                i18 += b36.f.j(9, str46);
            }
            java.lang.String str47 = this.f472185o;
            if (str47 != null) {
                i18 += b36.f.j(10, str47);
            }
            java.lang.String str48 = this.f472186p;
            if (str48 != null) {
                i18 += b36.f.j(11, str48);
            }
            java.lang.String str49 = this.f472188q;
            if (str49 != null) {
                i18 += b36.f.j(12, str49);
            }
            java.lang.String str50 = this.f472189r;
            if (str50 != null) {
                i18 += b36.f.j(13, str50);
            }
            java.lang.String str51 = this.f472190s;
            if (str51 != null) {
                i18 += b36.f.j(14, str51);
            }
            java.lang.String str52 = this.f472191t;
            if (str52 != null) {
                i18 += b36.f.j(15, str52);
            }
            java.lang.String str53 = this.f472192u;
            if (str53 != null) {
                i18 += b36.f.j(16, str53);
            }
            int a17 = i18 + b36.f.a(17, this.f472193v) + b36.f.e(18, this.f472194w) + b36.f.e(19, this.f472195x) + b36.f.e(20, this.f472197y);
            java.lang.String str54 = this.f472198z;
            if (str54 != null) {
                a17 += b36.f.j(21, str54);
            }
            java.lang.String str55 = this.A;
            if (str55 != null) {
                a17 += b36.f.j(22, str55);
            }
            java.lang.String str56 = this.B;
            if (str56 != null) {
                a17 += b36.f.j(23, str56);
            }
            int e17 = a17 + b36.f.e(24, this.C);
            java.lang.String str57 = this.D;
            if (str57 != null) {
                e17 += b36.f.j(25, str57);
            }
            java.lang.String str58 = this.E;
            if (str58 != null) {
                e17 += b36.f.j(26, str58);
            }
            java.lang.String str59 = this.F;
            if (str59 != null) {
                e17 += b36.f.j(27, str59);
            }
            java.lang.String str60 = this.G;
            if (str60 != null) {
                e17 += b36.f.j(28, str60);
            }
            java.lang.String str61 = this.H;
            if (str61 != null) {
                e17 += b36.f.j(29, str61);
            }
            java.lang.String str62 = this.I;
            if (str62 != null) {
                e17 += b36.f.j(30, str62);
            }
            java.lang.String str63 = this.f472176J;
            if (str63 != null) {
                e17 += b36.f.j(31, str63);
            }
            java.lang.String str64 = this.K;
            if (str64 != null) {
                e17 += b36.f.j(32, str64);
            }
            java.lang.String str65 = this.L;
            if (str65 != null) {
                e17 += b36.f.j(33, str65);
            }
            int g17 = e17 + b36.f.g(34, 8, linkedList2) + b36.f.g(35, 8, linkedList);
            java.lang.String str66 = this.P;
            if (str66 != null) {
                g17 += b36.f.j(36, str66);
            }
            int e18 = g17 + b36.f.e(37, this.Q);
            java.lang.String str67 = this.R;
            if (str67 != null) {
                e18 += b36.f.j(38, str67);
            }
            java.lang.String str68 = this.S;
            if (str68 != null) {
                e18 += b36.f.j(39, str68);
            }
            java.lang.String str69 = this.T;
            if (str69 != null) {
                e18 += b36.f.j(40, str69);
            }
            java.lang.String str70 = this.U;
            if (str70 != null) {
                e18 += b36.f.j(41, str70);
            }
            java.lang.String str71 = this.V;
            if (str71 != null) {
                e18 += b36.f.j(42, str71);
            }
            java.lang.String str72 = this.W;
            if (str72 != null) {
                e18 += b36.f.j(43, str72);
            }
            int e19 = e18 + b36.f.e(44, this.X);
            java.lang.String str73 = this.Y;
            if (str73 != null) {
                e19 += b36.f.j(45, str73);
            }
            java.lang.String str74 = this.Z;
            if (str74 != null) {
                e19 += b36.f.j(46, str74);
            }
            java.lang.String str75 = this.f472187p0;
            if (str75 != null) {
                e19 += b36.f.j(47, str75);
            }
            java.lang.String str76 = this.f472196x0;
            return str76 != null ? e19 + b36.f.j(48, str76) : e19;
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
        r45.y0 y0Var = (r45.y0) objArr[1];
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
                    y0Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                y0Var.f472177d = aVar2.k(intValue);
                return 0;
            case 3:
                y0Var.f472178e = aVar2.k(intValue);
                return 0;
            case 4:
                y0Var.f472179f = aVar2.k(intValue);
                return 0;
            case 5:
                y0Var.f472180g = aVar2.k(intValue);
                return 0;
            case 6:
                y0Var.f472181h = aVar2.k(intValue);
                return 0;
            case 7:
                y0Var.f472182i = aVar2.k(intValue);
                return 0;
            case 8:
                y0Var.f472183m = aVar2.k(intValue);
                return 0;
            case 9:
                y0Var.f472184n = aVar2.k(intValue);
                return 0;
            case 10:
                y0Var.f472185o = aVar2.k(intValue);
                return 0;
            case 11:
                y0Var.f472186p = aVar2.k(intValue);
                return 0;
            case 12:
                y0Var.f472188q = aVar2.k(intValue);
                return 0;
            case 13:
                y0Var.f472189r = aVar2.k(intValue);
                return 0;
            case 14:
                y0Var.f472190s = aVar2.k(intValue);
                return 0;
            case 15:
                y0Var.f472191t = aVar2.k(intValue);
                return 0;
            case 16:
                y0Var.f472192u = aVar2.k(intValue);
                return 0;
            case 17:
                y0Var.f472193v = aVar2.c(intValue);
                return 0;
            case 18:
                y0Var.f472194w = aVar2.g(intValue);
                return 0;
            case 19:
                y0Var.f472195x = aVar2.g(intValue);
                return 0;
            case 20:
                y0Var.f472197y = aVar2.g(intValue);
                return 0;
            case 21:
                y0Var.f472198z = aVar2.k(intValue);
                return 0;
            case 22:
                y0Var.A = aVar2.k(intValue);
                return 0;
            case 23:
                y0Var.B = aVar2.k(intValue);
                return 0;
            case 24:
                y0Var.C = aVar2.g(intValue);
                return 0;
            case 25:
                y0Var.D = aVar2.k(intValue);
                return 0;
            case 26:
                y0Var.E = aVar2.k(intValue);
                return 0;
            case 27:
                y0Var.F = aVar2.k(intValue);
                return 0;
            case 28:
                y0Var.G = aVar2.k(intValue);
                return 0;
            case 29:
                y0Var.H = aVar2.k(intValue);
                return 0;
            case 30:
                y0Var.I = aVar2.k(intValue);
                return 0;
            case 31:
                y0Var.f472176J = aVar2.k(intValue);
                return 0;
            case 32:
                y0Var.K = aVar2.k(intValue);
                return 0;
            case 33:
                y0Var.L = aVar2.k(intValue);
                return 0;
            case 34:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.z0 z0Var = new r45.z0();
                    if (bArr3 != null && bArr3.length > 0) {
                        z0Var.mo11468x92b714fd(bArr3);
                    }
                    y0Var.M.add(z0Var);
                }
                return 0;
            case 35:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.a1 a1Var = new r45.a1();
                    if (bArr4 != null && bArr4.length > 0) {
                        a1Var.mo11468x92b714fd(bArr4);
                    }
                    y0Var.N.add(a1Var);
                }
                return 0;
            case 36:
                y0Var.P = aVar2.k(intValue);
                return 0;
            case 37:
                y0Var.Q = aVar2.g(intValue);
                return 0;
            case 38:
                y0Var.R = aVar2.k(intValue);
                return 0;
            case 39:
                y0Var.S = aVar2.k(intValue);
                return 0;
            case 40:
                y0Var.T = aVar2.k(intValue);
                return 0;
            case 41:
                y0Var.U = aVar2.k(intValue);
                return 0;
            case 42:
                y0Var.V = aVar2.k(intValue);
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                y0Var.W = aVar2.k(intValue);
                return 0;
            case 44:
                y0Var.X = aVar2.g(intValue);
                return 0;
            case 45:
                y0Var.Y = aVar2.k(intValue);
                return 0;
            case 46:
                y0Var.Z = aVar2.k(intValue);
                return 0;
            case 47:
                y0Var.f472187p0 = aVar2.k(intValue);
                return 0;
            case 48:
                y0Var.f472196x0 = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
