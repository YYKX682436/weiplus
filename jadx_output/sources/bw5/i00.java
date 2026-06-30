package bw5;

/* loaded from: classes2.dex */
public class i00 extends com.tencent.mm.protobuf.f {
    public int A;
    public java.lang.String B;
    public java.lang.String C;
    public bw5.d00 D;
    public bw5.c00 E;
    public final boolean[] F = new boolean[29];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28403d;

    /* renamed from: e, reason: collision with root package name */
    public int f28404e;

    /* renamed from: f, reason: collision with root package name */
    public int f28405f;

    /* renamed from: g, reason: collision with root package name */
    public int f28406g;

    /* renamed from: h, reason: collision with root package name */
    public int f28407h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.h00 f28408i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f28409m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.f00 f28410n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f28411o;

    /* renamed from: p, reason: collision with root package name */
    public int f28412p;

    /* renamed from: q, reason: collision with root package name */
    public long f28413q;

    /* renamed from: r, reason: collision with root package name */
    public int f28414r;

    /* renamed from: s, reason: collision with root package name */
    public int f28415s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f28416t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f28417u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f28418v;

    /* renamed from: w, reason: collision with root package name */
    public int f28419w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.g00 f28420x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.e00 f28421y;

    /* renamed from: z, reason: collision with root package name */
    public int f28422z;

    static {
        new bw5.i00();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.i00 parseFrom(byte[] bArr) {
        return (bw5.i00) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.i00)) {
            return false;
        }
        bw5.i00 i00Var = (bw5.i00) fVar;
        return n51.f.a(this.f28403d, i00Var.f28403d) && n51.f.a(java.lang.Integer.valueOf(this.f28404e), java.lang.Integer.valueOf(i00Var.f28404e)) && n51.f.a(java.lang.Integer.valueOf(this.f28405f), java.lang.Integer.valueOf(i00Var.f28405f)) && n51.f.a(java.lang.Integer.valueOf(this.f28406g), java.lang.Integer.valueOf(i00Var.f28406g)) && n51.f.a(java.lang.Integer.valueOf(this.f28407h), java.lang.Integer.valueOf(i00Var.f28407h)) && n51.f.a(this.f28408i, i00Var.f28408i) && n51.f.a(this.f28409m, i00Var.f28409m) && n51.f.a(this.f28410n, i00Var.f28410n) && n51.f.a(this.f28411o, i00Var.f28411o) && n51.f.a(java.lang.Integer.valueOf(this.f28412p), java.lang.Integer.valueOf(i00Var.f28412p)) && n51.f.a(java.lang.Long.valueOf(this.f28413q), java.lang.Long.valueOf(i00Var.f28413q)) && n51.f.a(java.lang.Integer.valueOf(this.f28414r), java.lang.Integer.valueOf(i00Var.f28414r)) && n51.f.a(java.lang.Integer.valueOf(this.f28415s), java.lang.Integer.valueOf(i00Var.f28415s)) && n51.f.a(this.f28416t, i00Var.f28416t) && n51.f.a(this.f28417u, i00Var.f28417u) && n51.f.a(this.f28418v, i00Var.f28418v) && n51.f.a(java.lang.Integer.valueOf(this.f28419w), java.lang.Integer.valueOf(i00Var.f28419w)) && n51.f.a(this.f28420x, i00Var.f28420x) && n51.f.a(this.f28421y, i00Var.f28421y) && n51.f.a(java.lang.Integer.valueOf(this.f28422z), java.lang.Integer.valueOf(i00Var.f28422z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(i00Var.A)) && n51.f.a(this.B, i00Var.B) && n51.f.a(this.C, i00Var.C) && n51.f.a(this.D, i00Var.D) && n51.f.a(this.E, i00Var.E);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.i00();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.F;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f28403d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f28404e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f28405f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f28406g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f28407h);
            }
            bw5.h00 h00Var = this.f28408i;
            if (h00Var != null && zArr[6]) {
                fVar.i(6, h00Var.computeSize());
                this.f28408i.writeFields(fVar);
            }
            java.lang.String str2 = this.f28409m;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            bw5.f00 f00Var = this.f28410n;
            if (f00Var != null && zArr[8]) {
                fVar.i(8, f00Var.computeSize());
                this.f28410n.writeFields(fVar);
            }
            java.lang.String str3 = this.f28411o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            if (zArr[10]) {
                fVar.e(10, this.f28412p);
            }
            if (zArr[11]) {
                fVar.h(11, this.f28413q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f28414r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f28415s);
            }
            java.lang.String str4 = this.f28416t;
            if (str4 != null && zArr[14]) {
                fVar.j(14, str4);
            }
            java.lang.String str5 = this.f28417u;
            if (str5 != null && zArr[15]) {
                fVar.j(15, str5);
            }
            java.lang.String str6 = this.f28418v;
            if (str6 != null && zArr[16]) {
                fVar.j(16, str6);
            }
            if (zArr[17]) {
                fVar.e(17, this.f28419w);
            }
            bw5.g00 g00Var = this.f28420x;
            if (g00Var != null && zArr[18]) {
                fVar.i(18, g00Var.computeSize());
                this.f28420x.writeFields(fVar);
            }
            bw5.e00 e00Var = this.f28421y;
            if (e00Var != null && zArr[19]) {
                fVar.i(19, e00Var.computeSize());
                this.f28421y.writeFields(fVar);
            }
            if (zArr[23]) {
                fVar.e(23, this.f28422z);
            }
            if (zArr[24]) {
                fVar.e(24, this.A);
            }
            java.lang.String str7 = this.B;
            if (str7 != null && zArr[25]) {
                fVar.j(25, str7);
            }
            java.lang.String str8 = this.C;
            if (str8 != null && zArr[26]) {
                fVar.j(26, str8);
            }
            bw5.d00 d00Var = this.D;
            if (d00Var != null && zArr[27]) {
                fVar.i(27, d00Var.computeSize());
                this.D.writeFields(fVar);
            }
            bw5.c00 c00Var = this.E;
            if (c00Var != null && zArr[28]) {
                fVar.i(28, c00Var.computeSize());
                this.E.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f28403d;
            if (str9 != null && zArr[1]) {
                i18 = b36.f.j(1, str9) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f28404e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f28405f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f28406g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f28407h);
            }
            bw5.h00 h00Var2 = this.f28408i;
            if (h00Var2 != null && zArr[6]) {
                i18 += b36.f.i(6, h00Var2.computeSize());
            }
            java.lang.String str10 = this.f28409m;
            if (str10 != null && zArr[7]) {
                i18 += b36.f.j(7, str10);
            }
            bw5.f00 f00Var2 = this.f28410n;
            if (f00Var2 != null && zArr[8]) {
                i18 += b36.f.i(8, f00Var2.computeSize());
            }
            java.lang.String str11 = this.f28411o;
            if (str11 != null && zArr[9]) {
                i18 += b36.f.j(9, str11);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f28412p);
            }
            if (zArr[11]) {
                i18 += b36.f.h(11, this.f28413q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f28414r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f28415s);
            }
            java.lang.String str12 = this.f28416t;
            if (str12 != null && zArr[14]) {
                i18 += b36.f.j(14, str12);
            }
            java.lang.String str13 = this.f28417u;
            if (str13 != null && zArr[15]) {
                i18 += b36.f.j(15, str13);
            }
            java.lang.String str14 = this.f28418v;
            if (str14 != null && zArr[16]) {
                i18 += b36.f.j(16, str14);
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f28419w);
            }
            bw5.g00 g00Var2 = this.f28420x;
            if (g00Var2 != null && zArr[18]) {
                i18 += b36.f.i(18, g00Var2.computeSize());
            }
            bw5.e00 e00Var2 = this.f28421y;
            if (e00Var2 != null && zArr[19]) {
                i18 += b36.f.i(19, e00Var2.computeSize());
            }
            if (zArr[23]) {
                i18 += b36.f.e(23, this.f28422z);
            }
            if (zArr[24]) {
                i18 += b36.f.e(24, this.A);
            }
            java.lang.String str15 = this.B;
            if (str15 != null && zArr[25]) {
                i18 += b36.f.j(25, str15);
            }
            java.lang.String str16 = this.C;
            if (str16 != null && zArr[26]) {
                i18 += b36.f.j(26, str16);
            }
            bw5.d00 d00Var2 = this.D;
            if (d00Var2 != null && zArr[27]) {
                i18 += b36.f.i(27, d00Var2.computeSize());
            }
            bw5.c00 c00Var2 = this.E;
            return (c00Var2 == null || !zArr[28]) ? i18 : i18 + b36.f.i(28, c00Var2.computeSize());
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
                this.f28403d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28404e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28405f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28406g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28407h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.h00 h00Var3 = new bw5.h00();
                    if (bArr != null && bArr.length > 0) {
                        h00Var3.parseFrom(bArr);
                    }
                    this.f28408i = h00Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f28409m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.f00 f00Var3 = new bw5.f00();
                    if (bArr2 != null && bArr2.length > 0) {
                        f00Var3.parseFrom(bArr2);
                    }
                    this.f28410n = f00Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f28411o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f28412p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f28413q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f28414r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f28415s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f28416t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f28417u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f28418v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f28419w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.g00 g00Var3 = new bw5.g00();
                    if (bArr3 != null && bArr3.length > 0) {
                        g00Var3.parseFrom(bArr3);
                    }
                    this.f28420x = g00Var3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.e00 e00Var3 = new bw5.e00();
                    if (bArr4 != null && bArr4.length > 0) {
                        e00Var3.parseFrom(bArr4);
                    }
                    this.f28421y = e00Var3;
                }
                zArr[19] = true;
                return 0;
            case 20:
            case 21:
            case 22:
            default:
                return -1;
            case 23:
                this.f28422z = aVar2.g(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.A = aVar2.g(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.B = aVar2.k(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.C = aVar2.k(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.d00 d00Var3 = new bw5.d00();
                    if (bArr5 != null && bArr5.length > 0) {
                        d00Var3.parseFrom(bArr5);
                    }
                    this.D = d00Var3;
                }
                zArr[27] = true;
                return 0;
            case 28:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.c00 c00Var3 = new bw5.c00();
                    if (bArr6 != null && bArr6.length > 0) {
                        c00Var3.parseFrom(bArr6);
                    }
                    this.E = c00Var3;
                }
                zArr[28] = true;
                return 0;
        }
    }
}
