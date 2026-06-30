package bw5;

/* loaded from: classes2.dex */
public class ed extends com.tencent.mm.protobuf.f {
    public int A;
    public bw5.y9 B;
    public bw5.te C;
    public bw5.my D;

    /* renamed from: d, reason: collision with root package name */
    public int f26826d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.bf f26827e;

    /* renamed from: f, reason: collision with root package name */
    public float f26828f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.pe f26829g;

    /* renamed from: i, reason: collision with root package name */
    public int f26831i;

    /* renamed from: m, reason: collision with root package name */
    public long f26832m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f26833n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f26834o;

    /* renamed from: p, reason: collision with root package name */
    public int f26835p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.qq f26836q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f26837r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.zp f26838s;

    /* renamed from: t, reason: collision with root package name */
    public int f26839t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f26840u;

    /* renamed from: v, reason: collision with root package name */
    public float f26841v;

    /* renamed from: w, reason: collision with root package name */
    public float f26842w;

    /* renamed from: x, reason: collision with root package name */
    public int f26843x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.ir f26844y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.ir f26845z;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f26830h = new java.util.LinkedList();
    public final boolean[] E = new boolean[26];

    static {
        new bw5.ed();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ed parseFrom(byte[] bArr) {
        return (bw5.ed) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ed)) {
            return false;
        }
        bw5.ed edVar = (bw5.ed) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f26826d), java.lang.Integer.valueOf(edVar.f26826d)) && n51.f.a(this.f26827e, edVar.f26827e) && n51.f.a(java.lang.Float.valueOf(this.f26828f), java.lang.Float.valueOf(edVar.f26828f)) && n51.f.a(this.f26829g, edVar.f26829g) && n51.f.a(this.f26830h, edVar.f26830h) && n51.f.a(java.lang.Integer.valueOf(this.f26831i), java.lang.Integer.valueOf(edVar.f26831i)) && n51.f.a(java.lang.Long.valueOf(this.f26832m), java.lang.Long.valueOf(edVar.f26832m)) && n51.f.a(this.f26833n, edVar.f26833n) && n51.f.a(this.f26834o, edVar.f26834o) && n51.f.a(java.lang.Integer.valueOf(this.f26835p), java.lang.Integer.valueOf(edVar.f26835p)) && n51.f.a(this.f26836q, edVar.f26836q) && n51.f.a(this.f26837r, edVar.f26837r) && n51.f.a(this.f26838s, edVar.f26838s) && n51.f.a(java.lang.Integer.valueOf(this.f26839t), java.lang.Integer.valueOf(edVar.f26839t)) && n51.f.a(this.f26840u, edVar.f26840u) && n51.f.a(java.lang.Float.valueOf(this.f26841v), java.lang.Float.valueOf(edVar.f26841v)) && n51.f.a(java.lang.Float.valueOf(this.f26842w), java.lang.Float.valueOf(edVar.f26842w)) && n51.f.a(java.lang.Integer.valueOf(this.f26843x), java.lang.Integer.valueOf(edVar.f26843x)) && n51.f.a(this.f26844y, edVar.f26844y) && n51.f.a(this.f26845z, edVar.f26845z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(edVar.A)) && n51.f.a(this.B, edVar.B) && n51.f.a(this.C, edVar.C) && n51.f.a(this.D, edVar.D);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ed();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.E;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f26826d);
            }
            bw5.bf bfVar = this.f26827e;
            if (bfVar != null && zArr[2]) {
                fVar.i(2, bfVar.computeSize());
                this.f26827e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.d(3, this.f26828f);
            }
            bw5.pe peVar = this.f26829g;
            if (peVar != null && zArr[4]) {
                fVar.i(4, peVar.computeSize());
                this.f26829g.writeFields(fVar);
            }
            fVar.g(5, 8, this.f26830h);
            if (zArr[6]) {
                fVar.e(6, this.f26831i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f26832m);
            }
            java.lang.String str = this.f26833n;
            if (str != null && zArr[8]) {
                fVar.j(8, str);
            }
            java.lang.String str2 = this.f26834o;
            if (str2 != null && zArr[9]) {
                fVar.j(9, str2);
            }
            if (zArr[10]) {
                fVar.e(10, this.f26835p);
            }
            bw5.qq qqVar = this.f26836q;
            if (qqVar != null && zArr[11]) {
                fVar.i(11, qqVar.computeSize());
                this.f26836q.writeFields(fVar);
            }
            java.lang.String str3 = this.f26837r;
            if (str3 != null && zArr[12]) {
                fVar.j(12, str3);
            }
            bw5.zp zpVar = this.f26838s;
            if (zpVar != null && zArr[13]) {
                fVar.i(13, zpVar.computeSize());
                this.f26838s.writeFields(fVar);
            }
            if (zArr[14]) {
                fVar.e(14, this.f26839t);
            }
            java.lang.String str4 = this.f26840u;
            if (str4 != null && zArr[15]) {
                fVar.j(15, str4);
            }
            if (zArr[16]) {
                fVar.d(16, this.f26841v);
            }
            if (zArr[17]) {
                fVar.d(17, this.f26842w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f26843x);
            }
            bw5.ir irVar = this.f26844y;
            if (irVar != null && zArr[19]) {
                fVar.i(19, irVar.computeSize());
                this.f26844y.writeFields(fVar);
            }
            bw5.ir irVar2 = this.f26845z;
            if (irVar2 != null && zArr[20]) {
                fVar.i(20, irVar2.computeSize());
                this.f26845z.writeFields(fVar);
            }
            if (zArr[21]) {
                fVar.e(21, this.A);
            }
            bw5.y9 y9Var = this.B;
            if (y9Var != null && zArr[23]) {
                fVar.i(23, y9Var.computeSize());
                this.B.writeFields(fVar);
            }
            bw5.te teVar = this.C;
            if (teVar != null && zArr[24]) {
                fVar.i(24, teVar.computeSize());
                this.C.writeFields(fVar);
            }
            bw5.my myVar = this.D;
            if (myVar != null && zArr[25]) {
                fVar.i(25, myVar.computeSize());
                this.D.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f26826d) + 0 : 0;
            bw5.bf bfVar2 = this.f26827e;
            if (bfVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, bfVar2.computeSize());
            }
            if (zArr[3]) {
                e17 += b36.f.d(3, this.f26828f);
            }
            bw5.pe peVar2 = this.f26829g;
            if (peVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, peVar2.computeSize());
            }
            int g17 = e17 + b36.f.g(5, 8, this.f26830h);
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f26831i);
            }
            if (zArr[7]) {
                g17 += b36.f.h(7, this.f26832m);
            }
            java.lang.String str5 = this.f26833n;
            if (str5 != null && zArr[8]) {
                g17 += b36.f.j(8, str5);
            }
            java.lang.String str6 = this.f26834o;
            if (str6 != null && zArr[9]) {
                g17 += b36.f.j(9, str6);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f26835p);
            }
            bw5.qq qqVar2 = this.f26836q;
            if (qqVar2 != null && zArr[11]) {
                g17 += b36.f.i(11, qqVar2.computeSize());
            }
            java.lang.String str7 = this.f26837r;
            if (str7 != null && zArr[12]) {
                g17 += b36.f.j(12, str7);
            }
            bw5.zp zpVar2 = this.f26838s;
            if (zpVar2 != null && zArr[13]) {
                g17 += b36.f.i(13, zpVar2.computeSize());
            }
            if (zArr[14]) {
                g17 += b36.f.e(14, this.f26839t);
            }
            java.lang.String str8 = this.f26840u;
            if (str8 != null && zArr[15]) {
                g17 += b36.f.j(15, str8);
            }
            if (zArr[16]) {
                g17 += b36.f.d(16, this.f26841v);
            }
            if (zArr[17]) {
                g17 += b36.f.d(17, this.f26842w);
            }
            if (zArr[18]) {
                g17 += b36.f.e(18, this.f26843x);
            }
            bw5.ir irVar3 = this.f26844y;
            if (irVar3 != null && zArr[19]) {
                g17 += b36.f.i(19, irVar3.computeSize());
            }
            bw5.ir irVar4 = this.f26845z;
            if (irVar4 != null && zArr[20]) {
                g17 += b36.f.i(20, irVar4.computeSize());
            }
            if (zArr[21]) {
                g17 += b36.f.e(21, this.A);
            }
            bw5.y9 y9Var2 = this.B;
            if (y9Var2 != null && zArr[23]) {
                g17 += b36.f.i(23, y9Var2.computeSize());
            }
            bw5.te teVar2 = this.C;
            if (teVar2 != null && zArr[24]) {
                g17 += b36.f.i(24, teVar2.computeSize());
            }
            bw5.my myVar2 = this.D;
            return (myVar2 == null || !zArr[25]) ? g17 : g17 + b36.f.i(25, myVar2.computeSize());
        }
        if (i17 == 2) {
            this.f26830h.clear();
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
                this.f26826d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.bf bfVar3 = new bw5.bf();
                    if (bArr != null && bArr.length > 0) {
                        bfVar3.parseFrom(bArr);
                    }
                    this.f26827e = bfVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f26828f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.pe peVar3 = new bw5.pe();
                    if (bArr2 != null && bArr2.length > 0) {
                        peVar3.parseFrom(bArr2);
                    }
                    this.f26829g = peVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.oe oeVar = new bw5.oe();
                    if (bArr3 != null && bArr3.length > 0) {
                        oeVar.parseFrom(bArr3);
                    }
                    this.f26830h.add(oeVar);
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f26831i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26832m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f26833n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f26834o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f26835p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.qq qqVar3 = new bw5.qq();
                    if (bArr4 != null && bArr4.length > 0) {
                        qqVar3.parseFrom(bArr4);
                    }
                    this.f26836q = qqVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f26837r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.zp zpVar3 = new bw5.zp();
                    if (bArr5 != null && bArr5.length > 0) {
                        zpVar3.parseFrom(bArr5);
                    }
                    this.f26838s = zpVar3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                this.f26839t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f26840u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f26841v = aVar2.f(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f26842w = aVar2.f(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f26843x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.ir irVar5 = new bw5.ir();
                    if (bArr6 != null && bArr6.length > 0) {
                        irVar5.parseFrom(bArr6);
                    }
                    this.f26844y = irVar5;
                }
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.ir irVar6 = new bw5.ir();
                    if (bArr7 != null && bArr7.length > 0) {
                        irVar6.parseFrom(bArr7);
                    }
                    this.f26845z = irVar6;
                }
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            case 22:
            default:
                return -1;
            case 23:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.y9 y9Var3 = new bw5.y9();
                    if (bArr8 != null && bArr8.length > 0) {
                        y9Var3.parseFrom(bArr8);
                    }
                    this.B = y9Var3;
                }
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.te teVar3 = new bw5.te();
                    if (bArr9 != null && bArr9.length > 0) {
                        teVar3.parseFrom(bArr9);
                    }
                    this.C = teVar3;
                }
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    bw5.my myVar3 = new bw5.my();
                    if (bArr10 != null && bArr10.length > 0) {
                        myVar3.parseFrom(bArr10);
                    }
                    this.D = myVar3;
                }
                zArr[25] = true;
                return 0;
        }
    }
}
