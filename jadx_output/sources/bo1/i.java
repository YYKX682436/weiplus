package bo1;

/* loaded from: classes2.dex */
public class i extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f23004d;

    /* renamed from: e, reason: collision with root package name */
    public int f23005e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bo1.i)) {
            return false;
        }
        bo1.i iVar = (bo1.i) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f23004d), java.lang.Long.valueOf(iVar.f23004d)) && n51.f.a(java.lang.Integer.valueOf(this.f23005e), java.lang.Integer.valueOf(iVar.f23005e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f23004d);
            fVar.e(2, this.f23005e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f23004d) + 0 + b36.f.e(2, this.f23005e);
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
        bo1.i iVar = (bo1.i) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            iVar.f23004d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        iVar.f23005e = aVar2.g(intValue);
        return 0;
    }
}
