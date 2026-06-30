package bw5;

/* loaded from: classes9.dex */
public class n7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public double f30522d;

    /* renamed from: e, reason: collision with root package name */
    public int f30523e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30524f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30525g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30526h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30527i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f30528m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f30529n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f30530o = new boolean[9];

    static {
        new bw5.n7();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n7 parseFrom(byte[] bArr) {
        return (bw5.n7) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n7)) {
            return false;
        }
        bw5.n7 n7Var = (bw5.n7) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f30522d), java.lang.Double.valueOf(n7Var.f30522d)) && n51.f.a(java.lang.Integer.valueOf(this.f30523e), java.lang.Integer.valueOf(n7Var.f30523e)) && n51.f.a(java.lang.Boolean.valueOf(this.f30524f), java.lang.Boolean.valueOf(n7Var.f30524f)) && n51.f.a(java.lang.Boolean.valueOf(this.f30525g), java.lang.Boolean.valueOf(n7Var.f30525g)) && n51.f.a(java.lang.Boolean.valueOf(this.f30526h), java.lang.Boolean.valueOf(n7Var.f30526h)) && n51.f.a(java.lang.Boolean.valueOf(this.f30527i), java.lang.Boolean.valueOf(n7Var.f30527i)) && n51.f.a(java.lang.Boolean.valueOf(this.f30528m), java.lang.Boolean.valueOf(n7Var.f30528m)) && n51.f.a(java.lang.Boolean.valueOf(this.f30529n), java.lang.Boolean.valueOf(n7Var.f30529n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.n7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30530o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.c(1, this.f30522d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f30523e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f30524f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f30525g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f30526h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f30527i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f30528m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f30529n);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = zArr[1] ? 0 + b36.f.c(1, this.f30522d) : 0;
            if (zArr[2]) {
                c17 += b36.f.e(2, this.f30523e);
            }
            if (zArr[3]) {
                c17 += b36.f.a(3, this.f30524f);
            }
            if (zArr[4]) {
                c17 += b36.f.a(4, this.f30525g);
            }
            if (zArr[5]) {
                c17 += b36.f.a(5, this.f30526h);
            }
            if (zArr[6]) {
                c17 += b36.f.a(6, this.f30527i);
            }
            if (zArr[7]) {
                c17 += b36.f.a(7, this.f30528m);
            }
            return zArr[8] ? c17 + b36.f.a(8, this.f30529n) : c17;
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
        switch (intValue) {
            case 1:
                this.f30522d = aVar2.e(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30523e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30524f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30525g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30526h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30527i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30528m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30529n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
