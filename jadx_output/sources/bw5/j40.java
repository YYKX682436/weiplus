package bw5;

/* loaded from: classes11.dex */
public class j40 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public long F;
    public int G;
    public final boolean[] H = new boolean[29];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28806d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28807e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28808f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f28809g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28810h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f28811i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f28812m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f28813n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f28814o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f28815p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f28816q;

    /* renamed from: r, reason: collision with root package name */
    public long f28817r;

    /* renamed from: s, reason: collision with root package name */
    public int f28818s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f28819t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f28820u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f28821v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f28822w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f28823x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f28824y;

    /* renamed from: z, reason: collision with root package name */
    public int f28825z;

    static {
        new bw5.j40();
    }

    public java.lang.String b() {
        return this.H[8] ? this.f28813n : "";
    }

    public java.lang.String c() {
        return this.H[15] ? this.f28820u : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j40)) {
            return false;
        }
        bw5.j40 j40Var = (bw5.j40) fVar;
        return n51.f.a(this.f28806d, j40Var.f28806d) && n51.f.a(this.f28807e, j40Var.f28807e) && n51.f.a(this.f28808f, j40Var.f28808f) && n51.f.a(this.f28809g, j40Var.f28809g) && n51.f.a(this.f28810h, j40Var.f28810h) && n51.f.a(this.f28811i, j40Var.f28811i) && n51.f.a(this.f28812m, j40Var.f28812m) && n51.f.a(this.f28813n, j40Var.f28813n) && n51.f.a(this.f28814o, j40Var.f28814o) && n51.f.a(this.f28815p, j40Var.f28815p) && n51.f.a(this.f28816q, j40Var.f28816q) && n51.f.a(java.lang.Long.valueOf(this.f28817r), java.lang.Long.valueOf(j40Var.f28817r)) && n51.f.a(java.lang.Integer.valueOf(this.f28818s), java.lang.Integer.valueOf(j40Var.f28818s)) && n51.f.a(this.f28819t, j40Var.f28819t) && n51.f.a(this.f28820u, j40Var.f28820u) && n51.f.a(this.f28821v, j40Var.f28821v) && n51.f.a(java.lang.Boolean.valueOf(this.f28822w), java.lang.Boolean.valueOf(j40Var.f28822w)) && n51.f.a(this.f28823x, j40Var.f28823x) && n51.f.a(this.f28824y, j40Var.f28824y) && n51.f.a(java.lang.Integer.valueOf(this.f28825z), java.lang.Integer.valueOf(j40Var.f28825z)) && n51.f.a(this.A, j40Var.A) && n51.f.a(this.B, j40Var.B) && n51.f.a(this.C, j40Var.C) && n51.f.a(this.D, j40Var.D) && n51.f.a(this.E, j40Var.E) && n51.f.a(java.lang.Long.valueOf(this.F), java.lang.Long.valueOf(j40Var.F)) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(j40Var.G));
    }

    public java.lang.String d() {
        return this.H[2] ? this.f28807e : "";
    }

    public java.lang.String e() {
        return this.H[4] ? this.f28809g : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public bw5.j40 parseFrom(byte[] bArr) {
        return (bw5.j40) super.parseFrom(bArr);
    }

    public bw5.j40 g(java.lang.String str) {
        this.f28820u = str;
        this.H[15] = true;
        return this;
    }

    public java.lang.String getBizUsername() {
        return this.H[7] ? this.f28812m : "";
    }

    public java.lang.String getUrl() {
        return this.H[1] ? this.f28806d : "";
    }

    public bw5.j40 i(java.lang.String str) {
        this.f28806d = str;
        this.H[1] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.j40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.H;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f28806d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f28807e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f28808f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f28809g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f28810h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f28811i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f28812m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f28813n;
            if (str8 != null && zArr[8]) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f28814o;
            if (str9 != null && zArr[9]) {
                fVar.j(9, str9);
            }
            java.lang.String str10 = this.f28815p;
            if (str10 != null && zArr[10]) {
                fVar.j(10, str10);
            }
            java.lang.String str11 = this.f28816q;
            if (str11 != null && zArr[11]) {
                fVar.j(11, str11);
            }
            if (zArr[12]) {
                fVar.h(12, this.f28817r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f28818s);
            }
            java.lang.String str12 = this.f28819t;
            if (str12 != null && zArr[14]) {
                fVar.j(14, str12);
            }
            java.lang.String str13 = this.f28820u;
            if (str13 != null && zArr[15]) {
                fVar.j(15, str13);
            }
            java.lang.String str14 = this.f28821v;
            if (str14 != null && zArr[16]) {
                fVar.j(16, str14);
            }
            if (zArr[17]) {
                fVar.a(17, this.f28822w);
            }
            java.lang.String str15 = this.f28823x;
            if (str15 != null && zArr[18]) {
                fVar.j(18, str15);
            }
            java.lang.String str16 = this.f28824y;
            if (str16 != null && zArr[19]) {
                fVar.j(19, str16);
            }
            if (zArr[20]) {
                fVar.e(20, this.f28825z);
            }
            java.lang.String str17 = this.A;
            if (str17 != null && zArr[21]) {
                fVar.j(21, str17);
            }
            java.lang.String str18 = this.B;
            if (str18 != null && zArr[22]) {
                fVar.j(22, str18);
            }
            java.lang.String str19 = this.C;
            if (str19 != null && zArr[23]) {
                fVar.j(23, str19);
            }
            java.lang.String str20 = this.D;
            if (str20 != null && zArr[24]) {
                fVar.j(24, str20);
            }
            java.lang.String str21 = this.E;
            if (str21 != null && zArr[25]) {
                fVar.j(25, str21);
            }
            if (zArr[27]) {
                fVar.h(27, this.F);
            }
            if (zArr[28]) {
                fVar.e(28, this.G);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str22 = this.f28806d;
            if (str22 != null && zArr[1]) {
                i18 = b36.f.j(1, str22) + 0;
            }
            java.lang.String str23 = this.f28807e;
            if (str23 != null && zArr[2]) {
                i18 += b36.f.j(2, str23);
            }
            java.lang.String str24 = this.f28808f;
            if (str24 != null && zArr[3]) {
                i18 += b36.f.j(3, str24);
            }
            java.lang.String str25 = this.f28809g;
            if (str25 != null && zArr[4]) {
                i18 += b36.f.j(4, str25);
            }
            java.lang.String str26 = this.f28810h;
            if (str26 != null && zArr[5]) {
                i18 += b36.f.j(5, str26);
            }
            java.lang.String str27 = this.f28811i;
            if (str27 != null && zArr[6]) {
                i18 += b36.f.j(6, str27);
            }
            java.lang.String str28 = this.f28812m;
            if (str28 != null && zArr[7]) {
                i18 += b36.f.j(7, str28);
            }
            java.lang.String str29 = this.f28813n;
            if (str29 != null && zArr[8]) {
                i18 += b36.f.j(8, str29);
            }
            java.lang.String str30 = this.f28814o;
            if (str30 != null && zArr[9]) {
                i18 += b36.f.j(9, str30);
            }
            java.lang.String str31 = this.f28815p;
            if (str31 != null && zArr[10]) {
                i18 += b36.f.j(10, str31);
            }
            java.lang.String str32 = this.f28816q;
            if (str32 != null && zArr[11]) {
                i18 += b36.f.j(11, str32);
            }
            if (zArr[12]) {
                i18 += b36.f.h(12, this.f28817r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f28818s);
            }
            java.lang.String str33 = this.f28819t;
            if (str33 != null && zArr[14]) {
                i18 += b36.f.j(14, str33);
            }
            java.lang.String str34 = this.f28820u;
            if (str34 != null && zArr[15]) {
                i18 += b36.f.j(15, str34);
            }
            java.lang.String str35 = this.f28821v;
            if (str35 != null && zArr[16]) {
                i18 += b36.f.j(16, str35);
            }
            if (zArr[17]) {
                i18 += b36.f.a(17, this.f28822w);
            }
            java.lang.String str36 = this.f28823x;
            if (str36 != null && zArr[18]) {
                i18 += b36.f.j(18, str36);
            }
            java.lang.String str37 = this.f28824y;
            if (str37 != null && zArr[19]) {
                i18 += b36.f.j(19, str37);
            }
            if (zArr[20]) {
                i18 += b36.f.e(20, this.f28825z);
            }
            java.lang.String str38 = this.A;
            if (str38 != null && zArr[21]) {
                i18 += b36.f.j(21, str38);
            }
            java.lang.String str39 = this.B;
            if (str39 != null && zArr[22]) {
                i18 += b36.f.j(22, str39);
            }
            java.lang.String str40 = this.C;
            if (str40 != null && zArr[23]) {
                i18 += b36.f.j(23, str40);
            }
            java.lang.String str41 = this.D;
            if (str41 != null && zArr[24]) {
                i18 += b36.f.j(24, str41);
            }
            java.lang.String str42 = this.E;
            if (str42 != null && zArr[25]) {
                i18 += b36.f.j(25, str42);
            }
            if (zArr[27]) {
                i18 += b36.f.h(27, this.F);
            }
            return zArr[28] ? i18 + b36.f.e(28, this.G) : i18;
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
                this.f28806d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28807e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28808f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28809g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28810h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28811i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f28812m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f28813n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f28814o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f28815p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f28816q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f28817r = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f28818s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f28819t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f28820u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f28821v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f28822w = aVar2.c(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f28823x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f28824y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f28825z = aVar2.g(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.k(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.k(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.k(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.k(intValue);
                zArr[25] = true;
                return 0;
            case 26:
            default:
                return -1;
            case 27:
                this.F = aVar2.i(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.G = aVar2.g(intValue);
                zArr[28] = true;
                return 0;
        }
    }
}
