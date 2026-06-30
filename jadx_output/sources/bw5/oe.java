package bw5;

/* loaded from: classes2.dex */
public class oe extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f31071d;

    /* renamed from: e, reason: collision with root package name */
    public float f31072e;

    /* renamed from: f, reason: collision with root package name */
    public int f31073f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f31074g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f31075h;

    /* renamed from: i, reason: collision with root package name */
    public float f31076i;

    /* renamed from: m, reason: collision with root package name */
    public int f31077m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f31078n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f31079o = new boolean[9];

    static {
        new bw5.oe();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.oe parseFrom(byte[] bArr) {
        return (bw5.oe) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.oe)) {
            return false;
        }
        bw5.oe oeVar = (bw5.oe) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f31071d), java.lang.Float.valueOf(oeVar.f31071d)) && n51.f.a(java.lang.Float.valueOf(this.f31072e), java.lang.Float.valueOf(oeVar.f31072e)) && n51.f.a(java.lang.Integer.valueOf(this.f31073f), java.lang.Integer.valueOf(oeVar.f31073f)) && n51.f.a(this.f31074g, oeVar.f31074g) && n51.f.a(this.f31075h, oeVar.f31075h) && n51.f.a(java.lang.Float.valueOf(this.f31076i), java.lang.Float.valueOf(oeVar.f31076i)) && n51.f.a(java.lang.Integer.valueOf(this.f31077m), java.lang.Integer.valueOf(oeVar.f31077m)) && n51.f.a(this.f31078n, oeVar.f31078n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.oe();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31079o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f31071d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f31072e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f31073f);
            }
            java.lang.String str = this.f31074g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f31075h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.d(6, this.f31076i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f31077m);
            }
            java.lang.String str3 = this.f31078n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f31071d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f31072e);
            }
            if (zArr[3]) {
                d17 += b36.f.e(3, this.f31073f);
            }
            java.lang.String str4 = this.f31074g;
            if (str4 != null && zArr[4]) {
                d17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f31075h;
            if (str5 != null && zArr[5]) {
                d17 += b36.f.j(5, str5);
            }
            if (zArr[6]) {
                d17 += b36.f.d(6, this.f31076i);
            }
            if (zArr[7]) {
                d17 += b36.f.e(7, this.f31077m);
            }
            java.lang.String str6 = this.f31078n;
            return (str6 == null || !zArr[8]) ? d17 : d17 + b36.f.j(8, str6);
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
                this.f31071d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f31072e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31073f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31074g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f31075h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f31076i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f31077m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f31078n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
