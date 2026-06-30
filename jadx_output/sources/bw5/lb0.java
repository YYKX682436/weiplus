package bw5;

/* loaded from: classes10.dex */
public class lb0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29713d;

    /* renamed from: e, reason: collision with root package name */
    public int f29714e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29715f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f29716g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f29717h;

    /* renamed from: i, reason: collision with root package name */
    public int f29718i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f29719m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f29720n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f29721o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f29722p;

    /* renamed from: q, reason: collision with root package name */
    public int f29723q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f29724r = new boolean[12];

    static {
        new bw5.lb0();
    }

    public java.lang.String b() {
        return this.f29724r[5] ? this.f29717h : "";
    }

    public java.lang.String c() {
        return this.f29724r[7] ? this.f29719m : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lb0)) {
            return false;
        }
        bw5.lb0 lb0Var = (bw5.lb0) fVar;
        return n51.f.a(this.f29713d, lb0Var.f29713d) && n51.f.a(java.lang.Integer.valueOf(this.f29714e), java.lang.Integer.valueOf(lb0Var.f29714e)) && n51.f.a(this.f29715f, lb0Var.f29715f) && n51.f.a(this.f29716g, lb0Var.f29716g) && n51.f.a(this.f29717h, lb0Var.f29717h) && n51.f.a(java.lang.Integer.valueOf(this.f29718i), java.lang.Integer.valueOf(lb0Var.f29718i)) && n51.f.a(this.f29719m, lb0Var.f29719m) && n51.f.a(this.f29720n, lb0Var.f29720n) && n51.f.a(this.f29721o, lb0Var.f29721o) && n51.f.a(this.f29722p, lb0Var.f29722p) && n51.f.a(java.lang.Integer.valueOf(this.f29723q), java.lang.Integer.valueOf(lb0Var.f29723q));
    }

    public java.lang.String d() {
        return this.f29724r[8] ? this.f29720n : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public bw5.lb0 parseFrom(byte[] bArr) {
        return (bw5.lb0) super.parseFrom(bArr);
    }

    public java.lang.String getListenId() {
        return this.f29724r[1] ? this.f29713d : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.lb0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29724r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29713d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29714e);
            }
            java.lang.String str2 = this.f29715f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f29716g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f29717h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            if (zArr[6]) {
                fVar.e(6, this.f29718i);
            }
            java.lang.String str5 = this.f29719m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f29720n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f29721o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            com.tencent.mm.protobuf.g gVar = this.f29722p;
            if (gVar != null && zArr[10]) {
                fVar.b(10, gVar);
            }
            if (zArr[11]) {
                fVar.e(11, this.f29723q);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f29713d;
            if (str8 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str8);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f29714e);
            }
            java.lang.String str9 = this.f29715f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f29716g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f29717h;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f29718i);
            }
            java.lang.String str12 = this.f29719m;
            if (str12 != null && zArr[7]) {
                i18 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f29720n;
            if (str13 != null && zArr[8]) {
                i18 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f29721o;
            if (str14 != null && zArr[9]) {
                i18 += b36.f.j(9, str14);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f29722p;
            if (gVar2 != null && zArr[10]) {
                i18 += b36.f.b(10, gVar2);
            }
            return zArr[11] ? i18 + b36.f.e(11, this.f29723q) : i18;
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
                this.f29713d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29714e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29715f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29716g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29717h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29718i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f29719m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f29720n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f29721o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f29722p = aVar2.d(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f29723q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
