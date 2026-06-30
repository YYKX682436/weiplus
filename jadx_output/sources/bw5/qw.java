package bw5;

/* loaded from: classes2.dex */
public class qw extends com.tencent.mm.protobuf.f {
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
    public com.tencent.mm.protobuf.g f32303J;
    public int K;
    public int L;
    public boolean M;
    public int N;
    public int P;
    public final boolean[] Q = new boolean[36];

    /* renamed from: d, reason: collision with root package name */
    public int f32304d;

    /* renamed from: e, reason: collision with root package name */
    public int f32305e;

    /* renamed from: f, reason: collision with root package name */
    public int f32306f;

    /* renamed from: g, reason: collision with root package name */
    public int f32307g;

    /* renamed from: h, reason: collision with root package name */
    public int f32308h;

    /* renamed from: i, reason: collision with root package name */
    public int f32309i;

    /* renamed from: m, reason: collision with root package name */
    public int f32310m;

    /* renamed from: n, reason: collision with root package name */
    public int f32311n;

    /* renamed from: o, reason: collision with root package name */
    public int f32312o;

    /* renamed from: p, reason: collision with root package name */
    public int f32313p;

    /* renamed from: q, reason: collision with root package name */
    public int f32314q;

    /* renamed from: r, reason: collision with root package name */
    public int f32315r;

    /* renamed from: s, reason: collision with root package name */
    public int f32316s;

    /* renamed from: t, reason: collision with root package name */
    public int f32317t;

    /* renamed from: u, reason: collision with root package name */
    public int f32318u;

    /* renamed from: v, reason: collision with root package name */
    public int f32319v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f32320w;

    /* renamed from: x, reason: collision with root package name */
    public int f32321x;

    /* renamed from: y, reason: collision with root package name */
    public int f32322y;

    /* renamed from: z, reason: collision with root package name */
    public int f32323z;

    static {
        new bw5.qw();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qw parseFrom(byte[] bArr) {
        return (bw5.qw) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qw)) {
            return false;
        }
        bw5.qw qwVar = (bw5.qw) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f32304d), java.lang.Integer.valueOf(qwVar.f32304d)) && n51.f.a(java.lang.Integer.valueOf(this.f32305e), java.lang.Integer.valueOf(qwVar.f32305e)) && n51.f.a(java.lang.Integer.valueOf(this.f32306f), java.lang.Integer.valueOf(qwVar.f32306f)) && n51.f.a(java.lang.Integer.valueOf(this.f32307g), java.lang.Integer.valueOf(qwVar.f32307g)) && n51.f.a(java.lang.Integer.valueOf(this.f32308h), java.lang.Integer.valueOf(qwVar.f32308h)) && n51.f.a(java.lang.Integer.valueOf(this.f32309i), java.lang.Integer.valueOf(qwVar.f32309i)) && n51.f.a(java.lang.Integer.valueOf(this.f32310m), java.lang.Integer.valueOf(qwVar.f32310m)) && n51.f.a(java.lang.Integer.valueOf(this.f32311n), java.lang.Integer.valueOf(qwVar.f32311n)) && n51.f.a(java.lang.Integer.valueOf(this.f32312o), java.lang.Integer.valueOf(qwVar.f32312o)) && n51.f.a(java.lang.Integer.valueOf(this.f32313p), java.lang.Integer.valueOf(qwVar.f32313p)) && n51.f.a(java.lang.Integer.valueOf(this.f32314q), java.lang.Integer.valueOf(qwVar.f32314q)) && n51.f.a(java.lang.Integer.valueOf(this.f32315r), java.lang.Integer.valueOf(qwVar.f32315r)) && n51.f.a(java.lang.Integer.valueOf(this.f32316s), java.lang.Integer.valueOf(qwVar.f32316s)) && n51.f.a(java.lang.Integer.valueOf(this.f32317t), java.lang.Integer.valueOf(qwVar.f32317t)) && n51.f.a(java.lang.Integer.valueOf(this.f32318u), java.lang.Integer.valueOf(qwVar.f32318u)) && n51.f.a(java.lang.Integer.valueOf(this.f32319v), java.lang.Integer.valueOf(qwVar.f32319v)) && n51.f.a(java.lang.Boolean.valueOf(this.f32320w), java.lang.Boolean.valueOf(qwVar.f32320w)) && n51.f.a(java.lang.Integer.valueOf(this.f32321x), java.lang.Integer.valueOf(qwVar.f32321x)) && n51.f.a(java.lang.Integer.valueOf(this.f32322y), java.lang.Integer.valueOf(qwVar.f32322y)) && n51.f.a(java.lang.Integer.valueOf(this.f32323z), java.lang.Integer.valueOf(qwVar.f32323z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(qwVar.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(qwVar.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(qwVar.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(qwVar.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(qwVar.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(qwVar.F)) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(qwVar.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(qwVar.H)) && n51.f.a(java.lang.Boolean.valueOf(this.I), java.lang.Boolean.valueOf(qwVar.I)) && n51.f.a(this.f32303J, qwVar.f32303J) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(qwVar.K)) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(qwVar.L)) && n51.f.a(java.lang.Boolean.valueOf(this.M), java.lang.Boolean.valueOf(qwVar.M)) && n51.f.a(java.lang.Integer.valueOf(this.N), java.lang.Integer.valueOf(qwVar.N)) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(qwVar.P));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qw();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.Q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f32304d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f32305e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f32306f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f32307g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f32308h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f32309i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f32310m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f32311n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f32312o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f32313p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f32314q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f32315r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f32316s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f32317t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f32318u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f32319v);
            }
            if (zArr[17]) {
                fVar.a(17, this.f32320w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f32321x);
            }
            if (zArr[19]) {
                fVar.e(19, this.f32322y);
            }
            if (zArr[20]) {
                fVar.e(20, this.f32323z);
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
            com.tencent.mm.protobuf.g gVar = this.f32303J;
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
            int e17 = zArr[1] ? b36.f.e(1, this.f32304d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f32305e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f32306f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f32307g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f32308h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f32309i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f32310m);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f32311n);
            }
            if (zArr[9]) {
                e17 += b36.f.e(9, this.f32312o);
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f32313p);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f32314q);
            }
            if (zArr[12]) {
                e17 += b36.f.e(12, this.f32315r);
            }
            if (zArr[13]) {
                e17 += b36.f.e(13, this.f32316s);
            }
            if (zArr[14]) {
                e17 += b36.f.e(14, this.f32317t);
            }
            if (zArr[15]) {
                e17 += b36.f.e(15, this.f32318u);
            }
            if (zArr[16]) {
                e17 += b36.f.e(16, this.f32319v);
            }
            if (zArr[17]) {
                e17 += b36.f.a(17, this.f32320w);
            }
            if (zArr[18]) {
                e17 += b36.f.e(18, this.f32321x);
            }
            if (zArr[19]) {
                e17 += b36.f.e(19, this.f32322y);
            }
            if (zArr[20]) {
                e17 += b36.f.e(20, this.f32323z);
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
            com.tencent.mm.protobuf.g gVar2 = this.f32303J;
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
                this.f32304d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32305e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32306f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32307g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32308h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32309i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f32310m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f32311n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f32312o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f32313p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f32314q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f32315r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f32316s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f32317t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f32318u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f32319v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f32320w = aVar2.c(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f32321x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f32322y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f32323z = aVar2.g(intValue);
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
                this.f32303J = aVar2.d(intValue);
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
