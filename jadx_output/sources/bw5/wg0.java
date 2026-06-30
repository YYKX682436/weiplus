package bw5;

/* loaded from: classes2.dex */
public class wg0 extends com.tencent.mm.protobuf.f {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public bw5.dh0 K;

    /* renamed from: d, reason: collision with root package name */
    public int f34690d;

    /* renamed from: e, reason: collision with root package name */
    public int f34691e;

    /* renamed from: f, reason: collision with root package name */
    public int f34692f;

    /* renamed from: g, reason: collision with root package name */
    public int f34693g;

    /* renamed from: h, reason: collision with root package name */
    public int f34694h;

    /* renamed from: i, reason: collision with root package name */
    public int f34695i;

    /* renamed from: m, reason: collision with root package name */
    public int f34696m;

    /* renamed from: n, reason: collision with root package name */
    public int f34697n;

    /* renamed from: o, reason: collision with root package name */
    public int f34698o;

    /* renamed from: p, reason: collision with root package name */
    public int f34699p;

    /* renamed from: q, reason: collision with root package name */
    public int f34700q;

    /* renamed from: r, reason: collision with root package name */
    public int f34701r;

    /* renamed from: s, reason: collision with root package name */
    public int f34702s;

    /* renamed from: t, reason: collision with root package name */
    public int f34703t;

    /* renamed from: u, reason: collision with root package name */
    public int f34704u;

    /* renamed from: v, reason: collision with root package name */
    public int f34705v;

    /* renamed from: w, reason: collision with root package name */
    public int f34706w;

    /* renamed from: x, reason: collision with root package name */
    public int f34707x;

    /* renamed from: y, reason: collision with root package name */
    public int f34708y;

    /* renamed from: z, reason: collision with root package name */
    public int f34709z;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.LinkedList f34689J = new java.util.LinkedList();
    public final boolean[] L = new boolean[32];

    static {
        new bw5.wg0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wg0 parseFrom(byte[] bArr) {
        return (bw5.wg0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wg0)) {
            return false;
        }
        bw5.wg0 wg0Var = (bw5.wg0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34690d), java.lang.Integer.valueOf(wg0Var.f34690d)) && n51.f.a(java.lang.Integer.valueOf(this.f34691e), java.lang.Integer.valueOf(wg0Var.f34691e)) && n51.f.a(java.lang.Integer.valueOf(this.f34692f), java.lang.Integer.valueOf(wg0Var.f34692f)) && n51.f.a(java.lang.Integer.valueOf(this.f34693g), java.lang.Integer.valueOf(wg0Var.f34693g)) && n51.f.a(java.lang.Integer.valueOf(this.f34694h), java.lang.Integer.valueOf(wg0Var.f34694h)) && n51.f.a(java.lang.Integer.valueOf(this.f34695i), java.lang.Integer.valueOf(wg0Var.f34695i)) && n51.f.a(java.lang.Integer.valueOf(this.f34696m), java.lang.Integer.valueOf(wg0Var.f34696m)) && n51.f.a(java.lang.Integer.valueOf(this.f34697n), java.lang.Integer.valueOf(wg0Var.f34697n)) && n51.f.a(java.lang.Integer.valueOf(this.f34698o), java.lang.Integer.valueOf(wg0Var.f34698o)) && n51.f.a(java.lang.Integer.valueOf(this.f34699p), java.lang.Integer.valueOf(wg0Var.f34699p)) && n51.f.a(java.lang.Integer.valueOf(this.f34700q), java.lang.Integer.valueOf(wg0Var.f34700q)) && n51.f.a(java.lang.Integer.valueOf(this.f34701r), java.lang.Integer.valueOf(wg0Var.f34701r)) && n51.f.a(java.lang.Integer.valueOf(this.f34702s), java.lang.Integer.valueOf(wg0Var.f34702s)) && n51.f.a(java.lang.Integer.valueOf(this.f34703t), java.lang.Integer.valueOf(wg0Var.f34703t)) && n51.f.a(java.lang.Integer.valueOf(this.f34704u), java.lang.Integer.valueOf(wg0Var.f34704u)) && n51.f.a(java.lang.Integer.valueOf(this.f34705v), java.lang.Integer.valueOf(wg0Var.f34705v)) && n51.f.a(java.lang.Integer.valueOf(this.f34706w), java.lang.Integer.valueOf(wg0Var.f34706w)) && n51.f.a(java.lang.Integer.valueOf(this.f34707x), java.lang.Integer.valueOf(wg0Var.f34707x)) && n51.f.a(java.lang.Integer.valueOf(this.f34708y), java.lang.Integer.valueOf(wg0Var.f34708y)) && n51.f.a(java.lang.Integer.valueOf(this.f34709z), java.lang.Integer.valueOf(wg0Var.f34709z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(wg0Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(wg0Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(wg0Var.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(wg0Var.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(wg0Var.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(wg0Var.F)) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(wg0Var.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(wg0Var.H)) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(wg0Var.I)) && n51.f.a(this.f34689J, wg0Var.f34689J) && n51.f.a(this.K, wg0Var.K);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wg0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.L;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34690d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34691e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34692f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34693g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f34694h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f34695i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f34696m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f34697n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f34698o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f34699p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f34700q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f34701r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f34702s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f34703t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f34704u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f34705v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f34706w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f34707x);
            }
            if (zArr[19]) {
                fVar.e(19, this.f34708y);
            }
            if (zArr[20]) {
                fVar.e(20, this.f34709z);
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
            fVar.g(30, 2, this.f34689J);
            bw5.dh0 dh0Var = this.K;
            if (dh0Var != null && zArr[31]) {
                fVar.i(31, dh0Var.computeSize());
                this.K.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f34690d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f34691e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f34692f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f34693g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f34694h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f34695i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f34696m);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f34697n);
            }
            if (zArr[9]) {
                e17 += b36.f.e(9, this.f34698o);
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f34699p);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f34700q);
            }
            if (zArr[12]) {
                e17 += b36.f.e(12, this.f34701r);
            }
            if (zArr[13]) {
                e17 += b36.f.e(13, this.f34702s);
            }
            if (zArr[14]) {
                e17 += b36.f.e(14, this.f34703t);
            }
            if (zArr[15]) {
                e17 += b36.f.e(15, this.f34704u);
            }
            if (zArr[16]) {
                e17 += b36.f.e(16, this.f34705v);
            }
            if (zArr[17]) {
                e17 += b36.f.e(17, this.f34706w);
            }
            if (zArr[18]) {
                e17 += b36.f.e(18, this.f34707x);
            }
            if (zArr[19]) {
                e17 += b36.f.e(19, this.f34708y);
            }
            if (zArr[20]) {
                e17 += b36.f.e(20, this.f34709z);
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
            int g17 = e17 + b36.f.g(30, 2, this.f34689J);
            bw5.dh0 dh0Var2 = this.K;
            return (dh0Var2 == null || !zArr[31]) ? g17 : g17 + b36.f.i(31, dh0Var2.computeSize());
        }
        if (i17 == 2) {
            this.f34689J.clear();
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
                this.f34690d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34691e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34692f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34693g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34694h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34695i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34696m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f34697n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f34698o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f34699p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f34700q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f34701r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f34702s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f34703t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f34704u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f34705v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f34706w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f34707x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f34708y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f34709z = aVar2.g(intValue);
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
                this.f34689J.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[30] = true;
                return 0;
            case 31:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.dh0 dh0Var3 = new bw5.dh0();
                    if (bArr != null && bArr.length > 0) {
                        dh0Var3.parseFrom(bArr);
                    }
                    this.K = dh0Var3;
                }
                zArr[31] = true;
                return 0;
            default:
                return -1;
        }
    }
}
