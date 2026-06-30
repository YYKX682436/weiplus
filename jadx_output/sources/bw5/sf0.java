package bw5;

/* loaded from: classes2.dex */
public class sf0 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public final boolean[] B = new boolean[30];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32959d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32960e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32961f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32962g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f32963h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f32964i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f32965m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f32966n;

    /* renamed from: o, reason: collision with root package name */
    public long f32967o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f32968p;

    /* renamed from: q, reason: collision with root package name */
    public int f32969q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f32970r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f32971s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f32972t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f32973u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f32974v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f32975w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f32976x;

    /* renamed from: y, reason: collision with root package name */
    public int f32977y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f32978z;

    static {
        new bw5.sf0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sf0 parseFrom(byte[] bArr) {
        return (bw5.sf0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sf0)) {
            return false;
        }
        bw5.sf0 sf0Var = (bw5.sf0) fVar;
        return n51.f.a(this.f32959d, sf0Var.f32959d) && n51.f.a(this.f32960e, sf0Var.f32960e) && n51.f.a(this.f32961f, sf0Var.f32961f) && n51.f.a(this.f32962g, sf0Var.f32962g) && n51.f.a(this.f32963h, sf0Var.f32963h) && n51.f.a(this.f32964i, sf0Var.f32964i) && n51.f.a(this.f32965m, sf0Var.f32965m) && n51.f.a(this.f32966n, sf0Var.f32966n) && n51.f.a(java.lang.Long.valueOf(this.f32967o), java.lang.Long.valueOf(sf0Var.f32967o)) && n51.f.a(this.f32968p, sf0Var.f32968p) && n51.f.a(java.lang.Integer.valueOf(this.f32969q), java.lang.Integer.valueOf(sf0Var.f32969q)) && n51.f.a(this.f32970r, sf0Var.f32970r) && n51.f.a(this.f32971s, sf0Var.f32971s) && n51.f.a(this.f32972t, sf0Var.f32972t) && n51.f.a(this.f32973u, sf0Var.f32973u) && n51.f.a(this.f32974v, sf0Var.f32974v) && n51.f.a(this.f32975w, sf0Var.f32975w) && n51.f.a(this.f32976x, sf0Var.f32976x) && n51.f.a(java.lang.Integer.valueOf(this.f32977y), java.lang.Integer.valueOf(sf0Var.f32977y)) && n51.f.a(this.f32978z, sf0Var.f32978z) && n51.f.a(this.A, sf0Var.A);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sf0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.B;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32959d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f32960e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f32961f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f32962g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f32963h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f32964i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f32965m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f32966n;
            if (str8 != null && zArr[8]) {
                fVar.j(8, str8);
            }
            if (zArr[9]) {
                fVar.h(9, this.f32967o);
            }
            java.lang.String str9 = this.f32968p;
            if (str9 != null && zArr[10]) {
                fVar.j(10, str9);
            }
            if (zArr[11]) {
                fVar.e(11, this.f32969q);
            }
            java.lang.String str10 = this.f32970r;
            if (str10 != null && zArr[12]) {
                fVar.j(12, str10);
            }
            java.lang.String str11 = this.f32971s;
            if (str11 != null && zArr[13]) {
                fVar.j(13, str11);
            }
            java.lang.String str12 = this.f32972t;
            if (str12 != null && zArr[21]) {
                fVar.j(21, str12);
            }
            java.lang.String str13 = this.f32973u;
            if (str13 != null && zArr[22]) {
                fVar.j(22, str13);
            }
            java.lang.String str14 = this.f32974v;
            if (str14 != null && zArr[23]) {
                fVar.j(23, str14);
            }
            java.lang.String str15 = this.f32975w;
            if (str15 != null && zArr[25]) {
                fVar.j(25, str15);
            }
            java.lang.String str16 = this.f32976x;
            if (str16 != null && zArr[26]) {
                fVar.j(26, str16);
            }
            if (zArr[27]) {
                fVar.e(27, this.f32977y);
            }
            java.lang.String str17 = this.f32978z;
            if (str17 != null && zArr[28]) {
                fVar.j(28, str17);
            }
            java.lang.String str18 = this.A;
            if (str18 != null && zArr[29]) {
                fVar.j(29, str18);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str19 = this.f32959d;
            if (str19 != null && zArr[1]) {
                i18 = b36.f.j(1, str19) + 0;
            }
            java.lang.String str20 = this.f32960e;
            if (str20 != null && zArr[2]) {
                i18 += b36.f.j(2, str20);
            }
            java.lang.String str21 = this.f32961f;
            if (str21 != null && zArr[3]) {
                i18 += b36.f.j(3, str21);
            }
            java.lang.String str22 = this.f32962g;
            if (str22 != null && zArr[4]) {
                i18 += b36.f.j(4, str22);
            }
            java.lang.String str23 = this.f32963h;
            if (str23 != null && zArr[5]) {
                i18 += b36.f.j(5, str23);
            }
            java.lang.String str24 = this.f32964i;
            if (str24 != null && zArr[6]) {
                i18 += b36.f.j(6, str24);
            }
            java.lang.String str25 = this.f32965m;
            if (str25 != null && zArr[7]) {
                i18 += b36.f.j(7, str25);
            }
            java.lang.String str26 = this.f32966n;
            if (str26 != null && zArr[8]) {
                i18 += b36.f.j(8, str26);
            }
            if (zArr[9]) {
                i18 += b36.f.h(9, this.f32967o);
            }
            java.lang.String str27 = this.f32968p;
            if (str27 != null && zArr[10]) {
                i18 += b36.f.j(10, str27);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f32969q);
            }
            java.lang.String str28 = this.f32970r;
            if (str28 != null && zArr[12]) {
                i18 += b36.f.j(12, str28);
            }
            java.lang.String str29 = this.f32971s;
            if (str29 != null && zArr[13]) {
                i18 += b36.f.j(13, str29);
            }
            java.lang.String str30 = this.f32972t;
            if (str30 != null && zArr[21]) {
                i18 += b36.f.j(21, str30);
            }
            java.lang.String str31 = this.f32973u;
            if (str31 != null && zArr[22]) {
                i18 += b36.f.j(22, str31);
            }
            java.lang.String str32 = this.f32974v;
            if (str32 != null && zArr[23]) {
                i18 += b36.f.j(23, str32);
            }
            java.lang.String str33 = this.f32975w;
            if (str33 != null && zArr[25]) {
                i18 += b36.f.j(25, str33);
            }
            java.lang.String str34 = this.f32976x;
            if (str34 != null && zArr[26]) {
                i18 += b36.f.j(26, str34);
            }
            if (zArr[27]) {
                i18 += b36.f.e(27, this.f32977y);
            }
            java.lang.String str35 = this.f32978z;
            if (str35 != null && zArr[28]) {
                i18 += b36.f.j(28, str35);
            }
            java.lang.String str36 = this.A;
            return (str36 == null || !zArr[29]) ? i18 : i18 + b36.f.j(29, str36);
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
                this.f32959d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32960e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32961f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32962g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32963h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32964i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f32965m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f32966n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f32967o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f32968p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f32969q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f32970r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f32971s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            default:
                switch (intValue) {
                    case 21:
                        this.f32972t = aVar2.k(intValue);
                        zArr[21] = true;
                        return 0;
                    case 22:
                        this.f32973u = aVar2.k(intValue);
                        zArr[22] = true;
                        return 0;
                    case 23:
                        this.f32974v = aVar2.k(intValue);
                        zArr[23] = true;
                        return 0;
                    default:
                        switch (intValue) {
                            case 25:
                                this.f32975w = aVar2.k(intValue);
                                zArr[25] = true;
                                return 0;
                            case 26:
                                this.f32976x = aVar2.k(intValue);
                                zArr[26] = true;
                                return 0;
                            case 27:
                                this.f32977y = aVar2.g(intValue);
                                zArr[27] = true;
                                return 0;
                            case 28:
                                this.f32978z = aVar2.k(intValue);
                                zArr[28] = true;
                                return 0;
                            case 29:
                                this.A = aVar2.k(intValue);
                                zArr[29] = true;
                                return 0;
                            default:
                                return -1;
                        }
                }
        }
    }
}
