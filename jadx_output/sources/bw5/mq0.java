package bw5;

/* loaded from: classes8.dex */
public class mq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30360d;

    /* renamed from: e, reason: collision with root package name */
    public int f30361e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ap0 f30362f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f30363g = new boolean[4];

    static {
        new bw5.mq0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mq0)) {
            return false;
        }
        bw5.mq0 mq0Var = (bw5.mq0) fVar;
        return n51.f.a(this.f30360d, mq0Var.f30360d) && n51.f.a(java.lang.Integer.valueOf(this.f30361e), java.lang.Integer.valueOf(mq0Var.f30361e)) && n51.f.a(this.f30362f, mq0Var.f30362f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.mq0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30363g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30360d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f30361e);
            }
            bw5.ap0 ap0Var = this.f30362f;
            if (ap0Var != null && zArr[3]) {
                fVar.i(3, ap0Var.computeSize());
                this.f30362f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f30360d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f30361e);
            }
            bw5.ap0 ap0Var2 = this.f30362f;
            return (ap0Var2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, ap0Var2.computeSize());
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
            this.f30360d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f30361e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ap0 ap0Var3 = new bw5.ap0();
            if (bArr != null && bArr.length > 0) {
                ap0Var3.parseFrom(bArr);
            }
            this.f30362f = ap0Var3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.mq0) super.parseFrom(bArr);
    }
}
