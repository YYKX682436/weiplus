package bw5;

/* loaded from: classes2.dex */
public class jk extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public bw5.qk f29000e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f28999d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f29001f = new boolean[3];

    static {
        new bw5.jk();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jk parseFrom(byte[] bArr) {
        return (bw5.jk) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jk)) {
            return false;
        }
        bw5.jk jkVar = (bw5.jk) fVar;
        return n51.f.a(this.f28999d, jkVar.f28999d) && n51.f.a(this.f29000e, jkVar.f29000e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.jk();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29001f;
        java.util.LinkedList linkedList = this.f28999d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            bw5.qk qkVar = this.f29000e;
            if (qkVar != null && zArr[2]) {
                fVar.i(2, qkVar.computeSize());
                this.f29000e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            bw5.qk qkVar2 = this.f29000e;
            return (qkVar2 == null || !zArr[2]) ? g17 : g17 + b36.f.i(2, qkVar2.computeSize());
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
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.j1 j1Var = new bw5.j1();
                if (bArr != null && bArr.length > 0) {
                    j1Var.parseFrom(bArr);
                }
                linkedList.add(j1Var);
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
            bw5.qk qkVar3 = new bw5.qk();
            if (bArr2 != null && bArr2.length > 0) {
                qkVar3.parseFrom(bArr2);
            }
            this.f29000e = qkVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
