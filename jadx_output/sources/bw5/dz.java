package bw5;

/* loaded from: classes2.dex */
public class dz extends com.tencent.mm.protobuf.f {
    public bw5.cz A;
    public bw5.gr B;
    public bw5.h10 C;
    public bw5.j00 D;
    public bw5.sr E;
    public int F;
    public bw5.nd G;
    public final boolean[] H = new boolean[28];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26644d;

    /* renamed from: e, reason: collision with root package name */
    public long f26645e;

    /* renamed from: f, reason: collision with root package name */
    public int f26646f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26647g;

    /* renamed from: h, reason: collision with root package name */
    public int f26648h;

    /* renamed from: i, reason: collision with root package name */
    public int f26649i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f26650m;

    /* renamed from: n, reason: collision with root package name */
    public int f26651n;

    /* renamed from: o, reason: collision with root package name */
    public int f26652o;

    /* renamed from: p, reason: collision with root package name */
    public int f26653p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.fr f26654q;

    /* renamed from: r, reason: collision with root package name */
    public int f26655r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.yy f26656s;

    /* renamed from: t, reason: collision with root package name */
    public int f26657t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.ny f26658u;

    /* renamed from: v, reason: collision with root package name */
    public int f26659v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.bf f26660w;

    /* renamed from: x, reason: collision with root package name */
    public int f26661x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f26662y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.kr f26663z;

    static {
        new bw5.dz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dz parseFrom(byte[] bArr) {
        return (bw5.dz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dz)) {
            return false;
        }
        bw5.dz dzVar = (bw5.dz) fVar;
        return n51.f.a(this.f26644d, dzVar.f26644d) && n51.f.a(java.lang.Long.valueOf(this.f26645e), java.lang.Long.valueOf(dzVar.f26645e)) && n51.f.a(java.lang.Integer.valueOf(this.f26646f), java.lang.Integer.valueOf(dzVar.f26646f)) && n51.f.a(this.f26647g, dzVar.f26647g) && n51.f.a(java.lang.Integer.valueOf(this.f26648h), java.lang.Integer.valueOf(dzVar.f26648h)) && n51.f.a(java.lang.Integer.valueOf(this.f26649i), java.lang.Integer.valueOf(dzVar.f26649i)) && n51.f.a(this.f26650m, dzVar.f26650m) && n51.f.a(java.lang.Integer.valueOf(this.f26651n), java.lang.Integer.valueOf(dzVar.f26651n)) && n51.f.a(java.lang.Integer.valueOf(this.f26652o), java.lang.Integer.valueOf(dzVar.f26652o)) && n51.f.a(java.lang.Integer.valueOf(this.f26653p), java.lang.Integer.valueOf(dzVar.f26653p)) && n51.f.a(this.f26654q, dzVar.f26654q) && n51.f.a(java.lang.Integer.valueOf(this.f26655r), java.lang.Integer.valueOf(dzVar.f26655r)) && n51.f.a(this.f26656s, dzVar.f26656s) && n51.f.a(java.lang.Integer.valueOf(this.f26657t), java.lang.Integer.valueOf(dzVar.f26657t)) && n51.f.a(this.f26658u, dzVar.f26658u) && n51.f.a(java.lang.Integer.valueOf(this.f26659v), java.lang.Integer.valueOf(dzVar.f26659v)) && n51.f.a(this.f26660w, dzVar.f26660w) && n51.f.a(java.lang.Integer.valueOf(this.f26661x), java.lang.Integer.valueOf(dzVar.f26661x)) && n51.f.a(this.f26662y, dzVar.f26662y) && n51.f.a(this.f26663z, dzVar.f26663z) && n51.f.a(this.A, dzVar.A) && n51.f.a(this.B, dzVar.B) && n51.f.a(this.C, dzVar.C) && n51.f.a(this.D, dzVar.D) && n51.f.a(this.E, dzVar.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(dzVar.F)) && n51.f.a(this.G, dzVar.G);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.dz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.H;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26644d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f26645e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f26646f);
            }
            java.lang.String str2 = this.f26647g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f26648h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f26649i);
            }
            java.lang.String str3 = this.f26650m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.e(8, this.f26651n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f26652o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f26653p);
            }
            bw5.fr frVar = this.f26654q;
            if (frVar != null && zArr[11]) {
                fVar.i(11, frVar.computeSize());
                this.f26654q.writeFields(fVar);
            }
            if (zArr[12]) {
                fVar.e(12, this.f26655r);
            }
            bw5.yy yyVar = this.f26656s;
            if (yyVar != null && zArr[13]) {
                fVar.i(13, yyVar.computeSize());
                this.f26656s.writeFields(fVar);
            }
            if (zArr[14]) {
                fVar.e(14, this.f26657t);
            }
            bw5.ny nyVar = this.f26658u;
            if (nyVar != null && zArr[15]) {
                fVar.i(15, nyVar.computeSize());
                this.f26658u.writeFields(fVar);
            }
            if (zArr[16]) {
                fVar.e(16, this.f26659v);
            }
            bw5.bf bfVar = this.f26660w;
            if (bfVar != null && zArr[17]) {
                fVar.i(17, bfVar.computeSize());
                this.f26660w.writeFields(fVar);
            }
            if (zArr[18]) {
                fVar.e(18, this.f26661x);
            }
            java.lang.String str4 = this.f26662y;
            if (str4 != null && zArr[19]) {
                fVar.j(19, str4);
            }
            bw5.kr krVar = this.f26663z;
            if (krVar != null && zArr[20]) {
                fVar.i(20, krVar.computeSize());
                this.f26663z.writeFields(fVar);
            }
            bw5.cz czVar = this.A;
            if (czVar != null && zArr[21]) {
                fVar.i(21, czVar.computeSize());
                this.A.writeFields(fVar);
            }
            bw5.gr grVar = this.B;
            if (grVar != null && zArr[22]) {
                fVar.i(22, grVar.computeSize());
                this.B.writeFields(fVar);
            }
            bw5.h10 h10Var = this.C;
            if (h10Var != null && zArr[23]) {
                fVar.i(23, h10Var.computeSize());
                this.C.writeFields(fVar);
            }
            bw5.j00 j00Var = this.D;
            if (j00Var != null && zArr[24]) {
                fVar.i(24, j00Var.computeSize());
                this.D.writeFields(fVar);
            }
            bw5.sr srVar = this.E;
            if (srVar != null && zArr[25]) {
                fVar.i(25, srVar.computeSize());
                this.E.writeFields(fVar);
            }
            if (zArr[26]) {
                fVar.e(26, this.F);
            }
            bw5.nd ndVar = this.G;
            if (ndVar != null && zArr[27]) {
                fVar.i(27, ndVar.computeSize());
                this.G.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f26644d;
            if (str5 != null && zArr[1]) {
                i18 = b36.f.j(1, str5) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f26645e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f26646f);
            }
            java.lang.String str6 = this.f26647g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f26648h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f26649i);
            }
            java.lang.String str7 = this.f26650m;
            if (str7 != null && zArr[7]) {
                i18 += b36.f.j(7, str7);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f26651n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f26652o);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f26653p);
            }
            bw5.fr frVar2 = this.f26654q;
            if (frVar2 != null && zArr[11]) {
                i18 += b36.f.i(11, frVar2.computeSize());
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f26655r);
            }
            bw5.yy yyVar2 = this.f26656s;
            if (yyVar2 != null && zArr[13]) {
                i18 += b36.f.i(13, yyVar2.computeSize());
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f26657t);
            }
            bw5.ny nyVar2 = this.f26658u;
            if (nyVar2 != null && zArr[15]) {
                i18 += b36.f.i(15, nyVar2.computeSize());
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f26659v);
            }
            bw5.bf bfVar2 = this.f26660w;
            if (bfVar2 != null && zArr[17]) {
                i18 += b36.f.i(17, bfVar2.computeSize());
            }
            if (zArr[18]) {
                i18 += b36.f.e(18, this.f26661x);
            }
            java.lang.String str8 = this.f26662y;
            if (str8 != null && zArr[19]) {
                i18 += b36.f.j(19, str8);
            }
            bw5.kr krVar2 = this.f26663z;
            if (krVar2 != null && zArr[20]) {
                i18 += b36.f.i(20, krVar2.computeSize());
            }
            bw5.cz czVar2 = this.A;
            if (czVar2 != null && zArr[21]) {
                i18 += b36.f.i(21, czVar2.computeSize());
            }
            bw5.gr grVar2 = this.B;
            if (grVar2 != null && zArr[22]) {
                i18 += b36.f.i(22, grVar2.computeSize());
            }
            bw5.h10 h10Var2 = this.C;
            if (h10Var2 != null && zArr[23]) {
                i18 += b36.f.i(23, h10Var2.computeSize());
            }
            bw5.j00 j00Var2 = this.D;
            if (j00Var2 != null && zArr[24]) {
                i18 += b36.f.i(24, j00Var2.computeSize());
            }
            bw5.sr srVar2 = this.E;
            if (srVar2 != null && zArr[25]) {
                i18 += b36.f.i(25, srVar2.computeSize());
            }
            if (zArr[26]) {
                i18 += b36.f.e(26, this.F);
            }
            bw5.nd ndVar2 = this.G;
            return (ndVar2 == null || !zArr[27]) ? i18 : i18 + b36.f.i(27, ndVar2.computeSize());
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
                this.f26644d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26645e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26646f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26647g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26648h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26649i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26650m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f26651n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f26652o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f26653p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.fr frVar3 = new bw5.fr();
                    if (bArr != null && bArr.length > 0) {
                        frVar3.parseFrom(bArr);
                    }
                    this.f26654q = frVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f26655r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.yy yyVar3 = new bw5.yy();
                    if (bArr2 != null && bArr2.length > 0) {
                        yyVar3.parseFrom(bArr2);
                    }
                    this.f26656s = yyVar3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                this.f26657t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.ny nyVar3 = new bw5.ny();
                    if (bArr3 != null && bArr3.length > 0) {
                        nyVar3.parseFrom(bArr3);
                    }
                    this.f26658u = nyVar3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                this.f26659v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.bf bfVar3 = new bw5.bf();
                    if (bArr4 != null && bArr4.length > 0) {
                        bfVar3.parseFrom(bArr4);
                    }
                    this.f26660w = bfVar3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                this.f26661x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f26662y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.kr krVar3 = new bw5.kr();
                    if (bArr5 != null && bArr5.length > 0) {
                        krVar3.parseFrom(bArr5);
                    }
                    this.f26663z = krVar3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.cz czVar3 = new bw5.cz();
                    if (bArr6 != null && bArr6.length > 0) {
                        czVar3.parseFrom(bArr6);
                    }
                    this.A = czVar3;
                }
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.gr grVar3 = new bw5.gr();
                    if (bArr7 != null && bArr7.length > 0) {
                        grVar3.parseFrom(bArr7);
                    }
                    this.B = grVar3;
                }
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.h10 h10Var3 = new bw5.h10();
                    if (bArr8 != null && bArr8.length > 0) {
                        h10Var3.parseFrom(bArr8);
                    }
                    this.C = h10Var3;
                }
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.j00 j00Var3 = new bw5.j00();
                    if (bArr9 != null && bArr9.length > 0) {
                        j00Var3.parseFrom(bArr9);
                    }
                    this.D = j00Var3;
                }
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.sr srVar3 = new bw5.sr();
                    if (bArr10 != null && bArr10.length > 0) {
                        srVar3.parseFrom(bArr10);
                    }
                    this.E = srVar3;
                }
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.g(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.nd ndVar3 = new bw5.nd();
                    if (bArr11 != null && bArr11.length > 0) {
                        ndVar3.parseFrom(bArr11);
                    }
                    this.G = ndVar3;
                }
                zArr[27] = true;
                return 0;
            default:
                return -1;
        }
    }
}
