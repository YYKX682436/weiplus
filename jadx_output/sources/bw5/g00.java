package bw5;

/* loaded from: classes2.dex */
public class g00 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f27595d;

    /* renamed from: e, reason: collision with root package name */
    public int f27596e;

    /* renamed from: f, reason: collision with root package name */
    public int f27597f;

    /* renamed from: g, reason: collision with root package name */
    public int f27598g;

    /* renamed from: h, reason: collision with root package name */
    public int f27599h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f27600i;

    /* renamed from: m, reason: collision with root package name */
    public int f27601m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f27602n = new boolean[9];

    static {
        new bw5.g00();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.g00 parseFrom(byte[] bArr) {
        return (bw5.g00) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g00)) {
            return false;
        }
        bw5.g00 g00Var = (bw5.g00) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27595d), java.lang.Integer.valueOf(g00Var.f27595d)) && n51.f.a(java.lang.Integer.valueOf(this.f27596e), java.lang.Integer.valueOf(g00Var.f27596e)) && n51.f.a(java.lang.Integer.valueOf(this.f27597f), java.lang.Integer.valueOf(g00Var.f27597f)) && n51.f.a(java.lang.Integer.valueOf(this.f27598g), java.lang.Integer.valueOf(g00Var.f27598g)) && n51.f.a(java.lang.Integer.valueOf(this.f27599h), java.lang.Integer.valueOf(g00Var.f27599h)) && n51.f.a(this.f27600i, g00Var.f27600i) && n51.f.a(java.lang.Integer.valueOf(this.f27601m), java.lang.Integer.valueOf(g00Var.f27601m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.g00();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27602n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27595d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27596e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27597f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f27598g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f27599h);
            }
            java.lang.String str = this.f27600i;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            if (zArr[8]) {
                fVar.e(8, this.f27601m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f27595d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f27596e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f27597f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f27598g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f27599h);
            }
            java.lang.String str2 = this.f27600i;
            if (str2 != null && zArr[6]) {
                e17 += b36.f.j(6, str2);
            }
            return zArr[8] ? e17 + b36.f.e(8, this.f27601m) : e17;
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
                this.f27595d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27596e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27597f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27598g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27599h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27600i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                this.f27601m = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
        }
    }
}
