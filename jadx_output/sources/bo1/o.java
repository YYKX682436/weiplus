package bo1;

/* loaded from: classes2.dex */
public class o extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bo1.c f23012d;

    /* renamed from: e, reason: collision with root package name */
    public bo1.c f23013e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f23014f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bo1.o)) {
            return false;
        }
        bo1.o oVar = (bo1.o) fVar;
        return n51.f.a(this.f23012d, oVar.f23012d) && n51.f.a(this.f23013e, oVar.f23013e) && n51.f.a(this.f23014f, oVar.f23014f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f23014f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bo1.c cVar = this.f23012d;
            if (cVar != null) {
                fVar.i(1, cVar.computeSize());
                this.f23012d.writeFields(fVar);
            }
            bo1.c cVar2 = this.f23013e;
            if (cVar2 != null) {
                fVar.i(2, cVar2.computeSize());
                this.f23013e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bo1.c cVar3 = this.f23012d;
            int i18 = cVar3 != null ? 0 + b36.f.i(1, cVar3.computeSize()) : 0;
            bo1.c cVar4 = this.f23013e;
            if (cVar4 != null) {
                i18 += b36.f.i(2, cVar4.computeSize());
            }
            return i18 + b36.f.g(3, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        bo1.o oVar = (bo1.o) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                bo1.c cVar5 = new bo1.c();
                if (bArr2 != null && bArr2.length > 0) {
                    cVar5.parseFrom(bArr2);
                }
                oVar.f23012d = cVar5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                bo1.c cVar6 = new bo1.c();
                if (bArr3 != null && bArr3.length > 0) {
                    cVar6.parseFrom(bArr3);
                }
                oVar.f23013e = cVar6;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            bo1.p pVar = new bo1.p();
            if (bArr4 != null && bArr4.length > 0) {
                pVar.parseFrom(bArr4);
            }
            oVar.f23014f.add(pVar);
        }
        return 0;
    }
}
