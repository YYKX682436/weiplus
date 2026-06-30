package bw5;

/* loaded from: classes9.dex */
public class kh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f29379d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f29380e = new boolean[3];

    static {
        new bw5.kh0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.kh0 parseFrom(byte[] bArr) {
        return (bw5.kh0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof bw5.kh0) && n51.f.a(this.f29379d, ((bw5.kh0) fVar).f29379d);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.kh0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f29379d;
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(2, 8, linkedList) + 0;
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
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.ph0 ph0Var = new bw5.ph0();
            if (bArr != null && bArr.length > 0) {
                ph0Var.parseFrom(bArr);
            }
            linkedList.add(ph0Var);
        }
        this.f29380e[2] = true;
        return 0;
    }
}
