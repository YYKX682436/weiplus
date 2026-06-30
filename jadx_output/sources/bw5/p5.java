package bw5;

/* loaded from: classes8.dex */
public class p5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31466d;

    /* renamed from: e, reason: collision with root package name */
    public long f31467e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f31468f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f31469g = new boolean[4];

    static {
        new bw5.p5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.p5 parseFrom(byte[] bArr) {
        return (bw5.p5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p5)) {
            return false;
        }
        bw5.p5 p5Var = (bw5.p5) fVar;
        return n51.f.a(this.f31466d, p5Var.f31466d) && n51.f.a(java.lang.Long.valueOf(this.f31467e), java.lang.Long.valueOf(p5Var.f31467e)) && n51.f.a(this.f31468f, p5Var.f31468f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.p5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31469g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31466d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f31467e);
            }
            java.lang.String str2 = this.f31468f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f31466d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f31467e);
            }
            java.lang.String str4 = this.f31468f;
            return (str4 == null || !zArr[3]) ? i18 : i18 + b36.f.j(3, str4);
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
            this.f31466d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31467e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f31468f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
