package bw5;

/* loaded from: classes2.dex */
public class zh extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35991d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35992e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35993f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f35994g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f35995h;

    /* renamed from: i, reason: collision with root package name */
    public int f35996i;

    /* renamed from: m, reason: collision with root package name */
    public int f35997m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f35998n = new boolean[8];

    static {
        new bw5.zh();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zh parseFrom(byte[] bArr) {
        return (bw5.zh) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zh)) {
            return false;
        }
        bw5.zh zhVar = (bw5.zh) fVar;
        return n51.f.a(this.f35991d, zhVar.f35991d) && n51.f.a(this.f35992e, zhVar.f35992e) && n51.f.a(this.f35993f, zhVar.f35993f) && n51.f.a(this.f35994g, zhVar.f35994g) && n51.f.a(this.f35995h, zhVar.f35995h) && n51.f.a(java.lang.Integer.valueOf(this.f35996i), java.lang.Integer.valueOf(zhVar.f35996i)) && n51.f.a(java.lang.Integer.valueOf(this.f35997m), java.lang.Integer.valueOf(zhVar.f35997m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zh();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35998n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35991d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f35992e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f35993f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f35994g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f35995h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f35996i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f35997m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f35991d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f35992e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f35993f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f35994g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f35995h;
            if (str10 != null && zArr[5]) {
                i18 += b36.f.j(5, str10);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f35996i);
            }
            return zArr[7] ? i18 + b36.f.e(7, this.f35997m) : i18;
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
                this.f35991d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35992e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35993f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35994g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35995h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35996i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f35997m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
