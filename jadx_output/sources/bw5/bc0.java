package bw5;

/* loaded from: classes2.dex */
public class bc0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25596d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25597e;

    /* renamed from: f, reason: collision with root package name */
    public int f25598f;

    /* renamed from: g, reason: collision with root package name */
    public int f25599g;

    /* renamed from: h, reason: collision with root package name */
    public int f25600h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25601i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f25602m = new boolean[7];

    static {
        new bw5.bc0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bc0 parseFrom(byte[] bArr) {
        return (bw5.bc0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bc0)) {
            return false;
        }
        bw5.bc0 bc0Var = (bw5.bc0) fVar;
        return n51.f.a(this.f25596d, bc0Var.f25596d) && n51.f.a(this.f25597e, bc0Var.f25597e) && n51.f.a(java.lang.Integer.valueOf(this.f25598f), java.lang.Integer.valueOf(bc0Var.f25598f)) && n51.f.a(java.lang.Integer.valueOf(this.f25599g), java.lang.Integer.valueOf(bc0Var.f25599g)) && n51.f.a(java.lang.Integer.valueOf(this.f25600h), java.lang.Integer.valueOf(bc0Var.f25600h)) && n51.f.a(java.lang.Boolean.valueOf(this.f25601i), java.lang.Boolean.valueOf(bc0Var.f25601i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bc0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f25602m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25596d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f25597e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f25598f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f25599g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f25600h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f25601i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f25596d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f25597e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f25598f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f25599g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f25600h);
            }
            return zArr[6] ? i18 + b36.f.a(6, this.f25601i) : i18;
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
                this.f25596d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25597e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25598f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25599g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25600h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25601i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
