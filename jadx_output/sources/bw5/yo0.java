package bw5;

/* loaded from: classes9.dex */
public class yo0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f35592d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35593e;

    /* renamed from: f, reason: collision with root package name */
    public int f35594f;

    /* renamed from: g, reason: collision with root package name */
    public double f35595g;

    /* renamed from: h, reason: collision with root package name */
    public double f35596h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35597i = new boolean[6];

    static {
        new bw5.yo0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yo0)) {
            return false;
        }
        bw5.yo0 yo0Var = (bw5.yo0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f35592d), java.lang.Integer.valueOf(yo0Var.f35592d)) && n51.f.a(this.f35593e, yo0Var.f35593e) && n51.f.a(java.lang.Integer.valueOf(this.f35594f), java.lang.Integer.valueOf(yo0Var.f35594f)) && n51.f.a(java.lang.Double.valueOf(this.f35595g), java.lang.Double.valueOf(yo0Var.f35595g)) && n51.f.a(java.lang.Double.valueOf(this.f35596h), java.lang.Double.valueOf(yo0Var.f35596h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yo0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35597i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f35592d);
            }
            java.lang.String str = this.f35593e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f35594f);
            }
            if (zArr[4]) {
                fVar.c(4, this.f35595g);
            }
            if (zArr[5]) {
                fVar.c(5, this.f35596h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f35592d) : 0;
            java.lang.String str2 = this.f35593e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f35594f);
            }
            if (zArr[4]) {
                e17 += b36.f.c(4, this.f35595g);
            }
            return zArr[5] ? e17 + b36.f.c(5, this.f35596h) : e17;
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
            this.f35592d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35593e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f35594f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f35595g = aVar2.e(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f35596h = aVar2.e(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.yo0) super.parseFrom(bArr);
    }
}
