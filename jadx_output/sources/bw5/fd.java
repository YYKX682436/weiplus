package bw5;

/* loaded from: classes4.dex */
public class fd extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f27228d;

    /* renamed from: e, reason: collision with root package name */
    public int f27229e;

    /* renamed from: f, reason: collision with root package name */
    public int f27230f;

    /* renamed from: g, reason: collision with root package name */
    public int f27231g;

    /* renamed from: h, reason: collision with root package name */
    public int f27232h;

    /* renamed from: i, reason: collision with root package name */
    public int f27233i;

    /* renamed from: m, reason: collision with root package name */
    public int f27234m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f27235n = new boolean[8];

    static {
        new bw5.fd();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fd parseFrom(byte[] bArr) {
        return (bw5.fd) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fd)) {
            return false;
        }
        bw5.fd fdVar = (bw5.fd) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27228d), java.lang.Integer.valueOf(fdVar.f27228d)) && n51.f.a(java.lang.Integer.valueOf(this.f27229e), java.lang.Integer.valueOf(fdVar.f27229e)) && n51.f.a(java.lang.Integer.valueOf(this.f27230f), java.lang.Integer.valueOf(fdVar.f27230f)) && n51.f.a(java.lang.Integer.valueOf(this.f27231g), java.lang.Integer.valueOf(fdVar.f27231g)) && n51.f.a(java.lang.Integer.valueOf(this.f27232h), java.lang.Integer.valueOf(fdVar.f27232h)) && n51.f.a(java.lang.Integer.valueOf(this.f27233i), java.lang.Integer.valueOf(fdVar.f27233i)) && n51.f.a(java.lang.Integer.valueOf(this.f27234m), java.lang.Integer.valueOf(fdVar.f27234m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fd();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27235n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27228d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27229e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27230f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f27231g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f27232h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f27233i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f27234m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f27228d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f27229e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f27230f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f27231g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f27232h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f27233i);
            }
            return zArr[7] ? e17 + b36.f.e(7, this.f27234m) : e17;
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
                this.f27228d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27229e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27230f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27231g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27232h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27233i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27234m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
