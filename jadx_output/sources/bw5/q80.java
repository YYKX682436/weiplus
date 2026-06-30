package bw5;

/* loaded from: classes2.dex */
public class q80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.c80 f31994d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31995e;

    /* renamed from: f, reason: collision with root package name */
    public long f31996f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f31997g = new boolean[4];

    static {
        new bw5.q80();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.q80 parseFrom(byte[] bArr) {
        return (bw5.q80) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q80)) {
            return false;
        }
        bw5.q80 q80Var = (bw5.q80) fVar;
        return n51.f.a(this.f31994d, q80Var.f31994d) && n51.f.a(this.f31995e, q80Var.f31995e) && n51.f.a(java.lang.Long.valueOf(this.f31996f), java.lang.Long.valueOf(q80Var.f31996f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.q80();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31997g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.c80 c80Var = this.f31994d;
            if (c80Var != null && zArr[1]) {
                fVar.i(1, c80Var.computeSize());
                this.f31994d.writeFields(fVar);
            }
            java.lang.String str = this.f31995e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f31996f);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.c80 c80Var2 = this.f31994d;
            if (c80Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, c80Var2.computeSize());
            }
            java.lang.String str2 = this.f31995e;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            return zArr[3] ? i18 + b36.f.h(3, this.f31996f) : i18;
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
            if (intValue == 2) {
                this.f31995e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f31996f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.c80 c80Var3 = new bw5.c80();
            if (bArr != null && bArr.length > 0) {
                c80Var3.parseFrom(bArr);
            }
            this.f31994d = c80Var3;
        }
        zArr[1] = true;
        return 0;
    }
}
