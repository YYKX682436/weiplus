package bw5;

/* loaded from: classes2.dex */
public class zp0 extends com.tencent.mm.protobuf.f {
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public final boolean[] F = new boolean[26];

    /* renamed from: d, reason: collision with root package name */
    public long f36094d;

    /* renamed from: e, reason: collision with root package name */
    public int f36095e;

    /* renamed from: f, reason: collision with root package name */
    public int f36096f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f36097g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f36098h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f36099i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f36100m;

    /* renamed from: n, reason: collision with root package name */
    public int f36101n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f36102o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f36103p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f36104q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f36105r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f36106s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f36107t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f36108u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f36109v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f36110w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f36111x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f36112y;

    /* renamed from: z, reason: collision with root package name */
    public long f36113z;

    static {
        new bw5.zp0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zp0 parseFrom(byte[] bArr) {
        return (bw5.zp0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zp0)) {
            return false;
        }
        bw5.zp0 zp0Var = (bw5.zp0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f36094d), java.lang.Long.valueOf(zp0Var.f36094d)) && n51.f.a(java.lang.Integer.valueOf(this.f36095e), java.lang.Integer.valueOf(zp0Var.f36095e)) && n51.f.a(java.lang.Integer.valueOf(this.f36096f), java.lang.Integer.valueOf(zp0Var.f36096f)) && n51.f.a(java.lang.Boolean.valueOf(this.f36097g), java.lang.Boolean.valueOf(zp0Var.f36097g)) && n51.f.a(java.lang.Boolean.valueOf(this.f36098h), java.lang.Boolean.valueOf(zp0Var.f36098h)) && n51.f.a(java.lang.Boolean.valueOf(this.f36099i), java.lang.Boolean.valueOf(zp0Var.f36099i)) && n51.f.a(java.lang.Boolean.valueOf(this.f36100m), java.lang.Boolean.valueOf(zp0Var.f36100m)) && n51.f.a(java.lang.Integer.valueOf(this.f36101n), java.lang.Integer.valueOf(zp0Var.f36101n)) && n51.f.a(java.lang.Boolean.valueOf(this.f36102o), java.lang.Boolean.valueOf(zp0Var.f36102o)) && n51.f.a(java.lang.Boolean.valueOf(this.f36103p), java.lang.Boolean.valueOf(zp0Var.f36103p)) && n51.f.a(java.lang.Boolean.valueOf(this.f36104q), java.lang.Boolean.valueOf(zp0Var.f36104q)) && n51.f.a(java.lang.Boolean.valueOf(this.f36105r), java.lang.Boolean.valueOf(zp0Var.f36105r)) && n51.f.a(java.lang.Boolean.valueOf(this.f36106s), java.lang.Boolean.valueOf(zp0Var.f36106s)) && n51.f.a(java.lang.Boolean.valueOf(this.f36107t), java.lang.Boolean.valueOf(zp0Var.f36107t)) && n51.f.a(java.lang.Boolean.valueOf(this.f36108u), java.lang.Boolean.valueOf(zp0Var.f36108u)) && n51.f.a(java.lang.Boolean.valueOf(this.f36109v), java.lang.Boolean.valueOf(zp0Var.f36109v)) && n51.f.a(java.lang.Boolean.valueOf(this.f36110w), java.lang.Boolean.valueOf(zp0Var.f36110w)) && n51.f.a(java.lang.Boolean.valueOf(this.f36111x), java.lang.Boolean.valueOf(zp0Var.f36111x)) && n51.f.a(this.f36112y, zp0Var.f36112y) && n51.f.a(java.lang.Long.valueOf(this.f36113z), java.lang.Long.valueOf(zp0Var.f36113z)) && n51.f.a(java.lang.Long.valueOf(this.A), java.lang.Long.valueOf(zp0Var.A)) && n51.f.a(java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(zp0Var.B)) && n51.f.a(java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(zp0Var.C)) && n51.f.a(java.lang.Long.valueOf(this.D), java.lang.Long.valueOf(zp0Var.D)) && n51.f.a(java.lang.Long.valueOf(this.E), java.lang.Long.valueOf(zp0Var.E));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.F;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f36094d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f36095e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f36096f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f36097g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f36098h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f36099i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f36100m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f36101n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f36102o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f36103p);
            }
            if (zArr[11]) {
                fVar.a(11, this.f36104q);
            }
            if (zArr[12]) {
                fVar.a(12, this.f36105r);
            }
            if (zArr[13]) {
                fVar.a(13, this.f36106s);
            }
            if (zArr[14]) {
                fVar.a(14, this.f36107t);
            }
            if (zArr[15]) {
                fVar.a(15, this.f36108u);
            }
            if (zArr[16]) {
                fVar.a(16, this.f36109v);
            }
            if (zArr[17]) {
                fVar.a(17, this.f36110w);
            }
            if (zArr[18]) {
                fVar.a(18, this.f36111x);
            }
            java.lang.String str = this.f36112y;
            if (str != null && zArr[19]) {
                fVar.j(19, str);
            }
            if (zArr[20]) {
                fVar.h(20, this.f36113z);
            }
            if (zArr[21]) {
                fVar.h(21, this.A);
            }
            if (zArr[22]) {
                fVar.h(22, this.B);
            }
            if (zArr[23]) {
                fVar.h(23, this.C);
            }
            if (zArr[24]) {
                fVar.h(24, this.D);
            }
            if (zArr[25]) {
                fVar.h(25, this.E);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f36094d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f36095e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f36096f);
            }
            if (zArr[4]) {
                h17 += b36.f.a(4, this.f36097g);
            }
            if (zArr[5]) {
                h17 += b36.f.a(5, this.f36098h);
            }
            if (zArr[6]) {
                h17 += b36.f.a(6, this.f36099i);
            }
            if (zArr[7]) {
                h17 += b36.f.a(7, this.f36100m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f36101n);
            }
            if (zArr[9]) {
                h17 += b36.f.a(9, this.f36102o);
            }
            if (zArr[10]) {
                h17 += b36.f.a(10, this.f36103p);
            }
            if (zArr[11]) {
                h17 += b36.f.a(11, this.f36104q);
            }
            if (zArr[12]) {
                h17 += b36.f.a(12, this.f36105r);
            }
            if (zArr[13]) {
                h17 += b36.f.a(13, this.f36106s);
            }
            if (zArr[14]) {
                h17 += b36.f.a(14, this.f36107t);
            }
            if (zArr[15]) {
                h17 += b36.f.a(15, this.f36108u);
            }
            if (zArr[16]) {
                h17 += b36.f.a(16, this.f36109v);
            }
            if (zArr[17]) {
                h17 += b36.f.a(17, this.f36110w);
            }
            if (zArr[18]) {
                h17 += b36.f.a(18, this.f36111x);
            }
            java.lang.String str2 = this.f36112y;
            if (str2 != null && zArr[19]) {
                h17 += b36.f.j(19, str2);
            }
            if (zArr[20]) {
                h17 += b36.f.h(20, this.f36113z);
            }
            if (zArr[21]) {
                h17 += b36.f.h(21, this.A);
            }
            if (zArr[22]) {
                h17 += b36.f.h(22, this.B);
            }
            if (zArr[23]) {
                h17 += b36.f.h(23, this.C);
            }
            if (zArr[24]) {
                h17 += b36.f.h(24, this.D);
            }
            return zArr[25] ? h17 + b36.f.h(25, this.E) : h17;
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
                this.f36094d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f36095e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f36096f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f36097g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f36098h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f36099i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f36100m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f36101n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f36102o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f36103p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f36104q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f36105r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f36106s = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f36107t = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f36108u = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f36109v = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f36110w = aVar2.c(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f36111x = aVar2.c(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f36112y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f36113z = aVar2.i(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.i(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.i(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.i(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.i(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.i(intValue);
                zArr[25] = true;
                return 0;
            default:
                return -1;
        }
    }
}
