package bw5;

/* loaded from: classes8.dex */
public class oi0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31105d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.xa0 f31106e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.v70 f31107f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f31108g = new boolean[4];

    static {
        new bw5.oi0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.oi0 parseFrom(byte[] bArr) {
        return (bw5.oi0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.oi0)) {
            return false;
        }
        bw5.oi0 oi0Var = (bw5.oi0) fVar;
        return n51.f.a(this.f31105d, oi0Var.f31105d) && n51.f.a(this.f31106e, oi0Var.f31106e) && n51.f.a(this.f31107f, oi0Var.f31107f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.oi0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31108g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31105d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.xa0 xa0Var = this.f31106e;
            if (xa0Var != null && zArr[2]) {
                fVar.i(2, xa0Var.computeSize());
                this.f31106e.writeFields(fVar);
            }
            bw5.v70 v70Var = this.f31107f;
            if (v70Var != null && zArr[3]) {
                fVar.i(3, v70Var.computeSize());
                this.f31107f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f31105d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.xa0 xa0Var2 = this.f31106e;
            if (xa0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, xa0Var2.computeSize());
            }
            bw5.v70 v70Var2 = this.f31107f;
            return (v70Var2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, v70Var2.computeSize());
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
            this.f31105d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.xa0 xa0Var3 = new bw5.xa0();
                if (bArr != null && bArr.length > 0) {
                    xa0Var3.parseFrom(bArr);
                }
                this.f31106e = xa0Var3;
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
            bw5.v70 v70Var3 = new bw5.v70();
            if (bArr2 != null && bArr2.length > 0) {
                v70Var3.parseFrom(bArr2);
            }
            this.f31107f = v70Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
