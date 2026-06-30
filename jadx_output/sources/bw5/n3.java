package bw5;

/* loaded from: classes2.dex */
public class n3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f30470d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30471e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30472f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f30473g = new boolean[4];

    static {
        new bw5.n3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n3 parseFrom(byte[] bArr) {
        return (bw5.n3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n3)) {
            return false;
        }
        bw5.n3 n3Var = (bw5.n3) fVar;
        return n51.f.a(this.f30470d, n3Var.f30470d) && n51.f.a(this.f30471e, n3Var.f30471e) && n51.f.a(java.lang.Boolean.valueOf(this.f30472f), java.lang.Boolean.valueOf(n3Var.f30472f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.n3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30473g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f30470d;
            if (gVar != null && zArr[1]) {
                fVar.b(1, gVar);
            }
            java.lang.String str = this.f30471e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f30472f);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.f30470d;
            if (gVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.b(1, gVar2);
            }
            java.lang.String str2 = this.f30471e;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            return zArr[3] ? i18 + b36.f.a(3, this.f30472f) : i18;
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
            this.f30470d = aVar2.d(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f30471e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f30472f = aVar2.c(intValue);
        zArr[3] = true;
        return 0;
    }
}
