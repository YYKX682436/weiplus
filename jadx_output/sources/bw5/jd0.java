package bw5;

/* loaded from: classes2.dex */
public class jd0 extends com.tencent.mm.protobuf.f {
    public final boolean[] A = new boolean[28];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28931d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28932e;

    /* renamed from: f, reason: collision with root package name */
    public int f28933f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f28934g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28935h;

    /* renamed from: i, reason: collision with root package name */
    public int f28936i;

    /* renamed from: m, reason: collision with root package name */
    public int f28937m;

    /* renamed from: n, reason: collision with root package name */
    public int f28938n;

    /* renamed from: o, reason: collision with root package name */
    public int f28939o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f28940p;

    /* renamed from: q, reason: collision with root package name */
    public int f28941q;

    /* renamed from: r, reason: collision with root package name */
    public int f28942r;

    /* renamed from: s, reason: collision with root package name */
    public int f28943s;

    /* renamed from: t, reason: collision with root package name */
    public int f28944t;

    /* renamed from: u, reason: collision with root package name */
    public int f28945u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f28946v;

    /* renamed from: w, reason: collision with root package name */
    public int f28947w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f28948x;

    /* renamed from: y, reason: collision with root package name */
    public int f28949y;

    /* renamed from: z, reason: collision with root package name */
    public int f28950z;

    static {
        new bw5.jd0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jd0 parseFrom(byte[] bArr) {
        return (bw5.jd0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jd0)) {
            return false;
        }
        bw5.jd0 jd0Var = (bw5.jd0) fVar;
        return n51.f.a(this.f28931d, jd0Var.f28931d) && n51.f.a(this.f28932e, jd0Var.f28932e) && n51.f.a(java.lang.Integer.valueOf(this.f28933f), java.lang.Integer.valueOf(jd0Var.f28933f)) && n51.f.a(this.f28934g, jd0Var.f28934g) && n51.f.a(this.f28935h, jd0Var.f28935h) && n51.f.a(java.lang.Integer.valueOf(this.f28936i), java.lang.Integer.valueOf(jd0Var.f28936i)) && n51.f.a(java.lang.Integer.valueOf(this.f28937m), java.lang.Integer.valueOf(jd0Var.f28937m)) && n51.f.a(java.lang.Integer.valueOf(this.f28938n), java.lang.Integer.valueOf(jd0Var.f28938n)) && n51.f.a(java.lang.Integer.valueOf(this.f28939o), java.lang.Integer.valueOf(jd0Var.f28939o)) && n51.f.a(this.f28940p, jd0Var.f28940p) && n51.f.a(java.lang.Integer.valueOf(this.f28941q), java.lang.Integer.valueOf(jd0Var.f28941q)) && n51.f.a(java.lang.Integer.valueOf(this.f28942r), java.lang.Integer.valueOf(jd0Var.f28942r)) && n51.f.a(java.lang.Integer.valueOf(this.f28943s), java.lang.Integer.valueOf(jd0Var.f28943s)) && n51.f.a(java.lang.Integer.valueOf(this.f28944t), java.lang.Integer.valueOf(jd0Var.f28944t)) && n51.f.a(java.lang.Integer.valueOf(this.f28945u), java.lang.Integer.valueOf(jd0Var.f28945u)) && n51.f.a(this.f28946v, jd0Var.f28946v) && n51.f.a(java.lang.Integer.valueOf(this.f28947w), java.lang.Integer.valueOf(jd0Var.f28947w)) && n51.f.a(this.f28948x, jd0Var.f28948x) && n51.f.a(java.lang.Integer.valueOf(this.f28949y), java.lang.Integer.valueOf(jd0Var.f28949y)) && n51.f.a(java.lang.Integer.valueOf(this.f28950z), java.lang.Integer.valueOf(jd0Var.f28950z));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.jd0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.A;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f28931d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f28932e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f28933f);
            }
            java.lang.String str3 = this.f28934g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f28935h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            if (zArr[6]) {
                fVar.e(6, this.f28936i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f28937m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f28938n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f28939o);
            }
            java.lang.String str5 = this.f28940p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            if (zArr[11]) {
                fVar.e(11, this.f28941q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f28942r);
            }
            if (zArr[20]) {
                fVar.e(20, this.f28943s);
            }
            if (zArr[21]) {
                fVar.e(21, this.f28944t);
            }
            if (zArr[22]) {
                fVar.e(22, this.f28945u);
            }
            java.lang.String str6 = this.f28946v;
            if (str6 != null && zArr[23]) {
                fVar.j(23, str6);
            }
            if (zArr[24]) {
                fVar.e(24, this.f28947w);
            }
            java.lang.String str7 = this.f28948x;
            if (str7 != null && zArr[25]) {
                fVar.j(25, str7);
            }
            if (zArr[26]) {
                fVar.e(26, this.f28949y);
            }
            if (zArr[27]) {
                fVar.e(27, this.f28950z);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f28931d;
            if (str8 != null && zArr[1]) {
                i18 = b36.f.j(1, str8) + 0;
            }
            java.lang.String str9 = this.f28932e;
            if (str9 != null && zArr[2]) {
                i18 += b36.f.j(2, str9);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f28933f);
            }
            java.lang.String str10 = this.f28934g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f28935h;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f28936i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f28937m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f28938n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f28939o);
            }
            java.lang.String str12 = this.f28940p;
            if (str12 != null && zArr[10]) {
                i18 += b36.f.j(10, str12);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f28941q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f28942r);
            }
            if (zArr[20]) {
                i18 += b36.f.e(20, this.f28943s);
            }
            if (zArr[21]) {
                i18 += b36.f.e(21, this.f28944t);
            }
            if (zArr[22]) {
                i18 += b36.f.e(22, this.f28945u);
            }
            java.lang.String str13 = this.f28946v;
            if (str13 != null && zArr[23]) {
                i18 += b36.f.j(23, str13);
            }
            if (zArr[24]) {
                i18 += b36.f.e(24, this.f28947w);
            }
            java.lang.String str14 = this.f28948x;
            if (str14 != null && zArr[25]) {
                i18 += b36.f.j(25, str14);
            }
            if (zArr[26]) {
                i18 += b36.f.e(26, this.f28949y);
            }
            return zArr[27] ? i18 + b36.f.e(27, this.f28950z) : i18;
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
                this.f28931d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28932e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28933f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28934g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28935h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28936i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f28937m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f28938n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f28939o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f28940p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f28941q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f28942r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            default:
                switch (intValue) {
                    case 20:
                        this.f28943s = aVar2.g(intValue);
                        zArr[20] = true;
                        return 0;
                    case 21:
                        this.f28944t = aVar2.g(intValue);
                        zArr[21] = true;
                        return 0;
                    case 22:
                        this.f28945u = aVar2.g(intValue);
                        zArr[22] = true;
                        return 0;
                    case 23:
                        this.f28946v = aVar2.k(intValue);
                        zArr[23] = true;
                        return 0;
                    case 24:
                        this.f28947w = aVar2.g(intValue);
                        zArr[24] = true;
                        return 0;
                    case 25:
                        this.f28948x = aVar2.k(intValue);
                        zArr[25] = true;
                        return 0;
                    case 26:
                        this.f28949y = aVar2.g(intValue);
                        zArr[26] = true;
                        return 0;
                    case 27:
                        this.f28950z = aVar2.g(intValue);
                        zArr[27] = true;
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
