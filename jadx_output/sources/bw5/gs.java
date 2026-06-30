package bw5;

/* loaded from: classes2.dex */
public class gs extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27981d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27982e;

    /* renamed from: f, reason: collision with root package name */
    public int f27983f;

    /* renamed from: g, reason: collision with root package name */
    public int f27984g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f27985h = new boolean[5];

    static {
        new bw5.gs();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gs parseFrom(byte[] bArr) {
        return (bw5.gs) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gs)) {
            return false;
        }
        bw5.gs gsVar = (bw5.gs) fVar;
        return n51.f.a(this.f27981d, gsVar.f27981d) && n51.f.a(this.f27982e, gsVar.f27982e) && n51.f.a(java.lang.Integer.valueOf(this.f27983f), java.lang.Integer.valueOf(gsVar.f27983f)) && n51.f.a(java.lang.Integer.valueOf(this.f27984g), java.lang.Integer.valueOf(gsVar.f27984g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gs();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27985h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27981d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f27982e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27983f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f27984g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f27981d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f27982e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f27983f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f27984g) : i18;
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
            this.f27981d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27982e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f27983f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f27984g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
