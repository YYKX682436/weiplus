package bw5;

/* loaded from: classes15.dex */
public class q4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f31921d;

    /* renamed from: e, reason: collision with root package name */
    public int f31922e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f31923f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f31924g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f31925h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f31926i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f31927m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f31928n;

    /* renamed from: o, reason: collision with root package name */
    public long f31929o;

    /* renamed from: p, reason: collision with root package name */
    public long f31930p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f31931q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f31932r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f31933s;

    /* renamed from: t, reason: collision with root package name */
    public int f31934t;

    /* renamed from: u, reason: collision with root package name */
    public long f31935u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f31936v = new boolean[16];

    static {
        new bw5.q4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.q4 parseFrom(byte[] bArr) {
        return (bw5.q4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q4)) {
            return false;
        }
        bw5.q4 q4Var = (bw5.q4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f31921d), java.lang.Integer.valueOf(q4Var.f31921d)) && n51.f.a(java.lang.Integer.valueOf(this.f31922e), java.lang.Integer.valueOf(q4Var.f31922e)) && n51.f.a(this.f31923f, q4Var.f31923f) && n51.f.a(this.f31924g, q4Var.f31924g) && n51.f.a(this.f31925h, q4Var.f31925h) && n51.f.a(this.f31926i, q4Var.f31926i) && n51.f.a(this.f31927m, q4Var.f31927m) && n51.f.a(this.f31928n, q4Var.f31928n) && n51.f.a(java.lang.Long.valueOf(this.f31929o), java.lang.Long.valueOf(q4Var.f31929o)) && n51.f.a(java.lang.Long.valueOf(this.f31930p), java.lang.Long.valueOf(q4Var.f31930p)) && n51.f.a(this.f31931q, q4Var.f31931q) && n51.f.a(java.lang.Boolean.valueOf(this.f31932r), java.lang.Boolean.valueOf(q4Var.f31932r)) && n51.f.a(this.f31933s, q4Var.f31933s) && n51.f.a(java.lang.Integer.valueOf(this.f31934t), java.lang.Integer.valueOf(q4Var.f31934t)) && n51.f.a(java.lang.Long.valueOf(this.f31935u), java.lang.Long.valueOf(q4Var.f31935u));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.q4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31936v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f31921d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f31922e);
            }
            java.lang.String str = this.f31923f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f31924g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f31925h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f31926i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f31927m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f31928n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            if (zArr[9]) {
                fVar.h(9, this.f31929o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f31930p);
            }
            java.lang.String str7 = this.f31931q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            if (zArr[12]) {
                fVar.a(12, this.f31932r);
            }
            java.lang.String str8 = this.f31933s;
            if (str8 != null && zArr[13]) {
                fVar.j(13, str8);
            }
            if (zArr[14]) {
                fVar.e(14, this.f31934t);
            }
            if (zArr[15]) {
                fVar.h(15, this.f31935u);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f31921d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f31922e);
            }
            java.lang.String str9 = this.f31923f;
            if (str9 != null && zArr[3]) {
                e17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f31924g;
            if (str10 != null && zArr[4]) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f31925h;
            if (str11 != null && zArr[5]) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f31926i;
            if (str12 != null && zArr[6]) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f31927m;
            if (str13 != null && zArr[7]) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f31928n;
            if (str14 != null && zArr[8]) {
                e17 += b36.f.j(8, str14);
            }
            if (zArr[9]) {
                e17 += b36.f.h(9, this.f31929o);
            }
            if (zArr[10]) {
                e17 += b36.f.h(10, this.f31930p);
            }
            java.lang.String str15 = this.f31931q;
            if (str15 != null && zArr[11]) {
                e17 += b36.f.j(11, str15);
            }
            if (zArr[12]) {
                e17 += b36.f.a(12, this.f31932r);
            }
            java.lang.String str16 = this.f31933s;
            if (str16 != null && zArr[13]) {
                e17 += b36.f.j(13, str16);
            }
            if (zArr[14]) {
                e17 += b36.f.e(14, this.f31934t);
            }
            return zArr[15] ? e17 + b36.f.h(15, this.f31935u) : e17;
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
                this.f31921d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f31922e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31923f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31924g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f31925h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f31926i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f31927m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f31928n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f31929o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f31930p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f31931q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f31932r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f31933s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f31934t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f31935u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
