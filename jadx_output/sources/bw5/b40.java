package bw5;

/* loaded from: classes2.dex */
public class b40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f25510d;

    /* renamed from: e, reason: collision with root package name */
    public float f25511e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25512f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25513g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f25514h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f25515i;

    /* renamed from: m, reason: collision with root package name */
    public int f25516m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f25517n;

    /* renamed from: o, reason: collision with root package name */
    public int f25518o;

    /* renamed from: p, reason: collision with root package name */
    public int f25519p;

    /* renamed from: q, reason: collision with root package name */
    public int f25520q;

    /* renamed from: r, reason: collision with root package name */
    public float f25521r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f25522s;

    /* renamed from: t, reason: collision with root package name */
    public int f25523t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f25524u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f25525v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f25526w = new boolean[17];

    static {
        new bw5.b40();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b40 parseFrom(byte[] bArr) {
        return (bw5.b40) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b40)) {
            return false;
        }
        bw5.b40 b40Var = (bw5.b40) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f25510d), java.lang.Float.valueOf(b40Var.f25510d)) && n51.f.a(java.lang.Float.valueOf(this.f25511e), java.lang.Float.valueOf(b40Var.f25511e)) && n51.f.a(this.f25512f, b40Var.f25512f) && n51.f.a(this.f25513g, b40Var.f25513g) && n51.f.a(this.f25514h, b40Var.f25514h) && n51.f.a(this.f25515i, b40Var.f25515i) && n51.f.a(java.lang.Integer.valueOf(this.f25516m), java.lang.Integer.valueOf(b40Var.f25516m)) && n51.f.a(this.f25517n, b40Var.f25517n) && n51.f.a(java.lang.Integer.valueOf(this.f25518o), java.lang.Integer.valueOf(b40Var.f25518o)) && n51.f.a(java.lang.Integer.valueOf(this.f25519p), java.lang.Integer.valueOf(b40Var.f25519p)) && n51.f.a(java.lang.Integer.valueOf(this.f25520q), java.lang.Integer.valueOf(b40Var.f25520q)) && n51.f.a(java.lang.Float.valueOf(this.f25521r), java.lang.Float.valueOf(b40Var.f25521r)) && n51.f.a(this.f25522s, b40Var.f25522s) && n51.f.a(java.lang.Integer.valueOf(this.f25523t), java.lang.Integer.valueOf(b40Var.f25523t)) && n51.f.a(this.f25524u, b40Var.f25524u) && n51.f.a(this.f25525v, b40Var.f25525v);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.b40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25526w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f25510d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f25511e);
            }
            java.lang.String str = this.f25512f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f25513g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f25514h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f25515i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.e(7, this.f25516m);
            }
            java.lang.String str5 = this.f25517n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            if (zArr[9]) {
                fVar.e(9, this.f25518o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f25519p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f25520q);
            }
            if (zArr[12]) {
                fVar.d(12, this.f25521r);
            }
            com.tencent.mm.protobuf.g gVar = this.f25522s;
            if (gVar != null && zArr[13]) {
                fVar.b(13, gVar);
            }
            if (zArr[14]) {
                fVar.e(14, this.f25523t);
            }
            java.lang.String str6 = this.f25524u;
            if (str6 != null && zArr[15]) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.f25525v;
            if (str7 != null && zArr[16]) {
                fVar.j(16, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? b36.f.d(1, this.f25510d) + 0 : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f25511e);
            }
            java.lang.String str8 = this.f25512f;
            if (str8 != null && zArr[3]) {
                d17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f25513g;
            if (str9 != null && zArr[4]) {
                d17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f25514h;
            if (str10 != null && zArr[5]) {
                d17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f25515i;
            if (str11 != null && zArr[6]) {
                d17 += b36.f.j(6, str11);
            }
            if (zArr[7]) {
                d17 += b36.f.e(7, this.f25516m);
            }
            java.lang.String str12 = this.f25517n;
            if (str12 != null && zArr[8]) {
                d17 += b36.f.j(8, str12);
            }
            if (zArr[9]) {
                d17 += b36.f.e(9, this.f25518o);
            }
            if (zArr[10]) {
                d17 += b36.f.e(10, this.f25519p);
            }
            if (zArr[11]) {
                d17 += b36.f.e(11, this.f25520q);
            }
            if (zArr[12]) {
                d17 += b36.f.d(12, this.f25521r);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f25522s;
            if (gVar2 != null && zArr[13]) {
                d17 += b36.f.b(13, gVar2);
            }
            if (zArr[14]) {
                d17 += b36.f.e(14, this.f25523t);
            }
            java.lang.String str13 = this.f25524u;
            if (str13 != null && zArr[15]) {
                d17 += b36.f.j(15, str13);
            }
            java.lang.String str14 = this.f25525v;
            return (str14 == null || !zArr[16]) ? d17 : d17 + b36.f.j(16, str14);
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
                this.f25510d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25511e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25512f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25513g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25514h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25515i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25516m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f25517n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f25518o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f25519p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f25520q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f25521r = aVar2.f(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f25522s = aVar2.d(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f25523t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f25524u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f25525v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            default:
                return -1;
        }
    }
}
