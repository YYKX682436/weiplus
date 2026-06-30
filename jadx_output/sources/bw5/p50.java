package bw5;

/* loaded from: classes2.dex */
public class p50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f31470d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.c80 f31471e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f31472f = new boolean[3];

    static {
        new bw5.p50();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.p50 parseFrom(byte[] bArr) {
        return (bw5.p50) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p50)) {
            return false;
        }
        bw5.p50 p50Var = (bw5.p50) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f31470d), java.lang.Integer.valueOf(p50Var.f31470d)) && n51.f.a(this.f31471e, p50Var.f31471e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.p50();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31472f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f31470d);
            }
            bw5.c80 c80Var = this.f31471e;
            if (c80Var != null && zArr[2]) {
                fVar.i(2, c80Var.computeSize());
                this.f31471e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f31470d) : 0;
            bw5.c80 c80Var2 = this.f31471e;
            return (c80Var2 == null || !zArr[2]) ? e17 : e17 + b36.f.i(2, c80Var2.computeSize());
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
            this.f31470d = aVar2.g(intValue);
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
            bw5.c80 c80Var3 = new bw5.c80();
            if (bArr != null && bArr.length > 0) {
                c80Var3.parseFrom(bArr);
            }
            this.f31471e = c80Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
