package bh4;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f20917d = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof bh4.b) && n51.f.a(this.f20917d, ((bh4.b) fVar).f20917d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f20917d);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f20917d) + 0;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f20917d.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        bh4.b bVar = (bh4.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            bh4.a aVar3 = new bh4.a();
            if (bArr2 != null && bArr2.length > 0) {
                aVar3.parseFrom(bArr2);
            }
            bVar.f20917d.add(aVar3);
        }
        return 0;
    }
}
