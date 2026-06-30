package bw5;

/* loaded from: classes9.dex */
public class m7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f30097d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f30098e = new boolean[2];

    static {
        new bw5.m7();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.m7 parseFrom(byte[] bArr) {
        return (bw5.m7) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof bw5.m7) && n51.f.a(this.f30097d, ((bw5.m7) fVar).f30097d);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.m7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f30097d);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f30097d) + 0;
        }
        if (i17 == 2) {
            this.f30097d.clear();
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
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.l7 l7Var = new bw5.l7();
            if (bArr != null && bArr.length > 0) {
                l7Var.parseFrom(bArr);
            }
            this.f30097d.add(l7Var);
        }
        this.f30098e[1] = true;
        return 0;
    }
}
