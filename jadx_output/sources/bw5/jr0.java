package bw5;

/* loaded from: classes11.dex */
public class jr0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.fp0 f29120d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.kr0 f29121e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ir0 f29122f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f29123g = new boolean[4];

    static {
        new bw5.jr0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jr0)) {
            return false;
        }
        bw5.jr0 jr0Var = (bw5.jr0) fVar;
        return n51.f.a(this.f29120d, jr0Var.f29120d) && n51.f.a(this.f29121e, jr0Var.f29121e) && n51.f.a(this.f29122f, jr0Var.f29122f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.jr0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29123g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.fp0 fp0Var = this.f29120d;
            if (fp0Var != null && zArr[1]) {
                fVar.e(1, fp0Var.f27435d);
            }
            bw5.kr0 kr0Var = this.f29121e;
            if (kr0Var != null && zArr[2]) {
                fVar.i(2, kr0Var.computeSize());
                this.f29121e.writeFields(fVar);
            }
            bw5.ir0 ir0Var = this.f29122f;
            if (ir0Var != null && zArr[3]) {
                fVar.i(3, ir0Var.computeSize());
                this.f29122f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.fp0 fp0Var2 = this.f29120d;
            if (fp0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, fp0Var2.f27435d);
            }
            bw5.kr0 kr0Var2 = this.f29121e;
            if (kr0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, kr0Var2.computeSize());
            }
            bw5.ir0 ir0Var2 = this.f29122f;
            return (ir0Var2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, ir0Var2.computeSize());
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
            this.f29120d = bw5.fp0.a(aVar2.g(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.kr0 kr0Var3 = new bw5.kr0();
                if (bArr != null && bArr.length > 0) {
                    kr0Var3.parseFrom(bArr);
                }
                this.f29121e = kr0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.ir0 ir0Var3 = new bw5.ir0();
            if (bArr2 != null && bArr2.length > 0) {
                ir0Var3.parseFrom(bArr2);
            }
            this.f29122f = ir0Var3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.jr0) super.parseFrom(bArr);
    }
}
