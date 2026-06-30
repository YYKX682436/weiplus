package bw5;

/* loaded from: classes9.dex */
public class lf extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.a9 f29767d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.a9 f29768e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.x7 f29769f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f29770g = new boolean[4];

    static {
        new bw5.lf();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lf parseFrom(byte[] bArr) {
        return (bw5.lf) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lf)) {
            return false;
        }
        bw5.lf lfVar = (bw5.lf) fVar;
        return n51.f.a(this.f29767d, lfVar.f29767d) && n51.f.a(this.f29768e, lfVar.f29768e) && n51.f.a(this.f29769f, lfVar.f29769f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.lf();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29770g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.a9 a9Var = this.f29767d;
            if (a9Var != null && zArr[1]) {
                fVar.i(1, a9Var.computeSize());
                this.f29767d.writeFields(fVar);
            }
            bw5.a9 a9Var2 = this.f29768e;
            if (a9Var2 != null && zArr[2]) {
                fVar.i(2, a9Var2.computeSize());
                this.f29768e.writeFields(fVar);
            }
            bw5.x7 x7Var = this.f29769f;
            if (x7Var != null && zArr[3]) {
                fVar.i(3, x7Var.computeSize());
                this.f29769f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.a9 a9Var3 = this.f29767d;
            if (a9Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, a9Var3.computeSize());
            }
            bw5.a9 a9Var4 = this.f29768e;
            if (a9Var4 != null && zArr[2]) {
                i18 += b36.f.i(2, a9Var4.computeSize());
            }
            bw5.x7 x7Var2 = this.f29769f;
            return (x7Var2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, x7Var2.computeSize());
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
                bw5.a9 a9Var5 = new bw5.a9();
                if (bArr != null && bArr.length > 0) {
                    a9Var5.parseFrom(bArr);
                }
                this.f29767d = a9Var5;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.a9 a9Var6 = new bw5.a9();
                if (bArr2 != null && bArr2.length > 0) {
                    a9Var6.parseFrom(bArr2);
                }
                this.f29768e = a9Var6;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr3 != null && bArr3.length > 0) {
                x7Var3.parseFrom(bArr3);
            }
            this.f29769f = x7Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
