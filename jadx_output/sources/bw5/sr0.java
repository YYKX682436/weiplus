package bw5;

/* loaded from: classes4.dex */
public class sr0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33118d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33119e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33120f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33121g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f33122h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f33123i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f33124m = new boolean[7];

    static {
        new bw5.sr0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sr0 parseFrom(byte[] bArr) {
        return (bw5.sr0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sr0)) {
            return false;
        }
        bw5.sr0 sr0Var = (bw5.sr0) fVar;
        return n51.f.a(this.f33118d, sr0Var.f33118d) && n51.f.a(this.f33119e, sr0Var.f33119e) && n51.f.a(this.f33120f, sr0Var.f33120f) && n51.f.a(this.f33121g, sr0Var.f33121g) && n51.f.a(this.f33122h, sr0Var.f33122h) && n51.f.a(this.f33123i, sr0Var.f33123i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sr0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33124m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33118d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f33119e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f33120f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f33121g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f33122h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f33123i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f33118d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f33119e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f33120f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f33121g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f33122h;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f33123i;
            return (str12 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str12);
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
                this.f33118d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33119e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33120f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33121g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33122h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33123i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
