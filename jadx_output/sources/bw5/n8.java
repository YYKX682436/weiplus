package bw5;

/* loaded from: classes9.dex */
public class n8 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.k8 f30537d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30538e;

    /* renamed from: f, reason: collision with root package name */
    public int f30539f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30540g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30541h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f30542i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f30543m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f30544n = new boolean[8];

    static {
        new bw5.n8();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n8)) {
            return false;
        }
        bw5.n8 n8Var = (bw5.n8) fVar;
        return n51.f.a(this.f30537d, n8Var.f30537d) && n51.f.a(this.f30538e, n8Var.f30538e) && n51.f.a(java.lang.Integer.valueOf(this.f30539f), java.lang.Integer.valueOf(n8Var.f30539f)) && n51.f.a(this.f30540g, n8Var.f30540g) && n51.f.a(this.f30541h, n8Var.f30541h) && n51.f.a(this.f30542i, n8Var.f30542i) && n51.f.a(java.lang.Boolean.valueOf(this.f30543m), java.lang.Boolean.valueOf(n8Var.f30543m));
    }

    public java.lang.String getErrMsg() {
        return this.f30544n[4] ? this.f30540g : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.n8();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f30544n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.k8 k8Var = this.f30537d;
            if (k8Var != null && zArr[1]) {
                fVar.e(1, k8Var.f29285d);
            }
            java.lang.String str = this.f30538e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f30539f);
            }
            java.lang.String str2 = this.f30540g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f30541h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            com.tencent.mm.protobuf.g gVar = this.f30542i;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            if (zArr[7]) {
                fVar.a(7, this.f30543m);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.k8 k8Var2 = this.f30537d;
            if (k8Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, k8Var2.f29285d);
            }
            java.lang.String str4 = this.f30538e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f30539f);
            }
            java.lang.String str5 = this.f30540g;
            if (str5 != null && zArr[4]) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f30541h;
            if (str6 != null && zArr[5]) {
                i18 += b36.f.j(5, str6);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f30542i;
            if (gVar2 != null && zArr[6]) {
                i18 += b36.f.b(6, gVar2);
            }
            return zArr[7] ? i18 + b36.f.a(7, this.f30543m) : i18;
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
                this.f30537d = bw5.k8.a(aVar2.g(intValue));
                zArr[1] = true;
                return 0;
            case 2:
                this.f30538e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30539f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30540g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30541h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30542i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30543m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.n8) super.parseFrom(bArr);
    }
}
