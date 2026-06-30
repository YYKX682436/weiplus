package r45;

/* loaded from: classes9.dex */
public class qv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;
    public long A1;
    public java.lang.String B;
    public java.lang.String B1;
    public java.lang.String C;
    public java.lang.String C1;
    public java.lang.String D;
    public int D1;
    public java.lang.String E;
    public int E1;
    public java.lang.String F;
    public int F1;
    public int G;
    public r45.x43 G1;
    public java.lang.String H;
    public java.lang.String H1;
    public java.lang.String I;
    public java.lang.String I1;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f465798J;
    public r45.ae5 J1;
    public java.lang.String K;
    public java.lang.String K1;
    public java.lang.String L;
    public java.lang.String L1;
    public java.lang.String M;
    public java.lang.String M1;
    public java.lang.String N;
    public java.lang.String O1;
    public java.lang.String P;
    public java.lang.String P1;
    public java.lang.String Q;
    public int Q1;
    public java.lang.String R;
    public java.lang.String R1;
    public java.lang.String S;
    public java.lang.String T;
    public java.lang.String U;
    public java.lang.String V;
    public java.lang.String W;
    public java.lang.String X;
    public int Y;
    public int Z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465799d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465800e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465801f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465802g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465803h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f465804i;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f465805l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f465806m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f465807n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f465808o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f465809p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f465810p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f465811p1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f465812q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f465813r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f465814s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f465815t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f465816u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f465817v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f465818w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f465819x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f465820x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f465821x1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f465822y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f465823y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f465824y1;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f465825z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f465826z1;
    public final java.util.LinkedList N1 = new java.util.LinkedList();
    public final java.util.LinkedList S1 = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qv)) {
            return false;
        }
        r45.qv qvVar = (r45.qv) fVar;
        return n51.f.a(this.f465799d, qvVar.f465799d) && n51.f.a(this.f465800e, qvVar.f465800e) && n51.f.a(this.f465801f, qvVar.f465801f) && n51.f.a(this.f465802g, qvVar.f465802g) && n51.f.a(this.f465803h, qvVar.f465803h) && n51.f.a(this.f465804i, qvVar.f465804i) && n51.f.a(this.f465806m, qvVar.f465806m) && n51.f.a(this.f465807n, qvVar.f465807n) && n51.f.a(this.f465808o, qvVar.f465808o) && n51.f.a(this.f465809p, qvVar.f465809p) && n51.f.a(this.f465812q, qvVar.f465812q) && n51.f.a(this.f465813r, qvVar.f465813r) && n51.f.a(this.f465814s, qvVar.f465814s) && n51.f.a(this.f465815t, qvVar.f465815t) && n51.f.a(this.f465816u, qvVar.f465816u) && n51.f.a(this.f465817v, qvVar.f465817v) && n51.f.a(this.f465818w, qvVar.f465818w) && n51.f.a(this.f465819x, qvVar.f465819x) && n51.f.a(this.f465822y, qvVar.f465822y) && n51.f.a(this.f465825z, qvVar.f465825z) && n51.f.a(this.A, qvVar.A) && n51.f.a(this.B, qvVar.B) && n51.f.a(this.C, qvVar.C) && n51.f.a(this.D, qvVar.D) && n51.f.a(this.E, qvVar.E) && n51.f.a(this.F, qvVar.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(qvVar.G)) && n51.f.a(this.H, qvVar.H) && n51.f.a(this.I, qvVar.I) && n51.f.a(this.f465798J, qvVar.f465798J) && n51.f.a(this.K, qvVar.K) && n51.f.a(this.L, qvVar.L) && n51.f.a(this.M, qvVar.M) && n51.f.a(this.N, qvVar.N) && n51.f.a(this.P, qvVar.P) && n51.f.a(this.Q, qvVar.Q) && n51.f.a(this.R, qvVar.R) && n51.f.a(this.S, qvVar.S) && n51.f.a(this.T, qvVar.T) && n51.f.a(this.U, qvVar.U) && n51.f.a(this.V, qvVar.V) && n51.f.a(this.W, qvVar.W) && n51.f.a(this.X, qvVar.X) && n51.f.a(java.lang.Integer.valueOf(this.Y), java.lang.Integer.valueOf(qvVar.Y)) && n51.f.a(java.lang.Integer.valueOf(this.Z), java.lang.Integer.valueOf(qvVar.Z)) && n51.f.a(this.f465810p0, qvVar.f465810p0) && n51.f.a(this.f465820x0, qvVar.f465820x0) && n51.f.a(this.f465823y0, qvVar.f465823y0) && n51.f.a(this.f465805l1, qvVar.f465805l1) && n51.f.a(this.f465811p1, qvVar.f465811p1) && n51.f.a(this.f465821x1, qvVar.f465821x1) && n51.f.a(this.f465824y1, qvVar.f465824y1) && n51.f.a(this.f465826z1, qvVar.f465826z1) && n51.f.a(java.lang.Long.valueOf(this.A1), java.lang.Long.valueOf(qvVar.A1)) && n51.f.a(this.B1, qvVar.B1) && n51.f.a(this.C1, qvVar.C1) && n51.f.a(java.lang.Integer.valueOf(this.D1), java.lang.Integer.valueOf(qvVar.D1)) && n51.f.a(java.lang.Integer.valueOf(this.E1), java.lang.Integer.valueOf(qvVar.E1)) && n51.f.a(java.lang.Integer.valueOf(this.F1), java.lang.Integer.valueOf(qvVar.F1)) && n51.f.a(this.G1, qvVar.G1) && n51.f.a(this.H1, qvVar.H1) && n51.f.a(this.I1, qvVar.I1) && n51.f.a(this.J1, qvVar.J1) && n51.f.a(this.K1, qvVar.K1) && n51.f.a(this.L1, qvVar.L1) && n51.f.a(this.M1, qvVar.M1) && n51.f.a(this.N1, qvVar.N1) && n51.f.a(this.O1, qvVar.O1) && n51.f.a(this.P1, qvVar.P1) && n51.f.a(java.lang.Integer.valueOf(this.Q1), java.lang.Integer.valueOf(qvVar.Q1)) && n51.f.a(this.R1, qvVar.R1) && n51.f.a(this.S1, qvVar.S1);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.S1;
        java.util.LinkedList linkedList2 = this.N1;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465799d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f465800e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f465801f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f465802g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f465803h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f465804i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f465806m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f465807n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f465808o;
            if (str9 != null) {
                fVar.j(9, str9);
            }
            java.lang.String str10 = this.f465809p;
            if (str10 != null) {
                fVar.j(10, str10);
            }
            java.lang.String str11 = this.f465812q;
            if (str11 != null) {
                fVar.j(11, str11);
            }
            java.lang.String str12 = this.f465813r;
            if (str12 != null) {
                fVar.j(12, str12);
            }
            java.lang.String str13 = this.f465814s;
            if (str13 != null) {
                fVar.j(13, str13);
            }
            java.lang.String str14 = this.f465815t;
            if (str14 != null) {
                fVar.j(14, str14);
            }
            java.lang.String str15 = this.f465816u;
            if (str15 != null) {
                fVar.j(15, str15);
            }
            java.lang.String str16 = this.f465817v;
            if (str16 != null) {
                fVar.j(16, str16);
            }
            java.lang.String str17 = this.f465818w;
            if (str17 != null) {
                fVar.j(17, str17);
            }
            java.lang.String str18 = this.f465819x;
            if (str18 != null) {
                fVar.j(18, str18);
            }
            java.lang.String str19 = this.f465822y;
            if (str19 != null) {
                fVar.j(19, str19);
            }
            java.lang.String str20 = this.f465825z;
            if (str20 != null) {
                fVar.j(20, str20);
            }
            java.lang.String str21 = this.A;
            if (str21 != null) {
                fVar.j(21, str21);
            }
            java.lang.String str22 = this.B;
            if (str22 != null) {
                fVar.j(22, str22);
            }
            java.lang.String str23 = this.C;
            if (str23 != null) {
                fVar.j(23, str23);
            }
            java.lang.String str24 = this.D;
            if (str24 != null) {
                fVar.j(24, str24);
            }
            java.lang.String str25 = this.E;
            if (str25 != null) {
                fVar.j(25, str25);
            }
            java.lang.String str26 = this.F;
            if (str26 != null) {
                fVar.j(26, str26);
            }
            fVar.e(27, this.G);
            java.lang.String str27 = this.H;
            if (str27 != null) {
                fVar.j(28, str27);
            }
            java.lang.String str28 = this.I;
            if (str28 != null) {
                fVar.j(29, str28);
            }
            java.lang.String str29 = this.f465798J;
            if (str29 != null) {
                fVar.j(30, str29);
            }
            java.lang.String str30 = this.K;
            if (str30 != null) {
                fVar.j(31, str30);
            }
            java.lang.String str31 = this.L;
            if (str31 != null) {
                fVar.j(32, str31);
            }
            java.lang.String str32 = this.M;
            if (str32 != null) {
                fVar.j(33, str32);
            }
            java.lang.String str33 = this.N;
            if (str33 != null) {
                fVar.j(34, str33);
            }
            java.lang.String str34 = this.P;
            if (str34 != null) {
                fVar.j(35, str34);
            }
            java.lang.String str35 = this.Q;
            if (str35 != null) {
                fVar.j(36, str35);
            }
            java.lang.String str36 = this.R;
            if (str36 != null) {
                fVar.j(37, str36);
            }
            java.lang.String str37 = this.S;
            if (str37 != null) {
                fVar.j(38, str37);
            }
            java.lang.String str38 = this.T;
            if (str38 != null) {
                fVar.j(39, str38);
            }
            java.lang.String str39 = this.U;
            if (str39 != null) {
                fVar.j(40, str39);
            }
            java.lang.String str40 = this.V;
            if (str40 != null) {
                fVar.j(41, str40);
            }
            java.lang.String str41 = this.W;
            if (str41 != null) {
                fVar.j(42, str41);
            }
            java.lang.String str42 = this.X;
            if (str42 != null) {
                fVar.j(43, str42);
            }
            fVar.e(44, this.Y);
            fVar.e(45, this.Z);
            java.lang.String str43 = this.f465810p0;
            if (str43 != null) {
                fVar.j(46, str43);
            }
            java.lang.String str44 = this.f465820x0;
            if (str44 != null) {
                fVar.j(47, str44);
            }
            java.lang.String str45 = this.f465823y0;
            if (str45 != null) {
                fVar.j(48, str45);
            }
            java.lang.String str46 = this.f465805l1;
            if (str46 != null) {
                fVar.j(49, str46);
            }
            java.lang.String str47 = this.f465811p1;
            if (str47 != null) {
                fVar.j(50, str47);
            }
            java.lang.String str48 = this.f465821x1;
            if (str48 != null) {
                fVar.j(51, str48);
            }
            java.lang.String str49 = this.f465824y1;
            if (str49 != null) {
                fVar.j(52, str49);
            }
            java.lang.String str50 = this.f465826z1;
            if (str50 != null) {
                fVar.j(53, str50);
            }
            fVar.h(54, this.A1);
            java.lang.String str51 = this.B1;
            if (str51 != null) {
                fVar.j(55, str51);
            }
            java.lang.String str52 = this.C1;
            if (str52 != null) {
                fVar.j(56, str52);
            }
            fVar.e(57, this.D1);
            fVar.e(58, this.E1);
            fVar.e(59, this.F1);
            r45.x43 x43Var = this.G1;
            if (x43Var != null) {
                fVar.i(68, x43Var.mo75928xcd1e8d8());
                this.G1.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str53 = this.H1;
            if (str53 != null) {
                fVar.j(69, str53);
            }
            java.lang.String str54 = this.I1;
            if (str54 != null) {
                fVar.j(70, str54);
            }
            r45.ae5 ae5Var = this.J1;
            if (ae5Var != null) {
                fVar.i(73, ae5Var.mo75928xcd1e8d8());
                this.J1.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str55 = this.K1;
            if (str55 != null) {
                fVar.j(77, str55);
            }
            java.lang.String str56 = this.L1;
            if (str56 != null) {
                fVar.j(78, str56);
            }
            java.lang.String str57 = this.M1;
            if (str57 != null) {
                fVar.j(79, str57);
            }
            fVar.g(80, 1, linkedList2);
            java.lang.String str58 = this.O1;
            if (str58 != null) {
                fVar.j(81, str58);
            }
            java.lang.String str59 = this.P1;
            if (str59 != null) {
                fVar.j(82, str59);
            }
            fVar.e(83, this.Q1);
            java.lang.String str60 = this.R1;
            if (str60 != null) {
                fVar.j(84, str60);
            }
            fVar.g(85, 1, linkedList);
            return 0;
        }
        if (i17 != 1) {
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
            r45.qv qvVar = (r45.qv) objArr[1];
            int intValue = ((java.lang.Integer) objArr[2]).intValue();
            if (intValue == 73) {
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ae5 ae5Var2 = new r45.ae5();
                    if (bArr2 != null && bArr2.length > 0) {
                        ae5Var2.mo11468x92b714fd(bArr2);
                    }
                    qvVar.J1 = ae5Var2;
                }
                return 0;
            }
            switch (intValue) {
                case 1:
                    qvVar.f465799d = aVar2.k(intValue);
                    return 0;
                case 2:
                    qvVar.f465800e = aVar2.k(intValue);
                    return 0;
                case 3:
                    qvVar.f465801f = aVar2.k(intValue);
                    return 0;
                case 4:
                    qvVar.f465802g = aVar2.k(intValue);
                    return 0;
                case 5:
                    qvVar.f465803h = aVar2.k(intValue);
                    return 0;
                case 6:
                    qvVar.f465804i = aVar2.k(intValue);
                    return 0;
                case 7:
                    qvVar.f465806m = aVar2.k(intValue);
                    return 0;
                case 8:
                    qvVar.f465807n = aVar2.k(intValue);
                    return 0;
                case 9:
                    qvVar.f465808o = aVar2.k(intValue);
                    return 0;
                case 10:
                    qvVar.f465809p = aVar2.k(intValue);
                    return 0;
                case 11:
                    qvVar.f465812q = aVar2.k(intValue);
                    return 0;
                case 12:
                    qvVar.f465813r = aVar2.k(intValue);
                    return 0;
                case 13:
                    qvVar.f465814s = aVar2.k(intValue);
                    return 0;
                case 14:
                    qvVar.f465815t = aVar2.k(intValue);
                    return 0;
                case 15:
                    qvVar.f465816u = aVar2.k(intValue);
                    return 0;
                case 16:
                    qvVar.f465817v = aVar2.k(intValue);
                    return 0;
                case 17:
                    qvVar.f465818w = aVar2.k(intValue);
                    return 0;
                case 18:
                    qvVar.f465819x = aVar2.k(intValue);
                    return 0;
                case 19:
                    qvVar.f465822y = aVar2.k(intValue);
                    return 0;
                case 20:
                    qvVar.f465825z = aVar2.k(intValue);
                    return 0;
                case 21:
                    qvVar.A = aVar2.k(intValue);
                    return 0;
                case 22:
                    qvVar.B = aVar2.k(intValue);
                    return 0;
                case 23:
                    qvVar.C = aVar2.k(intValue);
                    return 0;
                case 24:
                    qvVar.D = aVar2.k(intValue);
                    return 0;
                case 25:
                    qvVar.E = aVar2.k(intValue);
                    return 0;
                case 26:
                    qvVar.F = aVar2.k(intValue);
                    return 0;
                case 27:
                    qvVar.G = aVar2.g(intValue);
                    return 0;
                case 28:
                    qvVar.H = aVar2.k(intValue);
                    return 0;
                case 29:
                    qvVar.I = aVar2.k(intValue);
                    return 0;
                case 30:
                    qvVar.f465798J = aVar2.k(intValue);
                    return 0;
                case 31:
                    qvVar.K = aVar2.k(intValue);
                    return 0;
                case 32:
                    qvVar.L = aVar2.k(intValue);
                    return 0;
                case 33:
                    qvVar.M = aVar2.k(intValue);
                    return 0;
                case 34:
                    qvVar.N = aVar2.k(intValue);
                    return 0;
                case 35:
                    qvVar.P = aVar2.k(intValue);
                    return 0;
                case 36:
                    qvVar.Q = aVar2.k(intValue);
                    return 0;
                case 37:
                    qvVar.R = aVar2.k(intValue);
                    return 0;
                case 38:
                    qvVar.S = aVar2.k(intValue);
                    return 0;
                case 39:
                    qvVar.T = aVar2.k(intValue);
                    return 0;
                case 40:
                    qvVar.U = aVar2.k(intValue);
                    return 0;
                case 41:
                    qvVar.V = aVar2.k(intValue);
                    return 0;
                case 42:
                    qvVar.W = aVar2.k(intValue);
                    return 0;
                case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                    qvVar.X = aVar2.k(intValue);
                    return 0;
                case 44:
                    qvVar.Y = aVar2.g(intValue);
                    return 0;
                case 45:
                    qvVar.Z = aVar2.g(intValue);
                    return 0;
                case 46:
                    qvVar.f465810p0 = aVar2.k(intValue);
                    return 0;
                case 47:
                    qvVar.f465820x0 = aVar2.k(intValue);
                    return 0;
                case 48:
                    qvVar.f465823y0 = aVar2.k(intValue);
                    return 0;
                case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                    qvVar.f465805l1 = aVar2.k(intValue);
                    return 0;
                case 50:
                    qvVar.f465811p1 = aVar2.k(intValue);
                    return 0;
                case 51:
                    qvVar.f465821x1 = aVar2.k(intValue);
                    return 0;
                case 52:
                    qvVar.f465824y1 = aVar2.k(intValue);
                    return 0;
                case 53:
                    qvVar.f465826z1 = aVar2.k(intValue);
                    return 0;
                case 54:
                    qvVar.A1 = aVar2.i(intValue);
                    return 0;
                case 55:
                    qvVar.B1 = aVar2.k(intValue);
                    return 0;
                case 56:
                    qvVar.C1 = aVar2.k(intValue);
                    return 0;
                case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1.f34664x366c91de /* 57 */:
                    qvVar.D1 = aVar2.g(intValue);
                    return 0;
                case 58:
                    qvVar.E1 = aVar2.g(intValue);
                    return 0;
                case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k9.f34376x366c91de /* 59 */:
                    qvVar.F1 = aVar2.g(intValue);
                    return 0;
                default:
                    switch (intValue) {
                        case 68:
                            java.util.LinkedList j18 = aVar2.j(intValue);
                            int size2 = j18.size();
                            for (int i19 = 0; i19 < size2; i19++) {
                                byte[] bArr3 = (byte[]) j18.get(i19);
                                r45.x43 x43Var2 = new r45.x43();
                                if (bArr3 != null && bArr3.length > 0) {
                                    x43Var2.mo11468x92b714fd(bArr3);
                                }
                                qvVar.G1 = x43Var2;
                            }
                            return 0;
                        case 69:
                            qvVar.H1 = aVar2.k(intValue);
                            return 0;
                        case 70:
                            qvVar.I1 = aVar2.k(intValue);
                            return 0;
                        default:
                            switch (intValue) {
                                case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51705xc4897837 /* 77 */:
                                    qvVar.K1 = aVar2.k(intValue);
                                    return 0;
                                case qc1.u.f76443x366c91de /* 78 */:
                                    qvVar.L1 = aVar2.k(intValue);
                                    return 0;
                                case 79:
                                    qvVar.M1 = aVar2.k(intValue);
                                    return 0;
                                case 80:
                                    qvVar.N1.add(aVar2.k(intValue));
                                    return 0;
                                case 81:
                                    qvVar.O1 = aVar2.k(intValue);
                                    return 0;
                                case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45675x92fdfc4b /* 82 */:
                                    qvVar.P1 = aVar2.k(intValue);
                                    return 0;
                                case 83:
                                    qvVar.Q1 = aVar2.g(intValue);
                                    return 0;
                                case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.l.f34676x366c91de /* 84 */:
                                    qvVar.R1 = aVar2.k(intValue);
                                    return 0;
                                case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.q2.f34648x366c91de /* 85 */:
                                    qvVar.S1.add(aVar2.k(intValue));
                                    return 0;
                                default:
                                    return -1;
                            }
                    }
            }
        }
        java.lang.String str61 = this.f465799d;
        int j19 = str61 != null ? b36.f.j(1, str61) + 0 : 0;
        java.lang.String str62 = this.f465800e;
        if (str62 != null) {
            j19 += b36.f.j(2, str62);
        }
        java.lang.String str63 = this.f465801f;
        if (str63 != null) {
            j19 += b36.f.j(3, str63);
        }
        java.lang.String str64 = this.f465802g;
        if (str64 != null) {
            j19 += b36.f.j(4, str64);
        }
        java.lang.String str65 = this.f465803h;
        if (str65 != null) {
            j19 += b36.f.j(5, str65);
        }
        java.lang.String str66 = this.f465804i;
        if (str66 != null) {
            j19 += b36.f.j(6, str66);
        }
        java.lang.String str67 = this.f465806m;
        if (str67 != null) {
            j19 += b36.f.j(7, str67);
        }
        java.lang.String str68 = this.f465807n;
        if (str68 != null) {
            j19 += b36.f.j(8, str68);
        }
        java.lang.String str69 = this.f465808o;
        if (str69 != null) {
            j19 += b36.f.j(9, str69);
        }
        java.lang.String str70 = this.f465809p;
        if (str70 != null) {
            j19 += b36.f.j(10, str70);
        }
        java.lang.String str71 = this.f465812q;
        if (str71 != null) {
            j19 += b36.f.j(11, str71);
        }
        java.lang.String str72 = this.f465813r;
        if (str72 != null) {
            j19 += b36.f.j(12, str72);
        }
        java.lang.String str73 = this.f465814s;
        if (str73 != null) {
            j19 += b36.f.j(13, str73);
        }
        java.lang.String str74 = this.f465815t;
        if (str74 != null) {
            j19 += b36.f.j(14, str74);
        }
        java.lang.String str75 = this.f465816u;
        if (str75 != null) {
            j19 += b36.f.j(15, str75);
        }
        java.lang.String str76 = this.f465817v;
        if (str76 != null) {
            j19 += b36.f.j(16, str76);
        }
        java.lang.String str77 = this.f465818w;
        if (str77 != null) {
            j19 += b36.f.j(17, str77);
        }
        java.lang.String str78 = this.f465819x;
        if (str78 != null) {
            j19 += b36.f.j(18, str78);
        }
        java.lang.String str79 = this.f465822y;
        if (str79 != null) {
            j19 += b36.f.j(19, str79);
        }
        java.lang.String str80 = this.f465825z;
        if (str80 != null) {
            j19 += b36.f.j(20, str80);
        }
        java.lang.String str81 = this.A;
        if (str81 != null) {
            j19 += b36.f.j(21, str81);
        }
        java.lang.String str82 = this.B;
        if (str82 != null) {
            j19 += b36.f.j(22, str82);
        }
        java.lang.String str83 = this.C;
        if (str83 != null) {
            j19 += b36.f.j(23, str83);
        }
        java.lang.String str84 = this.D;
        if (str84 != null) {
            j19 += b36.f.j(24, str84);
        }
        java.lang.String str85 = this.E;
        if (str85 != null) {
            j19 += b36.f.j(25, str85);
        }
        java.lang.String str86 = this.F;
        if (str86 != null) {
            j19 += b36.f.j(26, str86);
        }
        int e17 = j19 + b36.f.e(27, this.G);
        java.lang.String str87 = this.H;
        if (str87 != null) {
            e17 += b36.f.j(28, str87);
        }
        java.lang.String str88 = this.I;
        if (str88 != null) {
            e17 += b36.f.j(29, str88);
        }
        java.lang.String str89 = this.f465798J;
        if (str89 != null) {
            e17 += b36.f.j(30, str89);
        }
        java.lang.String str90 = this.K;
        if (str90 != null) {
            e17 += b36.f.j(31, str90);
        }
        java.lang.String str91 = this.L;
        if (str91 != null) {
            e17 += b36.f.j(32, str91);
        }
        java.lang.String str92 = this.M;
        if (str92 != null) {
            e17 += b36.f.j(33, str92);
        }
        java.lang.String str93 = this.N;
        if (str93 != null) {
            e17 += b36.f.j(34, str93);
        }
        java.lang.String str94 = this.P;
        if (str94 != null) {
            e17 += b36.f.j(35, str94);
        }
        java.lang.String str95 = this.Q;
        if (str95 != null) {
            e17 += b36.f.j(36, str95);
        }
        java.lang.String str96 = this.R;
        if (str96 != null) {
            e17 += b36.f.j(37, str96);
        }
        java.lang.String str97 = this.S;
        if (str97 != null) {
            e17 += b36.f.j(38, str97);
        }
        java.lang.String str98 = this.T;
        if (str98 != null) {
            e17 += b36.f.j(39, str98);
        }
        java.lang.String str99 = this.U;
        if (str99 != null) {
            e17 += b36.f.j(40, str99);
        }
        java.lang.String str100 = this.V;
        if (str100 != null) {
            e17 += b36.f.j(41, str100);
        }
        java.lang.String str101 = this.W;
        if (str101 != null) {
            e17 += b36.f.j(42, str101);
        }
        java.lang.String str102 = this.X;
        if (str102 != null) {
            e17 += b36.f.j(43, str102);
        }
        int e18 = e17 + b36.f.e(44, this.Y) + b36.f.e(45, this.Z);
        java.lang.String str103 = this.f465810p0;
        if (str103 != null) {
            e18 += b36.f.j(46, str103);
        }
        java.lang.String str104 = this.f465820x0;
        if (str104 != null) {
            e18 += b36.f.j(47, str104);
        }
        java.lang.String str105 = this.f465823y0;
        if (str105 != null) {
            e18 += b36.f.j(48, str105);
        }
        java.lang.String str106 = this.f465805l1;
        if (str106 != null) {
            e18 += b36.f.j(49, str106);
        }
        java.lang.String str107 = this.f465811p1;
        if (str107 != null) {
            e18 += b36.f.j(50, str107);
        }
        java.lang.String str108 = this.f465821x1;
        if (str108 != null) {
            e18 += b36.f.j(51, str108);
        }
        java.lang.String str109 = this.f465824y1;
        if (str109 != null) {
            e18 += b36.f.j(52, str109);
        }
        java.lang.String str110 = this.f465826z1;
        if (str110 != null) {
            e18 += b36.f.j(53, str110);
        }
        int h17 = e18 + b36.f.h(54, this.A1);
        java.lang.String str111 = this.B1;
        if (str111 != null) {
            h17 += b36.f.j(55, str111);
        }
        java.lang.String str112 = this.C1;
        if (str112 != null) {
            h17 += b36.f.j(56, str112);
        }
        int e19 = h17 + b36.f.e(57, this.D1) + b36.f.e(58, this.E1) + b36.f.e(59, this.F1);
        r45.x43 x43Var3 = this.G1;
        if (x43Var3 != null) {
            e19 += b36.f.i(68, x43Var3.mo75928xcd1e8d8());
        }
        java.lang.String str113 = this.H1;
        if (str113 != null) {
            e19 += b36.f.j(69, str113);
        }
        java.lang.String str114 = this.I1;
        if (str114 != null) {
            e19 += b36.f.j(70, str114);
        }
        r45.ae5 ae5Var3 = this.J1;
        if (ae5Var3 != null) {
            e19 += b36.f.i(73, ae5Var3.mo75928xcd1e8d8());
        }
        java.lang.String str115 = this.K1;
        if (str115 != null) {
            e19 += b36.f.j(77, str115);
        }
        java.lang.String str116 = this.L1;
        if (str116 != null) {
            e19 += b36.f.j(78, str116);
        }
        java.lang.String str117 = this.M1;
        if (str117 != null) {
            e19 += b36.f.j(79, str117);
        }
        int g17 = e19 + b36.f.g(80, 1, linkedList2);
        java.lang.String str118 = this.O1;
        if (str118 != null) {
            g17 += b36.f.j(81, str118);
        }
        java.lang.String str119 = this.P1;
        if (str119 != null) {
            g17 += b36.f.j(82, str119);
        }
        int e27 = g17 + b36.f.e(83, this.Q1);
        java.lang.String str120 = this.R1;
        if (str120 != null) {
            e27 += b36.f.j(84, str120);
        }
        return e27 + b36.f.g(85, 1, linkedList);
    }
}
