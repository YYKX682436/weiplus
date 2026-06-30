package bw5;

/* loaded from: classes4.dex */
public class ba extends com.tencent.mm.protobuf.f {

    /* renamed from: f, reason: collision with root package name */
    public static final bw5.ba f25577f = new bw5.ba();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f25578d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f25579e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ba)) {
            return false;
        }
        bw5.ba baVar = (bw5.ba) fVar;
        return n51.f.a(this.f25578d, baVar.f25578d) && n51.f.a(this.f25579e, baVar.f25579e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ba();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25579e;
        java.util.LinkedList linkedList2 = this.f25578d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList2) + 0 + b36.f.g(2, 8, linkedList);
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.ta taVar = new bw5.ta();
                if (bArr != null && bArr.length > 0) {
                    taVar.parseFrom(bArr);
                }
                linkedList2.add(taVar);
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.da daVar = new bw5.da();
            if (bArr2 != null && bArr2.length > 0) {
                daVar.parseFrom(bArr2);
            }
            linkedList.add(daVar);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.ba) super.parseFrom(bArr);
    }
}
