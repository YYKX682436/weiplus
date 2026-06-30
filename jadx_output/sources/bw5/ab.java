package bw5;

/* loaded from: classes10.dex */
public class ab extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ub f25116d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f25117e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f25118f = new boolean[3];

    static {
        new bw5.ab();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ab)) {
            return false;
        }
        bw5.ab abVar = (bw5.ab) fVar;
        return n51.f.a(this.f25116d, abVar.f25116d) && n51.f.a(this.f25117e, abVar.f25117e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ab();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25117e;
        boolean[] zArr = this.f25118f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ub ubVar = this.f25116d;
            if (ubVar != null && zArr[1]) {
                fVar.e(1, ubVar.f33834d);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.ub ubVar2 = this.f25116d;
            if (ubVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, ubVar2.f33834d);
            }
            return i18 + b36.f.g(2, 8, linkedList);
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
        if (intValue == 1) {
            int g17 = aVar2.g(intValue);
            this.f25116d = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.ub.LivePhoto : bw5.ub.Video : bw5.ub.Image;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.sb sbVar = new bw5.sb();
            if (bArr != null && bArr.length > 0) {
                sbVar.parseFrom(bArr);
            }
            linkedList.add(sbVar);
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.ab) super.parseFrom(bArr);
    }
}
