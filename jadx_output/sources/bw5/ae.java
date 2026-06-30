package bw5;

/* loaded from: classes2.dex */
public class ae extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public bw5.de B;
    public int C;
    public int D;
    public java.lang.String E;
    public java.lang.String F;
    public int G;
    public int H;
    public bw5.wg I;
    public java.lang.String K;
    public int L;
    public bw5.p M;
    public int P;
    public int Q;
    public int R;
    public long S;
    public long T;
    public bw5.be U;
    public bw5.he V;
    public bw5.dh X;
    public java.lang.String Y;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25144d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25145e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25146f;

    /* renamed from: g, reason: collision with root package name */
    public long f25147g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f25148h;

    /* renamed from: i, reason: collision with root package name */
    public int f25149i;

    /* renamed from: m, reason: collision with root package name */
    public int f25150m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.lc f25151n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f25152o;

    /* renamed from: p, reason: collision with root package name */
    public int f25153p;

    /* renamed from: q, reason: collision with root package name */
    public int f25154q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.ce f25155r;

    /* renamed from: s, reason: collision with root package name */
    public int f25156s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.wt f25157t;

    /* renamed from: u, reason: collision with root package name */
    public int f25158u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.ee f25159v;

    /* renamed from: w, reason: collision with root package name */
    public int f25160w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f25161x;

    /* renamed from: y, reason: collision with root package name */
    public int f25162y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.rn f25163z;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.LinkedList f25143J = new java.util.LinkedList();
    public final java.util.LinkedList N = new java.util.LinkedList();
    public final java.util.LinkedList W = new java.util.LinkedList();
    public final boolean[] Z = new boolean[49];

    static {
        new bw5.ae();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ae parseFrom(byte[] bArr) {
        return (bw5.ae) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ae)) {
            return false;
        }
        bw5.ae aeVar = (bw5.ae) fVar;
        return n51.f.a(this.f25144d, aeVar.f25144d) && n51.f.a(this.f25145e, aeVar.f25145e) && n51.f.a(this.f25146f, aeVar.f25146f) && n51.f.a(java.lang.Long.valueOf(this.f25147g), java.lang.Long.valueOf(aeVar.f25147g)) && n51.f.a(this.f25148h, aeVar.f25148h) && n51.f.a(java.lang.Integer.valueOf(this.f25149i), java.lang.Integer.valueOf(aeVar.f25149i)) && n51.f.a(java.lang.Integer.valueOf(this.f25150m), java.lang.Integer.valueOf(aeVar.f25150m)) && n51.f.a(this.f25151n, aeVar.f25151n) && n51.f.a(this.f25152o, aeVar.f25152o) && n51.f.a(java.lang.Integer.valueOf(this.f25153p), java.lang.Integer.valueOf(aeVar.f25153p)) && n51.f.a(java.lang.Integer.valueOf(this.f25154q), java.lang.Integer.valueOf(aeVar.f25154q)) && n51.f.a(this.f25155r, aeVar.f25155r) && n51.f.a(java.lang.Integer.valueOf(this.f25156s), java.lang.Integer.valueOf(aeVar.f25156s)) && n51.f.a(this.f25157t, aeVar.f25157t) && n51.f.a(java.lang.Integer.valueOf(this.f25158u), java.lang.Integer.valueOf(aeVar.f25158u)) && n51.f.a(this.f25159v, aeVar.f25159v) && n51.f.a(java.lang.Integer.valueOf(this.f25160w), java.lang.Integer.valueOf(aeVar.f25160w)) && n51.f.a(this.f25161x, aeVar.f25161x) && n51.f.a(java.lang.Integer.valueOf(this.f25162y), java.lang.Integer.valueOf(aeVar.f25162y)) && n51.f.a(this.f25163z, aeVar.f25163z) && n51.f.a(this.A, aeVar.A) && n51.f.a(this.B, aeVar.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(aeVar.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(aeVar.D)) && n51.f.a(this.E, aeVar.E) && n51.f.a(this.F, aeVar.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(aeVar.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(aeVar.H)) && n51.f.a(this.I, aeVar.I) && n51.f.a(this.f25143J, aeVar.f25143J) && n51.f.a(this.K, aeVar.K) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(aeVar.L)) && n51.f.a(this.M, aeVar.M) && n51.f.a(this.N, aeVar.N) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(aeVar.P)) && n51.f.a(java.lang.Integer.valueOf(this.Q), java.lang.Integer.valueOf(aeVar.Q)) && n51.f.a(java.lang.Integer.valueOf(this.R), java.lang.Integer.valueOf(aeVar.R)) && n51.f.a(java.lang.Long.valueOf(this.S), java.lang.Long.valueOf(aeVar.S)) && n51.f.a(java.lang.Long.valueOf(this.T), java.lang.Long.valueOf(aeVar.T)) && n51.f.a(this.U, aeVar.U) && n51.f.a(this.V, aeVar.V) && n51.f.a(this.W, aeVar.W) && n51.f.a(this.X, aeVar.X) && n51.f.a(this.Y, aeVar.Y);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ae();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.Z;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25144d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f25145e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f25146f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.h(4, this.f25147g);
            }
            java.lang.String str4 = this.f25148h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            if (zArr[6]) {
                fVar.f(6, this.f25149i);
            }
            if (zArr[7]) {
                fVar.f(7, this.f25150m);
            }
            bw5.lc lcVar = this.f25151n;
            if (lcVar != null && zArr[8]) {
                fVar.i(8, lcVar.computeSize());
                this.f25151n.writeFields(fVar);
            }
            java.lang.String str5 = this.f25152o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            if (zArr[10]) {
                fVar.f(10, this.f25153p);
            }
            if (zArr[11]) {
                fVar.f(11, this.f25154q);
            }
            bw5.ce ceVar = this.f25155r;
            if (ceVar != null && zArr[12]) {
                fVar.i(12, ceVar.computeSize());
                this.f25155r.writeFields(fVar);
            }
            if (zArr[13]) {
                fVar.f(13, this.f25156s);
            }
            bw5.wt wtVar = this.f25157t;
            if (wtVar != null && zArr[14]) {
                fVar.i(14, wtVar.computeSize());
                this.f25157t.writeFields(fVar);
            }
            if (zArr[15]) {
                fVar.f(15, this.f25158u);
            }
            bw5.ee eeVar = this.f25159v;
            if (eeVar != null && zArr[16]) {
                fVar.i(16, eeVar.computeSize());
                this.f25159v.writeFields(fVar);
            }
            if (zArr[17]) {
                fVar.f(17, this.f25160w);
            }
            java.lang.String str6 = this.f25161x;
            if (str6 != null && zArr[18]) {
                fVar.j(18, str6);
            }
            if (zArr[19]) {
                fVar.f(19, this.f25162y);
            }
            bw5.rn rnVar = this.f25163z;
            if (rnVar != null && zArr[20]) {
                fVar.i(20, rnVar.computeSize());
                this.f25163z.writeFields(fVar);
            }
            java.lang.String str7 = this.A;
            if (str7 != null && zArr[21]) {
                fVar.j(21, str7);
            }
            bw5.de deVar = this.B;
            if (deVar != null && zArr[22]) {
                fVar.i(22, deVar.computeSize());
                this.B.writeFields(fVar);
            }
            if (zArr[23]) {
                fVar.f(23, this.C);
            }
            if (zArr[24]) {
                fVar.f(24, this.D);
            }
            java.lang.String str8 = this.E;
            if (str8 != null && zArr[25]) {
                fVar.j(25, str8);
            }
            java.lang.String str9 = this.F;
            if (str9 != null && zArr[26]) {
                fVar.j(26, str9);
            }
            if (zArr[27]) {
                fVar.f(27, this.G);
            }
            if (zArr[28]) {
                fVar.f(28, this.H);
            }
            bw5.wg wgVar = this.I;
            if (wgVar != null && zArr[29]) {
                fVar.i(29, wgVar.computeSize());
                this.I.writeFields(fVar);
            }
            fVar.g(30, 8, this.f25143J);
            java.lang.String str10 = this.K;
            if (str10 != null && zArr[31]) {
                fVar.j(31, str10);
            }
            if (zArr[32]) {
                fVar.f(32, this.L);
            }
            bw5.p pVar = this.M;
            if (pVar != null && zArr[33]) {
                fVar.i(33, pVar.computeSize());
                this.M.writeFields(fVar);
            }
            fVar.g(34, 8, this.N);
            if (zArr[35]) {
                fVar.f(35, this.P);
            }
            if (zArr[36]) {
                fVar.f(36, this.Q);
            }
            if (zArr[37]) {
                fVar.f(37, this.R);
            }
            if (zArr[38]) {
                fVar.h(38, this.S);
            }
            if (zArr[40]) {
                fVar.h(40, this.T);
            }
            bw5.be beVar = this.U;
            if (beVar != null && zArr[43]) {
                fVar.i(43, beVar.computeSize());
                this.U.writeFields(fVar);
            }
            bw5.he heVar = this.V;
            if (heVar != null && zArr[44]) {
                fVar.i(44, heVar.computeSize());
                this.V.writeFields(fVar);
            }
            fVar.g(46, 8, this.W);
            bw5.dh dhVar = this.X;
            if (dhVar != null && zArr[47]) {
                fVar.i(47, dhVar.computeSize());
                this.X.writeFields(fVar);
            }
            java.lang.String str11 = this.Y;
            if (str11 != null && zArr[48]) {
                fVar.j(48, str11);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f25144d;
            if (str12 != null && zArr[1]) {
                i18 = b36.f.j(1, str12) + 0;
            }
            java.lang.String str13 = this.f25145e;
            if (str13 != null && zArr[2]) {
                i18 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f25146f;
            if (str14 != null && zArr[3]) {
                i18 += b36.f.j(3, str14);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f25147g);
            }
            java.lang.String str15 = this.f25148h;
            if (str15 != null && zArr[5]) {
                i18 += b36.f.j(5, str15);
            }
            if (zArr[6]) {
                i18 += b36.f.f(6, this.f25149i);
            }
            if (zArr[7]) {
                i18 += b36.f.f(7, this.f25150m);
            }
            bw5.lc lcVar2 = this.f25151n;
            if (lcVar2 != null && zArr[8]) {
                i18 += b36.f.i(8, lcVar2.computeSize());
            }
            java.lang.String str16 = this.f25152o;
            if (str16 != null && zArr[9]) {
                i18 += b36.f.j(9, str16);
            }
            if (zArr[10]) {
                i18 += b36.f.f(10, this.f25153p);
            }
            if (zArr[11]) {
                i18 += b36.f.f(11, this.f25154q);
            }
            bw5.ce ceVar2 = this.f25155r;
            if (ceVar2 != null && zArr[12]) {
                i18 += b36.f.i(12, ceVar2.computeSize());
            }
            if (zArr[13]) {
                i18 += b36.f.f(13, this.f25156s);
            }
            bw5.wt wtVar2 = this.f25157t;
            if (wtVar2 != null && zArr[14]) {
                i18 += b36.f.i(14, wtVar2.computeSize());
            }
            if (zArr[15]) {
                i18 += b36.f.f(15, this.f25158u);
            }
            bw5.ee eeVar2 = this.f25159v;
            if (eeVar2 != null && zArr[16]) {
                i18 += b36.f.i(16, eeVar2.computeSize());
            }
            if (zArr[17]) {
                i18 += b36.f.f(17, this.f25160w);
            }
            java.lang.String str17 = this.f25161x;
            if (str17 != null && zArr[18]) {
                i18 += b36.f.j(18, str17);
            }
            if (zArr[19]) {
                i18 += b36.f.f(19, this.f25162y);
            }
            bw5.rn rnVar2 = this.f25163z;
            if (rnVar2 != null && zArr[20]) {
                i18 += b36.f.i(20, rnVar2.computeSize());
            }
            java.lang.String str18 = this.A;
            if (str18 != null && zArr[21]) {
                i18 += b36.f.j(21, str18);
            }
            bw5.de deVar2 = this.B;
            if (deVar2 != null && zArr[22]) {
                i18 += b36.f.i(22, deVar2.computeSize());
            }
            if (zArr[23]) {
                i18 += b36.f.f(23, this.C);
            }
            if (zArr[24]) {
                i18 += b36.f.f(24, this.D);
            }
            java.lang.String str19 = this.E;
            if (str19 != null && zArr[25]) {
                i18 += b36.f.j(25, str19);
            }
            java.lang.String str20 = this.F;
            if (str20 != null && zArr[26]) {
                i18 += b36.f.j(26, str20);
            }
            if (zArr[27]) {
                i18 += b36.f.f(27, this.G);
            }
            if (zArr[28]) {
                i18 += b36.f.f(28, this.H);
            }
            bw5.wg wgVar2 = this.I;
            if (wgVar2 != null && zArr[29]) {
                i18 += b36.f.i(29, wgVar2.computeSize());
            }
            int g17 = i18 + b36.f.g(30, 8, this.f25143J);
            java.lang.String str21 = this.K;
            if (str21 != null && zArr[31]) {
                g17 += b36.f.j(31, str21);
            }
            if (zArr[32]) {
                g17 += b36.f.f(32, this.L);
            }
            bw5.p pVar2 = this.M;
            if (pVar2 != null && zArr[33]) {
                g17 += b36.f.i(33, pVar2.computeSize());
            }
            int g18 = g17 + b36.f.g(34, 8, this.N);
            if (zArr[35]) {
                g18 += b36.f.f(35, this.P);
            }
            if (zArr[36]) {
                g18 += b36.f.f(36, this.Q);
            }
            if (zArr[37]) {
                g18 += b36.f.f(37, this.R);
            }
            if (zArr[38]) {
                g18 += b36.f.h(38, this.S);
            }
            if (zArr[40]) {
                g18 += b36.f.h(40, this.T);
            }
            bw5.be beVar2 = this.U;
            if (beVar2 != null && zArr[43]) {
                g18 += b36.f.i(43, beVar2.computeSize());
            }
            bw5.he heVar2 = this.V;
            if (heVar2 != null && zArr[44]) {
                g18 += b36.f.i(44, heVar2.computeSize());
            }
            int g19 = g18 + b36.f.g(46, 8, this.W);
            bw5.dh dhVar2 = this.X;
            if (dhVar2 != null && zArr[47]) {
                g19 += b36.f.i(47, dhVar2.computeSize());
            }
            java.lang.String str22 = this.Y;
            return (str22 == null || !zArr[48]) ? g19 : g19 + b36.f.j(48, str22);
        }
        if (i17 == 2) {
            this.f25143J.clear();
            this.N.clear();
            this.W.clear();
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
                this.f25144d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25145e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25146f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25147g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25148h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25149i = aVar2.h(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25150m = aVar2.h(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.lc lcVar3 = new bw5.lc();
                    if (bArr != null && bArr.length > 0) {
                        lcVar3.parseFrom(bArr);
                    }
                    this.f25151n = lcVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f25152o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f25153p = aVar2.h(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f25154q = aVar2.h(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.ce ceVar3 = new bw5.ce();
                    if (bArr2 != null && bArr2.length > 0) {
                        ceVar3.parseFrom(bArr2);
                    }
                    this.f25155r = ceVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f25156s = aVar2.h(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.wt wtVar3 = new bw5.wt();
                    if (bArr3 != null && bArr3.length > 0) {
                        wtVar3.parseFrom(bArr3);
                    }
                    this.f25157t = wtVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f25158u = aVar2.h(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.ee eeVar3 = new bw5.ee();
                    if (bArr4 != null && bArr4.length > 0) {
                        eeVar3.parseFrom(bArr4);
                    }
                    this.f25159v = eeVar3;
                }
                zArr[16] = true;
                return 0;
            case 17:
                this.f25160w = aVar2.h(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f25161x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f25162y = aVar2.h(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.rn rnVar3 = new bw5.rn();
                    if (bArr5 != null && bArr5.length > 0) {
                        rnVar3.parseFrom(bArr5);
                    }
                    this.f25163z = rnVar3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.de deVar3 = new bw5.de();
                    if (bArr6 != null && bArr6.length > 0) {
                        deVar3.parseFrom(bArr6);
                    }
                    this.B = deVar3;
                }
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.h(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.h(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.k(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.k(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.G = aVar2.h(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.H = aVar2.h(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.wg wgVar3 = new bw5.wg();
                    if (bArr7 != null && bArr7.length > 0) {
                        wgVar3.parseFrom(bArr7);
                    }
                    this.I = wgVar3;
                }
                zArr[29] = true;
                return 0;
            case 30:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.tc tcVar = new bw5.tc();
                    if (bArr8 != null && bArr8.length > 0) {
                        tcVar.parseFrom(bArr8);
                    }
                    this.f25143J.add(tcVar);
                }
                zArr[30] = true;
                return 0;
            case 31:
                this.K = aVar2.k(intValue);
                zArr[31] = true;
                return 0;
            case 32:
                this.L = aVar2.h(intValue);
                zArr[32] = true;
                return 0;
            case 33:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.p pVar3 = new bw5.p();
                    if (bArr9 != null && bArr9.length > 0) {
                        pVar3.parseFrom(bArr9);
                    }
                    this.M = pVar3;
                }
                zArr[33] = true;
                return 0;
            case 34:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.pj pjVar = new bw5.pj();
                    if (bArr10 != null && bArr10.length > 0) {
                        pjVar.parseFrom(bArr10);
                    }
                    this.N.add(pjVar);
                }
                zArr[34] = true;
                return 0;
            case 35:
                this.P = aVar2.h(intValue);
                zArr[35] = true;
                return 0;
            case 36:
                this.Q = aVar2.h(intValue);
                zArr[36] = true;
                return 0;
            case 37:
                this.R = aVar2.h(intValue);
                zArr[37] = true;
                return 0;
            case 38:
                this.S = aVar2.i(intValue);
                zArr[38] = true;
                return 0;
            case 39:
            case 41:
            case 42:
            case 45:
            default:
                return -1;
            case 40:
                this.T = aVar2.i(intValue);
                zArr[40] = true;
                return 0;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.be beVar3 = new bw5.be();
                    if (bArr11 != null && bArr11.length > 0) {
                        beVar3.parseFrom(bArr11);
                    }
                    this.U = beVar3;
                }
                zArr[43] = true;
                return 0;
            case 44:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.he heVar3 = new bw5.he();
                    if (bArr12 != null && bArr12.length > 0) {
                        heVar3.parseFrom(bArr12);
                    }
                    this.V = heVar3;
                }
                zArr[44] = true;
                return 0;
            case 46:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    bw5.hv hvVar = new bw5.hv();
                    if (bArr13 != null && bArr13.length > 0) {
                        hvVar.parseFrom(bArr13);
                    }
                    this.W.add(hvVar);
                }
                zArr[46] = true;
                return 0;
            case 47:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    bw5.dh dhVar3 = new bw5.dh();
                    if (bArr14 != null && bArr14.length > 0) {
                        dhVar3.parseFrom(bArr14);
                    }
                    this.X = dhVar3;
                }
                zArr[47] = true;
                return 0;
            case 48:
                this.Y = aVar2.k(intValue);
                zArr[48] = true;
                return 0;
        }
    }
}
