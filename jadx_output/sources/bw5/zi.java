package bw5;

/* loaded from: classes2.dex */
public class zi extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public int F;
    public final boolean[] G = new boolean[28];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f36004d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f36005e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f36006f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f36007g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f36008h;

    /* renamed from: i, reason: collision with root package name */
    public int f36009i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f36010m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f36011n;

    /* renamed from: o, reason: collision with root package name */
    public int f36012o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f36013p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f36014q;

    /* renamed from: r, reason: collision with root package name */
    public int f36015r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f36016s;

    /* renamed from: t, reason: collision with root package name */
    public int f36017t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f36018u;

    /* renamed from: v, reason: collision with root package name */
    public int f36019v;

    /* renamed from: w, reason: collision with root package name */
    public long f36020w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f36021x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f36022y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f36023z;

    static {
        new bw5.zi();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zi parseFrom(byte[] bArr) {
        return (bw5.zi) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zi)) {
            return false;
        }
        bw5.zi ziVar = (bw5.zi) fVar;
        return n51.f.a(this.f36004d, ziVar.f36004d) && n51.f.a(this.f36005e, ziVar.f36005e) && n51.f.a(this.f36006f, ziVar.f36006f) && n51.f.a(this.f36007g, ziVar.f36007g) && n51.f.a(this.f36008h, ziVar.f36008h) && n51.f.a(java.lang.Integer.valueOf(this.f36009i), java.lang.Integer.valueOf(ziVar.f36009i)) && n51.f.a(this.f36010m, ziVar.f36010m) && n51.f.a(this.f36011n, ziVar.f36011n) && n51.f.a(java.lang.Integer.valueOf(this.f36012o), java.lang.Integer.valueOf(ziVar.f36012o)) && n51.f.a(java.lang.Boolean.valueOf(this.f36013p), java.lang.Boolean.valueOf(ziVar.f36013p)) && n51.f.a(java.lang.Boolean.valueOf(this.f36014q), java.lang.Boolean.valueOf(ziVar.f36014q)) && n51.f.a(java.lang.Integer.valueOf(this.f36015r), java.lang.Integer.valueOf(ziVar.f36015r)) && n51.f.a(this.f36016s, ziVar.f36016s) && n51.f.a(java.lang.Integer.valueOf(this.f36017t), java.lang.Integer.valueOf(ziVar.f36017t)) && n51.f.a(this.f36018u, ziVar.f36018u) && n51.f.a(java.lang.Integer.valueOf(this.f36019v), java.lang.Integer.valueOf(ziVar.f36019v)) && n51.f.a(java.lang.Long.valueOf(this.f36020w), java.lang.Long.valueOf(ziVar.f36020w)) && n51.f.a(this.f36021x, ziVar.f36021x) && n51.f.a(this.f36022y, ziVar.f36022y) && n51.f.a(this.f36023z, ziVar.f36023z) && n51.f.a(this.A, ziVar.A) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(ziVar.B)) && n51.f.a(java.lang.Boolean.valueOf(this.C), java.lang.Boolean.valueOf(ziVar.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(ziVar.D)) && n51.f.a(java.lang.Boolean.valueOf(this.E), java.lang.Boolean.valueOf(ziVar.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(ziVar.F));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zi();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.G;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36004d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f36005e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f36006f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f36007g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f36008h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f36009i);
            }
            com.tencent.mm.protobuf.g gVar = this.f36010m;
            if (gVar != null && zArr[7]) {
                fVar.b(7, gVar);
            }
            java.lang.String str6 = this.f36011n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            if (zArr[9]) {
                fVar.e(9, this.f36012o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f36013p);
            }
            if (zArr[11]) {
                fVar.a(11, this.f36014q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f36015r);
            }
            java.lang.String str7 = this.f36016s;
            if (str7 != null && zArr[13]) {
                fVar.j(13, str7);
            }
            if (zArr[14]) {
                fVar.e(14, this.f36017t);
            }
            java.lang.String str8 = this.f36018u;
            if (str8 != null && zArr[15]) {
                fVar.j(15, str8);
            }
            if (zArr[16]) {
                fVar.e(16, this.f36019v);
            }
            if (zArr[17]) {
                fVar.h(17, this.f36020w);
            }
            java.lang.String str9 = this.f36021x;
            if (str9 != null && zArr[18]) {
                fVar.j(18, str9);
            }
            java.lang.String str10 = this.f36022y;
            if (str10 != null && zArr[19]) {
                fVar.j(19, str10);
            }
            java.lang.String str11 = this.f36023z;
            if (str11 != null && zArr[20]) {
                fVar.j(20, str11);
            }
            java.lang.String str12 = this.A;
            if (str12 != null && zArr[21]) {
                fVar.j(21, str12);
            }
            if (zArr[22]) {
                fVar.a(22, this.B);
            }
            if (zArr[23]) {
                fVar.a(23, this.C);
            }
            if (zArr[24]) {
                fVar.e(24, this.D);
            }
            if (zArr[26]) {
                fVar.a(26, this.E);
            }
            if (zArr[27]) {
                fVar.e(27, this.F);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str13 = this.f36004d;
            if (str13 != null && zArr[1]) {
                i18 = b36.f.j(1, str13) + 0;
            }
            java.lang.String str14 = this.f36005e;
            if (str14 != null && zArr[2]) {
                i18 += b36.f.j(2, str14);
            }
            java.lang.String str15 = this.f36006f;
            if (str15 != null && zArr[3]) {
                i18 += b36.f.j(3, str15);
            }
            java.lang.String str16 = this.f36007g;
            if (str16 != null && zArr[4]) {
                i18 += b36.f.j(4, str16);
            }
            java.lang.String str17 = this.f36008h;
            if (str17 != null && zArr[5]) {
                i18 += b36.f.j(5, str17);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f36009i);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f36010m;
            if (gVar2 != null && zArr[7]) {
                i18 += b36.f.b(7, gVar2);
            }
            java.lang.String str18 = this.f36011n;
            if (str18 != null && zArr[8]) {
                i18 += b36.f.j(8, str18);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f36012o);
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f36013p);
            }
            if (zArr[11]) {
                i18 += b36.f.a(11, this.f36014q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f36015r);
            }
            java.lang.String str19 = this.f36016s;
            if (str19 != null && zArr[13]) {
                i18 += b36.f.j(13, str19);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f36017t);
            }
            java.lang.String str20 = this.f36018u;
            if (str20 != null && zArr[15]) {
                i18 += b36.f.j(15, str20);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f36019v);
            }
            if (zArr[17]) {
                i18 += b36.f.h(17, this.f36020w);
            }
            java.lang.String str21 = this.f36021x;
            if (str21 != null && zArr[18]) {
                i18 += b36.f.j(18, str21);
            }
            java.lang.String str22 = this.f36022y;
            if (str22 != null && zArr[19]) {
                i18 += b36.f.j(19, str22);
            }
            java.lang.String str23 = this.f36023z;
            if (str23 != null && zArr[20]) {
                i18 += b36.f.j(20, str23);
            }
            java.lang.String str24 = this.A;
            if (str24 != null && zArr[21]) {
                i18 += b36.f.j(21, str24);
            }
            if (zArr[22]) {
                i18 += b36.f.a(22, this.B);
            }
            if (zArr[23]) {
                i18 += b36.f.a(23, this.C);
            }
            if (zArr[24]) {
                i18 += b36.f.e(24, this.D);
            }
            if (zArr[26]) {
                i18 += b36.f.a(26, this.E);
            }
            return zArr[27] ? i18 + b36.f.e(27, this.F) : i18;
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
                this.f36004d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f36005e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f36006f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f36007g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f36008h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f36009i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f36010m = aVar2.d(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f36011n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f36012o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f36013p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f36014q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f36015r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f36016s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f36017t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f36018u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f36019v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f36020w = aVar2.i(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f36021x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f36022y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f36023z = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.c(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.c(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.g(intValue);
                zArr[24] = true;
                return 0;
            case 25:
            default:
                return -1;
            case 26:
                this.E = aVar2.c(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.F = aVar2.g(intValue);
                zArr[27] = true;
                return 0;
        }
    }
}
