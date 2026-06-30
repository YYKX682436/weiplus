package bw5;

/* loaded from: classes2.dex */
public class gp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f27940d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f27941e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f27942f = new boolean[3];

    static {
        new bw5.gp();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gp parseFrom(byte[] bArr) {
        return (bw5.gp) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gp)) {
            return false;
        }
        bw5.gp gpVar = (bw5.gp) fVar;
        return n51.f.a(this.f27940d, gpVar.f27940d) && n51.f.a(this.f27941e, gpVar.f27941e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gp();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f27941e;
        java.util.LinkedList linkedList2 = this.f27940d;
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
        boolean[] zArr = this.f27942f;
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.um umVar = new bw5.um();
                if (bArr != null && bArr.length > 0) {
                    umVar.parseFrom(bArr);
                }
                linkedList2.add(umVar);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.fp fpVar = new bw5.fp();
            if (bArr2 != null && bArr2.length > 0) {
                fpVar.parseFrom(bArr2);
            }
            linkedList.add(fpVar);
        }
        zArr[2] = true;
        return 0;
    }
}
