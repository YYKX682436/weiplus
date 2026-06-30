package bw5;

/* loaded from: classes11.dex */
public class z90 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public long C;
    public long D;
    public long E;
    public bw5.nb0 F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f35880J;
    public java.lang.String K;
    public long L;
    public boolean M;
    public int N;
    public long P;
    public long Q;
    public bw5.u90 R;
    public bw5.y90 T;
    public boolean U;
    public java.lang.String V;
    public java.lang.String W;
    public java.lang.String X;
    public bw5.x90 Y;
    public boolean Z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35881d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35882e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35883f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f35884g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f35885h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f35886i;

    /* renamed from: l1, reason: collision with root package name */
    public bw5.r90 f35887l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f35888m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f35889n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f35890o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f35891p;

    /* renamed from: p0, reason: collision with root package name */
    public bw5.s90 f35892p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f35893p1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f35894q;

    /* renamed from: r, reason: collision with root package name */
    public long f35895r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f35896s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f35897t;

    /* renamed from: u, reason: collision with root package name */
    public int f35898u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f35899v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f35900w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f35901x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f35902x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f35904y;

    /* renamed from: y0, reason: collision with root package name */
    public bw5.v90 f35905y0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f35906z;
    public final java.util.LinkedList B = new java.util.LinkedList();
    public final java.util.LinkedList S = new java.util.LinkedList();

    /* renamed from: x1, reason: collision with root package name */
    public final boolean[] f35903x1 = new boolean[81];

    static {
        new bw5.z90();
    }

    public bw5.z90 A(java.lang.String str) {
        this.f35900w = str;
        this.f35903x1[17] = true;
        return this;
    }

    public bw5.z90 B(java.lang.String str) {
        this.f35885h = str;
        this.f35903x1[5] = true;
        return this;
    }

    public bw5.z90 C(java.lang.String str) {
        this.f35882e = str;
        this.f35903x1[2] = true;
        return this;
    }

    public bw5.z90 E(java.lang.String str) {
        this.f35881d = str;
        this.f35903x1[1] = true;
        return this;
    }

    public java.lang.String b() {
        return this.f35903x1[8] ? this.f35889n : "";
    }

    public java.lang.String c() {
        return this.f35903x1[9] ? this.f35890o : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z90)) {
            return false;
        }
        bw5.z90 z90Var = (bw5.z90) fVar;
        return n51.f.a(this.f35881d, z90Var.f35881d) && n51.f.a(this.f35882e, z90Var.f35882e) && n51.f.a(this.f35883f, z90Var.f35883f) && n51.f.a(this.f35884g, z90Var.f35884g) && n51.f.a(this.f35885h, z90Var.f35885h) && n51.f.a(this.f35886i, z90Var.f35886i) && n51.f.a(this.f35888m, z90Var.f35888m) && n51.f.a(this.f35889n, z90Var.f35889n) && n51.f.a(this.f35890o, z90Var.f35890o) && n51.f.a(this.f35891p, z90Var.f35891p) && n51.f.a(this.f35894q, z90Var.f35894q) && n51.f.a(java.lang.Long.valueOf(this.f35895r), java.lang.Long.valueOf(z90Var.f35895r)) && n51.f.a(this.f35896s, z90Var.f35896s) && n51.f.a(this.f35897t, z90Var.f35897t) && n51.f.a(java.lang.Integer.valueOf(this.f35898u), java.lang.Integer.valueOf(z90Var.f35898u)) && n51.f.a(this.f35899v, z90Var.f35899v) && n51.f.a(this.f35900w, z90Var.f35900w) && n51.f.a(java.lang.Boolean.valueOf(this.f35901x), java.lang.Boolean.valueOf(z90Var.f35901x)) && n51.f.a(java.lang.Boolean.valueOf(this.f35904y), java.lang.Boolean.valueOf(z90Var.f35904y)) && n51.f.a(this.f35906z, z90Var.f35906z) && n51.f.a(this.A, z90Var.A) && n51.f.a(this.B, z90Var.B) && n51.f.a(java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(z90Var.C)) && n51.f.a(java.lang.Long.valueOf(this.D), java.lang.Long.valueOf(z90Var.D)) && n51.f.a(java.lang.Long.valueOf(this.E), java.lang.Long.valueOf(z90Var.E)) && n51.f.a(this.F, z90Var.F) && n51.f.a(this.G, z90Var.G) && n51.f.a(this.H, z90Var.H) && n51.f.a(this.I, z90Var.I) && n51.f.a(java.lang.Integer.valueOf(this.f35880J), java.lang.Integer.valueOf(z90Var.f35880J)) && n51.f.a(this.K, z90Var.K) && n51.f.a(java.lang.Long.valueOf(this.L), java.lang.Long.valueOf(z90Var.L)) && n51.f.a(java.lang.Boolean.valueOf(this.M), java.lang.Boolean.valueOf(z90Var.M)) && n51.f.a(java.lang.Integer.valueOf(this.N), java.lang.Integer.valueOf(z90Var.N)) && n51.f.a(java.lang.Long.valueOf(this.P), java.lang.Long.valueOf(z90Var.P)) && n51.f.a(java.lang.Long.valueOf(this.Q), java.lang.Long.valueOf(z90Var.Q)) && n51.f.a(this.R, z90Var.R) && n51.f.a(this.S, z90Var.S) && n51.f.a(this.T, z90Var.T) && n51.f.a(java.lang.Boolean.valueOf(this.U), java.lang.Boolean.valueOf(z90Var.U)) && n51.f.a(this.V, z90Var.V) && n51.f.a(this.W, z90Var.W) && n51.f.a(this.X, z90Var.X) && n51.f.a(this.Y, z90Var.Y) && n51.f.a(java.lang.Boolean.valueOf(this.Z), java.lang.Boolean.valueOf(z90Var.Z)) && n51.f.a(this.f35892p0, z90Var.f35892p0) && n51.f.a(java.lang.Boolean.valueOf(this.f35902x0), java.lang.Boolean.valueOf(z90Var.f35902x0)) && n51.f.a(this.f35905y0, z90Var.f35905y0) && n51.f.a(this.f35887l1, z90Var.f35887l1) && n51.f.a(java.lang.Boolean.valueOf(this.f35893p1), java.lang.Boolean.valueOf(z90Var.f35893p1));
    }

    public java.lang.String d() {
        return this.f35903x1[13] ? this.f35896s : "";
    }

    public java.lang.String e() {
        return this.f35903x1[10] ? this.f35891p : "";
    }

    public java.lang.String f() {
        return this.f35903x1[14] ? this.f35897t : "";
    }

    public java.lang.String g() {
        return this.f35903x1[7] ? this.f35888m : "";
    }

    public java.lang.String i() {
        return this.f35903x1[3] ? this.f35883f : "";
    }

    public java.lang.String j() {
        return this.f35903x1[17] ? this.f35900w : "";
    }

    public java.lang.String k() {
        return this.f35903x1[5] ? this.f35885h : "";
    }

    public java.lang.String l() {
        return this.f35903x1[2] ? this.f35882e : "";
    }

    public bw5.nb0 n() {
        return this.f35903x1[30] ? this.F : new bw5.nb0();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.z90();
    }

    public java.lang.String o() {
        return this.f35903x1[1] ? this.f35881d : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35903x1;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35881d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f35882e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f35883f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f35884g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f35885h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f35886i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f35888m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f35889n;
            if (str8 != null && zArr[8]) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f35890o;
            if (str9 != null && zArr[9]) {
                fVar.j(9, str9);
            }
            java.lang.String str10 = this.f35891p;
            if (str10 != null && zArr[10]) {
                fVar.j(10, str10);
            }
            java.lang.String str11 = this.f35894q;
            if (str11 != null && zArr[11]) {
                fVar.j(11, str11);
            }
            if (zArr[12]) {
                fVar.h(12, this.f35895r);
            }
            java.lang.String str12 = this.f35896s;
            if (str12 != null && zArr[13]) {
                fVar.j(13, str12);
            }
            java.lang.String str13 = this.f35897t;
            if (str13 != null && zArr[14]) {
                fVar.j(14, str13);
            }
            if (zArr[15]) {
                fVar.f(15, this.f35898u);
            }
            java.lang.String str14 = this.f35899v;
            if (str14 != null && zArr[16]) {
                fVar.j(16, str14);
            }
            java.lang.String str15 = this.f35900w;
            if (str15 != null && zArr[17]) {
                fVar.j(17, str15);
            }
            if (zArr[18]) {
                fVar.a(18, this.f35901x);
            }
            if (zArr[19]) {
                fVar.a(19, this.f35904y);
            }
            java.lang.String str16 = this.f35906z;
            if (str16 != null && zArr[20]) {
                fVar.j(20, str16);
            }
            java.lang.String str17 = this.A;
            if (str17 != null && zArr[21]) {
                fVar.j(21, str17);
            }
            fVar.g(22, 8, this.B);
            if (zArr[23]) {
                fVar.h(23, this.C);
            }
            if (zArr[26]) {
                fVar.h(26, this.D);
            }
            if (zArr[29]) {
                fVar.h(29, this.E);
            }
            bw5.nb0 nb0Var = this.F;
            if (nb0Var != null && zArr[30]) {
                fVar.i(30, nb0Var.computeSize());
                this.F.writeFields(fVar);
            }
            java.lang.String str18 = this.G;
            if (str18 != null && zArr[31]) {
                fVar.j(31, str18);
            }
            java.lang.String str19 = this.H;
            if (str19 != null && zArr[32]) {
                fVar.j(32, str19);
            }
            java.lang.String str20 = this.I;
            if (str20 != null && zArr[40]) {
                fVar.j(40, str20);
            }
            if (zArr[41]) {
                fVar.f(41, this.f35880J);
            }
            java.lang.String str21 = this.K;
            if (str21 != null && zArr[42]) {
                fVar.j(42, str21);
            }
            if (zArr[45]) {
                fVar.h(45, this.L);
            }
            if (zArr[52]) {
                fVar.a(52, this.M);
            }
            if (zArr[55]) {
                fVar.f(55, this.N);
            }
            if (zArr[57]) {
                fVar.h(57, this.P);
            }
            if (zArr[58]) {
                fVar.h(58, this.Q);
            }
            bw5.u90 u90Var = this.R;
            if (u90Var != null && zArr[62]) {
                fVar.i(62, u90Var.computeSize());
                this.R.writeFields(fVar);
            }
            fVar.g(63, 8, this.S);
            bw5.y90 y90Var = this.T;
            if (y90Var != null && zArr[66]) {
                fVar.i(66, y90Var.computeSize());
                this.T.writeFields(fVar);
            }
            if (zArr[67]) {
                fVar.a(67, this.U);
            }
            java.lang.String str22 = this.V;
            if (str22 != null && zArr[68]) {
                fVar.j(68, str22);
            }
            java.lang.String str23 = this.W;
            if (str23 != null && zArr[69]) {
                fVar.j(69, str23);
            }
            java.lang.String str24 = this.X;
            if (str24 != null && zArr[70]) {
                fVar.j(70, str24);
            }
            bw5.x90 x90Var = this.Y;
            if (x90Var != null && zArr[71]) {
                fVar.i(71, x90Var.computeSize());
                this.Y.writeFields(fVar);
            }
            if (zArr[75]) {
                fVar.a(75, this.Z);
            }
            bw5.s90 s90Var = this.f35892p0;
            if (s90Var != null && zArr[76]) {
                fVar.i(76, s90Var.computeSize());
                this.f35892p0.writeFields(fVar);
            }
            if (zArr[77]) {
                fVar.a(77, this.f35902x0);
            }
            bw5.v90 v90Var = this.f35905y0;
            if (v90Var != null && zArr[78]) {
                fVar.i(78, v90Var.computeSize());
                this.f35905y0.writeFields(fVar);
            }
            bw5.r90 r90Var = this.f35887l1;
            if (r90Var != null && zArr[79]) {
                fVar.i(79, r90Var.computeSize());
                this.f35887l1.writeFields(fVar);
            }
            if (zArr[80]) {
                fVar.a(80, this.f35893p1);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str25 = this.f35881d;
            if (str25 != null && zArr[1]) {
                i18 = b36.f.j(1, str25) + 0;
            }
            java.lang.String str26 = this.f35882e;
            if (str26 != null && zArr[2]) {
                i18 += b36.f.j(2, str26);
            }
            java.lang.String str27 = this.f35883f;
            if (str27 != null && zArr[3]) {
                i18 += b36.f.j(3, str27);
            }
            java.lang.String str28 = this.f35884g;
            if (str28 != null && zArr[4]) {
                i18 += b36.f.j(4, str28);
            }
            java.lang.String str29 = this.f35885h;
            if (str29 != null && zArr[5]) {
                i18 += b36.f.j(5, str29);
            }
            java.lang.String str30 = this.f35886i;
            if (str30 != null && zArr[6]) {
                i18 += b36.f.j(6, str30);
            }
            java.lang.String str31 = this.f35888m;
            if (str31 != null && zArr[7]) {
                i18 += b36.f.j(7, str31);
            }
            java.lang.String str32 = this.f35889n;
            if (str32 != null && zArr[8]) {
                i18 += b36.f.j(8, str32);
            }
            java.lang.String str33 = this.f35890o;
            if (str33 != null && zArr[9]) {
                i18 += b36.f.j(9, str33);
            }
            java.lang.String str34 = this.f35891p;
            if (str34 != null && zArr[10]) {
                i18 += b36.f.j(10, str34);
            }
            java.lang.String str35 = this.f35894q;
            if (str35 != null && zArr[11]) {
                i18 += b36.f.j(11, str35);
            }
            if (zArr[12]) {
                i18 += b36.f.h(12, this.f35895r);
            }
            java.lang.String str36 = this.f35896s;
            if (str36 != null && zArr[13]) {
                i18 += b36.f.j(13, str36);
            }
            java.lang.String str37 = this.f35897t;
            if (str37 != null && zArr[14]) {
                i18 += b36.f.j(14, str37);
            }
            if (zArr[15]) {
                i18 += b36.f.f(15, this.f35898u);
            }
            java.lang.String str38 = this.f35899v;
            if (str38 != null && zArr[16]) {
                i18 += b36.f.j(16, str38);
            }
            java.lang.String str39 = this.f35900w;
            if (str39 != null && zArr[17]) {
                i18 += b36.f.j(17, str39);
            }
            if (zArr[18]) {
                i18 += b36.f.a(18, this.f35901x);
            }
            if (zArr[19]) {
                i18 += b36.f.a(19, this.f35904y);
            }
            java.lang.String str40 = this.f35906z;
            if (str40 != null && zArr[20]) {
                i18 += b36.f.j(20, str40);
            }
            java.lang.String str41 = this.A;
            if (str41 != null && zArr[21]) {
                i18 += b36.f.j(21, str41);
            }
            int g17 = i18 + b36.f.g(22, 8, this.B);
            if (zArr[23]) {
                g17 += b36.f.h(23, this.C);
            }
            if (zArr[26]) {
                g17 += b36.f.h(26, this.D);
            }
            if (zArr[29]) {
                g17 += b36.f.h(29, this.E);
            }
            bw5.nb0 nb0Var2 = this.F;
            if (nb0Var2 != null && zArr[30]) {
                g17 += b36.f.i(30, nb0Var2.computeSize());
            }
            java.lang.String str42 = this.G;
            if (str42 != null && zArr[31]) {
                g17 += b36.f.j(31, str42);
            }
            java.lang.String str43 = this.H;
            if (str43 != null && zArr[32]) {
                g17 += b36.f.j(32, str43);
            }
            java.lang.String str44 = this.I;
            if (str44 != null && zArr[40]) {
                g17 += b36.f.j(40, str44);
            }
            if (zArr[41]) {
                g17 += b36.f.f(41, this.f35880J);
            }
            java.lang.String str45 = this.K;
            if (str45 != null && zArr[42]) {
                g17 += b36.f.j(42, str45);
            }
            if (zArr[45]) {
                g17 += b36.f.h(45, this.L);
            }
            if (zArr[52]) {
                g17 += b36.f.a(52, this.M);
            }
            if (zArr[55]) {
                g17 += b36.f.f(55, this.N);
            }
            if (zArr[57]) {
                g17 += b36.f.h(57, this.P);
            }
            if (zArr[58]) {
                g17 += b36.f.h(58, this.Q);
            }
            bw5.u90 u90Var2 = this.R;
            if (u90Var2 != null && zArr[62]) {
                g17 += b36.f.i(62, u90Var2.computeSize());
            }
            int g18 = g17 + b36.f.g(63, 8, this.S);
            bw5.y90 y90Var2 = this.T;
            if (y90Var2 != null && zArr[66]) {
                g18 += b36.f.i(66, y90Var2.computeSize());
            }
            if (zArr[67]) {
                g18 += b36.f.a(67, this.U);
            }
            java.lang.String str46 = this.V;
            if (str46 != null && zArr[68]) {
                g18 += b36.f.j(68, str46);
            }
            java.lang.String str47 = this.W;
            if (str47 != null && zArr[69]) {
                g18 += b36.f.j(69, str47);
            }
            java.lang.String str48 = this.X;
            if (str48 != null && zArr[70]) {
                g18 += b36.f.j(70, str48);
            }
            bw5.x90 x90Var2 = this.Y;
            if (x90Var2 != null && zArr[71]) {
                g18 += b36.f.i(71, x90Var2.computeSize());
            }
            if (zArr[75]) {
                g18 += b36.f.a(75, this.Z);
            }
            bw5.s90 s90Var2 = this.f35892p0;
            if (s90Var2 != null && zArr[76]) {
                g18 += b36.f.i(76, s90Var2.computeSize());
            }
            if (zArr[77]) {
                g18 += b36.f.a(77, this.f35902x0);
            }
            bw5.v90 v90Var2 = this.f35905y0;
            if (v90Var2 != null && zArr[78]) {
                g18 += b36.f.i(78, v90Var2.computeSize());
            }
            bw5.r90 r90Var2 = this.f35887l1;
            if (r90Var2 != null && zArr[79]) {
                g18 += b36.f.i(79, r90Var2.computeSize());
            }
            return zArr[80] ? g18 + b36.f.a(80, this.f35893p1) : g18;
        }
        if (i17 == 2) {
            this.B.clear();
            this.S.clear();
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
        if (intValue == 26) {
            this.D = aVar2.i(intValue);
            zArr[26] = true;
            return 0;
        }
        if (intValue == 45) {
            this.L = aVar2.i(intValue);
            zArr[45] = true;
            return 0;
        }
        if (intValue == 52) {
            this.M = aVar2.c(intValue);
            zArr[52] = true;
            return 0;
        }
        if (intValue == 55) {
            this.N = aVar2.h(intValue);
            zArr[55] = true;
            return 0;
        }
        if (intValue == 57) {
            this.P = aVar2.i(intValue);
            zArr[57] = true;
            return 0;
        }
        if (intValue == 58) {
            this.Q = aVar2.i(intValue);
            zArr[58] = true;
            return 0;
        }
        if (intValue == 62) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.u90 u90Var3 = new bw5.u90();
                if (bArr != null && bArr.length > 0) {
                    u90Var3.parseFrom(bArr);
                }
                this.R = u90Var3;
            }
            zArr[62] = true;
            return 0;
        }
        if (intValue == 63) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.t90 t90Var = new bw5.t90();
                if (bArr2 != null && bArr2.length > 0) {
                    t90Var.parseFrom(bArr2);
                }
                this.S.add(t90Var);
            }
            zArr[63] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f35881d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35882e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35883f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35884g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35885h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35886i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f35888m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f35889n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f35890o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f35891p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f35894q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f35895r = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f35896s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f35897t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f35898u = aVar2.h(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f35899v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f35900w = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f35901x = aVar2.c(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f35904y = aVar2.c(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f35906z = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.ob0 ob0Var = new bw5.ob0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ob0Var.parseFrom(bArr3);
                    }
                    this.B.add(ob0Var);
                }
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.i(intValue);
                zArr[23] = true;
                return 0;
            default:
                switch (intValue) {
                    case 29:
                        this.E = aVar2.i(intValue);
                        zArr[29] = true;
                        return 0;
                    case 30:
                        java.util.LinkedList j27 = aVar2.j(intValue);
                        int size4 = j27.size();
                        for (int i29 = 0; i29 < size4; i29++) {
                            byte[] bArr4 = (byte[]) j27.get(i29);
                            bw5.nb0 nb0Var3 = new bw5.nb0();
                            if (bArr4 != null && bArr4.length > 0) {
                                nb0Var3.parseFrom(bArr4);
                            }
                            this.F = nb0Var3;
                        }
                        zArr[30] = true;
                        return 0;
                    case 31:
                        this.G = aVar2.k(intValue);
                        zArr[31] = true;
                        return 0;
                    case 32:
                        this.H = aVar2.k(intValue);
                        zArr[32] = true;
                        return 0;
                    default:
                        switch (intValue) {
                            case 40:
                                this.I = aVar2.k(intValue);
                                zArr[40] = true;
                                return 0;
                            case 41:
                                this.f35880J = aVar2.h(intValue);
                                zArr[41] = true;
                                return 0;
                            case 42:
                                this.K = aVar2.k(intValue);
                                zArr[42] = true;
                                return 0;
                            default:
                                switch (intValue) {
                                    case 66:
                                        java.util.LinkedList j28 = aVar2.j(intValue);
                                        int size5 = j28.size();
                                        for (int i37 = 0; i37 < size5; i37++) {
                                            byte[] bArr5 = (byte[]) j28.get(i37);
                                            bw5.y90 y90Var3 = new bw5.y90();
                                            if (bArr5 != null && bArr5.length > 0) {
                                                y90Var3.parseFrom(bArr5);
                                            }
                                            this.T = y90Var3;
                                        }
                                        zArr[66] = true;
                                        return 0;
                                    case 67:
                                        this.U = aVar2.c(intValue);
                                        zArr[67] = true;
                                        return 0;
                                    case 68:
                                        this.V = aVar2.k(intValue);
                                        zArr[68] = true;
                                        return 0;
                                    case 69:
                                        this.W = aVar2.k(intValue);
                                        zArr[69] = true;
                                        return 0;
                                    case 70:
                                        this.X = aVar2.k(intValue);
                                        zArr[70] = true;
                                        return 0;
                                    case 71:
                                        java.util.LinkedList j29 = aVar2.j(intValue);
                                        int size6 = j29.size();
                                        for (int i38 = 0; i38 < size6; i38++) {
                                            byte[] bArr6 = (byte[]) j29.get(i38);
                                            bw5.x90 x90Var3 = new bw5.x90();
                                            if (bArr6 != null && bArr6.length > 0) {
                                                x90Var3.parseFrom(bArr6);
                                            }
                                            this.Y = x90Var3;
                                        }
                                        zArr[71] = true;
                                        return 0;
                                    default:
                                        switch (intValue) {
                                            case 75:
                                                this.Z = aVar2.c(intValue);
                                                zArr[75] = true;
                                                return 0;
                                            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                                                java.util.LinkedList j37 = aVar2.j(intValue);
                                                int size7 = j37.size();
                                                for (int i39 = 0; i39 < size7; i39++) {
                                                    byte[] bArr7 = (byte[]) j37.get(i39);
                                                    bw5.s90 s90Var3 = new bw5.s90();
                                                    if (bArr7 != null && bArr7.length > 0) {
                                                        s90Var3.parseFrom(bArr7);
                                                    }
                                                    this.f35892p0 = s90Var3;
                                                }
                                                zArr[76] = true;
                                                return 0;
                                            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_MAIN /* 77 */:
                                                this.f35902x0 = aVar2.c(intValue);
                                                zArr[77] = true;
                                                return 0;
                                            case qc1.u.CTRL_INDEX /* 78 */:
                                                java.util.LinkedList j38 = aVar2.j(intValue);
                                                int size8 = j38.size();
                                                for (int i47 = 0; i47 < size8; i47++) {
                                                    byte[] bArr8 = (byte[]) j38.get(i47);
                                                    bw5.v90 v90Var3 = new bw5.v90();
                                                    if (bArr8 != null && bArr8.length > 0) {
                                                        v90Var3.parseFrom(bArr8);
                                                    }
                                                    this.f35905y0 = v90Var3;
                                                }
                                                zArr[78] = true;
                                                return 0;
                                            case 79:
                                                java.util.LinkedList j39 = aVar2.j(intValue);
                                                int size9 = j39.size();
                                                for (int i48 = 0; i48 < size9; i48++) {
                                                    byte[] bArr9 = (byte[]) j39.get(i48);
                                                    bw5.r90 r90Var3 = new bw5.r90();
                                                    if (bArr9 != null && bArr9.length > 0) {
                                                        r90Var3.parseFrom(bArr9);
                                                    }
                                                    this.f35887l1 = r90Var3;
                                                }
                                                zArr[79] = true;
                                                return 0;
                                            case 80:
                                                this.f35893p1 = aVar2.c(intValue);
                                                zArr[80] = true;
                                                return 0;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public bw5.z90 parseFrom(byte[] bArr) {
        return (bw5.z90) super.parseFrom(bArr);
    }

    public bw5.z90 q(java.lang.String str) {
        this.f35889n = str;
        this.f35903x1[8] = true;
        return this;
    }

    public bw5.z90 r(java.lang.String str) {
        this.f35890o = str;
        this.f35903x1[9] = true;
        return this;
    }

    public bw5.z90 s(int i17) {
        this.f35898u = i17;
        this.f35903x1[15] = true;
        return this;
    }

    public bw5.z90 t(java.lang.String str) {
        this.f35896s = str;
        this.f35903x1[13] = true;
        return this;
    }

    public bw5.z90 u(java.lang.String str) {
        this.f35891p = str;
        this.f35903x1[10] = true;
        return this;
    }

    public bw5.z90 w(java.lang.String str) {
        this.f35897t = str;
        this.f35903x1[14] = true;
        return this;
    }

    public bw5.z90 x(java.lang.String str) {
        this.f35888m = str;
        this.f35903x1[7] = true;
        return this;
    }

    public bw5.z90 y(java.lang.String str) {
        this.f35884g = str;
        this.f35903x1[4] = true;
        return this;
    }

    public bw5.z90 z(java.lang.String str) {
        this.f35883f = str;
        this.f35903x1[3] = true;
        return this;
    }
}
