package bw5;

/* loaded from: classes2.dex */
public class nb0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f30598d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30599e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30600f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30601g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30602h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30603i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30604m;

    /* renamed from: n, reason: collision with root package name */
    public long f30605n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f30606o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f30607p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f30608q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f30609r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f30610s = new boolean[13];

    static {
        new bw5.nb0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nb0 parseFrom(byte[] bArr) {
        return (bw5.nb0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nb0)) {
            return false;
        }
        bw5.nb0 nb0Var = (bw5.nb0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f30598d), java.lang.Integer.valueOf(nb0Var.f30598d)) && n51.f.a(this.f30599e, nb0Var.f30599e) && n51.f.a(this.f30600f, nb0Var.f30600f) && n51.f.a(this.f30601g, nb0Var.f30601g) && n51.f.a(this.f30602h, nb0Var.f30602h) && n51.f.a(this.f30603i, nb0Var.f30603i) && n51.f.a(this.f30604m, nb0Var.f30604m) && n51.f.a(java.lang.Long.valueOf(this.f30605n), java.lang.Long.valueOf(nb0Var.f30605n)) && n51.f.a(this.f30606o, nb0Var.f30606o) && n51.f.a(this.f30607p, nb0Var.f30607p) && n51.f.a(this.f30608q, nb0Var.f30608q) && n51.f.a(this.f30609r, nb0Var.f30609r);
    }

    public java.lang.String getFinderUsername() {
        return this.f30610s[3] ? this.f30600f : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.nb0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30610s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f30598d);
            }
            java.lang.String str = this.f30599e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f30600f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f30601g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f30602h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f30603i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f30604m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            if (zArr[8]) {
                fVar.h(8, this.f30605n);
            }
            java.lang.String str7 = this.f30606o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f30607p;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.f30608q;
            if (str9 != null && zArr[11]) {
                fVar.j(11, str9);
            }
            java.lang.String str10 = this.f30609r;
            if (str10 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str10);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f30598d) : 0;
            java.lang.String str11 = this.f30599e;
            if (str11 != null && zArr[2]) {
                e17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f30600f;
            if (str12 != null && zArr[3]) {
                e17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f30601g;
            if (str13 != null && zArr[4]) {
                e17 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f30602h;
            if (str14 != null && zArr[5]) {
                e17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f30603i;
            if (str15 != null && zArr[6]) {
                e17 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f30604m;
            if (str16 != null && zArr[7]) {
                e17 += b36.f.j(7, str16);
            }
            if (zArr[8]) {
                e17 += b36.f.h(8, this.f30605n);
            }
            java.lang.String str17 = this.f30606o;
            if (str17 != null && zArr[9]) {
                e17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f30607p;
            if (str18 != null && zArr[10]) {
                e17 += b36.f.j(10, str18);
            }
            java.lang.String str19 = this.f30608q;
            if (str19 != null && zArr[11]) {
                e17 += b36.f.j(11, str19);
            }
            java.lang.String str20 = this.f30609r;
            return (str20 == null || !zArr[12]) ? e17 : e17 + b36.f.j(12, str20);
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
                this.f30598d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30599e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30600f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30601g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30602h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30603i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30604m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30605n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f30606o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f30607p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f30608q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f30609r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
