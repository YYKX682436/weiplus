package bw5;

/* loaded from: classes2.dex */
public class g7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27706d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27707e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f27708f = new boolean[3];

    static {
        new bw5.g7();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g7)) {
            return false;
        }
        bw5.g7 g7Var = (bw5.g7) fVar;
        return n51.f.a(this.f27706d, g7Var.f27706d) && n51.f.a(this.f27707e, g7Var.f27707e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.g7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27708f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27706d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f27707e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f27706d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f27707e;
            return (gVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.b(2, gVar2);
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
            this.f27706d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f27707e = aVar2.d(intValue);
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.g7) super.parseFrom(bArr);
    }
}
