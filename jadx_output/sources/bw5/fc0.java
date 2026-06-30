package bw5;

/* loaded from: classes2.dex */
public class fc0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27220d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27221e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27222f;

    /* renamed from: g, reason: collision with root package name */
    public int f27223g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27224h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f27225i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f27226m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f27227n = new boolean[8];

    static {
        new bw5.fc0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fc0 parseFrom(byte[] bArr) {
        return (bw5.fc0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fc0)) {
            return false;
        }
        bw5.fc0 fc0Var = (bw5.fc0) fVar;
        return n51.f.a(this.f27220d, fc0Var.f27220d) && n51.f.a(this.f27221e, fc0Var.f27221e) && n51.f.a(this.f27222f, fc0Var.f27222f) && n51.f.a(java.lang.Integer.valueOf(this.f27223g), java.lang.Integer.valueOf(fc0Var.f27223g)) && n51.f.a(java.lang.Boolean.valueOf(this.f27224h), java.lang.Boolean.valueOf(fc0Var.f27224h)) && n51.f.a(this.f27225i, fc0Var.f27225i) && n51.f.a(this.f27226m, fc0Var.f27226m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fc0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27227n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27220d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f27221e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f27222f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f27223g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f27224h);
            }
            java.lang.String str4 = this.f27225i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f27226m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f27220d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f27221e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f27222f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f27223g);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f27224h);
            }
            java.lang.String str9 = this.f27225i;
            if (str9 != null && zArr[6]) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f27226m;
            return (str10 == null || !zArr[7]) ? i18 : i18 + b36.f.j(7, str10);
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
                this.f27220d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27221e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27222f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27223g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27224h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27225i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27226m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
