package bw5;

/* loaded from: classes9.dex */
public class y5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35369d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35370e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35371f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f35372g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f35373h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f35374i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f35375m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f35376n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f35377o;

    /* renamed from: p, reason: collision with root package name */
    public int f35378p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f35379q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f35380r = new boolean[12];

    static {
        new bw5.y5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.y5 parseFrom(byte[] bArr) {
        return (bw5.y5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y5)) {
            return false;
        }
        bw5.y5 y5Var = (bw5.y5) fVar;
        return n51.f.a(this.f35369d, y5Var.f35369d) && n51.f.a(this.f35370e, y5Var.f35370e) && n51.f.a(this.f35371f, y5Var.f35371f) && n51.f.a(this.f35372g, y5Var.f35372g) && n51.f.a(this.f35373h, y5Var.f35373h) && n51.f.a(this.f35374i, y5Var.f35374i) && n51.f.a(this.f35375m, y5Var.f35375m) && n51.f.a(this.f35376n, y5Var.f35376n) && n51.f.a(this.f35377o, y5Var.f35377o) && n51.f.a(java.lang.Integer.valueOf(this.f35378p), java.lang.Integer.valueOf(y5Var.f35378p)) && n51.f.a(this.f35379q, y5Var.f35379q);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.y5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35380r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35369d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f35370e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f35371f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f35372g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f35373h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f35374i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f35375m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f35376n;
            if (str8 != null && zArr[8]) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f35377o;
            if (str9 != null && zArr[9]) {
                fVar.j(9, str9);
            }
            if (zArr[10]) {
                fVar.e(10, this.f35378p);
            }
            java.lang.String str10 = this.f35379q;
            if (str10 != null && zArr[11]) {
                fVar.j(11, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f35369d;
            if (str11 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str11);
            }
            java.lang.String str12 = this.f35370e;
            if (str12 != null && zArr[2]) {
                i18 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f35371f;
            if (str13 != null && zArr[3]) {
                i18 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f35372g;
            if (str14 != null && zArr[4]) {
                i18 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f35373h;
            if (str15 != null && zArr[5]) {
                i18 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f35374i;
            if (str16 != null && zArr[6]) {
                i18 += b36.f.j(6, str16);
            }
            java.lang.String str17 = this.f35375m;
            if (str17 != null && zArr[7]) {
                i18 += b36.f.j(7, str17);
            }
            java.lang.String str18 = this.f35376n;
            if (str18 != null && zArr[8]) {
                i18 += b36.f.j(8, str18);
            }
            java.lang.String str19 = this.f35377o;
            if (str19 != null && zArr[9]) {
                i18 += b36.f.j(9, str19);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f35378p);
            }
            java.lang.String str20 = this.f35379q;
            return (str20 == null || !zArr[11]) ? i18 : i18 + b36.f.j(11, str20);
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
                this.f35369d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35370e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35371f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35372g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35373h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35374i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f35375m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f35376n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f35377o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f35378p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f35379q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
