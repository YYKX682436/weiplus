package bw5;

/* loaded from: classes2.dex */
public class pj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public java.lang.String B;
    public int C;
    public boolean D;
    public bw5.ui E;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f113203J;
    public java.lang.String K;
    public int M;
    public java.lang.String N;
    public boolean P;
    public java.lang.String Q;
    public java.lang.String R;
    public bw5.dj S;
    public java.lang.String T;
    public java.lang.String U;
    public bw5.ji V;
    public int W;
    public java.lang.String X;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g Y;
    public int Z;

    /* renamed from: d, reason: collision with root package name */
    public int f113204d;

    /* renamed from: e, reason: collision with root package name */
    public int f113205e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113206f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113207g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f113208h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f113209i;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f113210l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f113211m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.zi f113212n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.mi f113213o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.aj f113214p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f113215p0;

    /* renamed from: q, reason: collision with root package name */
    public bw5.kj f113217q;

    /* renamed from: r, reason: collision with root package name */
    public int f113218r;

    /* renamed from: s, reason: collision with root package name */
    public int f113219s;

    /* renamed from: t, reason: collision with root package name */
    public int f113220t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f113221u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f113222v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f113223w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.rj f113224x;

    /* renamed from: x0, reason: collision with root package name */
    public int f113225x0;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f113226y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f113227y0;

    /* renamed from: z, reason: collision with root package name */
    public int f113228z;
    public final java.util.LinkedList F = new java.util.LinkedList();
    public final java.util.LinkedList L = new java.util.LinkedList();

    /* renamed from: p1, reason: collision with root package name */
    public final boolean[] f113216p1 = new boolean[55];

    static {
        new bw5.pj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pj mo11468x92b714fd(byte[] bArr) {
        return (bw5.pj) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pj)) {
            return false;
        }
        bw5.pj pjVar = (bw5.pj) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113204d), java.lang.Integer.valueOf(pjVar.f113204d)) && n51.f.a(java.lang.Integer.valueOf(this.f113205e), java.lang.Integer.valueOf(pjVar.f113205e)) && n51.f.a(this.f113206f, pjVar.f113206f) && n51.f.a(this.f113207g, pjVar.f113207g) && n51.f.a(this.f113208h, pjVar.f113208h) && n51.f.a(this.f113209i, pjVar.f113209i) && n51.f.a(this.f113211m, pjVar.f113211m) && n51.f.a(this.f113212n, pjVar.f113212n) && n51.f.a(this.f113213o, pjVar.f113213o) && n51.f.a(this.f113214p, pjVar.f113214p) && n51.f.a(this.f113217q, pjVar.f113217q) && n51.f.a(java.lang.Integer.valueOf(this.f113218r), java.lang.Integer.valueOf(pjVar.f113218r)) && n51.f.a(java.lang.Integer.valueOf(this.f113219s), java.lang.Integer.valueOf(pjVar.f113219s)) && n51.f.a(java.lang.Integer.valueOf(this.f113220t), java.lang.Integer.valueOf(pjVar.f113220t)) && n51.f.a(this.f113221u, pjVar.f113221u) && n51.f.a(this.f113222v, pjVar.f113222v) && n51.f.a(this.f113223w, pjVar.f113223w) && n51.f.a(this.f113224x, pjVar.f113224x) && n51.f.a(this.f113226y, pjVar.f113226y) && n51.f.a(java.lang.Integer.valueOf(this.f113228z), java.lang.Integer.valueOf(pjVar.f113228z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(pjVar.A)) && n51.f.a(this.B, pjVar.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(pjVar.C)) && n51.f.a(java.lang.Boolean.valueOf(this.D), java.lang.Boolean.valueOf(pjVar.D)) && n51.f.a(this.E, pjVar.E) && n51.f.a(this.F, pjVar.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(pjVar.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(pjVar.H)) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(pjVar.I)) && n51.f.a(java.lang.Integer.valueOf(this.f113203J), java.lang.Integer.valueOf(pjVar.f113203J)) && n51.f.a(this.K, pjVar.K) && n51.f.a(this.L, pjVar.L) && n51.f.a(java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(pjVar.M)) && n51.f.a(this.N, pjVar.N) && n51.f.a(java.lang.Boolean.valueOf(this.P), java.lang.Boolean.valueOf(pjVar.P)) && n51.f.a(this.Q, pjVar.Q) && n51.f.a(this.R, pjVar.R) && n51.f.a(this.S, pjVar.S) && n51.f.a(this.T, pjVar.T) && n51.f.a(this.U, pjVar.U) && n51.f.a(this.V, pjVar.V) && n51.f.a(java.lang.Integer.valueOf(this.W), java.lang.Integer.valueOf(pjVar.W)) && n51.f.a(this.X, pjVar.X) && n51.f.a(this.Y, pjVar.Y) && n51.f.a(java.lang.Integer.valueOf(this.Z), java.lang.Integer.valueOf(pjVar.Z)) && n51.f.a(java.lang.Boolean.valueOf(this.f113215p0), java.lang.Boolean.valueOf(pjVar.f113215p0)) && n51.f.a(java.lang.Integer.valueOf(this.f113225x0), java.lang.Integer.valueOf(pjVar.f113225x0)) && n51.f.a(java.lang.Boolean.valueOf(this.f113227y0), java.lang.Boolean.valueOf(pjVar.f113227y0)) && n51.f.a(this.f113210l1, pjVar.f113210l1);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113216p1;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.f(1, this.f113204d);
            }
            if (zArr[2]) {
                fVar.f(2, this.f113205e);
            }
            java.lang.String str = this.f113206f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f113207g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f113208h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f113209i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f113211m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            bw5.zi ziVar = this.f113212n;
            if (ziVar != null && zArr[8]) {
                fVar.i(8, ziVar.mo75928xcd1e8d8());
                this.f113212n.mo75956x3d5d1f78(fVar);
            }
            bw5.mi miVar = this.f113213o;
            if (miVar != null && zArr[9]) {
                fVar.i(9, miVar.mo75928xcd1e8d8());
                this.f113213o.mo75956x3d5d1f78(fVar);
            }
            bw5.aj ajVar = this.f113214p;
            if (ajVar != null && zArr[10]) {
                fVar.i(10, ajVar.mo75928xcd1e8d8());
                this.f113214p.mo75956x3d5d1f78(fVar);
            }
            bw5.kj kjVar = this.f113217q;
            if (kjVar != null && zArr[11]) {
                fVar.i(11, kjVar.mo75928xcd1e8d8());
                this.f113217q.mo75956x3d5d1f78(fVar);
            }
            if (zArr[12]) {
                fVar.f(12, this.f113218r);
            }
            if (zArr[13]) {
                fVar.f(13, this.f113219s);
            }
            if (zArr[14]) {
                fVar.f(14, this.f113220t);
            }
            java.lang.String str6 = this.f113221u;
            if (str6 != null && zArr[15]) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.f113222v;
            if (str7 != null && zArr[16]) {
                fVar.j(16, str7);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f113223w;
            if (gVar != null && zArr[17]) {
                fVar.b(17, gVar);
            }
            bw5.rj rjVar = this.f113224x;
            if (rjVar != null && zArr[18]) {
                fVar.i(18, rjVar.mo75928xcd1e8d8());
                this.f113224x.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str8 = this.f113226y;
            if (str8 != null && zArr[19]) {
                fVar.j(19, str8);
            }
            if (zArr[20]) {
                fVar.f(20, this.f113228z);
            }
            if (zArr[21]) {
                fVar.f(21, this.A);
            }
            java.lang.String str9 = this.B;
            if (str9 != null && zArr[22]) {
                fVar.j(22, str9);
            }
            if (zArr[23]) {
                fVar.f(23, this.C);
            }
            if (zArr[24]) {
                fVar.a(24, this.D);
            }
            bw5.ui uiVar = this.E;
            if (uiVar != null && zArr[25]) {
                fVar.i(25, uiVar.mo75928xcd1e8d8());
                this.E.mo75956x3d5d1f78(fVar);
            }
            fVar.g(26, 8, this.F);
            if (zArr[27]) {
                fVar.f(27, this.G);
            }
            if (zArr[28]) {
                fVar.f(28, this.H);
            }
            if (zArr[29]) {
                fVar.f(29, this.I);
            }
            if (zArr[30]) {
                fVar.f(30, this.f113203J);
            }
            java.lang.String str10 = this.K;
            if (str10 != null && zArr[31]) {
                fVar.j(31, str10);
            }
            fVar.g(32, 2, this.L);
            if (zArr[33]) {
                fVar.f(33, this.M);
            }
            java.lang.String str11 = this.N;
            if (str11 != null && zArr[34]) {
                fVar.j(34, str11);
            }
            if (zArr[37]) {
                fVar.a(37, this.P);
            }
            java.lang.String str12 = this.Q;
            if (str12 != null && zArr[39]) {
                fVar.j(39, str12);
            }
            java.lang.String str13 = this.R;
            if (str13 != null && zArr[40]) {
                fVar.j(40, str13);
            }
            bw5.dj djVar = this.S;
            if (djVar != null && zArr[41]) {
                fVar.i(41, djVar.mo75928xcd1e8d8());
                this.S.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str14 = this.T;
            if (str14 != null && zArr[42]) {
                fVar.j(42, str14);
            }
            java.lang.String str15 = this.U;
            if (str15 != null && zArr[43]) {
                fVar.j(43, str15);
            }
            bw5.ji jiVar = this.V;
            if (jiVar != null && zArr[45]) {
                fVar.i(45, jiVar.mo75928xcd1e8d8());
                this.V.mo75956x3d5d1f78(fVar);
            }
            if (zArr[46]) {
                fVar.f(46, this.W);
            }
            java.lang.String str16 = this.X;
            if (str16 != null && zArr[47]) {
                fVar.j(47, str16);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.Y;
            if (gVar2 != null && zArr[48]) {
                fVar.b(48, gVar2);
            }
            if (zArr[49]) {
                fVar.f(49, this.Z);
            }
            if (zArr[51]) {
                fVar.a(51, this.f113215p0);
            }
            if (zArr[52]) {
                fVar.f(52, this.f113225x0);
            }
            if (zArr[53]) {
                fVar.a(53, this.f113227y0);
            }
            java.lang.String str17 = this.f113210l1;
            if (str17 != null && zArr[54]) {
                fVar.j(54, str17);
            }
            return 0;
        }
        if (i17 == 1) {
            int f17 = zArr[1] ? b36.f.f(1, this.f113204d) + 0 : 0;
            if (zArr[2]) {
                f17 += b36.f.f(2, this.f113205e);
            }
            java.lang.String str18 = this.f113206f;
            if (str18 != null && zArr[3]) {
                f17 += b36.f.j(3, str18);
            }
            java.lang.String str19 = this.f113207g;
            if (str19 != null && zArr[4]) {
                f17 += b36.f.j(4, str19);
            }
            java.lang.String str20 = this.f113208h;
            if (str20 != null && zArr[5]) {
                f17 += b36.f.j(5, str20);
            }
            java.lang.String str21 = this.f113209i;
            if (str21 != null && zArr[6]) {
                f17 += b36.f.j(6, str21);
            }
            java.lang.String str22 = this.f113211m;
            if (str22 != null && zArr[7]) {
                f17 += b36.f.j(7, str22);
            }
            bw5.zi ziVar2 = this.f113212n;
            if (ziVar2 != null && zArr[8]) {
                f17 += b36.f.i(8, ziVar2.mo75928xcd1e8d8());
            }
            bw5.mi miVar2 = this.f113213o;
            if (miVar2 != null && zArr[9]) {
                f17 += b36.f.i(9, miVar2.mo75928xcd1e8d8());
            }
            bw5.aj ajVar2 = this.f113214p;
            if (ajVar2 != null && zArr[10]) {
                f17 += b36.f.i(10, ajVar2.mo75928xcd1e8d8());
            }
            bw5.kj kjVar2 = this.f113217q;
            if (kjVar2 != null && zArr[11]) {
                f17 += b36.f.i(11, kjVar2.mo75928xcd1e8d8());
            }
            if (zArr[12]) {
                f17 += b36.f.f(12, this.f113218r);
            }
            if (zArr[13]) {
                f17 += b36.f.f(13, this.f113219s);
            }
            if (zArr[14]) {
                f17 += b36.f.f(14, this.f113220t);
            }
            java.lang.String str23 = this.f113221u;
            if (str23 != null && zArr[15]) {
                f17 += b36.f.j(15, str23);
            }
            java.lang.String str24 = this.f113222v;
            if (str24 != null && zArr[16]) {
                f17 += b36.f.j(16, str24);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f113223w;
            if (gVar3 != null && zArr[17]) {
                f17 += b36.f.b(17, gVar3);
            }
            bw5.rj rjVar2 = this.f113224x;
            if (rjVar2 != null && zArr[18]) {
                f17 += b36.f.i(18, rjVar2.mo75928xcd1e8d8());
            }
            java.lang.String str25 = this.f113226y;
            if (str25 != null && zArr[19]) {
                f17 += b36.f.j(19, str25);
            }
            if (zArr[20]) {
                f17 += b36.f.f(20, this.f113228z);
            }
            if (zArr[21]) {
                f17 += b36.f.f(21, this.A);
            }
            java.lang.String str26 = this.B;
            if (str26 != null && zArr[22]) {
                f17 += b36.f.j(22, str26);
            }
            if (zArr[23]) {
                f17 += b36.f.f(23, this.C);
            }
            if (zArr[24]) {
                f17 += b36.f.a(24, this.D);
            }
            bw5.ui uiVar2 = this.E;
            if (uiVar2 != null && zArr[25]) {
                f17 += b36.f.i(25, uiVar2.mo75928xcd1e8d8());
            }
            int g17 = f17 + b36.f.g(26, 8, this.F);
            if (zArr[27]) {
                g17 += b36.f.f(27, this.G);
            }
            if (zArr[28]) {
                g17 += b36.f.f(28, this.H);
            }
            if (zArr[29]) {
                g17 += b36.f.f(29, this.I);
            }
            if (zArr[30]) {
                g17 += b36.f.f(30, this.f113203J);
            }
            java.lang.String str27 = this.K;
            if (str27 != null && zArr[31]) {
                g17 += b36.f.j(31, str27);
            }
            int g18 = g17 + b36.f.g(32, 2, this.L);
            if (zArr[33]) {
                g18 += b36.f.f(33, this.M);
            }
            java.lang.String str28 = this.N;
            if (str28 != null && zArr[34]) {
                g18 += b36.f.j(34, str28);
            }
            if (zArr[37]) {
                g18 += b36.f.a(37, this.P);
            }
            java.lang.String str29 = this.Q;
            if (str29 != null && zArr[39]) {
                g18 += b36.f.j(39, str29);
            }
            java.lang.String str30 = this.R;
            if (str30 != null && zArr[40]) {
                g18 += b36.f.j(40, str30);
            }
            bw5.dj djVar2 = this.S;
            if (djVar2 != null && zArr[41]) {
                g18 += b36.f.i(41, djVar2.mo75928xcd1e8d8());
            }
            java.lang.String str31 = this.T;
            if (str31 != null && zArr[42]) {
                g18 += b36.f.j(42, str31);
            }
            java.lang.String str32 = this.U;
            if (str32 != null && zArr[43]) {
                g18 += b36.f.j(43, str32);
            }
            bw5.ji jiVar2 = this.V;
            if (jiVar2 != null && zArr[45]) {
                g18 += b36.f.i(45, jiVar2.mo75928xcd1e8d8());
            }
            if (zArr[46]) {
                g18 += b36.f.f(46, this.W);
            }
            java.lang.String str33 = this.X;
            if (str33 != null && zArr[47]) {
                g18 += b36.f.j(47, str33);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.Y;
            if (gVar4 != null && zArr[48]) {
                g18 += b36.f.b(48, gVar4);
            }
            if (zArr[49]) {
                g18 += b36.f.f(49, this.Z);
            }
            if (zArr[51]) {
                g18 += b36.f.a(51, this.f113215p0);
            }
            if (zArr[52]) {
                g18 += b36.f.f(52, this.f113225x0);
            }
            if (zArr[53]) {
                g18 += b36.f.a(53, this.f113227y0);
            }
            java.lang.String str34 = this.f113210l1;
            return (str34 == null || !zArr[54]) ? g18 : g18 + b36.f.j(54, str34);
        }
        if (i17 == 2) {
            this.F.clear();
            this.L.clear();
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
                this.f113204d = aVar2.h(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113205e = aVar2.h(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113206f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113207g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113208h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113209i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113211m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.zi ziVar3 = new bw5.zi();
                    if (bArr != null && bArr.length > 0) {
                        ziVar3.mo11468x92b714fd(bArr);
                    }
                    this.f113212n = ziVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.mi miVar3 = new bw5.mi();
                    if (bArr2 != null && bArr2.length > 0) {
                        miVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f113213o = miVar3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.aj ajVar3 = new bw5.aj();
                    if (bArr3 != null && bArr3.length > 0) {
                        ajVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f113214p = ajVar3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.kj kjVar3 = new bw5.kj();
                    if (bArr4 != null && bArr4.length > 0) {
                        kjVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f113217q = kjVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f113218r = aVar2.h(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f113219s = aVar2.h(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f113220t = aVar2.h(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f113221u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f113222v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f113223w = aVar2.d(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.rj rjVar3 = new bw5.rj();
                    if (bArr5 != null && bArr5.length > 0) {
                        rjVar3.mo11468x92b714fd(bArr5);
                    }
                    this.f113224x = rjVar3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                this.f113226y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f113228z = aVar2.h(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.h(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.k(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.h(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.c(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.ui uiVar3 = new bw5.ui();
                    if (bArr6 != null && bArr6.length > 0) {
                        uiVar3.mo11468x92b714fd(bArr6);
                    }
                    this.E = uiVar3;
                }
                zArr[25] = true;
                return 0;
            case 26:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.lj ljVar = new bw5.lj();
                    if (bArr7 != null && bArr7.length > 0) {
                        ljVar.mo11468x92b714fd(bArr7);
                    }
                    this.F.add(ljVar);
                }
                zArr[26] = true;
                return 0;
            case 27:
                this.G = aVar2.h(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.H = aVar2.h(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.I = aVar2.h(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                this.f113203J = aVar2.h(intValue);
                zArr[30] = true;
                return 0;
            case 31:
                this.K = aVar2.k(intValue);
                zArr[31] = true;
                return 0;
            case 32:
                this.L.add(java.lang.Integer.valueOf(aVar2.h(intValue)));
                zArr[32] = true;
                return 0;
            case 33:
                this.M = aVar2.h(intValue);
                zArr[33] = true;
                return 0;
            case 34:
                this.N = aVar2.k(intValue);
                zArr[34] = true;
                return 0;
            case 35:
            case 36:
            case 38:
            case 44:
            case 50:
            default:
                return -1;
            case 37:
                this.P = aVar2.c(intValue);
                zArr[37] = true;
                return 0;
            case 39:
                this.Q = aVar2.k(intValue);
                zArr[39] = true;
                return 0;
            case 40:
                this.R = aVar2.k(intValue);
                zArr[40] = true;
                return 0;
            case 41:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.dj djVar3 = new bw5.dj();
                    if (bArr8 != null && bArr8.length > 0) {
                        djVar3.mo11468x92b714fd(bArr8);
                    }
                    this.S = djVar3;
                }
                zArr[41] = true;
                return 0;
            case 42:
                this.T = aVar2.k(intValue);
                zArr[42] = true;
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                this.U = aVar2.k(intValue);
                zArr[43] = true;
                return 0;
            case 45:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.ji jiVar3 = new bw5.ji();
                    if (bArr9 != null && bArr9.length > 0) {
                        jiVar3.mo11468x92b714fd(bArr9);
                    }
                    this.V = jiVar3;
                }
                zArr[45] = true;
                return 0;
            case 46:
                this.W = aVar2.h(intValue);
                zArr[46] = true;
                return 0;
            case 47:
                this.X = aVar2.k(intValue);
                zArr[47] = true;
                return 0;
            case 48:
                this.Y = aVar2.d(intValue);
                zArr[48] = true;
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                this.Z = aVar2.h(intValue);
                zArr[49] = true;
                return 0;
            case 51:
                this.f113215p0 = aVar2.c(intValue);
                zArr[51] = true;
                return 0;
            case 52:
                this.f113225x0 = aVar2.h(intValue);
                zArr[52] = true;
                return 0;
            case 53:
                this.f113227y0 = aVar2.c(intValue);
                zArr[53] = true;
                return 0;
            case 54:
                this.f113210l1 = aVar2.k(intValue);
                zArr[54] = true;
                return 0;
        }
    }
}
