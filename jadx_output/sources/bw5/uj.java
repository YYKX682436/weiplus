package bw5;

/* loaded from: classes2.dex */
public class uj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f33930d;

    /* renamed from: e, reason: collision with root package name */
    public float f33931e;

    /* renamed from: f, reason: collision with root package name */
    public int f33932f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33933g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f33934h;

    /* renamed from: i, reason: collision with root package name */
    public int f33935i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f33936m = new boolean[7];

    static {
        new bw5.uj();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.uj)) {
            return false;
        }
        bw5.uj ujVar = (bw5.uj) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f33930d), java.lang.Float.valueOf(ujVar.f33930d)) && n51.f.a(java.lang.Float.valueOf(this.f33931e), java.lang.Float.valueOf(ujVar.f33931e)) && n51.f.a(java.lang.Integer.valueOf(this.f33932f), java.lang.Integer.valueOf(ujVar.f33932f)) && n51.f.a(this.f33933g, ujVar.f33933g) && n51.f.a(this.f33934h, ujVar.f33934h) && n51.f.a(java.lang.Integer.valueOf(this.f33935i), java.lang.Integer.valueOf(ujVar.f33935i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.uj();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33936m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f33930d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f33931e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33932f);
            }
            java.lang.String str = this.f33933g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f33934h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.e(6, this.f33935i);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f33930d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f33931e);
            }
            if (zArr[3]) {
                d17 += b36.f.e(3, this.f33932f);
            }
            java.lang.String str3 = this.f33933g;
            if (str3 != null && zArr[4]) {
                d17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f33934h;
            if (str4 != null && zArr[5]) {
                d17 += b36.f.j(5, str4);
            }
            return zArr[6] ? d17 + b36.f.e(6, this.f33935i) : d17;
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
                this.f33930d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33931e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33932f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33933g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33934h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33935i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.uj) super.parseFrom(bArr);
    }
}
