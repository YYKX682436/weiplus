package bw5;

/* loaded from: classes2.dex */
public class wn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.xn f34791d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f34792e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f34793f = new boolean[3];

    static {
        new bw5.wn();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wn parseFrom(byte[] bArr) {
        return (bw5.wn) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wn)) {
            return false;
        }
        bw5.wn wnVar = (bw5.wn) fVar;
        return n51.f.a(this.f34791d, wnVar.f34791d) && n51.f.a(this.f34792e, wnVar.f34792e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wn();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34793f;
        java.util.LinkedList linkedList = this.f34792e;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.xn xnVar = this.f34791d;
            if (xnVar != null && zArr[1]) {
                fVar.i(1, xnVar.computeSize());
                this.f34791d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.xn xnVar2 = this.f34791d;
            if (xnVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, xnVar2.computeSize());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.xn xnVar3 = new bw5.xn();
                if (bArr != null && bArr.length > 0) {
                    xnVar3.parseFrom(bArr);
                }
                this.f34791d = xnVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.vn vnVar = new bw5.vn();
            if (bArr2 != null && bArr2.length > 0) {
                vnVar.parseFrom(bArr2);
            }
            linkedList.add(vnVar);
        }
        zArr[2] = true;
        return 0;
    }
}
