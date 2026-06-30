package bw5;

/* loaded from: classes9.dex */
public class p7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f31481d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31482e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31483f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f31484g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f31485h = new boolean[5];

    static {
        new bw5.p7();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.p7 parseFrom(byte[] bArr) {
        return (bw5.p7) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p7)) {
            return false;
        }
        bw5.p7 p7Var = (bw5.p7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f31481d), java.lang.Integer.valueOf(p7Var.f31481d)) && n51.f.a(java.lang.Boolean.valueOf(this.f31482e), java.lang.Boolean.valueOf(p7Var.f31482e)) && n51.f.a(java.lang.Boolean.valueOf(this.f31483f), java.lang.Boolean.valueOf(p7Var.f31483f)) && n51.f.a(java.lang.Boolean.valueOf(this.f31484g), java.lang.Boolean.valueOf(p7Var.f31484g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.p7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31485h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f31481d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f31482e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f31483f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f31484g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f31481d) : 0;
            if (zArr[2]) {
                e17 += b36.f.a(2, this.f31482e);
            }
            if (zArr[3]) {
                e17 += b36.f.a(3, this.f31483f);
            }
            return zArr[4] ? e17 + b36.f.a(4, this.f31484g) : e17;
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
            this.f31481d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31482e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f31483f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f31484g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }
}
