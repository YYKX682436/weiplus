package bw5;

/* loaded from: classes2.dex */
public class wh extends com.tencent.mm.protobuf.f {
    public int A;
    public int B;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34710d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34711e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34712f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34713g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f34714h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f34715i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f34716m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f34717n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f34718o;

    /* renamed from: p, reason: collision with root package name */
    public float f34719p;

    /* renamed from: q, reason: collision with root package name */
    public int f34720q;

    /* renamed from: r, reason: collision with root package name */
    public int f34721r;

    /* renamed from: t, reason: collision with root package name */
    public int f34723t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f34724u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.mj f34725v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.mj f34726w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.mj f34727x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.mj f34728y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.mj f34729z;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f34722s = new java.util.LinkedList();
    public final boolean[] C = new boolean[23];

    static {
        new bw5.wh();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wh parseFrom(byte[] bArr) {
        return (bw5.wh) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wh)) {
            return false;
        }
        bw5.wh whVar = (bw5.wh) fVar;
        return n51.f.a(this.f34710d, whVar.f34710d) && n51.f.a(this.f34711e, whVar.f34711e) && n51.f.a(this.f34712f, whVar.f34712f) && n51.f.a(this.f34713g, whVar.f34713g) && n51.f.a(this.f34714h, whVar.f34714h) && n51.f.a(this.f34715i, whVar.f34715i) && n51.f.a(this.f34716m, whVar.f34716m) && n51.f.a(this.f34717n, whVar.f34717n) && n51.f.a(this.f34718o, whVar.f34718o) && n51.f.a(java.lang.Float.valueOf(this.f34719p), java.lang.Float.valueOf(whVar.f34719p)) && n51.f.a(java.lang.Integer.valueOf(this.f34720q), java.lang.Integer.valueOf(whVar.f34720q)) && n51.f.a(java.lang.Integer.valueOf(this.f34721r), java.lang.Integer.valueOf(whVar.f34721r)) && n51.f.a(this.f34722s, whVar.f34722s) && n51.f.a(java.lang.Integer.valueOf(this.f34723t), java.lang.Integer.valueOf(whVar.f34723t)) && n51.f.a(this.f34724u, whVar.f34724u) && n51.f.a(this.f34725v, whVar.f34725v) && n51.f.a(this.f34726w, whVar.f34726w) && n51.f.a(this.f34727x, whVar.f34727x) && n51.f.a(this.f34728y, whVar.f34728y) && n51.f.a(this.f34729z, whVar.f34729z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(whVar.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(whVar.B));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wh();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.C;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34710d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f34711e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f34712f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f34713g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f34714h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f34715i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f34716m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f34717n;
            if (str8 != null && zArr[8]) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f34718o;
            if (str9 != null && zArr[9]) {
                fVar.j(9, str9);
            }
            if (zArr[10]) {
                fVar.d(10, this.f34719p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f34720q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f34721r);
            }
            fVar.g(13, 1, this.f34722s);
            if (zArr[14]) {
                fVar.e(14, this.f34723t);
            }
            java.lang.String str10 = this.f34724u;
            if (str10 != null && zArr[15]) {
                fVar.j(15, str10);
            }
            bw5.mj mjVar = this.f34725v;
            if (mjVar != null && zArr[16]) {
                fVar.i(16, mjVar.computeSize());
                this.f34725v.writeFields(fVar);
            }
            bw5.mj mjVar2 = this.f34726w;
            if (mjVar2 != null && zArr[17]) {
                fVar.i(17, mjVar2.computeSize());
                this.f34726w.writeFields(fVar);
            }
            bw5.mj mjVar3 = this.f34727x;
            if (mjVar3 != null && zArr[18]) {
                fVar.i(18, mjVar3.computeSize());
                this.f34727x.writeFields(fVar);
            }
            bw5.mj mjVar4 = this.f34728y;
            if (mjVar4 != null && zArr[19]) {
                fVar.i(19, mjVar4.computeSize());
                this.f34728y.writeFields(fVar);
            }
            bw5.mj mjVar5 = this.f34729z;
            if (mjVar5 != null && zArr[20]) {
                fVar.i(20, mjVar5.computeSize());
                this.f34729z.writeFields(fVar);
            }
            if (zArr[21]) {
                fVar.e(21, this.A);
            }
            if (zArr[22]) {
                fVar.e(22, this.B);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f34710d;
            if (str11 != null && zArr[1]) {
                i18 = b36.f.j(1, str11) + 0;
            }
            java.lang.String str12 = this.f34711e;
            if (str12 != null && zArr[2]) {
                i18 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f34712f;
            if (str13 != null && zArr[3]) {
                i18 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f34713g;
            if (str14 != null && zArr[4]) {
                i18 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f34714h;
            if (str15 != null && zArr[5]) {
                i18 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f34715i;
            if (str16 != null && zArr[6]) {
                i18 += b36.f.j(6, str16);
            }
            java.lang.String str17 = this.f34716m;
            if (str17 != null && zArr[7]) {
                i18 += b36.f.j(7, str17);
            }
            java.lang.String str18 = this.f34717n;
            if (str18 != null && zArr[8]) {
                i18 += b36.f.j(8, str18);
            }
            java.lang.String str19 = this.f34718o;
            if (str19 != null && zArr[9]) {
                i18 += b36.f.j(9, str19);
            }
            if (zArr[10]) {
                i18 += b36.f.d(10, this.f34719p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f34720q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f34721r);
            }
            int g17 = i18 + b36.f.g(13, 1, this.f34722s);
            if (zArr[14]) {
                g17 += b36.f.e(14, this.f34723t);
            }
            java.lang.String str20 = this.f34724u;
            if (str20 != null && zArr[15]) {
                g17 += b36.f.j(15, str20);
            }
            bw5.mj mjVar6 = this.f34725v;
            if (mjVar6 != null && zArr[16]) {
                g17 += b36.f.i(16, mjVar6.computeSize());
            }
            bw5.mj mjVar7 = this.f34726w;
            if (mjVar7 != null && zArr[17]) {
                g17 += b36.f.i(17, mjVar7.computeSize());
            }
            bw5.mj mjVar8 = this.f34727x;
            if (mjVar8 != null && zArr[18]) {
                g17 += b36.f.i(18, mjVar8.computeSize());
            }
            bw5.mj mjVar9 = this.f34728y;
            if (mjVar9 != null && zArr[19]) {
                g17 += b36.f.i(19, mjVar9.computeSize());
            }
            bw5.mj mjVar10 = this.f34729z;
            if (mjVar10 != null && zArr[20]) {
                g17 += b36.f.i(20, mjVar10.computeSize());
            }
            if (zArr[21]) {
                g17 += b36.f.e(21, this.A);
            }
            return zArr[22] ? g17 + b36.f.e(22, this.B) : g17;
        }
        if (i17 == 2) {
            this.f34722s.clear();
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
                this.f34710d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34711e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34712f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34713g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34714h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34715i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34716m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f34717n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f34718o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f34719p = aVar2.f(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f34720q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f34721r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f34722s.add(aVar2.k(intValue));
                zArr[13] = true;
                return 0;
            case 14:
                this.f34723t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f34724u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.mj mjVar11 = new bw5.mj();
                    if (bArr != null && bArr.length > 0) {
                        mjVar11.parseFrom(bArr);
                    }
                    this.f34725v = mjVar11;
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.mj mjVar12 = new bw5.mj();
                    if (bArr2 != null && bArr2.length > 0) {
                        mjVar12.parseFrom(bArr2);
                    }
                    this.f34726w = mjVar12;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.mj mjVar13 = new bw5.mj();
                    if (bArr3 != null && bArr3.length > 0) {
                        mjVar13.parseFrom(bArr3);
                    }
                    this.f34727x = mjVar13;
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.mj mjVar14 = new bw5.mj();
                    if (bArr4 != null && bArr4.length > 0) {
                        mjVar14.parseFrom(bArr4);
                    }
                    this.f34728y = mjVar14;
                }
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.mj mjVar15 = new bw5.mj();
                    if (bArr5 != null && bArr5.length > 0) {
                        mjVar15.parseFrom(bArr5);
                    }
                    this.f34729z = mjVar15;
                }
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
            default:
                return -1;
        }
    }
}
