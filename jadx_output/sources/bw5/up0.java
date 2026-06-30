package bw5;

/* loaded from: classes2.dex */
public class up0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.m90 f34026d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.lp0 f34027e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34028f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f34029g = new boolean[4];

    static {
        new bw5.up0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.up0 parseFrom(byte[] bArr) {
        return (bw5.up0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.up0)) {
            return false;
        }
        bw5.up0 up0Var = (bw5.up0) fVar;
        return n51.f.a(this.f34026d, up0Var.f34026d) && n51.f.a(this.f34027e, up0Var.f34027e) && n51.f.a(this.f34028f, up0Var.f34028f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.up0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34029g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.m90 m90Var = this.f34026d;
            if (m90Var != null && zArr[1]) {
                fVar.i(1, m90Var.computeSize());
                this.f34026d.writeFields(fVar);
            }
            bw5.lp0 lp0Var = this.f34027e;
            if (lp0Var != null && zArr[2]) {
                fVar.i(2, lp0Var.computeSize());
                this.f34027e.writeFields(fVar);
            }
            java.lang.String str = this.f34028f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.m90 m90Var2 = this.f34026d;
            if (m90Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, m90Var2.computeSize());
            }
            bw5.lp0 lp0Var2 = this.f34027e;
            if (lp0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, lp0Var2.computeSize());
            }
            java.lang.String str2 = this.f34028f;
            return (str2 == null || !zArr[3]) ? i18 : i18 + b36.f.j(3, str2);
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
                bw5.m90 m90Var3 = new bw5.m90();
                if (bArr != null && bArr.length > 0) {
                    m90Var3.parseFrom(bArr);
                }
                this.f34026d = m90Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f34028f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.lp0 lp0Var3 = new bw5.lp0();
            if (bArr2 != null && bArr2.length > 0) {
                lp0Var3.parseFrom(bArr2);
            }
            this.f34027e = lp0Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
