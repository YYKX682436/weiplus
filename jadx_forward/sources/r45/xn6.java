package r45;

/* loaded from: classes15.dex */
public class xn6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public java.lang.String B;
    public java.lang.String C;
    public long E;
    public boolean F;
    public java.lang.String G;
    public long H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public long f471787J;
    public int L;
    public long M;
    public r45.sn6 N;
    public int P;
    public int Q;
    public boolean R;
    public java.lang.String S;
    public r45.vn6 T;
    public int U;
    public r45.xn6 V;
    public int X;
    public r45.pn6 Y;
    public java.lang.String Z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471788d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471789e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f471790f;

    /* renamed from: g, reason: collision with root package name */
    public int f471791g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471792h;

    /* renamed from: i, reason: collision with root package name */
    public int f471793i;

    /* renamed from: m, reason: collision with root package name */
    public int f471794m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f471795n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f471796o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f471797p;

    /* renamed from: p0, reason: collision with root package name */
    public int f471798p0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f471799q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f471800r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f471801s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f471802t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f471803u;

    /* renamed from: v, reason: collision with root package name */
    public long f471804v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f471805w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f471806x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f471807y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f471808z;
    public final java.util.LinkedList D = new java.util.LinkedList();
    public java.util.LinkedList K = new java.util.LinkedList();
    public final java.util.LinkedList W = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xn6)) {
            return false;
        }
        r45.xn6 xn6Var = (r45.xn6) fVar;
        return n51.f.a(this.f471788d, xn6Var.f471788d) && n51.f.a(this.f471789e, xn6Var.f471789e) && n51.f.a(this.f471790f, xn6Var.f471790f) && n51.f.a(java.lang.Integer.valueOf(this.f471791g), java.lang.Integer.valueOf(xn6Var.f471791g)) && n51.f.a(this.f471792h, xn6Var.f471792h) && n51.f.a(java.lang.Integer.valueOf(this.f471793i), java.lang.Integer.valueOf(xn6Var.f471793i)) && n51.f.a(java.lang.Integer.valueOf(this.f471794m), java.lang.Integer.valueOf(xn6Var.f471794m)) && n51.f.a(this.f471795n, xn6Var.f471795n) && n51.f.a(this.f471796o, xn6Var.f471796o) && n51.f.a(this.f471797p, xn6Var.f471797p) && n51.f.a(this.f471799q, xn6Var.f471799q) && n51.f.a(this.f471800r, xn6Var.f471800r) && n51.f.a(this.f471801s, xn6Var.f471801s) && n51.f.a(this.f471802t, xn6Var.f471802t) && n51.f.a(this.f471803u, xn6Var.f471803u) && n51.f.a(java.lang.Long.valueOf(this.f471804v), java.lang.Long.valueOf(xn6Var.f471804v)) && n51.f.a(this.f471805w, xn6Var.f471805w) && n51.f.a(this.f471806x, xn6Var.f471806x) && n51.f.a(this.f471807y, xn6Var.f471807y) && n51.f.a(this.f471808z, xn6Var.f471808z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(xn6Var.A)) && n51.f.a(this.B, xn6Var.B) && n51.f.a(this.C, xn6Var.C) && n51.f.a(this.D, xn6Var.D) && n51.f.a(java.lang.Long.valueOf(this.E), java.lang.Long.valueOf(xn6Var.E)) && n51.f.a(java.lang.Boolean.valueOf(this.F), java.lang.Boolean.valueOf(xn6Var.F)) && n51.f.a(this.G, xn6Var.G) && n51.f.a(java.lang.Long.valueOf(this.H), java.lang.Long.valueOf(xn6Var.H)) && n51.f.a(java.lang.Long.valueOf(this.I), java.lang.Long.valueOf(xn6Var.I)) && n51.f.a(java.lang.Long.valueOf(this.f471787J), java.lang.Long.valueOf(xn6Var.f471787J)) && n51.f.a(this.K, xn6Var.K) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(xn6Var.L)) && n51.f.a(java.lang.Long.valueOf(this.M), java.lang.Long.valueOf(xn6Var.M)) && n51.f.a(this.N, xn6Var.N) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(xn6Var.P)) && n51.f.a(java.lang.Integer.valueOf(this.Q), java.lang.Integer.valueOf(xn6Var.Q)) && n51.f.a(java.lang.Boolean.valueOf(this.R), java.lang.Boolean.valueOf(xn6Var.R)) && n51.f.a(this.S, xn6Var.S) && n51.f.a(this.T, xn6Var.T) && n51.f.a(java.lang.Integer.valueOf(this.U), java.lang.Integer.valueOf(xn6Var.U)) && n51.f.a(this.V, xn6Var.V) && n51.f.a(this.W, xn6Var.W) && n51.f.a(java.lang.Integer.valueOf(this.X), java.lang.Integer.valueOf(xn6Var.X)) && n51.f.a(this.Y, xn6Var.Y) && n51.f.a(this.Z, xn6Var.Z) && n51.f.a(java.lang.Integer.valueOf(this.f471798p0), java.lang.Integer.valueOf(xn6Var.f471798p0));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.W;
        java.util.LinkedList linkedList2 = this.D;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471788d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f471789e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f471790f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f471791g);
            java.lang.String str4 = this.f471792h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f471793i);
            fVar.e(7, this.f471794m);
            java.lang.String str5 = this.f471795n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f471796o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f471797p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f471799q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f471800r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.f471801s;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            java.lang.String str11 = this.f471802t;
            if (str11 != null) {
                fVar.j(14, str11);
            }
            java.lang.String str12 = this.f471803u;
            if (str12 != null) {
                fVar.j(15, str12);
            }
            fVar.h(16, this.f471804v);
            java.lang.String str13 = this.f471805w;
            if (str13 != null) {
                fVar.j(17, str13);
            }
            java.lang.String str14 = this.f471806x;
            if (str14 != null) {
                fVar.j(18, str14);
            }
            java.lang.String str15 = this.f471807y;
            if (str15 != null) {
                fVar.j(19, str15);
            }
            java.lang.String str16 = this.f471808z;
            if (str16 != null) {
                fVar.j(20, str16);
            }
            fVar.e(21, this.A);
            java.lang.String str17 = this.B;
            if (str17 != null) {
                fVar.j(22, str17);
            }
            java.lang.String str18 = this.C;
            if (str18 != null) {
                fVar.j(23, str18);
            }
            fVar.g(24, 8, linkedList2);
            fVar.h(25, this.E);
            fVar.a(26, this.F);
            java.lang.String str19 = this.G;
            if (str19 != null) {
                fVar.j(27, str19);
            }
            fVar.h(28, this.H);
            fVar.h(29, this.I);
            fVar.h(30, this.f471787J);
            fVar.g(31, 8, this.K);
            fVar.e(32, this.L);
            fVar.h(33, this.M);
            r45.sn6 sn6Var = this.N;
            if (sn6Var != null) {
                fVar.i(34, sn6Var.mo75928xcd1e8d8());
                this.N.mo75956x3d5d1f78(fVar);
            }
            fVar.e(35, this.P);
            fVar.e(36, this.Q);
            fVar.a(37, this.R);
            java.lang.String str20 = this.S;
            if (str20 != null) {
                fVar.j(38, str20);
            }
            r45.vn6 vn6Var = this.T;
            if (vn6Var != null) {
                fVar.i(39, vn6Var.mo75928xcd1e8d8());
                this.T.mo75956x3d5d1f78(fVar);
            }
            fVar.e(40, this.U);
            r45.xn6 xn6Var = this.V;
            if (xn6Var != null) {
                fVar.i(41, xn6Var.mo75928xcd1e8d8());
                this.V.mo75956x3d5d1f78(fVar);
            }
            fVar.g(42, 8, linkedList);
            fVar.e(43, this.X);
            r45.pn6 pn6Var = this.Y;
            if (pn6Var != null) {
                fVar.i(44, pn6Var.mo75928xcd1e8d8());
                this.Y.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str21 = this.Z;
            if (str21 != null) {
                fVar.j(45, str21);
            }
            fVar.e(46, this.f471798p0);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str22 = this.f471788d;
            int j17 = str22 != null ? b36.f.j(1, str22) + 0 : 0;
            java.lang.String str23 = this.f471789e;
            if (str23 != null) {
                j17 += b36.f.j(2, str23);
            }
            java.lang.String str24 = this.f471790f;
            if (str24 != null) {
                j17 += b36.f.j(3, str24);
            }
            int e17 = j17 + b36.f.e(4, this.f471791g);
            java.lang.String str25 = this.f471792h;
            if (str25 != null) {
                e17 += b36.f.j(5, str25);
            }
            int e18 = e17 + b36.f.e(6, this.f471793i) + b36.f.e(7, this.f471794m);
            java.lang.String str26 = this.f471795n;
            if (str26 != null) {
                e18 += b36.f.j(8, str26);
            }
            java.lang.String str27 = this.f471796o;
            if (str27 != null) {
                e18 += b36.f.j(9, str27);
            }
            java.lang.String str28 = this.f471797p;
            if (str28 != null) {
                e18 += b36.f.j(10, str28);
            }
            java.lang.String str29 = this.f471799q;
            if (str29 != null) {
                e18 += b36.f.j(11, str29);
            }
            java.lang.String str30 = this.f471800r;
            if (str30 != null) {
                e18 += b36.f.j(12, str30);
            }
            java.lang.String str31 = this.f471801s;
            if (str31 != null) {
                e18 += b36.f.j(13, str31);
            }
            java.lang.String str32 = this.f471802t;
            if (str32 != null) {
                e18 += b36.f.j(14, str32);
            }
            java.lang.String str33 = this.f471803u;
            if (str33 != null) {
                e18 += b36.f.j(15, str33);
            }
            int h17 = e18 + b36.f.h(16, this.f471804v);
            java.lang.String str34 = this.f471805w;
            if (str34 != null) {
                h17 += b36.f.j(17, str34);
            }
            java.lang.String str35 = this.f471806x;
            if (str35 != null) {
                h17 += b36.f.j(18, str35);
            }
            java.lang.String str36 = this.f471807y;
            if (str36 != null) {
                h17 += b36.f.j(19, str36);
            }
            java.lang.String str37 = this.f471808z;
            if (str37 != null) {
                h17 += b36.f.j(20, str37);
            }
            int e19 = h17 + b36.f.e(21, this.A);
            java.lang.String str38 = this.B;
            if (str38 != null) {
                e19 += b36.f.j(22, str38);
            }
            java.lang.String str39 = this.C;
            if (str39 != null) {
                e19 += b36.f.j(23, str39);
            }
            int g17 = e19 + b36.f.g(24, 8, linkedList2) + b36.f.h(25, this.E) + b36.f.a(26, this.F);
            java.lang.String str40 = this.G;
            if (str40 != null) {
                g17 += b36.f.j(27, str40);
            }
            int h18 = g17 + b36.f.h(28, this.H) + b36.f.h(29, this.I) + b36.f.h(30, this.f471787J) + b36.f.g(31, 8, this.K) + b36.f.e(32, this.L) + b36.f.h(33, this.M);
            r45.sn6 sn6Var2 = this.N;
            if (sn6Var2 != null) {
                h18 += b36.f.i(34, sn6Var2.mo75928xcd1e8d8());
            }
            int e27 = h18 + b36.f.e(35, this.P) + b36.f.e(36, this.Q) + b36.f.a(37, this.R);
            java.lang.String str41 = this.S;
            if (str41 != null) {
                e27 += b36.f.j(38, str41);
            }
            r45.vn6 vn6Var2 = this.T;
            if (vn6Var2 != null) {
                e27 += b36.f.i(39, vn6Var2.mo75928xcd1e8d8());
            }
            int e28 = e27 + b36.f.e(40, this.U);
            r45.xn6 xn6Var2 = this.V;
            if (xn6Var2 != null) {
                e28 += b36.f.i(41, xn6Var2.mo75928xcd1e8d8());
            }
            int g18 = e28 + b36.f.g(42, 8, linkedList) + b36.f.e(43, this.X);
            r45.pn6 pn6Var2 = this.Y;
            if (pn6Var2 != null) {
                g18 += b36.f.i(44, pn6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str42 = this.Z;
            if (str42 != null) {
                g18 += b36.f.j(45, str42);
            }
            return g18 + b36.f.e(46, this.f471798p0);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            this.K.clear();
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
        r45.xn6 xn6Var3 = (r45.xn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xn6Var3.f471788d = aVar2.k(intValue);
                return 0;
            case 2:
                xn6Var3.f471789e = aVar2.k(intValue);
                return 0;
            case 3:
                xn6Var3.f471790f = aVar2.k(intValue);
                return 0;
            case 4:
                xn6Var3.f471791g = aVar2.g(intValue);
                return 0;
            case 5:
                xn6Var3.f471792h = aVar2.k(intValue);
                return 0;
            case 6:
                xn6Var3.f471793i = aVar2.g(intValue);
                return 0;
            case 7:
                xn6Var3.f471794m = aVar2.g(intValue);
                return 0;
            case 8:
                xn6Var3.f471795n = aVar2.k(intValue);
                return 0;
            case 9:
                xn6Var3.f471796o = aVar2.k(intValue);
                return 0;
            case 10:
                xn6Var3.f471797p = aVar2.k(intValue);
                return 0;
            case 11:
                xn6Var3.f471799q = aVar2.k(intValue);
                return 0;
            case 12:
                xn6Var3.f471800r = aVar2.k(intValue);
                return 0;
            case 13:
                xn6Var3.f471801s = aVar2.k(intValue);
                return 0;
            case 14:
                xn6Var3.f471802t = aVar2.k(intValue);
                return 0;
            case 15:
                xn6Var3.f471803u = aVar2.k(intValue);
                return 0;
            case 16:
                xn6Var3.f471804v = aVar2.i(intValue);
                return 0;
            case 17:
                xn6Var3.f471805w = aVar2.k(intValue);
                return 0;
            case 18:
                xn6Var3.f471806x = aVar2.k(intValue);
                return 0;
            case 19:
                xn6Var3.f471807y = aVar2.k(intValue);
                return 0;
            case 20:
                xn6Var3.f471808z = aVar2.k(intValue);
                return 0;
            case 21:
                xn6Var3.A = aVar2.g(intValue);
                return 0;
            case 22:
                xn6Var3.B = aVar2.k(intValue);
                return 0;
            case 23:
                xn6Var3.C = aVar2.k(intValue);
                return 0;
            case 24:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.x56 x56Var = new r45.x56();
                    if (bArr2 != null && bArr2.length > 0) {
                        x56Var.mo11468x92b714fd(bArr2);
                    }
                    xn6Var3.D.add(x56Var);
                }
                return 0;
            case 25:
                xn6Var3.E = aVar2.i(intValue);
                return 0;
            case 26:
                xn6Var3.F = aVar2.c(intValue);
                return 0;
            case 27:
                xn6Var3.G = aVar2.k(intValue);
                return 0;
            case 28:
                xn6Var3.H = aVar2.i(intValue);
                return 0;
            case 29:
                xn6Var3.I = aVar2.i(intValue);
                return 0;
            case 30:
                xn6Var3.f471787J = aVar2.i(intValue);
                return 0;
            case 31:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.zn6 zn6Var = new r45.zn6();
                    if (bArr3 != null && bArr3.length > 0) {
                        zn6Var.mo11468x92b714fd(bArr3);
                    }
                    xn6Var3.K.add(zn6Var);
                }
                return 0;
            case 32:
                xn6Var3.L = aVar2.g(intValue);
                return 0;
            case 33:
                xn6Var3.M = aVar2.i(intValue);
                return 0;
            case 34:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.sn6 sn6Var3 = new r45.sn6();
                    if (bArr4 != null && bArr4.length > 0) {
                        sn6Var3.mo11468x92b714fd(bArr4);
                    }
                    xn6Var3.N = sn6Var3;
                }
                return 0;
            case 35:
                xn6Var3.P = aVar2.g(intValue);
                return 0;
            case 36:
                xn6Var3.Q = aVar2.g(intValue);
                return 0;
            case 37:
                xn6Var3.R = aVar2.c(intValue);
                return 0;
            case 38:
                xn6Var3.S = aVar2.k(intValue);
                return 0;
            case 39:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.vn6 vn6Var3 = new r45.vn6();
                    if (bArr5 != null && bArr5.length > 0) {
                        vn6Var3.mo11468x92b714fd(bArr5);
                    }
                    xn6Var3.T = vn6Var3;
                }
                return 0;
            case 40:
                xn6Var3.U = aVar2.g(intValue);
                return 0;
            case 41:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j29.get(i29);
                    r45.xn6 xn6Var4 = new r45.xn6();
                    if (bArr6 != null && bArr6.length > 0) {
                        xn6Var4.mo11468x92b714fd(bArr6);
                    }
                    xn6Var3.V = xn6Var4;
                }
                return 0;
            case 42:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j37.get(i37);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr7 != null && bArr7.length > 0) {
                        x50Var.mo11468x92b714fd(bArr7);
                    }
                    xn6Var3.W.add(x50Var);
                }
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                xn6Var3.X = aVar2.g(intValue);
                return 0;
            case 44:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size7 = j38.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j38.get(i38);
                    r45.pn6 pn6Var3 = new r45.pn6();
                    if (bArr8 != null && bArr8.length > 0) {
                        pn6Var3.mo11468x92b714fd(bArr8);
                    }
                    xn6Var3.Y = pn6Var3;
                }
                return 0;
            case 45:
                xn6Var3.Z = aVar2.k(intValue);
                return 0;
            case 46:
                xn6Var3.f471798p0 = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f471788d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str, false);
            eVar.d(jSONObject, "videoUrl", this.f471789e, false);
            eVar.d(jSONObject, "thumbnailUrl", this.f471790f, false);
            eVar.d(jSONObject, "videoDurationSec", java.lang.Integer.valueOf(this.f471791g), false);
            eVar.d(jSONObject, "videoId", this.f471792h, false);
            eVar.d(jSONObject, "thumbWidth", java.lang.Integer.valueOf(this.f471793i), false);
            eVar.d(jSONObject, "thumbHeight", java.lang.Integer.valueOf(this.f471794m), false);
            eVar.d(jSONObject, "shareUrl", this.f471795n, false);
            eVar.d(jSONObject, "shareTitle", this.f471796o, false);
            eVar.d(jSONObject, "shareDesc", this.f471797p, false);
            eVar.d(jSONObject, "shareImgUrl", this.f471799q, false);
            eVar.d(jSONObject, "shareString", this.f471800r, false);
            eVar.d(jSONObject, "shareStringUrl", this.f471801s, false);
            eVar.d(jSONObject, ya.b.f77502x92235c1b, this.f471802t, false);
            eVar.d(jSONObject, "sourceUrl", this.f471803u, false);
            eVar.d(jSONObject, "relevantCategory", java.lang.Long.valueOf(this.f471804v), false);
            eVar.d(jSONObject, "shareOpenId", this.f471805w, false);
            eVar.d(jSONObject, "expand", this.f471806x, false);
            eVar.d(jSONObject, "strPlayCount", this.f471807y, false);
            eVar.d(jSONObject, "titleUrl", this.f471808z, false);
            eVar.d(jSONObject, "itemtype", java.lang.Integer.valueOf(this.A), false);
            eVar.d(jSONObject, "itemExpand", this.B, false);
            eVar.d(jSONObject, "bizIcon", this.C, false);
            eVar.d(jSONObject, "tagList", this.D, false);
            eVar.d(jSONObject, com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, java.lang.Long.valueOf(this.E), false);
            eVar.d(jSONObject, "isShow", java.lang.Boolean.valueOf(this.F), false);
            eVar.d(jSONObject, "docId", this.G, false);
            eVar.d(jSONObject, "resultType", java.lang.Long.valueOf(this.H), false);
            eVar.d(jSONObject, "type", java.lang.Long.valueOf(this.I), false);
            eVar.d(jSONObject, "videoSize", java.lang.Long.valueOf(this.f471787J), false);
            eVar.d(jSONObject, "videoUrlList", this.K, false);
            eVar.d(jSONObject, "switchFlag", java.lang.Integer.valueOf(this.L), false);
            eVar.d(jSONObject, "shareChannelId", java.lang.Long.valueOf(this.M), false);
            eVar.d(jSONObject, "secondVideoInfo", this.N, false);
            eVar.d(jSONObject, "cdnScene", java.lang.Integer.valueOf(this.P), false);
            eVar.d(jSONObject, "cdnSourceType", java.lang.Integer.valueOf(this.Q), false);
            eVar.d(jSONObject, "isSelfThumb", java.lang.Boolean.valueOf(this.R), false);
            eVar.d(jSONObject, "byPass", this.S, false);
            eVar.d(jSONObject, "feedBackInfo", this.T, false);
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54551x8c928bca, java.lang.Integer.valueOf(this.U), false);
            eVar.d(jSONObject, "longVideoInfo", this.V, false);
            eVar.d(jSONObject, "extReqParams", this.W, false);
            eVar.d(jSONObject, "globalColikeCnt", java.lang.Integer.valueOf(this.X), false);
            eVar.d(jSONObject, "pointVideoInfo", this.Y, false);
            eVar.d(jSONObject, "bizUserName", this.Z, false);
            eVar.d(jSONObject, "sourceJumpType", java.lang.Integer.valueOf(this.f471798p0), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
