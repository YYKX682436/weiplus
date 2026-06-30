package bw5;

/* loaded from: classes2.dex */
public class mt extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f30383d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f30384e = new boolean[2];

    static {
        new bw5.mt();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mt parseFrom(byte[] bArr) {
        return (bw5.mt) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof bw5.mt) && n51.f.a(this.f30383d, ((bw5.mt) fVar).f30383d);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.mt();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30383d;
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 5, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 5, linkedList) + 0;
        }
        if (i17 == 2) {
            linkedList.clear();
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
        if (intValue != 1) {
            return -1;
        }
        linkedList.add(java.lang.Float.valueOf(aVar2.f(intValue)));
        this.f30384e[1] = true;
        return 0;
    }
}
