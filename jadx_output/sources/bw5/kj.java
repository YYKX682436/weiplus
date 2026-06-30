package bw5;

/* loaded from: classes2.dex */
public class kj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29388d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29389e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29390f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f29391g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f29392h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f29393i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f29394m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f29395n;

    /* renamed from: o, reason: collision with root package name */
    public int f29396o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f29397p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f29398q = new boolean[11];

    static {
        new bw5.kj();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.kj parseFrom(byte[] bArr) {
        return (bw5.kj) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kj)) {
            return false;
        }
        bw5.kj kjVar = (bw5.kj) fVar;
        return n51.f.a(this.f29388d, kjVar.f29388d) && n51.f.a(this.f29389e, kjVar.f29389e) && n51.f.a(this.f29390f, kjVar.f29390f) && n51.f.a(this.f29391g, kjVar.f29391g) && n51.f.a(this.f29392h, kjVar.f29392h) && n51.f.a(this.f29393i, kjVar.f29393i) && n51.f.a(this.f29394m, kjVar.f29394m) && n51.f.a(this.f29395n, kjVar.f29395n) && n51.f.a(java.lang.Integer.valueOf(this.f29396o), java.lang.Integer.valueOf(kjVar.f29396o)) && n51.f.a(this.f29397p, kjVar.f29397p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.kj();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29398q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29388d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f29389e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f29390f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f29391g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f29392h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f29393i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f29394m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f29395n;
            if (str8 != null && zArr[8]) {
                fVar.j(8, str8);
            }
            if (zArr[9]) {
                fVar.e(9, this.f29396o);
            }
            java.lang.String str9 = this.f29397p;
            if (str9 != null && zArr[10]) {
                fVar.j(10, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f29388d;
            if (str10 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str10);
            }
            java.lang.String str11 = this.f29389e;
            if (str11 != null && zArr[2]) {
                i18 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f29390f;
            if (str12 != null && zArr[3]) {
                i18 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f29391g;
            if (str13 != null && zArr[4]) {
                i18 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f29392h;
            if (str14 != null && zArr[5]) {
                i18 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f29393i;
            if (str15 != null && zArr[6]) {
                i18 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f29394m;
            if (str16 != null && zArr[7]) {
                i18 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f29395n;
            if (str17 != null && zArr[8]) {
                i18 += b36.f.j(8, str17);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f29396o);
            }
            java.lang.String str18 = this.f29397p;
            return (str18 == null || !zArr[10]) ? i18 : i18 + b36.f.j(10, str18);
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
                this.f29388d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29389e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29390f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29391g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29392h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29393i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f29394m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f29395n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f29396o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f29397p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
