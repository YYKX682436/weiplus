package bw5;

/* loaded from: classes2.dex */
public class es0 extends com.tencent.mm.protobuf.f {
    public final boolean[] A = new boolean[21];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27036d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27037e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27038f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27039g;

    /* renamed from: h, reason: collision with root package name */
    public long f27040h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f27041i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f27042m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f27043n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f27044o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f27045p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f27046q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f27047r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f27048s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f27049t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f27050u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f27051v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f27052w;

    /* renamed from: x, reason: collision with root package name */
    public long f27053x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f27054y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f27055z;

    static {
        new bw5.es0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.es0 parseFrom(byte[] bArr) {
        return (bw5.es0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.es0)) {
            return false;
        }
        bw5.es0 es0Var = (bw5.es0) fVar;
        return n51.f.a(this.f27036d, es0Var.f27036d) && n51.f.a(this.f27037e, es0Var.f27037e) && n51.f.a(this.f27038f, es0Var.f27038f) && n51.f.a(this.f27039g, es0Var.f27039g) && n51.f.a(java.lang.Long.valueOf(this.f27040h), java.lang.Long.valueOf(es0Var.f27040h)) && n51.f.a(this.f27041i, es0Var.f27041i) && n51.f.a(this.f27042m, es0Var.f27042m) && n51.f.a(this.f27043n, es0Var.f27043n) && n51.f.a(this.f27044o, es0Var.f27044o) && n51.f.a(this.f27045p, es0Var.f27045p) && n51.f.a(this.f27046q, es0Var.f27046q) && n51.f.a(this.f27047r, es0Var.f27047r) && n51.f.a(this.f27048s, es0Var.f27048s) && n51.f.a(this.f27049t, es0Var.f27049t) && n51.f.a(this.f27050u, es0Var.f27050u) && n51.f.a(this.f27051v, es0Var.f27051v) && n51.f.a(this.f27052w, es0Var.f27052w) && n51.f.a(java.lang.Long.valueOf(this.f27053x), java.lang.Long.valueOf(es0Var.f27053x)) && n51.f.a(this.f27054y, es0Var.f27054y) && n51.f.a(this.f27055z, es0Var.f27055z);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.es0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.A;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27036d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f27037e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f27038f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f27039g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.h(5, this.f27040h);
            }
            java.lang.String str5 = this.f27041i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f27042m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f27043n;
            if (str7 != null && zArr[8]) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f27044o;
            if (str8 != null && zArr[9]) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f27045p;
            if (str9 != null && zArr[10]) {
                fVar.j(10, str9);
            }
            java.lang.String str10 = this.f27046q;
            if (str10 != null && zArr[11]) {
                fVar.j(11, str10);
            }
            java.lang.String str11 = this.f27047r;
            if (str11 != null && zArr[12]) {
                fVar.j(12, str11);
            }
            java.lang.String str12 = this.f27048s;
            if (str12 != null && zArr[13]) {
                fVar.j(13, str12);
            }
            java.lang.String str13 = this.f27049t;
            if (str13 != null && zArr[14]) {
                fVar.j(14, str13);
            }
            java.lang.String str14 = this.f27050u;
            if (str14 != null && zArr[15]) {
                fVar.j(15, str14);
            }
            java.lang.String str15 = this.f27051v;
            if (str15 != null && zArr[16]) {
                fVar.j(16, str15);
            }
            java.lang.String str16 = this.f27052w;
            if (str16 != null && zArr[17]) {
                fVar.j(17, str16);
            }
            if (zArr[18]) {
                fVar.h(18, this.f27053x);
            }
            java.lang.String str17 = this.f27054y;
            if (str17 != null && zArr[19]) {
                fVar.j(19, str17);
            }
            java.lang.String str18 = this.f27055z;
            if (str18 != null && zArr[20]) {
                fVar.j(20, str18);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str19 = this.f27036d;
            if (str19 != null && zArr[1]) {
                i18 = b36.f.j(1, str19) + 0;
            }
            java.lang.String str20 = this.f27037e;
            if (str20 != null && zArr[2]) {
                i18 += b36.f.j(2, str20);
            }
            java.lang.String str21 = this.f27038f;
            if (str21 != null && zArr[3]) {
                i18 += b36.f.j(3, str21);
            }
            java.lang.String str22 = this.f27039g;
            if (str22 != null && zArr[4]) {
                i18 += b36.f.j(4, str22);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f27040h);
            }
            java.lang.String str23 = this.f27041i;
            if (str23 != null && zArr[6]) {
                i18 += b36.f.j(6, str23);
            }
            java.lang.String str24 = this.f27042m;
            if (str24 != null && zArr[7]) {
                i18 += b36.f.j(7, str24);
            }
            java.lang.String str25 = this.f27043n;
            if (str25 != null && zArr[8]) {
                i18 += b36.f.j(8, str25);
            }
            java.lang.String str26 = this.f27044o;
            if (str26 != null && zArr[9]) {
                i18 += b36.f.j(9, str26);
            }
            java.lang.String str27 = this.f27045p;
            if (str27 != null && zArr[10]) {
                i18 += b36.f.j(10, str27);
            }
            java.lang.String str28 = this.f27046q;
            if (str28 != null && zArr[11]) {
                i18 += b36.f.j(11, str28);
            }
            java.lang.String str29 = this.f27047r;
            if (str29 != null && zArr[12]) {
                i18 += b36.f.j(12, str29);
            }
            java.lang.String str30 = this.f27048s;
            if (str30 != null && zArr[13]) {
                i18 += b36.f.j(13, str30);
            }
            java.lang.String str31 = this.f27049t;
            if (str31 != null && zArr[14]) {
                i18 += b36.f.j(14, str31);
            }
            java.lang.String str32 = this.f27050u;
            if (str32 != null && zArr[15]) {
                i18 += b36.f.j(15, str32);
            }
            java.lang.String str33 = this.f27051v;
            if (str33 != null && zArr[16]) {
                i18 += b36.f.j(16, str33);
            }
            java.lang.String str34 = this.f27052w;
            if (str34 != null && zArr[17]) {
                i18 += b36.f.j(17, str34);
            }
            if (zArr[18]) {
                i18 += b36.f.h(18, this.f27053x);
            }
            java.lang.String str35 = this.f27054y;
            if (str35 != null && zArr[19]) {
                i18 += b36.f.j(19, str35);
            }
            java.lang.String str36 = this.f27055z;
            return (str36 == null || !zArr[20]) ? i18 : i18 + b36.f.j(20, str36);
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
                this.f27036d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27037e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27038f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27039g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27040h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27041i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27042m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27043n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f27044o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f27045p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f27046q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f27047r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f27048s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f27049t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f27050u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f27051v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f27052w = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f27053x = aVar2.i(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f27054y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f27055z = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            default:
                return -1;
        }
    }
}
