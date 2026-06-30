package bw5;

/* loaded from: classes2.dex */
public class er0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27029d;

    /* renamed from: e, reason: collision with root package name */
    public int f27030e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27031f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f27032g = new boolean[4];

    static {
        new bw5.er0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.er0)) {
            return false;
        }
        bw5.er0 er0Var = (bw5.er0) fVar;
        return n51.f.a(this.f27029d, er0Var.f27029d) && n51.f.a(java.lang.Integer.valueOf(this.f27030e), java.lang.Integer.valueOf(er0Var.f27030e)) && n51.f.a(java.lang.Boolean.valueOf(this.f27031f), java.lang.Boolean.valueOf(er0Var.f27031f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.er0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27032g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27029d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27030e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f27031f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f27029d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f27030e);
            }
            return zArr[3] ? i18 + b36.f.a(3, this.f27031f) : i18;
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
            this.f27029d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27030e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f27031f = aVar2.c(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.er0) super.parseFrom(bArr);
    }
}
