package bw5;

/* loaded from: classes2.dex */
public class d40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.wy f26309d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.wy f26310e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f26311f = new boolean[3];

    static {
        new bw5.d40();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.d40 parseFrom(byte[] bArr) {
        return (bw5.d40) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.d40)) {
            return false;
        }
        bw5.d40 d40Var = (bw5.d40) fVar;
        return n51.f.a(this.f26309d, d40Var.f26309d) && n51.f.a(this.f26310e, d40Var.f26310e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.d40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26311f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.wy wyVar = this.f26309d;
            if (wyVar != null && zArr[1]) {
                fVar.i(1, wyVar.computeSize());
                this.f26309d.writeFields(fVar);
            }
            bw5.wy wyVar2 = this.f26310e;
            if (wyVar2 != null && zArr[2]) {
                fVar.i(2, wyVar2.computeSize());
                this.f26310e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.wy wyVar3 = this.f26309d;
            if (wyVar3 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, wyVar3.computeSize());
            }
            bw5.wy wyVar4 = this.f26310e;
            return (wyVar4 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, wyVar4.computeSize());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.wy wyVar5 = new bw5.wy();
                if (bArr != null && bArr.length > 0) {
                    wyVar5.parseFrom(bArr);
                }
                this.f26309d = wyVar5;
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
            bw5.wy wyVar6 = new bw5.wy();
            if (bArr2 != null && bArr2.length > 0) {
                wyVar6.parseFrom(bArr2);
            }
            this.f26310e = wyVar6;
        }
        zArr[2] = true;
        return 0;
    }
}
