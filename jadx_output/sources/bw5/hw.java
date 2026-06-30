package bw5;

/* loaded from: classes2.dex */
public class hw extends com.tencent.mm.protobuf.f {
    public bw5.iw A;
    public java.lang.String B;
    public bw5.iw C;
    public bw5.iw D;
    public int E;

    /* renamed from: d, reason: collision with root package name */
    public long f28360d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28361e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28362f;

    /* renamed from: g, reason: collision with root package name */
    public int f28363g;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f28366m;

    /* renamed from: n, reason: collision with root package name */
    public int f28367n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f28368o;

    /* renamed from: p, reason: collision with root package name */
    public int f28369p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f28370q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f28371r;

    /* renamed from: s, reason: collision with root package name */
    public int f28372s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f28373t;

    /* renamed from: u, reason: collision with root package name */
    public long f28374u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f28375v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.yw f28376w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.iw f28377x;

    /* renamed from: z, reason: collision with root package name */
    public bw5.iw f28379z;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f28364h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f28365i = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f28378y = new java.util.LinkedList();
    public final boolean[] F = new boolean[26];

    static {
        new bw5.hw();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hw parseFrom(byte[] bArr) {
        return (bw5.hw) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hw)) {
            return false;
        }
        bw5.hw hwVar = (bw5.hw) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f28360d), java.lang.Long.valueOf(hwVar.f28360d)) && n51.f.a(this.f28361e, hwVar.f28361e) && n51.f.a(this.f28362f, hwVar.f28362f) && n51.f.a(java.lang.Integer.valueOf(this.f28363g), java.lang.Integer.valueOf(hwVar.f28363g)) && n51.f.a(this.f28364h, hwVar.f28364h) && n51.f.a(this.f28365i, hwVar.f28365i) && n51.f.a(this.f28366m, hwVar.f28366m) && n51.f.a(java.lang.Integer.valueOf(this.f28367n), java.lang.Integer.valueOf(hwVar.f28367n)) && n51.f.a(java.lang.Boolean.valueOf(this.f28368o), java.lang.Boolean.valueOf(hwVar.f28368o)) && n51.f.a(java.lang.Integer.valueOf(this.f28369p), java.lang.Integer.valueOf(hwVar.f28369p)) && n51.f.a(java.lang.Boolean.valueOf(this.f28370q), java.lang.Boolean.valueOf(hwVar.f28370q)) && n51.f.a(this.f28371r, hwVar.f28371r) && n51.f.a(java.lang.Integer.valueOf(this.f28372s), java.lang.Integer.valueOf(hwVar.f28372s)) && n51.f.a(this.f28373t, hwVar.f28373t) && n51.f.a(java.lang.Long.valueOf(this.f28374u), java.lang.Long.valueOf(hwVar.f28374u)) && n51.f.a(this.f28375v, hwVar.f28375v) && n51.f.a(this.f28376w, hwVar.f28376w) && n51.f.a(this.f28377x, hwVar.f28377x) && n51.f.a(this.f28378y, hwVar.f28378y) && n51.f.a(this.f28379z, hwVar.f28379z) && n51.f.a(this.A, hwVar.A) && n51.f.a(this.B, hwVar.B) && n51.f.a(this.C, hwVar.C) && n51.f.a(this.D, hwVar.D) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(hwVar.E));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hw();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.F;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f28360d);
            }
            java.lang.String str = this.f28361e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f28362f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f28363g);
            }
            fVar.g(5, 8, this.f28364h);
            fVar.g(6, 2, this.f28365i);
            com.tencent.mm.protobuf.g gVar = this.f28366m;
            if (gVar != null && zArr[7]) {
                fVar.b(7, gVar);
            }
            if (zArr[8]) {
                fVar.e(8, this.f28367n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f28368o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f28369p);
            }
            if (zArr[11]) {
                fVar.a(11, this.f28370q);
            }
            java.lang.String str3 = this.f28371r;
            if (str3 != null && zArr[12]) {
                fVar.j(12, str3);
            }
            if (zArr[13]) {
                fVar.e(13, this.f28372s);
            }
            java.lang.String str4 = this.f28373t;
            if (str4 != null && zArr[14]) {
                fVar.j(14, str4);
            }
            if (zArr[15]) {
                fVar.h(15, this.f28374u);
            }
            java.lang.String str5 = this.f28375v;
            if (str5 != null && zArr[16]) {
                fVar.j(16, str5);
            }
            bw5.yw ywVar = this.f28376w;
            if (ywVar != null && zArr[17]) {
                fVar.i(17, ywVar.computeSize());
                this.f28376w.writeFields(fVar);
            }
            bw5.iw iwVar = this.f28377x;
            if (iwVar != null && zArr[18]) {
                fVar.i(18, iwVar.computeSize());
                this.f28377x.writeFields(fVar);
            }
            fVar.g(19, 8, this.f28378y);
            bw5.iw iwVar2 = this.f28379z;
            if (iwVar2 != null && zArr[20]) {
                fVar.i(20, iwVar2.computeSize());
                this.f28379z.writeFields(fVar);
            }
            bw5.iw iwVar3 = this.A;
            if (iwVar3 != null && zArr[21]) {
                fVar.i(21, iwVar3.computeSize());
                this.A.writeFields(fVar);
            }
            java.lang.String str6 = this.B;
            if (str6 != null && zArr[22]) {
                fVar.j(22, str6);
            }
            bw5.iw iwVar4 = this.C;
            if (iwVar4 != null && zArr[23]) {
                fVar.i(23, iwVar4.computeSize());
                this.C.writeFields(fVar);
            }
            bw5.iw iwVar5 = this.D;
            if (iwVar5 != null && zArr[24]) {
                fVar.i(24, iwVar5.computeSize());
                this.D.writeFields(fVar);
            }
            if (zArr[25]) {
                fVar.e(25, this.E);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f28360d) + 0 : 0;
            java.lang.String str7 = this.f28361e;
            if (str7 != null && zArr[2]) {
                h17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f28362f;
            if (str8 != null && zArr[3]) {
                h17 += b36.f.j(3, str8);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f28363g);
            }
            int g17 = h17 + b36.f.g(5, 8, this.f28364h) + b36.f.g(6, 2, this.f28365i);
            com.tencent.mm.protobuf.g gVar2 = this.f28366m;
            if (gVar2 != null && zArr[7]) {
                g17 += b36.f.b(7, gVar2);
            }
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f28367n);
            }
            if (zArr[9]) {
                g17 += b36.f.a(9, this.f28368o);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f28369p);
            }
            if (zArr[11]) {
                g17 += b36.f.a(11, this.f28370q);
            }
            java.lang.String str9 = this.f28371r;
            if (str9 != null && zArr[12]) {
                g17 += b36.f.j(12, str9);
            }
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f28372s);
            }
            java.lang.String str10 = this.f28373t;
            if (str10 != null && zArr[14]) {
                g17 += b36.f.j(14, str10);
            }
            if (zArr[15]) {
                g17 += b36.f.h(15, this.f28374u);
            }
            java.lang.String str11 = this.f28375v;
            if (str11 != null && zArr[16]) {
                g17 += b36.f.j(16, str11);
            }
            bw5.yw ywVar2 = this.f28376w;
            if (ywVar2 != null && zArr[17]) {
                g17 += b36.f.i(17, ywVar2.computeSize());
            }
            bw5.iw iwVar6 = this.f28377x;
            if (iwVar6 != null && zArr[18]) {
                g17 += b36.f.i(18, iwVar6.computeSize());
            }
            int g18 = g17 + b36.f.g(19, 8, this.f28378y);
            bw5.iw iwVar7 = this.f28379z;
            if (iwVar7 != null && zArr[20]) {
                g18 += b36.f.i(20, iwVar7.computeSize());
            }
            bw5.iw iwVar8 = this.A;
            if (iwVar8 != null && zArr[21]) {
                g18 += b36.f.i(21, iwVar8.computeSize());
            }
            java.lang.String str12 = this.B;
            if (str12 != null && zArr[22]) {
                g18 += b36.f.j(22, str12);
            }
            bw5.iw iwVar9 = this.C;
            if (iwVar9 != null && zArr[23]) {
                g18 += b36.f.i(23, iwVar9.computeSize());
            }
            bw5.iw iwVar10 = this.D;
            if (iwVar10 != null && zArr[24]) {
                g18 += b36.f.i(24, iwVar10.computeSize());
            }
            return zArr[25] ? g18 + b36.f.e(25, this.E) : g18;
        }
        if (i17 == 2) {
            this.f28364h.clear();
            this.f28365i.clear();
            this.f28378y.clear();
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
                this.f28360d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28361e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28362f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28363g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.yr yrVar = new bw5.yr();
                    if (bArr != null && bArr.length > 0) {
                        yrVar.parseFrom(bArr);
                    }
                    this.f28364h.add(yrVar);
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f28365i.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[6] = true;
                return 0;
            case 7:
                this.f28366m = aVar2.d(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f28367n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f28368o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f28369p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f28370q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f28371r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f28372s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f28373t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f28374u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f28375v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.yw ywVar3 = new bw5.yw();
                    if (bArr2 != null && bArr2.length > 0) {
                        ywVar3.parseFrom(bArr2);
                    }
                    this.f28376w = ywVar3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.iw iwVar11 = new bw5.iw();
                    if (bArr3 != null && bArr3.length > 0) {
                        iwVar11.parseFrom(bArr3);
                    }
                    this.f28377x = iwVar11;
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.iw iwVar12 = new bw5.iw();
                    if (bArr4 != null && bArr4.length > 0) {
                        iwVar12.parseFrom(bArr4);
                    }
                    this.f28378y.add(iwVar12);
                }
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.iw iwVar13 = new bw5.iw();
                    if (bArr5 != null && bArr5.length > 0) {
                        iwVar13.parseFrom(bArr5);
                    }
                    this.f28379z = iwVar13;
                }
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.iw iwVar14 = new bw5.iw();
                    if (bArr6 != null && bArr6.length > 0) {
                        iwVar14.parseFrom(bArr6);
                    }
                    this.A = iwVar14;
                }
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.k(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.iw iwVar15 = new bw5.iw();
                    if (bArr7 != null && bArr7.length > 0) {
                        iwVar15.parseFrom(bArr7);
                    }
                    this.C = iwVar15;
                }
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.iw iwVar16 = new bw5.iw();
                    if (bArr8 != null && bArr8.length > 0) {
                        iwVar16.parseFrom(bArr8);
                    }
                    this.D = iwVar16;
                }
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.g(intValue);
                zArr[25] = true;
                return 0;
            default:
                return -1;
        }
    }
}
