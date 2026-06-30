package bw5;

/* loaded from: classes2.dex */
public class qw extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f113836J;
    public int K;
    public int L;
    public boolean M;
    public int N;
    public int P;
    public final boolean[] Q = new boolean[36];

    /* renamed from: d, reason: collision with root package name */
    public int f113837d;

    /* renamed from: e, reason: collision with root package name */
    public int f113838e;

    /* renamed from: f, reason: collision with root package name */
    public int f113839f;

    /* renamed from: g, reason: collision with root package name */
    public int f113840g;

    /* renamed from: h, reason: collision with root package name */
    public int f113841h;

    /* renamed from: i, reason: collision with root package name */
    public int f113842i;

    /* renamed from: m, reason: collision with root package name */
    public int f113843m;

    /* renamed from: n, reason: collision with root package name */
    public int f113844n;

    /* renamed from: o, reason: collision with root package name */
    public int f113845o;

    /* renamed from: p, reason: collision with root package name */
    public int f113846p;

    /* renamed from: q, reason: collision with root package name */
    public int f113847q;

    /* renamed from: r, reason: collision with root package name */
    public int f113848r;

    /* renamed from: s, reason: collision with root package name */
    public int f113849s;

    /* renamed from: t, reason: collision with root package name */
    public int f113850t;

    /* renamed from: u, reason: collision with root package name */
    public int f113851u;

    /* renamed from: v, reason: collision with root package name */
    public int f113852v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f113853w;

    /* renamed from: x, reason: collision with root package name */
    public int f113854x;

    /* renamed from: y, reason: collision with root package name */
    public int f113855y;

    /* renamed from: z, reason: collision with root package name */
    public int f113856z;

    static {
        new bw5.qw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qw mo11468x92b714fd(byte[] bArr) {
        return (bw5.qw) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qw)) {
            return false;
        }
        bw5.qw qwVar = (bw5.qw) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113837d), java.lang.Integer.valueOf(qwVar.f113837d)) && n51.f.a(java.lang.Integer.valueOf(this.f113838e), java.lang.Integer.valueOf(qwVar.f113838e)) && n51.f.a(java.lang.Integer.valueOf(this.f113839f), java.lang.Integer.valueOf(qwVar.f113839f)) && n51.f.a(java.lang.Integer.valueOf(this.f113840g), java.lang.Integer.valueOf(qwVar.f113840g)) && n51.f.a(java.lang.Integer.valueOf(this.f113841h), java.lang.Integer.valueOf(qwVar.f113841h)) && n51.f.a(java.lang.Integer.valueOf(this.f113842i), java.lang.Integer.valueOf(qwVar.f113842i)) && n51.f.a(java.lang.Integer.valueOf(this.f113843m), java.lang.Integer.valueOf(qwVar.f113843m)) && n51.f.a(java.lang.Integer.valueOf(this.f113844n), java.lang.Integer.valueOf(qwVar.f113844n)) && n51.f.a(java.lang.Integer.valueOf(this.f113845o), java.lang.Integer.valueOf(qwVar.f113845o)) && n51.f.a(java.lang.Integer.valueOf(this.f113846p), java.lang.Integer.valueOf(qwVar.f113846p)) && n51.f.a(java.lang.Integer.valueOf(this.f113847q), java.lang.Integer.valueOf(qwVar.f113847q)) && n51.f.a(java.lang.Integer.valueOf(this.f113848r), java.lang.Integer.valueOf(qwVar.f113848r)) && n51.f.a(java.lang.Integer.valueOf(this.f113849s), java.lang.Integer.valueOf(qwVar.f113849s)) && n51.f.a(java.lang.Integer.valueOf(this.f113850t), java.lang.Integer.valueOf(qwVar.f113850t)) && n51.f.a(java.lang.Integer.valueOf(this.f113851u), java.lang.Integer.valueOf(qwVar.f113851u)) && n51.f.a(java.lang.Integer.valueOf(this.f113852v), java.lang.Integer.valueOf(qwVar.f113852v)) && n51.f.a(java.lang.Boolean.valueOf(this.f113853w), java.lang.Boolean.valueOf(qwVar.f113853w)) && n51.f.a(java.lang.Integer.valueOf(this.f113854x), java.lang.Integer.valueOf(qwVar.f113854x)) && n51.f.a(java.lang.Integer.valueOf(this.f113855y), java.lang.Integer.valueOf(qwVar.f113855y)) && n51.f.a(java.lang.Integer.valueOf(this.f113856z), java.lang.Integer.valueOf(qwVar.f113856z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(qwVar.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(qwVar.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(qwVar.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(qwVar.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(qwVar.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(qwVar.F)) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(qwVar.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(qwVar.H)) && n51.f.a(java.lang.Boolean.valueOf(this.I), java.lang.Boolean.valueOf(qwVar.I)) && n51.f.a(this.f113836J, qwVar.f113836J) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(qwVar.K)) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(qwVar.L)) && n51.f.a(java.lang.Boolean.valueOf(this.M), java.lang.Boolean.valueOf(qwVar.M)) && n51.f.a(java.lang.Integer.valueOf(this.N), java.lang.Integer.valueOf(qwVar.N)) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(qwVar.P));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.Q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113837d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f113838e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f113839f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f113840g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f113841h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f113842i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f113843m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f113844n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f113845o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f113846p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f113847q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f113848r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f113849s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f113850t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f113851u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f113852v);
            }
            if (zArr[17]) {
                fVar.a(17, this.f113853w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f113854x);
            }
            if (zArr[19]) {
                fVar.e(19, this.f113855y);
            }
            if (zArr[20]) {
                fVar.e(20, this.f113856z);
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
                fVar.a(29, this.I);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f113836J;
            if (gVar != null && zArr[30]) {
                fVar.b(30, gVar);
            }
            if (zArr[31]) {
                fVar.e(31, this.K);
            }
            if (zArr[32]) {
                fVar.e(32, this.L);
            }
            if (zArr[33]) {
                fVar.a(33, this.M);
            }
            if (zArr[34]) {
                fVar.e(34, this.N);
            }
            if (zArr[35]) {
                fVar.e(35, this.P);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f113837d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f113838e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f113839f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f113840g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f113841h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f113842i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f113843m);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f113844n);
            }
            if (zArr[9]) {
                e17 += b36.f.e(9, this.f113845o);
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f113846p);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f113847q);
            }
            if (zArr[12]) {
                e17 += b36.f.e(12, this.f113848r);
            }
            if (zArr[13]) {
                e17 += b36.f.e(13, this.f113849s);
            }
            if (zArr[14]) {
                e17 += b36.f.e(14, this.f113850t);
            }
            if (zArr[15]) {
                e17 += b36.f.e(15, this.f113851u);
            }
            if (zArr[16]) {
                e17 += b36.f.e(16, this.f113852v);
            }
            if (zArr[17]) {
                e17 += b36.f.a(17, this.f113853w);
            }
            if (zArr[18]) {
                e17 += b36.f.e(18, this.f113854x);
            }
            if (zArr[19]) {
                e17 += b36.f.e(19, this.f113855y);
            }
            if (zArr[20]) {
                e17 += b36.f.e(20, this.f113856z);
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
                e17 += b36.f.a(29, this.I);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f113836J;
            if (gVar2 != null && zArr[30]) {
                e17 += b36.f.b(30, gVar2);
            }
            if (zArr[31]) {
                e17 += b36.f.e(31, this.K);
            }
            if (zArr[32]) {
                e17 += b36.f.e(32, this.L);
            }
            if (zArr[33]) {
                e17 += b36.f.a(33, this.M);
            }
            if (zArr[34]) {
                e17 += b36.f.e(34, this.N);
            }
            return zArr[35] ? e17 + b36.f.e(35, this.P) : e17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f113837d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113838e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113839f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113840g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113841h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113842i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113843m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f113844n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f113845o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f113846p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f113847q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f113848r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f113849s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f113850t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f113851u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f113852v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f113853w = aVar2.c(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f113854x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f113855y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f113856z = aVar2.g(intValue);
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
                this.I = aVar2.c(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                this.f113836J = aVar2.d(intValue);
                zArr[30] = true;
                return 0;
            case 31:
                this.K = aVar2.g(intValue);
                zArr[31] = true;
                return 0;
            case 32:
                this.L = aVar2.g(intValue);
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
            default:
                return -1;
        }
    }
}
