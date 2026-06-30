package bw5;

/* loaded from: classes4.dex */
public class fk0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;
    public long B;
    public int B1;
    public int C;
    public int E;
    public int F;
    public r45.cu5 H;
    public bw5.ik0 I;

    /* renamed from: J, reason: collision with root package name */
    public bw5.gh0 f108848J;
    public bw5.qj0 K;
    public int L;
    public int M;
    public int P;
    public int Q;
    public int S;
    public int U;
    public int V;
    public int X;
    public int Z;

    /* renamed from: d, reason: collision with root package name */
    public long f108849d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f108850e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108851f;

    /* renamed from: g, reason: collision with root package name */
    public int f108852g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f108853h;

    /* renamed from: i, reason: collision with root package name */
    public int f108854i;

    /* renamed from: l1, reason: collision with root package name */
    public int f108855l1;

    /* renamed from: m, reason: collision with root package name */
    public int f108856m;

    /* renamed from: n, reason: collision with root package name */
    public int f108857n;

    /* renamed from: p, reason: collision with root package name */
    public int f108859p;

    /* renamed from: p0, reason: collision with root package name */
    public int f108860p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f108861p1;

    /* renamed from: q, reason: collision with root package name */
    public int f108862q;

    /* renamed from: s, reason: collision with root package name */
    public int f108864s;

    /* renamed from: t, reason: collision with root package name */
    public int f108865t;

    /* renamed from: v, reason: collision with root package name */
    public int f108867v;

    /* renamed from: w, reason: collision with root package name */
    public int f108868w;

    /* renamed from: x, reason: collision with root package name */
    public int f108869x;

    /* renamed from: x0, reason: collision with root package name */
    public int f108870x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f108871x1;

    /* renamed from: y0, reason: collision with root package name */
    public int f108873y0;

    /* renamed from: y1, reason: collision with root package name */
    public int f108874y1;

    /* renamed from: z, reason: collision with root package name */
    public int f108875z;

    /* renamed from: z1, reason: collision with root package name */
    public int f108876z1;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f108858o = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f108863r = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f108866u = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f108872y = new java.util.LinkedList();
    public final java.util.LinkedList D = new java.util.LinkedList();
    public final java.util.LinkedList G = new java.util.LinkedList();
    public final java.util.LinkedList N = new java.util.LinkedList();
    public final java.util.LinkedList R = new java.util.LinkedList();
    public final java.util.LinkedList T = new java.util.LinkedList();
    public final java.util.LinkedList W = new java.util.LinkedList();
    public final java.util.LinkedList Y = new java.util.LinkedList();
    public final java.util.LinkedList A1 = new java.util.LinkedList();
    public final boolean[] C1 = new boolean[57];

    static {
        new bw5.fk0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fk0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.fk0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fk0)) {
            return false;
        }
        bw5.fk0 fk0Var = (bw5.fk0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f108849d), java.lang.Long.valueOf(fk0Var.f108849d)) && n51.f.a(this.f108850e, fk0Var.f108850e) && n51.f.a(this.f108851f, fk0Var.f108851f) && n51.f.a(java.lang.Integer.valueOf(this.f108852g), java.lang.Integer.valueOf(fk0Var.f108852g)) && n51.f.a(this.f108853h, fk0Var.f108853h) && n51.f.a(java.lang.Integer.valueOf(this.f108854i), java.lang.Integer.valueOf(fk0Var.f108854i)) && n51.f.a(java.lang.Integer.valueOf(this.f108856m), java.lang.Integer.valueOf(fk0Var.f108856m)) && n51.f.a(java.lang.Integer.valueOf(this.f108857n), java.lang.Integer.valueOf(fk0Var.f108857n)) && n51.f.a(this.f108858o, fk0Var.f108858o) && n51.f.a(java.lang.Integer.valueOf(this.f108859p), java.lang.Integer.valueOf(fk0Var.f108859p)) && n51.f.a(java.lang.Integer.valueOf(this.f108862q), java.lang.Integer.valueOf(fk0Var.f108862q)) && n51.f.a(this.f108863r, fk0Var.f108863r) && n51.f.a(java.lang.Integer.valueOf(this.f108864s), java.lang.Integer.valueOf(fk0Var.f108864s)) && n51.f.a(java.lang.Integer.valueOf(this.f108865t), java.lang.Integer.valueOf(fk0Var.f108865t)) && n51.f.a(this.f108866u, fk0Var.f108866u) && n51.f.a(java.lang.Integer.valueOf(this.f108867v), java.lang.Integer.valueOf(fk0Var.f108867v)) && n51.f.a(java.lang.Integer.valueOf(this.f108868w), java.lang.Integer.valueOf(fk0Var.f108868w)) && n51.f.a(java.lang.Integer.valueOf(this.f108869x), java.lang.Integer.valueOf(fk0Var.f108869x)) && n51.f.a(this.f108872y, fk0Var.f108872y) && n51.f.a(java.lang.Integer.valueOf(this.f108875z), java.lang.Integer.valueOf(fk0Var.f108875z)) && n51.f.a(this.A, fk0Var.A) && n51.f.a(java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(fk0Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(fk0Var.C)) && n51.f.a(this.D, fk0Var.D) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(fk0Var.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(fk0Var.F)) && n51.f.a(this.G, fk0Var.G) && n51.f.a(this.H, fk0Var.H) && n51.f.a(this.I, fk0Var.I) && n51.f.a(this.f108848J, fk0Var.f108848J) && n51.f.a(this.K, fk0Var.K) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(fk0Var.L)) && n51.f.a(java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(fk0Var.M)) && n51.f.a(this.N, fk0Var.N) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(fk0Var.P)) && n51.f.a(java.lang.Integer.valueOf(this.Q), java.lang.Integer.valueOf(fk0Var.Q)) && n51.f.a(this.R, fk0Var.R) && n51.f.a(java.lang.Integer.valueOf(this.S), java.lang.Integer.valueOf(fk0Var.S)) && n51.f.a(this.T, fk0Var.T) && n51.f.a(java.lang.Integer.valueOf(this.U), java.lang.Integer.valueOf(fk0Var.U)) && n51.f.a(java.lang.Integer.valueOf(this.V), java.lang.Integer.valueOf(fk0Var.V)) && n51.f.a(this.W, fk0Var.W) && n51.f.a(java.lang.Integer.valueOf(this.X), java.lang.Integer.valueOf(fk0Var.X)) && n51.f.a(this.Y, fk0Var.Y) && n51.f.a(java.lang.Integer.valueOf(this.Z), java.lang.Integer.valueOf(fk0Var.Z)) && n51.f.a(java.lang.Integer.valueOf(this.f108860p0), java.lang.Integer.valueOf(fk0Var.f108860p0)) && n51.f.a(java.lang.Integer.valueOf(this.f108870x0), java.lang.Integer.valueOf(fk0Var.f108870x0)) && n51.f.a(java.lang.Integer.valueOf(this.f108873y0), java.lang.Integer.valueOf(fk0Var.f108873y0)) && n51.f.a(java.lang.Integer.valueOf(this.f108855l1), java.lang.Integer.valueOf(fk0Var.f108855l1)) && n51.f.a(java.lang.Integer.valueOf(this.f108861p1), java.lang.Integer.valueOf(fk0Var.f108861p1)) && n51.f.a(java.lang.Integer.valueOf(this.f108871x1), java.lang.Integer.valueOf(fk0Var.f108871x1)) && n51.f.a(java.lang.Integer.valueOf(this.f108874y1), java.lang.Integer.valueOf(fk0Var.f108874y1)) && n51.f.a(java.lang.Integer.valueOf(this.f108876z1), java.lang.Integer.valueOf(fk0Var.f108876z1)) && n51.f.a(this.A1, fk0Var.A1) && n51.f.a(java.lang.Integer.valueOf(this.B1), java.lang.Integer.valueOf(fk0Var.B1));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fk0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.C1;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f108849d);
            }
            java.lang.String str = this.f108850e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f108851f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.f(4, this.f108852g);
            }
            r45.cu5 cu5Var = this.f108853h;
            if (cu5Var != null && zArr[5]) {
                fVar.i(5, cu5Var.mo75928xcd1e8d8());
                this.f108853h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[6]) {
                fVar.f(6, this.f108854i);
            }
            if (zArr[7]) {
                fVar.f(7, this.f108856m);
            }
            if (zArr[8]) {
                fVar.f(8, this.f108857n);
            }
            fVar.g(9, 8, this.f108858o);
            if (zArr[10]) {
                fVar.f(10, this.f108859p);
            }
            if (zArr[11]) {
                fVar.f(11, this.f108862q);
            }
            fVar.g(12, 8, this.f108863r);
            if (zArr[13]) {
                fVar.f(13, this.f108864s);
            }
            if (zArr[14]) {
                fVar.f(14, this.f108865t);
            }
            fVar.g(15, 8, this.f108866u);
            if (zArr[16]) {
                fVar.f(16, this.f108867v);
            }
            if (zArr[17]) {
                fVar.f(17, this.f108868w);
            }
            if (zArr[18]) {
                fVar.f(18, this.f108869x);
            }
            fVar.g(19, 8, this.f108872y);
            if (zArr[20]) {
                fVar.f(20, this.f108875z);
            }
            java.lang.String str3 = this.A;
            if (str3 != null && zArr[21]) {
                fVar.j(21, str3);
            }
            if (zArr[22]) {
                fVar.h(22, this.B);
            }
            if (zArr[23]) {
                fVar.f(23, this.C);
            }
            fVar.g(24, 8, this.D);
            if (zArr[25]) {
                fVar.f(25, this.E);
            }
            if (zArr[26]) {
                fVar.f(26, this.F);
            }
            fVar.g(27, 8, this.G);
            r45.cu5 cu5Var2 = this.H;
            if (cu5Var2 != null && zArr[28]) {
                fVar.i(28, cu5Var2.mo75928xcd1e8d8());
                this.H.mo75956x3d5d1f78(fVar);
            }
            bw5.ik0 ik0Var = this.I;
            if (ik0Var != null && zArr[29]) {
                fVar.i(29, ik0Var.mo75928xcd1e8d8());
                this.I.mo75956x3d5d1f78(fVar);
            }
            bw5.gh0 gh0Var = this.f108848J;
            if (gh0Var != null && zArr[30]) {
                fVar.i(30, gh0Var.mo75928xcd1e8d8());
                this.f108848J.mo75956x3d5d1f78(fVar);
            }
            bw5.qj0 qj0Var = this.K;
            if (qj0Var != null && zArr[31]) {
                fVar.i(31, qj0Var.mo75928xcd1e8d8());
                this.K.mo75956x3d5d1f78(fVar);
            }
            if (zArr[32]) {
                fVar.f(32, this.L);
            }
            if (zArr[34]) {
                fVar.f(34, this.M);
            }
            fVar.g(35, 8, this.N);
            if (zArr[36]) {
                fVar.f(36, this.P);
            }
            if (zArr[37]) {
                fVar.f(37, this.Q);
            }
            fVar.g(38, 8, this.R);
            if (zArr[39]) {
                fVar.f(39, this.S);
            }
            fVar.g(40, 8, this.T);
            if (zArr[41]) {
                fVar.f(41, this.U);
            }
            if (zArr[42]) {
                fVar.f(42, this.V);
            }
            fVar.g(43, 2, this.W);
            if (zArr[44]) {
                fVar.f(44, this.X);
            }
            fVar.g(45, 2, this.Y);
            if (zArr[46]) {
                fVar.f(46, this.Z);
            }
            if (zArr[47]) {
                fVar.f(47, this.f108860p0);
            }
            if (zArr[48]) {
                fVar.f(48, this.f108870x0);
            }
            if (zArr[49]) {
                fVar.f(49, this.f108873y0);
            }
            if (zArr[50]) {
                fVar.f(50, this.f108855l1);
            }
            if (zArr[51]) {
                fVar.f(51, this.f108861p1);
            }
            if (zArr[52]) {
                fVar.f(52, this.f108871x1);
            }
            if (zArr[53]) {
                fVar.f(53, this.f108874y1);
            }
            if (zArr[54]) {
                fVar.f(54, this.f108876z1);
            }
            fVar.g(55, 8, this.A1);
            if (zArr[56]) {
                fVar.f(56, this.B1);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f108849d) + 0 : 0;
            java.lang.String str4 = this.f108850e;
            if (str4 != null && zArr[2]) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f108851f;
            if (str5 != null && zArr[3]) {
                h17 += b36.f.j(3, str5);
            }
            if (zArr[4]) {
                h17 += b36.f.f(4, this.f108852g);
            }
            r45.cu5 cu5Var3 = this.f108853h;
            if (cu5Var3 != null && zArr[5]) {
                h17 += b36.f.i(5, cu5Var3.mo75928xcd1e8d8());
            }
            if (zArr[6]) {
                h17 += b36.f.f(6, this.f108854i);
            }
            if (zArr[7]) {
                h17 += b36.f.f(7, this.f108856m);
            }
            if (zArr[8]) {
                h17 += b36.f.f(8, this.f108857n);
            }
            int g17 = h17 + b36.f.g(9, 8, this.f108858o);
            if (zArr[10]) {
                g17 += b36.f.f(10, this.f108859p);
            }
            if (zArr[11]) {
                g17 += b36.f.f(11, this.f108862q);
            }
            int g18 = g17 + b36.f.g(12, 8, this.f108863r);
            if (zArr[13]) {
                g18 += b36.f.f(13, this.f108864s);
            }
            if (zArr[14]) {
                g18 += b36.f.f(14, this.f108865t);
            }
            int g19 = g18 + b36.f.g(15, 8, this.f108866u);
            if (zArr[16]) {
                g19 += b36.f.f(16, this.f108867v);
            }
            if (zArr[17]) {
                g19 += b36.f.f(17, this.f108868w);
            }
            if (zArr[18]) {
                g19 += b36.f.f(18, this.f108869x);
            }
            int g27 = g19 + b36.f.g(19, 8, this.f108872y);
            if (zArr[20]) {
                g27 += b36.f.f(20, this.f108875z);
            }
            java.lang.String str6 = this.A;
            if (str6 != null && zArr[21]) {
                g27 += b36.f.j(21, str6);
            }
            if (zArr[22]) {
                g27 += b36.f.h(22, this.B);
            }
            if (zArr[23]) {
                g27 += b36.f.f(23, this.C);
            }
            int g28 = g27 + b36.f.g(24, 8, this.D);
            if (zArr[25]) {
                g28 += b36.f.f(25, this.E);
            }
            if (zArr[26]) {
                g28 += b36.f.f(26, this.F);
            }
            int g29 = g28 + b36.f.g(27, 8, this.G);
            r45.cu5 cu5Var4 = this.H;
            if (cu5Var4 != null && zArr[28]) {
                g29 += b36.f.i(28, cu5Var4.mo75928xcd1e8d8());
            }
            bw5.ik0 ik0Var2 = this.I;
            if (ik0Var2 != null && zArr[29]) {
                g29 += b36.f.i(29, ik0Var2.mo75928xcd1e8d8());
            }
            bw5.gh0 gh0Var2 = this.f108848J;
            if (gh0Var2 != null && zArr[30]) {
                g29 += b36.f.i(30, gh0Var2.mo75928xcd1e8d8());
            }
            bw5.qj0 qj0Var2 = this.K;
            if (qj0Var2 != null && zArr[31]) {
                g29 += b36.f.i(31, qj0Var2.mo75928xcd1e8d8());
            }
            if (zArr[32]) {
                g29 += b36.f.f(32, this.L);
            }
            if (zArr[34]) {
                g29 += b36.f.f(34, this.M);
            }
            int g37 = g29 + b36.f.g(35, 8, this.N);
            if (zArr[36]) {
                g37 += b36.f.f(36, this.P);
            }
            if (zArr[37]) {
                g37 += b36.f.f(37, this.Q);
            }
            int g38 = g37 + b36.f.g(38, 8, this.R);
            if (zArr[39]) {
                g38 += b36.f.f(39, this.S);
            }
            int g39 = g38 + b36.f.g(40, 8, this.T);
            if (zArr[41]) {
                g39 += b36.f.f(41, this.U);
            }
            if (zArr[42]) {
                g39 += b36.f.f(42, this.V);
            }
            int g47 = g39 + b36.f.g(43, 2, this.W);
            if (zArr[44]) {
                g47 += b36.f.f(44, this.X);
            }
            int g48 = g47 + b36.f.g(45, 2, this.Y);
            if (zArr[46]) {
                g48 += b36.f.f(46, this.Z);
            }
            if (zArr[47]) {
                g48 += b36.f.f(47, this.f108860p0);
            }
            if (zArr[48]) {
                g48 += b36.f.f(48, this.f108870x0);
            }
            if (zArr[49]) {
                g48 += b36.f.f(49, this.f108873y0);
            }
            if (zArr[50]) {
                g48 += b36.f.f(50, this.f108855l1);
            }
            if (zArr[51]) {
                g48 += b36.f.f(51, this.f108861p1);
            }
            if (zArr[52]) {
                g48 += b36.f.f(52, this.f108871x1);
            }
            if (zArr[53]) {
                g48 += b36.f.f(53, this.f108874y1);
            }
            if (zArr[54]) {
                g48 += b36.f.f(54, this.f108876z1);
            }
            int g49 = g48 + b36.f.g(55, 8, this.A1);
            return zArr[56] ? g49 + b36.f.f(56, this.B1) : g49;
        }
        if (i17 == 2) {
            this.f108858o.clear();
            this.f108863r.clear();
            this.f108866u.clear();
            this.f108872y.clear();
            this.D.clear();
            this.G.clear();
            this.N.clear();
            this.R.clear();
            this.T.clear();
            this.W.clear();
            this.Y.clear();
            this.A1.clear();
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
                this.f108849d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108850e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108851f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108852g = aVar2.h(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var5.b(bArr);
                    }
                    this.f108853h = cu5Var5;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f108854i = aVar2.h(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108856m = aVar2.h(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108857n = aVar2.h(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.tj0 tj0Var = new bw5.tj0();
                    if (bArr2 != null && bArr2.length > 0) {
                        tj0Var.mo11468x92b714fd(bArr2);
                    }
                    this.f108858o.add(tj0Var);
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f108859p = aVar2.h(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f108862q = aVar2.h(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.tj0 tj0Var2 = new bw5.tj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        tj0Var2.mo11468x92b714fd(bArr3);
                    }
                    this.f108863r.add(tj0Var2);
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f108864s = aVar2.h(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f108865t = aVar2.h(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.tj0 tj0Var3 = new bw5.tj0();
                    if (bArr4 != null && bArr4.length > 0) {
                        tj0Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f108866u.add(tj0Var3);
                }
                zArr[15] = true;
                return 0;
            case 16:
                this.f108867v = aVar2.h(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f108868w = aVar2.h(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f108869x = aVar2.h(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.yj0 yj0Var = new bw5.yj0();
                    if (bArr5 != null && bArr5.length > 0) {
                        yj0Var.mo11468x92b714fd(bArr5);
                    }
                    this.f108872y.add(yj0Var);
                }
                zArr[19] = true;
                return 0;
            case 20:
                this.f108875z = aVar2.h(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.i(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.h(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr6 != null && bArr6.length > 0) {
                        du5Var.b(bArr6);
                    }
                    this.D.add(du5Var);
                }
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.h(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.h(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr7 != null && bArr7.length > 0) {
                        du5Var2.b(bArr7);
                    }
                    this.G.add(du5Var2);
                }
                zArr[27] = true;
                return 0;
            case 28:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr8 != null && bArr8.length > 0) {
                        cu5Var6.b(bArr8);
                    }
                    this.H = cu5Var6;
                }
                zArr[28] = true;
                return 0;
            case 29:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.ik0 ik0Var3 = new bw5.ik0();
                    if (bArr9 != null && bArr9.length > 0) {
                        ik0Var3.mo11468x92b714fd(bArr9);
                    }
                    this.I = ik0Var3;
                }
                zArr[29] = true;
                return 0;
            case 30:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    bw5.gh0 gh0Var3 = new bw5.gh0();
                    if (bArr10 != null && bArr10.length > 0) {
                        gh0Var3.mo11468x92b714fd(bArr10);
                    }
                    this.f108848J = gh0Var3;
                }
                zArr[30] = true;
                return 0;
            case 31:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr11 = (byte[]) j48.get(i49);
                    bw5.qj0 qj0Var3 = new bw5.qj0();
                    if (bArr11 != null && bArr11.length > 0) {
                        qj0Var3.mo11468x92b714fd(bArr11);
                    }
                    this.K = qj0Var3;
                }
                zArr[31] = true;
                return 0;
            case 32:
                this.L = aVar2.h(intValue);
                zArr[32] = true;
                return 0;
            case 33:
            default:
                return -1;
            case 34:
                this.M = aVar2.h(intValue);
                zArr[34] = true;
                return 0;
            case 35:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i57 = 0; i57 < size12; i57++) {
                    byte[] bArr12 = (byte[]) j49.get(i57);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr12 != null && bArr12.length > 0) {
                        du5Var3.b(bArr12);
                    }
                    this.N.add(du5Var3);
                }
                zArr[35] = true;
                return 0;
            case 36:
                this.P = aVar2.h(intValue);
                zArr[36] = true;
                return 0;
            case 37:
                this.Q = aVar2.h(intValue);
                zArr[37] = true;
                return 0;
            case 38:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i58 = 0; i58 < size13; i58++) {
                    byte[] bArr13 = (byte[]) j57.get(i58);
                    bw5.tj0 tj0Var4 = new bw5.tj0();
                    if (bArr13 != null && bArr13.length > 0) {
                        tj0Var4.mo11468x92b714fd(bArr13);
                    }
                    this.R.add(tj0Var4);
                }
                zArr[38] = true;
                return 0;
            case 39:
                this.S = aVar2.h(intValue);
                zArr[39] = true;
                return 0;
            case 40:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i59 = 0; i59 < size14; i59++) {
                    byte[] bArr14 = (byte[]) j58.get(i59);
                    bw5.tj0 tj0Var5 = new bw5.tj0();
                    if (bArr14 != null && bArr14.length > 0) {
                        tj0Var5.mo11468x92b714fd(bArr14);
                    }
                    this.T.add(tj0Var5);
                }
                zArr[40] = true;
                return 0;
            case 41:
                this.U = aVar2.h(intValue);
                zArr[41] = true;
                return 0;
            case 42:
                this.V = aVar2.h(intValue);
                zArr[42] = true;
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                this.W.add(java.lang.Integer.valueOf(aVar2.h(intValue)));
                zArr[43] = true;
                return 0;
            case 44:
                this.X = aVar2.h(intValue);
                zArr[44] = true;
                return 0;
            case 45:
                this.Y.add(java.lang.Integer.valueOf(aVar2.h(intValue)));
                zArr[45] = true;
                return 0;
            case 46:
                this.Z = aVar2.h(intValue);
                zArr[46] = true;
                return 0;
            case 47:
                this.f108860p0 = aVar2.h(intValue);
                zArr[47] = true;
                return 0;
            case 48:
                this.f108870x0 = aVar2.h(intValue);
                zArr[48] = true;
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                this.f108873y0 = aVar2.h(intValue);
                zArr[49] = true;
                return 0;
            case 50:
                this.f108855l1 = aVar2.h(intValue);
                zArr[50] = true;
                return 0;
            case 51:
                this.f108861p1 = aVar2.h(intValue);
                zArr[51] = true;
                return 0;
            case 52:
                this.f108871x1 = aVar2.h(intValue);
                zArr[52] = true;
                return 0;
            case 53:
                this.f108874y1 = aVar2.h(intValue);
                zArr[53] = true;
                return 0;
            case 54:
                this.f108876z1 = aVar2.h(intValue);
                zArr[54] = true;
                return 0;
            case 55:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i66 = 0; i66 < size15; i66++) {
                    byte[] bArr15 = (byte[]) j59.get(i66);
                    r45.du5 du5Var4 = new r45.du5();
                    if (bArr15 != null && bArr15.length > 0) {
                        du5Var4.b(bArr15);
                    }
                    this.A1.add(du5Var4);
                }
                zArr[55] = true;
                return 0;
            case 56:
                this.B1 = aVar2.h(intValue);
                zArr[56] = true;
                return 0;
        }
    }
}
