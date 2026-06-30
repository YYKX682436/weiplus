package bw5;

/* loaded from: classes2.dex */
public class jl0 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public java.lang.String B;
    public boolean D;
    public long E;
    public long F;
    public int G;
    public int H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public bw5.hj0 f29016J;
    public java.lang.String K;
    public bw5.ug0 L;

    /* renamed from: d, reason: collision with root package name */
    public long f29017d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.w2 f29018e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.tr0 f29019f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.wg0 f29020g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f29021h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f29022i;

    /* renamed from: m, reason: collision with root package name */
    public long f29023m;

    /* renamed from: n, reason: collision with root package name */
    public int f29024n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f29025o;

    /* renamed from: p, reason: collision with root package name */
    public long f29026p;

    /* renamed from: q, reason: collision with root package name */
    public int f29027q;

    /* renamed from: r, reason: collision with root package name */
    public long f29028r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f29029s;

    /* renamed from: t, reason: collision with root package name */
    public int f29030t;

    /* renamed from: u, reason: collision with root package name */
    public long f29031u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f29032v;

    /* renamed from: w, reason: collision with root package name */
    public long f29033w;

    /* renamed from: x, reason: collision with root package name */
    public int f29034x;

    /* renamed from: y, reason: collision with root package name */
    public long f29035y;

    /* renamed from: z, reason: collision with root package name */
    public long f29036z;
    public final java.util.LinkedList C = new java.util.LinkedList();
    public final boolean[] M = new boolean[34];

    static {
        new bw5.jl0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jl0 parseFrom(byte[] bArr) {
        return (bw5.jl0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jl0)) {
            return false;
        }
        bw5.jl0 jl0Var = (bw5.jl0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f29017d), java.lang.Long.valueOf(jl0Var.f29017d)) && n51.f.a(this.f29018e, jl0Var.f29018e) && n51.f.a(this.f29019f, jl0Var.f29019f) && n51.f.a(this.f29020g, jl0Var.f29020g) && n51.f.a(this.f29021h, jl0Var.f29021h) && n51.f.a(this.f29022i, jl0Var.f29022i) && n51.f.a(java.lang.Long.valueOf(this.f29023m), java.lang.Long.valueOf(jl0Var.f29023m)) && n51.f.a(java.lang.Integer.valueOf(this.f29024n), java.lang.Integer.valueOf(jl0Var.f29024n)) && n51.f.a(this.f29025o, jl0Var.f29025o) && n51.f.a(java.lang.Long.valueOf(this.f29026p), java.lang.Long.valueOf(jl0Var.f29026p)) && n51.f.a(java.lang.Integer.valueOf(this.f29027q), java.lang.Integer.valueOf(jl0Var.f29027q)) && n51.f.a(java.lang.Long.valueOf(this.f29028r), java.lang.Long.valueOf(jl0Var.f29028r)) && n51.f.a(this.f29029s, jl0Var.f29029s) && n51.f.a(java.lang.Integer.valueOf(this.f29030t), java.lang.Integer.valueOf(jl0Var.f29030t)) && n51.f.a(java.lang.Long.valueOf(this.f29031u), java.lang.Long.valueOf(jl0Var.f29031u)) && n51.f.a(this.f29032v, jl0Var.f29032v) && n51.f.a(java.lang.Long.valueOf(this.f29033w), java.lang.Long.valueOf(jl0Var.f29033w)) && n51.f.a(java.lang.Integer.valueOf(this.f29034x), java.lang.Integer.valueOf(jl0Var.f29034x)) && n51.f.a(java.lang.Long.valueOf(this.f29035y), java.lang.Long.valueOf(jl0Var.f29035y)) && n51.f.a(java.lang.Long.valueOf(this.f29036z), java.lang.Long.valueOf(jl0Var.f29036z)) && n51.f.a(this.A, jl0Var.A) && n51.f.a(this.B, jl0Var.B) && n51.f.a(this.C, jl0Var.C) && n51.f.a(java.lang.Boolean.valueOf(this.D), java.lang.Boolean.valueOf(jl0Var.D)) && n51.f.a(java.lang.Long.valueOf(this.E), java.lang.Long.valueOf(jl0Var.E)) && n51.f.a(java.lang.Long.valueOf(this.F), java.lang.Long.valueOf(jl0Var.F)) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(jl0Var.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(jl0Var.H)) && n51.f.a(java.lang.Long.valueOf(this.I), java.lang.Long.valueOf(jl0Var.I)) && n51.f.a(this.f29016J, jl0Var.f29016J) && n51.f.a(this.K, jl0Var.K) && n51.f.a(this.L, jl0Var.L);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.jl0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.M;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f29017d);
            }
            bw5.w2 w2Var = this.f29018e;
            if (w2Var != null && zArr[2]) {
                fVar.i(2, w2Var.computeSize());
                this.f29018e.writeFields(fVar);
            }
            bw5.tr0 tr0Var = this.f29019f;
            if (tr0Var != null && zArr[3]) {
                fVar.i(3, tr0Var.computeSize());
                this.f29019f.writeFields(fVar);
            }
            bw5.wg0 wg0Var = this.f29020g;
            if (wg0Var != null && zArr[4]) {
                fVar.i(4, wg0Var.computeSize());
                this.f29020g.writeFields(fVar);
            }
            java.lang.String str = this.f29021h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f29022i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            if (zArr[7]) {
                fVar.h(7, this.f29023m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f29024n);
            }
            java.lang.String str3 = this.f29025o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            if (zArr[10]) {
                fVar.h(10, this.f29026p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f29027q);
            }
            if (zArr[12]) {
                fVar.h(12, this.f29028r);
            }
            com.tencent.mm.protobuf.g gVar = this.f29029s;
            if (gVar != null && zArr[13]) {
                fVar.b(13, gVar);
            }
            if (zArr[14]) {
                fVar.e(14, this.f29030t);
            }
            if (zArr[15]) {
                fVar.h(15, this.f29031u);
            }
            java.lang.String str4 = this.f29032v;
            if (str4 != null && zArr[16]) {
                fVar.j(16, str4);
            }
            if (zArr[17]) {
                fVar.h(17, this.f29033w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f29034x);
            }
            if (zArr[19]) {
                fVar.h(19, this.f29035y);
            }
            if (zArr[20]) {
                fVar.h(20, this.f29036z);
            }
            java.lang.String str5 = this.A;
            if (str5 != null && zArr[21]) {
                fVar.j(21, str5);
            }
            java.lang.String str6 = this.B;
            if (str6 != null && zArr[22]) {
                fVar.j(22, str6);
            }
            fVar.g(23, 3, this.C);
            if (zArr[24]) {
                fVar.a(24, this.D);
            }
            if (zArr[25]) {
                fVar.h(25, this.E);
            }
            if (zArr[26]) {
                fVar.h(26, this.F);
            }
            if (zArr[27]) {
                fVar.e(27, this.G);
            }
            if (zArr[28]) {
                fVar.e(28, this.H);
            }
            if (zArr[29]) {
                fVar.h(29, this.I);
            }
            bw5.hj0 hj0Var = this.f29016J;
            if (hj0Var != null && zArr[31]) {
                fVar.i(31, hj0Var.computeSize());
                this.f29016J.writeFields(fVar);
            }
            java.lang.String str7 = this.K;
            if (str7 != null && zArr[32]) {
                fVar.j(32, str7);
            }
            bw5.ug0 ug0Var = this.L;
            if (ug0Var != null && zArr[33]) {
                fVar.i(33, ug0Var.computeSize());
                this.L.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f29017d) + 0 : 0;
            bw5.w2 w2Var2 = this.f29018e;
            if (w2Var2 != null && zArr[2]) {
                h17 += b36.f.i(2, w2Var2.computeSize());
            }
            bw5.tr0 tr0Var2 = this.f29019f;
            if (tr0Var2 != null && zArr[3]) {
                h17 += b36.f.i(3, tr0Var2.computeSize());
            }
            bw5.wg0 wg0Var2 = this.f29020g;
            if (wg0Var2 != null && zArr[4]) {
                h17 += b36.f.i(4, wg0Var2.computeSize());
            }
            java.lang.String str8 = this.f29021h;
            if (str8 != null && zArr[5]) {
                h17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f29022i;
            if (str9 != null && zArr[6]) {
                h17 += b36.f.j(6, str9);
            }
            if (zArr[7]) {
                h17 += b36.f.h(7, this.f29023m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f29024n);
            }
            java.lang.String str10 = this.f29025o;
            if (str10 != null && zArr[9]) {
                h17 += b36.f.j(9, str10);
            }
            if (zArr[10]) {
                h17 += b36.f.h(10, this.f29026p);
            }
            if (zArr[11]) {
                h17 += b36.f.e(11, this.f29027q);
            }
            if (zArr[12]) {
                h17 += b36.f.h(12, this.f29028r);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f29029s;
            if (gVar2 != null && zArr[13]) {
                h17 += b36.f.b(13, gVar2);
            }
            if (zArr[14]) {
                h17 += b36.f.e(14, this.f29030t);
            }
            if (zArr[15]) {
                h17 += b36.f.h(15, this.f29031u);
            }
            java.lang.String str11 = this.f29032v;
            if (str11 != null && zArr[16]) {
                h17 += b36.f.j(16, str11);
            }
            if (zArr[17]) {
                h17 += b36.f.h(17, this.f29033w);
            }
            if (zArr[18]) {
                h17 += b36.f.e(18, this.f29034x);
            }
            if (zArr[19]) {
                h17 += b36.f.h(19, this.f29035y);
            }
            if (zArr[20]) {
                h17 += b36.f.h(20, this.f29036z);
            }
            java.lang.String str12 = this.A;
            if (str12 != null && zArr[21]) {
                h17 += b36.f.j(21, str12);
            }
            java.lang.String str13 = this.B;
            if (str13 != null && zArr[22]) {
                h17 += b36.f.j(22, str13);
            }
            int g17 = h17 + b36.f.g(23, 3, this.C);
            if (zArr[24]) {
                g17 += b36.f.a(24, this.D);
            }
            if (zArr[25]) {
                g17 += b36.f.h(25, this.E);
            }
            if (zArr[26]) {
                g17 += b36.f.h(26, this.F);
            }
            if (zArr[27]) {
                g17 += b36.f.e(27, this.G);
            }
            if (zArr[28]) {
                g17 += b36.f.e(28, this.H);
            }
            if (zArr[29]) {
                g17 += b36.f.h(29, this.I);
            }
            bw5.hj0 hj0Var2 = this.f29016J;
            if (hj0Var2 != null && zArr[31]) {
                g17 += b36.f.i(31, hj0Var2.computeSize());
            }
            java.lang.String str14 = this.K;
            if (str14 != null && zArr[32]) {
                g17 += b36.f.j(32, str14);
            }
            bw5.ug0 ug0Var2 = this.L;
            return (ug0Var2 == null || !zArr[33]) ? g17 : g17 + b36.f.i(33, ug0Var2.computeSize());
        }
        if (i17 == 2) {
            this.C.clear();
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
                this.f29017d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.w2 w2Var3 = new bw5.w2();
                    if (bArr != null && bArr.length > 0) {
                        w2Var3.parseFrom(bArr);
                    }
                    this.f29018e = w2Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.tr0 tr0Var3 = new bw5.tr0();
                    if (bArr2 != null && bArr2.length > 0) {
                        tr0Var3.parseFrom(bArr2);
                    }
                    this.f29019f = tr0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.wg0 wg0Var3 = new bw5.wg0();
                    if (bArr3 != null && bArr3.length > 0) {
                        wg0Var3.parseFrom(bArr3);
                    }
                    this.f29020g = wg0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f29021h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29022i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f29023m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f29024n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f29025o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f29026p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f29027q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f29028r = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f29029s = aVar2.d(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f29030t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f29031u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f29032v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f29033w = aVar2.i(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f29034x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f29035y = aVar2.i(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f29036z = aVar2.i(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.k(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.c(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.i(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.i(intValue);
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
                this.I = aVar2.i(intValue);
                zArr[29] = true;
                return 0;
            case 30:
            default:
                return -1;
            case 31:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.hj0 hj0Var3 = new bw5.hj0();
                    if (bArr4 != null && bArr4.length > 0) {
                        hj0Var3.parseFrom(bArr4);
                    }
                    this.f29016J = hj0Var3;
                }
                zArr[31] = true;
                return 0;
            case 32:
                this.K = aVar2.k(intValue);
                zArr[32] = true;
                return 0;
            case 33:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.ug0 ug0Var3 = new bw5.ug0();
                    if (bArr5 != null && bArr5.length > 0) {
                        ug0Var3.parseFrom(bArr5);
                    }
                    this.L = ug0Var3;
                }
                zArr[33] = true;
                return 0;
        }
    }
}
