package bw5;

/* loaded from: classes4.dex */
public class i2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.j2 f28432d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f28433e = new boolean[2];

    static {
        new bw5.i2();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof bw5.i2) && n51.f.a(this.f28432d, ((bw5.i2) fVar).f28432d);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.i2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28433e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.j2 j2Var = this.f28432d;
            if (j2Var != null && zArr[1]) {
                fVar.i(1, j2Var.computeSize());
                this.f28432d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.j2 j2Var2 = this.f28432d;
            if (j2Var2 == null || !zArr[1]) {
                return 0;
            }
            return 0 + b36.f.i(1, j2Var2.computeSize());
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
            bw5.j2 j2Var3 = new bw5.j2();
            if (bArr != null && bArr.length > 0) {
                j2Var3.parseFrom(bArr);
            }
            this.f28432d = j2Var3;
        }
        zArr[1] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.i2) super.parseFrom(bArr);
    }
}
