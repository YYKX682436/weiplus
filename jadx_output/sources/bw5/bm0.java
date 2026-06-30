package bw5;

/* loaded from: classes2.dex */
public class bm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final bw5.bm0 f25749h = new bw5.bm0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25750d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25751e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25752f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f25753g = new boolean[4];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bm0)) {
            return false;
        }
        bw5.bm0 bm0Var = (bw5.bm0) fVar;
        return n51.f.a(this.f25750d, bm0Var.f25750d) && n51.f.a(java.lang.Boolean.valueOf(this.f25751e), java.lang.Boolean.valueOf(bm0Var.f25751e)) && n51.f.a(this.f25752f, bm0Var.f25752f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25753g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25750d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f25751e);
            }
            java.lang.String str2 = this.f25752f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f25750d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f25751e);
            }
            java.lang.String str4 = this.f25752f;
            return (str4 == null || !zArr[3]) ? i18 : i18 + b36.f.j(3, str4);
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
        if (intValue == 1) {
            this.f25750d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25751e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f25752f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.bm0) super.parseFrom(bArr);
    }
}
