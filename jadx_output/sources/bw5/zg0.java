package bw5;

/* loaded from: classes2.dex */
public class zg0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35982d;

    /* renamed from: e, reason: collision with root package name */
    public int f35983e;

    /* renamed from: f, reason: collision with root package name */
    public int f35984f;

    /* renamed from: g, reason: collision with root package name */
    public int f35985g;

    /* renamed from: h, reason: collision with root package name */
    public int f35986h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f35987i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f35988m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f35989n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f35990o = new boolean[9];

    static {
        new bw5.zg0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zg0)) {
            return false;
        }
        bw5.zg0 zg0Var = (bw5.zg0) fVar;
        return n51.f.a(this.f35982d, zg0Var.f35982d) && n51.f.a(java.lang.Integer.valueOf(this.f35983e), java.lang.Integer.valueOf(zg0Var.f35983e)) && n51.f.a(java.lang.Integer.valueOf(this.f35984f), java.lang.Integer.valueOf(zg0Var.f35984f)) && n51.f.a(java.lang.Integer.valueOf(this.f35985g), java.lang.Integer.valueOf(zg0Var.f35985g)) && n51.f.a(java.lang.Integer.valueOf(this.f35986h), java.lang.Integer.valueOf(zg0Var.f35986h)) && n51.f.a(this.f35987i, zg0Var.f35987i) && n51.f.a(this.f35988m, zg0Var.f35988m) && n51.f.a(this.f35989n, zg0Var.f35989n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zg0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35990o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35982d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f35983e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f35984f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f35985g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f35986h);
            }
            java.lang.String str2 = this.f35987i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f35988m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f35989n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f35982d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f35983e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f35984f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f35985g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f35986h);
            }
            java.lang.String str6 = this.f35987i;
            if (str6 != null && zArr[6]) {
                i18 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f35988m;
            if (str7 != null && zArr[7]) {
                i18 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f35989n;
            return (str8 == null || !zArr[8]) ? i18 : i18 + b36.f.j(8, str8);
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
                this.f35982d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35983e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35984f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35985g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35986h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35987i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f35988m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f35989n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.zg0) super.parseFrom(bArr);
    }
}
