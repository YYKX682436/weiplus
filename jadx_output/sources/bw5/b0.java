package bw5;

/* loaded from: classes8.dex */
public class b0 extends com.tencent.mm.protobuf.f {

    /* renamed from: f, reason: collision with root package name */
    public static final bw5.b0 f25468f = new bw5.b0();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f25469d = com.tencent.mm.protobuf.g.f192155b;

    /* renamed from: e, reason: collision with root package name */
    public int f25470e = 0;

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b0 parseFrom(byte[] bArr) {
        return (bw5.b0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b0)) {
            return false;
        }
        bw5.b0 b0Var = (bw5.b0) fVar;
        return n51.f.a(this.f25469d, b0Var.f25469d) && n51.f.a(java.lang.Integer.valueOf(this.f25470e), java.lang.Integer.valueOf(b0Var.f25470e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.b0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f25469d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.e(2, this.f25470e);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.f25469d;
            return (gVar2 != null ? 0 + b36.f.b(1, gVar2) : 0) + b36.f.e(2, this.f25470e);
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
            this.f25469d = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f25470e = aVar2.g(intValue);
        return 0;
    }
}
