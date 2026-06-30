package r45;

/* loaded from: classes4.dex */
public class kj4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public int D;
    public long E;
    public java.lang.String F;
    public boolean G;
    public r45.o76 H;
    public r45.s15 I;
    public java.lang.String K;
    public java.lang.String L;
    public int M;
    public int P;
    public int R;
    public boolean S;
    public bw5.nk0 T;
    public r45.ha6 U;

    /* renamed from: d, reason: collision with root package name */
    public int f460274d;

    /* renamed from: e, reason: collision with root package name */
    public int f460275e;

    /* renamed from: f, reason: collision with root package name */
    public int f460276f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460277g;

    /* renamed from: m, reason: collision with root package name */
    public int f460280m;

    /* renamed from: n, reason: collision with root package name */
    public int f460281n;

    /* renamed from: o, reason: collision with root package name */
    public long f460282o;

    /* renamed from: p, reason: collision with root package name */
    public int f460283p;

    /* renamed from: r, reason: collision with root package name */
    public int f460285r;

    /* renamed from: s, reason: collision with root package name */
    public int f460286s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f460287t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f460288u;

    /* renamed from: v, reason: collision with root package name */
    public int f460289v;

    /* renamed from: x, reason: collision with root package name */
    public r45.y96 f460291x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f460292y;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f460278h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f460279i = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f460284q = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f460290w = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f460293z = new java.util.LinkedList();

    /* renamed from: J, reason: collision with root package name */
    public java.util.LinkedList f460273J = new java.util.LinkedList();
    public final java.util.LinkedList N = new java.util.LinkedList();
    public final java.util.LinkedList Q = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kj4)) {
            return false;
        }
        r45.kj4 kj4Var = (r45.kj4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f460274d), java.lang.Integer.valueOf(kj4Var.f460274d)) && n51.f.a(java.lang.Integer.valueOf(this.f460275e), java.lang.Integer.valueOf(kj4Var.f460275e)) && n51.f.a(java.lang.Integer.valueOf(this.f460276f), java.lang.Integer.valueOf(kj4Var.f460276f)) && n51.f.a(this.f460277g, kj4Var.f460277g) && n51.f.a(this.f460278h, kj4Var.f460278h) && n51.f.a(this.f460279i, kj4Var.f460279i) && n51.f.a(java.lang.Integer.valueOf(this.f460280m), java.lang.Integer.valueOf(kj4Var.f460280m)) && n51.f.a(java.lang.Integer.valueOf(this.f460281n), java.lang.Integer.valueOf(kj4Var.f460281n)) && n51.f.a(java.lang.Long.valueOf(this.f460282o), java.lang.Long.valueOf(kj4Var.f460282o)) && n51.f.a(java.lang.Integer.valueOf(this.f460283p), java.lang.Integer.valueOf(kj4Var.f460283p)) && n51.f.a(this.f460284q, kj4Var.f460284q) && n51.f.a(java.lang.Integer.valueOf(this.f460285r), java.lang.Integer.valueOf(kj4Var.f460285r)) && n51.f.a(java.lang.Integer.valueOf(this.f460286s), java.lang.Integer.valueOf(kj4Var.f460286s)) && n51.f.a(this.f460287t, kj4Var.f460287t) && n51.f.a(this.f460288u, kj4Var.f460288u) && n51.f.a(java.lang.Integer.valueOf(this.f460289v), java.lang.Integer.valueOf(kj4Var.f460289v)) && n51.f.a(this.f460290w, kj4Var.f460290w) && n51.f.a(this.f460291x, kj4Var.f460291x) && n51.f.a(this.f460292y, kj4Var.f460292y) && n51.f.a(this.f460293z, kj4Var.f460293z) && n51.f.a(this.A, kj4Var.A) && n51.f.a(this.B, kj4Var.B) && n51.f.a(this.C, kj4Var.C) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(kj4Var.D)) && n51.f.a(java.lang.Long.valueOf(this.E), java.lang.Long.valueOf(kj4Var.E)) && n51.f.a(this.F, kj4Var.F) && n51.f.a(java.lang.Boolean.valueOf(this.G), java.lang.Boolean.valueOf(kj4Var.G)) && n51.f.a(this.H, kj4Var.H) && n51.f.a(this.I, kj4Var.I) && n51.f.a(this.f460273J, kj4Var.f460273J) && n51.f.a(this.K, kj4Var.K) && n51.f.a(this.L, kj4Var.L) && n51.f.a(java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(kj4Var.M)) && n51.f.a(this.N, kj4Var.N) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(kj4Var.P)) && n51.f.a(this.Q, kj4Var.Q) && n51.f.a(java.lang.Integer.valueOf(this.R), java.lang.Integer.valueOf(kj4Var.R)) && n51.f.a(java.lang.Boolean.valueOf(this.S), java.lang.Boolean.valueOf(kj4Var.S)) && n51.f.a(this.T, kj4Var.T) && n51.f.a(this.U, kj4Var.U);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.Q;
        java.util.LinkedList linkedList2 = this.N;
        java.util.LinkedList linkedList3 = this.f460293z;
        java.util.LinkedList linkedList4 = this.f460290w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f460274d);
            fVar.e(2, this.f460275e);
            fVar.e(3, this.f460276f);
            java.lang.String str = this.f460277g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.g(5, 8, this.f460278h);
            fVar.g(6, 8, this.f460279i);
            fVar.e(7, this.f460280m);
            fVar.e(8, this.f460281n);
            fVar.h(9, this.f460282o);
            fVar.e(10, this.f460283p);
            fVar.g(11, 3, this.f460284q);
            fVar.e(12, this.f460285r);
            fVar.e(13, this.f460286s);
            java.lang.String str2 = this.f460287t;
            if (str2 != null) {
                fVar.j(14, str2);
            }
            java.lang.String str3 = this.f460288u;
            if (str3 != null) {
                fVar.j(15, str3);
            }
            fVar.e(16, this.f460289v);
            fVar.g(17, 8, linkedList4);
            r45.y96 y96Var = this.f460291x;
            if (y96Var != null) {
                fVar.i(18, y96Var.mo75928xcd1e8d8());
                this.f460291x.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f460292y;
            if (str4 != null) {
                fVar.j(19, str4);
            }
            fVar.g(20, 8, linkedList3);
            java.lang.String str5 = this.A;
            if (str5 != null) {
                fVar.j(21, str5);
            }
            java.lang.String str6 = this.B;
            if (str6 != null) {
                fVar.j(22, str6);
            }
            java.lang.String str7 = this.C;
            if (str7 != null) {
                fVar.j(23, str7);
            }
            fVar.e(24, this.D);
            fVar.h(25, this.E);
            java.lang.String str8 = this.F;
            if (str8 != null) {
                fVar.j(26, str8);
            }
            fVar.a(27, this.G);
            r45.o76 o76Var = this.H;
            if (o76Var != null) {
                fVar.i(28, o76Var.mo75928xcd1e8d8());
                this.H.mo75956x3d5d1f78(fVar);
            }
            r45.s15 s15Var = this.I;
            if (s15Var != null) {
                fVar.i(29, s15Var.mo75928xcd1e8d8());
                this.I.mo75956x3d5d1f78(fVar);
            }
            fVar.g(30, 8, this.f460273J);
            java.lang.String str9 = this.K;
            if (str9 != null) {
                fVar.j(31, str9);
            }
            java.lang.String str10 = this.L;
            if (str10 != null) {
                fVar.j(32, str10);
            }
            fVar.e(33, this.M);
            fVar.g(34, 2, linkedList2);
            fVar.e(35, this.P);
            fVar.g(36, 2, linkedList);
            fVar.e(37, this.R);
            fVar.a(38, this.S);
            bw5.nk0 nk0Var = this.T;
            if (nk0Var != null) {
                fVar.i(39, nk0Var.mo75928xcd1e8d8());
                this.T.mo75956x3d5d1f78(fVar);
            }
            r45.ha6 ha6Var = this.U;
            if (ha6Var != null) {
                fVar.i(40, ha6Var.mo75928xcd1e8d8());
                this.U.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f460274d) + 0 + b36.f.e(2, this.f460275e) + b36.f.e(3, this.f460276f);
            java.lang.String str11 = this.f460277g;
            if (str11 != null) {
                e17 += b36.f.j(4, str11);
            }
            int g17 = e17 + b36.f.g(5, 8, this.f460278h) + b36.f.g(6, 8, this.f460279i) + b36.f.e(7, this.f460280m) + b36.f.e(8, this.f460281n) + b36.f.h(9, this.f460282o) + b36.f.e(10, this.f460283p) + b36.f.g(11, 3, this.f460284q) + b36.f.e(12, this.f460285r) + b36.f.e(13, this.f460286s);
            java.lang.String str12 = this.f460287t;
            if (str12 != null) {
                g17 += b36.f.j(14, str12);
            }
            java.lang.String str13 = this.f460288u;
            if (str13 != null) {
                g17 += b36.f.j(15, str13);
            }
            int e18 = g17 + b36.f.e(16, this.f460289v) + b36.f.g(17, 8, linkedList4);
            r45.y96 y96Var2 = this.f460291x;
            if (y96Var2 != null) {
                e18 += b36.f.i(18, y96Var2.mo75928xcd1e8d8());
            }
            java.lang.String str14 = this.f460292y;
            if (str14 != null) {
                e18 += b36.f.j(19, str14);
            }
            int g18 = e18 + b36.f.g(20, 8, linkedList3);
            java.lang.String str15 = this.A;
            if (str15 != null) {
                g18 += b36.f.j(21, str15);
            }
            java.lang.String str16 = this.B;
            if (str16 != null) {
                g18 += b36.f.j(22, str16);
            }
            java.lang.String str17 = this.C;
            if (str17 != null) {
                g18 += b36.f.j(23, str17);
            }
            int e19 = g18 + b36.f.e(24, this.D) + b36.f.h(25, this.E);
            java.lang.String str18 = this.F;
            if (str18 != null) {
                e19 += b36.f.j(26, str18);
            }
            int a17 = e19 + b36.f.a(27, this.G);
            r45.o76 o76Var2 = this.H;
            if (o76Var2 != null) {
                a17 += b36.f.i(28, o76Var2.mo75928xcd1e8d8());
            }
            r45.s15 s15Var2 = this.I;
            if (s15Var2 != null) {
                a17 += b36.f.i(29, s15Var2.mo75928xcd1e8d8());
            }
            int g19 = a17 + b36.f.g(30, 8, this.f460273J);
            java.lang.String str19 = this.K;
            if (str19 != null) {
                g19 += b36.f.j(31, str19);
            }
            java.lang.String str20 = this.L;
            if (str20 != null) {
                g19 += b36.f.j(32, str20);
            }
            int e27 = g19 + b36.f.e(33, this.M) + b36.f.g(34, 2, linkedList2) + b36.f.e(35, this.P) + b36.f.g(36, 2, linkedList) + b36.f.e(37, this.R) + b36.f.a(38, this.S);
            bw5.nk0 nk0Var2 = this.T;
            if (nk0Var2 != null) {
                e27 += b36.f.i(39, nk0Var2.mo75928xcd1e8d8());
            }
            r45.ha6 ha6Var2 = this.U;
            return ha6Var2 != null ? e27 + b36.f.i(40, ha6Var2.mo75928xcd1e8d8()) : e27;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f460278h.clear();
            this.f460279i.clear();
            this.f460284q.clear();
            linkedList4.clear();
            linkedList3.clear();
            this.f460273J.clear();
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.kj4 kj4Var = (r45.kj4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kj4Var.f460274d = aVar2.g(intValue);
                return 0;
            case 2:
                kj4Var.f460275e = aVar2.g(intValue);
                return 0;
            case 3:
                kj4Var.f460276f = aVar2.g(intValue);
                return 0;
            case 4:
                kj4Var.f460277g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ec4 ec4Var = new r45.ec4();
                    if (bArr2 != null && bArr2.length > 0) {
                        ec4Var.mo11468x92b714fd(bArr2);
                    }
                    kj4Var.f460278h.add(ec4Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.jb6 jb6Var = new r45.jb6();
                    if (bArr3 != null && bArr3.length > 0) {
                        jb6Var.mo11468x92b714fd(bArr3);
                    }
                    kj4Var.f460279i.add(jb6Var);
                }
                return 0;
            case 7:
                kj4Var.f460280m = aVar2.g(intValue);
                return 0;
            case 8:
                kj4Var.f460281n = aVar2.g(intValue);
                return 0;
            case 9:
                kj4Var.f460282o = aVar2.i(intValue);
                return 0;
            case 10:
                kj4Var.f460283p = aVar2.g(intValue);
                return 0;
            case 11:
                kj4Var.f460284q.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                return 0;
            case 12:
                kj4Var.f460285r = aVar2.g(intValue);
                return 0;
            case 13:
                kj4Var.f460286s = aVar2.g(intValue);
                return 0;
            case 14:
                kj4Var.f460287t = aVar2.k(intValue);
                return 0;
            case 15:
                kj4Var.f460288u = aVar2.k(intValue);
                return 0;
            case 16:
                kj4Var.f460289v = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var.b(bArr4);
                    }
                    kj4Var.f460290w.add(du5Var);
                }
                return 0;
            case 18:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.y96 y96Var3 = new r45.y96();
                    if (bArr5 != null && bArr5.length > 0) {
                        y96Var3.mo11468x92b714fd(bArr5);
                    }
                    kj4Var.f460291x = y96Var3;
                }
                return 0;
            case 19:
                kj4Var.f460292y = aVar2.k(intValue);
                return 0;
            case 20:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.ea6 ea6Var = new r45.ea6();
                    if (bArr6 != null && bArr6.length > 0) {
                        ea6Var.mo11468x92b714fd(bArr6);
                    }
                    kj4Var.f460293z.add(ea6Var);
                }
                return 0;
            case 21:
                kj4Var.A = aVar2.k(intValue);
                return 0;
            case 22:
                kj4Var.B = aVar2.k(intValue);
                return 0;
            case 23:
                kj4Var.C = aVar2.k(intValue);
                return 0;
            case 24:
                kj4Var.D = aVar2.g(intValue);
                return 0;
            case 25:
                kj4Var.E = aVar2.i(intValue);
                return 0;
            case 26:
                kj4Var.F = aVar2.k(intValue);
                return 0;
            case 27:
                kj4Var.G = aVar2.c(intValue);
                return 0;
            case 28:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.o76 o76Var3 = new r45.o76();
                    if (bArr7 != null && bArr7.length > 0) {
                        o76Var3.mo11468x92b714fd(bArr7);
                    }
                    kj4Var.H = o76Var3;
                }
                return 0;
            case 29:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    r45.s15 s15Var3 = new r45.s15();
                    if (bArr8 != null && bArr8.length > 0) {
                        s15Var3.mo11468x92b714fd(bArr8);
                    }
                    kj4Var.I = s15Var3;
                }
                return 0;
            case 30:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr9 = (byte[]) j38.get(i39);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr9 != null && bArr9.length > 0) {
                        du5Var2.b(bArr9);
                    }
                    kj4Var.f460273J.add(du5Var2);
                }
                return 0;
            case 31:
                kj4Var.K = aVar2.k(intValue);
                return 0;
            case 32:
                kj4Var.L = aVar2.k(intValue);
                return 0;
            case 33:
                kj4Var.M = aVar2.g(intValue);
                return 0;
            case 34:
                kj4Var.N.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 35:
                kj4Var.P = aVar2.g(intValue);
                return 0;
            case 36:
                kj4Var.Q.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 37:
                kj4Var.R = aVar2.g(intValue);
                return 0;
            case 38:
                kj4Var.S = aVar2.c(intValue);
                return 0;
            case 39:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr10 = (byte[]) j39.get(i47);
                    bw5.nk0 nk0Var3 = new bw5.nk0();
                    if (bArr10 != null && bArr10.length > 0) {
                        nk0Var3.mo11468x92b714fd(bArr10);
                    }
                    kj4Var.T = nk0Var3;
                }
                return 0;
            case 40:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr11 = (byte[]) j47.get(i48);
                    r45.ha6 ha6Var3 = new r45.ha6();
                    if (bArr11 != null && bArr11.length > 0) {
                        ha6Var3.mo11468x92b714fd(bArr11);
                    }
                    kj4Var.U = ha6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
