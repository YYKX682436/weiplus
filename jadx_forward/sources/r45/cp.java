package r45;

/* loaded from: classes9.dex */
public class cp extends r45.js5 {
    public int A;
    public int B = 0;
    public java.lang.String C;
    public java.lang.String D;
    public int E;
    public java.lang.String F;
    public java.lang.String G;
    public int H;
    public r45.vo I;

    /* renamed from: J, reason: collision with root package name */
    public r45.m7 f453271J;
    public r45.l7 K;
    public r45.b20 L;
    public boolean M;
    public java.lang.String N;

    /* renamed from: d, reason: collision with root package name */
    public int f453272d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453273e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453274f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453275g;

    /* renamed from: h, reason: collision with root package name */
    public r45.v56 f453276h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f453277i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f453278m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f453279n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f453280o;

    /* renamed from: p, reason: collision with root package name */
    public int f453281p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f453282q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f453283r;

    /* renamed from: s, reason: collision with root package name */
    public int f453284s;

    /* renamed from: t, reason: collision with root package name */
    public int f453285t;

    /* renamed from: u, reason: collision with root package name */
    public r45.an6 f453286u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f453287v;

    /* renamed from: w, reason: collision with root package name */
    public int f453288w;

    /* renamed from: x, reason: collision with root package name */
    public int f453289x;

    /* renamed from: y, reason: collision with root package name */
    public int f453290y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f453291z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cp)) {
            return false;
        }
        r45.cp cpVar = (r45.cp) fVar;
        return n51.f.a(this.f76492x92037252, cpVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f453272d), java.lang.Integer.valueOf(cpVar.f453272d)) && n51.f.a(this.f453273e, cpVar.f453273e) && n51.f.a(this.f453274f, cpVar.f453274f) && n51.f.a(this.f453275g, cpVar.f453275g) && n51.f.a(this.f453276h, cpVar.f453276h) && n51.f.a(this.f453277i, cpVar.f453277i) && n51.f.a(this.f453278m, cpVar.f453278m) && n51.f.a(this.f453279n, cpVar.f453279n) && n51.f.a(this.f453280o, cpVar.f453280o) && n51.f.a(java.lang.Integer.valueOf(this.f453281p), java.lang.Integer.valueOf(cpVar.f453281p)) && n51.f.a(this.f453282q, cpVar.f453282q) && n51.f.a(this.f453283r, cpVar.f453283r) && n51.f.a(java.lang.Integer.valueOf(this.f453284s), java.lang.Integer.valueOf(cpVar.f453284s)) && n51.f.a(java.lang.Integer.valueOf(this.f453285t), java.lang.Integer.valueOf(cpVar.f453285t)) && n51.f.a(this.f453286u, cpVar.f453286u) && n51.f.a(this.f453287v, cpVar.f453287v) && n51.f.a(java.lang.Integer.valueOf(this.f453288w), java.lang.Integer.valueOf(cpVar.f453288w)) && n51.f.a(java.lang.Integer.valueOf(this.f453289x), java.lang.Integer.valueOf(cpVar.f453289x)) && n51.f.a(java.lang.Integer.valueOf(this.f453290y), java.lang.Integer.valueOf(cpVar.f453290y)) && n51.f.a(this.f453291z, cpVar.f453291z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(cpVar.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(cpVar.B)) && n51.f.a(this.C, cpVar.C) && n51.f.a(this.D, cpVar.D) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(cpVar.E)) && n51.f.a(this.F, cpVar.F) && n51.f.a(this.G, cpVar.G) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(cpVar.H)) && n51.f.a(this.I, cpVar.I) && n51.f.a(this.f453271J, cpVar.f453271J) && n51.f.a(this.K, cpVar.K) && n51.f.a(this.L, cpVar.L) && n51.f.a(java.lang.Boolean.valueOf(this.M), java.lang.Boolean.valueOf(cpVar.M)) && n51.f.a(this.N, cpVar.N);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f453272d);
            java.lang.String str = this.f453273e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f453274f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f453275g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.v56 v56Var = this.f453276h;
            if (v56Var != null) {
                fVar.i(6, v56Var.mo75928xcd1e8d8());
                this.f453276h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f453277i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f453278m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f453279n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f453280o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            fVar.e(11, this.f453281p);
            java.lang.String str8 = this.f453282q;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f453283r;
            if (str9 != null) {
                fVar.j(13, str9);
            }
            fVar.e(14, this.f453284s);
            fVar.e(15, this.f453285t);
            r45.an6 an6Var = this.f453286u;
            if (an6Var != null) {
                fVar.i(16, an6Var.mo75928xcd1e8d8());
                this.f453286u.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str10 = this.f453287v;
            if (str10 != null) {
                fVar.j(17, str10);
            }
            fVar.e(18, this.f453288w);
            fVar.e(19, this.f453289x);
            fVar.e(20, this.f453290y);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f453291z;
            if (gVar != null) {
                fVar.b(21, gVar);
            }
            fVar.e(22, this.A);
            fVar.e(23, this.B);
            java.lang.String str11 = this.C;
            if (str11 != null) {
                fVar.j(24, str11);
            }
            java.lang.String str12 = this.D;
            if (str12 != null) {
                fVar.j(25, str12);
            }
            fVar.e(26, this.E);
            java.lang.String str13 = this.F;
            if (str13 != null) {
                fVar.j(27, str13);
            }
            java.lang.String str14 = this.G;
            if (str14 != null) {
                fVar.j(28, str14);
            }
            fVar.e(29, this.H);
            r45.vo voVar = this.I;
            if (voVar != null) {
                fVar.i(30, voVar.mo75928xcd1e8d8());
                this.I.mo75956x3d5d1f78(fVar);
            }
            r45.m7 m7Var = this.f453271J;
            if (m7Var != null) {
                fVar.i(31, m7Var.mo75928xcd1e8d8());
                this.f453271J.mo75956x3d5d1f78(fVar);
            }
            r45.l7 l7Var = this.K;
            if (l7Var != null) {
                fVar.i(32, l7Var.mo75928xcd1e8d8());
                this.K.mo75956x3d5d1f78(fVar);
            }
            r45.b20 b20Var = this.L;
            if (b20Var != null) {
                fVar.i(33, b20Var.mo75928xcd1e8d8());
                this.L.mo75956x3d5d1f78(fVar);
            }
            fVar.a(34, this.M);
            java.lang.String str15 = this.N;
            if (str15 != null) {
                fVar.j(35, str15);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f453272d);
            java.lang.String str16 = this.f453273e;
            if (str16 != null) {
                i18 += b36.f.j(3, str16);
            }
            java.lang.String str17 = this.f453274f;
            if (str17 != null) {
                i18 += b36.f.j(4, str17);
            }
            java.lang.String str18 = this.f453275g;
            if (str18 != null) {
                i18 += b36.f.j(5, str18);
            }
            r45.v56 v56Var2 = this.f453276h;
            if (v56Var2 != null) {
                i18 += b36.f.i(6, v56Var2.mo75928xcd1e8d8());
            }
            java.lang.String str19 = this.f453277i;
            if (str19 != null) {
                i18 += b36.f.j(7, str19);
            }
            java.lang.String str20 = this.f453278m;
            if (str20 != null) {
                i18 += b36.f.j(8, str20);
            }
            java.lang.String str21 = this.f453279n;
            if (str21 != null) {
                i18 += b36.f.j(9, str21);
            }
            java.lang.String str22 = this.f453280o;
            if (str22 != null) {
                i18 += b36.f.j(10, str22);
            }
            int e17 = i18 + b36.f.e(11, this.f453281p);
            java.lang.String str23 = this.f453282q;
            if (str23 != null) {
                e17 += b36.f.j(12, str23);
            }
            java.lang.String str24 = this.f453283r;
            if (str24 != null) {
                e17 += b36.f.j(13, str24);
            }
            int e18 = e17 + b36.f.e(14, this.f453284s) + b36.f.e(15, this.f453285t);
            r45.an6 an6Var2 = this.f453286u;
            if (an6Var2 != null) {
                e18 += b36.f.i(16, an6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str25 = this.f453287v;
            if (str25 != null) {
                e18 += b36.f.j(17, str25);
            }
            int e19 = e18 + b36.f.e(18, this.f453288w) + b36.f.e(19, this.f453289x) + b36.f.e(20, this.f453290y);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f453291z;
            if (gVar2 != null) {
                e19 += b36.f.b(21, gVar2);
            }
            int e27 = e19 + b36.f.e(22, this.A) + b36.f.e(23, this.B);
            java.lang.String str26 = this.C;
            if (str26 != null) {
                e27 += b36.f.j(24, str26);
            }
            java.lang.String str27 = this.D;
            if (str27 != null) {
                e27 += b36.f.j(25, str27);
            }
            int e28 = e27 + b36.f.e(26, this.E);
            java.lang.String str28 = this.F;
            if (str28 != null) {
                e28 += b36.f.j(27, str28);
            }
            java.lang.String str29 = this.G;
            if (str29 != null) {
                e28 += b36.f.j(28, str29);
            }
            int e29 = e28 + b36.f.e(29, this.H);
            r45.vo voVar2 = this.I;
            if (voVar2 != null) {
                e29 += b36.f.i(30, voVar2.mo75928xcd1e8d8());
            }
            r45.m7 m7Var2 = this.f453271J;
            if (m7Var2 != null) {
                e29 += b36.f.i(31, m7Var2.mo75928xcd1e8d8());
            }
            r45.l7 l7Var2 = this.K;
            if (l7Var2 != null) {
                e29 += b36.f.i(32, l7Var2.mo75928xcd1e8d8());
            }
            r45.b20 b20Var2 = this.L;
            if (b20Var2 != null) {
                e29 += b36.f.i(33, b20Var2.mo75928xcd1e8d8());
            }
            int a17 = e29 + b36.f.a(34, this.M);
            java.lang.String str30 = this.N;
            return str30 != null ? a17 + b36.f.j(35, str30) : a17;
        }
        if (i17 == 2) {
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
        r45.cp cpVar = (r45.cp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    cpVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                cpVar.f453272d = aVar2.g(intValue);
                return 0;
            case 3:
                cpVar.f453273e = aVar2.k(intValue);
                return 0;
            case 4:
                cpVar.f453274f = aVar2.k(intValue);
                return 0;
            case 5:
                cpVar.f453275g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.v56 v56Var3 = new r45.v56();
                    if (bArr2 != null && bArr2.length > 0) {
                        v56Var3.mo11468x92b714fd(bArr2);
                    }
                    cpVar.f453276h = v56Var3;
                }
                return 0;
            case 7:
                cpVar.f453277i = aVar2.k(intValue);
                return 0;
            case 8:
                cpVar.f453278m = aVar2.k(intValue);
                return 0;
            case 9:
                cpVar.f453279n = aVar2.k(intValue);
                return 0;
            case 10:
                cpVar.f453280o = aVar2.k(intValue);
                return 0;
            case 11:
                cpVar.f453281p = aVar2.g(intValue);
                return 0;
            case 12:
                cpVar.f453282q = aVar2.k(intValue);
                return 0;
            case 13:
                cpVar.f453283r = aVar2.k(intValue);
                return 0;
            case 14:
                cpVar.f453284s = aVar2.g(intValue);
                return 0;
            case 15:
                cpVar.f453285t = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.an6 an6Var3 = new r45.an6();
                    if (bArr3 != null && bArr3.length > 0) {
                        an6Var3.mo11468x92b714fd(bArr3);
                    }
                    cpVar.f453286u = an6Var3;
                }
                return 0;
            case 17:
                cpVar.f453287v = aVar2.k(intValue);
                return 0;
            case 18:
                cpVar.f453288w = aVar2.g(intValue);
                return 0;
            case 19:
                cpVar.f453289x = aVar2.g(intValue);
                return 0;
            case 20:
                cpVar.f453290y = aVar2.g(intValue);
                return 0;
            case 21:
                cpVar.f453291z = aVar2.d(intValue);
                return 0;
            case 22:
                cpVar.A = aVar2.g(intValue);
                return 0;
            case 23:
                cpVar.B = aVar2.g(intValue);
                return 0;
            case 24:
                cpVar.C = aVar2.k(intValue);
                return 0;
            case 25:
                cpVar.D = aVar2.k(intValue);
                return 0;
            case 26:
                cpVar.E = aVar2.g(intValue);
                return 0;
            case 27:
                cpVar.F = aVar2.k(intValue);
                return 0;
            case 28:
                cpVar.G = aVar2.k(intValue);
                return 0;
            case 29:
                cpVar.H = aVar2.g(intValue);
                return 0;
            case 30:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.vo voVar3 = new r45.vo();
                    if (bArr4 != null && bArr4.length > 0) {
                        voVar3.mo11468x92b714fd(bArr4);
                    }
                    cpVar.I = voVar3;
                }
                return 0;
            case 31:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.m7 m7Var3 = new r45.m7();
                    if (bArr5 != null && bArr5.length > 0) {
                        m7Var3.mo11468x92b714fd(bArr5);
                    }
                    cpVar.f453271J = m7Var3;
                }
                return 0;
            case 32:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.l7 l7Var3 = new r45.l7();
                    if (bArr6 != null && bArr6.length > 0) {
                        l7Var3.mo11468x92b714fd(bArr6);
                    }
                    cpVar.K = l7Var3;
                }
                return 0;
            case 33:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.b20 b20Var3 = new r45.b20();
                    if (bArr7 != null && bArr7.length > 0) {
                        b20Var3.mo11468x92b714fd(bArr7);
                    }
                    cpVar.L = b20Var3;
                }
                return 0;
            case 34:
                cpVar.M = aVar2.c(intValue);
                return 0;
            case 35:
                cpVar.N = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
