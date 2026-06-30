package bw5;

/* loaded from: classes2.dex */
public class gm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.hm0 f27918d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f27919e = new boolean[2];

    static {
        new bw5.gm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof bw5.gm0) && n51.f.a(this.f27918d, ((bw5.gm0) fVar).f27918d);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27919e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.hm0 hm0Var = this.f27918d;
            if (hm0Var != null && zArr[1]) {
                fVar.i(1, hm0Var.computeSize());
                this.f27918d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.hm0 hm0Var2 = this.f27918d;
            if (hm0Var2 == null || !zArr[1]) {
                return 0;
            }
            return 0 + b36.f.i(1, hm0Var2.computeSize());
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
            bw5.hm0 hm0Var3 = new bw5.hm0();
            if (bArr != null && bArr.length > 0) {
                hm0Var3.parseFrom(bArr);
            }
            this.f27918d = hm0Var3;
        }
        zArr[1] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.gm0) super.parseFrom(bArr);
    }
}
