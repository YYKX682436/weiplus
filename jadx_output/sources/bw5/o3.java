package bw5;

/* loaded from: classes2.dex */
public class o3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f30921d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30922e;

    /* renamed from: f, reason: collision with root package name */
    public long f30923f;

    /* renamed from: g, reason: collision with root package name */
    public long f30924g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30925h;

    /* renamed from: i, reason: collision with root package name */
    public long f30926i;

    /* renamed from: m, reason: collision with root package name */
    public long f30927m;

    /* renamed from: n, reason: collision with root package name */
    public long f30928n;

    /* renamed from: o, reason: collision with root package name */
    public long f30929o;

    /* renamed from: p, reason: collision with root package name */
    public int f30930p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f30931q = new boolean[11];

    static {
        new bw5.o3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.o3 parseFrom(byte[] bArr) {
        return (bw5.o3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o3)) {
            return false;
        }
        bw5.o3 o3Var = (bw5.o3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f30921d), java.lang.Integer.valueOf(o3Var.f30921d)) && n51.f.a(this.f30922e, o3Var.f30922e) && n51.f.a(java.lang.Long.valueOf(this.f30923f), java.lang.Long.valueOf(o3Var.f30923f)) && n51.f.a(java.lang.Long.valueOf(this.f30924g), java.lang.Long.valueOf(o3Var.f30924g)) && n51.f.a(java.lang.Boolean.valueOf(this.f30925h), java.lang.Boolean.valueOf(o3Var.f30925h)) && n51.f.a(java.lang.Long.valueOf(this.f30926i), java.lang.Long.valueOf(o3Var.f30926i)) && n51.f.a(java.lang.Long.valueOf(this.f30927m), java.lang.Long.valueOf(o3Var.f30927m)) && n51.f.a(java.lang.Long.valueOf(this.f30928n), java.lang.Long.valueOf(o3Var.f30928n)) && n51.f.a(java.lang.Long.valueOf(this.f30929o), java.lang.Long.valueOf(o3Var.f30929o)) && n51.f.a(java.lang.Integer.valueOf(this.f30930p), java.lang.Integer.valueOf(o3Var.f30930p));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.o3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30931q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f30921d);
            }
            java.lang.String str = this.f30922e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f30923f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f30924g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f30925h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f30926i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f30927m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f30928n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f30929o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f30930p);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f30921d) : 0;
            java.lang.String str2 = this.f30922e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f30923f);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f30924g);
            }
            if (zArr[5]) {
                e17 += b36.f.a(5, this.f30925h);
            }
            if (zArr[6]) {
                e17 += b36.f.h(6, this.f30926i);
            }
            if (zArr[7]) {
                e17 += b36.f.h(7, this.f30927m);
            }
            if (zArr[8]) {
                e17 += b36.f.h(8, this.f30928n);
            }
            if (zArr[9]) {
                e17 += b36.f.h(9, this.f30929o);
            }
            return zArr[10] ? e17 + b36.f.e(10, this.f30930p) : e17;
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
                this.f30921d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30922e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30923f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30924g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30925h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30926i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30927m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30928n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f30929o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f30930p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
