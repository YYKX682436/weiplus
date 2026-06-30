package bw5;

/* loaded from: classes2.dex */
public class mi0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ro f30251d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f30252e = new boolean[2];

    static {
        new bw5.mi0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mi0 parseFrom(byte[] bArr) {
        return (bw5.mi0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof bw5.mi0) && n51.f.a(this.f30251d, ((bw5.mi0) fVar).f30251d);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.mi0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30252e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ro roVar = this.f30251d;
            if (roVar != null && zArr[1]) {
                fVar.i(1, roVar.computeSize());
                this.f30251d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ro roVar2 = this.f30251d;
            if (roVar2 == null || !zArr[1]) {
                return 0;
            }
            return 0 + b36.f.i(1, roVar2.computeSize());
        }
        if (i17 == 2) {
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
            bw5.ro roVar3 = new bw5.ro();
            if (bArr != null && bArr.length > 0) {
                roVar3.parseFrom(bArr);
            }
            this.f30251d = roVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
