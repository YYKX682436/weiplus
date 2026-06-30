package bw5;

/* loaded from: classes2.dex */
public class i10 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ae f28429d;

    /* renamed from: e, reason: collision with root package name */
    public int f28430e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f28431f = new boolean[3];

    static {
        new bw5.i10();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.i10 parseFrom(byte[] bArr) {
        return (bw5.i10) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.i10)) {
            return false;
        }
        bw5.i10 i10Var = (bw5.i10) fVar;
        return n51.f.a(this.f28429d, i10Var.f28429d) && n51.f.a(java.lang.Integer.valueOf(this.f28430e), java.lang.Integer.valueOf(i10Var.f28430e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.i10();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28431f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ae aeVar = this.f28429d;
            if (aeVar != null && zArr[1]) {
                fVar.i(1, aeVar.computeSize());
                this.f28429d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f28430e);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ae aeVar2 = this.f28429d;
            if (aeVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, aeVar2.computeSize());
            }
            return zArr[2] ? i18 + b36.f.e(2, this.f28430e) : i18;
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
            if (intValue != 2) {
                return -1;
            }
            this.f28430e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ae aeVar3 = new bw5.ae();
            if (bArr != null && bArr.length > 0) {
                aeVar3.parseFrom(bArr);
            }
            this.f28429d = aeVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
