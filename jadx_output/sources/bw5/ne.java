package bw5;

/* loaded from: classes2.dex */
public class ne extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30644d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30645e;

    /* renamed from: f, reason: collision with root package name */
    public int f30646f;

    /* renamed from: g, reason: collision with root package name */
    public float f30647g;

    /* renamed from: h, reason: collision with root package name */
    public float f30648h;

    /* renamed from: i, reason: collision with root package name */
    public float f30649i;

    /* renamed from: m, reason: collision with root package name */
    public float f30650m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f30651n = new boolean[8];

    static {
        new bw5.ne();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ne parseFrom(byte[] bArr) {
        return (bw5.ne) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ne)) {
            return false;
        }
        bw5.ne neVar = (bw5.ne) fVar;
        return n51.f.a(this.f30644d, neVar.f30644d) && n51.f.a(java.lang.Boolean.valueOf(this.f30645e), java.lang.Boolean.valueOf(neVar.f30645e)) && n51.f.a(java.lang.Integer.valueOf(this.f30646f), java.lang.Integer.valueOf(neVar.f30646f)) && n51.f.a(java.lang.Float.valueOf(this.f30647g), java.lang.Float.valueOf(neVar.f30647g)) && n51.f.a(java.lang.Float.valueOf(this.f30648h), java.lang.Float.valueOf(neVar.f30648h)) && n51.f.a(java.lang.Float.valueOf(this.f30649i), java.lang.Float.valueOf(neVar.f30649i)) && n51.f.a(java.lang.Float.valueOf(this.f30650m), java.lang.Float.valueOf(neVar.f30650m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ne();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f30651n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30644d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f30645e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f30646f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f30647g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f30648h);
            }
            if (zArr[6]) {
                fVar.d(6, this.f30649i);
            }
            if (zArr[7]) {
                fVar.d(7, this.f30650m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f30644d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f30645e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f30646f);
            }
            if (zArr[4]) {
                i18 += b36.f.d(4, this.f30647g);
            }
            if (zArr[5]) {
                i18 += b36.f.d(5, this.f30648h);
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f30649i);
            }
            return zArr[7] ? i18 + b36.f.d(7, this.f30650m) : i18;
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
                this.f30644d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30645e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30646f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30647g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30648h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30649i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30650m = aVar2.f(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
