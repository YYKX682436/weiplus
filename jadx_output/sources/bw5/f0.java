package bw5;

/* loaded from: classes2.dex */
public class f0 extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final bw5.f0 f27101g = new bw5.f0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.vy f27102d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27103e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f27104f = new boolean[3];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.f0)) {
            return false;
        }
        bw5.f0 f0Var = (bw5.f0) fVar;
        return n51.f.a(this.f27102d, f0Var.f27102d) && n51.f.a(this.f27103e, f0Var.f27103e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.f0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27104f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.vy vyVar = this.f27102d;
            if (vyVar != null && zArr[1]) {
                fVar.i(1, vyVar.computeSize());
                this.f27102d.writeFields(fVar);
            }
            java.lang.String str = this.f27103e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.vy vyVar2 = this.f27102d;
            if (vyVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, vyVar2.computeSize());
            }
            java.lang.String str2 = this.f27103e;
            return (str2 == null || !zArr[2]) ? i18 : i18 + b36.f.j(2, str2);
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
            this.f27103e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.vy vyVar3 = new bw5.vy();
            if (bArr != null && bArr.length > 0) {
                vyVar3.parseFrom(bArr);
            }
            this.f27102d = vyVar3;
        }
        zArr[1] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.f0) super.parseFrom(bArr);
    }
}
