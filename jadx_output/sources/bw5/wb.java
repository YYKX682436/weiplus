package bw5;

/* loaded from: classes4.dex */
public class wb extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f34633d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f34634e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f34635f = new boolean[3];

    static {
        new bw5.wb();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wb)) {
            return false;
        }
        bw5.wb wbVar = (bw5.wb) fVar;
        return n51.f.a(this.f34633d, wbVar.f34633d) && n51.f.a(this.f34634e, wbVar.f34634e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wb();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34634e;
        java.util.LinkedList linkedList2 = this.f34633d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList2);
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 1, linkedList2) + 0 + b36.f.g(2, 8, linkedList);
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
        boolean[] zArr = this.f34635f;
        if (intValue == 1) {
            linkedList2.add(aVar2.k(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.vb vbVar = new bw5.vb();
            if (bArr != null && bArr.length > 0) {
                vbVar.parseFrom(bArr);
            }
            linkedList.add(vbVar);
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.wb) super.parseFrom(bArr);
    }
}
