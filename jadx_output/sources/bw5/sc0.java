package bw5;

/* loaded from: classes2.dex */
public class sc0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f32901d;

    /* renamed from: e, reason: collision with root package name */
    public int f32902e;

    /* renamed from: f, reason: collision with root package name */
    public int f32903f;

    /* renamed from: g, reason: collision with root package name */
    public int f32904g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f32905h;

    /* renamed from: i, reason: collision with root package name */
    public int f32906i;

    /* renamed from: m, reason: collision with root package name */
    public int f32907m;

    /* renamed from: n, reason: collision with root package name */
    public int f32908n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f32909o;

    /* renamed from: p, reason: collision with root package name */
    public long f32910p;

    /* renamed from: q, reason: collision with root package name */
    public int f32911q;

    /* renamed from: r, reason: collision with root package name */
    public int f32912r;

    /* renamed from: s, reason: collision with root package name */
    public int f32913s;

    /* renamed from: t, reason: collision with root package name */
    public long f32914t;

    /* renamed from: u, reason: collision with root package name */
    public long f32915u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f32916v = new boolean[16];

    static {
        new bw5.sc0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sc0 parseFrom(byte[] bArr) {
        return (bw5.sc0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sc0)) {
            return false;
        }
        bw5.sc0 sc0Var = (bw5.sc0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f32901d), java.lang.Long.valueOf(sc0Var.f32901d)) && n51.f.a(java.lang.Integer.valueOf(this.f32902e), java.lang.Integer.valueOf(sc0Var.f32902e)) && n51.f.a(java.lang.Integer.valueOf(this.f32903f), java.lang.Integer.valueOf(sc0Var.f32903f)) && n51.f.a(java.lang.Integer.valueOf(this.f32904g), java.lang.Integer.valueOf(sc0Var.f32904g)) && n51.f.a(this.f32905h, sc0Var.f32905h) && n51.f.a(java.lang.Integer.valueOf(this.f32906i), java.lang.Integer.valueOf(sc0Var.f32906i)) && n51.f.a(java.lang.Integer.valueOf(this.f32907m), java.lang.Integer.valueOf(sc0Var.f32907m)) && n51.f.a(java.lang.Integer.valueOf(this.f32908n), java.lang.Integer.valueOf(sc0Var.f32908n)) && n51.f.a(java.lang.Boolean.valueOf(this.f32909o), java.lang.Boolean.valueOf(sc0Var.f32909o)) && n51.f.a(java.lang.Long.valueOf(this.f32910p), java.lang.Long.valueOf(sc0Var.f32910p)) && n51.f.a(java.lang.Integer.valueOf(this.f32911q), java.lang.Integer.valueOf(sc0Var.f32911q)) && n51.f.a(java.lang.Integer.valueOf(this.f32912r), java.lang.Integer.valueOf(sc0Var.f32912r)) && n51.f.a(java.lang.Integer.valueOf(this.f32913s), java.lang.Integer.valueOf(sc0Var.f32913s)) && n51.f.a(java.lang.Long.valueOf(this.f32914t), java.lang.Long.valueOf(sc0Var.f32914t)) && n51.f.a(java.lang.Long.valueOf(this.f32915u), java.lang.Long.valueOf(sc0Var.f32915u));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sc0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32916v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f32901d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f32902e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f32903f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f32904g);
            }
            java.lang.String str = this.f32905h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            if (zArr[6]) {
                fVar.e(6, this.f32906i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f32907m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f32908n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f32909o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f32910p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f32911q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f32912r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f32913s);
            }
            if (zArr[14]) {
                fVar.h(14, this.f32914t);
            }
            if (zArr[15]) {
                fVar.h(15, this.f32915u);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f32901d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f32902e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f32903f);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f32904g);
            }
            java.lang.String str2 = this.f32905h;
            if (str2 != null && zArr[5]) {
                h17 += b36.f.j(5, str2);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f32906i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f32907m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f32908n);
            }
            if (zArr[9]) {
                h17 += b36.f.a(9, this.f32909o);
            }
            if (zArr[10]) {
                h17 += b36.f.h(10, this.f32910p);
            }
            if (zArr[11]) {
                h17 += b36.f.e(11, this.f32911q);
            }
            if (zArr[12]) {
                h17 += b36.f.e(12, this.f32912r);
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f32913s);
            }
            if (zArr[14]) {
                h17 += b36.f.h(14, this.f32914t);
            }
            return zArr[15] ? h17 + b36.f.h(15, this.f32915u) : h17;
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
                this.f32901d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32902e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32903f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32904g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32905h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32906i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f32907m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f32908n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f32909o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f32910p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f32911q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f32912r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f32913s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f32914t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f32915u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
