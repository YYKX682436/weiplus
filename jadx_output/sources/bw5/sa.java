package bw5;

/* loaded from: classes4.dex */
public class sa extends com.tencent.mm.protobuf.f {

    /* renamed from: f, reason: collision with root package name */
    public static final bw5.sa f32868f = new bw5.sa();

    /* renamed from: d, reason: collision with root package name */
    public bw5.g30 f32869d = bw5.g30.LiteAppEmoticonStoreStatus_UNKNOWN;

    /* renamed from: e, reason: collision with root package name */
    public float f32870e = 0.0f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sa)) {
            return false;
        }
        bw5.sa saVar = (bw5.sa) fVar;
        return n51.f.a(this.f32869d, saVar.f32869d) && n51.f.a(java.lang.Float.valueOf(this.f32870e), java.lang.Float.valueOf(saVar.f32870e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sa();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.g30 g30Var = this.f32869d;
            if (g30Var != null) {
                fVar.e(1, g30Var.f27654d);
            }
            fVar.d(2, this.f32870e);
            return 0;
        }
        if (i17 == 1) {
            bw5.g30 g30Var2 = this.f32869d;
            return (g30Var2 != null ? 0 + b36.f.e(1, g30Var2.f27654d) : 0) + b36.f.d(2, this.f32870e);
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
            int g17 = aVar2.g(intValue);
            this.f32869d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? null : bw5.g30.LiteAppEmoticonStoreStatus_DOWNLOADED : bw5.g30.LiteAppEmoticonStoreStatus_DOWNLOADING : bw5.g30.LiteAppEmoticonStoreStatus_UNDOWNLOAD : bw5.g30.LiteAppEmoticonStoreStatus_UNKNOWN;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f32870e = aVar2.f(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.sa) super.parseFrom(bArr);
    }
}
