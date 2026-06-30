package bw5;

/* loaded from: classes2.dex */
public class nl extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f30723d;

    /* renamed from: e, reason: collision with root package name */
    public float f30724e;

    /* renamed from: f, reason: collision with root package name */
    public int f30725f;

    /* renamed from: g, reason: collision with root package name */
    public int f30726g;

    /* renamed from: h, reason: collision with root package name */
    public float f30727h;

    /* renamed from: i, reason: collision with root package name */
    public int f30728i;

    /* renamed from: m, reason: collision with root package name */
    public int f30729m;

    /* renamed from: n, reason: collision with root package name */
    public long f30730n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f30731o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f30732p = new boolean[22];

    static {
        new bw5.nl();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nl parseFrom(byte[] bArr) {
        return (bw5.nl) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nl)) {
            return false;
        }
        bw5.nl nlVar = (bw5.nl) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f30723d), java.lang.Integer.valueOf(nlVar.f30723d)) && n51.f.a(java.lang.Float.valueOf(this.f30724e), java.lang.Float.valueOf(nlVar.f30724e)) && n51.f.a(java.lang.Integer.valueOf(this.f30725f), java.lang.Integer.valueOf(nlVar.f30725f)) && n51.f.a(java.lang.Integer.valueOf(this.f30726g), java.lang.Integer.valueOf(nlVar.f30726g)) && n51.f.a(java.lang.Float.valueOf(this.f30727h), java.lang.Float.valueOf(nlVar.f30727h)) && n51.f.a(java.lang.Integer.valueOf(this.f30728i), java.lang.Integer.valueOf(nlVar.f30728i)) && n51.f.a(java.lang.Integer.valueOf(this.f30729m), java.lang.Integer.valueOf(nlVar.f30729m)) && n51.f.a(java.lang.Long.valueOf(this.f30730n), java.lang.Long.valueOf(nlVar.f30730n)) && n51.f.a(this.f30731o, nlVar.f30731o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.nl();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30732p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f30723d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f30724e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f30725f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f30726g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f30727h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f30728i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f30729m);
            }
            if (zArr[11]) {
                fVar.h(11, this.f30730n);
            }
            java.lang.String str = this.f30731o;
            if (str != null && zArr[21]) {
                fVar.j(21, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f30723d) : 0;
            if (zArr[2]) {
                e17 += b36.f.d(2, this.f30724e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f30725f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f30726g);
            }
            if (zArr[5]) {
                e17 += b36.f.d(5, this.f30727h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f30728i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f30729m);
            }
            if (zArr[11]) {
                e17 += b36.f.h(11, this.f30730n);
            }
            java.lang.String str2 = this.f30731o;
            return (str2 == null || !zArr[21]) ? e17 : e17 + b36.f.j(21, str2);
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
        if (intValue == 11) {
            this.f30730n = aVar2.i(intValue);
            zArr[11] = true;
            return 0;
        }
        if (intValue == 21) {
            this.f30731o = aVar2.k(intValue);
            zArr[21] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f30723d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30724e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30725f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30726g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30727h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30728i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30729m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
