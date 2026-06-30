package bw5;

/* loaded from: classes11.dex */
public class p0 extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final bw5.p0 f31419h = new bw5.p0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.l0 f31420d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31421e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31422f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f31423g = new boolean[4];

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.p0 parseFrom(byte[] bArr) {
        return (bw5.p0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p0)) {
            return false;
        }
        bw5.p0 p0Var = (bw5.p0) fVar;
        return n51.f.a(this.f31420d, p0Var.f31420d) && n51.f.a(java.lang.Boolean.valueOf(this.f31421e), java.lang.Boolean.valueOf(p0Var.f31421e)) && n51.f.a(java.lang.Boolean.valueOf(this.f31422f), java.lang.Boolean.valueOf(p0Var.f31422f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.p0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31423g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.l0 l0Var = this.f31420d;
            if (l0Var != null && zArr[1]) {
                fVar.e(1, l0Var.f29594d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f31421e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f31422f);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.l0 l0Var2 = this.f31420d;
            if (l0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, l0Var2.f29594d);
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f31421e);
            }
            return zArr[3] ? i18 + b36.f.a(3, this.f31422f) : i18;
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
            this.f31420d = g17 != 0 ? g17 != 1 ? null : bw5.l0.AFFMIG_PC : bw5.l0.AFFMIG_PHONE;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31421e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f31422f = aVar2.c(intValue);
        zArr[3] = true;
        return 0;
    }
}
