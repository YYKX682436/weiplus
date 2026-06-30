package bw5;

/* loaded from: classes4.dex */
public class pr0 extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final bw5.pr0 f31812g = new bw5.pr0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.kl0 f31813d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.qo0 f31814e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f31815f = new boolean[3];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pr0)) {
            return false;
        }
        bw5.pr0 pr0Var = (bw5.pr0) fVar;
        return n51.f.a(this.f31813d, pr0Var.f31813d) && n51.f.a(this.f31814e, pr0Var.f31814e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.pr0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31815f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.kl0 kl0Var = this.f31813d;
            if (kl0Var != null && zArr[1]) {
                fVar.i(1, kl0Var.computeSize());
                this.f31813d.writeFields(fVar);
            }
            bw5.qo0 qo0Var = this.f31814e;
            if (qo0Var != null && zArr[2]) {
                fVar.i(2, qo0Var.computeSize());
                this.f31814e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.kl0 kl0Var2 = this.f31813d;
            if (kl0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, kl0Var2.computeSize());
            }
            bw5.qo0 qo0Var2 = this.f31814e;
            return (qo0Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, qo0Var2.computeSize());
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
                bw5.kl0 kl0Var3 = new bw5.kl0();
                if (bArr != null && bArr.length > 0) {
                    kl0Var3.parseFrom(bArr);
                }
                this.f31813d = kl0Var3;
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
            bw5.qo0 qo0Var3 = new bw5.qo0();
            if (bArr2 != null && bArr2.length > 0) {
                qo0Var3.parseFrom(bArr2);
            }
            this.f31814e = qo0Var3;
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.pr0) super.parseFrom(bArr);
    }
}
