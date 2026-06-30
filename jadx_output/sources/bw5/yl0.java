package bw5;

/* loaded from: classes11.dex */
public class yl0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35544d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35545e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35546f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f35547g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f35548h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f35549i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f35550m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f35551n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f35552o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f35553p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f35554q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f35555r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f35556s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f35557t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f35558u = new boolean[15];

    static {
        new bw5.yl0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yl0 parseFrom(byte[] bArr) {
        return (bw5.yl0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yl0)) {
            return false;
        }
        bw5.yl0 yl0Var = (bw5.yl0) fVar;
        return n51.f.a(this.f35544d, yl0Var.f35544d) && n51.f.a(this.f35545e, yl0Var.f35545e) && n51.f.a(this.f35546f, yl0Var.f35546f) && n51.f.a(this.f35547g, yl0Var.f35547g) && n51.f.a(this.f35548h, yl0Var.f35548h) && n51.f.a(this.f35549i, yl0Var.f35549i) && n51.f.a(this.f35550m, yl0Var.f35550m) && n51.f.a(this.f35551n, yl0Var.f35551n) && n51.f.a(this.f35552o, yl0Var.f35552o) && n51.f.a(this.f35553p, yl0Var.f35553p) && n51.f.a(this.f35554q, yl0Var.f35554q) && n51.f.a(this.f35555r, yl0Var.f35555r) && n51.f.a(this.f35556s, yl0Var.f35556s) && n51.f.a(this.f35557t, yl0Var.f35557t);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yl0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35558u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35544d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f35545e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f35546f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f35547g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f35548h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f35549i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f35550m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f35551n;
            if (str8 != null && zArr[8]) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f35552o;
            if (str9 != null && zArr[9]) {
                fVar.j(9, str9);
            }
            java.lang.String str10 = this.f35553p;
            if (str10 != null && zArr[10]) {
                fVar.j(10, str10);
            }
            java.lang.String str11 = this.f35554q;
            if (str11 != null && zArr[11]) {
                fVar.j(11, str11);
            }
            java.lang.String str12 = this.f35555r;
            if (str12 != null && zArr[12]) {
                fVar.j(12, str12);
            }
            java.lang.String str13 = this.f35556s;
            if (str13 != null && zArr[13]) {
                fVar.j(13, str13);
            }
            java.lang.String str14 = this.f35557t;
            if (str14 == null || !zArr[14]) {
                return 0;
            }
            fVar.j(14, str14);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str15 = this.f35544d;
            int j17 = (str15 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str15);
            java.lang.String str16 = this.f35545e;
            if (str16 != null && zArr[2]) {
                j17 += b36.f.j(2, str16);
            }
            java.lang.String str17 = this.f35546f;
            if (str17 != null && zArr[3]) {
                j17 += b36.f.j(3, str17);
            }
            java.lang.String str18 = this.f35547g;
            if (str18 != null && zArr[4]) {
                j17 += b36.f.j(4, str18);
            }
            java.lang.String str19 = this.f35548h;
            if (str19 != null && zArr[5]) {
                j17 += b36.f.j(5, str19);
            }
            java.lang.String str20 = this.f35549i;
            if (str20 != null && zArr[6]) {
                j17 += b36.f.j(6, str20);
            }
            java.lang.String str21 = this.f35550m;
            if (str21 != null && zArr[7]) {
                j17 += b36.f.j(7, str21);
            }
            java.lang.String str22 = this.f35551n;
            if (str22 != null && zArr[8]) {
                j17 += b36.f.j(8, str22);
            }
            java.lang.String str23 = this.f35552o;
            if (str23 != null && zArr[9]) {
                j17 += b36.f.j(9, str23);
            }
            java.lang.String str24 = this.f35553p;
            if (str24 != null && zArr[10]) {
                j17 += b36.f.j(10, str24);
            }
            java.lang.String str25 = this.f35554q;
            if (str25 != null && zArr[11]) {
                j17 += b36.f.j(11, str25);
            }
            java.lang.String str26 = this.f35555r;
            if (str26 != null && zArr[12]) {
                j17 += b36.f.j(12, str26);
            }
            java.lang.String str27 = this.f35556s;
            if (str27 != null && zArr[13]) {
                j17 += b36.f.j(13, str27);
            }
            java.lang.String str28 = this.f35557t;
            return (str28 == null || !zArr[14]) ? j17 : j17 + b36.f.j(14, str28);
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
                this.f35544d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35545e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35546f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35547g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35548h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35549i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f35550m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f35551n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f35552o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f35553p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f35554q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f35555r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f35556s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f35557t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }
}
