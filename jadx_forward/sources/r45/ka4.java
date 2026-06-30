package r45;

/* loaded from: classes10.dex */
public class ka4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public int A1;
    public int B;
    public int B1;
    public int C;
    public int C1;
    public int D;
    public int D1;
    public int E;
    public int E1;
    public int F;
    public int F1;
    public int G;
    public r45.o30 G1;
    public int H;
    public r45.bu4 H1;
    public int I;
    public int I1;

    /* renamed from: J, reason: collision with root package name */
    public int f460065J;
    public java.lang.String J1;
    public java.lang.String K;
    public int K1;
    public java.lang.String L;
    public java.lang.String M;
    public int N;
    public int P;
    public java.lang.String Q;
    public int R;
    public int S;
    public java.lang.String T;
    public java.lang.String U;
    public int V;
    public int W;
    public java.lang.String X;
    public int Y;
    public int Z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460066d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460067e;

    /* renamed from: f, reason: collision with root package name */
    public int f460068f;

    /* renamed from: g, reason: collision with root package name */
    public int f460069g;

    /* renamed from: h, reason: collision with root package name */
    public long f460070h;

    /* renamed from: i, reason: collision with root package name */
    public long f460071i;

    /* renamed from: l1, reason: collision with root package name */
    public int f460072l1;

    /* renamed from: n, reason: collision with root package name */
    public int f460074n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f460076p;

    /* renamed from: p0, reason: collision with root package name */
    public int f460077p0;

    /* renamed from: p1, reason: collision with root package name */
    public r45.ah5 f460078p1;

    /* renamed from: q, reason: collision with root package name */
    public int f460079q;

    /* renamed from: r, reason: collision with root package name */
    public int f460080r;

    /* renamed from: s, reason: collision with root package name */
    public int f460081s;

    /* renamed from: t, reason: collision with root package name */
    public int f460082t;

    /* renamed from: u, reason: collision with root package name */
    public int f460083u;

    /* renamed from: v, reason: collision with root package name */
    public int f460084v;

    /* renamed from: w, reason: collision with root package name */
    public int f460085w;

    /* renamed from: x, reason: collision with root package name */
    public int f460086x;

    /* renamed from: x0, reason: collision with root package name */
    public int f460087x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f460088x1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f460089y;

    /* renamed from: y0, reason: collision with root package name */
    public int f460090y0;

    /* renamed from: y1, reason: collision with root package name */
    public int f460091y1;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f460092z;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f460073m = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f460075o = new java.util.LinkedList();

    /* renamed from: z1, reason: collision with root package name */
    public final java.util.LinkedList f460093z1 = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ka4)) {
            return false;
        }
        r45.ka4 ka4Var = (r45.ka4) fVar;
        return n51.f.a(this.f460066d, ka4Var.f460066d) && n51.f.a(this.f460067e, ka4Var.f460067e) && n51.f.a(java.lang.Integer.valueOf(this.f460068f), java.lang.Integer.valueOf(ka4Var.f460068f)) && n51.f.a(java.lang.Integer.valueOf(this.f460069g), java.lang.Integer.valueOf(ka4Var.f460069g)) && n51.f.a(java.lang.Long.valueOf(this.f460070h), java.lang.Long.valueOf(ka4Var.f460070h)) && n51.f.a(java.lang.Long.valueOf(this.f460071i), java.lang.Long.valueOf(ka4Var.f460071i)) && n51.f.a(this.f460073m, ka4Var.f460073m) && n51.f.a(java.lang.Integer.valueOf(this.f460074n), java.lang.Integer.valueOf(ka4Var.f460074n)) && n51.f.a(this.f460075o, ka4Var.f460075o) && n51.f.a(this.f460076p, ka4Var.f460076p) && n51.f.a(java.lang.Integer.valueOf(this.f460079q), java.lang.Integer.valueOf(ka4Var.f460079q)) && n51.f.a(java.lang.Integer.valueOf(this.f460080r), java.lang.Integer.valueOf(ka4Var.f460080r)) && n51.f.a(java.lang.Integer.valueOf(this.f460081s), java.lang.Integer.valueOf(ka4Var.f460081s)) && n51.f.a(java.lang.Integer.valueOf(this.f460082t), java.lang.Integer.valueOf(ka4Var.f460082t)) && n51.f.a(java.lang.Integer.valueOf(this.f460083u), java.lang.Integer.valueOf(ka4Var.f460083u)) && n51.f.a(java.lang.Integer.valueOf(this.f460084v), java.lang.Integer.valueOf(ka4Var.f460084v)) && n51.f.a(java.lang.Integer.valueOf(this.f460085w), java.lang.Integer.valueOf(ka4Var.f460085w)) && n51.f.a(java.lang.Integer.valueOf(this.f460086x), java.lang.Integer.valueOf(ka4Var.f460086x)) && n51.f.a(this.f460089y, ka4Var.f460089y) && n51.f.a(this.f460092z, ka4Var.f460092z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(ka4Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(ka4Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(ka4Var.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(ka4Var.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(ka4Var.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(ka4Var.F)) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(ka4Var.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(ka4Var.H)) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(ka4Var.I)) && n51.f.a(java.lang.Integer.valueOf(this.f460065J), java.lang.Integer.valueOf(ka4Var.f460065J)) && n51.f.a(this.K, ka4Var.K) && n51.f.a(this.L, ka4Var.L) && n51.f.a(this.M, ka4Var.M) && n51.f.a(java.lang.Integer.valueOf(this.N), java.lang.Integer.valueOf(ka4Var.N)) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(ka4Var.P)) && n51.f.a(this.Q, ka4Var.Q) && n51.f.a(java.lang.Integer.valueOf(this.R), java.lang.Integer.valueOf(ka4Var.R)) && n51.f.a(java.lang.Integer.valueOf(this.S), java.lang.Integer.valueOf(ka4Var.S)) && n51.f.a(this.T, ka4Var.T) && n51.f.a(this.U, ka4Var.U) && n51.f.a(java.lang.Integer.valueOf(this.V), java.lang.Integer.valueOf(ka4Var.V)) && n51.f.a(java.lang.Integer.valueOf(this.W), java.lang.Integer.valueOf(ka4Var.W)) && n51.f.a(this.X, ka4Var.X) && n51.f.a(java.lang.Integer.valueOf(this.Y), java.lang.Integer.valueOf(ka4Var.Y)) && n51.f.a(java.lang.Integer.valueOf(this.Z), java.lang.Integer.valueOf(ka4Var.Z)) && n51.f.a(java.lang.Integer.valueOf(this.f460077p0), java.lang.Integer.valueOf(ka4Var.f460077p0)) && n51.f.a(java.lang.Integer.valueOf(this.f460087x0), java.lang.Integer.valueOf(ka4Var.f460087x0)) && n51.f.a(java.lang.Integer.valueOf(this.f460090y0), java.lang.Integer.valueOf(ka4Var.f460090y0)) && n51.f.a(java.lang.Integer.valueOf(this.f460072l1), java.lang.Integer.valueOf(ka4Var.f460072l1)) && n51.f.a(this.f460078p1, ka4Var.f460078p1) && n51.f.a(java.lang.Integer.valueOf(this.f460088x1), java.lang.Integer.valueOf(ka4Var.f460088x1)) && n51.f.a(java.lang.Integer.valueOf(this.f460091y1), java.lang.Integer.valueOf(ka4Var.f460091y1)) && n51.f.a(this.f460093z1, ka4Var.f460093z1) && n51.f.a(java.lang.Integer.valueOf(this.A1), java.lang.Integer.valueOf(ka4Var.A1)) && n51.f.a(java.lang.Integer.valueOf(this.B1), java.lang.Integer.valueOf(ka4Var.B1)) && n51.f.a(java.lang.Integer.valueOf(this.C1), java.lang.Integer.valueOf(ka4Var.C1)) && n51.f.a(java.lang.Integer.valueOf(this.D1), java.lang.Integer.valueOf(ka4Var.D1)) && n51.f.a(java.lang.Integer.valueOf(this.E1), java.lang.Integer.valueOf(ka4Var.E1)) && n51.f.a(java.lang.Integer.valueOf(this.F1), java.lang.Integer.valueOf(ka4Var.F1)) && n51.f.a(this.G1, ka4Var.G1) && n51.f.a(this.H1, ka4Var.H1) && n51.f.a(java.lang.Integer.valueOf(this.I1), java.lang.Integer.valueOf(ka4Var.I1)) && n51.f.a(this.J1, ka4Var.J1) && n51.f.a(java.lang.Integer.valueOf(this.K1), java.lang.Integer.valueOf(ka4Var.K1));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f460093z1;
        java.util.LinkedList linkedList2 = this.f460075o;
        java.util.LinkedList linkedList3 = this.f460073m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460066d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f460067e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f460068f);
            fVar.e(4, this.f460069g);
            fVar.h(5, this.f460070h);
            fVar.h(6, this.f460071i);
            fVar.g(7, 8, linkedList3);
            fVar.e(8, this.f460074n);
            fVar.g(9, 1, linkedList2);
            java.lang.String str3 = this.f460076p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            fVar.e(11, this.f460079q);
            fVar.e(12, this.f460080r);
            fVar.e(13, this.f460081s);
            fVar.e(14, this.f460082t);
            fVar.e(15, this.f460083u);
            fVar.e(16, this.f460084v);
            fVar.e(17, this.f460085w);
            fVar.e(18, this.f460086x);
            java.lang.String str4 = this.f460089y;
            if (str4 != null) {
                fVar.j(19, str4);
            }
            java.lang.String str5 = this.f460092z;
            if (str5 != null) {
                fVar.j(20, str5);
            }
            fVar.e(21, this.A);
            fVar.e(22, this.B);
            fVar.e(23, this.C);
            fVar.e(24, this.D);
            fVar.e(25, this.E);
            fVar.e(26, this.F);
            fVar.e(27, this.G);
            fVar.e(28, this.H);
            fVar.e(29, this.I);
            fVar.e(30, this.f460065J);
            java.lang.String str6 = this.K;
            if (str6 != null) {
                fVar.j(31, str6);
            }
            java.lang.String str7 = this.L;
            if (str7 != null) {
                fVar.j(32, str7);
            }
            java.lang.String str8 = this.M;
            if (str8 != null) {
                fVar.j(33, str8);
            }
            fVar.e(34, this.N);
            fVar.e(35, this.P);
            java.lang.String str9 = this.Q;
            if (str9 != null) {
                fVar.j(36, str9);
            }
            fVar.e(37, this.R);
            fVar.e(38, this.S);
            java.lang.String str10 = this.T;
            if (str10 != null) {
                fVar.j(39, str10);
            }
            java.lang.String str11 = this.U;
            if (str11 != null) {
                fVar.j(40, str11);
            }
            fVar.e(41, this.V);
            fVar.e(42, this.W);
            java.lang.String str12 = this.X;
            if (str12 != null) {
                fVar.j(43, str12);
            }
            fVar.e(44, this.Y);
            fVar.e(45, this.Z);
            fVar.e(46, this.f460077p0);
            fVar.e(47, this.f460087x0);
            fVar.e(48, this.f460090y0);
            fVar.e(49, this.f460072l1);
            r45.ah5 ah5Var = this.f460078p1;
            if (ah5Var != null) {
                fVar.i(50, ah5Var.mo75928xcd1e8d8());
                this.f460078p1.mo75956x3d5d1f78(fVar);
            }
            fVar.e(51, this.f460088x1);
            fVar.e(52, this.f460091y1);
            fVar.g(53, 2, linkedList);
            fVar.e(54, this.A1);
            fVar.e(55, this.B1);
            fVar.e(56, this.C1);
            fVar.e(57, this.D1);
            fVar.e(58, this.E1);
            fVar.e(59, this.F1);
            r45.o30 o30Var = this.G1;
            if (o30Var != null) {
                fVar.i(60, o30Var.mo75928xcd1e8d8());
                this.G1.mo75956x3d5d1f78(fVar);
            }
            r45.bu4 bu4Var = this.H1;
            if (bu4Var != null) {
                fVar.i(61, bu4Var.mo75928xcd1e8d8());
                this.H1.mo75956x3d5d1f78(fVar);
            }
            fVar.e(62, this.I1);
            java.lang.String str13 = this.J1;
            if (str13 != null) {
                fVar.j(63, str13);
            }
            fVar.e(64, this.K1);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str14 = this.f460066d;
            int j17 = str14 != null ? b36.f.j(1, str14) + 0 : 0;
            java.lang.String str15 = this.f460067e;
            if (str15 != null) {
                j17 += b36.f.j(2, str15);
            }
            int e17 = j17 + b36.f.e(3, this.f460068f) + b36.f.e(4, this.f460069g) + b36.f.h(5, this.f460070h) + b36.f.h(6, this.f460071i) + b36.f.g(7, 8, linkedList3) + b36.f.e(8, this.f460074n) + b36.f.g(9, 1, linkedList2);
            java.lang.String str16 = this.f460076p;
            if (str16 != null) {
                e17 += b36.f.j(10, str16);
            }
            int e18 = e17 + b36.f.e(11, this.f460079q) + b36.f.e(12, this.f460080r) + b36.f.e(13, this.f460081s) + b36.f.e(14, this.f460082t) + b36.f.e(15, this.f460083u) + b36.f.e(16, this.f460084v) + b36.f.e(17, this.f460085w) + b36.f.e(18, this.f460086x);
            java.lang.String str17 = this.f460089y;
            if (str17 != null) {
                e18 += b36.f.j(19, str17);
            }
            java.lang.String str18 = this.f460092z;
            if (str18 != null) {
                e18 += b36.f.j(20, str18);
            }
            int e19 = e18 + b36.f.e(21, this.A) + b36.f.e(22, this.B) + b36.f.e(23, this.C) + b36.f.e(24, this.D) + b36.f.e(25, this.E) + b36.f.e(26, this.F) + b36.f.e(27, this.G) + b36.f.e(28, this.H) + b36.f.e(29, this.I) + b36.f.e(30, this.f460065J);
            java.lang.String str19 = this.K;
            if (str19 != null) {
                e19 += b36.f.j(31, str19);
            }
            java.lang.String str20 = this.L;
            if (str20 != null) {
                e19 += b36.f.j(32, str20);
            }
            java.lang.String str21 = this.M;
            if (str21 != null) {
                e19 += b36.f.j(33, str21);
            }
            int e27 = e19 + b36.f.e(34, this.N) + b36.f.e(35, this.P);
            java.lang.String str22 = this.Q;
            if (str22 != null) {
                e27 += b36.f.j(36, str22);
            }
            int e28 = e27 + b36.f.e(37, this.R) + b36.f.e(38, this.S);
            java.lang.String str23 = this.T;
            if (str23 != null) {
                e28 += b36.f.j(39, str23);
            }
            java.lang.String str24 = this.U;
            if (str24 != null) {
                e28 += b36.f.j(40, str24);
            }
            int e29 = e28 + b36.f.e(41, this.V) + b36.f.e(42, this.W);
            java.lang.String str25 = this.X;
            if (str25 != null) {
                e29 += b36.f.j(43, str25);
            }
            int e37 = e29 + b36.f.e(44, this.Y) + b36.f.e(45, this.Z) + b36.f.e(46, this.f460077p0) + b36.f.e(47, this.f460087x0) + b36.f.e(48, this.f460090y0) + b36.f.e(49, this.f460072l1);
            r45.ah5 ah5Var2 = this.f460078p1;
            if (ah5Var2 != null) {
                e37 += b36.f.i(50, ah5Var2.mo75928xcd1e8d8());
            }
            int e38 = e37 + b36.f.e(51, this.f460088x1) + b36.f.e(52, this.f460091y1) + b36.f.g(53, 2, linkedList) + b36.f.e(54, this.A1) + b36.f.e(55, this.B1) + b36.f.e(56, this.C1) + b36.f.e(57, this.D1) + b36.f.e(58, this.E1) + b36.f.e(59, this.F1);
            r45.o30 o30Var2 = this.G1;
            if (o30Var2 != null) {
                e38 += b36.f.i(60, o30Var2.mo75928xcd1e8d8());
            }
            r45.bu4 bu4Var2 = this.H1;
            if (bu4Var2 != null) {
                e38 += b36.f.i(61, bu4Var2.mo75928xcd1e8d8());
            }
            int e39 = e38 + b36.f.e(62, this.I1);
            java.lang.String str26 = this.J1;
            if (str26 != null) {
                e39 += b36.f.j(63, str26);
            }
            return e39 + b36.f.e(64, this.K1);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
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
        r45.ka4 ka4Var = (r45.ka4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ka4Var.f460066d = aVar2.k(intValue);
                return 0;
            case 2:
                ka4Var.f460067e = aVar2.k(intValue);
                return 0;
            case 3:
                ka4Var.f460068f = aVar2.g(intValue);
                return 0;
            case 4:
                ka4Var.f460069g = aVar2.g(intValue);
                return 0;
            case 5:
                ka4Var.f460070h = aVar2.i(intValue);
                return 0;
            case 6:
                ka4Var.f460071i = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.gv gvVar = new r45.gv();
                    if (bArr2 != null && bArr2.length > 0) {
                        gvVar.mo11468x92b714fd(bArr2);
                    }
                    ka4Var.f460073m.add(gvVar);
                }
                return 0;
            case 8:
                ka4Var.f460074n = aVar2.g(intValue);
                return 0;
            case 9:
                ka4Var.f460075o.add(aVar2.k(intValue));
                return 0;
            case 10:
                ka4Var.f460076p = aVar2.k(intValue);
                return 0;
            case 11:
                ka4Var.f460079q = aVar2.g(intValue);
                return 0;
            case 12:
                ka4Var.f460080r = aVar2.g(intValue);
                return 0;
            case 13:
                ka4Var.f460081s = aVar2.g(intValue);
                return 0;
            case 14:
                ka4Var.f460082t = aVar2.g(intValue);
                return 0;
            case 15:
                ka4Var.f460083u = aVar2.g(intValue);
                return 0;
            case 16:
                ka4Var.f460084v = aVar2.g(intValue);
                return 0;
            case 17:
                ka4Var.f460085w = aVar2.g(intValue);
                return 0;
            case 18:
                ka4Var.f460086x = aVar2.g(intValue);
                return 0;
            case 19:
                ka4Var.f460089y = aVar2.k(intValue);
                return 0;
            case 20:
                ka4Var.f460092z = aVar2.k(intValue);
                return 0;
            case 21:
                ka4Var.A = aVar2.g(intValue);
                return 0;
            case 22:
                ka4Var.B = aVar2.g(intValue);
                return 0;
            case 23:
                ka4Var.C = aVar2.g(intValue);
                return 0;
            case 24:
                ka4Var.D = aVar2.g(intValue);
                return 0;
            case 25:
                ka4Var.E = aVar2.g(intValue);
                return 0;
            case 26:
                ka4Var.F = aVar2.g(intValue);
                return 0;
            case 27:
                ka4Var.G = aVar2.g(intValue);
                return 0;
            case 28:
                ka4Var.H = aVar2.g(intValue);
                return 0;
            case 29:
                ka4Var.I = aVar2.g(intValue);
                return 0;
            case 30:
                ka4Var.f460065J = aVar2.g(intValue);
                return 0;
            case 31:
                ka4Var.K = aVar2.k(intValue);
                return 0;
            case 32:
                ka4Var.L = aVar2.k(intValue);
                return 0;
            case 33:
                ka4Var.M = aVar2.k(intValue);
                return 0;
            case 34:
                ka4Var.N = aVar2.g(intValue);
                return 0;
            case 35:
                ka4Var.P = aVar2.g(intValue);
                return 0;
            case 36:
                ka4Var.Q = aVar2.k(intValue);
                return 0;
            case 37:
                ka4Var.R = aVar2.g(intValue);
                return 0;
            case 38:
                ka4Var.S = aVar2.g(intValue);
                return 0;
            case 39:
                ka4Var.T = aVar2.k(intValue);
                return 0;
            case 40:
                ka4Var.U = aVar2.k(intValue);
                return 0;
            case 41:
                ka4Var.V = aVar2.g(intValue);
                return 0;
            case 42:
                ka4Var.W = aVar2.g(intValue);
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                ka4Var.X = aVar2.k(intValue);
                return 0;
            case 44:
                ka4Var.Y = aVar2.g(intValue);
                return 0;
            case 45:
                ka4Var.Z = aVar2.g(intValue);
                return 0;
            case 46:
                ka4Var.f460077p0 = aVar2.g(intValue);
                return 0;
            case 47:
                ka4Var.f460087x0 = aVar2.g(intValue);
                return 0;
            case 48:
                ka4Var.f460090y0 = aVar2.g(intValue);
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                ka4Var.f460072l1 = aVar2.g(intValue);
                return 0;
            case 50:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.ah5 ah5Var3 = new r45.ah5();
                    if (bArr3 != null && bArr3.length > 0) {
                        ah5Var3.mo11468x92b714fd(bArr3);
                    }
                    ka4Var.f460078p1 = ah5Var3;
                }
                return 0;
            case 51:
                ka4Var.f460088x1 = aVar2.g(intValue);
                return 0;
            case 52:
                ka4Var.f460091y1 = aVar2.g(intValue);
                return 0;
            case 53:
                ka4Var.f460093z1.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 54:
                ka4Var.A1 = aVar2.g(intValue);
                return 0;
            case 55:
                ka4Var.B1 = aVar2.g(intValue);
                return 0;
            case 56:
                ka4Var.C1 = aVar2.g(intValue);
                return 0;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1.f34664x366c91de /* 57 */:
                ka4Var.D1 = aVar2.g(intValue);
                return 0;
            case 58:
                ka4Var.E1 = aVar2.g(intValue);
                return 0;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k9.f34376x366c91de /* 59 */:
                ka4Var.F1 = aVar2.g(intValue);
                return 0;
            case 60:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.o30 o30Var3 = new r45.o30();
                    if (bArr4 != null && bArr4.length > 0) {
                        o30Var3.mo11468x92b714fd(bArr4);
                    }
                    ka4Var.G1 = o30Var3;
                }
                return 0;
            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.bu4 bu4Var3 = new r45.bu4();
                    if (bArr5 != null && bArr5.length > 0) {
                        bu4Var3.mo11468x92b714fd(bArr5);
                    }
                    ka4Var.H1 = bu4Var3;
                }
                return 0;
            case 62:
                ka4Var.I1 = aVar2.g(intValue);
                return 0;
            case 63:
                ka4Var.J1 = aVar2.k(intValue);
                return 0;
            case 64:
                ka4Var.K1 = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
