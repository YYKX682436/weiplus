package bw5;

/* loaded from: classes2.dex */
public class ll extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f29837d;

    /* renamed from: e, reason: collision with root package name */
    public int f29838e;

    /* renamed from: f, reason: collision with root package name */
    public int f29839f;

    /* renamed from: g, reason: collision with root package name */
    public int f29840g;

    /* renamed from: h, reason: collision with root package name */
    public int f29841h;

    /* renamed from: i, reason: collision with root package name */
    public int f29842i;

    /* renamed from: m, reason: collision with root package name */
    public int f29843m;

    /* renamed from: n, reason: collision with root package name */
    public int f29844n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f29845o = new boolean[9];

    static {
        new bw5.ll();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ll parseFrom(byte[] bArr) {
        return (bw5.ll) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ll)) {
            return false;
        }
        bw5.ll llVar = (bw5.ll) fVar;
        return n51.f.a(this.f29837d, llVar.f29837d) && n51.f.a(java.lang.Integer.valueOf(this.f29838e), java.lang.Integer.valueOf(llVar.f29838e)) && n51.f.a(java.lang.Integer.valueOf(this.f29839f), java.lang.Integer.valueOf(llVar.f29839f)) && n51.f.a(java.lang.Integer.valueOf(this.f29840g), java.lang.Integer.valueOf(llVar.f29840g)) && n51.f.a(java.lang.Integer.valueOf(this.f29841h), java.lang.Integer.valueOf(llVar.f29841h)) && n51.f.a(java.lang.Integer.valueOf(this.f29842i), java.lang.Integer.valueOf(llVar.f29842i)) && n51.f.a(java.lang.Integer.valueOf(this.f29843m), java.lang.Integer.valueOf(llVar.f29843m)) && n51.f.a(java.lang.Integer.valueOf(this.f29844n), java.lang.Integer.valueOf(llVar.f29844n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ll();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29845o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f29837d;
            if (gVar != null && zArr[1]) {
                fVar.b(1, gVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29838e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f29839f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f29840g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f29841h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f29842i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f29843m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f29844n);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.f29837d;
            if (gVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.b(1, gVar2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f29838e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f29839f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f29840g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f29841h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f29842i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f29843m);
            }
            return zArr[8] ? i18 + b36.f.e(8, this.f29844n) : i18;
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
                this.f29837d = aVar2.d(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29838e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29839f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29840g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29841h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29842i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f29843m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f29844n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
