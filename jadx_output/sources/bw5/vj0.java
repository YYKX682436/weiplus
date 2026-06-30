package bw5;

/* loaded from: classes2.dex */
public class vj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final bw5.vj0 f34381g = new bw5.vj0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.jk0 f34382d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.uj0 f34383e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f34384f = new boolean[3];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vj0)) {
            return false;
        }
        bw5.vj0 vj0Var = (bw5.vj0) fVar;
        return n51.f.a(this.f34382d, vj0Var.f34382d) && n51.f.a(this.f34383e, vj0Var.f34383e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34384f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.jk0 jk0Var = this.f34382d;
            if (jk0Var != null && zArr[1]) {
                fVar.i(1, jk0Var.computeSize());
                this.f34382d.writeFields(fVar);
            }
            bw5.uj0 uj0Var = this.f34383e;
            if (uj0Var != null && zArr[2]) {
                fVar.i(2, uj0Var.computeSize());
                this.f34383e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.jk0 jk0Var2 = this.f34382d;
            if (jk0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, jk0Var2.computeSize());
            }
            bw5.uj0 uj0Var2 = this.f34383e;
            return (uj0Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, uj0Var2.computeSize());
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
                bw5.jk0 jk0Var3 = new bw5.jk0();
                if (bArr != null && bArr.length > 0) {
                    jk0Var3.parseFrom(bArr);
                }
                this.f34382d = jk0Var3;
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
            bw5.uj0 uj0Var3 = new bw5.uj0();
            if (bArr2 != null && bArr2.length > 0) {
                uj0Var3.parseFrom(bArr2);
            }
            this.f34383e = uj0Var3;
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.vj0) super.parseFrom(bArr);
    }
}
