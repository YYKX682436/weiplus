package bw5;

/* loaded from: classes11.dex */
public class t0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f33202d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f33203e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f33204f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f33205g = new java.util.LinkedList();

    static {
        new bw5.t0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.t0 parseFrom(byte[] bArr) {
        return (bw5.t0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t0)) {
            return false;
        }
        bw5.t0 t0Var = (bw5.t0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f33202d), java.lang.Long.valueOf(t0Var.f33202d)) && n51.f.a(this.f33203e, t0Var.f33203e) && n51.f.a(this.f33204f, t0Var.f33204f) && n51.f.a(this.f33205g, t0Var.f33205g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.t0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f33205g;
        java.util.LinkedList linkedList2 = this.f33204f;
        java.util.LinkedList linkedList3 = this.f33203e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f33202d);
            fVar.g(2, 1, linkedList3);
            fVar.g(3, 2, linkedList2);
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f33202d) + 0 + b36.f.g(2, 1, linkedList3) + b36.f.g(3, 2, linkedList2) + b36.f.g(4, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList3.clear();
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
            this.f33202d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            linkedList3.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            linkedList2.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        linkedList.add(aVar2.k(intValue));
        return 0;
    }
}
