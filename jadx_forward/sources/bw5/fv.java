package bw5;

/* loaded from: classes2.dex */
public class fv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public int B;
    public bw5.pj C;
    public int D;
    public int E;
    public bw5.hx F;
    public int G;
    public int H;
    public bw5.w4 I;

    /* renamed from: J, reason: collision with root package name */
    public int f109065J;
    public int K;
    public int L;
    public bw5.ul M;
    public bw5.ho N;
    public java.lang.String P;
    public bw5.gv Q;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g R;
    public final boolean[] S = new boolean[41];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f109066d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109067e;

    /* renamed from: f, reason: collision with root package name */
    public int f109068f;

    /* renamed from: g, reason: collision with root package name */
    public long f109069g;

    /* renamed from: h, reason: collision with root package name */
    public int f109070h;

    /* renamed from: i, reason: collision with root package name */
    public int f109071i;

    /* renamed from: m, reason: collision with root package name */
    public long f109072m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f109073n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f109074o;

    /* renamed from: p, reason: collision with root package name */
    public int f109075p;

    /* renamed from: q, reason: collision with root package name */
    public int f109076q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f109077r;

    /* renamed from: s, reason: collision with root package name */
    public int f109078s;

    /* renamed from: t, reason: collision with root package name */
    public int f109079t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f109080u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f109081v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f109082w;

    /* renamed from: x, reason: collision with root package name */
    public int f109083x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.jh f109084y;

    /* renamed from: z, reason: collision with root package name */
    public int f109085z;

    static {
        new bw5.fv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fv mo11468x92b714fd(byte[] bArr) {
        return (bw5.fv) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fv)) {
            return false;
        }
        bw5.fv fvVar = (bw5.fv) fVar;
        return n51.f.a(this.f109066d, fvVar.f109066d) && n51.f.a(this.f109067e, fvVar.f109067e) && n51.f.a(java.lang.Integer.valueOf(this.f109068f), java.lang.Integer.valueOf(fvVar.f109068f)) && n51.f.a(java.lang.Long.valueOf(this.f109069g), java.lang.Long.valueOf(fvVar.f109069g)) && n51.f.a(java.lang.Integer.valueOf(this.f109070h), java.lang.Integer.valueOf(fvVar.f109070h)) && n51.f.a(java.lang.Integer.valueOf(this.f109071i), java.lang.Integer.valueOf(fvVar.f109071i)) && n51.f.a(java.lang.Long.valueOf(this.f109072m), java.lang.Long.valueOf(fvVar.f109072m)) && n51.f.a(this.f109073n, fvVar.f109073n) && n51.f.a(this.f109074o, fvVar.f109074o) && n51.f.a(java.lang.Integer.valueOf(this.f109075p), java.lang.Integer.valueOf(fvVar.f109075p)) && n51.f.a(java.lang.Integer.valueOf(this.f109076q), java.lang.Integer.valueOf(fvVar.f109076q)) && n51.f.a(this.f109077r, fvVar.f109077r) && n51.f.a(java.lang.Integer.valueOf(this.f109078s), java.lang.Integer.valueOf(fvVar.f109078s)) && n51.f.a(java.lang.Integer.valueOf(this.f109079t), java.lang.Integer.valueOf(fvVar.f109079t)) && n51.f.a(this.f109080u, fvVar.f109080u) && n51.f.a(this.f109081v, fvVar.f109081v) && n51.f.a(this.f109082w, fvVar.f109082w) && n51.f.a(java.lang.Integer.valueOf(this.f109083x), java.lang.Integer.valueOf(fvVar.f109083x)) && n51.f.a(this.f109084y, fvVar.f109084y) && n51.f.a(java.lang.Integer.valueOf(this.f109085z), java.lang.Integer.valueOf(fvVar.f109085z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(fvVar.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(fvVar.B)) && n51.f.a(this.C, fvVar.C) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(fvVar.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(fvVar.E)) && n51.f.a(this.F, fvVar.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(fvVar.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(fvVar.H)) && n51.f.a(this.I, fvVar.I) && n51.f.a(java.lang.Integer.valueOf(this.f109065J), java.lang.Integer.valueOf(fvVar.f109065J)) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(fvVar.K)) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(fvVar.L)) && n51.f.a(this.M, fvVar.M) && n51.f.a(this.N, fvVar.N) && n51.f.a(this.P, fvVar.P) && n51.f.a(this.Q, fvVar.Q) && n51.f.a(this.R, fvVar.R);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.S;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f109066d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f109067e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f109068f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f109069g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f109070h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f109071i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f109072m);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f109073n;
            if (gVar != null && zArr[8]) {
                fVar.b(8, gVar);
            }
            java.lang.String str3 = this.f109074o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            if (zArr[10]) {
                fVar.e(10, this.f109075p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f109076q);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f109077r;
            if (gVar2 != null && zArr[12]) {
                fVar.b(12, gVar2);
            }
            if (zArr[13]) {
                fVar.e(13, this.f109078s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f109079t);
            }
            java.lang.String str4 = this.f109080u;
            if (str4 != null && zArr[15]) {
                fVar.j(15, str4);
            }
            java.lang.String str5 = this.f109081v;
            if (str5 != null && zArr[16]) {
                fVar.j(16, str5);
            }
            java.lang.String str6 = this.f109082w;
            if (str6 != null && zArr[17]) {
                fVar.j(17, str6);
            }
            if (zArr[18]) {
                fVar.e(18, this.f109083x);
            }
            bw5.jh jhVar = this.f109084y;
            if (jhVar != null && zArr[19]) {
                fVar.i(19, jhVar.mo75928xcd1e8d8());
                this.f109084y.mo75956x3d5d1f78(fVar);
            }
            if (zArr[20]) {
                fVar.e(20, this.f109085z);
            }
            if (zArr[21]) {
                fVar.e(21, this.A);
            }
            if (zArr[22]) {
                fVar.e(22, this.B);
            }
            bw5.pj pjVar = this.C;
            if (pjVar != null && zArr[23]) {
                fVar.i(23, pjVar.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            if (zArr[24]) {
                fVar.e(24, this.D);
            }
            if (zArr[25]) {
                fVar.e(25, this.E);
            }
            bw5.hx hxVar = this.F;
            if (hxVar != null && zArr[26]) {
                fVar.i(26, hxVar.mo75928xcd1e8d8());
                this.F.mo75956x3d5d1f78(fVar);
            }
            if (zArr[28]) {
                fVar.e(28, this.G);
            }
            if (zArr[29]) {
                fVar.e(29, this.H);
            }
            bw5.w4 w4Var = this.I;
            if (w4Var != null && zArr[30]) {
                fVar.i(30, w4Var.mo75928xcd1e8d8());
                this.I.mo75956x3d5d1f78(fVar);
            }
            if (zArr[31]) {
                fVar.e(31, this.f109065J);
            }
            if (zArr[32]) {
                fVar.e(32, this.K);
            }
            if (zArr[33]) {
                fVar.e(33, this.L);
            }
            bw5.ul ulVar = this.M;
            if (ulVar != null && zArr[34]) {
                fVar.i(34, ulVar.mo75928xcd1e8d8());
                this.M.mo75956x3d5d1f78(fVar);
            }
            bw5.ho hoVar = this.N;
            if (hoVar != null && zArr[35]) {
                fVar.i(35, hoVar.mo75928xcd1e8d8());
                this.N.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str7 = this.P;
            if (str7 != null && zArr[36]) {
                fVar.j(36, str7);
            }
            bw5.gv gvVar = this.Q;
            if (gvVar != null && zArr[37]) {
                fVar.i(37, gvVar.mo75928xcd1e8d8());
                this.Q.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.R;
            if (gVar3 != null && zArr[40]) {
                fVar.b(40, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f109066d;
            if (str8 != null && zArr[1]) {
                i18 = b36.f.j(1, str8) + 0;
            }
            java.lang.String str9 = this.f109067e;
            if (str9 != null && zArr[2]) {
                i18 += b36.f.j(2, str9);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f109068f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f109069g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f109070h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f109071i);
            }
            if (zArr[7]) {
                i18 += b36.f.h(7, this.f109072m);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f109073n;
            if (gVar4 != null && zArr[8]) {
                i18 += b36.f.b(8, gVar4);
            }
            java.lang.String str10 = this.f109074o;
            if (str10 != null && zArr[9]) {
                i18 += b36.f.j(9, str10);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f109075p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f109076q);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f109077r;
            if (gVar5 != null && zArr[12]) {
                i18 += b36.f.b(12, gVar5);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f109078s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f109079t);
            }
            java.lang.String str11 = this.f109080u;
            if (str11 != null && zArr[15]) {
                i18 += b36.f.j(15, str11);
            }
            java.lang.String str12 = this.f109081v;
            if (str12 != null && zArr[16]) {
                i18 += b36.f.j(16, str12);
            }
            java.lang.String str13 = this.f109082w;
            if (str13 != null && zArr[17]) {
                i18 += b36.f.j(17, str13);
            }
            if (zArr[18]) {
                i18 += b36.f.e(18, this.f109083x);
            }
            bw5.jh jhVar2 = this.f109084y;
            if (jhVar2 != null && zArr[19]) {
                i18 += b36.f.i(19, jhVar2.mo75928xcd1e8d8());
            }
            if (zArr[20]) {
                i18 += b36.f.e(20, this.f109085z);
            }
            if (zArr[21]) {
                i18 += b36.f.e(21, this.A);
            }
            if (zArr[22]) {
                i18 += b36.f.e(22, this.B);
            }
            bw5.pj pjVar2 = this.C;
            if (pjVar2 != null && zArr[23]) {
                i18 += b36.f.i(23, pjVar2.mo75928xcd1e8d8());
            }
            if (zArr[24]) {
                i18 += b36.f.e(24, this.D);
            }
            if (zArr[25]) {
                i18 += b36.f.e(25, this.E);
            }
            bw5.hx hxVar2 = this.F;
            if (hxVar2 != null && zArr[26]) {
                i18 += b36.f.i(26, hxVar2.mo75928xcd1e8d8());
            }
            if (zArr[28]) {
                i18 += b36.f.e(28, this.G);
            }
            if (zArr[29]) {
                i18 += b36.f.e(29, this.H);
            }
            bw5.w4 w4Var2 = this.I;
            if (w4Var2 != null && zArr[30]) {
                i18 += b36.f.i(30, w4Var2.mo75928xcd1e8d8());
            }
            if (zArr[31]) {
                i18 += b36.f.e(31, this.f109065J);
            }
            if (zArr[32]) {
                i18 += b36.f.e(32, this.K);
            }
            if (zArr[33]) {
                i18 += b36.f.e(33, this.L);
            }
            bw5.ul ulVar2 = this.M;
            if (ulVar2 != null && zArr[34]) {
                i18 += b36.f.i(34, ulVar2.mo75928xcd1e8d8());
            }
            bw5.ho hoVar2 = this.N;
            if (hoVar2 != null && zArr[35]) {
                i18 += b36.f.i(35, hoVar2.mo75928xcd1e8d8());
            }
            java.lang.String str14 = this.P;
            if (str14 != null && zArr[36]) {
                i18 += b36.f.j(36, str14);
            }
            bw5.gv gvVar2 = this.Q;
            if (gvVar2 != null && zArr[37]) {
                i18 += b36.f.i(37, gvVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.R;
            return (gVar6 == null || !zArr[40]) ? i18 : i18 + b36.f.b(40, gVar6);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f109066d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109067e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109068f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109069g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109070h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109071i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f109072m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f109073n = aVar2.d(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f109074o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f109075p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f109076q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f109077r = aVar2.d(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f109078s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f109079t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f109080u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f109081v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f109082w = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f109083x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.jh jhVar3 = new bw5.jh();
                    if (bArr != null && bArr.length > 0) {
                        jhVar3.mo11468x92b714fd(bArr);
                    }
                    this.f109084y = jhVar3;
                }
                zArr[19] = true;
                return 0;
            case 20:
                this.f109085z = aVar2.g(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.g(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.pj pjVar3 = new bw5.pj();
                    if (bArr2 != null && bArr2.length > 0) {
                        pjVar3.mo11468x92b714fd(bArr2);
                    }
                    this.C = pjVar3;
                }
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.g(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.g(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.hx hxVar3 = new bw5.hx();
                    if (bArr3 != null && bArr3.length > 0) {
                        hxVar3.mo11468x92b714fd(bArr3);
                    }
                    this.F = hxVar3;
                }
                zArr[26] = true;
                return 0;
            case 27:
            case 38:
            case 39:
            default:
                return -1;
            case 28:
                this.G = aVar2.g(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.H = aVar2.g(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.w4 w4Var3 = new bw5.w4();
                    if (bArr4 != null && bArr4.length > 0) {
                        w4Var3.mo11468x92b714fd(bArr4);
                    }
                    this.I = w4Var3;
                }
                zArr[30] = true;
                return 0;
            case 31:
                this.f109065J = aVar2.g(intValue);
                zArr[31] = true;
                return 0;
            case 32:
                this.K = aVar2.g(intValue);
                zArr[32] = true;
                return 0;
            case 33:
                this.L = aVar2.g(intValue);
                zArr[33] = true;
                return 0;
            case 34:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.ul ulVar3 = new bw5.ul();
                    if (bArr5 != null && bArr5.length > 0) {
                        ulVar3.mo11468x92b714fd(bArr5);
                    }
                    this.M = ulVar3;
                }
                zArr[34] = true;
                return 0;
            case 35:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.ho hoVar3 = new bw5.ho();
                    if (bArr6 != null && bArr6.length > 0) {
                        hoVar3.mo11468x92b714fd(bArr6);
                    }
                    this.N = hoVar3;
                }
                zArr[35] = true;
                return 0;
            case 36:
                this.P = aVar2.k(intValue);
                zArr[36] = true;
                return 0;
            case 37:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.gv gvVar3 = new bw5.gv();
                    if (bArr7 != null && bArr7.length > 0) {
                        gvVar3.mo11468x92b714fd(bArr7);
                    }
                    this.Q = gvVar3;
                }
                zArr[37] = true;
                return 0;
            case 40:
                this.R = aVar2.d(intValue);
                zArr[40] = true;
                return 0;
        }
    }
}
