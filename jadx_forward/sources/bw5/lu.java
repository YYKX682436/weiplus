package bw5;

/* loaded from: classes2.dex */
public class lu extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public double f111496J;
    public int K;
    public boolean L;
    public boolean M;
    public int N;
    public int P;
    public int Q;
    public boolean R;
    public bw5.e20 S;
    public boolean T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: d, reason: collision with root package name */
    public int f111497d;

    /* renamed from: e, reason: collision with root package name */
    public int f111498e;

    /* renamed from: f, reason: collision with root package name */
    public int f111499f;

    /* renamed from: g, reason: collision with root package name */
    public float f111500g;

    /* renamed from: h, reason: collision with root package name */
    public int f111501h;

    /* renamed from: i, reason: collision with root package name */
    public int f111502i;

    /* renamed from: m, reason: collision with root package name */
    public int f111504m;

    /* renamed from: n, reason: collision with root package name */
    public int f111505n;

    /* renamed from: o, reason: collision with root package name */
    public float f111506o;

    /* renamed from: p, reason: collision with root package name */
    public int f111507p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f111508p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f111509p1;

    /* renamed from: q, reason: collision with root package name */
    public int f111510q;

    /* renamed from: r, reason: collision with root package name */
    public int f111511r;

    /* renamed from: s, reason: collision with root package name */
    public int f111512s;

    /* renamed from: t, reason: collision with root package name */
    public int f111513t;

    /* renamed from: u, reason: collision with root package name */
    public int f111514u;

    /* renamed from: v, reason: collision with root package name */
    public int f111515v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f111516w;

    /* renamed from: x, reason: collision with root package name */
    public int f111517x;

    /* renamed from: x0, reason: collision with root package name */
    public int f111518x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f111519x1;

    /* renamed from: y, reason: collision with root package name */
    public int f111520y;

    /* renamed from: y0, reason: collision with root package name */
    public int f111521y0;

    /* renamed from: z, reason: collision with root package name */
    public int f111523z;

    /* renamed from: l1, reason: collision with root package name */
    public final java.util.LinkedList f111503l1 = new java.util.LinkedList();

    /* renamed from: y1, reason: collision with root package name */
    public final boolean[] f111522y1 = new boolean[58];

    static {
        new bw5.lu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lu mo11468x92b714fd(byte[] bArr) {
        return (bw5.lu) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lu)) {
            return false;
        }
        bw5.lu luVar = (bw5.lu) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f111497d), java.lang.Integer.valueOf(luVar.f111497d)) && n51.f.a(java.lang.Integer.valueOf(this.f111498e), java.lang.Integer.valueOf(luVar.f111498e)) && n51.f.a(java.lang.Integer.valueOf(this.f111499f), java.lang.Integer.valueOf(luVar.f111499f)) && n51.f.a(java.lang.Float.valueOf(this.f111500g), java.lang.Float.valueOf(luVar.f111500g)) && n51.f.a(java.lang.Integer.valueOf(this.f111501h), java.lang.Integer.valueOf(luVar.f111501h)) && n51.f.a(java.lang.Integer.valueOf(this.f111502i), java.lang.Integer.valueOf(luVar.f111502i)) && n51.f.a(java.lang.Integer.valueOf(this.f111504m), java.lang.Integer.valueOf(luVar.f111504m)) && n51.f.a(java.lang.Integer.valueOf(this.f111505n), java.lang.Integer.valueOf(luVar.f111505n)) && n51.f.a(java.lang.Float.valueOf(this.f111506o), java.lang.Float.valueOf(luVar.f111506o)) && n51.f.a(java.lang.Integer.valueOf(this.f111507p), java.lang.Integer.valueOf(luVar.f111507p)) && n51.f.a(java.lang.Integer.valueOf(this.f111510q), java.lang.Integer.valueOf(luVar.f111510q)) && n51.f.a(java.lang.Integer.valueOf(this.f111511r), java.lang.Integer.valueOf(luVar.f111511r)) && n51.f.a(java.lang.Integer.valueOf(this.f111512s), java.lang.Integer.valueOf(luVar.f111512s)) && n51.f.a(java.lang.Integer.valueOf(this.f111513t), java.lang.Integer.valueOf(luVar.f111513t)) && n51.f.a(java.lang.Integer.valueOf(this.f111514u), java.lang.Integer.valueOf(luVar.f111514u)) && n51.f.a(java.lang.Integer.valueOf(this.f111515v), java.lang.Integer.valueOf(luVar.f111515v)) && n51.f.a(java.lang.Boolean.valueOf(this.f111516w), java.lang.Boolean.valueOf(luVar.f111516w)) && n51.f.a(java.lang.Integer.valueOf(this.f111517x), java.lang.Integer.valueOf(luVar.f111517x)) && n51.f.a(java.lang.Integer.valueOf(this.f111520y), java.lang.Integer.valueOf(luVar.f111520y)) && n51.f.a(java.lang.Integer.valueOf(this.f111523z), java.lang.Integer.valueOf(luVar.f111523z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(luVar.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(luVar.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(luVar.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(luVar.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(luVar.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(luVar.F)) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(luVar.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(luVar.H)) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(luVar.I)) && n51.f.a(java.lang.Double.valueOf(this.f111496J), java.lang.Double.valueOf(luVar.f111496J)) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(luVar.K)) && n51.f.a(java.lang.Boolean.valueOf(this.L), java.lang.Boolean.valueOf(luVar.L)) && n51.f.a(java.lang.Boolean.valueOf(this.M), java.lang.Boolean.valueOf(luVar.M)) && n51.f.a(java.lang.Integer.valueOf(this.N), java.lang.Integer.valueOf(luVar.N)) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(luVar.P)) && n51.f.a(java.lang.Integer.valueOf(this.Q), java.lang.Integer.valueOf(luVar.Q)) && n51.f.a(java.lang.Boolean.valueOf(this.R), java.lang.Boolean.valueOf(luVar.R)) && n51.f.a(this.S, luVar.S) && n51.f.a(java.lang.Boolean.valueOf(this.T), java.lang.Boolean.valueOf(luVar.T)) && n51.f.a(java.lang.Integer.valueOf(this.U), java.lang.Integer.valueOf(luVar.U)) && n51.f.a(java.lang.Integer.valueOf(this.V), java.lang.Integer.valueOf(luVar.V)) && n51.f.a(java.lang.Integer.valueOf(this.W), java.lang.Integer.valueOf(luVar.W)) && n51.f.a(java.lang.Integer.valueOf(this.X), java.lang.Integer.valueOf(luVar.X)) && n51.f.a(java.lang.Integer.valueOf(this.Y), java.lang.Integer.valueOf(luVar.Y)) && n51.f.a(java.lang.Integer.valueOf(this.Z), java.lang.Integer.valueOf(luVar.Z)) && n51.f.a(java.lang.Boolean.valueOf(this.f111508p0), java.lang.Boolean.valueOf(luVar.f111508p0)) && n51.f.a(java.lang.Integer.valueOf(this.f111518x0), java.lang.Integer.valueOf(luVar.f111518x0)) && n51.f.a(java.lang.Integer.valueOf(this.f111521y0), java.lang.Integer.valueOf(luVar.f111521y0)) && n51.f.a(this.f111503l1, luVar.f111503l1) && n51.f.a(java.lang.Boolean.valueOf(this.f111509p1), java.lang.Boolean.valueOf(luVar.f111509p1)) && n51.f.a(java.lang.Integer.valueOf(this.f111519x1), java.lang.Integer.valueOf(luVar.f111519x1));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.lu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111522y1;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f111497d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111498e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f111499f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f111500g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f111501h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f111502i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f111504m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f111505n);
            }
            if (zArr[9]) {
                fVar.d(9, this.f111506o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f111507p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f111510q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f111511r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f111512s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f111513t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f111514u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f111515v);
            }
            if (zArr[17]) {
                fVar.a(17, this.f111516w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f111517x);
            }
            if (zArr[19]) {
                fVar.e(19, this.f111520y);
            }
            if (zArr[20]) {
                fVar.e(20, this.f111523z);
            }
            if (zArr[21]) {
                fVar.e(21, this.A);
            }
            if (zArr[22]) {
                fVar.e(22, this.B);
            }
            if (zArr[23]) {
                fVar.e(23, this.C);
            }
            if (zArr[24]) {
                fVar.e(24, this.D);
            }
            if (zArr[25]) {
                fVar.e(25, this.E);
            }
            if (zArr[26]) {
                fVar.e(26, this.F);
            }
            if (zArr[27]) {
                fVar.e(27, this.G);
            }
            if (zArr[28]) {
                fVar.e(28, this.H);
            }
            if (zArr[29]) {
                fVar.e(29, this.I);
            }
            if (zArr[30]) {
                fVar.c(30, this.f111496J);
            }
            if (zArr[31]) {
                fVar.e(31, this.K);
            }
            if (zArr[32]) {
                fVar.a(32, this.L);
            }
            if (zArr[33]) {
                fVar.a(33, this.M);
            }
            if (zArr[34]) {
                fVar.e(34, this.N);
            }
            if (zArr[35]) {
                fVar.f(35, this.P);
            }
            if (zArr[36]) {
                fVar.f(36, this.Q);
            }
            if (zArr[37]) {
                fVar.a(37, this.R);
            }
            bw5.e20 e20Var = this.S;
            if (e20Var != null && zArr[39]) {
                fVar.i(39, e20Var.mo75928xcd1e8d8());
                this.S.mo75956x3d5d1f78(fVar);
            }
            if (zArr[41]) {
                fVar.a(41, this.T);
            }
            if (zArr[42]) {
                fVar.f(42, this.U);
            }
            if (zArr[43]) {
                fVar.f(43, this.V);
            }
            if (zArr[44]) {
                fVar.f(44, this.W);
            }
            if (zArr[45]) {
                fVar.f(45, this.X);
            }
            if (zArr[46]) {
                fVar.f(46, this.Y);
            }
            if (zArr[47]) {
                fVar.f(47, this.Z);
            }
            if (zArr[49]) {
                fVar.a(49, this.f111508p0);
            }
            if (zArr[50]) {
                fVar.f(50, this.f111518x0);
            }
            if (zArr[52]) {
                fVar.f(52, this.f111521y0);
            }
            fVar.g(53, 8, this.f111503l1);
            if (zArr[56]) {
                fVar.a(56, this.f111509p1);
            }
            if (zArr[57]) {
                fVar.f(57, this.f111519x1);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f111497d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f111498e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f111499f);
            }
            if (zArr[4]) {
                e17 += b36.f.d(4, this.f111500g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f111501h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f111502i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f111504m);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f111505n);
            }
            if (zArr[9]) {
                e17 += b36.f.d(9, this.f111506o);
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f111507p);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f111510q);
            }
            if (zArr[12]) {
                e17 += b36.f.e(12, this.f111511r);
            }
            if (zArr[13]) {
                e17 += b36.f.e(13, this.f111512s);
            }
            if (zArr[14]) {
                e17 += b36.f.e(14, this.f111513t);
            }
            if (zArr[15]) {
                e17 += b36.f.e(15, this.f111514u);
            }
            if (zArr[16]) {
                e17 += b36.f.e(16, this.f111515v);
            }
            if (zArr[17]) {
                e17 += b36.f.a(17, this.f111516w);
            }
            if (zArr[18]) {
                e17 += b36.f.e(18, this.f111517x);
            }
            if (zArr[19]) {
                e17 += b36.f.e(19, this.f111520y);
            }
            if (zArr[20]) {
                e17 += b36.f.e(20, this.f111523z);
            }
            if (zArr[21]) {
                e17 += b36.f.e(21, this.A);
            }
            if (zArr[22]) {
                e17 += b36.f.e(22, this.B);
            }
            if (zArr[23]) {
                e17 += b36.f.e(23, this.C);
            }
            if (zArr[24]) {
                e17 += b36.f.e(24, this.D);
            }
            if (zArr[25]) {
                e17 += b36.f.e(25, this.E);
            }
            if (zArr[26]) {
                e17 += b36.f.e(26, this.F);
            }
            if (zArr[27]) {
                e17 += b36.f.e(27, this.G);
            }
            if (zArr[28]) {
                e17 += b36.f.e(28, this.H);
            }
            if (zArr[29]) {
                e17 += b36.f.e(29, this.I);
            }
            if (zArr[30]) {
                e17 += b36.f.c(30, this.f111496J);
            }
            if (zArr[31]) {
                e17 += b36.f.e(31, this.K);
            }
            if (zArr[32]) {
                e17 += b36.f.a(32, this.L);
            }
            if (zArr[33]) {
                e17 += b36.f.a(33, this.M);
            }
            if (zArr[34]) {
                e17 += b36.f.e(34, this.N);
            }
            if (zArr[35]) {
                e17 += b36.f.f(35, this.P);
            }
            if (zArr[36]) {
                e17 += b36.f.f(36, this.Q);
            }
            if (zArr[37]) {
                e17 += b36.f.a(37, this.R);
            }
            bw5.e20 e20Var2 = this.S;
            if (e20Var2 != null && zArr[39]) {
                e17 += b36.f.i(39, e20Var2.mo75928xcd1e8d8());
            }
            if (zArr[41]) {
                e17 += b36.f.a(41, this.T);
            }
            if (zArr[42]) {
                e17 += b36.f.f(42, this.U);
            }
            if (zArr[43]) {
                e17 += b36.f.f(43, this.V);
            }
            if (zArr[44]) {
                e17 += b36.f.f(44, this.W);
            }
            if (zArr[45]) {
                e17 += b36.f.f(45, this.X);
            }
            if (zArr[46]) {
                e17 += b36.f.f(46, this.Y);
            }
            if (zArr[47]) {
                e17 += b36.f.f(47, this.Z);
            }
            if (zArr[49]) {
                e17 += b36.f.a(49, this.f111508p0);
            }
            if (zArr[50]) {
                e17 += b36.f.f(50, this.f111518x0);
            }
            if (zArr[52]) {
                e17 += b36.f.f(52, this.f111521y0);
            }
            int g17 = e17 + b36.f.g(53, 8, this.f111503l1);
            if (zArr[56]) {
                g17 += b36.f.a(56, this.f111509p1);
            }
            return zArr[57] ? g17 + b36.f.f(57, this.f111519x1) : g17;
        }
        if (i17 == 2) {
            this.f111503l1.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f111497d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111498e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111499f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111500g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111501h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111502i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f111504m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f111505n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f111506o = aVar2.f(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f111507p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f111510q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f111511r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f111512s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f111513t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f111514u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f111515v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f111516w = aVar2.c(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f111517x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f111520y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f111523z = aVar2.g(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.g(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.g(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.g(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.g(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.g(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.G = aVar2.g(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.H = aVar2.g(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.I = aVar2.g(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                this.f111496J = aVar2.e(intValue);
                zArr[30] = true;
                return 0;
            case 31:
                this.K = aVar2.g(intValue);
                zArr[31] = true;
                return 0;
            case 32:
                this.L = aVar2.c(intValue);
                zArr[32] = true;
                return 0;
            case 33:
                this.M = aVar2.c(intValue);
                zArr[33] = true;
                return 0;
            case 34:
                this.N = aVar2.g(intValue);
                zArr[34] = true;
                return 0;
            case 35:
                this.P = aVar2.g(intValue);
                zArr[35] = true;
                return 0;
            case 36:
                this.Q = aVar2.g(intValue);
                zArr[36] = true;
                return 0;
            case 37:
                this.R = aVar2.c(intValue);
                zArr[37] = true;
                return 0;
            case 38:
            case 40:
            case 48:
            case 51:
            case 54:
            case 55:
            default:
                return -1;
            case 39:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.e20 e20Var3 = new bw5.e20();
                    if (bArr != null && bArr.length > 0) {
                        e20Var3.mo11468x92b714fd(bArr);
                    }
                    this.S = e20Var3;
                }
                zArr[39] = true;
                return 0;
            case 41:
                this.T = aVar2.c(intValue);
                zArr[41] = true;
                return 0;
            case 42:
                this.U = aVar2.g(intValue);
                zArr[42] = true;
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                this.V = aVar2.g(intValue);
                zArr[43] = true;
                return 0;
            case 44:
                this.W = aVar2.g(intValue);
                zArr[44] = true;
                return 0;
            case 45:
                this.X = aVar2.g(intValue);
                zArr[45] = true;
                return 0;
            case 46:
                this.Y = aVar2.g(intValue);
                zArr[46] = true;
                return 0;
            case 47:
                this.Z = aVar2.g(intValue);
                zArr[47] = true;
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                this.f111508p0 = aVar2.c(intValue);
                zArr[49] = true;
                return 0;
            case 50:
                this.f111518x0 = aVar2.g(intValue);
                zArr[50] = true;
                return 0;
            case 52:
                this.f111521y0 = aVar2.g(intValue);
                zArr[52] = true;
                return 0;
            case 53:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.rp rpVar = new bw5.rp();
                    if (bArr2 != null && bArr2.length > 0) {
                        rpVar.mo11468x92b714fd(bArr2);
                    }
                    this.f111503l1.add(rpVar);
                }
                zArr[53] = true;
                return 0;
            case 56:
                this.f111509p1 = aVar2.c(intValue);
                zArr[56] = true;
                return 0;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1.f34664x366c91de /* 57 */:
                this.f111519x1 = aVar2.g(intValue);
                zArr[57] = true;
                return 0;
        }
    }
}
