package bw5;

/* loaded from: classes4.dex */
public class x20 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34932d;

    /* renamed from: e, reason: collision with root package name */
    public int f34933e;

    /* renamed from: f, reason: collision with root package name */
    public int f34934f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f34935g = new boolean[4];

    static {
        new bw5.x20();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.x20 parseFrom(byte[] bArr) {
        return (bw5.x20) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.x20)) {
            return false;
        }
        bw5.x20 x20Var = (bw5.x20) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34932d), java.lang.Integer.valueOf(x20Var.f34932d)) && n51.f.a(java.lang.Integer.valueOf(this.f34933e), java.lang.Integer.valueOf(x20Var.f34933e)) && n51.f.a(java.lang.Integer.valueOf(this.f34934f), java.lang.Integer.valueOf(x20Var.f34934f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.x20();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34935g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34932d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34933e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34934f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f34932d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f34933e);
            }
            return zArr[3] ? e17 + b36.f.e(3, this.f34934f) : e17;
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
            this.f34932d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34933e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f34934f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
