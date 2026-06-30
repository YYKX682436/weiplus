package r45;

/* loaded from: classes14.dex */
public class e83 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
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
    public int G1;
    public int H;
    public int H1;
    public int I;
    public int I1;

    /* renamed from: J, reason: collision with root package name */
    public int f454628J;
    public int J1;
    public int K;
    public int K1;
    public int L;
    public int M1;
    public int N1;
    public int O1;
    public int P;
    public int P1;
    public int Q1;
    public int R1;
    public int S1;
    public int T1;
    public int U1;
    public int V1;

    /* renamed from: d, reason: collision with root package name */
    public int f454629d;

    /* renamed from: e, reason: collision with root package name */
    public int f454630e;

    /* renamed from: f, reason: collision with root package name */
    public int f454631f;

    /* renamed from: g, reason: collision with root package name */
    public int f454632g;

    /* renamed from: h, reason: collision with root package name */
    public int f454633h;

    /* renamed from: i, reason: collision with root package name */
    public int f454634i;

    /* renamed from: r, reason: collision with root package name */
    public int f454643r;

    /* renamed from: t, reason: collision with root package name */
    public int f454645t;

    /* renamed from: u, reason: collision with root package name */
    public int f454646u;

    /* renamed from: v, reason: collision with root package name */
    public int f454647v;

    /* renamed from: y1, reason: collision with root package name */
    public int f454654y1;

    /* renamed from: m, reason: collision with root package name */
    public int f454636m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f454637n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f454638o = 2;

    /* renamed from: p, reason: collision with root package name */
    public int f454639p = 2;

    /* renamed from: q, reason: collision with root package name */
    public int f454642q = 2;

    /* renamed from: s, reason: collision with root package name */
    public int f454644s = 20;

    /* renamed from: w, reason: collision with root package name */
    public int f454648w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f454649x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f454652y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f454655z = 0;
    public int M = 200;
    public int N = com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a;
    public int Q = 2500;
    public int R = 2500;
    public int S = 200000;
    public int T = 0;
    public int U = 50;
    public int V = com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a;
    public int W = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.n0.f34055x366c91de;
    public int X = 750;
    public int Y = 4000;
    public int Z = 2000;

    /* renamed from: p0, reason: collision with root package name */
    public int f454640p0 = 1500;

    /* renamed from: x0, reason: collision with root package name */
    public int f454650x0 = 1200;

    /* renamed from: y0, reason: collision with root package name */
    public int f454653y0 = 25000;

    /* renamed from: l1, reason: collision with root package name */
    public int f454635l1 = 50000;

    /* renamed from: p1, reason: collision with root package name */
    public int f454641p1 = 1024;

    /* renamed from: x1, reason: collision with root package name */
    public int f454651x1 = 8000;

    /* renamed from: z1, reason: collision with root package name */
    public int f454656z1 = 2;
    public int A1 = 15;
    public int L1 = 8000;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e83)) {
            return false;
        }
        r45.e83 e83Var = (r45.e83) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454629d), java.lang.Integer.valueOf(e83Var.f454629d)) && n51.f.a(java.lang.Integer.valueOf(this.f454630e), java.lang.Integer.valueOf(e83Var.f454630e)) && n51.f.a(java.lang.Integer.valueOf(this.f454631f), java.lang.Integer.valueOf(e83Var.f454631f)) && n51.f.a(java.lang.Integer.valueOf(this.f454632g), java.lang.Integer.valueOf(e83Var.f454632g)) && n51.f.a(java.lang.Integer.valueOf(this.f454633h), java.lang.Integer.valueOf(e83Var.f454633h)) && n51.f.a(java.lang.Integer.valueOf(this.f454634i), java.lang.Integer.valueOf(e83Var.f454634i)) && n51.f.a(java.lang.Integer.valueOf(this.f454636m), java.lang.Integer.valueOf(e83Var.f454636m)) && n51.f.a(java.lang.Integer.valueOf(this.f454637n), java.lang.Integer.valueOf(e83Var.f454637n)) && n51.f.a(java.lang.Integer.valueOf(this.f454638o), java.lang.Integer.valueOf(e83Var.f454638o)) && n51.f.a(java.lang.Integer.valueOf(this.f454639p), java.lang.Integer.valueOf(e83Var.f454639p)) && n51.f.a(java.lang.Integer.valueOf(this.f454642q), java.lang.Integer.valueOf(e83Var.f454642q)) && n51.f.a(java.lang.Integer.valueOf(this.f454643r), java.lang.Integer.valueOf(e83Var.f454643r)) && n51.f.a(java.lang.Integer.valueOf(this.f454644s), java.lang.Integer.valueOf(e83Var.f454644s)) && n51.f.a(java.lang.Integer.valueOf(this.f454645t), java.lang.Integer.valueOf(e83Var.f454645t)) && n51.f.a(java.lang.Integer.valueOf(this.f454646u), java.lang.Integer.valueOf(e83Var.f454646u)) && n51.f.a(java.lang.Integer.valueOf(this.f454647v), java.lang.Integer.valueOf(e83Var.f454647v)) && n51.f.a(java.lang.Integer.valueOf(this.f454648w), java.lang.Integer.valueOf(e83Var.f454648w)) && n51.f.a(java.lang.Integer.valueOf(this.f454649x), java.lang.Integer.valueOf(e83Var.f454649x)) && n51.f.a(java.lang.Integer.valueOf(this.f454652y), java.lang.Integer.valueOf(e83Var.f454652y)) && n51.f.a(java.lang.Integer.valueOf(this.f454655z), java.lang.Integer.valueOf(e83Var.f454655z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(e83Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(e83Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(e83Var.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(e83Var.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(e83Var.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(e83Var.F)) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(e83Var.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(e83Var.H)) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(e83Var.I)) && n51.f.a(java.lang.Integer.valueOf(this.f454628J), java.lang.Integer.valueOf(e83Var.f454628J)) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(e83Var.K)) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(e83Var.L)) && n51.f.a(java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(e83Var.M)) && n51.f.a(java.lang.Integer.valueOf(this.N), java.lang.Integer.valueOf(e83Var.N)) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(e83Var.P)) && n51.f.a(java.lang.Integer.valueOf(this.Q), java.lang.Integer.valueOf(e83Var.Q)) && n51.f.a(java.lang.Integer.valueOf(this.R), java.lang.Integer.valueOf(e83Var.R)) && n51.f.a(java.lang.Integer.valueOf(this.S), java.lang.Integer.valueOf(e83Var.S)) && n51.f.a(java.lang.Integer.valueOf(this.T), java.lang.Integer.valueOf(e83Var.T)) && n51.f.a(java.lang.Integer.valueOf(this.U), java.lang.Integer.valueOf(e83Var.U)) && n51.f.a(java.lang.Integer.valueOf(this.V), java.lang.Integer.valueOf(e83Var.V)) && n51.f.a(java.lang.Integer.valueOf(this.W), java.lang.Integer.valueOf(e83Var.W)) && n51.f.a(java.lang.Integer.valueOf(this.X), java.lang.Integer.valueOf(e83Var.X)) && n51.f.a(java.lang.Integer.valueOf(this.Y), java.lang.Integer.valueOf(e83Var.Y)) && n51.f.a(java.lang.Integer.valueOf(this.Z), java.lang.Integer.valueOf(e83Var.Z)) && n51.f.a(java.lang.Integer.valueOf(this.f454640p0), java.lang.Integer.valueOf(e83Var.f454640p0)) && n51.f.a(java.lang.Integer.valueOf(this.f454650x0), java.lang.Integer.valueOf(e83Var.f454650x0)) && n51.f.a(java.lang.Integer.valueOf(this.f454653y0), java.lang.Integer.valueOf(e83Var.f454653y0)) && n51.f.a(java.lang.Integer.valueOf(this.f454635l1), java.lang.Integer.valueOf(e83Var.f454635l1)) && n51.f.a(java.lang.Integer.valueOf(this.f454641p1), java.lang.Integer.valueOf(e83Var.f454641p1)) && n51.f.a(java.lang.Integer.valueOf(this.f454651x1), java.lang.Integer.valueOf(e83Var.f454651x1)) && n51.f.a(java.lang.Integer.valueOf(this.f454654y1), java.lang.Integer.valueOf(e83Var.f454654y1)) && n51.f.a(java.lang.Integer.valueOf(this.f454656z1), java.lang.Integer.valueOf(e83Var.f454656z1)) && n51.f.a(java.lang.Integer.valueOf(this.A1), java.lang.Integer.valueOf(e83Var.A1)) && n51.f.a(java.lang.Integer.valueOf(this.B1), java.lang.Integer.valueOf(e83Var.B1)) && n51.f.a(java.lang.Integer.valueOf(this.C1), java.lang.Integer.valueOf(e83Var.C1)) && n51.f.a(java.lang.Integer.valueOf(this.D1), java.lang.Integer.valueOf(e83Var.D1)) && n51.f.a(java.lang.Integer.valueOf(this.E1), java.lang.Integer.valueOf(e83Var.E1)) && n51.f.a(java.lang.Integer.valueOf(this.F1), java.lang.Integer.valueOf(e83Var.F1)) && n51.f.a(java.lang.Integer.valueOf(this.G1), java.lang.Integer.valueOf(e83Var.G1)) && n51.f.a(java.lang.Integer.valueOf(this.H1), java.lang.Integer.valueOf(e83Var.H1)) && n51.f.a(java.lang.Integer.valueOf(this.I1), java.lang.Integer.valueOf(e83Var.I1)) && n51.f.a(java.lang.Integer.valueOf(this.J1), java.lang.Integer.valueOf(e83Var.J1)) && n51.f.a(java.lang.Integer.valueOf(this.K1), java.lang.Integer.valueOf(e83Var.K1)) && n51.f.a(java.lang.Integer.valueOf(this.L1), java.lang.Integer.valueOf(e83Var.L1)) && n51.f.a(java.lang.Integer.valueOf(this.M1), java.lang.Integer.valueOf(e83Var.M1)) && n51.f.a(java.lang.Integer.valueOf(this.N1), java.lang.Integer.valueOf(e83Var.N1)) && n51.f.a(java.lang.Integer.valueOf(this.O1), java.lang.Integer.valueOf(e83Var.O1)) && n51.f.a(java.lang.Integer.valueOf(this.P1), java.lang.Integer.valueOf(e83Var.P1)) && n51.f.a(java.lang.Integer.valueOf(this.Q1), java.lang.Integer.valueOf(e83Var.Q1)) && n51.f.a(java.lang.Integer.valueOf(this.R1), java.lang.Integer.valueOf(e83Var.R1)) && n51.f.a(java.lang.Integer.valueOf(this.S1), java.lang.Integer.valueOf(e83Var.S1)) && n51.f.a(java.lang.Integer.valueOf(this.T1), java.lang.Integer.valueOf(e83Var.T1)) && n51.f.a(java.lang.Integer.valueOf(this.U1), java.lang.Integer.valueOf(e83Var.U1)) && n51.f.a(java.lang.Integer.valueOf(this.V1), java.lang.Integer.valueOf(e83Var.V1));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454629d);
            fVar.e(2, this.f454630e);
            fVar.e(3, this.f454631f);
            fVar.e(4, this.f454632g);
            fVar.e(5, this.f454633h);
            fVar.e(6, this.f454634i);
            fVar.e(7, this.f454636m);
            fVar.e(8, this.f454637n);
            fVar.e(9, this.f454638o);
            fVar.e(10, this.f454639p);
            fVar.e(11, this.f454642q);
            fVar.e(12, this.f454643r);
            fVar.e(13, this.f454644s);
            fVar.e(14, this.f454645t);
            fVar.e(15, this.f454646u);
            fVar.e(16, this.f454647v);
            fVar.e(17, this.f454648w);
            fVar.e(18, this.f454649x);
            fVar.e(19, this.f454652y);
            fVar.e(20, this.f454655z);
            fVar.e(21, this.A);
            fVar.e(22, this.B);
            fVar.e(23, this.C);
            fVar.e(24, this.D);
            fVar.e(25, this.E);
            fVar.e(26, this.F);
            fVar.e(27, this.G);
            fVar.e(28, this.H);
            fVar.e(29, this.I);
            fVar.e(30, this.f454628J);
            fVar.e(31, this.K);
            fVar.e(32, this.L);
            fVar.e(33, this.M);
            fVar.e(34, this.N);
            fVar.e(35, this.P);
            fVar.e(36, this.Q);
            fVar.e(37, this.R);
            fVar.e(38, this.S);
            fVar.e(39, this.T);
            fVar.e(40, this.U);
            fVar.e(41, this.V);
            fVar.e(42, this.W);
            fVar.e(43, this.X);
            fVar.e(44, this.Y);
            fVar.e(45, this.Z);
            fVar.e(46, this.f454640p0);
            fVar.e(47, this.f454650x0);
            fVar.e(48, this.f454653y0);
            fVar.e(49, this.f454635l1);
            fVar.e(50, this.f454641p1);
            fVar.e(51, this.f454651x1);
            fVar.e(52, this.f454654y1);
            fVar.e(53, this.f454656z1);
            fVar.e(54, this.A1);
            fVar.e(55, this.B1);
            fVar.e(56, this.C1);
            fVar.e(57, this.D1);
            fVar.e(58, this.E1);
            fVar.e(59, this.F1);
            fVar.e(60, this.G1);
            fVar.e(61, this.H1);
            fVar.e(62, this.I1);
            fVar.e(63, this.J1);
            fVar.e(64, this.K1);
            fVar.e(65, this.L1);
            fVar.e(66, this.M1);
            fVar.e(67, this.N1);
            fVar.e(68, this.O1);
            fVar.e(76, this.P1);
            fVar.e(77, this.Q1);
            fVar.e(87, this.R1);
            fVar.e(88, this.S1);
            fVar.e(89, this.T1);
            fVar.e(90, this.U1);
            fVar.e(99, this.V1);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f454629d) + 0 + b36.f.e(2, this.f454630e) + b36.f.e(3, this.f454631f) + b36.f.e(4, this.f454632g) + b36.f.e(5, this.f454633h) + b36.f.e(6, this.f454634i) + b36.f.e(7, this.f454636m) + b36.f.e(8, this.f454637n) + b36.f.e(9, this.f454638o) + b36.f.e(10, this.f454639p) + b36.f.e(11, this.f454642q) + b36.f.e(12, this.f454643r) + b36.f.e(13, this.f454644s) + b36.f.e(14, this.f454645t) + b36.f.e(15, this.f454646u) + b36.f.e(16, this.f454647v) + b36.f.e(17, this.f454648w) + b36.f.e(18, this.f454649x) + b36.f.e(19, this.f454652y) + b36.f.e(20, this.f454655z) + b36.f.e(21, this.A) + b36.f.e(22, this.B) + b36.f.e(23, this.C) + b36.f.e(24, this.D) + b36.f.e(25, this.E) + b36.f.e(26, this.F) + b36.f.e(27, this.G) + b36.f.e(28, this.H) + b36.f.e(29, this.I) + b36.f.e(30, this.f454628J) + b36.f.e(31, this.K) + b36.f.e(32, this.L) + b36.f.e(33, this.M) + b36.f.e(34, this.N) + b36.f.e(35, this.P) + b36.f.e(36, this.Q) + b36.f.e(37, this.R) + b36.f.e(38, this.S) + b36.f.e(39, this.T) + b36.f.e(40, this.U) + b36.f.e(41, this.V) + b36.f.e(42, this.W) + b36.f.e(43, this.X) + b36.f.e(44, this.Y) + b36.f.e(45, this.Z) + b36.f.e(46, this.f454640p0) + b36.f.e(47, this.f454650x0) + b36.f.e(48, this.f454653y0) + b36.f.e(49, this.f454635l1) + b36.f.e(50, this.f454641p1) + b36.f.e(51, this.f454651x1) + b36.f.e(52, this.f454654y1) + b36.f.e(53, this.f454656z1) + b36.f.e(54, this.A1) + b36.f.e(55, this.B1) + b36.f.e(56, this.C1) + b36.f.e(57, this.D1) + b36.f.e(58, this.E1) + b36.f.e(59, this.F1) + b36.f.e(60, this.G1) + b36.f.e(61, this.H1) + b36.f.e(62, this.I1) + b36.f.e(63, this.J1) + b36.f.e(64, this.K1) + b36.f.e(65, this.L1) + b36.f.e(66, this.M1) + b36.f.e(67, this.N1) + b36.f.e(68, this.O1) + b36.f.e(76, this.P1) + b36.f.e(77, this.Q1) + b36.f.e(87, this.R1) + b36.f.e(88, this.S1) + b36.f.e(89, this.T1) + b36.f.e(90, this.U1) + b36.f.e(99, this.V1);
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
        r45.e83 e83Var = (r45.e83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 76) {
            e83Var.P1 = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 77) {
            e83Var.Q1 = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 99) {
            e83Var.V1 = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                e83Var.f454629d = aVar2.g(intValue);
                return 0;
            case 2:
                e83Var.f454630e = aVar2.g(intValue);
                return 0;
            case 3:
                e83Var.f454631f = aVar2.g(intValue);
                return 0;
            case 4:
                e83Var.f454632g = aVar2.g(intValue);
                return 0;
            case 5:
                e83Var.f454633h = aVar2.g(intValue);
                return 0;
            case 6:
                e83Var.f454634i = aVar2.g(intValue);
                return 0;
            case 7:
                e83Var.f454636m = aVar2.g(intValue);
                return 0;
            case 8:
                e83Var.f454637n = aVar2.g(intValue);
                return 0;
            case 9:
                e83Var.f454638o = aVar2.g(intValue);
                return 0;
            case 10:
                e83Var.f454639p = aVar2.g(intValue);
                return 0;
            case 11:
                e83Var.f454642q = aVar2.g(intValue);
                return 0;
            case 12:
                e83Var.f454643r = aVar2.g(intValue);
                return 0;
            case 13:
                e83Var.f454644s = aVar2.g(intValue);
                return 0;
            case 14:
                e83Var.f454645t = aVar2.g(intValue);
                return 0;
            case 15:
                e83Var.f454646u = aVar2.g(intValue);
                return 0;
            case 16:
                e83Var.f454647v = aVar2.g(intValue);
                return 0;
            case 17:
                e83Var.f454648w = aVar2.g(intValue);
                return 0;
            case 18:
                e83Var.f454649x = aVar2.g(intValue);
                return 0;
            case 19:
                e83Var.f454652y = aVar2.g(intValue);
                return 0;
            case 20:
                e83Var.f454655z = aVar2.g(intValue);
                return 0;
            case 21:
                e83Var.A = aVar2.g(intValue);
                return 0;
            case 22:
                e83Var.B = aVar2.g(intValue);
                return 0;
            case 23:
                e83Var.C = aVar2.g(intValue);
                return 0;
            case 24:
                e83Var.D = aVar2.g(intValue);
                return 0;
            case 25:
                e83Var.E = aVar2.g(intValue);
                return 0;
            case 26:
                e83Var.F = aVar2.g(intValue);
                return 0;
            case 27:
                e83Var.G = aVar2.g(intValue);
                return 0;
            case 28:
                e83Var.H = aVar2.g(intValue);
                return 0;
            case 29:
                e83Var.I = aVar2.g(intValue);
                return 0;
            case 30:
                e83Var.f454628J = aVar2.g(intValue);
                return 0;
            case 31:
                e83Var.K = aVar2.g(intValue);
                return 0;
            case 32:
                e83Var.L = aVar2.g(intValue);
                return 0;
            case 33:
                e83Var.M = aVar2.g(intValue);
                return 0;
            case 34:
                e83Var.N = aVar2.g(intValue);
                return 0;
            case 35:
                e83Var.P = aVar2.g(intValue);
                return 0;
            case 36:
                e83Var.Q = aVar2.g(intValue);
                return 0;
            case 37:
                e83Var.R = aVar2.g(intValue);
                return 0;
            case 38:
                e83Var.S = aVar2.g(intValue);
                return 0;
            case 39:
                e83Var.T = aVar2.g(intValue);
                return 0;
            case 40:
                e83Var.U = aVar2.g(intValue);
                return 0;
            case 41:
                e83Var.V = aVar2.g(intValue);
                return 0;
            case 42:
                e83Var.W = aVar2.g(intValue);
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                e83Var.X = aVar2.g(intValue);
                return 0;
            case 44:
                e83Var.Y = aVar2.g(intValue);
                return 0;
            case 45:
                e83Var.Z = aVar2.g(intValue);
                return 0;
            case 46:
                e83Var.f454640p0 = aVar2.g(intValue);
                return 0;
            case 47:
                e83Var.f454650x0 = aVar2.g(intValue);
                return 0;
            case 48:
                e83Var.f454653y0 = aVar2.g(intValue);
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                e83Var.f454635l1 = aVar2.g(intValue);
                return 0;
            case 50:
                e83Var.f454641p1 = aVar2.g(intValue);
                return 0;
            case 51:
                e83Var.f454651x1 = aVar2.g(intValue);
                return 0;
            case 52:
                e83Var.f454654y1 = aVar2.g(intValue);
                return 0;
            case 53:
                e83Var.f454656z1 = aVar2.g(intValue);
                return 0;
            case 54:
                e83Var.A1 = aVar2.g(intValue);
                return 0;
            case 55:
                e83Var.B1 = aVar2.g(intValue);
                return 0;
            case 56:
                e83Var.C1 = aVar2.g(intValue);
                return 0;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1.f34664x366c91de /* 57 */:
                e83Var.D1 = aVar2.g(intValue);
                return 0;
            case 58:
                e83Var.E1 = aVar2.g(intValue);
                return 0;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k9.f34376x366c91de /* 59 */:
                e83Var.F1 = aVar2.g(intValue);
                return 0;
            case 60:
                e83Var.G1 = aVar2.g(intValue);
                return 0;
            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                e83Var.H1 = aVar2.g(intValue);
                return 0;
            case 62:
                e83Var.I1 = aVar2.g(intValue);
                return 0;
            case 63:
                e83Var.J1 = aVar2.g(intValue);
                return 0;
            case 64:
                e83Var.K1 = aVar2.g(intValue);
                return 0;
            case 65:
                e83Var.L1 = aVar2.g(intValue);
                return 0;
            case 66:
                e83Var.M1 = aVar2.g(intValue);
                return 0;
            case 67:
                e83Var.N1 = aVar2.g(intValue);
                return 0;
            case 68:
                e83Var.O1 = aVar2.g(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 87:
                        e83Var.R1 = aVar2.g(intValue);
                        return 0;
                    case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51695x8a2568b7 /* 88 */:
                        e83Var.S1 = aVar2.g(intValue);
                        return 0;
                    case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45659xd352f050 /* 89 */:
                        e83Var.T1 = aVar2.g(intValue);
                        return 0;
                    case 90:
                        e83Var.U1 = aVar2.g(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
