package bw5;

/* loaded from: classes2.dex */
public class g10 extends com.tencent.mm.protobuf.f {
    public long A;
    public bw5.m00 A1;
    public int B;
    public com.tencent.mm.protobuf.g C;
    public int C1;
    public bw5.r00 D;
    public boolean D1;
    public long E;
    public boolean E1;
    public int F;
    public int F1;
    public java.lang.String G;
    public bw5.o00 G1;
    public bw5.x00 H;
    public bw5.t00 H1;
    public java.lang.String I;
    public boolean I1;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f27612J;
    public java.lang.String J1;
    public java.lang.String K;
    public java.lang.String K1;
    public bw5.w00 L1;
    public int M;
    public bw5.qp M1;
    public java.lang.String N;
    public bw5.u00 N1;
    public bw5.v00 O1;
    public int P;
    public bw5.v00 P1;
    public bw5.xr0 Q;
    public bw5.ki0 Q1;
    public bw5.z00 R1;
    public int S;
    public bw5.ii0 S1;
    public int T;
    public bw5.ji0 T1;
    public int U;
    public bw5.y00 U1;
    public int V;
    public bw5.a10 V1;
    public int W;
    public bw5.n00 W1;
    public bw5.q00 X;
    public bw5.s00 X1;
    public bw5.e10 Y;
    public int Z;

    /* renamed from: d, reason: collision with root package name */
    public long f27613d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27614e;

    /* renamed from: g, reason: collision with root package name */
    public int f27616g;

    /* renamed from: h, reason: collision with root package name */
    public int f27617h;

    /* renamed from: i, reason: collision with root package name */
    public int f27618i;

    /* renamed from: l1, reason: collision with root package name */
    public bw5.pj f27619l1;

    /* renamed from: m, reason: collision with root package name */
    public bw5.f10 f27620m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f27621n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.q00 f27622o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.q00 f27623p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f27624p0;

    /* renamed from: q, reason: collision with root package name */
    public int f27626q;

    /* renamed from: r, reason: collision with root package name */
    public int f27627r;

    /* renamed from: s, reason: collision with root package name */
    public int f27628s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f27629t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f27630u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f27631v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.to f27632w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f27633x;

    /* renamed from: x0, reason: collision with root package name */
    public bw5.c20 f27634x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f27635x1;

    /* renamed from: y, reason: collision with root package name */
    public int f27636y;

    /* renamed from: y0, reason: collision with root package name */
    public bw5.l30 f27637y0;

    /* renamed from: y1, reason: collision with root package name */
    public int f27638y1;

    /* renamed from: z1, reason: collision with root package name */
    public bw5.bo f27640z1;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f27615f = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f27639z = new java.util.LinkedList();
    public final java.util.LinkedList L = new java.util.LinkedList();
    public final java.util.LinkedList R = new java.util.LinkedList();

    /* renamed from: p1, reason: collision with root package name */
    public final java.util.LinkedList f27625p1 = new java.util.LinkedList();
    public final java.util.LinkedList B1 = new java.util.LinkedList();
    public final boolean[] Y1 = new boolean[92];

    static {
        new bw5.g10();
    }

    public bw5.v00 b() {
        return this.Y1[77] ? this.O1 : new bw5.v00();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.g10 parseFrom(byte[] bArr) {
        return (bw5.g10) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g10)) {
            return false;
        }
        bw5.g10 g10Var = (bw5.g10) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f27613d), java.lang.Long.valueOf(g10Var.f27613d)) && n51.f.a(this.f27614e, g10Var.f27614e) && n51.f.a(this.f27615f, g10Var.f27615f) && n51.f.a(java.lang.Integer.valueOf(this.f27616g), java.lang.Integer.valueOf(g10Var.f27616g)) && n51.f.a(java.lang.Integer.valueOf(this.f27617h), java.lang.Integer.valueOf(g10Var.f27617h)) && n51.f.a(java.lang.Integer.valueOf(this.f27618i), java.lang.Integer.valueOf(g10Var.f27618i)) && n51.f.a(this.f27620m, g10Var.f27620m) && n51.f.a(this.f27621n, g10Var.f27621n) && n51.f.a(this.f27622o, g10Var.f27622o) && n51.f.a(this.f27623p, g10Var.f27623p) && n51.f.a(java.lang.Integer.valueOf(this.f27626q), java.lang.Integer.valueOf(g10Var.f27626q)) && n51.f.a(java.lang.Integer.valueOf(this.f27627r), java.lang.Integer.valueOf(g10Var.f27627r)) && n51.f.a(java.lang.Integer.valueOf(this.f27628s), java.lang.Integer.valueOf(g10Var.f27628s)) && n51.f.a(this.f27629t, g10Var.f27629t) && n51.f.a(this.f27630u, g10Var.f27630u) && n51.f.a(this.f27631v, g10Var.f27631v) && n51.f.a(this.f27632w, g10Var.f27632w) && n51.f.a(this.f27633x, g10Var.f27633x) && n51.f.a(java.lang.Integer.valueOf(this.f27636y), java.lang.Integer.valueOf(g10Var.f27636y)) && n51.f.a(this.f27639z, g10Var.f27639z) && n51.f.a(java.lang.Long.valueOf(this.A), java.lang.Long.valueOf(g10Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(g10Var.B)) && n51.f.a(this.C, g10Var.C) && n51.f.a(this.D, g10Var.D) && n51.f.a(java.lang.Long.valueOf(this.E), java.lang.Long.valueOf(g10Var.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(g10Var.F)) && n51.f.a(this.G, g10Var.G) && n51.f.a(this.H, g10Var.H) && n51.f.a(this.I, g10Var.I) && n51.f.a(this.f27612J, g10Var.f27612J) && n51.f.a(this.K, g10Var.K) && n51.f.a(this.L, g10Var.L) && n51.f.a(java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(g10Var.M)) && n51.f.a(this.N, g10Var.N) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(g10Var.P)) && n51.f.a(this.Q, g10Var.Q) && n51.f.a(this.R, g10Var.R) && n51.f.a(java.lang.Integer.valueOf(this.S), java.lang.Integer.valueOf(g10Var.S)) && n51.f.a(java.lang.Integer.valueOf(this.T), java.lang.Integer.valueOf(g10Var.T)) && n51.f.a(java.lang.Integer.valueOf(this.U), java.lang.Integer.valueOf(g10Var.U)) && n51.f.a(java.lang.Integer.valueOf(this.V), java.lang.Integer.valueOf(g10Var.V)) && n51.f.a(java.lang.Integer.valueOf(this.W), java.lang.Integer.valueOf(g10Var.W)) && n51.f.a(this.X, g10Var.X) && n51.f.a(this.Y, g10Var.Y) && n51.f.a(java.lang.Integer.valueOf(this.Z), java.lang.Integer.valueOf(g10Var.Z)) && n51.f.a(this.f27624p0, g10Var.f27624p0) && n51.f.a(this.f27634x0, g10Var.f27634x0) && n51.f.a(this.f27637y0, g10Var.f27637y0) && n51.f.a(this.f27619l1, g10Var.f27619l1) && n51.f.a(this.f27625p1, g10Var.f27625p1) && n51.f.a(this.f27635x1, g10Var.f27635x1) && n51.f.a(java.lang.Integer.valueOf(this.f27638y1), java.lang.Integer.valueOf(g10Var.f27638y1)) && n51.f.a(this.f27640z1, g10Var.f27640z1) && n51.f.a(this.A1, g10Var.A1) && n51.f.a(this.B1, g10Var.B1) && n51.f.a(java.lang.Integer.valueOf(this.C1), java.lang.Integer.valueOf(g10Var.C1)) && n51.f.a(java.lang.Boolean.valueOf(this.D1), java.lang.Boolean.valueOf(g10Var.D1)) && n51.f.a(java.lang.Boolean.valueOf(this.E1), java.lang.Boolean.valueOf(g10Var.E1)) && n51.f.a(java.lang.Integer.valueOf(this.F1), java.lang.Integer.valueOf(g10Var.F1)) && n51.f.a(this.G1, g10Var.G1) && n51.f.a(this.H1, g10Var.H1) && n51.f.a(java.lang.Boolean.valueOf(this.I1), java.lang.Boolean.valueOf(g10Var.I1)) && n51.f.a(this.J1, g10Var.J1) && n51.f.a(this.K1, g10Var.K1) && n51.f.a(this.L1, g10Var.L1) && n51.f.a(this.M1, g10Var.M1) && n51.f.a(this.N1, g10Var.N1) && n51.f.a(this.O1, g10Var.O1) && n51.f.a(this.P1, g10Var.P1) && n51.f.a(this.Q1, g10Var.Q1) && n51.f.a(this.R1, g10Var.R1) && n51.f.a(this.S1, g10Var.S1) && n51.f.a(this.T1, g10Var.T1) && n51.f.a(this.U1, g10Var.U1) && n51.f.a(this.V1, g10Var.V1) && n51.f.a(this.W1, g10Var.W1) && n51.f.a(this.X1, g10Var.X1);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.g10();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.Y1;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f27613d);
            }
            java.lang.String str = this.f27614e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f27615f);
            if (zArr[4]) {
                fVar.f(4, this.f27616g);
            }
            if (zArr[5]) {
                fVar.f(5, this.f27617h);
            }
            if (zArr[6]) {
                fVar.f(6, this.f27618i);
            }
            bw5.f10 f10Var = this.f27620m;
            if (f10Var != null && zArr[7]) {
                fVar.f(7, f10Var.f27114d);
            }
            java.lang.String str2 = this.f27621n;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            bw5.q00 q00Var = this.f27622o;
            if (q00Var != null && zArr[9]) {
                fVar.i(9, q00Var.computeSize());
                this.f27622o.writeFields(fVar);
            }
            bw5.q00 q00Var2 = this.f27623p;
            if (q00Var2 != null && zArr[10]) {
                fVar.i(10, q00Var2.computeSize());
                this.f27623p.writeFields(fVar);
            }
            if (zArr[11]) {
                fVar.f(11, this.f27626q);
            }
            if (zArr[12]) {
                fVar.f(12, this.f27627r);
            }
            if (zArr[13]) {
                fVar.f(13, this.f27628s);
            }
            java.lang.String str3 = this.f27629t;
            if (str3 != null && zArr[14]) {
                fVar.j(14, str3);
            }
            java.lang.String str4 = this.f27630u;
            if (str4 != null && zArr[15]) {
                fVar.j(15, str4);
            }
            java.lang.String str5 = this.f27631v;
            if (str5 != null && zArr[16]) {
                fVar.j(16, str5);
            }
            bw5.to toVar = this.f27632w;
            if (toVar != null && zArr[17]) {
                fVar.i(17, toVar.computeSize());
                this.f27632w.writeFields(fVar);
            }
            java.lang.String str6 = this.f27633x;
            if (str6 != null && zArr[18]) {
                fVar.j(18, str6);
            }
            if (zArr[19]) {
                fVar.f(19, this.f27636y);
            }
            fVar.g(20, 8, this.f27639z);
            if (zArr[21]) {
                fVar.h(21, this.A);
            }
            if (zArr[22]) {
                fVar.f(22, this.B);
            }
            com.tencent.mm.protobuf.g gVar = this.C;
            if (gVar != null && zArr[23]) {
                fVar.b(23, gVar);
            }
            bw5.r00 r00Var = this.D;
            if (r00Var != null && zArr[24]) {
                fVar.i(24, r00Var.computeSize());
                this.D.writeFields(fVar);
            }
            if (zArr[25]) {
                fVar.h(25, this.E);
            }
            if (zArr[26]) {
                fVar.f(26, this.F);
            }
            java.lang.String str7 = this.G;
            if (str7 != null && zArr[27]) {
                fVar.j(27, str7);
            }
            bw5.x00 x00Var = this.H;
            if (x00Var != null && zArr[28]) {
                fVar.i(28, x00Var.computeSize());
                this.H.writeFields(fVar);
            }
            java.lang.String str8 = this.I;
            if (str8 != null && zArr[29]) {
                fVar.j(29, str8);
            }
            java.lang.String str9 = this.f27612J;
            if (str9 != null && zArr[30]) {
                fVar.j(30, str9);
            }
            java.lang.String str10 = this.K;
            if (str10 != null && zArr[32]) {
                fVar.j(32, str10);
            }
            fVar.g(34, 8, this.L);
            if (zArr[35]) {
                fVar.f(35, this.M);
            }
            java.lang.String str11 = this.N;
            if (str11 != null && zArr[36]) {
                fVar.j(36, str11);
            }
            if (zArr[37]) {
                fVar.f(37, this.P);
            }
            bw5.xr0 xr0Var = this.Q;
            if (xr0Var != null && zArr[38]) {
                fVar.i(38, xr0Var.computeSize());
                this.Q.writeFields(fVar);
            }
            fVar.g(40, 1, this.R);
            if (zArr[41]) {
                fVar.f(41, this.S);
            }
            if (zArr[42]) {
                fVar.f(42, this.T);
            }
            if (zArr[43]) {
                fVar.f(43, this.U);
            }
            if (zArr[44]) {
                fVar.f(44, this.V);
            }
            if (zArr[45]) {
                fVar.f(45, this.W);
            }
            bw5.q00 q00Var3 = this.X;
            if (q00Var3 != null && zArr[46]) {
                fVar.i(46, q00Var3.computeSize());
                this.X.writeFields(fVar);
            }
            bw5.e10 e10Var = this.Y;
            if (e10Var != null && zArr[47]) {
                fVar.i(47, e10Var.computeSize());
                this.Y.writeFields(fVar);
            }
            if (zArr[48]) {
                fVar.f(48, this.Z);
            }
            java.lang.String str12 = this.f27624p0;
            if (str12 != null && zArr[49]) {
                fVar.j(49, str12);
            }
            bw5.c20 c20Var = this.f27634x0;
            if (c20Var != null && zArr[50]) {
                fVar.i(50, c20Var.computeSize());
                this.f27634x0.writeFields(fVar);
            }
            bw5.l30 l30Var = this.f27637y0;
            if (l30Var != null && zArr[51]) {
                fVar.i(51, l30Var.computeSize());
                this.f27637y0.writeFields(fVar);
            }
            bw5.pj pjVar = this.f27619l1;
            if (pjVar != null && zArr[54]) {
                fVar.i(54, pjVar.computeSize());
                this.f27619l1.writeFields(fVar);
            }
            fVar.g(55, 8, this.f27625p1);
            java.lang.String str13 = this.f27635x1;
            if (str13 != null && zArr[56]) {
                fVar.j(56, str13);
            }
            if (zArr[57]) {
                fVar.f(57, this.f27638y1);
            }
            bw5.bo boVar = this.f27640z1;
            if (boVar != null && zArr[58]) {
                fVar.i(58, boVar.computeSize());
                this.f27640z1.writeFields(fVar);
            }
            bw5.m00 m00Var = this.A1;
            if (m00Var != null && zArr[59]) {
                fVar.i(59, m00Var.computeSize());
                this.A1.writeFields(fVar);
            }
            fVar.g(60, 8, this.B1);
            if (zArr[61]) {
                fVar.f(61, this.C1);
            }
            if (zArr[62]) {
                fVar.a(62, this.D1);
            }
            if (zArr[63]) {
                fVar.a(63, this.E1);
            }
            if (zArr[64]) {
                fVar.f(64, this.F1);
            }
            bw5.o00 o00Var = this.G1;
            if (o00Var != null && zArr[65]) {
                fVar.i(65, o00Var.computeSize());
                this.G1.writeFields(fVar);
            }
            bw5.t00 t00Var = this.H1;
            if (t00Var != null && zArr[67]) {
                fVar.i(67, t00Var.computeSize());
                this.H1.writeFields(fVar);
            }
            if (zArr[69]) {
                fVar.a(69, this.I1);
            }
            java.lang.String str14 = this.J1;
            if (str14 != null && zArr[70]) {
                fVar.j(70, str14);
            }
            java.lang.String str15 = this.K1;
            if (str15 != null && zArr[71]) {
                fVar.j(71, str15);
            }
            bw5.w00 w00Var = this.L1;
            if (w00Var != null && zArr[73]) {
                fVar.i(73, w00Var.computeSize());
                this.L1.writeFields(fVar);
            }
            bw5.qp qpVar = this.M1;
            if (qpVar != null && zArr[74]) {
                fVar.i(74, qpVar.computeSize());
                this.M1.writeFields(fVar);
            }
            bw5.u00 u00Var = this.N1;
            if (u00Var != null && zArr[75]) {
                fVar.i(75, u00Var.computeSize());
                this.N1.writeFields(fVar);
            }
            bw5.v00 v00Var = this.O1;
            if (v00Var != null && zArr[77]) {
                fVar.i(77, v00Var.computeSize());
                this.O1.writeFields(fVar);
            }
            bw5.v00 v00Var2 = this.P1;
            if (v00Var2 != null && zArr[78]) {
                fVar.i(78, v00Var2.computeSize());
                this.P1.writeFields(fVar);
            }
            bw5.ki0 ki0Var = this.Q1;
            if (ki0Var != null && zArr[79]) {
                fVar.f(79, ki0Var.f29387d);
            }
            bw5.z00 z00Var = this.R1;
            if (z00Var != null && zArr[80]) {
                fVar.i(80, z00Var.computeSize());
                this.R1.writeFields(fVar);
            }
            bw5.ii0 ii0Var = this.S1;
            if (ii0Var != null && zArr[81]) {
                fVar.i(81, ii0Var.computeSize());
                this.S1.writeFields(fVar);
            }
            bw5.ji0 ji0Var = this.T1;
            if (ji0Var != null && zArr[82]) {
                fVar.i(82, ji0Var.computeSize());
                this.T1.writeFields(fVar);
            }
            bw5.y00 y00Var = this.U1;
            if (y00Var != null && zArr[88]) {
                fVar.i(88, y00Var.computeSize());
                this.U1.writeFields(fVar);
            }
            bw5.a10 a10Var = this.V1;
            if (a10Var != null && zArr[89]) {
                fVar.i(89, a10Var.computeSize());
                this.V1.writeFields(fVar);
            }
            bw5.n00 n00Var = this.W1;
            if (n00Var != null && zArr[90]) {
                fVar.i(90, n00Var.computeSize());
                this.W1.writeFields(fVar);
            }
            bw5.s00 s00Var = this.X1;
            if (s00Var != null && zArr[91]) {
                fVar.i(91, s00Var.computeSize());
                this.X1.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f27613d) + 0 : 0;
            java.lang.String str16 = this.f27614e;
            if (str16 != null && zArr[2]) {
                h17 += b36.f.j(2, str16);
            }
            int g17 = h17 + b36.f.g(3, 1, this.f27615f);
            if (zArr[4]) {
                g17 += b36.f.f(4, this.f27616g);
            }
            if (zArr[5]) {
                g17 += b36.f.f(5, this.f27617h);
            }
            if (zArr[6]) {
                g17 += b36.f.f(6, this.f27618i);
            }
            bw5.f10 f10Var2 = this.f27620m;
            if (f10Var2 != null && zArr[7]) {
                g17 += b36.f.f(7, f10Var2.f27114d);
            }
            java.lang.String str17 = this.f27621n;
            if (str17 != null && zArr[8]) {
                g17 += b36.f.j(8, str17);
            }
            bw5.q00 q00Var4 = this.f27622o;
            if (q00Var4 != null && zArr[9]) {
                g17 += b36.f.i(9, q00Var4.computeSize());
            }
            bw5.q00 q00Var5 = this.f27623p;
            if (q00Var5 != null && zArr[10]) {
                g17 += b36.f.i(10, q00Var5.computeSize());
            }
            if (zArr[11]) {
                g17 += b36.f.f(11, this.f27626q);
            }
            if (zArr[12]) {
                g17 += b36.f.f(12, this.f27627r);
            }
            if (zArr[13]) {
                g17 += b36.f.f(13, this.f27628s);
            }
            java.lang.String str18 = this.f27629t;
            if (str18 != null && zArr[14]) {
                g17 += b36.f.j(14, str18);
            }
            java.lang.String str19 = this.f27630u;
            if (str19 != null && zArr[15]) {
                g17 += b36.f.j(15, str19);
            }
            java.lang.String str20 = this.f27631v;
            if (str20 != null && zArr[16]) {
                g17 += b36.f.j(16, str20);
            }
            bw5.to toVar2 = this.f27632w;
            if (toVar2 != null && zArr[17]) {
                g17 += b36.f.i(17, toVar2.computeSize());
            }
            java.lang.String str21 = this.f27633x;
            if (str21 != null && zArr[18]) {
                g17 += b36.f.j(18, str21);
            }
            if (zArr[19]) {
                g17 += b36.f.f(19, this.f27636y);
            }
            int g18 = g17 + b36.f.g(20, 8, this.f27639z);
            if (zArr[21]) {
                g18 += b36.f.h(21, this.A);
            }
            if (zArr[22]) {
                g18 += b36.f.f(22, this.B);
            }
            com.tencent.mm.protobuf.g gVar2 = this.C;
            if (gVar2 != null && zArr[23]) {
                g18 += b36.f.b(23, gVar2);
            }
            bw5.r00 r00Var2 = this.D;
            if (r00Var2 != null && zArr[24]) {
                g18 += b36.f.i(24, r00Var2.computeSize());
            }
            if (zArr[25]) {
                g18 += b36.f.h(25, this.E);
            }
            if (zArr[26]) {
                g18 += b36.f.f(26, this.F);
            }
            java.lang.String str22 = this.G;
            if (str22 != null && zArr[27]) {
                g18 += b36.f.j(27, str22);
            }
            bw5.x00 x00Var2 = this.H;
            if (x00Var2 != null && zArr[28]) {
                g18 += b36.f.i(28, x00Var2.computeSize());
            }
            java.lang.String str23 = this.I;
            if (str23 != null && zArr[29]) {
                g18 += b36.f.j(29, str23);
            }
            java.lang.String str24 = this.f27612J;
            if (str24 != null && zArr[30]) {
                g18 += b36.f.j(30, str24);
            }
            java.lang.String str25 = this.K;
            if (str25 != null && zArr[32]) {
                g18 += b36.f.j(32, str25);
            }
            int g19 = g18 + b36.f.g(34, 8, this.L);
            if (zArr[35]) {
                g19 += b36.f.f(35, this.M);
            }
            java.lang.String str26 = this.N;
            if (str26 != null && zArr[36]) {
                g19 += b36.f.j(36, str26);
            }
            if (zArr[37]) {
                g19 += b36.f.f(37, this.P);
            }
            bw5.xr0 xr0Var2 = this.Q;
            if (xr0Var2 != null && zArr[38]) {
                g19 += b36.f.i(38, xr0Var2.computeSize());
            }
            int g27 = g19 + b36.f.g(40, 1, this.R);
            if (zArr[41]) {
                g27 += b36.f.f(41, this.S);
            }
            if (zArr[42]) {
                g27 += b36.f.f(42, this.T);
            }
            if (zArr[43]) {
                g27 += b36.f.f(43, this.U);
            }
            if (zArr[44]) {
                g27 += b36.f.f(44, this.V);
            }
            if (zArr[45]) {
                g27 += b36.f.f(45, this.W);
            }
            bw5.q00 q00Var6 = this.X;
            if (q00Var6 != null && zArr[46]) {
                g27 += b36.f.i(46, q00Var6.computeSize());
            }
            bw5.e10 e10Var2 = this.Y;
            if (e10Var2 != null && zArr[47]) {
                g27 += b36.f.i(47, e10Var2.computeSize());
            }
            if (zArr[48]) {
                g27 += b36.f.f(48, this.Z);
            }
            java.lang.String str27 = this.f27624p0;
            if (str27 != null && zArr[49]) {
                g27 += b36.f.j(49, str27);
            }
            bw5.c20 c20Var2 = this.f27634x0;
            if (c20Var2 != null && zArr[50]) {
                g27 += b36.f.i(50, c20Var2.computeSize());
            }
            bw5.l30 l30Var2 = this.f27637y0;
            if (l30Var2 != null && zArr[51]) {
                g27 += b36.f.i(51, l30Var2.computeSize());
            }
            bw5.pj pjVar2 = this.f27619l1;
            if (pjVar2 != null && zArr[54]) {
                g27 += b36.f.i(54, pjVar2.computeSize());
            }
            int g28 = g27 + b36.f.g(55, 8, this.f27625p1);
            java.lang.String str28 = this.f27635x1;
            if (str28 != null && zArr[56]) {
                g28 += b36.f.j(56, str28);
            }
            if (zArr[57]) {
                g28 += b36.f.f(57, this.f27638y1);
            }
            bw5.bo boVar2 = this.f27640z1;
            if (boVar2 != null && zArr[58]) {
                g28 += b36.f.i(58, boVar2.computeSize());
            }
            bw5.m00 m00Var2 = this.A1;
            if (m00Var2 != null && zArr[59]) {
                g28 += b36.f.i(59, m00Var2.computeSize());
            }
            int g29 = g28 + b36.f.g(60, 8, this.B1);
            if (zArr[61]) {
                g29 += b36.f.f(61, this.C1);
            }
            if (zArr[62]) {
                g29 += b36.f.a(62, this.D1);
            }
            if (zArr[63]) {
                g29 += b36.f.a(63, this.E1);
            }
            if (zArr[64]) {
                g29 += b36.f.f(64, this.F1);
            }
            bw5.o00 o00Var2 = this.G1;
            if (o00Var2 != null && zArr[65]) {
                g29 += b36.f.i(65, o00Var2.computeSize());
            }
            bw5.t00 t00Var2 = this.H1;
            if (t00Var2 != null && zArr[67]) {
                g29 += b36.f.i(67, t00Var2.computeSize());
            }
            if (zArr[69]) {
                g29 += b36.f.a(69, this.I1);
            }
            java.lang.String str29 = this.J1;
            if (str29 != null && zArr[70]) {
                g29 += b36.f.j(70, str29);
            }
            java.lang.String str30 = this.K1;
            if (str30 != null && zArr[71]) {
                g29 += b36.f.j(71, str30);
            }
            bw5.w00 w00Var2 = this.L1;
            if (w00Var2 != null && zArr[73]) {
                g29 += b36.f.i(73, w00Var2.computeSize());
            }
            bw5.qp qpVar2 = this.M1;
            if (qpVar2 != null && zArr[74]) {
                g29 += b36.f.i(74, qpVar2.computeSize());
            }
            bw5.u00 u00Var2 = this.N1;
            if (u00Var2 != null && zArr[75]) {
                g29 += b36.f.i(75, u00Var2.computeSize());
            }
            bw5.v00 v00Var3 = this.O1;
            if (v00Var3 != null && zArr[77]) {
                g29 += b36.f.i(77, v00Var3.computeSize());
            }
            bw5.v00 v00Var4 = this.P1;
            if (v00Var4 != null && zArr[78]) {
                g29 += b36.f.i(78, v00Var4.computeSize());
            }
            bw5.ki0 ki0Var2 = this.Q1;
            if (ki0Var2 != null && zArr[79]) {
                g29 += b36.f.f(79, ki0Var2.f29387d);
            }
            bw5.z00 z00Var2 = this.R1;
            if (z00Var2 != null && zArr[80]) {
                g29 += b36.f.i(80, z00Var2.computeSize());
            }
            bw5.ii0 ii0Var2 = this.S1;
            if (ii0Var2 != null && zArr[81]) {
                g29 += b36.f.i(81, ii0Var2.computeSize());
            }
            bw5.ji0 ji0Var2 = this.T1;
            if (ji0Var2 != null && zArr[82]) {
                g29 += b36.f.i(82, ji0Var2.computeSize());
            }
            bw5.y00 y00Var2 = this.U1;
            if (y00Var2 != null && zArr[88]) {
                g29 += b36.f.i(88, y00Var2.computeSize());
            }
            bw5.a10 a10Var2 = this.V1;
            if (a10Var2 != null && zArr[89]) {
                g29 += b36.f.i(89, a10Var2.computeSize());
            }
            bw5.n00 n00Var2 = this.W1;
            if (n00Var2 != null && zArr[90]) {
                g29 += b36.f.i(90, n00Var2.computeSize());
            }
            bw5.s00 s00Var2 = this.X1;
            return (s00Var2 == null || !zArr[91]) ? g29 : g29 + b36.f.i(91, s00Var2.computeSize());
        }
        if (i17 == 2) {
            this.f27615f.clear();
            this.f27639z.clear();
            this.L.clear();
            this.R.clear();
            this.f27625p1.clear();
            this.B1.clear();
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
                this.f27613d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27614e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27615f.add(aVar2.k(intValue));
                zArr[3] = true;
                return 0;
            case 4:
                this.f27616g = aVar2.h(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27617h = aVar2.h(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27618i = aVar2.h(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27620m = bw5.f10.a(aVar2.h(intValue));
                zArr[7] = true;
                return 0;
            case 8:
                this.f27621n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.q00 q00Var7 = new bw5.q00();
                    if (bArr != null && bArr.length > 0) {
                        q00Var7.parseFrom(bArr);
                    }
                    this.f27622o = q00Var7;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.q00 q00Var8 = new bw5.q00();
                    if (bArr2 != null && bArr2.length > 0) {
                        q00Var8.parseFrom(bArr2);
                    }
                    this.f27623p = q00Var8;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f27626q = aVar2.h(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f27627r = aVar2.h(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f27628s = aVar2.h(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f27629t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f27630u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f27631v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.to toVar3 = new bw5.to();
                    if (bArr3 != null && bArr3.length > 0) {
                        toVar3.parseFrom(bArr3);
                    }
                    this.f27632w = toVar3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                this.f27633x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f27636y = aVar2.h(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.p00 p00Var = new bw5.p00();
                    if (bArr4 != null && bArr4.length > 0) {
                        p00Var.parseFrom(bArr4);
                    }
                    this.f27639z.add(p00Var);
                }
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.i(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.h(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.d(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.r00 r00Var3 = new bw5.r00();
                    if (bArr5 != null && bArr5.length > 0) {
                        r00Var3.parseFrom(bArr5);
                    }
                    this.D = r00Var3;
                }
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.i(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.h(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.G = aVar2.k(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.x00 x00Var3 = new bw5.x00();
                    if (bArr6 != null && bArr6.length > 0) {
                        x00Var3.parseFrom(bArr6);
                    }
                    this.H = x00Var3;
                }
                zArr[28] = true;
                return 0;
            case 29:
                this.I = aVar2.k(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                this.f27612J = aVar2.k(intValue);
                zArr[30] = true;
                return 0;
            case 31:
            case 33:
            case 39:
            case 52:
            case 53:
            case 66:
            case 68:
            case 72:
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
            case 83:
            case com.tencent.mm.plugin.appbrand.jsapi.picker.l.CTRL_INDEX /* 84 */:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.q2.CTRL_INDEX /* 85 */:
            case com.tencent.mm.plugin.appbrand.jsapi.pay.l.CTRL_INDEX /* 86 */:
            case 87:
            default:
                return -1;
            case 32:
                this.K = aVar2.k(intValue);
                zArr[32] = true;
                return 0;
            case 34:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.b10 b10Var = new bw5.b10();
                    if (bArr7 != null && bArr7.length > 0) {
                        b10Var.parseFrom(bArr7);
                    }
                    this.L.add(b10Var);
                }
                zArr[34] = true;
                return 0;
            case 35:
                this.M = aVar2.h(intValue);
                zArr[35] = true;
                return 0;
            case 36:
                this.N = aVar2.k(intValue);
                zArr[36] = true;
                return 0;
            case 37:
                this.P = aVar2.h(intValue);
                zArr[37] = true;
                return 0;
            case 38:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.xr0 xr0Var3 = new bw5.xr0();
                    if (bArr8 != null && bArr8.length > 0) {
                        xr0Var3.parseFrom(bArr8);
                    }
                    this.Q = xr0Var3;
                }
                zArr[38] = true;
                return 0;
            case 40:
                this.R.add(aVar2.k(intValue));
                zArr[40] = true;
                return 0;
            case 41:
                this.S = aVar2.h(intValue);
                zArr[41] = true;
                return 0;
            case 42:
                this.T = aVar2.h(intValue);
                zArr[42] = true;
                return 0;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                this.U = aVar2.h(intValue);
                zArr[43] = true;
                return 0;
            case 44:
                this.V = aVar2.h(intValue);
                zArr[44] = true;
                return 0;
            case 45:
                this.W = aVar2.h(intValue);
                zArr[45] = true;
                return 0;
            case 46:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.q00 q00Var9 = new bw5.q00();
                    if (bArr9 != null && bArr9.length > 0) {
                        q00Var9.parseFrom(bArr9);
                    }
                    this.X = q00Var9;
                }
                zArr[46] = true;
                return 0;
            case 47:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    bw5.e10 e10Var3 = new bw5.e10();
                    if (bArr10 != null && bArr10.length > 0) {
                        e10Var3.parseFrom(bArr10);
                    }
                    this.Y = e10Var3;
                }
                zArr[47] = true;
                return 0;
            case 48:
                this.Z = aVar2.h(intValue);
                zArr[48] = true;
                return 0;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                this.f27624p0 = aVar2.k(intValue);
                zArr[49] = true;
                return 0;
            case 50:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr11 = (byte[]) j48.get(i49);
                    bw5.c20 c20Var3 = new bw5.c20();
                    if (bArr11 != null && bArr11.length > 0) {
                        c20Var3.parseFrom(bArr11);
                    }
                    this.f27634x0 = c20Var3;
                }
                zArr[50] = true;
                return 0;
            case 51:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i57 = 0; i57 < size12; i57++) {
                    byte[] bArr12 = (byte[]) j49.get(i57);
                    bw5.l30 l30Var3 = new bw5.l30();
                    if (bArr12 != null && bArr12.length > 0) {
                        l30Var3.parseFrom(bArr12);
                    }
                    this.f27637y0 = l30Var3;
                }
                zArr[51] = true;
                return 0;
            case 54:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i58 = 0; i58 < size13; i58++) {
                    byte[] bArr13 = (byte[]) j57.get(i58);
                    bw5.pj pjVar3 = new bw5.pj();
                    if (bArr13 != null && bArr13.length > 0) {
                        pjVar3.parseFrom(bArr13);
                    }
                    this.f27619l1 = pjVar3;
                }
                zArr[54] = true;
                return 0;
            case 55:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i59 = 0; i59 < size14; i59++) {
                    byte[] bArr14 = (byte[]) j58.get(i59);
                    bw5.b10 b10Var2 = new bw5.b10();
                    if (bArr14 != null && bArr14.length > 0) {
                        b10Var2.parseFrom(bArr14);
                    }
                    this.f27625p1.add(b10Var2);
                }
                zArr[55] = true;
                return 0;
            case 56:
                this.f27635x1 = aVar2.k(intValue);
                zArr[56] = true;
                return 0;
            case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
                this.f27638y1 = aVar2.h(intValue);
                zArr[57] = true;
                return 0;
            case 58:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i66 = 0; i66 < size15; i66++) {
                    byte[] bArr15 = (byte[]) j59.get(i66);
                    bw5.bo boVar3 = new bw5.bo();
                    if (bArr15 != null && bArr15.length > 0) {
                        boVar3.parseFrom(bArr15);
                    }
                    this.f27640z1 = boVar3;
                }
                zArr[58] = true;
                return 0;
            case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i67 = 0; i67 < size16; i67++) {
                    byte[] bArr16 = (byte[]) j66.get(i67);
                    bw5.m00 m00Var3 = new bw5.m00();
                    if (bArr16 != null && bArr16.length > 0) {
                        m00Var3.parseFrom(bArr16);
                    }
                    this.A1 = m00Var3;
                }
                zArr[59] = true;
                return 0;
            case 60:
                java.util.LinkedList j67 = aVar2.j(intValue);
                int size17 = j67.size();
                for (int i68 = 0; i68 < size17; i68++) {
                    byte[] bArr17 = (byte[]) j67.get(i68);
                    bw5.c10 c10Var = new bw5.c10();
                    if (bArr17 != null && bArr17.length > 0) {
                        c10Var.parseFrom(bArr17);
                    }
                    this.B1.add(c10Var);
                }
                zArr[60] = true;
                return 0;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                this.C1 = aVar2.h(intValue);
                zArr[61] = true;
                return 0;
            case 62:
                this.D1 = aVar2.c(intValue);
                zArr[62] = true;
                return 0;
            case 63:
                this.E1 = aVar2.c(intValue);
                zArr[63] = true;
                return 0;
            case 64:
                this.F1 = aVar2.h(intValue);
                zArr[64] = true;
                return 0;
            case 65:
                java.util.LinkedList j68 = aVar2.j(intValue);
                int size18 = j68.size();
                for (int i69 = 0; i69 < size18; i69++) {
                    byte[] bArr18 = (byte[]) j68.get(i69);
                    bw5.o00 o00Var3 = new bw5.o00();
                    if (bArr18 != null && bArr18.length > 0) {
                        o00Var3.parseFrom(bArr18);
                    }
                    this.G1 = o00Var3;
                }
                zArr[65] = true;
                return 0;
            case 67:
                java.util.LinkedList j69 = aVar2.j(intValue);
                int size19 = j69.size();
                for (int i76 = 0; i76 < size19; i76++) {
                    byte[] bArr19 = (byte[]) j69.get(i76);
                    bw5.t00 t00Var3 = new bw5.t00();
                    if (bArr19 != null && bArr19.length > 0) {
                        t00Var3.parseFrom(bArr19);
                    }
                    this.H1 = t00Var3;
                }
                zArr[67] = true;
                return 0;
            case 69:
                this.I1 = aVar2.c(intValue);
                zArr[69] = true;
                return 0;
            case 70:
                this.J1 = aVar2.k(intValue);
                zArr[70] = true;
                return 0;
            case 71:
                this.K1 = aVar2.k(intValue);
                zArr[71] = true;
                return 0;
            case com.tencent.mm.plugin.appbrand.jsapi.share.k.CTRL_INDEX /* 73 */:
                java.util.LinkedList j76 = aVar2.j(intValue);
                int size20 = j76.size();
                for (int i77 = 0; i77 < size20; i77++) {
                    byte[] bArr20 = (byte[]) j76.get(i77);
                    bw5.w00 w00Var3 = new bw5.w00();
                    if (bArr20 != null && bArr20.length > 0) {
                        w00Var3.parseFrom(bArr20);
                    }
                    this.L1 = w00Var3;
                }
                zArr[73] = true;
                return 0;
            case 74:
                java.util.LinkedList j77 = aVar2.j(intValue);
                int size21 = j77.size();
                for (int i78 = 0; i78 < size21; i78++) {
                    byte[] bArr21 = (byte[]) j77.get(i78);
                    bw5.qp qpVar3 = new bw5.qp();
                    if (bArr21 != null && bArr21.length > 0) {
                        qpVar3.parseFrom(bArr21);
                    }
                    this.M1 = qpVar3;
                }
                zArr[74] = true;
                return 0;
            case 75:
                java.util.LinkedList j78 = aVar2.j(intValue);
                int size22 = j78.size();
                for (int i79 = 0; i79 < size22; i79++) {
                    byte[] bArr22 = (byte[]) j78.get(i79);
                    bw5.u00 u00Var3 = new bw5.u00();
                    if (bArr22 != null && bArr22.length > 0) {
                        u00Var3.parseFrom(bArr22);
                    }
                    this.N1 = u00Var3;
                }
                zArr[75] = true;
                return 0;
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_MAIN /* 77 */:
                java.util.LinkedList j79 = aVar2.j(intValue);
                int size23 = j79.size();
                for (int i86 = 0; i86 < size23; i86++) {
                    byte[] bArr23 = (byte[]) j79.get(i86);
                    bw5.v00 v00Var5 = new bw5.v00();
                    if (bArr23 != null && bArr23.length > 0) {
                        v00Var5.parseFrom(bArr23);
                    }
                    this.O1 = v00Var5;
                }
                zArr[77] = true;
                return 0;
            case qc1.u.CTRL_INDEX /* 78 */:
                java.util.LinkedList j86 = aVar2.j(intValue);
                int size24 = j86.size();
                for (int i87 = 0; i87 < size24; i87++) {
                    byte[] bArr24 = (byte[]) j86.get(i87);
                    bw5.v00 v00Var6 = new bw5.v00();
                    if (bArr24 != null && bArr24.length > 0) {
                        v00Var6.parseFrom(bArr24);
                    }
                    this.P1 = v00Var6;
                }
                zArr[78] = true;
                return 0;
            case 79:
                this.Q1 = bw5.ki0.a(aVar2.h(intValue));
                zArr[79] = true;
                return 0;
            case 80:
                java.util.LinkedList j87 = aVar2.j(intValue);
                int size25 = j87.size();
                for (int i88 = 0; i88 < size25; i88++) {
                    byte[] bArr25 = (byte[]) j87.get(i88);
                    bw5.z00 z00Var3 = new bw5.z00();
                    if (bArr25 != null && bArr25.length > 0) {
                        z00Var3.parseFrom(bArr25);
                    }
                    this.R1 = z00Var3;
                }
                zArr[80] = true;
                return 0;
            case 81:
                java.util.LinkedList j88 = aVar2.j(intValue);
                int size26 = j88.size();
                for (int i89 = 0; i89 < size26; i89++) {
                    byte[] bArr26 = (byte[]) j88.get(i89);
                    bw5.ii0 ii0Var3 = new bw5.ii0();
                    if (bArr26 != null && bArr26.length > 0) {
                        ii0Var3.parseFrom(bArr26);
                    }
                    this.S1 = ii0Var3;
                }
                zArr[81] = true;
                return 0;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
                java.util.LinkedList j89 = aVar2.j(intValue);
                int size27 = j89.size();
                for (int i96 = 0; i96 < size27; i96++) {
                    byte[] bArr27 = (byte[]) j89.get(i96);
                    bw5.ji0 ji0Var3 = new bw5.ji0();
                    if (bArr27 != null && bArr27.length > 0) {
                        ji0Var3.parseFrom(bArr27);
                    }
                    this.T1 = ji0Var3;
                }
                zArr[82] = true;
                return 0;
            case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_EXTENDED /* 88 */:
                java.util.LinkedList j96 = aVar2.j(intValue);
                int size28 = j96.size();
                for (int i97 = 0; i97 < size28; i97++) {
                    byte[] bArr28 = (byte[]) j96.get(i97);
                    bw5.y00 y00Var3 = new bw5.y00();
                    if (bArr28 != null && bArr28.length > 0) {
                        y00Var3.parseFrom(bArr28);
                    }
                    this.U1 = y00Var3;
                }
                zArr[88] = true;
                return 0;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_CHECK_STATE /* 89 */:
                java.util.LinkedList j97 = aVar2.j(intValue);
                int size29 = j97.size();
                for (int i98 = 0; i98 < size29; i98++) {
                    byte[] bArr29 = (byte[]) j97.get(i98);
                    bw5.a10 a10Var3 = new bw5.a10();
                    if (bArr29 != null && bArr29.length > 0) {
                        a10Var3.parseFrom(bArr29);
                    }
                    this.V1 = a10Var3;
                }
                zArr[89] = true;
                return 0;
            case 90:
                java.util.LinkedList j98 = aVar2.j(intValue);
                int size30 = j98.size();
                for (int i99 = 0; i99 < size30; i99++) {
                    byte[] bArr30 = (byte[]) j98.get(i99);
                    bw5.n00 n00Var3 = new bw5.n00();
                    if (bArr30 != null && bArr30.length > 0) {
                        n00Var3.parseFrom(bArr30);
                    }
                    this.W1 = n00Var3;
                }
                zArr[90] = true;
                return 0;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_IN_PREPARE /* 91 */:
                java.util.LinkedList j99 = aVar2.j(intValue);
                int size31 = j99.size();
                for (int i100 = 0; i100 < size31; i100++) {
                    byte[] bArr31 = (byte[]) j99.get(i100);
                    bw5.s00 s00Var3 = new bw5.s00();
                    if (bArr31 != null && bArr31.length > 0) {
                        s00Var3.parseFrom(bArr31);
                    }
                    this.X1 = s00Var3;
                }
                zArr[91] = true;
                return 0;
        }
    }
}
