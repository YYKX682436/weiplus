package bw5;

/* loaded from: classes2.dex */
public class dm extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;
    public long B;
    public bw5.fm C;
    public java.lang.String D;
    public bw5.pj E;
    public boolean F;
    public boolean G;
    public bw5.bm I;

    /* renamed from: J, reason: collision with root package name */
    public bw5.m4 f108067J;
    public int K;
    public bw5.yl L;
    public boolean M;
    public bw5.m1 N;
    public bw5.w1 P;
    public bw5.x4 Q;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108068d;

    /* renamed from: e, reason: collision with root package name */
    public int f108069e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108070f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108071g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f108072h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f108073i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f108074m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f108075n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f108076o;

    /* renamed from: p, reason: collision with root package name */
    public float f108077p;

    /* renamed from: q, reason: collision with root package name */
    public int f108078q;

    /* renamed from: r, reason: collision with root package name */
    public int f108079r;

    /* renamed from: s, reason: collision with root package name */
    public int f108080s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f108081t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f108082u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108083v;

    /* renamed from: w, reason: collision with root package name */
    public int f108084w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f108085x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f108086y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f108087z;
    public final java.util.LinkedList H = new java.util.LinkedList();
    public final boolean[] R = new boolean[39];

    static {
        new bw5.dm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dm mo11468x92b714fd(byte[] bArr) {
        return (bw5.dm) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dm)) {
            return false;
        }
        bw5.dm dmVar = (bw5.dm) fVar;
        return n51.f.a(this.f108068d, dmVar.f108068d) && n51.f.a(java.lang.Integer.valueOf(this.f108069e), java.lang.Integer.valueOf(dmVar.f108069e)) && n51.f.a(this.f108070f, dmVar.f108070f) && n51.f.a(this.f108071g, dmVar.f108071g) && n51.f.a(this.f108072h, dmVar.f108072h) && n51.f.a(this.f108073i, dmVar.f108073i) && n51.f.a(this.f108074m, dmVar.f108074m) && n51.f.a(this.f108075n, dmVar.f108075n) && n51.f.a(this.f108076o, dmVar.f108076o) && n51.f.a(java.lang.Float.valueOf(this.f108077p), java.lang.Float.valueOf(dmVar.f108077p)) && n51.f.a(java.lang.Integer.valueOf(this.f108078q), java.lang.Integer.valueOf(dmVar.f108078q)) && n51.f.a(java.lang.Integer.valueOf(this.f108079r), java.lang.Integer.valueOf(dmVar.f108079r)) && n51.f.a(java.lang.Integer.valueOf(this.f108080s), java.lang.Integer.valueOf(dmVar.f108080s)) && n51.f.a(this.f108081t, dmVar.f108081t) && n51.f.a(this.f108082u, dmVar.f108082u) && n51.f.a(this.f108083v, dmVar.f108083v) && n51.f.a(java.lang.Integer.valueOf(this.f108084w), java.lang.Integer.valueOf(dmVar.f108084w)) && n51.f.a(this.f108085x, dmVar.f108085x) && n51.f.a(this.f108086y, dmVar.f108086y) && n51.f.a(this.f108087z, dmVar.f108087z) && n51.f.a(this.A, dmVar.A) && n51.f.a(java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(dmVar.B)) && n51.f.a(this.C, dmVar.C) && n51.f.a(this.D, dmVar.D) && n51.f.a(this.E, dmVar.E) && n51.f.a(java.lang.Boolean.valueOf(this.F), java.lang.Boolean.valueOf(dmVar.F)) && n51.f.a(java.lang.Boolean.valueOf(this.G), java.lang.Boolean.valueOf(dmVar.G)) && n51.f.a(this.H, dmVar.H) && n51.f.a(this.I, dmVar.I) && n51.f.a(this.f108067J, dmVar.f108067J) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(dmVar.K)) && n51.f.a(this.L, dmVar.L) && n51.f.a(java.lang.Boolean.valueOf(this.M), java.lang.Boolean.valueOf(dmVar.M)) && n51.f.a(this.N, dmVar.N) && n51.f.a(this.P, dmVar.P) && n51.f.a(this.Q, dmVar.Q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.dm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.R;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108068d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f108069e);
            }
            java.lang.String str2 = this.f108070f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f108071g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f108072h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f108073i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f108074m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f108075n;
            if (str7 != null && zArr[8]) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f108076o;
            if (str8 != null && zArr[9]) {
                fVar.j(9, str8);
            }
            if (zArr[10]) {
                fVar.d(10, this.f108077p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f108078q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f108079r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f108080s);
            }
            java.lang.String str9 = this.f108081t;
            if (str9 != null && zArr[14]) {
                fVar.j(14, str9);
            }
            java.lang.String str10 = this.f108082u;
            if (str10 != null && zArr[15]) {
                fVar.j(15, str10);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f108083v;
            if (gVar != null && zArr[16]) {
                fVar.b(16, gVar);
            }
            if (zArr[17]) {
                fVar.e(17, this.f108084w);
            }
            java.lang.String str11 = this.f108085x;
            if (str11 != null && zArr[18]) {
                fVar.j(18, str11);
            }
            java.lang.String str12 = this.f108086y;
            if (str12 != null && zArr[19]) {
                fVar.j(19, str12);
            }
            java.lang.String str13 = this.f108087z;
            if (str13 != null && zArr[21]) {
                fVar.j(21, str13);
            }
            java.lang.String str14 = this.A;
            if (str14 != null && zArr[22]) {
                fVar.j(22, str14);
            }
            if (zArr[23]) {
                fVar.h(23, this.B);
            }
            bw5.fm fmVar = this.C;
            if (fmVar != null && zArr[24]) {
                fVar.i(24, fmVar.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str15 = this.D;
            if (str15 != null && zArr[25]) {
                fVar.j(25, str15);
            }
            bw5.pj pjVar = this.E;
            if (pjVar != null && zArr[26]) {
                fVar.i(26, pjVar.mo75928xcd1e8d8());
                this.E.mo75956x3d5d1f78(fVar);
            }
            if (zArr[27]) {
                fVar.a(27, this.F);
            }
            if (zArr[28]) {
                fVar.a(28, this.G);
            }
            fVar.g(29, 8, this.H);
            bw5.bm bmVar = this.I;
            if (bmVar != null && zArr[30]) {
                fVar.i(30, bmVar.mo75928xcd1e8d8());
                this.I.mo75956x3d5d1f78(fVar);
            }
            bw5.m4 m4Var = this.f108067J;
            if (m4Var != null && zArr[31]) {
                fVar.i(31, m4Var.mo75928xcd1e8d8());
                this.f108067J.mo75956x3d5d1f78(fVar);
            }
            if (zArr[32]) {
                fVar.e(32, this.K);
            }
            bw5.yl ylVar = this.L;
            if (ylVar != null && zArr[33]) {
                fVar.i(33, ylVar.mo75928xcd1e8d8());
                this.L.mo75956x3d5d1f78(fVar);
            }
            if (zArr[34]) {
                fVar.a(34, this.M);
            }
            bw5.m1 m1Var = this.N;
            if (m1Var != null && zArr[36]) {
                fVar.i(36, m1Var.mo75928xcd1e8d8());
                this.N.mo75956x3d5d1f78(fVar);
            }
            bw5.w1 w1Var = this.P;
            if (w1Var != null && zArr[37]) {
                fVar.i(37, w1Var.mo75928xcd1e8d8());
                this.P.mo75956x3d5d1f78(fVar);
            }
            bw5.x4 x4Var = this.Q;
            if (x4Var != null && zArr[38]) {
                fVar.i(38, x4Var.mo75928xcd1e8d8());
                this.Q.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str16 = this.f108068d;
            if (str16 != null && zArr[1]) {
                i18 = b36.f.j(1, str16) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f108069e);
            }
            java.lang.String str17 = this.f108070f;
            if (str17 != null && zArr[3]) {
                i18 += b36.f.j(3, str17);
            }
            java.lang.String str18 = this.f108071g;
            if (str18 != null && zArr[4]) {
                i18 += b36.f.j(4, str18);
            }
            java.lang.String str19 = this.f108072h;
            if (str19 != null && zArr[5]) {
                i18 += b36.f.j(5, str19);
            }
            java.lang.String str20 = this.f108073i;
            if (str20 != null && zArr[6]) {
                i18 += b36.f.j(6, str20);
            }
            java.lang.String str21 = this.f108074m;
            if (str21 != null && zArr[7]) {
                i18 += b36.f.j(7, str21);
            }
            java.lang.String str22 = this.f108075n;
            if (str22 != null && zArr[8]) {
                i18 += b36.f.j(8, str22);
            }
            java.lang.String str23 = this.f108076o;
            if (str23 != null && zArr[9]) {
                i18 += b36.f.j(9, str23);
            }
            if (zArr[10]) {
                i18 += b36.f.d(10, this.f108077p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f108078q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f108079r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f108080s);
            }
            java.lang.String str24 = this.f108081t;
            if (str24 != null && zArr[14]) {
                i18 += b36.f.j(14, str24);
            }
            java.lang.String str25 = this.f108082u;
            if (str25 != null && zArr[15]) {
                i18 += b36.f.j(15, str25);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f108083v;
            if (gVar2 != null && zArr[16]) {
                i18 += b36.f.b(16, gVar2);
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f108084w);
            }
            java.lang.String str26 = this.f108085x;
            if (str26 != null && zArr[18]) {
                i18 += b36.f.j(18, str26);
            }
            java.lang.String str27 = this.f108086y;
            if (str27 != null && zArr[19]) {
                i18 += b36.f.j(19, str27);
            }
            java.lang.String str28 = this.f108087z;
            if (str28 != null && zArr[21]) {
                i18 += b36.f.j(21, str28);
            }
            java.lang.String str29 = this.A;
            if (str29 != null && zArr[22]) {
                i18 += b36.f.j(22, str29);
            }
            if (zArr[23]) {
                i18 += b36.f.h(23, this.B);
            }
            bw5.fm fmVar2 = this.C;
            if (fmVar2 != null && zArr[24]) {
                i18 += b36.f.i(24, fmVar2.mo75928xcd1e8d8());
            }
            java.lang.String str30 = this.D;
            if (str30 != null && zArr[25]) {
                i18 += b36.f.j(25, str30);
            }
            bw5.pj pjVar2 = this.E;
            if (pjVar2 != null && zArr[26]) {
                i18 += b36.f.i(26, pjVar2.mo75928xcd1e8d8());
            }
            if (zArr[27]) {
                i18 += b36.f.a(27, this.F);
            }
            if (zArr[28]) {
                i18 += b36.f.a(28, this.G);
            }
            int g17 = i18 + b36.f.g(29, 8, this.H);
            bw5.bm bmVar2 = this.I;
            if (bmVar2 != null && zArr[30]) {
                g17 += b36.f.i(30, bmVar2.mo75928xcd1e8d8());
            }
            bw5.m4 m4Var2 = this.f108067J;
            if (m4Var2 != null && zArr[31]) {
                g17 += b36.f.i(31, m4Var2.mo75928xcd1e8d8());
            }
            if (zArr[32]) {
                g17 += b36.f.e(32, this.K);
            }
            bw5.yl ylVar2 = this.L;
            if (ylVar2 != null && zArr[33]) {
                g17 += b36.f.i(33, ylVar2.mo75928xcd1e8d8());
            }
            if (zArr[34]) {
                g17 += b36.f.a(34, this.M);
            }
            bw5.m1 m1Var2 = this.N;
            if (m1Var2 != null && zArr[36]) {
                g17 += b36.f.i(36, m1Var2.mo75928xcd1e8d8());
            }
            bw5.w1 w1Var2 = this.P;
            if (w1Var2 != null && zArr[37]) {
                g17 += b36.f.i(37, w1Var2.mo75928xcd1e8d8());
            }
            bw5.x4 x4Var2 = this.Q;
            return (x4Var2 == null || !zArr[38]) ? g17 : g17 + b36.f.i(38, x4Var2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.H.clear();
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
                this.f108068d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108069e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108070f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108071g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108072h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108073i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108074m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108075n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f108076o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f108077p = aVar2.f(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f108078q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f108079r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f108080s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f108081t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f108082u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f108083v = aVar2.d(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f108084w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f108085x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f108086y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
            case 35:
            default:
                return -1;
            case 21:
                this.f108087z = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.A = aVar2.k(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.B = aVar2.i(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.fm fmVar3 = new bw5.fm();
                    if (bArr != null && bArr.length > 0) {
                        fmVar3.mo11468x92b714fd(bArr);
                    }
                    this.C = fmVar3;
                }
                zArr[24] = true;
                return 0;
            case 25:
                this.D = aVar2.k(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.pj pjVar3 = new bw5.pj();
                    if (bArr2 != null && bArr2.length > 0) {
                        pjVar3.mo11468x92b714fd(bArr2);
                    }
                    this.E = pjVar3;
                }
                zArr[26] = true;
                return 0;
            case 27:
                this.F = aVar2.c(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.G = aVar2.c(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.zl zlVar = new bw5.zl();
                    if (bArr3 != null && bArr3.length > 0) {
                        zlVar.mo11468x92b714fd(bArr3);
                    }
                    this.H.add(zlVar);
                }
                zArr[29] = true;
                return 0;
            case 30:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.bm bmVar3 = new bw5.bm();
                    if (bArr4 != null && bArr4.length > 0) {
                        bmVar3.mo11468x92b714fd(bArr4);
                    }
                    this.I = bmVar3;
                }
                zArr[30] = true;
                return 0;
            case 31:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.m4 m4Var3 = new bw5.m4();
                    if (bArr5 != null && bArr5.length > 0) {
                        m4Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f108067J = m4Var3;
                }
                zArr[31] = true;
                return 0;
            case 32:
                this.K = aVar2.g(intValue);
                zArr[32] = true;
                return 0;
            case 33:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.yl ylVar3 = new bw5.yl();
                    if (bArr6 != null && bArr6.length > 0) {
                        ylVar3.mo11468x92b714fd(bArr6);
                    }
                    this.L = ylVar3;
                }
                zArr[33] = true;
                return 0;
            case 34:
                this.M = aVar2.c(intValue);
                zArr[34] = true;
                return 0;
            case 36:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.m1 m1Var3 = new bw5.m1();
                    if (bArr7 != null && bArr7.length > 0) {
                        m1Var3.mo11468x92b714fd(bArr7);
                    }
                    this.N = m1Var3;
                }
                zArr[36] = true;
                return 0;
            case 37:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.w1 w1Var3 = new bw5.w1();
                    if (bArr8 != null && bArr8.length > 0) {
                        w1Var3.mo11468x92b714fd(bArr8);
                    }
                    this.P = w1Var3;
                }
                zArr[37] = true;
                return 0;
            case 38:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.x4 x4Var3 = new bw5.x4();
                    if (bArr9 != null && bArr9.length > 0) {
                        x4Var3.mo11468x92b714fd(bArr9);
                    }
                    this.Q = x4Var3;
                }
                zArr[38] = true;
                return 0;
        }
    }
}
