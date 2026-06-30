package bw5;

/* loaded from: classes2.dex */
public class lu extends com.tencent.mm.protobuf.f {
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
    public double f29963J;
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
    public int f29964d;

    /* renamed from: e, reason: collision with root package name */
    public int f29965e;

    /* renamed from: f, reason: collision with root package name */
    public int f29966f;

    /* renamed from: g, reason: collision with root package name */
    public float f29967g;

    /* renamed from: h, reason: collision with root package name */
    public int f29968h;

    /* renamed from: i, reason: collision with root package name */
    public int f29969i;

    /* renamed from: m, reason: collision with root package name */
    public int f29971m;

    /* renamed from: n, reason: collision with root package name */
    public int f29972n;

    /* renamed from: o, reason: collision with root package name */
    public float f29973o;

    /* renamed from: p, reason: collision with root package name */
    public int f29974p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f29975p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f29976p1;

    /* renamed from: q, reason: collision with root package name */
    public int f29977q;

    /* renamed from: r, reason: collision with root package name */
    public int f29978r;

    /* renamed from: s, reason: collision with root package name */
    public int f29979s;

    /* renamed from: t, reason: collision with root package name */
    public int f29980t;

    /* renamed from: u, reason: collision with root package name */
    public int f29981u;

    /* renamed from: v, reason: collision with root package name */
    public int f29982v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f29983w;

    /* renamed from: x, reason: collision with root package name */
    public int f29984x;

    /* renamed from: x0, reason: collision with root package name */
    public int f29985x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f29986x1;

    /* renamed from: y, reason: collision with root package name */
    public int f29987y;

    /* renamed from: y0, reason: collision with root package name */
    public int f29988y0;

    /* renamed from: z, reason: collision with root package name */
    public int f29990z;

    /* renamed from: l1, reason: collision with root package name */
    public final java.util.LinkedList f29970l1 = new java.util.LinkedList();

    /* renamed from: y1, reason: collision with root package name */
    public final boolean[] f29989y1 = new boolean[58];

    static {
        new bw5.lu();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lu parseFrom(byte[] bArr) {
        return (bw5.lu) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lu)) {
            return false;
        }
        bw5.lu luVar = (bw5.lu) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f29964d), java.lang.Integer.valueOf(luVar.f29964d)) && n51.f.a(java.lang.Integer.valueOf(this.f29965e), java.lang.Integer.valueOf(luVar.f29965e)) && n51.f.a(java.lang.Integer.valueOf(this.f29966f), java.lang.Integer.valueOf(luVar.f29966f)) && n51.f.a(java.lang.Float.valueOf(this.f29967g), java.lang.Float.valueOf(luVar.f29967g)) && n51.f.a(java.lang.Integer.valueOf(this.f29968h), java.lang.Integer.valueOf(luVar.f29968h)) && n51.f.a(java.lang.Integer.valueOf(this.f29969i), java.lang.Integer.valueOf(luVar.f29969i)) && n51.f.a(java.lang.Integer.valueOf(this.f29971m), java.lang.Integer.valueOf(luVar.f29971m)) && n51.f.a(java.lang.Integer.valueOf(this.f29972n), java.lang.Integer.valueOf(luVar.f29972n)) && n51.f.a(java.lang.Float.valueOf(this.f29973o), java.lang.Float.valueOf(luVar.f29973o)) && n51.f.a(java.lang.Integer.valueOf(this.f29974p), java.lang.Integer.valueOf(luVar.f29974p)) && n51.f.a(java.lang.Integer.valueOf(this.f29977q), java.lang.Integer.valueOf(luVar.f29977q)) && n51.f.a(java.lang.Integer.valueOf(this.f29978r), java.lang.Integer.valueOf(luVar.f29978r)) && n51.f.a(java.lang.Integer.valueOf(this.f29979s), java.lang.Integer.valueOf(luVar.f29979s)) && n51.f.a(java.lang.Integer.valueOf(this.f29980t), java.lang.Integer.valueOf(luVar.f29980t)) && n51.f.a(java.lang.Integer.valueOf(this.f29981u), java.lang.Integer.valueOf(luVar.f29981u)) && n51.f.a(java.lang.Integer.valueOf(this.f29982v), java.lang.Integer.valueOf(luVar.f29982v)) && n51.f.a(java.lang.Boolean.valueOf(this.f29983w), java.lang.Boolean.valueOf(luVar.f29983w)) && n51.f.a(java.lang.Integer.valueOf(this.f29984x), java.lang.Integer.valueOf(luVar.f29984x)) && n51.f.a(java.lang.Integer.valueOf(this.f29987y), java.lang.Integer.valueOf(luVar.f29987y)) && n51.f.a(java.lang.Integer.valueOf(this.f29990z), java.lang.Integer.valueOf(luVar.f29990z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(luVar.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(luVar.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(luVar.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(luVar.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(luVar.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(luVar.F)) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(luVar.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(luVar.H)) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(luVar.I)) && n51.f.a(java.lang.Double.valueOf(this.f29963J), java.lang.Double.valueOf(luVar.f29963J)) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(luVar.K)) && n51.f.a(java.lang.Boolean.valueOf(this.L), java.lang.Boolean.valueOf(luVar.L)) && n51.f.a(java.lang.Boolean.valueOf(this.M), java.lang.Boolean.valueOf(luVar.M)) && n51.f.a(java.lang.Integer.valueOf(this.N), java.lang.Integer.valueOf(luVar.N)) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(luVar.P)) && n51.f.a(java.lang.Integer.valueOf(this.Q), java.lang.Integer.valueOf(luVar.Q)) && n51.f.a(java.lang.Boolean.valueOf(this.R), java.lang.Boolean.valueOf(luVar.R)) && n51.f.a(this.S, luVar.S) && n51.f.a(java.lang.Boolean.valueOf(this.T), java.lang.Boolean.valueOf(luVar.T)) && n51.f.a(java.lang.Integer.valueOf(this.U), java.lang.Integer.valueOf(luVar.U)) && n51.f.a(java.lang.Integer.valueOf(this.V), java.lang.Integer.valueOf(luVar.V)) && n51.f.a(java.lang.Integer.valueOf(this.W), java.lang.Integer.valueOf(luVar.W)) && n51.f.a(java.lang.Integer.valueOf(this.X), java.lang.Integer.valueOf(luVar.X)) && n51.f.a(java.lang.Integer.valueOf(this.Y), java.lang.Integer.valueOf(luVar.Y)) && n51.f.a(java.lang.Integer.valueOf(this.Z), java.lang.Integer.valueOf(luVar.Z)) && n51.f.a(java.lang.Boolean.valueOf(this.f29975p0), java.lang.Boolean.valueOf(luVar.f29975p0)) && n51.f.a(java.lang.Integer.valueOf(this.f29985x0), java.lang.Integer.valueOf(luVar.f29985x0)) && n51.f.a(java.lang.Integer.valueOf(this.f29988y0), java.lang.Integer.valueOf(luVar.f29988y0)) && n51.f.a(this.f29970l1, luVar.f29970l1) && n51.f.a(java.lang.Boolean.valueOf(this.f29976p1), java.lang.Boolean.valueOf(luVar.f29976p1)) && n51.f.a(java.lang.Integer.valueOf(this.f29986x1), java.lang.Integer.valueOf(luVar.f29986x1));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.lu();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29989y1;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f29964d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29965e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f29966f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f29967g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f29968h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f29969i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f29971m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f29972n);
            }
            if (zArr[9]) {
                fVar.d(9, this.f29973o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f29974p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f29977q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f29978r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f29979s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f29980t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f29981u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f29982v);
            }
            if (zArr[17]) {
                fVar.a(17, this.f29983w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f29984x);
            }
            if (zArr[19]) {
                fVar.e(19, this.f29987y);
            }
            if (zArr[20]) {
                fVar.e(20, this.f29990z);
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
                fVar.c(30, this.f29963J);
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
                fVar.i(39, e20Var.computeSize());
                this.S.writeFields(fVar);
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
                fVar.a(49, this.f29975p0);
            }
            if (zArr[50]) {
                fVar.f(50, this.f29985x0);
            }
            if (zArr[52]) {
                fVar.f(52, this.f29988y0);
            }
            fVar.g(53, 8, this.f29970l1);
            if (zArr[56]) {
                fVar.a(56, this.f29976p1);
            }
            if (zArr[57]) {
                fVar.f(57, this.f29986x1);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f29964d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f29965e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f29966f);
            }
            if (zArr[4]) {
                e17 += b36.f.d(4, this.f29967g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f29968h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f29969i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f29971m);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f29972n);
            }
            if (zArr[9]) {
                e17 += b36.f.d(9, this.f29973o);
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f29974p);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f29977q);
            }
            if (zArr[12]) {
                e17 += b36.f.e(12, this.f29978r);
            }
            if (zArr[13]) {
                e17 += b36.f.e(13, this.f29979s);
            }
            if (zArr[14]) {
                e17 += b36.f.e(14, this.f29980t);
            }
            if (zArr[15]) {
                e17 += b36.f.e(15, this.f29981u);
            }
            if (zArr[16]) {
                e17 += b36.f.e(16, this.f29982v);
            }
            if (zArr[17]) {
                e17 += b36.f.a(17, this.f29983w);
            }
            if (zArr[18]) {
                e17 += b36.f.e(18, this.f29984x);
            }
            if (zArr[19]) {
                e17 += b36.f.e(19, this.f29987y);
            }
            if (zArr[20]) {
                e17 += b36.f.e(20, this.f29990z);
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
                e17 += b36.f.c(30, this.f29963J);
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
                e17 += b36.f.i(39, e20Var2.computeSize());
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
                e17 += b36.f.a(49, this.f29975p0);
            }
            if (zArr[50]) {
                e17 += b36.f.f(50, this.f29985x0);
            }
            if (zArr[52]) {
                e17 += b36.f.f(52, this.f29988y0);
            }
            int g17 = e17 + b36.f.g(53, 8, this.f29970l1);
            if (zArr[56]) {
                g17 += b36.f.a(56, this.f29976p1);
            }
            return zArr[57] ? g17 + b36.f.f(57, this.f29986x1) : g17;
        }
        if (i17 == 2) {
            this.f29970l1.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
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
                this.f29964d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29965e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29966f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29967g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29968h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29969i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f29971m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f29972n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f29973o = aVar2.f(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f29974p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f29977q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f29978r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f29979s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f29980t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f29981u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f29982v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f29983w = aVar2.c(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f29984x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f29987y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f29990z = aVar2.g(intValue);
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
                this.f29963J = aVar2.e(intValue);
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
                        e20Var3.parseFrom(bArr);
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
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
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
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                this.f29975p0 = aVar2.c(intValue);
                zArr[49] = true;
                return 0;
            case 50:
                this.f29985x0 = aVar2.g(intValue);
                zArr[50] = true;
                return 0;
            case 52:
                this.f29988y0 = aVar2.g(intValue);
                zArr[52] = true;
                return 0;
            case 53:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.rp rpVar = new bw5.rp();
                    if (bArr2 != null && bArr2.length > 0) {
                        rpVar.parseFrom(bArr2);
                    }
                    this.f29970l1.add(rpVar);
                }
                zArr[53] = true;
                return 0;
            case 56:
                this.f29976p1 = aVar2.c(intValue);
                zArr[56] = true;
                return 0;
            case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
                this.f29986x1 = aVar2.g(intValue);
                zArr[57] = true;
                return 0;
        }
    }
}
