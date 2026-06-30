package bw5;

/* loaded from: classes11.dex */
public class nc0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30613d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30614e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30615f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30616g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30617h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30618i;

    /* renamed from: m, reason: collision with root package name */
    public int f30619m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f30620n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f30621o = new boolean[9];

    static {
        new bw5.nc0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nc0 parseFrom(byte[] bArr) {
        return (bw5.nc0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nc0)) {
            return false;
        }
        bw5.nc0 nc0Var = (bw5.nc0) fVar;
        return n51.f.a(this.f30613d, nc0Var.f30613d) && n51.f.a(this.f30614e, nc0Var.f30614e) && n51.f.a(java.lang.Boolean.valueOf(this.f30615f), java.lang.Boolean.valueOf(nc0Var.f30615f)) && n51.f.a(java.lang.Boolean.valueOf(this.f30616g), java.lang.Boolean.valueOf(nc0Var.f30616g)) && n51.f.a(this.f30617h, nc0Var.f30617h) && n51.f.a(this.f30618i, nc0Var.f30618i) && n51.f.a(java.lang.Integer.valueOf(this.f30619m), java.lang.Integer.valueOf(nc0Var.f30619m)) && n51.f.a(this.f30620n, nc0Var.f30620n);
    }

    public java.lang.String getAppId() {
        return this.f30621o[1] ? this.f30613d : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.nc0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f30621o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30613d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f30614e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.a(3, this.f30615f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f30616g);
            }
            java.lang.String str3 = this.f30617h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f30618i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.e(7, this.f30619m);
            }
            java.lang.String str5 = this.f30620n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f30613d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f30614e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f30615f);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f30616g);
            }
            java.lang.String str8 = this.f30617h;
            if (str8 != null && zArr[5]) {
                i18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f30618i;
            if (str9 != null && zArr[6]) {
                i18 += b36.f.j(6, str9);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f30619m);
            }
            java.lang.String str10 = this.f30620n;
            return (str10 == null || !zArr[8]) ? i18 : i18 + b36.f.j(8, str10);
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
                this.f30613d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30614e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30615f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30616g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30617h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30618i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30619m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30620n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
