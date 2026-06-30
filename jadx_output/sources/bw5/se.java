package bw5;

/* loaded from: classes4.dex */
public class se extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public long B;
    public int C;
    public bw5.a5 D;
    public int E;
    public java.lang.String F;
    public long G;
    public int H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public long f32931J;
    public int K;
    public int L;

    /* renamed from: d, reason: collision with root package name */
    public long f32932d;

    /* renamed from: e, reason: collision with root package name */
    public int f32933e;

    /* renamed from: f, reason: collision with root package name */
    public int f32934f;

    /* renamed from: g, reason: collision with root package name */
    public int f32935g;

    /* renamed from: h, reason: collision with root package name */
    public int f32936h;

    /* renamed from: i, reason: collision with root package name */
    public int f32937i;

    /* renamed from: m, reason: collision with root package name */
    public int f32938m;

    /* renamed from: n, reason: collision with root package name */
    public int f32939n;

    /* renamed from: o, reason: collision with root package name */
    public int f32940o;

    /* renamed from: p, reason: collision with root package name */
    public int f32941p;

    /* renamed from: r, reason: collision with root package name */
    public int f32943r;

    /* renamed from: s, reason: collision with root package name */
    public int f32944s;

    /* renamed from: t, reason: collision with root package name */
    public int f32945t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f32946u;

    /* renamed from: v, reason: collision with root package name */
    public long f32947v;

    /* renamed from: w, reason: collision with root package name */
    public int f32948w;

    /* renamed from: x, reason: collision with root package name */
    public int f32949x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f32950y;

    /* renamed from: z, reason: collision with root package name */
    public int f32951z;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f32942q = new java.util.LinkedList();
    public final boolean[] M = new boolean[33];

    static {
        new bw5.se();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.se parseFrom(byte[] bArr) {
        return (bw5.se) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.se)) {
            return false;
        }
        bw5.se seVar = (bw5.se) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f32932d), java.lang.Long.valueOf(seVar.f32932d)) && n51.f.a(java.lang.Integer.valueOf(this.f32933e), java.lang.Integer.valueOf(seVar.f32933e)) && n51.f.a(java.lang.Integer.valueOf(this.f32934f), java.lang.Integer.valueOf(seVar.f32934f)) && n51.f.a(java.lang.Integer.valueOf(this.f32935g), java.lang.Integer.valueOf(seVar.f32935g)) && n51.f.a(java.lang.Integer.valueOf(this.f32936h), java.lang.Integer.valueOf(seVar.f32936h)) && n51.f.a(java.lang.Integer.valueOf(this.f32937i), java.lang.Integer.valueOf(seVar.f32937i)) && n51.f.a(java.lang.Integer.valueOf(this.f32938m), java.lang.Integer.valueOf(seVar.f32938m)) && n51.f.a(java.lang.Integer.valueOf(this.f32939n), java.lang.Integer.valueOf(seVar.f32939n)) && n51.f.a(java.lang.Integer.valueOf(this.f32940o), java.lang.Integer.valueOf(seVar.f32940o)) && n51.f.a(java.lang.Integer.valueOf(this.f32941p), java.lang.Integer.valueOf(seVar.f32941p)) && n51.f.a(this.f32942q, seVar.f32942q) && n51.f.a(java.lang.Integer.valueOf(this.f32943r), java.lang.Integer.valueOf(seVar.f32943r)) && n51.f.a(java.lang.Integer.valueOf(this.f32944s), java.lang.Integer.valueOf(seVar.f32944s)) && n51.f.a(java.lang.Integer.valueOf(this.f32945t), java.lang.Integer.valueOf(seVar.f32945t)) && n51.f.a(this.f32946u, seVar.f32946u) && n51.f.a(java.lang.Long.valueOf(this.f32947v), java.lang.Long.valueOf(seVar.f32947v)) && n51.f.a(java.lang.Integer.valueOf(this.f32948w), java.lang.Integer.valueOf(seVar.f32948w)) && n51.f.a(java.lang.Integer.valueOf(this.f32949x), java.lang.Integer.valueOf(seVar.f32949x)) && n51.f.a(this.f32950y, seVar.f32950y) && n51.f.a(java.lang.Integer.valueOf(this.f32951z), java.lang.Integer.valueOf(seVar.f32951z)) && n51.f.a(this.A, seVar.A) && n51.f.a(java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(seVar.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(seVar.C)) && n51.f.a(this.D, seVar.D) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(seVar.E)) && n51.f.a(this.F, seVar.F) && n51.f.a(java.lang.Long.valueOf(this.G), java.lang.Long.valueOf(seVar.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(seVar.H)) && n51.f.a(java.lang.Long.valueOf(this.I), java.lang.Long.valueOf(seVar.I)) && n51.f.a(java.lang.Long.valueOf(this.f32931J), java.lang.Long.valueOf(seVar.f32931J)) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(seVar.K)) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(seVar.L));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.se();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.M;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f32932d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f32933e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f32934f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f32935g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f32936h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f32937i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f32938m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f32939n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f32940o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f32941p);
            }
            fVar.g(11, 8, this.f32942q);
            if (zArr[12]) {
                fVar.e(12, this.f32943r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f32944s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f32945t);
            }
            java.lang.String str = this.f32946u;
            if (str != null && zArr[15]) {
                fVar.j(15, str);
            }
            if (zArr[16]) {
                fVar.h(16, this.f32947v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f32948w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f32949x);
            }
            java.lang.String str2 = this.f32950y;
            if (str2 != null && zArr[19]) {
                fVar.j(19, str2);
            }
            if (zArr[20]) {
                fVar.e(20, this.f32951z);
            }
            java.lang.String str3 = this.A;
            if (str3 != null && zArr[21]) {
                fVar.j(21, str3);
            }
            if (zArr[22]) {
                fVar.h(22, this.B);
            }
            if (zArr[23]) {
                fVar.e(23, this.C);
            }
            bw5.a5 a5Var = this.D;
            if (a5Var != null && zArr[24]) {
                fVar.i(24, a5Var.computeSize());
                this.D.writeFields(fVar);
            }
            if (zArr[25]) {
                fVar.e(25, this.E);
            }
            java.lang.String str4 = this.F;
            if (str4 != null && zArr[26]) {
                fVar.j(26, str4);
            }
            if (zArr[27]) {
                fVar.h(27, this.G);
            }
            if (zArr[28]) {
                fVar.e(28, this.H);
            }
            if (zArr[29]) {
                fVar.h(29, this.I);
            }
            if (zArr[30]) {
                fVar.h(30, this.f32931J);
            }
            if (zArr[31]) {
                fVar.e(31, this.K);
            }
            if (zArr[32]) {
                fVar.e(32, this.L);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f32932d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f32933e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f32934f);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f32935g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f32936h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f32937i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f32938m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f32939n);
            }
            if (zArr[9]) {
                h17 += b36.f.e(9, this.f32940o);
            }
            if (zArr[10]) {
                h17 += b36.f.e(10, this.f32941p);
            }
            int g17 = h17 + b36.f.g(11, 8, this.f32942q);
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f32943r);
            }
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f32944s);
            }
            if (zArr[14]) {
                g17 += b36.f.e(14, this.f32945t);
            }
            java.lang.String str5 = this.f32946u;
            if (str5 != null && zArr[15]) {
                g17 += b36.f.j(15, str5);
            }
            if (zArr[16]) {
                g17 += b36.f.h(16, this.f32947v);
            }
            if (zArr[17]) {
                g17 += b36.f.e(17, this.f32948w);
            }
            if (zArr[18]) {
                g17 += b36.f.e(18, this.f32949x);
            }
            java.lang.String str6 = this.f32950y;
            if (str6 != null && zArr[19]) {
                g17 += b36.f.j(19, str6);
            }
            if (zArr[20]) {
                g17 += b36.f.e(20, this.f32951z);
            }
            java.lang.String str7 = this.A;
            if (str7 != null && zArr[21]) {
                g17 += b36.f.j(21, str7);
            }
            if (zArr[22]) {
                g17 += b36.f.h(22, this.B);
            }
            if (zArr[23]) {
                g17 += b36.f.e(23, this.C);
            }
            bw5.a5 a5Var2 = this.D;
            if (a5Var2 != null && zArr[24]) {
                g17 += b36.f.i(24, a5Var2.computeSize());
            }
            if (zArr[25]) {
                g17 += b36.f.e(25, this.E);
            }
            java.lang.String str8 = this.F;
            if (str8 != null && zArr[26]) {
                g17 += b36.f.j(26, str8);
            }
            if (zArr[27]) {
                g17 += b36.f.h(27, this.G);
            }
            if (zArr[28]) {
                g17 += b36.f.e(28, this.H);
            }
            if (zArr[29]) {
                g17 += b36.f.h(29, this.I);
            }
            if (zArr[30]) {
                g17 += b36.f.h(30, this.f32931J);
            }
            if (zArr[31]) {
                g17 += b36.f.e(31, this.K);
            }
            return zArr[32] ? g17 + b36.f.e(32, this.L) : g17;
        }
        if (i17 == 2) {
            this.f32942q.clear();
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
                this.f32932d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32933e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32934f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32935g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32936h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32937i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f32938m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f32939n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f32940o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f32941p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.k00 k00Var = new bw5.k00();
                    if (bArr != null && bArr.length > 0) {
                        k00Var.parseFrom(bArr);
                    }
                    this.f32942q.add(k00Var);
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f32943r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f32944s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f32945t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f32946u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f32947v = aVar2.i(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f32948w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f32949x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f32950y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f32951z = aVar2.g(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.i(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.g(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.a5 a5Var3 = new bw5.a5();
                    if (bArr2 != null && bArr2.length > 0) {
                        a5Var3.parseFrom(bArr2);
                    }
                    this.D = a5Var3;
                }
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.g(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.k(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.G = aVar2.i(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.H = aVar2.g(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.I = aVar2.i(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                this.f32931J = aVar2.i(intValue);
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
            default:
                return -1;
        }
    }
}
