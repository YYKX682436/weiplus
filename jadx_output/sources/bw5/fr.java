package bw5;

/* loaded from: classes2.dex */
public class fr extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public bw5.j00 B;
    public final boolean[] C = new boolean[23];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27472d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27473e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27474f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27475g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f27476h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f27477i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f27478m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f27479n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f27480o;

    /* renamed from: p, reason: collision with root package name */
    public int f27481p;

    /* renamed from: q, reason: collision with root package name */
    public int f27482q;

    /* renamed from: r, reason: collision with root package name */
    public int f27483r;

    /* renamed from: s, reason: collision with root package name */
    public int f27484s;

    /* renamed from: t, reason: collision with root package name */
    public int f27485t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f27486u;

    /* renamed from: v, reason: collision with root package name */
    public int f27487v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f27488w;

    /* renamed from: x, reason: collision with root package name */
    public int f27489x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f27490y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f27491z;

    static {
        new bw5.fr();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fr parseFrom(byte[] bArr) {
        return (bw5.fr) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fr)) {
            return false;
        }
        bw5.fr frVar = (bw5.fr) fVar;
        return n51.f.a(this.f27472d, frVar.f27472d) && n51.f.a(this.f27473e, frVar.f27473e) && n51.f.a(this.f27474f, frVar.f27474f) && n51.f.a(this.f27475g, frVar.f27475g) && n51.f.a(this.f27476h, frVar.f27476h) && n51.f.a(this.f27477i, frVar.f27477i) && n51.f.a(this.f27478m, frVar.f27478m) && n51.f.a(this.f27479n, frVar.f27479n) && n51.f.a(this.f27480o, frVar.f27480o) && n51.f.a(java.lang.Integer.valueOf(this.f27481p), java.lang.Integer.valueOf(frVar.f27481p)) && n51.f.a(java.lang.Integer.valueOf(this.f27482q), java.lang.Integer.valueOf(frVar.f27482q)) && n51.f.a(java.lang.Integer.valueOf(this.f27483r), java.lang.Integer.valueOf(frVar.f27483r)) && n51.f.a(java.lang.Integer.valueOf(this.f27484s), java.lang.Integer.valueOf(frVar.f27484s)) && n51.f.a(java.lang.Integer.valueOf(this.f27485t), java.lang.Integer.valueOf(frVar.f27485t)) && n51.f.a(this.f27486u, frVar.f27486u) && n51.f.a(java.lang.Integer.valueOf(this.f27487v), java.lang.Integer.valueOf(frVar.f27487v)) && n51.f.a(this.f27488w, frVar.f27488w) && n51.f.a(java.lang.Integer.valueOf(this.f27489x), java.lang.Integer.valueOf(frVar.f27489x)) && n51.f.a(this.f27490y, frVar.f27490y) && n51.f.a(this.f27491z, frVar.f27491z) && n51.f.a(this.A, frVar.A) && n51.f.a(this.B, frVar.B);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fr();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.C;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27472d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f27473e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f27474f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f27475g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f27476h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f27477i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f27478m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f27479n;
            if (str8 != null && zArr[8]) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f27480o;
            if (str9 != null && zArr[9]) {
                fVar.j(9, str9);
            }
            if (zArr[10]) {
                fVar.e(10, this.f27481p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f27482q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f27483r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f27484s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f27485t);
            }
            java.lang.String str10 = this.f27486u;
            if (str10 != null && zArr[15]) {
                fVar.j(15, str10);
            }
            if (zArr[16]) {
                fVar.e(16, this.f27487v);
            }
            java.lang.String str11 = this.f27488w;
            if (str11 != null && zArr[17]) {
                fVar.j(17, str11);
            }
            if (zArr[18]) {
                fVar.e(18, this.f27489x);
            }
            java.lang.String str12 = this.f27490y;
            if (str12 != null && zArr[19]) {
                fVar.j(19, str12);
            }
            java.lang.String str13 = this.f27491z;
            if (str13 != null && zArr[20]) {
                fVar.j(20, str13);
            }
            java.lang.String str14 = this.A;
            if (str14 != null && zArr[21]) {
                fVar.j(21, str14);
            }
            bw5.j00 j00Var = this.B;
            if (j00Var != null && zArr[22]) {
                fVar.i(22, j00Var.computeSize());
                this.B.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str15 = this.f27472d;
            if (str15 != null && zArr[1]) {
                i18 = b36.f.j(1, str15) + 0;
            }
            java.lang.String str16 = this.f27473e;
            if (str16 != null && zArr[2]) {
                i18 += b36.f.j(2, str16);
            }
            java.lang.String str17 = this.f27474f;
            if (str17 != null && zArr[3]) {
                i18 += b36.f.j(3, str17);
            }
            java.lang.String str18 = this.f27475g;
            if (str18 != null && zArr[4]) {
                i18 += b36.f.j(4, str18);
            }
            java.lang.String str19 = this.f27476h;
            if (str19 != null && zArr[5]) {
                i18 += b36.f.j(5, str19);
            }
            java.lang.String str20 = this.f27477i;
            if (str20 != null && zArr[6]) {
                i18 += b36.f.j(6, str20);
            }
            java.lang.String str21 = this.f27478m;
            if (str21 != null && zArr[7]) {
                i18 += b36.f.j(7, str21);
            }
            java.lang.String str22 = this.f27479n;
            if (str22 != null && zArr[8]) {
                i18 += b36.f.j(8, str22);
            }
            java.lang.String str23 = this.f27480o;
            if (str23 != null && zArr[9]) {
                i18 += b36.f.j(9, str23);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f27481p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f27482q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f27483r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f27484s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f27485t);
            }
            java.lang.String str24 = this.f27486u;
            if (str24 != null && zArr[15]) {
                i18 += b36.f.j(15, str24);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f27487v);
            }
            java.lang.String str25 = this.f27488w;
            if (str25 != null && zArr[17]) {
                i18 += b36.f.j(17, str25);
            }
            if (zArr[18]) {
                i18 += b36.f.e(18, this.f27489x);
            }
            java.lang.String str26 = this.f27490y;
            if (str26 != null && zArr[19]) {
                i18 += b36.f.j(19, str26);
            }
            java.lang.String str27 = this.f27491z;
            if (str27 != null && zArr[20]) {
                i18 += b36.f.j(20, str27);
            }
            java.lang.String str28 = this.A;
            if (str28 != null && zArr[21]) {
                i18 += b36.f.j(21, str28);
            }
            bw5.j00 j00Var2 = this.B;
            return (j00Var2 == null || !zArr[22]) ? i18 : i18 + b36.f.i(22, j00Var2.computeSize());
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
                this.f27472d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27473e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27474f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27475g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27476h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27477i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27478m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27479n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f27480o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f27481p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f27482q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f27483r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f27484s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f27485t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f27486u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f27487v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f27488w = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f27489x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f27490y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f27491z = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.j00 j00Var3 = new bw5.j00();
                    if (bArr != null && bArr.length > 0) {
                        j00Var3.parseFrom(bArr);
                    }
                    this.B = j00Var3;
                }
                zArr[22] = true;
                return 0;
            default:
                return -1;
        }
    }
}
