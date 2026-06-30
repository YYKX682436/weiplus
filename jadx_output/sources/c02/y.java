package c02;

/* loaded from: classes2.dex */
public class y extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f37641d;

    /* renamed from: e, reason: collision with root package name */
    public int f37642e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof c02.y)) {
            return false;
        }
        c02.y yVar = (c02.y) fVar;
        return n51.f.a(this.f37641d, yVar.f37641d) && n51.f.a(java.lang.Integer.valueOf(this.f37642e), java.lang.Integer.valueOf(yVar.f37642e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f37641d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f37642e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f37641d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f37642e);
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
        c02.y yVar = (c02.y) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yVar.f37641d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        yVar.f37642e = aVar2.g(intValue);
        return 0;
    }
}
