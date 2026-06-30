package r45;

/* loaded from: classes14.dex */
public class e37 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public r45.cu5 A;
    public int B;
    public r45.cu5 C;
    public int D;
    public int E;
    public int F;
    public r45.r24 G;
    public r45.cu5 H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f454505J;
    public int K;
    public java.util.LinkedList L = new java.util.LinkedList();
    public r45.do5 M;
    public r45.ve0 N;
    public r45.kj3 P;

    /* renamed from: d, reason: collision with root package name */
    public r45.k37 f454506d;

    /* renamed from: e, reason: collision with root package name */
    public r45.k37 f454507e;

    /* renamed from: f, reason: collision with root package name */
    public int f454508f;

    /* renamed from: g, reason: collision with root package name */
    public r45.c27 f454509g;

    /* renamed from: h, reason: collision with root package name */
    public r45.c27 f454510h;

    /* renamed from: i, reason: collision with root package name */
    public int f454511i;

    /* renamed from: m, reason: collision with root package name */
    public int f454512m;

    /* renamed from: n, reason: collision with root package name */
    public int f454513n;

    /* renamed from: o, reason: collision with root package name */
    public int f454514o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f454515p;

    /* renamed from: q, reason: collision with root package name */
    public int f454516q;

    /* renamed from: r, reason: collision with root package name */
    public r45.c27 f454517r;

    /* renamed from: s, reason: collision with root package name */
    public int f454518s;

    /* renamed from: t, reason: collision with root package name */
    public int f454519t;

    /* renamed from: u, reason: collision with root package name */
    public int f454520u;

    /* renamed from: v, reason: collision with root package name */
    public int f454521v;

    /* renamed from: w, reason: collision with root package name */
    public int f454522w;

    /* renamed from: x, reason: collision with root package name */
    public int f454523x;

    /* renamed from: y, reason: collision with root package name */
    public int f454524y;

    /* renamed from: z, reason: collision with root package name */
    public r45.cu5 f454525z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e37)) {
            return false;
        }
        r45.e37 e37Var = (r45.e37) fVar;
        return n51.f.a(this.f454506d, e37Var.f454506d) && n51.f.a(this.f454507e, e37Var.f454507e) && n51.f.a(java.lang.Integer.valueOf(this.f454508f), java.lang.Integer.valueOf(e37Var.f454508f)) && n51.f.a(this.f454509g, e37Var.f454509g) && n51.f.a(this.f454510h, e37Var.f454510h) && n51.f.a(java.lang.Integer.valueOf(this.f454511i), java.lang.Integer.valueOf(e37Var.f454511i)) && n51.f.a(java.lang.Integer.valueOf(this.f454512m), java.lang.Integer.valueOf(e37Var.f454512m)) && n51.f.a(java.lang.Integer.valueOf(this.f454513n), java.lang.Integer.valueOf(e37Var.f454513n)) && n51.f.a(java.lang.Integer.valueOf(this.f454514o), java.lang.Integer.valueOf(e37Var.f454514o)) && n51.f.a(this.f454515p, e37Var.f454515p) && n51.f.a(java.lang.Integer.valueOf(this.f454516q), java.lang.Integer.valueOf(e37Var.f454516q)) && n51.f.a(this.f454517r, e37Var.f454517r) && n51.f.a(java.lang.Integer.valueOf(this.f454518s), java.lang.Integer.valueOf(e37Var.f454518s)) && n51.f.a(java.lang.Integer.valueOf(this.f454519t), java.lang.Integer.valueOf(e37Var.f454519t)) && n51.f.a(java.lang.Integer.valueOf(this.f454520u), java.lang.Integer.valueOf(e37Var.f454520u)) && n51.f.a(java.lang.Integer.valueOf(this.f454521v), java.lang.Integer.valueOf(e37Var.f454521v)) && n51.f.a(java.lang.Integer.valueOf(this.f454522w), java.lang.Integer.valueOf(e37Var.f454522w)) && n51.f.a(java.lang.Integer.valueOf(this.f454523x), java.lang.Integer.valueOf(e37Var.f454523x)) && n51.f.a(java.lang.Integer.valueOf(this.f454524y), java.lang.Integer.valueOf(e37Var.f454524y)) && n51.f.a(this.f454525z, e37Var.f454525z) && n51.f.a(this.A, e37Var.A) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(e37Var.B)) && n51.f.a(this.C, e37Var.C) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(e37Var.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(e37Var.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(e37Var.F)) && n51.f.a(this.G, e37Var.G) && n51.f.a(this.H, e37Var.H) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(e37Var.I)) && n51.f.a(this.f454505J, e37Var.f454505J) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(e37Var.K)) && n51.f.a(this.L, e37Var.L) && n51.f.a(this.M, e37Var.M) && n51.f.a(this.N, e37Var.N) && n51.f.a(this.P, e37Var.P);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.k37 k37Var = this.f454506d;
            if (k37Var != null) {
                fVar.i(1, k37Var.mo75928xcd1e8d8());
                this.f454506d.mo75956x3d5d1f78(fVar);
            }
            r45.k37 k37Var2 = this.f454507e;
            if (k37Var2 != null) {
                fVar.i(2, k37Var2.mo75928xcd1e8d8());
                this.f454507e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f454508f);
            r45.c27 c27Var = this.f454509g;
            if (c27Var != null) {
                fVar.i(4, c27Var.mo75928xcd1e8d8());
                this.f454509g.mo75956x3d5d1f78(fVar);
            }
            r45.c27 c27Var2 = this.f454510h;
            if (c27Var2 != null) {
                fVar.i(5, c27Var2.mo75928xcd1e8d8());
                this.f454510h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f454511i);
            fVar.e(7, this.f454512m);
            fVar.e(8, this.f454513n);
            fVar.e(9, this.f454514o);
            r45.cu5 cu5Var = this.f454515p;
            if (cu5Var != null) {
                fVar.i(10, cu5Var.mo75928xcd1e8d8());
                this.f454515p.mo75956x3d5d1f78(fVar);
            }
            fVar.e(11, this.f454516q);
            r45.c27 c27Var3 = this.f454517r;
            if (c27Var3 != null) {
                fVar.i(12, c27Var3.mo75928xcd1e8d8());
                this.f454517r.mo75956x3d5d1f78(fVar);
            }
            fVar.e(13, this.f454518s);
            fVar.e(14, this.f454519t);
            fVar.e(15, this.f454520u);
            fVar.e(16, this.f454521v);
            fVar.e(17, this.f454522w);
            fVar.e(18, this.f454523x);
            fVar.e(19, this.f454524y);
            r45.cu5 cu5Var2 = this.f454525z;
            if (cu5Var2 != null) {
                fVar.i(20, cu5Var2.mo75928xcd1e8d8());
                this.f454525z.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var3 = this.A;
            if (cu5Var3 != null) {
                fVar.i(21, cu5Var3.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            fVar.e(22, this.B);
            r45.cu5 cu5Var4 = this.C;
            if (cu5Var4 != null) {
                fVar.i(23, cu5Var4.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            fVar.e(24, this.D);
            fVar.e(25, this.E);
            fVar.e(26, this.F);
            r45.r24 r24Var = this.G;
            if (r24Var != null) {
                fVar.i(27, r24Var.mo75928xcd1e8d8());
                this.G.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var5 = this.H;
            if (cu5Var5 != null) {
                fVar.i(28, cu5Var5.mo75928xcd1e8d8());
                this.H.mo75956x3d5d1f78(fVar);
            }
            fVar.e(29, this.I);
            java.lang.String str = this.f454505J;
            if (str != null) {
                fVar.j(30, str);
            }
            fVar.e(31, this.K);
            fVar.g(32, 8, this.L);
            r45.do5 do5Var = this.M;
            if (do5Var != null) {
                fVar.i(33, do5Var.mo75928xcd1e8d8());
                this.M.mo75956x3d5d1f78(fVar);
            }
            r45.ve0 ve0Var = this.N;
            if (ve0Var != null) {
                fVar.i(34, ve0Var.mo75928xcd1e8d8());
                this.N.mo75956x3d5d1f78(fVar);
            }
            r45.kj3 kj3Var = this.P;
            if (kj3Var != null) {
                fVar.i(35, kj3Var.mo75928xcd1e8d8());
                this.P.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.k37 k37Var3 = this.f454506d;
            int i18 = k37Var3 != null ? b36.f.i(1, k37Var3.mo75928xcd1e8d8()) + 0 : 0;
            r45.k37 k37Var4 = this.f454507e;
            if (k37Var4 != null) {
                i18 += b36.f.i(2, k37Var4.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f454508f);
            r45.c27 c27Var4 = this.f454509g;
            if (c27Var4 != null) {
                e17 += b36.f.i(4, c27Var4.mo75928xcd1e8d8());
            }
            r45.c27 c27Var5 = this.f454510h;
            if (c27Var5 != null) {
                e17 += b36.f.i(5, c27Var5.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(6, this.f454511i) + b36.f.e(7, this.f454512m) + b36.f.e(8, this.f454513n) + b36.f.e(9, this.f454514o);
            r45.cu5 cu5Var6 = this.f454515p;
            if (cu5Var6 != null) {
                e18 += b36.f.i(10, cu5Var6.mo75928xcd1e8d8());
            }
            int e19 = e18 + b36.f.e(11, this.f454516q);
            r45.c27 c27Var6 = this.f454517r;
            if (c27Var6 != null) {
                e19 += b36.f.i(12, c27Var6.mo75928xcd1e8d8());
            }
            int e27 = e19 + b36.f.e(13, this.f454518s) + b36.f.e(14, this.f454519t) + b36.f.e(15, this.f454520u) + b36.f.e(16, this.f454521v) + b36.f.e(17, this.f454522w) + b36.f.e(18, this.f454523x) + b36.f.e(19, this.f454524y);
            r45.cu5 cu5Var7 = this.f454525z;
            if (cu5Var7 != null) {
                e27 += b36.f.i(20, cu5Var7.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var8 = this.A;
            if (cu5Var8 != null) {
                e27 += b36.f.i(21, cu5Var8.mo75928xcd1e8d8());
            }
            int e28 = e27 + b36.f.e(22, this.B);
            r45.cu5 cu5Var9 = this.C;
            if (cu5Var9 != null) {
                e28 += b36.f.i(23, cu5Var9.mo75928xcd1e8d8());
            }
            int e29 = e28 + b36.f.e(24, this.D) + b36.f.e(25, this.E) + b36.f.e(26, this.F);
            r45.r24 r24Var2 = this.G;
            if (r24Var2 != null) {
                e29 += b36.f.i(27, r24Var2.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var10 = this.H;
            if (cu5Var10 != null) {
                e29 += b36.f.i(28, cu5Var10.mo75928xcd1e8d8());
            }
            int e37 = e29 + b36.f.e(29, this.I);
            java.lang.String str2 = this.f454505J;
            if (str2 != null) {
                e37 += b36.f.j(30, str2);
            }
            int e38 = e37 + b36.f.e(31, this.K) + b36.f.g(32, 8, this.L);
            r45.do5 do5Var2 = this.M;
            if (do5Var2 != null) {
                e38 += b36.f.i(33, do5Var2.mo75928xcd1e8d8());
            }
            r45.ve0 ve0Var2 = this.N;
            if (ve0Var2 != null) {
                e38 += b36.f.i(34, ve0Var2.mo75928xcd1e8d8());
            }
            r45.kj3 kj3Var2 = this.P;
            return kj3Var2 != null ? e38 + b36.f.i(35, kj3Var2.mo75928xcd1e8d8()) : e38;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.L.clear();
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
        r45.e37 e37Var = (r45.e37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.k37 k37Var5 = new r45.k37();
                    if (bArr2 != null && bArr2.length > 0) {
                        k37Var5.mo11468x92b714fd(bArr2);
                    }
                    e37Var.f454506d = k37Var5;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.k37 k37Var6 = new r45.k37();
                    if (bArr3 != null && bArr3.length > 0) {
                        k37Var6.mo11468x92b714fd(bArr3);
                    }
                    e37Var.f454507e = k37Var6;
                }
                return 0;
            case 3:
                e37Var.f454508f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.c27 c27Var7 = new r45.c27();
                    if (bArr4 != null && bArr4.length > 0) {
                        c27Var7.mo11468x92b714fd(bArr4);
                    }
                    e37Var.f454509g = c27Var7;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.c27 c27Var8 = new r45.c27();
                    if (bArr5 != null && bArr5.length > 0) {
                        c27Var8.mo11468x92b714fd(bArr5);
                    }
                    e37Var.f454510h = c27Var8;
                }
                return 0;
            case 6:
                e37Var.f454511i = aVar2.g(intValue);
                return 0;
            case 7:
                e37Var.f454512m = aVar2.g(intValue);
                return 0;
            case 8:
                e37Var.f454513n = aVar2.g(intValue);
                return 0;
            case 9:
                e37Var.f454514o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var11 = new r45.cu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cu5Var11.b(bArr6);
                    }
                    e37Var.f454515p = cu5Var11;
                }
                return 0;
            case 11:
                e37Var.f454516q = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.c27 c27Var9 = new r45.c27();
                    if (bArr7 != null && bArr7.length > 0) {
                        c27Var9.mo11468x92b714fd(bArr7);
                    }
                    e37Var.f454517r = c27Var9;
                }
                return 0;
            case 13:
                e37Var.f454518s = aVar2.g(intValue);
                return 0;
            case 14:
                e37Var.f454519t = aVar2.g(intValue);
                return 0;
            case 15:
                e37Var.f454520u = aVar2.g(intValue);
                return 0;
            case 16:
                e37Var.f454521v = aVar2.g(intValue);
                return 0;
            case 17:
                e37Var.f454522w = aVar2.g(intValue);
                return 0;
            case 18:
                e37Var.f454523x = aVar2.g(intValue);
                return 0;
            case 19:
                e37Var.f454524y = aVar2.g(intValue);
                return 0;
            case 20:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.cu5 cu5Var12 = new r45.cu5();
                    if (bArr8 != null && bArr8.length > 0) {
                        cu5Var12.b(bArr8);
                    }
                    e37Var.f454525z = cu5Var12;
                }
                return 0;
            case 21:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.cu5 cu5Var13 = new r45.cu5();
                    if (bArr9 != null && bArr9.length > 0) {
                        cu5Var13.b(bArr9);
                    }
                    e37Var.A = cu5Var13;
                }
                return 0;
            case 22:
                e37Var.B = aVar2.g(intValue);
                return 0;
            case 23:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.cu5 cu5Var14 = new r45.cu5();
                    if (bArr10 != null && bArr10.length > 0) {
                        cu5Var14.b(bArr10);
                    }
                    e37Var.C = cu5Var14;
                }
                return 0;
            case 24:
                e37Var.D = aVar2.g(intValue);
                return 0;
            case 25:
                e37Var.E = aVar2.g(intValue);
                return 0;
            case 26:
                e37Var.F = aVar2.g(intValue);
                return 0;
            case 27:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.r24 r24Var3 = new r45.r24();
                    if (bArr11 != null && bArr11.length > 0) {
                        r24Var3.mo11468x92b714fd(bArr11);
                    }
                    e37Var.G = r24Var3;
                }
                return 0;
            case 28:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    r45.cu5 cu5Var15 = new r45.cu5();
                    if (bArr12 != null && bArr12.length > 0) {
                        cu5Var15.b(bArr12);
                    }
                    e37Var.H = cu5Var15;
                }
                return 0;
            case 29:
                e37Var.I = aVar2.g(intValue);
                return 0;
            case 30:
                e37Var.f454505J = aVar2.k(intValue);
                return 0;
            case 31:
                e37Var.K = aVar2.g(intValue);
                return 0;
            case 32:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr13 = (byte[]) j49.get(i58);
                    r45.f37 f37Var = new r45.f37();
                    if (bArr13 != null && bArr13.length > 0) {
                        f37Var.mo11468x92b714fd(bArr13);
                    }
                    e37Var.L.add(f37Var);
                }
                return 0;
            case 33:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr14 = (byte[]) j57.get(i59);
                    r45.do5 do5Var3 = new r45.do5();
                    if (bArr14 != null && bArr14.length > 0) {
                        do5Var3.mo11468x92b714fd(bArr14);
                    }
                    e37Var.M = do5Var3;
                }
                return 0;
            case 34:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr15 = (byte[]) j58.get(i66);
                    r45.ve0 ve0Var3 = new r45.ve0();
                    if (bArr15 != null && bArr15.length > 0) {
                        ve0Var3.mo11468x92b714fd(bArr15);
                    }
                    e37Var.N = ve0Var3;
                }
                return 0;
            case 35:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr16 = (byte[]) j59.get(i67);
                    r45.kj3 kj3Var3 = new r45.kj3();
                    if (bArr16 != null && bArr16.length > 0) {
                        kj3Var3.mo11468x92b714fd(bArr16);
                    }
                    e37Var.P = kj3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
