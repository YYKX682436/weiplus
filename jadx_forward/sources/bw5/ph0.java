package bw5;

/* loaded from: classes9.dex */
public class ph0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public int B;
    public bw5.x7 D;
    public int E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;
    public int K;
    public java.lang.String L;
    public int M;
    public int N;
    public int P;
    public int Q;
    public java.lang.String R;
    public java.lang.String S;
    public bw5.xh0 W;
    public bw5.ih0 X;
    public bw5.vh0 Y;
    public bw5.vh0 Z;

    /* renamed from: d, reason: collision with root package name */
    public long f113165d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113166e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113167f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113168g;

    /* renamed from: h, reason: collision with root package name */
    public long f113169h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.y5 f113170i;

    /* renamed from: l1, reason: collision with root package name */
    public int f113171l1;

    /* renamed from: m, reason: collision with root package name */
    public int f113172m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.x7 f113173n;

    /* renamed from: o, reason: collision with root package name */
    public int f113174o;

    /* renamed from: p, reason: collision with root package name */
    public long f113175p;

    /* renamed from: p1, reason: collision with root package name */
    public bw5.c9 f113177p1;

    /* renamed from: q, reason: collision with root package name */
    public int f113178q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f113179r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f113180s;

    /* renamed from: t, reason: collision with root package name */
    public long f113181t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f113182u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f113183v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f113184w;

    /* renamed from: x, reason: collision with root package name */
    public long f113185x;

    /* renamed from: x0, reason: collision with root package name */
    public long f113186x0;

    /* renamed from: x1, reason: collision with root package name */
    public bw5.uh0 f113187x1;

    /* renamed from: y, reason: collision with root package name */
    public int f113188y;

    /* renamed from: y0, reason: collision with root package name */
    public int f113189y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f113190y1;

    /* renamed from: z, reason: collision with root package name */
    public int f113191z;
    public final java.util.LinkedList C = new java.util.LinkedList();

    /* renamed from: J, reason: collision with root package name */
    public final java.util.LinkedList f113164J = new java.util.LinkedList();
    public final java.util.LinkedList T = new java.util.LinkedList();
    public final java.util.LinkedList U = new java.util.LinkedList();
    public final java.util.LinkedList V = new java.util.LinkedList();

    /* renamed from: p0, reason: collision with root package name */
    public final java.util.LinkedList f113176p0 = new java.util.LinkedList();

    /* renamed from: z1, reason: collision with root package name */
    public final boolean[] f113192z1 = new boolean[59];

    static {
        new bw5.ph0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ph0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ph0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ph0)) {
            return false;
        }
        bw5.ph0 ph0Var = (bw5.ph0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f113165d), java.lang.Long.valueOf(ph0Var.f113165d)) && n51.f.a(this.f113166e, ph0Var.f113166e) && n51.f.a(this.f113167f, ph0Var.f113167f) && n51.f.a(this.f113168g, ph0Var.f113168g) && n51.f.a(java.lang.Long.valueOf(this.f113169h), java.lang.Long.valueOf(ph0Var.f113169h)) && n51.f.a(this.f113170i, ph0Var.f113170i) && n51.f.a(java.lang.Integer.valueOf(this.f113172m), java.lang.Integer.valueOf(ph0Var.f113172m)) && n51.f.a(this.f113173n, ph0Var.f113173n) && n51.f.a(java.lang.Integer.valueOf(this.f113174o), java.lang.Integer.valueOf(ph0Var.f113174o)) && n51.f.a(java.lang.Long.valueOf(this.f113175p), java.lang.Long.valueOf(ph0Var.f113175p)) && n51.f.a(java.lang.Integer.valueOf(this.f113178q), java.lang.Integer.valueOf(ph0Var.f113178q)) && n51.f.a(this.f113179r, ph0Var.f113179r) && n51.f.a(this.f113180s, ph0Var.f113180s) && n51.f.a(java.lang.Long.valueOf(this.f113181t), java.lang.Long.valueOf(ph0Var.f113181t)) && n51.f.a(this.f113182u, ph0Var.f113182u) && n51.f.a(this.f113183v, ph0Var.f113183v) && n51.f.a(this.f113184w, ph0Var.f113184w) && n51.f.a(java.lang.Long.valueOf(this.f113185x), java.lang.Long.valueOf(ph0Var.f113185x)) && n51.f.a(java.lang.Integer.valueOf(this.f113188y), java.lang.Integer.valueOf(ph0Var.f113188y)) && n51.f.a(java.lang.Integer.valueOf(this.f113191z), java.lang.Integer.valueOf(ph0Var.f113191z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(ph0Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(ph0Var.B)) && n51.f.a(this.C, ph0Var.C) && n51.f.a(this.D, ph0Var.D) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(ph0Var.E)) && n51.f.a(this.F, ph0Var.F) && n51.f.a(this.G, ph0Var.G) && n51.f.a(this.H, ph0Var.H) && n51.f.a(this.I, ph0Var.I) && n51.f.a(this.f113164J, ph0Var.f113164J) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(ph0Var.K)) && n51.f.a(this.L, ph0Var.L) && n51.f.a(java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(ph0Var.M)) && n51.f.a(java.lang.Integer.valueOf(this.N), java.lang.Integer.valueOf(ph0Var.N)) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(ph0Var.P)) && n51.f.a(java.lang.Integer.valueOf(this.Q), java.lang.Integer.valueOf(ph0Var.Q)) && n51.f.a(this.R, ph0Var.R) && n51.f.a(this.S, ph0Var.S) && n51.f.a(this.T, ph0Var.T) && n51.f.a(this.U, ph0Var.U) && n51.f.a(this.V, ph0Var.V) && n51.f.a(this.W, ph0Var.W) && n51.f.a(this.X, ph0Var.X) && n51.f.a(this.Y, ph0Var.Y) && n51.f.a(this.Z, ph0Var.Z) && n51.f.a(this.f113176p0, ph0Var.f113176p0) && n51.f.a(java.lang.Long.valueOf(this.f113186x0), java.lang.Long.valueOf(ph0Var.f113186x0)) && n51.f.a(java.lang.Integer.valueOf(this.f113189y0), java.lang.Integer.valueOf(ph0Var.f113189y0)) && n51.f.a(java.lang.Integer.valueOf(this.f113171l1), java.lang.Integer.valueOf(ph0Var.f113171l1)) && n51.f.a(this.f113177p1, ph0Var.f113177p1) && n51.f.a(this.f113187x1, ph0Var.f113187x1) && n51.f.a(this.f113190y1, ph0Var.f113190y1);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ph0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113192z1;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f113165d);
            }
            java.lang.String str = this.f113166e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f113167f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f113168g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.h(5, this.f113169h);
            }
            bw5.y5 y5Var = this.f113170i;
            if (y5Var != null && zArr[6]) {
                fVar.i(6, y5Var.mo75928xcd1e8d8());
                this.f113170i.mo75956x3d5d1f78(fVar);
            }
            if (zArr[7]) {
                fVar.f(7, this.f113172m);
            }
            bw5.x7 x7Var = this.f113173n;
            if (x7Var != null && zArr[8]) {
                fVar.i(8, x7Var.mo75928xcd1e8d8());
                this.f113173n.mo75956x3d5d1f78(fVar);
            }
            if (zArr[9]) {
                fVar.f(9, this.f113174o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f113175p);
            }
            if (zArr[11]) {
                fVar.f(11, this.f113178q);
            }
            java.lang.String str4 = this.f113179r;
            if (str4 != null && zArr[12]) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f113180s;
            if (str5 != null && zArr[13]) {
                fVar.j(13, str5);
            }
            if (zArr[14]) {
                fVar.h(14, this.f113181t);
            }
            java.lang.String str6 = this.f113182u;
            if (str6 != null && zArr[15]) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.f113183v;
            if (str7 != null && zArr[16]) {
                fVar.j(16, str7);
            }
            java.lang.String str8 = this.f113184w;
            if (str8 != null && zArr[17]) {
                fVar.j(17, str8);
            }
            if (zArr[18]) {
                fVar.h(18, this.f113185x);
            }
            if (zArr[19]) {
                fVar.f(19, this.f113188y);
            }
            if (zArr[20]) {
                fVar.f(20, this.f113191z);
            }
            if (zArr[21]) {
                fVar.f(21, this.A);
            }
            if (zArr[22]) {
                fVar.f(22, this.B);
            }
            fVar.g(23, 8, this.C);
            bw5.x7 x7Var2 = this.D;
            if (x7Var2 != null && zArr[24]) {
                fVar.i(24, x7Var2.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            if (zArr[25]) {
                fVar.f(25, this.E);
            }
            java.lang.String str9 = this.F;
            if (str9 != null && zArr[26]) {
                fVar.j(26, str9);
            }
            java.lang.String str10 = this.G;
            if (str10 != null && zArr[27]) {
                fVar.j(27, str10);
            }
            java.lang.String str11 = this.H;
            if (str11 != null && zArr[28]) {
                fVar.j(28, str11);
            }
            java.lang.String str12 = this.I;
            if (str12 != null && zArr[29]) {
                fVar.j(29, str12);
            }
            fVar.g(30, 8, this.f113164J);
            if (zArr[31]) {
                fVar.f(31, this.K);
            }
            java.lang.String str13 = this.L;
            if (str13 != null && zArr[32]) {
                fVar.j(32, str13);
            }
            if (zArr[33]) {
                fVar.f(33, this.M);
            }
            if (zArr[34]) {
                fVar.f(34, this.N);
            }
            if (zArr[35]) {
                fVar.f(35, this.P);
            }
            if (zArr[36]) {
                fVar.f(36, this.Q);
            }
            java.lang.String str14 = this.R;
            if (str14 != null && zArr[37]) {
                fVar.j(37, str14);
            }
            java.lang.String str15 = this.S;
            if (str15 != null && zArr[38]) {
                fVar.j(38, str15);
            }
            fVar.g(39, 8, this.T);
            fVar.g(40, 8, this.U);
            fVar.g(41, 8, this.V);
            bw5.xh0 xh0Var = this.W;
            if (xh0Var != null && zArr[42]) {
                fVar.i(42, xh0Var.mo75928xcd1e8d8());
                this.W.mo75956x3d5d1f78(fVar);
            }
            bw5.ih0 ih0Var = this.X;
            if (ih0Var != null && zArr[43]) {
                fVar.i(43, ih0Var.mo75928xcd1e8d8());
                this.X.mo75956x3d5d1f78(fVar);
            }
            bw5.vh0 vh0Var = this.Y;
            if (vh0Var != null && zArr[44]) {
                fVar.i(44, vh0Var.mo75928xcd1e8d8());
                this.Y.mo75956x3d5d1f78(fVar);
            }
            bw5.vh0 vh0Var2 = this.Z;
            if (vh0Var2 != null && zArr[45]) {
                fVar.i(45, vh0Var2.mo75928xcd1e8d8());
                this.Z.mo75956x3d5d1f78(fVar);
            }
            fVar.g(46, 2, this.f113176p0);
            if (zArr[48]) {
                fVar.h(48, this.f113186x0);
            }
            if (zArr[49]) {
                fVar.f(49, this.f113189y0);
            }
            if (zArr[53]) {
                fVar.f(53, this.f113171l1);
            }
            bw5.c9 c9Var = this.f113177p1;
            if (c9Var != null && zArr[56]) {
                fVar.i(56, c9Var.mo75928xcd1e8d8());
                this.f113177p1.mo75956x3d5d1f78(fVar);
            }
            bw5.uh0 uh0Var = this.f113187x1;
            if (uh0Var != null && zArr[57]) {
                fVar.i(57, uh0Var.mo75928xcd1e8d8());
                this.f113187x1.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str16 = this.f113190y1;
            if (str16 != null && zArr[58]) {
                fVar.j(58, str16);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f113165d) + 0 : 0;
            java.lang.String str17 = this.f113166e;
            if (str17 != null && zArr[2]) {
                h17 += b36.f.j(2, str17);
            }
            java.lang.String str18 = this.f113167f;
            if (str18 != null && zArr[3]) {
                h17 += b36.f.j(3, str18);
            }
            java.lang.String str19 = this.f113168g;
            if (str19 != null && zArr[4]) {
                h17 += b36.f.j(4, str19);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f113169h);
            }
            bw5.y5 y5Var2 = this.f113170i;
            if (y5Var2 != null && zArr[6]) {
                h17 += b36.f.i(6, y5Var2.mo75928xcd1e8d8());
            }
            if (zArr[7]) {
                h17 += b36.f.f(7, this.f113172m);
            }
            bw5.x7 x7Var3 = this.f113173n;
            if (x7Var3 != null && zArr[8]) {
                h17 += b36.f.i(8, x7Var3.mo75928xcd1e8d8());
            }
            if (zArr[9]) {
                h17 += b36.f.f(9, this.f113174o);
            }
            if (zArr[10]) {
                h17 += b36.f.h(10, this.f113175p);
            }
            if (zArr[11]) {
                h17 += b36.f.f(11, this.f113178q);
            }
            java.lang.String str20 = this.f113179r;
            if (str20 != null && zArr[12]) {
                h17 += b36.f.j(12, str20);
            }
            java.lang.String str21 = this.f113180s;
            if (str21 != null && zArr[13]) {
                h17 += b36.f.j(13, str21);
            }
            if (zArr[14]) {
                h17 += b36.f.h(14, this.f113181t);
            }
            java.lang.String str22 = this.f113182u;
            if (str22 != null && zArr[15]) {
                h17 += b36.f.j(15, str22);
            }
            java.lang.String str23 = this.f113183v;
            if (str23 != null && zArr[16]) {
                h17 += b36.f.j(16, str23);
            }
            java.lang.String str24 = this.f113184w;
            if (str24 != null && zArr[17]) {
                h17 += b36.f.j(17, str24);
            }
            if (zArr[18]) {
                h17 += b36.f.h(18, this.f113185x);
            }
            if (zArr[19]) {
                h17 += b36.f.f(19, this.f113188y);
            }
            if (zArr[20]) {
                h17 += b36.f.f(20, this.f113191z);
            }
            if (zArr[21]) {
                h17 += b36.f.f(21, this.A);
            }
            if (zArr[22]) {
                h17 += b36.f.f(22, this.B);
            }
            int g17 = h17 + b36.f.g(23, 8, this.C);
            bw5.x7 x7Var4 = this.D;
            if (x7Var4 != null && zArr[24]) {
                g17 += b36.f.i(24, x7Var4.mo75928xcd1e8d8());
            }
            if (zArr[25]) {
                g17 += b36.f.f(25, this.E);
            }
            java.lang.String str25 = this.F;
            if (str25 != null && zArr[26]) {
                g17 += b36.f.j(26, str25);
            }
            java.lang.String str26 = this.G;
            if (str26 != null && zArr[27]) {
                g17 += b36.f.j(27, str26);
            }
            java.lang.String str27 = this.H;
            if (str27 != null && zArr[28]) {
                g17 += b36.f.j(28, str27);
            }
            java.lang.String str28 = this.I;
            if (str28 != null && zArr[29]) {
                g17 += b36.f.j(29, str28);
            }
            int g18 = g17 + b36.f.g(30, 8, this.f113164J);
            if (zArr[31]) {
                g18 += b36.f.f(31, this.K);
            }
            java.lang.String str29 = this.L;
            if (str29 != null && zArr[32]) {
                g18 += b36.f.j(32, str29);
            }
            if (zArr[33]) {
                g18 += b36.f.f(33, this.M);
            }
            if (zArr[34]) {
                g18 += b36.f.f(34, this.N);
            }
            if (zArr[35]) {
                g18 += b36.f.f(35, this.P);
            }
            if (zArr[36]) {
                g18 += b36.f.f(36, this.Q);
            }
            java.lang.String str30 = this.R;
            if (str30 != null && zArr[37]) {
                g18 += b36.f.j(37, str30);
            }
            java.lang.String str31 = this.S;
            if (str31 != null && zArr[38]) {
                g18 += b36.f.j(38, str31);
            }
            int g19 = g18 + b36.f.g(39, 8, this.T) + b36.f.g(40, 8, this.U) + b36.f.g(41, 8, this.V);
            bw5.xh0 xh0Var2 = this.W;
            if (xh0Var2 != null && zArr[42]) {
                g19 += b36.f.i(42, xh0Var2.mo75928xcd1e8d8());
            }
            bw5.ih0 ih0Var2 = this.X;
            if (ih0Var2 != null && zArr[43]) {
                g19 += b36.f.i(43, ih0Var2.mo75928xcd1e8d8());
            }
            bw5.vh0 vh0Var3 = this.Y;
            if (vh0Var3 != null && zArr[44]) {
                g19 += b36.f.i(44, vh0Var3.mo75928xcd1e8d8());
            }
            bw5.vh0 vh0Var4 = this.Z;
            if (vh0Var4 != null && zArr[45]) {
                g19 += b36.f.i(45, vh0Var4.mo75928xcd1e8d8());
            }
            int g27 = g19 + b36.f.g(46, 2, this.f113176p0);
            if (zArr[48]) {
                g27 += b36.f.h(48, this.f113186x0);
            }
            if (zArr[49]) {
                g27 += b36.f.f(49, this.f113189y0);
            }
            if (zArr[53]) {
                g27 += b36.f.f(53, this.f113171l1);
            }
            bw5.c9 c9Var2 = this.f113177p1;
            if (c9Var2 != null && zArr[56]) {
                g27 += b36.f.i(56, c9Var2.mo75928xcd1e8d8());
            }
            bw5.uh0 uh0Var2 = this.f113187x1;
            if (uh0Var2 != null && zArr[57]) {
                g27 += b36.f.i(57, uh0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str32 = this.f113190y1;
            return (str32 == null || !zArr[58]) ? g27 : g27 + b36.f.j(58, str32);
        }
        if (i17 == 2) {
            this.C.clear();
            this.f113164J.clear();
            this.T.clear();
            this.U.clear();
            this.V.clear();
            this.f113176p0.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
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
                this.f113165d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113166e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113167f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113168g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113169h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.y5 y5Var3 = new bw5.y5();
                    if (bArr != null && bArr.length > 0) {
                        y5Var3.mo11468x92b714fd(bArr);
                    }
                    this.f113170i = y5Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f113172m = aVar2.h(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.x7 x7Var5 = new bw5.x7();
                    if (bArr2 != null && bArr2.length > 0) {
                        x7Var5.mo11468x92b714fd(bArr2);
                    }
                    this.f113173n = x7Var5;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f113174o = aVar2.h(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f113175p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f113178q = aVar2.h(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f113179r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f113180s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f113181t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f113182u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f113183v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f113184w = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f113185x = aVar2.i(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f113188y = aVar2.h(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f113191z = aVar2.h(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.h(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.h(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.lh0 lh0Var = new bw5.lh0();
                    if (bArr3 != null && bArr3.length > 0) {
                        lh0Var.mo11468x92b714fd(bArr3);
                    }
                    this.C.add(lh0Var);
                }
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.x7 x7Var6 = new bw5.x7();
                    if (bArr4 != null && bArr4.length > 0) {
                        x7Var6.mo11468x92b714fd(bArr4);
                    }
                    this.D = x7Var6;
                }
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.h(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.k(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.G = aVar2.k(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.H = aVar2.k(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.I = aVar2.k(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.mh0 mh0Var = new bw5.mh0();
                    if (bArr5 != null && bArr5.length > 0) {
                        mh0Var.mo11468x92b714fd(bArr5);
                    }
                    this.f113164J.add(mh0Var);
                }
                zArr[30] = true;
                return 0;
            case 31:
                this.K = aVar2.h(intValue);
                zArr[31] = true;
                return 0;
            case 32:
                this.L = aVar2.k(intValue);
                zArr[32] = true;
                return 0;
            case 33:
                this.M = aVar2.h(intValue);
                zArr[33] = true;
                return 0;
            case 34:
                this.N = aVar2.h(intValue);
                zArr[34] = true;
                return 0;
            case 35:
                this.P = aVar2.h(intValue);
                zArr[35] = true;
                return 0;
            case 36:
                this.Q = aVar2.h(intValue);
                zArr[36] = true;
                return 0;
            case 37:
                this.R = aVar2.k(intValue);
                zArr[37] = true;
                return 0;
            case 38:
                this.S = aVar2.k(intValue);
                zArr[38] = true;
                return 0;
            case 39:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.vh0 vh0Var5 = new bw5.vh0();
                    if (bArr6 != null && bArr6.length > 0) {
                        vh0Var5.mo11468x92b714fd(bArr6);
                    }
                    this.T.add(vh0Var5);
                }
                zArr[39] = true;
                return 0;
            case 40:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.vh0 vh0Var6 = new bw5.vh0();
                    if (bArr7 != null && bArr7.length > 0) {
                        vh0Var6.mo11468x92b714fd(bArr7);
                    }
                    this.U.add(vh0Var6);
                }
                zArr[40] = true;
                return 0;
            case 41:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.vh0 vh0Var7 = new bw5.vh0();
                    if (bArr8 != null && bArr8.length > 0) {
                        vh0Var7.mo11468x92b714fd(bArr8);
                    }
                    this.V.add(vh0Var7);
                }
                zArr[41] = true;
                return 0;
            case 42:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.xh0 xh0Var3 = new bw5.xh0();
                    if (bArr9 != null && bArr9.length > 0) {
                        xh0Var3.mo11468x92b714fd(bArr9);
                    }
                    this.W = xh0Var3;
                }
                zArr[42] = true;
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    bw5.ih0 ih0Var3 = new bw5.ih0();
                    if (bArr10 != null && bArr10.length > 0) {
                        ih0Var3.mo11468x92b714fd(bArr10);
                    }
                    this.X = ih0Var3;
                }
                zArr[43] = true;
                return 0;
            case 44:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr11 = (byte[]) j48.get(i49);
                    bw5.vh0 vh0Var8 = new bw5.vh0();
                    if (bArr11 != null && bArr11.length > 0) {
                        vh0Var8.mo11468x92b714fd(bArr11);
                    }
                    this.Y = vh0Var8;
                }
                zArr[44] = true;
                return 0;
            case 45:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i57 = 0; i57 < size12; i57++) {
                    byte[] bArr12 = (byte[]) j49.get(i57);
                    bw5.vh0 vh0Var9 = new bw5.vh0();
                    if (bArr12 != null && bArr12.length > 0) {
                        vh0Var9.mo11468x92b714fd(bArr12);
                    }
                    this.Z = vh0Var9;
                }
                zArr[45] = true;
                return 0;
            case 46:
                this.f113176p0.add(java.lang.Integer.valueOf(aVar2.h(intValue)));
                zArr[46] = true;
                return 0;
            case 47:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            default:
                return -1;
            case 48:
                this.f113186x0 = aVar2.i(intValue);
                zArr[48] = true;
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                this.f113189y0 = aVar2.h(intValue);
                zArr[49] = true;
                return 0;
            case 53:
                this.f113171l1 = aVar2.h(intValue);
                zArr[53] = true;
                return 0;
            case 56:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i58 = 0; i58 < size13; i58++) {
                    byte[] bArr13 = (byte[]) j57.get(i58);
                    bw5.c9 c9Var3 = new bw5.c9();
                    if (bArr13 != null && bArr13.length > 0) {
                        c9Var3.mo11468x92b714fd(bArr13);
                    }
                    this.f113177p1 = c9Var3;
                }
                zArr[56] = true;
                return 0;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1.f34664x366c91de /* 57 */:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i59 = 0; i59 < size14; i59++) {
                    byte[] bArr14 = (byte[]) j58.get(i59);
                    bw5.uh0 uh0Var3 = new bw5.uh0();
                    if (bArr14 != null && bArr14.length > 0) {
                        uh0Var3.mo11468x92b714fd(bArr14);
                    }
                    this.f113187x1 = uh0Var3;
                }
                zArr[57] = true;
                return 0;
            case 58:
                this.f113190y1 = aVar2.k(intValue);
                zArr[58] = true;
                return 0;
        }
    }
}
