package r45;

/* loaded from: classes11.dex */
public class iw5 extends r45.js5 {
    public java.lang.String A;
    public java.lang.String B;
    public r45.va0 C;
    public int D;
    public java.lang.String F;
    public java.lang.String G;
    public r45.cu5 H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f458888J;
    public int K;
    public java.lang.String L;
    public int M;
    public int P;

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f458889d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f458890e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f458891f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f458892g;

    /* renamed from: h, reason: collision with root package name */
    public int f458893h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f458894i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f458895m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f458896n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f458897o;

    /* renamed from: p, reason: collision with root package name */
    public int f458898p;

    /* renamed from: q, reason: collision with root package name */
    public int f458899q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f458900r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f458901s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f458902t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f458903u;

    /* renamed from: v, reason: collision with root package name */
    public int f458904v;

    /* renamed from: w, reason: collision with root package name */
    public int f458905w;

    /* renamed from: x, reason: collision with root package name */
    public int f458906x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f458907y;

    /* renamed from: z, reason: collision with root package name */
    public r45.cb6 f458908z;
    public final java.util.LinkedList E = new java.util.LinkedList();
    public final java.util.LinkedList N = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.iw5)) {
            return false;
        }
        r45.iw5 iw5Var = (r45.iw5) fVar;
        return n51.f.a(this.f76492x92037252, iw5Var.f76492x92037252) && n51.f.a(this.f458889d, iw5Var.f458889d) && n51.f.a(this.f458890e, iw5Var.f458890e) && n51.f.a(this.f458891f, iw5Var.f458891f) && n51.f.a(this.f458892g, iw5Var.f458892g) && n51.f.a(java.lang.Integer.valueOf(this.f458893h), java.lang.Integer.valueOf(iw5Var.f458893h)) && n51.f.a(this.f458894i, iw5Var.f458894i) && n51.f.a(this.f458895m, iw5Var.f458895m) && n51.f.a(this.f458896n, iw5Var.f458896n) && n51.f.a(this.f458897o, iw5Var.f458897o) && n51.f.a(java.lang.Integer.valueOf(this.f458898p), java.lang.Integer.valueOf(iw5Var.f458898p)) && n51.f.a(java.lang.Integer.valueOf(this.f458899q), java.lang.Integer.valueOf(iw5Var.f458899q)) && n51.f.a(this.f458900r, iw5Var.f458900r) && n51.f.a(this.f458901s, iw5Var.f458901s) && n51.f.a(this.f458902t, iw5Var.f458902t) && n51.f.a(this.f458903u, iw5Var.f458903u) && n51.f.a(java.lang.Integer.valueOf(this.f458904v), java.lang.Integer.valueOf(iw5Var.f458904v)) && n51.f.a(java.lang.Integer.valueOf(this.f458905w), java.lang.Integer.valueOf(iw5Var.f458905w)) && n51.f.a(java.lang.Integer.valueOf(this.f458906x), java.lang.Integer.valueOf(iw5Var.f458906x)) && n51.f.a(this.f458907y, iw5Var.f458907y) && n51.f.a(this.f458908z, iw5Var.f458908z) && n51.f.a(this.A, iw5Var.A) && n51.f.a(this.B, iw5Var.B) && n51.f.a(this.C, iw5Var.C) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(iw5Var.D)) && n51.f.a(this.E, iw5Var.E) && n51.f.a(this.F, iw5Var.F) && n51.f.a(this.G, iw5Var.G) && n51.f.a(this.H, iw5Var.H) && n51.f.a(this.I, iw5Var.I) && n51.f.a(this.f458888J, iw5Var.f458888J) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(iw5Var.K)) && n51.f.a(this.L, iw5Var.L) && n51.f.a(java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(iw5Var.M)) && n51.f.a(this.N, iw5Var.N) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(iw5Var.P));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.N;
        java.util.LinkedList linkedList2 = this.E;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var = this.f458889d;
            if (du5Var != null) {
                fVar.i(2, du5Var.mo75928xcd1e8d8());
                this.f458889d.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var2 = this.f458890e;
            if (du5Var2 != null) {
                fVar.i(3, du5Var2.mo75928xcd1e8d8());
                this.f458890e.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var3 = this.f458891f;
            if (du5Var3 != null) {
                fVar.i(4, du5Var3.mo75928xcd1e8d8());
                this.f458891f.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var4 = this.f458892g;
            if (du5Var4 != null) {
                fVar.i(5, du5Var4.mo75928xcd1e8d8());
                this.f458892g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f458893h);
            r45.cu5 cu5Var = this.f458894i;
            if (cu5Var != null) {
                fVar.i(7, cu5Var.mo75928xcd1e8d8());
                this.f458894i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f458895m;
            if (str != null) {
                fVar.j(8, str);
            }
            java.lang.String str2 = this.f458896n;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            java.lang.String str3 = this.f458897o;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            fVar.e(11, this.f458898p);
            fVar.e(12, this.f458899q);
            java.lang.String str4 = this.f458900r;
            if (str4 != null) {
                fVar.j(13, str4);
            }
            java.lang.String str5 = this.f458901s;
            if (str5 != null) {
                fVar.j(14, str5);
            }
            java.lang.String str6 = this.f458902t;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.f458903u;
            if (str7 != null) {
                fVar.j(16, str7);
            }
            fVar.e(17, this.f458904v);
            fVar.e(18, this.f458905w);
            fVar.e(19, this.f458906x);
            java.lang.String str8 = this.f458907y;
            if (str8 != null) {
                fVar.j(20, str8);
            }
            r45.cb6 cb6Var = this.f458908z;
            if (cb6Var != null) {
                fVar.i(21, cb6Var.mo75928xcd1e8d8());
                this.f458908z.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str9 = this.A;
            if (str9 != null) {
                fVar.j(22, str9);
            }
            java.lang.String str10 = this.B;
            if (str10 != null) {
                fVar.j(23, str10);
            }
            r45.va0 va0Var = this.C;
            if (va0Var != null) {
                fVar.i(24, va0Var.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            fVar.e(25, this.D);
            fVar.g(26, 8, linkedList2);
            java.lang.String str11 = this.F;
            if (str11 != null) {
                fVar.j(27, str11);
            }
            java.lang.String str12 = this.G;
            if (str12 != null) {
                fVar.j(28, str12);
            }
            r45.cu5 cu5Var2 = this.H;
            if (cu5Var2 != null) {
                fVar.i(29, cu5Var2.mo75928xcd1e8d8());
                this.H.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str13 = this.I;
            if (str13 != null) {
                fVar.j(30, str13);
            }
            java.lang.String str14 = this.f458888J;
            if (str14 != null) {
                fVar.j(31, str14);
            }
            fVar.e(32, this.K);
            java.lang.String str15 = this.L;
            if (str15 != null) {
                fVar.j(33, str15);
            }
            fVar.e(34, this.M);
            fVar.g(35, 8, linkedList);
            fVar.e(36, this.P);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0;
            r45.du5 du5Var5 = this.f458889d;
            if (du5Var5 != null) {
                i18 += b36.f.i(2, du5Var5.mo75928xcd1e8d8());
            }
            r45.du5 du5Var6 = this.f458890e;
            if (du5Var6 != null) {
                i18 += b36.f.i(3, du5Var6.mo75928xcd1e8d8());
            }
            r45.du5 du5Var7 = this.f458891f;
            if (du5Var7 != null) {
                i18 += b36.f.i(4, du5Var7.mo75928xcd1e8d8());
            }
            r45.du5 du5Var8 = this.f458892g;
            if (du5Var8 != null) {
                i18 += b36.f.i(5, du5Var8.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(6, this.f458893h);
            r45.cu5 cu5Var3 = this.f458894i;
            if (cu5Var3 != null) {
                e17 += b36.f.i(7, cu5Var3.mo75928xcd1e8d8());
            }
            java.lang.String str16 = this.f458895m;
            if (str16 != null) {
                e17 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f458896n;
            if (str17 != null) {
                e17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f458897o;
            if (str18 != null) {
                e17 += b36.f.j(10, str18);
            }
            int e18 = e17 + b36.f.e(11, this.f458898p) + b36.f.e(12, this.f458899q);
            java.lang.String str19 = this.f458900r;
            if (str19 != null) {
                e18 += b36.f.j(13, str19);
            }
            java.lang.String str20 = this.f458901s;
            if (str20 != null) {
                e18 += b36.f.j(14, str20);
            }
            java.lang.String str21 = this.f458902t;
            if (str21 != null) {
                e18 += b36.f.j(15, str21);
            }
            java.lang.String str22 = this.f458903u;
            if (str22 != null) {
                e18 += b36.f.j(16, str22);
            }
            int e19 = e18 + b36.f.e(17, this.f458904v) + b36.f.e(18, this.f458905w) + b36.f.e(19, this.f458906x);
            java.lang.String str23 = this.f458907y;
            if (str23 != null) {
                e19 += b36.f.j(20, str23);
            }
            r45.cb6 cb6Var2 = this.f458908z;
            if (cb6Var2 != null) {
                e19 += b36.f.i(21, cb6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str24 = this.A;
            if (str24 != null) {
                e19 += b36.f.j(22, str24);
            }
            java.lang.String str25 = this.B;
            if (str25 != null) {
                e19 += b36.f.j(23, str25);
            }
            r45.va0 va0Var2 = this.C;
            if (va0Var2 != null) {
                e19 += b36.f.i(24, va0Var2.mo75928xcd1e8d8());
            }
            int e27 = e19 + b36.f.e(25, this.D) + b36.f.g(26, 8, linkedList2);
            java.lang.String str26 = this.F;
            if (str26 != null) {
                e27 += b36.f.j(27, str26);
            }
            java.lang.String str27 = this.G;
            if (str27 != null) {
                e27 += b36.f.j(28, str27);
            }
            r45.cu5 cu5Var4 = this.H;
            if (cu5Var4 != null) {
                e27 += b36.f.i(29, cu5Var4.mo75928xcd1e8d8());
            }
            java.lang.String str28 = this.I;
            if (str28 != null) {
                e27 += b36.f.j(30, str28);
            }
            java.lang.String str29 = this.f458888J;
            if (str29 != null) {
                e27 += b36.f.j(31, str29);
            }
            int e28 = e27 + b36.f.e(32, this.K);
            java.lang.String str30 = this.L;
            if (str30 != null) {
                e28 += b36.f.j(33, str30);
            }
            return e28 + b36.f.e(34, this.M) + b36.f.g(35, 8, linkedList) + b36.f.e(36, this.P);
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
        r45.iw5 iw5Var = (r45.iw5) objArr[1];
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
                    iw5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var9 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var9.b(bArr3);
                    }
                    iw5Var.f458889d = du5Var9;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.du5 du5Var10 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var10.b(bArr4);
                    }
                    iw5Var.f458890e = du5Var10;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.du5 du5Var11 = new r45.du5();
                    if (bArr5 != null && bArr5.length > 0) {
                        du5Var11.b(bArr5);
                    }
                    iw5Var.f458891f = du5Var11;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.du5 du5Var12 = new r45.du5();
                    if (bArr6 != null && bArr6.length > 0) {
                        du5Var12.b(bArr6);
                    }
                    iw5Var.f458892g = du5Var12;
                }
                return 0;
            case 6:
                iw5Var.f458893h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var5.b(bArr7);
                    }
                    iw5Var.f458894i = cu5Var5;
                }
                return 0;
            case 8:
                iw5Var.f458895m = aVar2.k(intValue);
                return 0;
            case 9:
                iw5Var.f458896n = aVar2.k(intValue);
                return 0;
            case 10:
                iw5Var.f458897o = aVar2.k(intValue);
                return 0;
            case 11:
                iw5Var.f458898p = aVar2.g(intValue);
                return 0;
            case 12:
                iw5Var.f458899q = aVar2.g(intValue);
                return 0;
            case 13:
                iw5Var.f458900r = aVar2.k(intValue);
                return 0;
            case 14:
                iw5Var.f458901s = aVar2.k(intValue);
                return 0;
            case 15:
                iw5Var.f458902t = aVar2.k(intValue);
                return 0;
            case 16:
                iw5Var.f458903u = aVar2.k(intValue);
                return 0;
            case 17:
                iw5Var.f458904v = aVar2.g(intValue);
                return 0;
            case 18:
                iw5Var.f458905w = aVar2.g(intValue);
                return 0;
            case 19:
                iw5Var.f458906x = aVar2.g(intValue);
                return 0;
            case 20:
                iw5Var.f458907y = aVar2.k(intValue);
                return 0;
            case 21:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.cb6 cb6Var3 = new r45.cb6();
                    if (bArr8 != null && bArr8.length > 0) {
                        cb6Var3.mo11468x92b714fd(bArr8);
                    }
                    iw5Var.f458908z = cb6Var3;
                }
                return 0;
            case 22:
                iw5Var.A = aVar2.k(intValue);
                return 0;
            case 23:
                iw5Var.B = aVar2.k(intValue);
                return 0;
            case 24:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.va0 va0Var3 = new r45.va0();
                    if (bArr9 != null && bArr9.length > 0) {
                        va0Var3.mo11468x92b714fd(bArr9);
                    }
                    iw5Var.C = va0Var3;
                }
                return 0;
            case 25:
                iw5Var.D = aVar2.g(intValue);
                return 0;
            case 26:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.gw5 gw5Var = new r45.gw5();
                    if (bArr10 != null && bArr10.length > 0) {
                        gw5Var.mo11468x92b714fd(bArr10);
                    }
                    iw5Var.E.add(gw5Var);
                }
                return 0;
            case 27:
                iw5Var.F = aVar2.k(intValue);
                return 0;
            case 28:
                iw5Var.G = aVar2.k(intValue);
                return 0;
            case 29:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr11 != null && bArr11.length > 0) {
                        cu5Var6.b(bArr11);
                    }
                    iw5Var.H = cu5Var6;
                }
                return 0;
            case 30:
                iw5Var.I = aVar2.k(intValue);
                return 0;
            case 31:
                iw5Var.f458888J = aVar2.k(intValue);
                return 0;
            case 32:
                iw5Var.K = aVar2.g(intValue);
                return 0;
            case 33:
                iw5Var.L = aVar2.k(intValue);
                return 0;
            case 34:
                iw5Var.M = aVar2.g(intValue);
                return 0;
            case 35:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    r45.cx5 cx5Var = new r45.cx5();
                    if (bArr12 != null && bArr12.length > 0) {
                        cx5Var.mo11468x92b714fd(bArr12);
                    }
                    iw5Var.N.add(cx5Var);
                }
                return 0;
            case 36:
                iw5Var.P = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
