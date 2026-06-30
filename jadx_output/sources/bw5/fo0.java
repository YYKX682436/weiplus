package bw5;

/* loaded from: classes2.dex */
public class fo0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27417d;

    /* renamed from: e, reason: collision with root package name */
    public int f27418e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27419f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27420g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f27421h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f27422i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f27423m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f27424n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f27425o = new boolean[9];

    static {
        new bw5.fo0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fo0 parseFrom(byte[] bArr) {
        return (bw5.fo0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fo0)) {
            return false;
        }
        bw5.fo0 fo0Var = (bw5.fo0) fVar;
        return n51.f.a(this.f27417d, fo0Var.f27417d) && n51.f.a(java.lang.Integer.valueOf(this.f27418e), java.lang.Integer.valueOf(fo0Var.f27418e)) && n51.f.a(this.f27419f, fo0Var.f27419f) && n51.f.a(this.f27420g, fo0Var.f27420g) && n51.f.a(this.f27421h, fo0Var.f27421h) && n51.f.a(this.f27422i, fo0Var.f27422i) && n51.f.a(this.f27423m, fo0Var.f27423m) && n51.f.a(this.f27424n, fo0Var.f27424n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fo0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27425o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27417d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27418e);
            }
            java.lang.String str2 = this.f27419f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f27420g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f27421h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f27422i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f27423m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f27424n;
            if (str7 != null && zArr[8]) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f27417d;
            if (str8 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str8);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f27418e);
            }
            java.lang.String str9 = this.f27419f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f27420g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f27421h;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f27422i;
            if (str12 != null && zArr[6]) {
                i18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f27423m;
            if (str13 != null && zArr[7]) {
                i18 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f27424n;
            return (str14 == null || !zArr[8]) ? i18 : i18 + b36.f.j(8, str14);
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
                this.f27417d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27418e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27419f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27420g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27421h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27422i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27423m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27424n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
