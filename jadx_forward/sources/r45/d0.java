package r45;

/* loaded from: classes9.dex */
public class d0 extends r45.js5 {
    public java.lang.String B;
    public int C;
    public long D;
    public java.lang.String E;
    public java.lang.String F;
    public r45.a G;
    public java.lang.String H;

    /* renamed from: J, reason: collision with root package name */
    public r45.tw4 f453487J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453490f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453491g;

    /* renamed from: h, reason: collision with root package name */
    public int f453492h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f453493i;

    /* renamed from: m, reason: collision with root package name */
    public long f453494m;

    /* renamed from: n, reason: collision with root package name */
    public int f453495n;

    /* renamed from: o, reason: collision with root package name */
    public long f453496o;

    /* renamed from: p, reason: collision with root package name */
    public int f453497p;

    /* renamed from: q, reason: collision with root package name */
    public int f453498q;

    /* renamed from: r, reason: collision with root package name */
    public int f453499r;

    /* renamed from: s, reason: collision with root package name */
    public int f453500s;

    /* renamed from: t, reason: collision with root package name */
    public int f453501t;

    /* renamed from: u, reason: collision with root package name */
    public int f453502u;

    /* renamed from: v, reason: collision with root package name */
    public long f453503v;

    /* renamed from: w, reason: collision with root package name */
    public long f453504w;

    /* renamed from: x, reason: collision with root package name */
    public long f453505x;

    /* renamed from: y, reason: collision with root package name */
    public int f453506y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f453507z;

    /* renamed from: d, reason: collision with root package name */
    public int f453488d = 268513600;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453489e = "请求不成功，请稍候再试";
    public final java.util.LinkedList A = new java.util.LinkedList();
    public final java.util.LinkedList I = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d0)) {
            return false;
        }
        r45.d0 d0Var = (r45.d0) fVar;
        return n51.f.a(this.f76492x92037252, d0Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f453488d), java.lang.Integer.valueOf(d0Var.f453488d)) && n51.f.a(this.f453489e, d0Var.f453489e) && n51.f.a(this.f453490f, d0Var.f453490f) && n51.f.a(this.f453491g, d0Var.f453491g) && n51.f.a(java.lang.Integer.valueOf(this.f453492h), java.lang.Integer.valueOf(d0Var.f453492h)) && n51.f.a(this.f453493i, d0Var.f453493i) && n51.f.a(java.lang.Long.valueOf(this.f453494m), java.lang.Long.valueOf(d0Var.f453494m)) && n51.f.a(java.lang.Integer.valueOf(this.f453495n), java.lang.Integer.valueOf(d0Var.f453495n)) && n51.f.a(java.lang.Long.valueOf(this.f453496o), java.lang.Long.valueOf(d0Var.f453496o)) && n51.f.a(java.lang.Integer.valueOf(this.f453497p), java.lang.Integer.valueOf(d0Var.f453497p)) && n51.f.a(java.lang.Integer.valueOf(this.f453498q), java.lang.Integer.valueOf(d0Var.f453498q)) && n51.f.a(java.lang.Integer.valueOf(this.f453499r), java.lang.Integer.valueOf(d0Var.f453499r)) && n51.f.a(java.lang.Integer.valueOf(this.f453500s), java.lang.Integer.valueOf(d0Var.f453500s)) && n51.f.a(java.lang.Integer.valueOf(this.f453501t), java.lang.Integer.valueOf(d0Var.f453501t)) && n51.f.a(java.lang.Integer.valueOf(this.f453502u), java.lang.Integer.valueOf(d0Var.f453502u)) && n51.f.a(java.lang.Long.valueOf(this.f453503v), java.lang.Long.valueOf(d0Var.f453503v)) && n51.f.a(java.lang.Long.valueOf(this.f453504w), java.lang.Long.valueOf(d0Var.f453504w)) && n51.f.a(java.lang.Long.valueOf(this.f453505x), java.lang.Long.valueOf(d0Var.f453505x)) && n51.f.a(java.lang.Integer.valueOf(this.f453506y), java.lang.Integer.valueOf(d0Var.f453506y)) && n51.f.a(this.f453507z, d0Var.f453507z) && n51.f.a(this.A, d0Var.A) && n51.f.a(this.B, d0Var.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(d0Var.C)) && n51.f.a(java.lang.Long.valueOf(this.D), java.lang.Long.valueOf(d0Var.D)) && n51.f.a(this.E, d0Var.E) && n51.f.a(this.F, d0Var.F) && n51.f.a(this.G, d0Var.G) && n51.f.a(this.H, d0Var.H) && n51.f.a(this.I, d0Var.I) && n51.f.a(this.f453487J, d0Var.f453487J) && n51.f.a(this.K, d0Var.K) && n51.f.a(this.L, d0Var.L) && n51.f.a(this.M, d0Var.M);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.I;
        java.util.LinkedList linkedList2 = this.A;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f453488d);
            java.lang.String str = this.f453489e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f453490f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f453491g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f453492h);
            java.lang.String str4 = this.f453493i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.h(8, this.f453494m);
            fVar.e(9, this.f453495n);
            fVar.h(10, this.f453496o);
            fVar.e(11, this.f453497p);
            fVar.e(12, this.f453498q);
            fVar.e(13, this.f453499r);
            fVar.e(14, this.f453500s);
            fVar.e(15, this.f453501t);
            fVar.e(16, this.f453502u);
            fVar.h(17, this.f453503v);
            fVar.h(18, this.f453504w);
            fVar.h(19, this.f453505x);
            fVar.e(20, this.f453506y);
            java.lang.String str5 = this.f453507z;
            if (str5 != null) {
                fVar.j(21, str5);
            }
            fVar.g(22, 8, linkedList2);
            java.lang.String str6 = this.B;
            if (str6 != null) {
                fVar.j(23, str6);
            }
            fVar.e(24, this.C);
            fVar.h(25, this.D);
            java.lang.String str7 = this.E;
            if (str7 != null) {
                fVar.j(26, str7);
            }
            java.lang.String str8 = this.F;
            if (str8 != null) {
                fVar.j(27, str8);
            }
            r45.a aVar = this.G;
            if (aVar != null) {
                fVar.i(28, aVar.mo75928xcd1e8d8());
                this.G.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str9 = this.H;
            if (str9 != null) {
                fVar.j(29, str9);
            }
            fVar.g(30, 8, linkedList);
            r45.tw4 tw4Var = this.f453487J;
            if (tw4Var != null) {
                fVar.i(31, tw4Var.mo75928xcd1e8d8());
                this.f453487J.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str10 = this.K;
            if (str10 != null) {
                fVar.j(32, str10);
            }
            java.lang.String str11 = this.L;
            if (str11 != null) {
                fVar.j(33, str11);
            }
            java.lang.String str12 = this.M;
            if (str12 != null) {
                fVar.j(34, str12);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f453488d);
            java.lang.String str13 = this.f453489e;
            if (str13 != null) {
                i18 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f453490f;
            if (str14 != null) {
                i18 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f453491g;
            if (str15 != null) {
                i18 += b36.f.j(5, str15);
            }
            int e17 = i18 + b36.f.e(6, this.f453492h);
            java.lang.String str16 = this.f453493i;
            if (str16 != null) {
                e17 += b36.f.j(7, str16);
            }
            int h17 = e17 + b36.f.h(8, this.f453494m) + b36.f.e(9, this.f453495n) + b36.f.h(10, this.f453496o) + b36.f.e(11, this.f453497p) + b36.f.e(12, this.f453498q) + b36.f.e(13, this.f453499r) + b36.f.e(14, this.f453500s) + b36.f.e(15, this.f453501t) + b36.f.e(16, this.f453502u) + b36.f.h(17, this.f453503v) + b36.f.h(18, this.f453504w) + b36.f.h(19, this.f453505x) + b36.f.e(20, this.f453506y);
            java.lang.String str17 = this.f453507z;
            if (str17 != null) {
                h17 += b36.f.j(21, str17);
            }
            int g17 = h17 + b36.f.g(22, 8, linkedList2);
            java.lang.String str18 = this.B;
            if (str18 != null) {
                g17 += b36.f.j(23, str18);
            }
            int e18 = g17 + b36.f.e(24, this.C) + b36.f.h(25, this.D);
            java.lang.String str19 = this.E;
            if (str19 != null) {
                e18 += b36.f.j(26, str19);
            }
            java.lang.String str20 = this.F;
            if (str20 != null) {
                e18 += b36.f.j(27, str20);
            }
            r45.a aVar2 = this.G;
            if (aVar2 != null) {
                e18 += b36.f.i(28, aVar2.mo75928xcd1e8d8());
            }
            java.lang.String str21 = this.H;
            if (str21 != null) {
                e18 += b36.f.j(29, str21);
            }
            int g18 = e18 + b36.f.g(30, 8, linkedList);
            r45.tw4 tw4Var2 = this.f453487J;
            if (tw4Var2 != null) {
                g18 += b36.f.i(31, tw4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str22 = this.K;
            if (str22 != null) {
                g18 += b36.f.j(32, str22);
            }
            java.lang.String str23 = this.L;
            if (str23 != null) {
                g18 += b36.f.j(33, str23);
            }
            java.lang.String str24 = this.M;
            return str24 != null ? g18 + b36.f.j(34, str24) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar3 = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3)) {
                if (!super.mo75949x4476b383(aVar3, this, m75958x5767edba)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        r45.d0 d0Var = (r45.d0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    d0Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                d0Var.f453488d = aVar4.g(intValue);
                return 0;
            case 3:
                d0Var.f453489e = aVar4.k(intValue);
                return 0;
            case 4:
                d0Var.f453490f = aVar4.k(intValue);
                return 0;
            case 5:
                d0Var.f453491g = aVar4.k(intValue);
                return 0;
            case 6:
                d0Var.f453492h = aVar4.g(intValue);
                return 0;
            case 7:
                d0Var.f453493i = aVar4.k(intValue);
                return 0;
            case 8:
                d0Var.f453494m = aVar4.i(intValue);
                return 0;
            case 9:
                d0Var.f453495n = aVar4.g(intValue);
                return 0;
            case 10:
                d0Var.f453496o = aVar4.i(intValue);
                return 0;
            case 11:
                d0Var.f453497p = aVar4.g(intValue);
                return 0;
            case 12:
                d0Var.f453498q = aVar4.g(intValue);
                return 0;
            case 13:
                d0Var.f453499r = aVar4.g(intValue);
                return 0;
            case 14:
                d0Var.f453500s = aVar4.g(intValue);
                return 0;
            case 15:
                d0Var.f453501t = aVar4.g(intValue);
                return 0;
            case 16:
                d0Var.f453502u = aVar4.g(intValue);
                return 0;
            case 17:
                d0Var.f453503v = aVar4.i(intValue);
                return 0;
            case 18:
                d0Var.f453504w = aVar4.i(intValue);
                return 0;
            case 19:
                d0Var.f453505x = aVar4.i(intValue);
                return 0;
            case 20:
                d0Var.f453506y = aVar4.g(intValue);
                return 0;
            case 21:
                d0Var.f453507z = aVar4.k(intValue);
                return 0;
            case 22:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.a0 a0Var = new r45.a0();
                    if (bArr3 != null && bArr3.length > 0) {
                        a0Var.mo11468x92b714fd(bArr3);
                    }
                    d0Var.A.add(a0Var);
                }
                return 0;
            case 23:
                d0Var.B = aVar4.k(intValue);
                return 0;
            case 24:
                d0Var.C = aVar4.g(intValue);
                return 0;
            case 25:
                d0Var.D = aVar4.i(intValue);
                return 0;
            case 26:
                d0Var.E = aVar4.k(intValue);
                return 0;
            case 27:
                d0Var.F = aVar4.k(intValue);
                return 0;
            case 28:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.a aVar5 = new r45.a();
                    if (bArr4 != null && bArr4.length > 0) {
                        aVar5.mo11468x92b714fd(bArr4);
                    }
                    d0Var.G = aVar5;
                }
                return 0;
            case 29:
                d0Var.H = aVar4.k(intValue);
                return 0;
            case 30:
                java.util.LinkedList j27 = aVar4.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.h0 h0Var = new r45.h0();
                    if (bArr5 != null && bArr5.length > 0) {
                        h0Var.mo11468x92b714fd(bArr5);
                    }
                    d0Var.I.add(h0Var);
                }
                return 0;
            case 31:
                java.util.LinkedList j28 = aVar4.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr6 != null && bArr6.length > 0) {
                        tw4Var3.mo11468x92b714fd(bArr6);
                    }
                    d0Var.f453487J = tw4Var3;
                }
                return 0;
            case 32:
                d0Var.K = aVar4.k(intValue);
                return 0;
            case 33:
                d0Var.L = aVar4.k(intValue);
                return 0;
            case 34:
                d0Var.M = aVar4.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
