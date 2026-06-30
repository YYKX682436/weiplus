package r45;

/* loaded from: classes9.dex */
public class r43 extends r45.js5 {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public r45.lj5 D;
    public java.lang.String E;
    public java.lang.String F;
    public int G;
    public java.lang.String H;
    public r45.q34 I;

    /* renamed from: J, reason: collision with root package name */
    public int f466054J;
    public int K;
    public r45.g04 L;
    public java.lang.String M;
    public java.lang.String N;
    public r45.m43 P;
    public r45.s43 Q;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466057f;

    /* renamed from: g, reason: collision with root package name */
    public long f466058g;

    /* renamed from: h, reason: collision with root package name */
    public int f466059h;

    /* renamed from: i, reason: collision with root package name */
    public long f466060i;

    /* renamed from: m, reason: collision with root package name */
    public int f466061m;

    /* renamed from: n, reason: collision with root package name */
    public long f466062n;

    /* renamed from: o, reason: collision with root package name */
    public int f466063o;

    /* renamed from: p, reason: collision with root package name */
    public int f466064p;

    /* renamed from: q, reason: collision with root package name */
    public int f466065q;

    /* renamed from: r, reason: collision with root package name */
    public int f466066r;

    /* renamed from: s, reason: collision with root package name */
    public int f466067s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f466068t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f466069u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f466070v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f466071w;

    /* renamed from: z, reason: collision with root package name */
    public int f466074z;

    /* renamed from: d, reason: collision with root package name */
    public int f466055d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466056e = "ok";

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f466072x = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f466073y = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r43)) {
            return false;
        }
        r45.r43 r43Var = (r45.r43) fVar;
        return n51.f.a(this.f76492x92037252, r43Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f466055d), java.lang.Integer.valueOf(r43Var.f466055d)) && n51.f.a(this.f466056e, r43Var.f466056e) && n51.f.a(this.f466057f, r43Var.f466057f) && n51.f.a(java.lang.Long.valueOf(this.f466058g), java.lang.Long.valueOf(r43Var.f466058g)) && n51.f.a(java.lang.Integer.valueOf(this.f466059h), java.lang.Integer.valueOf(r43Var.f466059h)) && n51.f.a(java.lang.Long.valueOf(this.f466060i), java.lang.Long.valueOf(r43Var.f466060i)) && n51.f.a(java.lang.Integer.valueOf(this.f466061m), java.lang.Integer.valueOf(r43Var.f466061m)) && n51.f.a(java.lang.Long.valueOf(this.f466062n), java.lang.Long.valueOf(r43Var.f466062n)) && n51.f.a(java.lang.Integer.valueOf(this.f466063o), java.lang.Integer.valueOf(r43Var.f466063o)) && n51.f.a(java.lang.Integer.valueOf(this.f466064p), java.lang.Integer.valueOf(r43Var.f466064p)) && n51.f.a(java.lang.Integer.valueOf(this.f466065q), java.lang.Integer.valueOf(r43Var.f466065q)) && n51.f.a(java.lang.Integer.valueOf(this.f466066r), java.lang.Integer.valueOf(r43Var.f466066r)) && n51.f.a(java.lang.Integer.valueOf(this.f466067s), java.lang.Integer.valueOf(r43Var.f466067s)) && n51.f.a(this.f466068t, r43Var.f466068t) && n51.f.a(this.f466069u, r43Var.f466069u) && n51.f.a(this.f466070v, r43Var.f466070v) && n51.f.a(this.f466071w, r43Var.f466071w) && n51.f.a(this.f466072x, r43Var.f466072x) && n51.f.a(this.f466073y, r43Var.f466073y) && n51.f.a(java.lang.Integer.valueOf(this.f466074z), java.lang.Integer.valueOf(r43Var.f466074z)) && n51.f.a(this.A, r43Var.A) && n51.f.a(this.B, r43Var.B) && n51.f.a(this.C, r43Var.C) && n51.f.a(this.D, r43Var.D) && n51.f.a(this.E, r43Var.E) && n51.f.a(this.F, r43Var.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(r43Var.G)) && n51.f.a(this.H, r43Var.H) && n51.f.a(this.I, r43Var.I) && n51.f.a(java.lang.Integer.valueOf(this.f466054J), java.lang.Integer.valueOf(r43Var.f466054J)) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(r43Var.K)) && n51.f.a(this.L, r43Var.L) && n51.f.a(this.M, r43Var.M) && n51.f.a(this.N, r43Var.N) && n51.f.a(this.P, r43Var.P) && n51.f.a(this.Q, r43Var.Q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f466073y;
        java.util.LinkedList linkedList2 = this.f466072x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f466055d);
            java.lang.String str = this.f466056e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f466057f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f466058g);
            fVar.e(6, this.f466059h);
            fVar.h(7, this.f466060i);
            fVar.e(8, this.f466061m);
            fVar.h(9, this.f466062n);
            fVar.e(10, this.f466063o);
            fVar.e(11, this.f466064p);
            fVar.e(12, this.f466065q);
            fVar.e(13, this.f466066r);
            fVar.e(14, this.f466067s);
            java.lang.String str3 = this.f466068t;
            if (str3 != null) {
                fVar.j(15, str3);
            }
            java.lang.String str4 = this.f466069u;
            if (str4 != null) {
                fVar.j(16, str4);
            }
            java.lang.String str5 = this.f466070v;
            if (str5 != null) {
                fVar.j(17, str5);
            }
            java.lang.String str6 = this.f466071w;
            if (str6 != null) {
                fVar.j(18, str6);
            }
            fVar.g(19, 8, linkedList2);
            fVar.g(20, 8, linkedList);
            fVar.e(21, this.f466074z);
            java.lang.String str7 = this.A;
            if (str7 != null) {
                fVar.j(22, str7);
            }
            java.lang.String str8 = this.B;
            if (str8 != null) {
                fVar.j(23, str8);
            }
            java.lang.String str9 = this.C;
            if (str9 != null) {
                fVar.j(24, str9);
            }
            r45.lj5 lj5Var = this.D;
            if (lj5Var != null) {
                fVar.i(25, lj5Var.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str10 = this.E;
            if (str10 != null) {
                fVar.j(26, str10);
            }
            java.lang.String str11 = this.F;
            if (str11 != null) {
                fVar.j(27, str11);
            }
            fVar.e(28, this.G);
            java.lang.String str12 = this.H;
            if (str12 != null) {
                fVar.j(29, str12);
            }
            r45.q34 q34Var = this.I;
            if (q34Var != null) {
                fVar.i(30, q34Var.mo75928xcd1e8d8());
                this.I.mo75956x3d5d1f78(fVar);
            }
            fVar.e(31, this.f466054J);
            fVar.e(32, this.K);
            r45.g04 g04Var = this.L;
            if (g04Var != null) {
                fVar.i(33, g04Var.mo75928xcd1e8d8());
                this.L.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str13 = this.M;
            if (str13 != null) {
                fVar.j(34, str13);
            }
            java.lang.String str14 = this.N;
            if (str14 != null) {
                fVar.j(35, str14);
            }
            r45.m43 m43Var = this.P;
            if (m43Var != null) {
                fVar.i(36, m43Var.mo75928xcd1e8d8());
                this.P.mo75956x3d5d1f78(fVar);
            }
            r45.s43 s43Var = this.Q;
            if (s43Var != null) {
                fVar.i(37, s43Var.mo75928xcd1e8d8());
                this.Q.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f466055d);
            java.lang.String str15 = this.f466056e;
            if (str15 != null) {
                i18 += b36.f.j(3, str15);
            }
            java.lang.String str16 = this.f466057f;
            if (str16 != null) {
                i18 += b36.f.j(4, str16);
            }
            int h17 = i18 + b36.f.h(5, this.f466058g) + b36.f.e(6, this.f466059h) + b36.f.h(7, this.f466060i) + b36.f.e(8, this.f466061m) + b36.f.h(9, this.f466062n) + b36.f.e(10, this.f466063o) + b36.f.e(11, this.f466064p) + b36.f.e(12, this.f466065q) + b36.f.e(13, this.f466066r) + b36.f.e(14, this.f466067s);
            java.lang.String str17 = this.f466068t;
            if (str17 != null) {
                h17 += b36.f.j(15, str17);
            }
            java.lang.String str18 = this.f466069u;
            if (str18 != null) {
                h17 += b36.f.j(16, str18);
            }
            java.lang.String str19 = this.f466070v;
            if (str19 != null) {
                h17 += b36.f.j(17, str19);
            }
            java.lang.String str20 = this.f466071w;
            if (str20 != null) {
                h17 += b36.f.j(18, str20);
            }
            int g17 = h17 + b36.f.g(19, 8, linkedList2) + b36.f.g(20, 8, linkedList) + b36.f.e(21, this.f466074z);
            java.lang.String str21 = this.A;
            if (str21 != null) {
                g17 += b36.f.j(22, str21);
            }
            java.lang.String str22 = this.B;
            if (str22 != null) {
                g17 += b36.f.j(23, str22);
            }
            java.lang.String str23 = this.C;
            if (str23 != null) {
                g17 += b36.f.j(24, str23);
            }
            r45.lj5 lj5Var2 = this.D;
            if (lj5Var2 != null) {
                g17 += b36.f.i(25, lj5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str24 = this.E;
            if (str24 != null) {
                g17 += b36.f.j(26, str24);
            }
            java.lang.String str25 = this.F;
            if (str25 != null) {
                g17 += b36.f.j(27, str25);
            }
            int e17 = g17 + b36.f.e(28, this.G);
            java.lang.String str26 = this.H;
            if (str26 != null) {
                e17 += b36.f.j(29, str26);
            }
            r45.q34 q34Var2 = this.I;
            if (q34Var2 != null) {
                e17 += b36.f.i(30, q34Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(31, this.f466054J) + b36.f.e(32, this.K);
            r45.g04 g04Var2 = this.L;
            if (g04Var2 != null) {
                e18 += b36.f.i(33, g04Var2.mo75928xcd1e8d8());
            }
            java.lang.String str27 = this.M;
            if (str27 != null) {
                e18 += b36.f.j(34, str27);
            }
            java.lang.String str28 = this.N;
            if (str28 != null) {
                e18 += b36.f.j(35, str28);
            }
            r45.m43 m43Var2 = this.P;
            if (m43Var2 != null) {
                e18 += b36.f.i(36, m43Var2.mo75928xcd1e8d8());
            }
            r45.s43 s43Var2 = this.Q;
            return s43Var2 != null ? e18 + b36.f.i(37, s43Var2.mo75928xcd1e8d8()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.r43 r43Var = (r45.r43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    r43Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                r43Var.f466055d = aVar2.g(intValue);
                return 0;
            case 3:
                r43Var.f466056e = aVar2.k(intValue);
                return 0;
            case 4:
                r43Var.f466057f = aVar2.k(intValue);
                return 0;
            case 5:
                r43Var.f466058g = aVar2.i(intValue);
                return 0;
            case 6:
                r43Var.f466059h = aVar2.g(intValue);
                return 0;
            case 7:
                r43Var.f466060i = aVar2.i(intValue);
                return 0;
            case 8:
                r43Var.f466061m = aVar2.g(intValue);
                return 0;
            case 9:
                r43Var.f466062n = aVar2.i(intValue);
                return 0;
            case 10:
                r43Var.f466063o = aVar2.g(intValue);
                return 0;
            case 11:
                r43Var.f466064p = aVar2.g(intValue);
                return 0;
            case 12:
                r43Var.f466065q = aVar2.g(intValue);
                return 0;
            case 13:
                r43Var.f466066r = aVar2.g(intValue);
                return 0;
            case 14:
                r43Var.f466067s = aVar2.g(intValue);
                return 0;
            case 15:
                r43Var.f466068t = aVar2.k(intValue);
                return 0;
            case 16:
                r43Var.f466069u = aVar2.k(intValue);
                return 0;
            case 17:
                r43Var.f466070v = aVar2.k(intValue);
                return 0;
            case 18:
                r43Var.f466071w = aVar2.k(intValue);
                return 0;
            case 19:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.s43 s43Var3 = new r45.s43();
                    if (bArr3 != null && bArr3.length > 0) {
                        s43Var3.mo11468x92b714fd(bArr3);
                    }
                    r43Var.f466072x.add(s43Var3);
                }
                return 0;
            case 20:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.n43 n43Var = new r45.n43();
                    if (bArr4 != null && bArr4.length > 0) {
                        n43Var.mo11468x92b714fd(bArr4);
                    }
                    r43Var.f466073y.add(n43Var);
                }
                return 0;
            case 21:
                r43Var.f466074z = aVar2.g(intValue);
                return 0;
            case 22:
                r43Var.A = aVar2.k(intValue);
                return 0;
            case 23:
                r43Var.B = aVar2.k(intValue);
                return 0;
            case 24:
                r43Var.C = aVar2.k(intValue);
                return 0;
            case 25:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.lj5 lj5Var3 = new r45.lj5();
                    if (bArr5 != null && bArr5.length > 0) {
                        lj5Var3.mo11468x92b714fd(bArr5);
                    }
                    r43Var.D = lj5Var3;
                }
                return 0;
            case 26:
                r43Var.E = aVar2.k(intValue);
                return 0;
            case 27:
                r43Var.F = aVar2.k(intValue);
                return 0;
            case 28:
                r43Var.G = aVar2.g(intValue);
                return 0;
            case 29:
                r43Var.H = aVar2.k(intValue);
                return 0;
            case 30:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.q34 q34Var3 = new r45.q34();
                    if (bArr6 != null && bArr6.length > 0) {
                        q34Var3.mo11468x92b714fd(bArr6);
                    }
                    r43Var.I = q34Var3;
                }
                return 0;
            case 31:
                r43Var.f466054J = aVar2.g(intValue);
                return 0;
            case 32:
                r43Var.K = aVar2.g(intValue);
                return 0;
            case 33:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.g04 g04Var3 = new r45.g04();
                    if (bArr7 != null && bArr7.length > 0) {
                        g04Var3.mo11468x92b714fd(bArr7);
                    }
                    r43Var.L = g04Var3;
                }
                return 0;
            case 34:
                r43Var.M = aVar2.k(intValue);
                return 0;
            case 35:
                r43Var.N = aVar2.k(intValue);
                return 0;
            case 36:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.m43 m43Var3 = new r45.m43();
                    if (bArr8 != null && bArr8.length > 0) {
                        m43Var3.mo11468x92b714fd(bArr8);
                    }
                    r43Var.P = m43Var3;
                }
                return 0;
            case 37:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.s43 s43Var4 = new r45.s43();
                    if (bArr9 != null && bArr9.length > 0) {
                        s43Var4.mo11468x92b714fd(bArr9);
                    }
                    r43Var.Q = s43Var4;
                }
                return 0;
            default:
                return -1;
        }
    }
}
