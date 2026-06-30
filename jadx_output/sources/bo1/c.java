package bo1;

/* loaded from: classes2.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f22983d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f22984e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f22985f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f22986g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bo1.c)) {
            return false;
        }
        bo1.c cVar = (bo1.c) fVar;
        return n51.f.a(this.f22983d, cVar.f22983d) && n51.f.a(this.f22984e, cVar.f22984e) && n51.f.a(this.f22985f, cVar.f22985f) && n51.f.a(this.f22986g, cVar.f22986g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f22986g;
        java.util.LinkedList linkedList2 = this.f22985f;
        java.util.LinkedList linkedList3 = this.f22984e;
        java.util.LinkedList linkedList4 = this.f22983d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList4);
            fVar.g(2, 2, linkedList3);
            fVar.g(3, 2, linkedList2);
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 1, linkedList4) + 0 + b36.f.g(2, 2, linkedList3) + b36.f.g(3, 2, linkedList2) + b36.f.g(4, 1, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
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
        bo1.c cVar = (bo1.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cVar.f22983d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 2) {
            cVar.f22984e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 3) {
            cVar.f22985f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        cVar.f22986g.add(aVar2.k(intValue));
        return 0;
    }
}
