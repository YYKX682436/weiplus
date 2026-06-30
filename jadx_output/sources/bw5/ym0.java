package bw5;

/* loaded from: classes2.dex */
public class ym0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35579d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.sm0 f35580e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f35581f = new boolean[3];

    static {
        new bw5.ym0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ym0)) {
            return false;
        }
        bw5.ym0 ym0Var = (bw5.ym0) fVar;
        return n51.f.a(this.f35579d, ym0Var.f35579d) && n51.f.a(this.f35580e, ym0Var.f35580e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ym0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35581f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35579d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.sm0 sm0Var = this.f35580e;
            if (sm0Var != null && zArr[2]) {
                fVar.i(2, sm0Var.computeSize());
                this.f35580e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f35579d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.sm0 sm0Var2 = this.f35580e;
            return (sm0Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, sm0Var2.computeSize());
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
            this.f35579d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.sm0 sm0Var3 = new bw5.sm0();
            if (bArr != null && bArr.length > 0) {
                sm0Var3.parseFrom(bArr);
            }
            this.f35580e = sm0Var3;
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.ym0) super.parseFrom(bArr);
    }
}
