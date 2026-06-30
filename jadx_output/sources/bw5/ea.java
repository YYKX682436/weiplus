package bw5;

/* loaded from: classes2.dex */
public class ea extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f26802d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f26803e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f26804f = false;

    static {
        new bw5.ea();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ea parseFrom(byte[] bArr) {
        return (bw5.ea) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ea)) {
            return false;
        }
        bw5.ea eaVar = (bw5.ea) fVar;
        return n51.f.a(this.f26802d, eaVar.f26802d) && n51.f.a(this.f26803e, eaVar.f26803e) && n51.f.a(java.lang.Boolean.valueOf(this.f26804f), java.lang.Boolean.valueOf(eaVar.f26804f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ea();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f26803e;
        java.util.LinkedList linkedList2 = this.f26802d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList2);
            fVar.g(2, 1, linkedList);
            fVar.a(3, this.f26804f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 1, linkedList2) + 0 + b36.f.g(2, 1, linkedList) + b36.f.a(3, this.f26804f);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
        if (intValue == 1) {
            linkedList2.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 2) {
            linkedList.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f26804f = aVar2.c(intValue);
        return 0;
    }
}
