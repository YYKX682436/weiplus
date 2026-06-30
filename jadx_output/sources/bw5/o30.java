package bw5;

/* loaded from: classes2.dex */
public class o30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f30932d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ql f30933e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f30934f = new boolean[3];

    static {
        new bw5.o30();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.o30 parseFrom(byte[] bArr) {
        return (bw5.o30) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o30)) {
            return false;
        }
        bw5.o30 o30Var = (bw5.o30) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f30932d), java.lang.Long.valueOf(o30Var.f30932d)) && n51.f.a(this.f30933e, o30Var.f30933e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.o30();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30934f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f30932d);
            }
            bw5.ql qlVar = this.f30933e;
            if (qlVar != null && zArr[2]) {
                fVar.i(2, qlVar.computeSize());
                this.f30933e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f30932d) : 0;
            bw5.ql qlVar2 = this.f30933e;
            return (qlVar2 == null || !zArr[2]) ? h17 : h17 + b36.f.i(2, qlVar2.computeSize());
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
        if (intValue == 1) {
            this.f30932d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.ql qlVar3 = new bw5.ql();
            if (bArr != null && bArr.length > 0) {
                qlVar3.parseFrom(bArr);
            }
            this.f30933e = qlVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
