package bw5;

/* loaded from: classes2.dex */
public class q40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.o50 f31937d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.a70 f31938e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f31939f = new boolean[3];

    static {
        new bw5.q40();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.q40 parseFrom(byte[] bArr) {
        return (bw5.q40) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q40)) {
            return false;
        }
        bw5.q40 q40Var = (bw5.q40) fVar;
        return n51.f.a(this.f31937d, q40Var.f31937d) && n51.f.a(this.f31938e, q40Var.f31938e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.q40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31939f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.o50 o50Var = this.f31937d;
            if (o50Var != null && zArr[1]) {
                fVar.i(1, o50Var.computeSize());
                this.f31937d.writeFields(fVar);
            }
            bw5.a70 a70Var = this.f31938e;
            if (a70Var != null && zArr[2]) {
                fVar.i(2, a70Var.computeSize());
                this.f31938e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.o50 o50Var2 = this.f31937d;
            if (o50Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, o50Var2.computeSize());
            }
            bw5.a70 a70Var2 = this.f31938e;
            return (a70Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, a70Var2.computeSize());
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
                bw5.o50 o50Var3 = new bw5.o50();
                if (bArr != null && bArr.length > 0) {
                    o50Var3.parseFrom(bArr);
                }
                this.f31937d = o50Var3;
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
            bw5.a70 a70Var3 = new bw5.a70();
            if (bArr2 != null && bArr2.length > 0) {
                a70Var3.parseFrom(bArr2);
            }
            this.f31938e = a70Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
