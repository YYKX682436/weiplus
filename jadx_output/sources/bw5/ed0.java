package bw5;

/* loaded from: classes2.dex */
public class ed0 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public java.lang.String B;
    public bw5.zg C;
    public java.lang.String D;
    public bw5.cj0 E;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26846d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26847e;

    /* renamed from: f, reason: collision with root package name */
    public int f26848f;

    /* renamed from: g, reason: collision with root package name */
    public int f26849g;

    /* renamed from: h, reason: collision with root package name */
    public float f26850h;

    /* renamed from: i, reason: collision with root package name */
    public float f26851i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f26852m;

    /* renamed from: n, reason: collision with root package name */
    public int f26853n;

    /* renamed from: o, reason: collision with root package name */
    public int f26854o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f26855p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f26856q;

    /* renamed from: r, reason: collision with root package name */
    public long f26857r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f26858s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f26859t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f26860u;

    /* renamed from: w, reason: collision with root package name */
    public bw5.ch f26862w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.pq f26863x;

    /* renamed from: y, reason: collision with root package name */
    public int f26864y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.yg f26865z;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f26861v = new java.util.LinkedList();
    public final boolean[] F = new boolean[26];

    static {
        new bw5.ed0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ed0 parseFrom(byte[] bArr) {
        return (bw5.ed0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ed0)) {
            return false;
        }
        bw5.ed0 ed0Var = (bw5.ed0) fVar;
        return n51.f.a(this.f26846d, ed0Var.f26846d) && n51.f.a(this.f26847e, ed0Var.f26847e) && n51.f.a(java.lang.Integer.valueOf(this.f26848f), java.lang.Integer.valueOf(ed0Var.f26848f)) && n51.f.a(java.lang.Integer.valueOf(this.f26849g), java.lang.Integer.valueOf(ed0Var.f26849g)) && n51.f.a(java.lang.Float.valueOf(this.f26850h), java.lang.Float.valueOf(ed0Var.f26850h)) && n51.f.a(java.lang.Float.valueOf(this.f26851i), java.lang.Float.valueOf(ed0Var.f26851i)) && n51.f.a(this.f26852m, ed0Var.f26852m) && n51.f.a(java.lang.Integer.valueOf(this.f26853n), java.lang.Integer.valueOf(ed0Var.f26853n)) && n51.f.a(java.lang.Integer.valueOf(this.f26854o), java.lang.Integer.valueOf(ed0Var.f26854o)) && n51.f.a(this.f26855p, ed0Var.f26855p) && n51.f.a(this.f26856q, ed0Var.f26856q) && n51.f.a(java.lang.Long.valueOf(this.f26857r), java.lang.Long.valueOf(ed0Var.f26857r)) && n51.f.a(this.f26858s, ed0Var.f26858s) && n51.f.a(this.f26859t, ed0Var.f26859t) && n51.f.a(this.f26860u, ed0Var.f26860u) && n51.f.a(this.f26861v, ed0Var.f26861v) && n51.f.a(this.f26862w, ed0Var.f26862w) && n51.f.a(this.f26863x, ed0Var.f26863x) && n51.f.a(java.lang.Integer.valueOf(this.f26864y), java.lang.Integer.valueOf(ed0Var.f26864y)) && n51.f.a(this.f26865z, ed0Var.f26865z) && n51.f.a(this.A, ed0Var.A) && n51.f.a(this.B, ed0Var.B) && n51.f.a(this.C, ed0Var.C) && n51.f.a(this.D, ed0Var.D) && n51.f.a(this.E, ed0Var.E);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ed0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.F;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26846d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26847e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f26848f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f26849g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f26850h);
            }
            if (zArr[6]) {
                fVar.d(6, this.f26851i);
            }
            java.lang.String str3 = this.f26852m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.e(8, this.f26853n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f26854o);
            }
            java.lang.String str4 = this.f26855p;
            if (str4 != null && zArr[10]) {
                fVar.j(10, str4);
            }
            java.lang.String str5 = this.f26856q;
            if (str5 != null && zArr[11]) {
                fVar.j(11, str5);
            }
            if (zArr[12]) {
                fVar.h(12, this.f26857r);
            }
            java.lang.String str6 = this.f26858s;
            if (str6 != null && zArr[13]) {
                fVar.j(13, str6);
            }
            java.lang.String str7 = this.f26859t;
            if (str7 != null && zArr[14]) {
                fVar.j(14, str7);
            }
            java.lang.String str8 = this.f26860u;
            if (str8 != null && zArr[15]) {
                fVar.j(15, str8);
            }
            fVar.g(16, 8, this.f26861v);
            bw5.ch chVar = this.f26862w;
            if (chVar != null && zArr[17]) {
                fVar.i(17, chVar.computeSize());
                this.f26862w.writeFields(fVar);
            }
            bw5.pq pqVar = this.f26863x;
            if (pqVar != null && zArr[18]) {
                fVar.i(18, pqVar.computeSize());
                this.f26863x.writeFields(fVar);
            }
            if (zArr[19]) {
                fVar.e(19, this.f26864y);
            }
            bw5.yg ygVar = this.f26865z;
            if (ygVar != null && zArr[20]) {
                fVar.i(20, ygVar.computeSize());
                this.f26865z.writeFields(fVar);
            }
            java.lang.String str9 = this.A;
            if (str9 != null && zArr[21]) {
                fVar.j(21, str9);
            }
            java.lang.String str10 = this.B;
            if (str10 != null && zArr[22]) {
                fVar.j(22, str10);
            }
            bw5.zg zgVar = this.C;
            if (zgVar != null && zArr[23]) {
                fVar.i(23, zgVar.computeSize());
                this.C.writeFields(fVar);
            }
            java.lang.String str11 = this.D;
            if (str11 != null && zArr[24]) {
                fVar.j(24, str11);
            }
            bw5.cj0 cj0Var = this.E;
            if (cj0Var != null && zArr[25]) {
                fVar.i(25, cj0Var.computeSize());
                this.E.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f26846d;
            if (str12 != null && zArr[1]) {
                i18 = b36.f.j(1, str12) + 0;
            }
            java.lang.String str13 = this.f26847e;
            if (str13 != null && zArr[2]) {
                i18 += b36.f.j(2, str13);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f26848f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f26849g);
            }
            if (zArr[5]) {
                i18 += b36.f.d(5, this.f26850h);
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f26851i);
            }
            java.lang.String str14 = this.f26852m;
            if (str14 != null && zArr[7]) {
                i18 += b36.f.j(7, str14);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f26853n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f26854o);
            }
            java.lang.String str15 = this.f26855p;
            if (str15 != null && zArr[10]) {
                i18 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f26856q;
            if (str16 != null && zArr[11]) {
                i18 += b36.f.j(11, str16);
            }
            if (zArr[12]) {
                i18 += b36.f.h(12, this.f26857r);
            }
            java.lang.String str17 = this.f26858s;
            if (str17 != null && zArr[13]) {
                i18 += b36.f.j(13, str17);
            }
            java.lang.String str18 = this.f26859t;
            if (str18 != null && zArr[14]) {
                i18 += b36.f.j(14, str18);
            }
            java.lang.String str19 = this.f26860u;
            if (str19 != null && zArr[15]) {
                i18 += b36.f.j(15, str19);
            }
            int g17 = i18 + b36.f.g(16, 8, this.f26861v);
            bw5.ch chVar2 = this.f26862w;
            if (chVar2 != null && zArr[17]) {
                g17 += b36.f.i(17, chVar2.computeSize());
            }
            bw5.pq pqVar2 = this.f26863x;
            if (pqVar2 != null && zArr[18]) {
                g17 += b36.f.i(18, pqVar2.computeSize());
            }
            if (zArr[19]) {
                g17 += b36.f.e(19, this.f26864y);
            }
            bw5.yg ygVar2 = this.f26865z;
            if (ygVar2 != null && zArr[20]) {
                g17 += b36.f.i(20, ygVar2.computeSize());
            }
            java.lang.String str20 = this.A;
            if (str20 != null && zArr[21]) {
                g17 += b36.f.j(21, str20);
            }
            java.lang.String str21 = this.B;
            if (str21 != null && zArr[22]) {
                g17 += b36.f.j(22, str21);
            }
            bw5.zg zgVar2 = this.C;
            if (zgVar2 != null && zArr[23]) {
                g17 += b36.f.i(23, zgVar2.computeSize());
            }
            java.lang.String str22 = this.D;
            if (str22 != null && zArr[24]) {
                g17 += b36.f.j(24, str22);
            }
            bw5.cj0 cj0Var2 = this.E;
            return (cj0Var2 == null || !zArr[25]) ? g17 : g17 + b36.f.i(25, cj0Var2.computeSize());
        }
        if (i17 == 2) {
            this.f26861v.clear();
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
                this.f26846d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26847e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26848f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26849g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26850h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26851i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26852m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f26853n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f26854o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f26855p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f26856q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f26857r = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f26858s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f26859t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f26860u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.fd0 fd0Var = new bw5.fd0();
                    if (bArr != null && bArr.length > 0) {
                        fd0Var.parseFrom(bArr);
                    }
                    this.f26861v.add(fd0Var);
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.ch chVar3 = new bw5.ch();
                    if (bArr2 != null && bArr2.length > 0) {
                        chVar3.parseFrom(bArr2);
                    }
                    this.f26862w = chVar3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.pq pqVar3 = new bw5.pq();
                    if (bArr3 != null && bArr3.length > 0) {
                        pqVar3.parseFrom(bArr3);
                    }
                    this.f26863x = pqVar3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                this.f26864y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.yg ygVar3 = new bw5.yg();
                    if (bArr4 != null && bArr4.length > 0) {
                        ygVar3.parseFrom(bArr4);
                    }
                    this.f26865z = ygVar3;
                }
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
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.zg zgVar3 = new bw5.zg();
                    if (bArr5 != null && bArr5.length > 0) {
                        zgVar3.parseFrom(bArr5);
                    }
                    this.C = zgVar3;
                }
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.k(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.cj0 cj0Var3 = new bw5.cj0();
                    if (bArr6 != null && bArr6.length > 0) {
                        cj0Var3.parseFrom(bArr6);
                    }
                    this.E = cj0Var3;
                }
                zArr[25] = true;
                return 0;
            default:
                return -1;
        }
    }
}
