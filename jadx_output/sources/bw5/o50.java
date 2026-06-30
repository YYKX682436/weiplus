package bw5;

/* loaded from: classes2.dex */
public class o50 extends com.tencent.mm.protobuf.f {
    public static final bw5.o50 M1 = new bw5.o50();
    public boolean A;
    public bw5.mb0 A1;
    public int B;
    public bw5.e80 B1;
    public java.lang.String C;
    public bw5.ca0 C1;
    public bw5.b90 D1;
    public bw5.ob0 E;
    public bw5.t50 E1;
    public bw5.mb0 F1;
    public bw5.g60 G;
    public bw5.mb0 G1;
    public boolean H;
    public bw5.k50 H1;
    public java.lang.String I;
    public bw5.n50 I1;

    /* renamed from: J, reason: collision with root package name */
    public int f30955J;
    public bw5.m50 J1;
    public boolean K;
    public int K1;
    public boolean L;
    public long M;
    public boolean N;
    public int P;
    public java.lang.String Q;
    public boolean R;
    public int S;
    public bw5.xa0 T;
    public boolean U;
    public long V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public bw5.p50 Z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30956d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30957e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30958f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30960h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30961i;

    /* renamed from: l1, reason: collision with root package name */
    public bw5.xa0 f30962l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30963m;

    /* renamed from: n, reason: collision with root package name */
    public int f30964n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f30965o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30966p;

    /* renamed from: p1, reason: collision with root package name */
    public int f30968p1;

    /* renamed from: q, reason: collision with root package name */
    public int f30969q;

    /* renamed from: r, reason: collision with root package name */
    public int f30970r;

    /* renamed from: s, reason: collision with root package name */
    public int f30971s;

    /* renamed from: t, reason: collision with root package name */
    public int f30972t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f30973u;

    /* renamed from: v, reason: collision with root package name */
    public long f30974v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f30975w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f30976x;

    /* renamed from: x0, reason: collision with root package name */
    public bw5.mb0 f30977x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f30978x1;

    /* renamed from: y, reason: collision with root package name */
    public bw5.xa0 f30979y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f30980y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f30981y1;

    /* renamed from: z, reason: collision with root package name */
    public bw5.mc0 f30982z;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f30983z1;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f30959g = new java.util.LinkedList();
    public final java.util.LinkedList D = new java.util.LinkedList();
    public final java.util.LinkedList F = new java.util.LinkedList();

    /* renamed from: p0, reason: collision with root package name */
    public final java.util.LinkedList f30967p0 = new java.util.LinkedList();
    public final boolean[] L1 = new boolean[65];

    public bw5.mc0 b() {
        return this.L1[20] ? this.f30982z : new bw5.mc0();
    }

    public java.lang.String c() {
        return this.L1[1] ? this.f30956d : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o50)) {
            return false;
        }
        bw5.o50 o50Var = (bw5.o50) fVar;
        return n51.f.a(this.f30956d, o50Var.f30956d) && n51.f.a(this.f30957e, o50Var.f30957e) && n51.f.a(this.f30958f, o50Var.f30958f) && n51.f.a(this.f30959g, o50Var.f30959g) && n51.f.a(this.f30960h, o50Var.f30960h) && n51.f.a(this.f30961i, o50Var.f30961i) && n51.f.a(this.f30963m, o50Var.f30963m) && n51.f.a(java.lang.Integer.valueOf(this.f30964n), java.lang.Integer.valueOf(o50Var.f30964n)) && n51.f.a(this.f30965o, o50Var.f30965o) && n51.f.a(java.lang.Boolean.valueOf(this.f30966p), java.lang.Boolean.valueOf(o50Var.f30966p)) && n51.f.a(java.lang.Integer.valueOf(this.f30969q), java.lang.Integer.valueOf(o50Var.f30969q)) && n51.f.a(java.lang.Integer.valueOf(this.f30970r), java.lang.Integer.valueOf(o50Var.f30970r)) && n51.f.a(java.lang.Integer.valueOf(this.f30971s), java.lang.Integer.valueOf(o50Var.f30971s)) && n51.f.a(java.lang.Integer.valueOf(this.f30972t), java.lang.Integer.valueOf(o50Var.f30972t)) && n51.f.a(java.lang.Boolean.valueOf(this.f30973u), java.lang.Boolean.valueOf(o50Var.f30973u)) && n51.f.a(java.lang.Long.valueOf(this.f30974v), java.lang.Long.valueOf(o50Var.f30974v)) && n51.f.a(this.f30975w, o50Var.f30975w) && n51.f.a(this.f30976x, o50Var.f30976x) && n51.f.a(this.f30979y, o50Var.f30979y) && n51.f.a(this.f30982z, o50Var.f30982z) && n51.f.a(java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(o50Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(o50Var.B)) && n51.f.a(this.C, o50Var.C) && n51.f.a(this.D, o50Var.D) && n51.f.a(this.E, o50Var.E) && n51.f.a(this.F, o50Var.F) && n51.f.a(this.G, o50Var.G) && n51.f.a(java.lang.Boolean.valueOf(this.H), java.lang.Boolean.valueOf(o50Var.H)) && n51.f.a(this.I, o50Var.I) && n51.f.a(java.lang.Integer.valueOf(this.f30955J), java.lang.Integer.valueOf(o50Var.f30955J)) && n51.f.a(java.lang.Boolean.valueOf(this.K), java.lang.Boolean.valueOf(o50Var.K)) && n51.f.a(java.lang.Boolean.valueOf(this.L), java.lang.Boolean.valueOf(o50Var.L)) && n51.f.a(java.lang.Long.valueOf(this.M), java.lang.Long.valueOf(o50Var.M)) && n51.f.a(java.lang.Boolean.valueOf(this.N), java.lang.Boolean.valueOf(o50Var.N)) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(o50Var.P)) && n51.f.a(this.Q, o50Var.Q) && n51.f.a(java.lang.Boolean.valueOf(this.R), java.lang.Boolean.valueOf(o50Var.R)) && n51.f.a(java.lang.Integer.valueOf(this.S), java.lang.Integer.valueOf(o50Var.S)) && n51.f.a(this.T, o50Var.T) && n51.f.a(java.lang.Boolean.valueOf(this.U), java.lang.Boolean.valueOf(o50Var.U)) && n51.f.a(java.lang.Long.valueOf(this.V), java.lang.Long.valueOf(o50Var.V)) && n51.f.a(java.lang.Boolean.valueOf(this.W), java.lang.Boolean.valueOf(o50Var.W)) && n51.f.a(java.lang.Boolean.valueOf(this.X), java.lang.Boolean.valueOf(o50Var.X)) && n51.f.a(java.lang.Boolean.valueOf(this.Y), java.lang.Boolean.valueOf(o50Var.Y)) && n51.f.a(this.Z, o50Var.Z) && n51.f.a(this.f30967p0, o50Var.f30967p0) && n51.f.a(this.f30977x0, o50Var.f30977x0) && n51.f.a(java.lang.Boolean.valueOf(this.f30980y0), java.lang.Boolean.valueOf(o50Var.f30980y0)) && n51.f.a(this.f30962l1, o50Var.f30962l1) && n51.f.a(java.lang.Integer.valueOf(this.f30968p1), java.lang.Integer.valueOf(o50Var.f30968p1)) && n51.f.a(java.lang.Boolean.valueOf(this.f30978x1), java.lang.Boolean.valueOf(o50Var.f30978x1)) && n51.f.a(java.lang.Boolean.valueOf(this.f30981y1), java.lang.Boolean.valueOf(o50Var.f30981y1)) && n51.f.a(this.f30983z1, o50Var.f30983z1) && n51.f.a(this.A1, o50Var.A1) && n51.f.a(this.B1, o50Var.B1) && n51.f.a(this.C1, o50Var.C1) && n51.f.a(this.D1, o50Var.D1) && n51.f.a(this.E1, o50Var.E1) && n51.f.a(this.F1, o50Var.F1) && n51.f.a(this.G1, o50Var.G1) && n51.f.a(this.H1, o50Var.H1) && n51.f.a(this.I1, o50Var.I1) && n51.f.a(this.J1, o50Var.J1) && n51.f.a(java.lang.Integer.valueOf(this.K1), java.lang.Integer.valueOf(o50Var.K1));
    }

    public java.lang.String d() {
        return this.L1[5] ? this.f30960h : "";
    }

    public bw5.g60 e() {
        return this.L1[27] ? this.G : new bw5.g60();
    }

    public bw5.xa0 f() {
        return this.L1[19] ? this.f30979y : new bw5.xa0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public bw5.o50 parseFrom(byte[] bArr) {
        return (bw5.o50) super.parseFrom(bArr);
    }

    public java.lang.String getName() {
        return this.L1[2] ? this.f30957e : "";
    }

    public java.lang.String getUrl() {
        return this.L1[3] ? this.f30958f : "";
    }

    public bw5.o50 i(java.lang.String str) {
        this.f30956d = str;
        this.L1[1] = true;
        return this;
    }

    public bw5.o50 j(int i17) {
        this.S = i17;
        this.L1[38] = true;
        return this;
    }

    public bw5.o50 k(int i17) {
        this.f30964n = i17;
        this.L1[8] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.o50();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.L1;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30956d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f30957e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f30958f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            fVar.g(4, 8, this.f30959g);
            java.lang.String str4 = this.f30960h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f30961i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f30963m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            if (zArr[8]) {
                fVar.f(8, this.f30964n);
            }
            java.lang.String str7 = this.f30965o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            if (zArr[10]) {
                fVar.a(10, this.f30966p);
            }
            if (zArr[11]) {
                fVar.f(11, this.f30969q);
            }
            if (zArr[12]) {
                fVar.f(12, this.f30970r);
            }
            if (zArr[13]) {
                fVar.f(13, this.f30971s);
            }
            if (zArr[14]) {
                fVar.f(14, this.f30972t);
            }
            if (zArr[15]) {
                fVar.a(15, this.f30973u);
            }
            if (zArr[16]) {
                fVar.h(16, this.f30974v);
            }
            java.lang.String str8 = this.f30975w;
            if (str8 != null && zArr[17]) {
                fVar.j(17, str8);
            }
            java.lang.String str9 = this.f30976x;
            if (str9 != null && zArr[18]) {
                fVar.j(18, str9);
            }
            bw5.xa0 xa0Var = this.f30979y;
            if (xa0Var != null && zArr[19]) {
                fVar.i(19, xa0Var.computeSize());
                this.f30979y.writeFields(fVar);
            }
            bw5.mc0 mc0Var = this.f30982z;
            if (mc0Var != null && zArr[20]) {
                fVar.i(20, mc0Var.computeSize());
                this.f30982z.writeFields(fVar);
            }
            if (zArr[21]) {
                fVar.a(21, this.A);
            }
            if (zArr[22]) {
                fVar.f(22, this.B);
            }
            java.lang.String str10 = this.C;
            if (str10 != null && zArr[23]) {
                fVar.j(23, str10);
            }
            fVar.g(24, 8, this.D);
            bw5.ob0 ob0Var = this.E;
            if (ob0Var != null && zArr[25]) {
                fVar.i(25, ob0Var.computeSize());
                this.E.writeFields(fVar);
            }
            fVar.g(26, 1, this.F);
            bw5.g60 g60Var = this.G;
            if (g60Var != null && zArr[27]) {
                fVar.i(27, g60Var.computeSize());
                this.G.writeFields(fVar);
            }
            if (zArr[28]) {
                fVar.a(28, this.H);
            }
            java.lang.String str11 = this.I;
            if (str11 != null && zArr[29]) {
                fVar.j(29, str11);
            }
            if (zArr[30]) {
                fVar.f(30, this.f30955J);
            }
            if (zArr[31]) {
                fVar.a(31, this.K);
            }
            if (zArr[32]) {
                fVar.a(32, this.L);
            }
            if (zArr[33]) {
                fVar.h(33, this.M);
            }
            if (zArr[34]) {
                fVar.a(34, this.N);
            }
            if (zArr[35]) {
                fVar.f(35, this.P);
            }
            java.lang.String str12 = this.Q;
            if (str12 != null && zArr[36]) {
                fVar.j(36, str12);
            }
            if (zArr[37]) {
                fVar.a(37, this.R);
            }
            if (zArr[38]) {
                fVar.f(38, this.S);
            }
            bw5.xa0 xa0Var2 = this.T;
            if (xa0Var2 != null && zArr[39]) {
                fVar.i(39, xa0Var2.computeSize());
                this.T.writeFields(fVar);
            }
            if (zArr[40]) {
                fVar.a(40, this.U);
            }
            if (zArr[41]) {
                fVar.h(41, this.V);
            }
            if (zArr[42]) {
                fVar.a(42, this.W);
            }
            if (zArr[43]) {
                fVar.a(43, this.X);
            }
            if (zArr[44]) {
                fVar.a(44, this.Y);
            }
            bw5.p50 p50Var = this.Z;
            if (p50Var != null && zArr[45]) {
                fVar.i(45, p50Var.computeSize());
                this.Z.writeFields(fVar);
            }
            fVar.g(46, 8, this.f30967p0);
            bw5.mb0 mb0Var = this.f30977x0;
            if (mb0Var != null && zArr[47]) {
                fVar.i(47, mb0Var.computeSize());
                this.f30977x0.writeFields(fVar);
            }
            if (zArr[48]) {
                fVar.a(48, this.f30980y0);
            }
            bw5.xa0 xa0Var3 = this.f30962l1;
            if (xa0Var3 != null && zArr[49]) {
                fVar.i(49, xa0Var3.computeSize());
                this.f30962l1.writeFields(fVar);
            }
            if (zArr[50]) {
                fVar.f(50, this.f30968p1);
            }
            if (zArr[51]) {
                fVar.a(51, this.f30978x1);
            }
            if (zArr[52]) {
                fVar.a(52, this.f30981y1);
            }
            java.lang.String str13 = this.f30983z1;
            if (str13 != null && zArr[53]) {
                fVar.j(53, str13);
            }
            bw5.mb0 mb0Var2 = this.A1;
            if (mb0Var2 != null && zArr[54]) {
                fVar.i(54, mb0Var2.computeSize());
                this.A1.writeFields(fVar);
            }
            bw5.e80 e80Var = this.B1;
            if (e80Var != null && zArr[55]) {
                fVar.i(55, e80Var.computeSize());
                this.B1.writeFields(fVar);
            }
            bw5.ca0 ca0Var = this.C1;
            if (ca0Var != null && zArr[56]) {
                fVar.i(56, ca0Var.computeSize());
                this.C1.writeFields(fVar);
            }
            bw5.b90 b90Var = this.D1;
            if (b90Var != null && zArr[57]) {
                fVar.i(57, b90Var.computeSize());
                this.D1.writeFields(fVar);
            }
            bw5.t50 t50Var = this.E1;
            if (t50Var != null && zArr[58]) {
                fVar.i(58, t50Var.computeSize());
                this.E1.writeFields(fVar);
            }
            bw5.mb0 mb0Var3 = this.F1;
            if (mb0Var3 != null && zArr[59]) {
                fVar.i(59, mb0Var3.computeSize());
                this.F1.writeFields(fVar);
            }
            bw5.mb0 mb0Var4 = this.G1;
            if (mb0Var4 != null && zArr[60]) {
                fVar.i(60, mb0Var4.computeSize());
                this.G1.writeFields(fVar);
            }
            bw5.k50 k50Var = this.H1;
            if (k50Var != null && zArr[61]) {
                fVar.i(61, k50Var.computeSize());
                this.H1.writeFields(fVar);
            }
            bw5.n50 n50Var = this.I1;
            if (n50Var != null && zArr[62]) {
                fVar.i(62, n50Var.computeSize());
                this.I1.writeFields(fVar);
            }
            bw5.m50 m50Var = this.J1;
            if (m50Var != null && zArr[63]) {
                fVar.i(63, m50Var.computeSize());
                this.J1.writeFields(fVar);
            }
            if (zArr[64]) {
                fVar.f(64, this.K1);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str14 = this.f30956d;
            if (str14 != null && zArr[1]) {
                i18 = b36.f.j(1, str14) + 0;
            }
            java.lang.String str15 = this.f30957e;
            if (str15 != null && zArr[2]) {
                i18 += b36.f.j(2, str15);
            }
            java.lang.String str16 = this.f30958f;
            if (str16 != null && zArr[3]) {
                i18 += b36.f.j(3, str16);
            }
            int g17 = i18 + b36.f.g(4, 8, this.f30959g);
            java.lang.String str17 = this.f30960h;
            if (str17 != null && zArr[5]) {
                g17 += b36.f.j(5, str17);
            }
            java.lang.String str18 = this.f30961i;
            if (str18 != null && zArr[6]) {
                g17 += b36.f.j(6, str18);
            }
            java.lang.String str19 = this.f30963m;
            if (str19 != null && zArr[7]) {
                g17 += b36.f.j(7, str19);
            }
            if (zArr[8]) {
                g17 += b36.f.f(8, this.f30964n);
            }
            java.lang.String str20 = this.f30965o;
            if (str20 != null && zArr[9]) {
                g17 += b36.f.j(9, str20);
            }
            if (zArr[10]) {
                g17 += b36.f.a(10, this.f30966p);
            }
            if (zArr[11]) {
                g17 += b36.f.f(11, this.f30969q);
            }
            if (zArr[12]) {
                g17 += b36.f.f(12, this.f30970r);
            }
            if (zArr[13]) {
                g17 += b36.f.f(13, this.f30971s);
            }
            if (zArr[14]) {
                g17 += b36.f.f(14, this.f30972t);
            }
            if (zArr[15]) {
                g17 += b36.f.a(15, this.f30973u);
            }
            if (zArr[16]) {
                g17 += b36.f.h(16, this.f30974v);
            }
            java.lang.String str21 = this.f30975w;
            if (str21 != null && zArr[17]) {
                g17 += b36.f.j(17, str21);
            }
            java.lang.String str22 = this.f30976x;
            if (str22 != null && zArr[18]) {
                g17 += b36.f.j(18, str22);
            }
            bw5.xa0 xa0Var4 = this.f30979y;
            if (xa0Var4 != null && zArr[19]) {
                g17 += b36.f.i(19, xa0Var4.computeSize());
            }
            bw5.mc0 mc0Var2 = this.f30982z;
            if (mc0Var2 != null && zArr[20]) {
                g17 += b36.f.i(20, mc0Var2.computeSize());
            }
            if (zArr[21]) {
                g17 += b36.f.a(21, this.A);
            }
            if (zArr[22]) {
                g17 += b36.f.f(22, this.B);
            }
            java.lang.String str23 = this.C;
            if (str23 != null && zArr[23]) {
                g17 += b36.f.j(23, str23);
            }
            int g18 = g17 + b36.f.g(24, 8, this.D);
            bw5.ob0 ob0Var2 = this.E;
            if (ob0Var2 != null && zArr[25]) {
                g18 += b36.f.i(25, ob0Var2.computeSize());
            }
            int g19 = g18 + b36.f.g(26, 1, this.F);
            bw5.g60 g60Var2 = this.G;
            if (g60Var2 != null && zArr[27]) {
                g19 += b36.f.i(27, g60Var2.computeSize());
            }
            if (zArr[28]) {
                g19 += b36.f.a(28, this.H);
            }
            java.lang.String str24 = this.I;
            if (str24 != null && zArr[29]) {
                g19 += b36.f.j(29, str24);
            }
            if (zArr[30]) {
                g19 += b36.f.f(30, this.f30955J);
            }
            if (zArr[31]) {
                g19 += b36.f.a(31, this.K);
            }
            if (zArr[32]) {
                g19 += b36.f.a(32, this.L);
            }
            if (zArr[33]) {
                g19 += b36.f.h(33, this.M);
            }
            if (zArr[34]) {
                g19 += b36.f.a(34, this.N);
            }
            if (zArr[35]) {
                g19 += b36.f.f(35, this.P);
            }
            java.lang.String str25 = this.Q;
            if (str25 != null && zArr[36]) {
                g19 += b36.f.j(36, str25);
            }
            if (zArr[37]) {
                g19 += b36.f.a(37, this.R);
            }
            if (zArr[38]) {
                g19 += b36.f.f(38, this.S);
            }
            bw5.xa0 xa0Var5 = this.T;
            if (xa0Var5 != null && zArr[39]) {
                g19 += b36.f.i(39, xa0Var5.computeSize());
            }
            if (zArr[40]) {
                g19 += b36.f.a(40, this.U);
            }
            if (zArr[41]) {
                g19 += b36.f.h(41, this.V);
            }
            if (zArr[42]) {
                g19 += b36.f.a(42, this.W);
            }
            if (zArr[43]) {
                g19 += b36.f.a(43, this.X);
            }
            if (zArr[44]) {
                g19 += b36.f.a(44, this.Y);
            }
            bw5.p50 p50Var2 = this.Z;
            if (p50Var2 != null && zArr[45]) {
                g19 += b36.f.i(45, p50Var2.computeSize());
            }
            int g27 = g19 + b36.f.g(46, 8, this.f30967p0);
            bw5.mb0 mb0Var5 = this.f30977x0;
            if (mb0Var5 != null && zArr[47]) {
                g27 += b36.f.i(47, mb0Var5.computeSize());
            }
            if (zArr[48]) {
                g27 += b36.f.a(48, this.f30980y0);
            }
            bw5.xa0 xa0Var6 = this.f30962l1;
            if (xa0Var6 != null && zArr[49]) {
                g27 += b36.f.i(49, xa0Var6.computeSize());
            }
            if (zArr[50]) {
                g27 += b36.f.f(50, this.f30968p1);
            }
            if (zArr[51]) {
                g27 += b36.f.a(51, this.f30978x1);
            }
            if (zArr[52]) {
                g27 += b36.f.a(52, this.f30981y1);
            }
            java.lang.String str26 = this.f30983z1;
            if (str26 != null && zArr[53]) {
                g27 += b36.f.j(53, str26);
            }
            bw5.mb0 mb0Var6 = this.A1;
            if (mb0Var6 != null && zArr[54]) {
                g27 += b36.f.i(54, mb0Var6.computeSize());
            }
            bw5.e80 e80Var2 = this.B1;
            if (e80Var2 != null && zArr[55]) {
                g27 += b36.f.i(55, e80Var2.computeSize());
            }
            bw5.ca0 ca0Var2 = this.C1;
            if (ca0Var2 != null && zArr[56]) {
                g27 += b36.f.i(56, ca0Var2.computeSize());
            }
            bw5.b90 b90Var2 = this.D1;
            if (b90Var2 != null && zArr[57]) {
                g27 += b36.f.i(57, b90Var2.computeSize());
            }
            bw5.t50 t50Var2 = this.E1;
            if (t50Var2 != null && zArr[58]) {
                g27 += b36.f.i(58, t50Var2.computeSize());
            }
            bw5.mb0 mb0Var7 = this.F1;
            if (mb0Var7 != null && zArr[59]) {
                g27 += b36.f.i(59, mb0Var7.computeSize());
            }
            bw5.mb0 mb0Var8 = this.G1;
            if (mb0Var8 != null && zArr[60]) {
                g27 += b36.f.i(60, mb0Var8.computeSize());
            }
            bw5.k50 k50Var2 = this.H1;
            if (k50Var2 != null && zArr[61]) {
                g27 += b36.f.i(61, k50Var2.computeSize());
            }
            bw5.n50 n50Var2 = this.I1;
            if (n50Var2 != null && zArr[62]) {
                g27 += b36.f.i(62, n50Var2.computeSize());
            }
            bw5.m50 m50Var2 = this.J1;
            if (m50Var2 != null && zArr[63]) {
                g27 += b36.f.i(63, m50Var2.computeSize());
            }
            return zArr[64] ? g27 + b36.f.f(64, this.K1) : g27;
        }
        if (i17 == 2) {
            this.f30959g.clear();
            this.D.clear();
            this.F.clear();
            this.f30967p0.clear();
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
                this.f30956d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30957e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30958f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.tb0 tb0Var = new bw5.tb0();
                    if (bArr != null && bArr.length > 0) {
                        tb0Var.parseFrom(bArr);
                    }
                    this.f30959g.add(tb0Var);
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f30960h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30961i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30963m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30964n = aVar2.h(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f30965o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f30966p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f30969q = aVar2.h(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f30970r = aVar2.h(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f30971s = aVar2.h(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f30972t = aVar2.h(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f30973u = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f30974v = aVar2.i(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f30975w = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f30976x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.xa0 xa0Var7 = new bw5.xa0();
                    if (bArr2 != null && bArr2.length > 0) {
                        xa0Var7.parseFrom(bArr2);
                    }
                    this.f30979y = xa0Var7;
                }
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.mc0 mc0Var3 = new bw5.mc0();
                    if (bArr3 != null && bArr3.length > 0) {
                        mc0Var3.parseFrom(bArr3);
                    }
                    this.f30982z = mc0Var3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.c(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.h(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.k(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.mc0 mc0Var4 = new bw5.mc0();
                    if (bArr4 != null && bArr4.length > 0) {
                        mc0Var4.parseFrom(bArr4);
                    }
                    this.D.add(mc0Var4);
                }
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.ob0 ob0Var3 = new bw5.ob0();
                    if (bArr5 != null && bArr5.length > 0) {
                        ob0Var3.parseFrom(bArr5);
                    }
                    this.E = ob0Var3;
                }
                zArr[25] = true;
                return 0;
            case 26:
                this.F.add(aVar2.k(intValue));
                zArr[26] = true;
                return 0;
            case 27:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.g60 g60Var3 = new bw5.g60();
                    if (bArr6 != null && bArr6.length > 0) {
                        g60Var3.parseFrom(bArr6);
                    }
                    this.G = g60Var3;
                }
                zArr[27] = true;
                return 0;
            case 28:
                this.H = aVar2.c(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.I = aVar2.k(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                this.f30955J = aVar2.h(intValue);
                zArr[30] = true;
                return 0;
            case 31:
                this.K = aVar2.c(intValue);
                zArr[31] = true;
                return 0;
            case 32:
                this.L = aVar2.c(intValue);
                zArr[32] = true;
                return 0;
            case 33:
                this.M = aVar2.i(intValue);
                zArr[33] = true;
                return 0;
            case 34:
                this.N = aVar2.c(intValue);
                zArr[34] = true;
                return 0;
            case 35:
                this.P = aVar2.h(intValue);
                zArr[35] = true;
                return 0;
            case 36:
                this.Q = aVar2.k(intValue);
                zArr[36] = true;
                return 0;
            case 37:
                this.R = aVar2.c(intValue);
                zArr[37] = true;
                return 0;
            case 38:
                this.S = aVar2.h(intValue);
                zArr[38] = true;
                return 0;
            case 39:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.xa0 xa0Var8 = new bw5.xa0();
                    if (bArr7 != null && bArr7.length > 0) {
                        xa0Var8.parseFrom(bArr7);
                    }
                    this.T = xa0Var8;
                }
                zArr[39] = true;
                return 0;
            case 40:
                this.U = aVar2.c(intValue);
                zArr[40] = true;
                return 0;
            case 41:
                this.V = aVar2.i(intValue);
                zArr[41] = true;
                return 0;
            case 42:
                this.W = aVar2.c(intValue);
                zArr[42] = true;
                return 0;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                this.X = aVar2.c(intValue);
                zArr[43] = true;
                return 0;
            case 44:
                this.Y = aVar2.c(intValue);
                zArr[44] = true;
                return 0;
            case 45:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.p50 p50Var3 = new bw5.p50();
                    if (bArr8 != null && bArr8.length > 0) {
                        p50Var3.parseFrom(bArr8);
                    }
                    this.Z = p50Var3;
                }
                zArr[45] = true;
                return 0;
            case 46:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.j80 j80Var = new bw5.j80();
                    if (bArr9 != null && bArr9.length > 0) {
                        j80Var.parseFrom(bArr9);
                    }
                    this.f30967p0.add(j80Var);
                }
                zArr[46] = true;
                return 0;
            case 47:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.mb0 mb0Var9 = new bw5.mb0();
                    if (bArr10 != null && bArr10.length > 0) {
                        mb0Var9.parseFrom(bArr10);
                    }
                    this.f30977x0 = mb0Var9;
                }
                zArr[47] = true;
                return 0;
            case 48:
                this.f30980y0 = aVar2.c(intValue);
                zArr[48] = true;
                return 0;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.xa0 xa0Var9 = new bw5.xa0();
                    if (bArr11 != null && bArr11.length > 0) {
                        xa0Var9.parseFrom(bArr11);
                    }
                    this.f30962l1 = xa0Var9;
                }
                zArr[49] = true;
                return 0;
            case 50:
                this.f30968p1 = aVar2.h(intValue);
                zArr[50] = true;
                return 0;
            case 51:
                this.f30978x1 = aVar2.c(intValue);
                zArr[51] = true;
                return 0;
            case 52:
                this.f30981y1 = aVar2.c(intValue);
                zArr[52] = true;
                return 0;
            case 53:
                this.f30983z1 = aVar2.k(intValue);
                zArr[53] = true;
                return 0;
            case 54:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.mb0 mb0Var10 = new bw5.mb0();
                    if (bArr12 != null && bArr12.length > 0) {
                        mb0Var10.parseFrom(bArr12);
                    }
                    this.A1 = mb0Var10;
                }
                zArr[54] = true;
                return 0;
            case 55:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    bw5.e80 e80Var3 = new bw5.e80();
                    if (bArr13 != null && bArr13.length > 0) {
                        e80Var3.parseFrom(bArr13);
                    }
                    this.B1 = e80Var3;
                }
                zArr[55] = true;
                return 0;
            case 56:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    bw5.ca0 ca0Var3 = new bw5.ca0();
                    if (bArr14 != null && bArr14.length > 0) {
                        ca0Var3.parseFrom(bArr14);
                    }
                    this.C1 = ca0Var3;
                }
                zArr[56] = true;
                return 0;
            case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr15 = (byte[]) j59.get(i67);
                    bw5.b90 b90Var3 = new bw5.b90();
                    if (bArr15 != null && bArr15.length > 0) {
                        b90Var3.parseFrom(bArr15);
                    }
                    this.D1 = b90Var3;
                }
                zArr[57] = true;
                return 0;
            case 58:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i68 = 0; i68 < size16; i68++) {
                    byte[] bArr16 = (byte[]) j66.get(i68);
                    bw5.t50 t50Var3 = new bw5.t50();
                    if (bArr16 != null && bArr16.length > 0) {
                        t50Var3.parseFrom(bArr16);
                    }
                    this.E1 = t50Var3;
                }
                zArr[58] = true;
                return 0;
            case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                java.util.LinkedList j67 = aVar2.j(intValue);
                int size17 = j67.size();
                for (int i69 = 0; i69 < size17; i69++) {
                    byte[] bArr17 = (byte[]) j67.get(i69);
                    bw5.mb0 mb0Var11 = new bw5.mb0();
                    if (bArr17 != null && bArr17.length > 0) {
                        mb0Var11.parseFrom(bArr17);
                    }
                    this.F1 = mb0Var11;
                }
                zArr[59] = true;
                return 0;
            case 60:
                java.util.LinkedList j68 = aVar2.j(intValue);
                int size18 = j68.size();
                for (int i76 = 0; i76 < size18; i76++) {
                    byte[] bArr18 = (byte[]) j68.get(i76);
                    bw5.mb0 mb0Var12 = new bw5.mb0();
                    if (bArr18 != null && bArr18.length > 0) {
                        mb0Var12.parseFrom(bArr18);
                    }
                    this.G1 = mb0Var12;
                }
                zArr[60] = true;
                return 0;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                java.util.LinkedList j69 = aVar2.j(intValue);
                int size19 = j69.size();
                for (int i77 = 0; i77 < size19; i77++) {
                    byte[] bArr19 = (byte[]) j69.get(i77);
                    bw5.k50 k50Var3 = new bw5.k50();
                    if (bArr19 != null && bArr19.length > 0) {
                        k50Var3.parseFrom(bArr19);
                    }
                    this.H1 = k50Var3;
                }
                zArr[61] = true;
                return 0;
            case 62:
                java.util.LinkedList j76 = aVar2.j(intValue);
                int size20 = j76.size();
                for (int i78 = 0; i78 < size20; i78++) {
                    byte[] bArr20 = (byte[]) j76.get(i78);
                    bw5.n50 n50Var3 = new bw5.n50();
                    if (bArr20 != null && bArr20.length > 0) {
                        n50Var3.parseFrom(bArr20);
                    }
                    this.I1 = n50Var3;
                }
                zArr[62] = true;
                return 0;
            case 63:
                java.util.LinkedList j77 = aVar2.j(intValue);
                int size21 = j77.size();
                for (int i79 = 0; i79 < size21; i79++) {
                    byte[] bArr21 = (byte[]) j77.get(i79);
                    bw5.m50 m50Var3 = new bw5.m50();
                    if (bArr21 != null && bArr21.length > 0) {
                        m50Var3.parseFrom(bArr21);
                    }
                    this.J1 = m50Var3;
                }
                zArr[63] = true;
                return 0;
            case 64:
                this.K1 = aVar2.h(intValue);
                zArr[64] = true;
                return 0;
            default:
                return -1;
        }
    }
}
