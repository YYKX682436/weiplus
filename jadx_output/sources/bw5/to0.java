package bw5;

/* loaded from: classes2.dex */
public class to0 extends com.tencent.mm.protobuf.f {
    public int A;
    public bw5.es0 B;
    public int C;
    public bw5.h30 D;
    public bw5.mk0 E;
    public java.lang.String F;
    public boolean G;
    public bw5.m10 H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f33545J;
    public java.lang.String K;
    public bw5.rj0 L;
    public java.lang.String M;
    public java.lang.String N;
    public bw5.ck0 P;
    public final boolean[] Q = new boolean[36];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33546d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33547e;

    /* renamed from: f, reason: collision with root package name */
    public int f33548f;

    /* renamed from: g, reason: collision with root package name */
    public int f33549g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f33550h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.b40 f33551i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.o1 f33552m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.g4 f33553n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f33554o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f33555p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f33556q;

    /* renamed from: r, reason: collision with root package name */
    public int f33557r;

    /* renamed from: s, reason: collision with root package name */
    public int f33558s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f33559t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.r f33560u;

    /* renamed from: v, reason: collision with root package name */
    public int f33561v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.fo0 f33562w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f33563x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f33564y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.bs0 f33565z;

    static {
        new bw5.to0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.to0 parseFrom(byte[] bArr) {
        return (bw5.to0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.to0)) {
            return false;
        }
        bw5.to0 to0Var = (bw5.to0) fVar;
        return n51.f.a(this.f33546d, to0Var.f33546d) && n51.f.a(this.f33547e, to0Var.f33547e) && n51.f.a(java.lang.Integer.valueOf(this.f33548f), java.lang.Integer.valueOf(to0Var.f33548f)) && n51.f.a(java.lang.Integer.valueOf(this.f33549g), java.lang.Integer.valueOf(to0Var.f33549g)) && n51.f.a(this.f33550h, to0Var.f33550h) && n51.f.a(this.f33551i, to0Var.f33551i) && n51.f.a(this.f33552m, to0Var.f33552m) && n51.f.a(this.f33553n, to0Var.f33553n) && n51.f.a(this.f33554o, to0Var.f33554o) && n51.f.a(this.f33555p, to0Var.f33555p) && n51.f.a(this.f33556q, to0Var.f33556q) && n51.f.a(java.lang.Integer.valueOf(this.f33557r), java.lang.Integer.valueOf(to0Var.f33557r)) && n51.f.a(java.lang.Integer.valueOf(this.f33558s), java.lang.Integer.valueOf(to0Var.f33558s)) && n51.f.a(this.f33559t, to0Var.f33559t) && n51.f.a(this.f33560u, to0Var.f33560u) && n51.f.a(java.lang.Integer.valueOf(this.f33561v), java.lang.Integer.valueOf(to0Var.f33561v)) && n51.f.a(this.f33562w, to0Var.f33562w) && n51.f.a(this.f33563x, to0Var.f33563x) && n51.f.a(this.f33564y, to0Var.f33564y) && n51.f.a(this.f33565z, to0Var.f33565z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(to0Var.A)) && n51.f.a(this.B, to0Var.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(to0Var.C)) && n51.f.a(this.D, to0Var.D) && n51.f.a(this.E, to0Var.E) && n51.f.a(this.F, to0Var.F) && n51.f.a(java.lang.Boolean.valueOf(this.G), java.lang.Boolean.valueOf(to0Var.G)) && n51.f.a(this.H, to0Var.H) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(to0Var.I)) && n51.f.a(java.lang.Integer.valueOf(this.f33545J), java.lang.Integer.valueOf(to0Var.f33545J)) && n51.f.a(this.K, to0Var.K) && n51.f.a(this.L, to0Var.L) && n51.f.a(this.M, to0Var.M) && n51.f.a(this.N, to0Var.N) && n51.f.a(this.P, to0Var.P);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.to0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.Q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33546d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f33547e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33548f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f33549g);
            }
            java.lang.String str3 = this.f33550h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            bw5.b40 b40Var = this.f33551i;
            if (b40Var != null && zArr[6]) {
                fVar.i(6, b40Var.computeSize());
                this.f33551i.writeFields(fVar);
            }
            bw5.o1 o1Var = this.f33552m;
            if (o1Var != null && zArr[7]) {
                fVar.i(7, o1Var.computeSize());
                this.f33552m.writeFields(fVar);
            }
            bw5.g4 g4Var = this.f33553n;
            if (g4Var != null && zArr[8]) {
                fVar.i(8, g4Var.computeSize());
                this.f33553n.writeFields(fVar);
            }
            java.lang.String str4 = this.f33554o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f33555p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f33556q;
            if (str6 != null && zArr[11]) {
                fVar.j(11, str6);
            }
            if (zArr[12]) {
                fVar.e(12, this.f33557r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f33558s);
            }
            java.lang.String str7 = this.f33559t;
            if (str7 != null && zArr[14]) {
                fVar.j(14, str7);
            }
            bw5.r rVar = this.f33560u;
            if (rVar != null && zArr[15]) {
                fVar.i(15, rVar.computeSize());
                this.f33560u.writeFields(fVar);
            }
            if (zArr[16]) {
                fVar.e(16, this.f33561v);
            }
            bw5.fo0 fo0Var = this.f33562w;
            if (fo0Var != null && zArr[17]) {
                fVar.i(17, fo0Var.computeSize());
                this.f33562w.writeFields(fVar);
            }
            java.lang.String str8 = this.f33563x;
            if (str8 != null && zArr[18]) {
                fVar.j(18, str8);
            }
            java.lang.String str9 = this.f33564y;
            if (str9 != null && zArr[19]) {
                fVar.j(19, str9);
            }
            bw5.bs0 bs0Var = this.f33565z;
            if (bs0Var != null && zArr[20]) {
                fVar.i(20, bs0Var.computeSize());
                this.f33565z.writeFields(fVar);
            }
            if (zArr[21]) {
                fVar.e(21, this.A);
            }
            bw5.es0 es0Var = this.B;
            if (es0Var != null && zArr[22]) {
                fVar.i(22, es0Var.computeSize());
                this.B.writeFields(fVar);
            }
            if (zArr[23]) {
                fVar.e(23, this.C);
            }
            bw5.h30 h30Var = this.D;
            if (h30Var != null && zArr[24]) {
                fVar.i(24, h30Var.computeSize());
                this.D.writeFields(fVar);
            }
            bw5.mk0 mk0Var = this.E;
            if (mk0Var != null && zArr[25]) {
                fVar.i(25, mk0Var.computeSize());
                this.E.writeFields(fVar);
            }
            java.lang.String str10 = this.F;
            if (str10 != null && zArr[26]) {
                fVar.j(26, str10);
            }
            if (zArr[27]) {
                fVar.a(27, this.G);
            }
            bw5.m10 m10Var = this.H;
            if (m10Var != null && zArr[28]) {
                fVar.i(28, m10Var.computeSize());
                this.H.writeFields(fVar);
            }
            if (zArr[29]) {
                fVar.e(29, this.I);
            }
            if (zArr[30]) {
                fVar.e(30, this.f33545J);
            }
            java.lang.String str11 = this.K;
            if (str11 != null && zArr[31]) {
                fVar.j(31, str11);
            }
            bw5.rj0 rj0Var = this.L;
            if (rj0Var != null && zArr[32]) {
                fVar.i(32, rj0Var.computeSize());
                this.L.writeFields(fVar);
            }
            java.lang.String str12 = this.M;
            if (str12 != null && zArr[33]) {
                fVar.j(33, str12);
            }
            java.lang.String str13 = this.N;
            if (str13 != null && zArr[34]) {
                fVar.j(34, str13);
            }
            bw5.ck0 ck0Var = this.P;
            if (ck0Var != null && zArr[35]) {
                fVar.i(35, ck0Var.computeSize());
                this.P.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str14 = this.f33546d;
            if (str14 != null && zArr[1]) {
                i18 = b36.f.j(1, str14) + 0;
            }
            java.lang.String str15 = this.f33547e;
            if (str15 != null && zArr[2]) {
                i18 += b36.f.j(2, str15);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f33548f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f33549g);
            }
            java.lang.String str16 = this.f33550h;
            if (str16 != null && zArr[5]) {
                i18 += b36.f.j(5, str16);
            }
            bw5.b40 b40Var2 = this.f33551i;
            if (b40Var2 != null && zArr[6]) {
                i18 += b36.f.i(6, b40Var2.computeSize());
            }
            bw5.o1 o1Var2 = this.f33552m;
            if (o1Var2 != null && zArr[7]) {
                i18 += b36.f.i(7, o1Var2.computeSize());
            }
            bw5.g4 g4Var2 = this.f33553n;
            if (g4Var2 != null && zArr[8]) {
                i18 += b36.f.i(8, g4Var2.computeSize());
            }
            java.lang.String str17 = this.f33554o;
            if (str17 != null && zArr[9]) {
                i18 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f33555p;
            if (str18 != null && zArr[10]) {
                i18 += b36.f.j(10, str18);
            }
            java.lang.String str19 = this.f33556q;
            if (str19 != null && zArr[11]) {
                i18 += b36.f.j(11, str19);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f33557r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f33558s);
            }
            java.lang.String str20 = this.f33559t;
            if (str20 != null && zArr[14]) {
                i18 += b36.f.j(14, str20);
            }
            bw5.r rVar2 = this.f33560u;
            if (rVar2 != null && zArr[15]) {
                i18 += b36.f.i(15, rVar2.computeSize());
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f33561v);
            }
            bw5.fo0 fo0Var2 = this.f33562w;
            if (fo0Var2 != null && zArr[17]) {
                i18 += b36.f.i(17, fo0Var2.computeSize());
            }
            java.lang.String str21 = this.f33563x;
            if (str21 != null && zArr[18]) {
                i18 += b36.f.j(18, str21);
            }
            java.lang.String str22 = this.f33564y;
            if (str22 != null && zArr[19]) {
                i18 += b36.f.j(19, str22);
            }
            bw5.bs0 bs0Var2 = this.f33565z;
            if (bs0Var2 != null && zArr[20]) {
                i18 += b36.f.i(20, bs0Var2.computeSize());
            }
            if (zArr[21]) {
                i18 += b36.f.e(21, this.A);
            }
            bw5.es0 es0Var2 = this.B;
            if (es0Var2 != null && zArr[22]) {
                i18 += b36.f.i(22, es0Var2.computeSize());
            }
            if (zArr[23]) {
                i18 += b36.f.e(23, this.C);
            }
            bw5.h30 h30Var2 = this.D;
            if (h30Var2 != null && zArr[24]) {
                i18 += b36.f.i(24, h30Var2.computeSize());
            }
            bw5.mk0 mk0Var2 = this.E;
            if (mk0Var2 != null && zArr[25]) {
                i18 += b36.f.i(25, mk0Var2.computeSize());
            }
            java.lang.String str23 = this.F;
            if (str23 != null && zArr[26]) {
                i18 += b36.f.j(26, str23);
            }
            if (zArr[27]) {
                i18 += b36.f.a(27, this.G);
            }
            bw5.m10 m10Var2 = this.H;
            if (m10Var2 != null && zArr[28]) {
                i18 += b36.f.i(28, m10Var2.computeSize());
            }
            if (zArr[29]) {
                i18 += b36.f.e(29, this.I);
            }
            if (zArr[30]) {
                i18 += b36.f.e(30, this.f33545J);
            }
            java.lang.String str24 = this.K;
            if (str24 != null && zArr[31]) {
                i18 += b36.f.j(31, str24);
            }
            bw5.rj0 rj0Var2 = this.L;
            if (rj0Var2 != null && zArr[32]) {
                i18 += b36.f.i(32, rj0Var2.computeSize());
            }
            java.lang.String str25 = this.M;
            if (str25 != null && zArr[33]) {
                i18 += b36.f.j(33, str25);
            }
            java.lang.String str26 = this.N;
            if (str26 != null && zArr[34]) {
                i18 += b36.f.j(34, str26);
            }
            bw5.ck0 ck0Var2 = this.P;
            return (ck0Var2 == null || !zArr[35]) ? i18 : i18 + b36.f.i(35, ck0Var2.computeSize());
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
                this.f33546d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33547e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33548f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33549g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33550h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.b40 b40Var3 = new bw5.b40();
                    if (bArr != null && bArr.length > 0) {
                        b40Var3.parseFrom(bArr);
                    }
                    this.f33551i = b40Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.o1 o1Var3 = new bw5.o1();
                    if (bArr2 != null && bArr2.length > 0) {
                        o1Var3.parseFrom(bArr2);
                    }
                    this.f33552m = o1Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.g4 g4Var3 = new bw5.g4();
                    if (bArr3 != null && bArr3.length > 0) {
                        g4Var3.parseFrom(bArr3);
                    }
                    this.f33553n = g4Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f33554o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f33555p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f33556q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f33557r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f33558s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f33559t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.r rVar3 = new bw5.r();
                    if (bArr4 != null && bArr4.length > 0) {
                        rVar3.parseFrom(bArr4);
                    }
                    this.f33560u = rVar3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                this.f33561v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.fo0 fo0Var3 = new bw5.fo0();
                    if (bArr5 != null && bArr5.length > 0) {
                        fo0Var3.parseFrom(bArr5);
                    }
                    this.f33562w = fo0Var3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                this.f33563x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f33564y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.bs0 bs0Var3 = new bw5.bs0();
                    if (bArr6 != null && bArr6.length > 0) {
                        bs0Var3.parseFrom(bArr6);
                    }
                    this.f33565z = bs0Var3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.es0 es0Var3 = new bw5.es0();
                    if (bArr7 != null && bArr7.length > 0) {
                        es0Var3.parseFrom(bArr7);
                    }
                    this.B = es0Var3;
                }
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.g(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.h30 h30Var3 = new bw5.h30();
                    if (bArr8 != null && bArr8.length > 0) {
                        h30Var3.parseFrom(bArr8);
                    }
                    this.D = h30Var3;
                }
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.mk0 mk0Var3 = new bw5.mk0();
                    if (bArr9 != null && bArr9.length > 0) {
                        mk0Var3.parseFrom(bArr9);
                    }
                    this.E = mk0Var3;
                }
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.k(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.G = aVar2.c(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.m10 m10Var3 = new bw5.m10();
                    if (bArr10 != null && bArr10.length > 0) {
                        m10Var3.parseFrom(bArr10);
                    }
                    this.H = m10Var3;
                }
                zArr[28] = true;
                return 0;
            case 29:
                this.I = aVar2.g(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                this.f33545J = aVar2.g(intValue);
                zArr[30] = true;
                return 0;
            case 31:
                this.K = aVar2.k(intValue);
                zArr[31] = true;
                return 0;
            case 32:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.rj0 rj0Var3 = new bw5.rj0();
                    if (bArr11 != null && bArr11.length > 0) {
                        rj0Var3.parseFrom(bArr11);
                    }
                    this.L = rj0Var3;
                }
                zArr[32] = true;
                return 0;
            case 33:
                this.M = aVar2.k(intValue);
                zArr[33] = true;
                return 0;
            case 34:
                this.N = aVar2.k(intValue);
                zArr[34] = true;
                return 0;
            case 35:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.ck0 ck0Var3 = new bw5.ck0();
                    if (bArr12 != null && bArr12.length > 0) {
                        ck0Var3.parseFrom(bArr12);
                    }
                    this.P = ck0Var3;
                }
                zArr[35] = true;
                return 0;
            default:
                return -1;
        }
    }
}
