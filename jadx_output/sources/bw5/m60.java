package bw5;

/* loaded from: classes2.dex */
public class m60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.mc0 f30094d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30095e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f30096f = new boolean[3];

    static {
        new bw5.m60();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.m60 parseFrom(byte[] bArr) {
        return (bw5.m60) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.m60)) {
            return false;
        }
        bw5.m60 m60Var = (bw5.m60) fVar;
        return n51.f.a(this.f30094d, m60Var.f30094d) && n51.f.a(this.f30095e, m60Var.f30095e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.m60();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30096f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.mc0 mc0Var = this.f30094d;
            if (mc0Var != null && zArr[1]) {
                fVar.i(1, mc0Var.computeSize());
                this.f30094d.writeFields(fVar);
            }
            java.lang.String str = this.f30095e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.mc0 mc0Var2 = this.f30094d;
            if (mc0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, mc0Var2.computeSize());
            }
            java.lang.String str2 = this.f30095e;
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
            this.f30095e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.mc0 mc0Var3 = new bw5.mc0();
            if (bArr != null && bArr.length > 0) {
                mc0Var3.parseFrom(bArr);
            }
            this.f30094d = mc0Var3;
        }
        zArr[1] = true;
        return 0;
    }
}
