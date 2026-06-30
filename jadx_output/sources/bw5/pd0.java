package bw5;

/* loaded from: classes2.dex */
public class pd0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f31579d;

    /* renamed from: e, reason: collision with root package name */
    public int f31580e;

    /* renamed from: f, reason: collision with root package name */
    public int f31581f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f31582g;

    /* renamed from: h, reason: collision with root package name */
    public int f31583h;

    /* renamed from: i, reason: collision with root package name */
    public int f31584i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f31585m;

    /* renamed from: n, reason: collision with root package name */
    public long f31586n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f31587o = new boolean[9];

    static {
        new bw5.pd0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pd0 parseFrom(byte[] bArr) {
        return (bw5.pd0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pd0)) {
            return false;
        }
        bw5.pd0 pd0Var = (bw5.pd0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f31579d), java.lang.Integer.valueOf(pd0Var.f31579d)) && n51.f.a(java.lang.Integer.valueOf(this.f31580e), java.lang.Integer.valueOf(pd0Var.f31580e)) && n51.f.a(java.lang.Integer.valueOf(this.f31581f), java.lang.Integer.valueOf(pd0Var.f31581f)) && n51.f.a(java.lang.Boolean.valueOf(this.f31582g), java.lang.Boolean.valueOf(pd0Var.f31582g)) && n51.f.a(java.lang.Integer.valueOf(this.f31583h), java.lang.Integer.valueOf(pd0Var.f31583h)) && n51.f.a(java.lang.Integer.valueOf(this.f31584i), java.lang.Integer.valueOf(pd0Var.f31584i)) && n51.f.a(java.lang.Boolean.valueOf(this.f31585m), java.lang.Boolean.valueOf(pd0Var.f31585m)) && n51.f.a(java.lang.Long.valueOf(this.f31586n), java.lang.Long.valueOf(pd0Var.f31586n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.pd0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31587o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f31579d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f31580e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f31581f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f31582g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f31583h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f31584i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f31585m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f31586n);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f31579d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f31580e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f31581f);
            }
            if (zArr[4]) {
                e17 += b36.f.a(4, this.f31582g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f31583h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f31584i);
            }
            if (zArr[7]) {
                e17 += b36.f.a(7, this.f31585m);
            }
            return zArr[8] ? e17 + b36.f.h(8, this.f31586n) : e17;
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
                this.f31579d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f31580e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31581f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31582g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f31583h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f31584i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f31585m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f31586n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
