package bw5;

/* loaded from: classes4.dex */
public class sj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33014d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33015e;

    /* renamed from: f, reason: collision with root package name */
    public int f33016f;

    /* renamed from: g, reason: collision with root package name */
    public int f33017g;

    /* renamed from: h, reason: collision with root package name */
    public int f33018h;

    /* renamed from: i, reason: collision with root package name */
    public int f33019i;

    /* renamed from: m, reason: collision with root package name */
    public int f33020m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f33021n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f33022o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f33023p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f33024q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f33025r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f33026s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f33027t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f33028u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f33029v = new boolean[16];

    static {
        new bw5.sj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sj0 parseFrom(byte[] bArr) {
        return (bw5.sj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sj0)) {
            return false;
        }
        bw5.sj0 sj0Var = (bw5.sj0) fVar;
        return n51.f.a(this.f33014d, sj0Var.f33014d) && n51.f.a(this.f33015e, sj0Var.f33015e) && n51.f.a(java.lang.Integer.valueOf(this.f33016f), java.lang.Integer.valueOf(sj0Var.f33016f)) && n51.f.a(java.lang.Integer.valueOf(this.f33017g), java.lang.Integer.valueOf(sj0Var.f33017g)) && n51.f.a(java.lang.Integer.valueOf(this.f33018h), java.lang.Integer.valueOf(sj0Var.f33018h)) && n51.f.a(java.lang.Integer.valueOf(this.f33019i), java.lang.Integer.valueOf(sj0Var.f33019i)) && n51.f.a(java.lang.Integer.valueOf(this.f33020m), java.lang.Integer.valueOf(sj0Var.f33020m)) && n51.f.a(this.f33021n, sj0Var.f33021n) && n51.f.a(this.f33022o, sj0Var.f33022o) && n51.f.a(this.f33023p, sj0Var.f33023p) && n51.f.a(this.f33024q, sj0Var.f33024q) && n51.f.a(this.f33025r, sj0Var.f33025r) && n51.f.a(this.f33026s, sj0Var.f33026s) && n51.f.a(this.f33027t, sj0Var.f33027t) && n51.f.a(this.f33028u, sj0Var.f33028u);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33029v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33014d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f33015e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33016f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f33017g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f33018h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f33019i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f33020m);
            }
            java.lang.String str3 = this.f33021n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f33022o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f33023p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f33024q;
            if (str6 != null && zArr[11]) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f33025r;
            if (str7 != null && zArr[12]) {
                fVar.j(12, str7);
            }
            java.lang.String str8 = this.f33026s;
            if (str8 != null && zArr[13]) {
                fVar.j(13, str8);
            }
            java.lang.String str9 = this.f33027t;
            if (str9 != null && zArr[14]) {
                fVar.j(14, str9);
            }
            java.lang.String str10 = this.f33028u;
            if (str10 != null && zArr[15]) {
                fVar.j(15, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f33014d;
            if (str11 != null && zArr[1]) {
                i18 = b36.f.j(1, str11) + 0;
            }
            java.lang.String str12 = this.f33015e;
            if (str12 != null && zArr[2]) {
                i18 += b36.f.j(2, str12);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f33016f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f33017g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f33018h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f33019i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f33020m);
            }
            java.lang.String str13 = this.f33021n;
            if (str13 != null && zArr[8]) {
                i18 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f33022o;
            if (str14 != null && zArr[9]) {
                i18 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f33023p;
            if (str15 != null && zArr[10]) {
                i18 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f33024q;
            if (str16 != null && zArr[11]) {
                i18 += b36.f.j(11, str16);
            }
            java.lang.String str17 = this.f33025r;
            if (str17 != null && zArr[12]) {
                i18 += b36.f.j(12, str17);
            }
            java.lang.String str18 = this.f33026s;
            if (str18 != null && zArr[13]) {
                i18 += b36.f.j(13, str18);
            }
            java.lang.String str19 = this.f33027t;
            if (str19 != null && zArr[14]) {
                i18 += b36.f.j(14, str19);
            }
            java.lang.String str20 = this.f33028u;
            return (str20 == null || !zArr[15]) ? i18 : i18 + b36.f.j(15, str20);
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
                this.f33014d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33015e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33016f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33017g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33018h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33019i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33020m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33021n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33022o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f33023p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f33024q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f33025r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f33026s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f33027t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f33028u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
