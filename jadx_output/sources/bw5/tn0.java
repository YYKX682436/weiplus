package bw5;

/* loaded from: classes4.dex */
public class tn0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.uk0 f33535d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33536e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33537f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f33538g = new boolean[4];

    static {
        new bw5.tn0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tn0)) {
            return false;
        }
        bw5.tn0 tn0Var = (bw5.tn0) fVar;
        return n51.f.a(this.f33535d, tn0Var.f33535d) && n51.f.a(this.f33536e, tn0Var.f33536e) && n51.f.a(java.lang.Boolean.valueOf(this.f33537f), java.lang.Boolean.valueOf(tn0Var.f33537f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tn0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33538g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.uk0 uk0Var = this.f33535d;
            if (uk0Var != null && zArr[1]) {
                fVar.e(1, uk0Var.f33958d);
            }
            java.lang.String str = this.f33536e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f33537f);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.uk0 uk0Var2 = this.f33535d;
            if (uk0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, uk0Var2.f33958d);
            }
            java.lang.String str2 = this.f33536e;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            return zArr[3] ? i18 + b36.f.a(3, this.f33537f) : i18;
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
            int g17 = aVar2.g(intValue);
            this.f33535d = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.uk0.CLUSTER_CREATETIME_DESC : bw5.uk0.CLUSTER_CONTENT_DESC : bw5.uk0.ONLY_CREATETIME_DESC;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33536e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f33537f = aVar2.c(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.tn0) super.parseFrom(bArr);
    }
}
