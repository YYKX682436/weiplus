package bw5;

/* loaded from: classes7.dex */
public class as0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.wd0 f25425d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ge0 f25426e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f25427f = new boolean[3];

    static {
        new bw5.as0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.as0 parseFrom(byte[] bArr) {
        return (bw5.as0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.as0)) {
            return false;
        }
        bw5.as0 as0Var = (bw5.as0) fVar;
        return n51.f.a(this.f25425d, as0Var.f25425d) && n51.f.a(this.f25426e, as0Var.f25426e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.as0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25427f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.wd0 wd0Var = this.f25425d;
            if (wd0Var != null && zArr[1]) {
                fVar.i(1, wd0Var.computeSize());
                this.f25425d.writeFields(fVar);
            }
            bw5.ge0 ge0Var = this.f25426e;
            if (ge0Var != null && zArr[2]) {
                fVar.i(2, ge0Var.computeSize());
                this.f25426e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.wd0 wd0Var2 = this.f25425d;
            if (wd0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, wd0Var2.computeSize());
            }
            bw5.ge0 ge0Var2 = this.f25426e;
            return (ge0Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, ge0Var2.computeSize());
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
                bw5.wd0 wd0Var3 = new bw5.wd0();
                if (bArr != null && bArr.length > 0) {
                    wd0Var3.parseFrom(bArr);
                }
                this.f25425d = wd0Var3;
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
            bw5.ge0 ge0Var3 = new bw5.ge0();
            if (bArr2 != null && bArr2.length > 0) {
                ge0Var3.parseFrom(bArr2);
            }
            this.f25426e = ge0Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
