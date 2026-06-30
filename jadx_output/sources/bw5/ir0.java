package bw5;

/* loaded from: classes11.dex */
public class ir0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.fp0 f28692d;

    /* renamed from: e, reason: collision with root package name */
    public int f28693e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f28694f = new boolean[3];

    static {
        new bw5.ir0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ir0 parseFrom(byte[] bArr) {
        return (bw5.ir0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ir0)) {
            return false;
        }
        bw5.ir0 ir0Var = (bw5.ir0) fVar;
        return n51.f.a(this.f28692d, ir0Var.f28692d) && n51.f.a(java.lang.Integer.valueOf(this.f28693e), java.lang.Integer.valueOf(ir0Var.f28693e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ir0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28694f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.fp0 fp0Var = this.f28692d;
            if (fp0Var != null && zArr[1]) {
                fVar.e(1, fp0Var.f27435d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f28693e);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.fp0 fp0Var2 = this.f28692d;
            if (fp0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, fp0Var2.f27435d);
            }
            return zArr[2] ? i18 + b36.f.e(2, this.f28693e) : i18;
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
            this.f28692d = bw5.fp0.a(aVar2.g(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f28693e = aVar2.g(intValue);
        zArr[2] = true;
        return 0;
    }
}
