package bw5;

/* loaded from: classes2.dex */
public class gh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f27856d;

    /* renamed from: e, reason: collision with root package name */
    public int f27857e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27858f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f27859g = new boolean[4];

    static {
        new bw5.gh0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gh0 parseFrom(byte[] bArr) {
        return (bw5.gh0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gh0)) {
            return false;
        }
        bw5.gh0 gh0Var = (bw5.gh0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27856d), java.lang.Integer.valueOf(gh0Var.f27856d)) && n51.f.a(java.lang.Integer.valueOf(this.f27857e), java.lang.Integer.valueOf(gh0Var.f27857e)) && n51.f.a(this.f27858f, gh0Var.f27858f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gh0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27859g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27856d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27857e);
            }
            java.lang.String str = this.f27858f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f27856d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f27857e);
            }
            java.lang.String str2 = this.f27858f;
            return (str2 == null || !zArr[3]) ? e17 : e17 + b36.f.j(3, str2);
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
            this.f27856d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27857e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f27858f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
