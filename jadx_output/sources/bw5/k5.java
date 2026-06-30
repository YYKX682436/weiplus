package bw5;

/* loaded from: classes9.dex */
public class k5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29239d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29240e;

    /* renamed from: f, reason: collision with root package name */
    public int f29241f;

    /* renamed from: g, reason: collision with root package name */
    public int f29242g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f29243h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f29244i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f29245m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f29246n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f29247o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f29248p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f29249q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f29250r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f29251s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f29252t = new boolean[14];

    static {
        new bw5.k5();
    }

    public java.lang.String b() {
        return this.f29252t[5] ? this.f29243h : "";
    }

    public java.lang.String c() {
        return this.f29252t[8] ? this.f29246n : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k5)) {
            return false;
        }
        bw5.k5 k5Var = (bw5.k5) fVar;
        return n51.f.a(this.f29239d, k5Var.f29239d) && n51.f.a(this.f29240e, k5Var.f29240e) && n51.f.a(java.lang.Integer.valueOf(this.f29241f), java.lang.Integer.valueOf(k5Var.f29241f)) && n51.f.a(java.lang.Integer.valueOf(this.f29242g), java.lang.Integer.valueOf(k5Var.f29242g)) && n51.f.a(this.f29243h, k5Var.f29243h) && n51.f.a(this.f29244i, k5Var.f29244i) && n51.f.a(this.f29245m, k5Var.f29245m) && n51.f.a(this.f29246n, k5Var.f29246n) && n51.f.a(this.f29247o, k5Var.f29247o) && n51.f.a(this.f29248p, k5Var.f29248p) && n51.f.a(this.f29249q, k5Var.f29249q) && n51.f.a(this.f29250r, k5Var.f29250r) && n51.f.a(this.f29251s, k5Var.f29251s);
    }

    public java.lang.String d() {
        return this.f29252t[11] ? this.f29249q : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public bw5.k5 parseFrom(byte[] bArr) {
        return (bw5.k5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.k5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29252t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29239d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f29240e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f29241f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f29242g);
            }
            java.lang.String str3 = this.f29243h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f29244i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f29245m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f29246n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f29247o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f29248p;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.f29249q;
            if (str9 != null && zArr[11]) {
                fVar.j(11, str9);
            }
            java.lang.String str10 = this.f29250r;
            if (str10 != null && zArr[12]) {
                fVar.j(12, str10);
            }
            java.lang.String str11 = this.f29251s;
            if (str11 == null || !zArr[13]) {
                return 0;
            }
            fVar.j(13, str11);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f29239d;
            int j17 = (str12 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str12);
            java.lang.String str13 = this.f29240e;
            if (str13 != null && zArr[2]) {
                j17 += b36.f.j(2, str13);
            }
            if (zArr[3]) {
                j17 += b36.f.e(3, this.f29241f);
            }
            if (zArr[4]) {
                j17 += b36.f.e(4, this.f29242g);
            }
            java.lang.String str14 = this.f29243h;
            if (str14 != null && zArr[5]) {
                j17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f29244i;
            if (str15 != null && zArr[6]) {
                j17 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f29245m;
            if (str16 != null && zArr[7]) {
                j17 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f29246n;
            if (str17 != null && zArr[8]) {
                j17 += b36.f.j(8, str17);
            }
            java.lang.String str18 = this.f29247o;
            if (str18 != null && zArr[9]) {
                j17 += b36.f.j(9, str18);
            }
            java.lang.String str19 = this.f29248p;
            if (str19 != null && zArr[10]) {
                j17 += b36.f.j(10, str19);
            }
            java.lang.String str20 = this.f29249q;
            if (str20 != null && zArr[11]) {
                j17 += b36.f.j(11, str20);
            }
            java.lang.String str21 = this.f29250r;
            if (str21 != null && zArr[12]) {
                j17 += b36.f.j(12, str21);
            }
            java.lang.String str22 = this.f29251s;
            return (str22 == null || !zArr[13]) ? j17 : j17 + b36.f.j(13, str22);
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
                this.f29239d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29240e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29241f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29242g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29243h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29244i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f29245m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f29246n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f29247o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f29248p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f29249q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f29250r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f29251s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
