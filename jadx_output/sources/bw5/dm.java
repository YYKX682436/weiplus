package bw5;

/* loaded from: classes2.dex */
public class dm extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public long B;
    public bw5.fm C;
    public java.lang.String D;
    public bw5.pj E;
    public boolean F;
    public boolean G;
    public bw5.bm I;

    /* renamed from: J, reason: collision with root package name */
    public bw5.m4 f26534J;
    public int K;
    public bw5.yl L;
    public boolean M;
    public bw5.m1 N;
    public bw5.w1 P;
    public bw5.x4 Q;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26535d;

    /* renamed from: e, reason: collision with root package name */
    public int f26536e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26537f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26538g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f26539h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f26540i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f26541m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f26542n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f26543o;

    /* renamed from: p, reason: collision with root package name */
    public float f26544p;

    /* renamed from: q, reason: collision with root package name */
    public int f26545q;

    /* renamed from: r, reason: collision with root package name */
    public int f26546r;

    /* renamed from: s, reason: collision with root package name */
    public int f26547s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f26548t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f26549u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26550v;

    /* renamed from: w, reason: collision with root package name */
    public int f26551w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f26552x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f26553y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f26554z;
    public final java.util.LinkedList H = new java.util.LinkedList();
    public final boolean[] R = new boolean[39];

    static {
        new bw5.dm();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dm parseFrom(byte[] bArr) {
        return (bw5.dm) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dm)) {
            return false;
        }
        bw5.dm dmVar = (bw5.dm) fVar;
        return n51.f.a(this.f26535d, dmVar.f26535d) && n51.f.a(java.lang.Integer.valueOf(this.f26536e), java.lang.Integer.valueOf(dmVar.f26536e)) && n51.f.a(this.f26537f, dmVar.f26537f) && n51.f.a(this.f26538g, dmVar.f26538g) && n51.f.a(this.f26539h, dmVar.f26539h) && n51.f.a(this.f26540i, dmVar.f26540i) && n51.f.a(this.f26541m, dmVar.f26541m) && n51.f.a(this.f26542n, dmVar.f26542n) && n51.f.a(this.f26543o, dmVar.f26543o) && n51.f.a(java.lang.Float.valueOf(this.f26544p), java.lang.Float.valueOf(dmVar.f26544p)) && n51.f.a(java.lang.Integer.valueOf(this.f26545q), java.lang.Integer.valueOf(dmVar.f26545q)) && n51.f.a(java.lang.Integer.valueOf(this.f26546r), java.lang.Integer.valueOf(dmVar.f26546r)) && n51.f.a(java.lang.Integer.valueOf(this.f26547s), java.lang.Integer.valueOf(dmVar.f26547s)) && n51.f.a(this.f26548t, dmVar.f26548t) && n51.f.a(this.f26549u, dmVar.f26549u) && n51.f.a(this.f26550v, dmVar.f26550v) && n51.f.a(java.lang.Integer.valueOf(this.f26551w), java.lang.Integer.valueOf(dmVar.f26551w)) && n51.f.a(this.f26552x, dmVar.f26552x) && n51.f.a(this.f26553y, dmVar.f26553y) && n51.f.a(this.f26554z, dmVar.f26554z) && n51.f.a(this.A, dmVar.A) && n51.f.a(java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(dmVar.B)) && n51.f.a(this.C, dmVar.C) && n51.f.a(this.D, dmVar.D) && n51.f.a(this.E, dmVar.E) && n51.f.a(java.lang.Boolean.valueOf(this.F), java.lang.Boolean.valueOf(dmVar.F)) && n51.f.a(java.lang.Boolean.valueOf(this.G), java.lang.Boolean.valueOf(dmVar.G)) && n51.f.a(this.H, dmVar.H) && n51.f.a(this.I, dmVar.I) && n51.f.a(this.f26534J, dmVar.f26534J) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(dmVar.K)) && n51.f.a(this.L, dmVar.L) && n51.f.a(java.lang.Boolean.valueOf(this.M), java.lang.Boolean.valueOf(dmVar.M)) && n51.f.a(this.N, dmVar.N) && n51.f.a(this.P, dmVar.P) && n51.f.a(this.Q, dmVar.Q);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.dm();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.R;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26535d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f26536e);
            }
            java.lang.String str2 = this.f26537f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f26538g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f26539h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f26540i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f26541m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f26542n;
            if (str7 != null && zArr[8]) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f26543o;
            if (str8 != null && zArr[9]) {
                fVar.j(9, str8);
            }
            if (zArr[10]) {
                fVar.d(10, this.f26544p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f26545q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f26546r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f26547s);
            }
            java.lang.String str9 = this.f26548t;
            if (str9 != null && zArr[14]) {
                fVar.j(14, str9);
            }
            java.lang.String str10 = this.f26549u;
            if (str10 != null && zArr[15]) {
                fVar.j(15, str10);
            }
            com.tencent.mm.protobuf.g gVar = this.f26550v;
            if (gVar != null && zArr[16]) {
                fVar.b(16, gVar);
            }
            if (zArr[17]) {
                fVar.e(17, this.f26551w);
            }
            java.lang.String str11 = this.f26552x;
            if (str11 != null && zArr[18]) {
                fVar.j(18, str11);
            }
            java.lang.String str12 = this.f26553y;
            if (str12 != null && zArr[19]) {
                fVar.j(19, str12);
            }
            java.lang.String str13 = this.f26554z;
            if (str13 != null && zArr[21]) {
                fVar.j(21, str13);
            }
            java.lang.String str14 = this.A;
            if (str14 != null && zArr[22]) {
                fVar.j(22, str14);
            }
            if (zArr[23]) {
                fVar.h(23, this.B);
            }
            bw5.fm fmVar = this.C;
            if (fmVar != null && zArr[24]) {
                fVar.i(24, fmVar.computeSize());
                this.C.writeFields(fVar);
            }
            java.lang.String str15 = this.D;
            if (str15 != null && zArr[25]) {
                fVar.j(25, str15);
            }
            bw5.pj pjVar = this.E;
            if (pjVar != null && zArr[26]) {
                fVar.i(26, pjVar.computeSize());
                this.E.writeFields(fVar);
            }
            if (zArr[27]) {
                fVar.a(27, this.F);
            }
            if (zArr[28]) {
                fVar.a(28, this.G);
            }
            fVar.g(29, 8, this.H);
            bw5.bm bmVar = this.I;
            if (bmVar != null && zArr[30]) {
                fVar.i(30, bmVar.computeSize());
                this.I.writeFields(fVar);
            }
            bw5.m4 m4Var = this.f26534J;
            if (m4Var != null && zArr[31]) {
                fVar.i(31, m4Var.computeSize());
                this.f26534J.writeFields(fVar);
            }
            if (zArr[32]) {
                fVar.e(32, this.K);
            }
            bw5.yl ylVar = this.L;
            if (ylVar != null && zArr[33]) {
                fVar.i(33, ylVar.computeSize());
                this.L.writeFields(fVar);
            }
            if (zArr[34]) {
                fVar.a(34, this.M);
            }
            bw5.m1 m1Var = this.N;
            if (m1Var != null && zArr[36]) {
                fVar.i(36, m1Var.computeSize());
                this.N.writeFields(fVar);
            }
            bw5.w1 w1Var = this.P;
            if (w1Var != null && zArr[37]) {
                fVar.i(37, w1Var.computeSize());
                this.P.writeFields(fVar);
            }
            bw5.x4 x4Var = this.Q;
            if (x4Var != null && zArr[38]) {
                fVar.i(38, x4Var.computeSize());
                this.Q.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str16 = this.f26535d;
            if (str16 != null && zArr[1]) {
                i18 = b36.f.j(1, str16) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f26536e);
            }
            java.lang.String str17 = this.f26537f;
            if (str17 != null && zArr[3]) {
                i18 += b36.f.j(3, str17);
            }
            java.lang.String str18 = this.f26538g;
            if (str18 != null && zArr[4]) {
                i18 += b36.f.j(4, str18);
            }
            java.lang.String str19 = this.f26539h;
            if (str19 != null && zArr[5]) {
                i18 += b36.f.j(5, str19);
            }
            java.lang.String str20 = this.f26540i;
            if (str20 != null && zArr[6]) {
                i18 += b36.f.j(6, str20);
            }
            java.lang.String str21 = this.f26541m;
            if (str21 != null && zArr[7]) {
                i18 += b36.f.j(7, str21);
            }
            java.lang.String str22 = this.f26542n;
            if (str22 != null && zArr[8]) {
                i18 += b36.f.j(8, str22);
            }
            java.lang.String str23 = this.f26543o;
            if (str23 != null && zArr[9]) {
                i18 += b36.f.j(9, str23);
            }
            if (zArr[10]) {
                i18 += b36.f.d(10, this.f26544p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f26545q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f26546r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f26547s);
            }
            java.lang.String str24 = this.f26548t;
            if (str24 != null && zArr[14]) {
                i18 += b36.f.j(14, str24);
            }
            java.lang.String str25 = this.f26549u;
            if (str25 != null && zArr[15]) {
                i18 += b36.f.j(15, str25);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f26550v;
            if (gVar2 != null && zArr[16]) {
                i18 += b36.f.b(16, gVar2);
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f26551w);
            }
            java.lang.String str26 = this.f26552x;
            if (str26 != null && zArr[18]) {
                i18 += b36.f.j(18, str26);
            }
            java.lang.String str27 = this.f26553y;
            if (str27 != null && zArr[19]) {
                i18 += b36.f.j(19, str27);
            }
            java.lang.String str28 = this.f26554z;
            if (str28 != null && zArr[21]) {
                i18 += b36.f.j(21, str28);
            }
            java.lang.String str29 = this.A;
            if (str29 != null && zArr[22]) {
                i18 += b36.f.j(22, str29);
            }
            if (zArr[23]) {
                i18 += b36.f.h(23, this.B);
            }
            bw5.fm fmVar2 = this.C;
            if (fmVar2 != null && zArr[24]) {
                i18 += b36.f.i(24, fmVar2.computeSize());
            }
            java.lang.String str30 = this.D;
            if (str30 != null && zArr[25]) {
                i18 += b36.f.j(25, str30);
            }
            bw5.pj pjVar2 = this.E;
            if (pjVar2 != null && zArr[26]) {
                i18 += b36.f.i(26, pjVar2.computeSize());
            }
            if (zArr[27]) {
                i18 += b36.f.a(27, this.F);
            }
            if (zArr[28]) {
                i18 += b36.f.a(28, this.G);
            }
            int g17 = i18 + b36.f.g(29, 8, this.H);
            bw5.bm bmVar2 = this.I;
            if (bmVar2 != null && zArr[30]) {
                g17 += b36.f.i(30, bmVar2.computeSize());
            }
            bw5.m4 m4Var2 = this.f26534J;
            if (m4Var2 != null && zArr[31]) {
                g17 += b36.f.i(31, m4Var2.computeSize());
            }
            if (zArr[32]) {
                g17 += b36.f.e(32, this.K);
            }
            bw5.yl ylVar2 = this.L;
            if (ylVar2 != null && zArr[33]) {
                g17 += b36.f.i(33, ylVar2.computeSize());
            }
            if (zArr[34]) {
                g17 += b36.f.a(34, this.M);
            }
            bw5.m1 m1Var2 = this.N;
            if (m1Var2 != null && zArr[36]) {
                g17 += b36.f.i(36, m1Var2.computeSize());
            }
            bw5.w1 w1Var2 = this.P;
            if (w1Var2 != null && zArr[37]) {
                g17 += b36.f.i(37, w1Var2.computeSize());
            }
            bw5.x4 x4Var2 = this.Q;
            return (x4Var2 == null || !zArr[38]) ? g17 : g17 + b36.f.i(38, x4Var2.computeSize());
        }
        if (i17 == 2) {
            this.H.clear();
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
                this.f26535d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26536e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26537f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26538g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26539h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26540i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26541m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f26542n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f26543o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f26544p = aVar2.f(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f26545q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f26546r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f26547s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f26548t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f26549u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f26550v = aVar2.d(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f26551w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f26552x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f26553y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
            case 35:
            default:
                return -1;
            case 21:
                this.f26554z = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.A = aVar2.k(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.B = aVar2.i(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.fm fmVar3 = new bw5.fm();
                    if (bArr != null && bArr.length > 0) {
                        fmVar3.parseFrom(bArr);
                    }
                    this.C = fmVar3;
                }
                zArr[24] = true;
                return 0;
            case 25:
                this.D = aVar2.k(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.pj pjVar3 = new bw5.pj();
                    if (bArr2 != null && bArr2.length > 0) {
                        pjVar3.parseFrom(bArr2);
                    }
                    this.E = pjVar3;
                }
                zArr[26] = true;
                return 0;
            case 27:
                this.F = aVar2.c(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.G = aVar2.c(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.zl zlVar = new bw5.zl();
                    if (bArr3 != null && bArr3.length > 0) {
                        zlVar.parseFrom(bArr3);
                    }
                    this.H.add(zlVar);
                }
                zArr[29] = true;
                return 0;
            case 30:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.bm bmVar3 = new bw5.bm();
                    if (bArr4 != null && bArr4.length > 0) {
                        bmVar3.parseFrom(bArr4);
                    }
                    this.I = bmVar3;
                }
                zArr[30] = true;
                return 0;
            case 31:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.m4 m4Var3 = new bw5.m4();
                    if (bArr5 != null && bArr5.length > 0) {
                        m4Var3.parseFrom(bArr5);
                    }
                    this.f26534J = m4Var3;
                }
                zArr[31] = true;
                return 0;
            case 32:
                this.K = aVar2.g(intValue);
                zArr[32] = true;
                return 0;
            case 33:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.yl ylVar3 = new bw5.yl();
                    if (bArr6 != null && bArr6.length > 0) {
                        ylVar3.parseFrom(bArr6);
                    }
                    this.L = ylVar3;
                }
                zArr[33] = true;
                return 0;
            case 34:
                this.M = aVar2.c(intValue);
                zArr[34] = true;
                return 0;
            case 36:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.m1 m1Var3 = new bw5.m1();
                    if (bArr7 != null && bArr7.length > 0) {
                        m1Var3.parseFrom(bArr7);
                    }
                    this.N = m1Var3;
                }
                zArr[36] = true;
                return 0;
            case 37:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.w1 w1Var3 = new bw5.w1();
                    if (bArr8 != null && bArr8.length > 0) {
                        w1Var3.parseFrom(bArr8);
                    }
                    this.P = w1Var3;
                }
                zArr[37] = true;
                return 0;
            case 38:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.x4 x4Var3 = new bw5.x4();
                    if (bArr9 != null && bArr9.length > 0) {
                        x4Var3.parseFrom(bArr9);
                    }
                    this.Q = x4Var3;
                }
                zArr[38] = true;
                return 0;
        }
    }
}
