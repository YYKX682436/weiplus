package bw5;

/* loaded from: classes2.dex */
public class wh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34730d;

    /* renamed from: e, reason: collision with root package name */
    public int f34731e;

    /* renamed from: f, reason: collision with root package name */
    public int f34732f;

    /* renamed from: g, reason: collision with root package name */
    public int f34733g;

    /* renamed from: h, reason: collision with root package name */
    public int f34734h;

    /* renamed from: i, reason: collision with root package name */
    public int f34735i;

    /* renamed from: m, reason: collision with root package name */
    public long f34736m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f34737n = new boolean[8];

    static {
        new bw5.wh0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wh0 parseFrom(byte[] bArr) {
        return (bw5.wh0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wh0)) {
            return false;
        }
        bw5.wh0 wh0Var = (bw5.wh0) fVar;
        return n51.f.a(this.f34730d, wh0Var.f34730d) && n51.f.a(java.lang.Integer.valueOf(this.f34731e), java.lang.Integer.valueOf(wh0Var.f34731e)) && n51.f.a(java.lang.Integer.valueOf(this.f34732f), java.lang.Integer.valueOf(wh0Var.f34732f)) && n51.f.a(java.lang.Integer.valueOf(this.f34733g), java.lang.Integer.valueOf(wh0Var.f34733g)) && n51.f.a(java.lang.Integer.valueOf(this.f34734h), java.lang.Integer.valueOf(wh0Var.f34734h)) && n51.f.a(java.lang.Integer.valueOf(this.f34735i), java.lang.Integer.valueOf(wh0Var.f34735i)) && n51.f.a(java.lang.Long.valueOf(this.f34736m), java.lang.Long.valueOf(wh0Var.f34736m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wh0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f34737n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34730d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34731e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34732f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34733g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f34734h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f34735i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f34736m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f34730d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f34731e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f34732f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f34733g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f34734h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f34735i);
            }
            return zArr[7] ? i18 + b36.f.h(7, this.f34736m) : i18;
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
                this.f34730d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34731e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34732f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34733g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34734h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34735i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34736m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
