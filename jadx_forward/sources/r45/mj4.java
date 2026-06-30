package r45;

/* loaded from: classes4.dex */
public class mj4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;
    public r45.vh4 B;
    public int C;
    public r45.mj4 D;
    public java.lang.String E;
    public r45.cj4 F;
    public r45.cj4 G;
    public r45.vb1 H;
    public java.lang.String I;
    public int K;

    /* renamed from: d, reason: collision with root package name */
    public int f462096d;

    /* renamed from: e, reason: collision with root package name */
    public int f462097e;

    /* renamed from: f, reason: collision with root package name */
    public int f462098f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cj4 f462099g;

    /* renamed from: h, reason: collision with root package name */
    public int f462100h;

    /* renamed from: m, reason: collision with root package name */
    public int f462102m;

    /* renamed from: n, reason: collision with root package name */
    public int f462103n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f462104o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f462105p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f462106q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f462107r;

    /* renamed from: s, reason: collision with root package name */
    public int f462108s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f462109t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f462110u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f462111v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f462112w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f462113x;

    /* renamed from: y, reason: collision with root package name */
    public int f462114y;

    /* renamed from: z, reason: collision with root package name */
    public int f462115z;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f462101i = new java.util.LinkedList();

    /* renamed from: J, reason: collision with root package name */
    public final java.util.LinkedList f462095J = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mj4)) {
            return false;
        }
        r45.mj4 mj4Var = (r45.mj4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462096d), java.lang.Integer.valueOf(mj4Var.f462096d)) && n51.f.a(java.lang.Integer.valueOf(this.f462097e), java.lang.Integer.valueOf(mj4Var.f462097e)) && n51.f.a(java.lang.Integer.valueOf(this.f462098f), java.lang.Integer.valueOf(mj4Var.f462098f)) && n51.f.a(this.f462099g, mj4Var.f462099g) && n51.f.a(java.lang.Integer.valueOf(this.f462100h), java.lang.Integer.valueOf(mj4Var.f462100h)) && n51.f.a(this.f462101i, mj4Var.f462101i) && n51.f.a(java.lang.Integer.valueOf(this.f462102m), java.lang.Integer.valueOf(mj4Var.f462102m)) && n51.f.a(java.lang.Integer.valueOf(this.f462103n), java.lang.Integer.valueOf(mj4Var.f462103n)) && n51.f.a(this.f462104o, mj4Var.f462104o) && n51.f.a(this.f462105p, mj4Var.f462105p) && n51.f.a(this.f462106q, mj4Var.f462106q) && n51.f.a(this.f462107r, mj4Var.f462107r) && n51.f.a(java.lang.Integer.valueOf(this.f462108s), java.lang.Integer.valueOf(mj4Var.f462108s)) && n51.f.a(this.f462109t, mj4Var.f462109t) && n51.f.a(this.f462110u, mj4Var.f462110u) && n51.f.a(this.f462111v, mj4Var.f462111v) && n51.f.a(this.f462112w, mj4Var.f462112w) && n51.f.a(this.f462113x, mj4Var.f462113x) && n51.f.a(java.lang.Integer.valueOf(this.f462114y), java.lang.Integer.valueOf(mj4Var.f462114y)) && n51.f.a(java.lang.Integer.valueOf(this.f462115z), java.lang.Integer.valueOf(mj4Var.f462115z)) && n51.f.a(this.A, mj4Var.A) && n51.f.a(this.B, mj4Var.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(mj4Var.C)) && n51.f.a(this.D, mj4Var.D) && n51.f.a(this.E, mj4Var.E) && n51.f.a(this.F, mj4Var.F) && n51.f.a(this.G, mj4Var.G) && n51.f.a(this.H, mj4Var.H) && n51.f.a(this.I, mj4Var.I) && n51.f.a(this.f462095J, mj4Var.f462095J) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(mj4Var.K));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f462095J;
        java.util.LinkedList linkedList2 = this.f462101i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462096d);
            fVar.e(2, this.f462097e);
            fVar.e(3, this.f462098f);
            r45.cj4 cj4Var = this.f462099g;
            if (cj4Var != null) {
                fVar.i(4, cj4Var.mo75928xcd1e8d8());
                this.f462099g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f462100h);
            fVar.g(6, 8, linkedList2);
            fVar.e(7, this.f462102m);
            fVar.e(8, this.f462103n);
            java.lang.String str = this.f462104o;
            if (str != null) {
                fVar.j(9, str);
            }
            java.lang.String str2 = this.f462105p;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f462106q;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f462107r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.e(13, this.f462108s);
            java.lang.String str5 = this.f462109t;
            if (str5 != null) {
                fVar.j(14, str5);
            }
            java.lang.String str6 = this.f462110u;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.f462111v;
            if (str7 != null) {
                fVar.j(16, str7);
            }
            java.lang.String str8 = this.f462112w;
            if (str8 != null) {
                fVar.j(17, str8);
            }
            java.lang.String str9 = this.f462113x;
            if (str9 != null) {
                fVar.j(18, str9);
            }
            fVar.e(19, this.f462114y);
            fVar.e(20, this.f462115z);
            java.lang.String str10 = this.A;
            if (str10 != null) {
                fVar.j(21, str10);
            }
            r45.vh4 vh4Var = this.B;
            if (vh4Var != null) {
                fVar.i(22, vh4Var.mo75928xcd1e8d8());
                this.B.mo75956x3d5d1f78(fVar);
            }
            fVar.e(23, this.C);
            r45.mj4 mj4Var = this.D;
            if (mj4Var != null) {
                fVar.i(24, mj4Var.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str11 = this.E;
            if (str11 != null) {
                fVar.j(25, str11);
            }
            r45.cj4 cj4Var2 = this.F;
            if (cj4Var2 != null) {
                fVar.i(26, cj4Var2.mo75928xcd1e8d8());
                this.F.mo75956x3d5d1f78(fVar);
            }
            r45.cj4 cj4Var3 = this.G;
            if (cj4Var3 != null) {
                fVar.i(27, cj4Var3.mo75928xcd1e8d8());
                this.G.mo75956x3d5d1f78(fVar);
            }
            r45.vb1 vb1Var = this.H;
            if (vb1Var != null) {
                fVar.i(28, vb1Var.mo75928xcd1e8d8());
                this.H.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str12 = this.I;
            if (str12 != null) {
                fVar.j(29, str12);
            }
            fVar.g(30, 1, linkedList);
            fVar.e(31, this.K);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462096d) + 0 + b36.f.e(2, this.f462097e) + b36.f.e(3, this.f462098f);
            r45.cj4 cj4Var4 = this.f462099g;
            if (cj4Var4 != null) {
                e17 += b36.f.i(4, cj4Var4.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(5, this.f462100h) + b36.f.g(6, 8, linkedList2) + b36.f.e(7, this.f462102m) + b36.f.e(8, this.f462103n);
            java.lang.String str13 = this.f462104o;
            if (str13 != null) {
                e18 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f462105p;
            if (str14 != null) {
                e18 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f462106q;
            if (str15 != null) {
                e18 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f462107r;
            if (str16 != null) {
                e18 += b36.f.j(12, str16);
            }
            int e19 = e18 + b36.f.e(13, this.f462108s);
            java.lang.String str17 = this.f462109t;
            if (str17 != null) {
                e19 += b36.f.j(14, str17);
            }
            java.lang.String str18 = this.f462110u;
            if (str18 != null) {
                e19 += b36.f.j(15, str18);
            }
            java.lang.String str19 = this.f462111v;
            if (str19 != null) {
                e19 += b36.f.j(16, str19);
            }
            java.lang.String str20 = this.f462112w;
            if (str20 != null) {
                e19 += b36.f.j(17, str20);
            }
            java.lang.String str21 = this.f462113x;
            if (str21 != null) {
                e19 += b36.f.j(18, str21);
            }
            int e27 = e19 + b36.f.e(19, this.f462114y) + b36.f.e(20, this.f462115z);
            java.lang.String str22 = this.A;
            if (str22 != null) {
                e27 += b36.f.j(21, str22);
            }
            r45.vh4 vh4Var2 = this.B;
            if (vh4Var2 != null) {
                e27 += b36.f.i(22, vh4Var2.mo75928xcd1e8d8());
            }
            int e28 = e27 + b36.f.e(23, this.C);
            r45.mj4 mj4Var2 = this.D;
            if (mj4Var2 != null) {
                e28 += b36.f.i(24, mj4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str23 = this.E;
            if (str23 != null) {
                e28 += b36.f.j(25, str23);
            }
            r45.cj4 cj4Var5 = this.F;
            if (cj4Var5 != null) {
                e28 += b36.f.i(26, cj4Var5.mo75928xcd1e8d8());
            }
            r45.cj4 cj4Var6 = this.G;
            if (cj4Var6 != null) {
                e28 += b36.f.i(27, cj4Var6.mo75928xcd1e8d8());
            }
            r45.vb1 vb1Var2 = this.H;
            if (vb1Var2 != null) {
                e28 += b36.f.i(28, vb1Var2.mo75928xcd1e8d8());
            }
            java.lang.String str24 = this.I;
            if (str24 != null) {
                e28 += b36.f.j(29, str24);
            }
            return e28 + b36.f.g(30, 1, linkedList) + b36.f.e(31, this.K);
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
        r45.mj4 mj4Var3 = (r45.mj4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mj4Var3.f462096d = aVar2.g(intValue);
                return 0;
            case 2:
                mj4Var3.f462097e = aVar2.g(intValue);
                return 0;
            case 3:
                mj4Var3.f462098f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.cj4 cj4Var7 = new r45.cj4();
                    if (bArr2 != null && bArr2.length > 0) {
                        cj4Var7.mo11468x92b714fd(bArr2);
                    }
                    mj4Var3.f462099g = cj4Var7;
                }
                return 0;
            case 5:
                mj4Var3.f462100h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.cj4 cj4Var8 = new r45.cj4();
                    if (bArr3 != null && bArr3.length > 0) {
                        cj4Var8.mo11468x92b714fd(bArr3);
                    }
                    mj4Var3.f462101i.add(cj4Var8);
                }
                return 0;
            case 7:
                mj4Var3.f462102m = aVar2.g(intValue);
                return 0;
            case 8:
                mj4Var3.f462103n = aVar2.g(intValue);
                return 0;
            case 9:
                mj4Var3.f462104o = aVar2.k(intValue);
                return 0;
            case 10:
                mj4Var3.f462105p = aVar2.k(intValue);
                return 0;
            case 11:
                mj4Var3.f462106q = aVar2.k(intValue);
                return 0;
            case 12:
                mj4Var3.f462107r = aVar2.k(intValue);
                return 0;
            case 13:
                mj4Var3.f462108s = aVar2.g(intValue);
                return 0;
            case 14:
                mj4Var3.f462109t = aVar2.k(intValue);
                return 0;
            case 15:
                mj4Var3.f462110u = aVar2.k(intValue);
                return 0;
            case 16:
                mj4Var3.f462111v = aVar2.k(intValue);
                return 0;
            case 17:
                mj4Var3.f462112w = aVar2.k(intValue);
                return 0;
            case 18:
                mj4Var3.f462113x = aVar2.k(intValue);
                return 0;
            case 19:
                mj4Var3.f462114y = aVar2.g(intValue);
                return 0;
            case 20:
                mj4Var3.f462115z = aVar2.g(intValue);
                return 0;
            case 21:
                mj4Var3.A = aVar2.k(intValue);
                return 0;
            case 22:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.vh4 vh4Var3 = new r45.vh4();
                    if (bArr4 != null && bArr4.length > 0) {
                        vh4Var3.mo11468x92b714fd(bArr4);
                    }
                    mj4Var3.B = vh4Var3;
                }
                return 0;
            case 23:
                mj4Var3.C = aVar2.g(intValue);
                return 0;
            case 24:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.mj4 mj4Var4 = new r45.mj4();
                    if (bArr5 != null && bArr5.length > 0) {
                        mj4Var4.mo11468x92b714fd(bArr5);
                    }
                    mj4Var3.D = mj4Var4;
                }
                return 0;
            case 25:
                mj4Var3.E = aVar2.k(intValue);
                return 0;
            case 26:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.cj4 cj4Var9 = new r45.cj4();
                    if (bArr6 != null && bArr6.length > 0) {
                        cj4Var9.mo11468x92b714fd(bArr6);
                    }
                    mj4Var3.F = cj4Var9;
                }
                return 0;
            case 27:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.cj4 cj4Var10 = new r45.cj4();
                    if (bArr7 != null && bArr7.length > 0) {
                        cj4Var10.mo11468x92b714fd(bArr7);
                    }
                    mj4Var3.G = cj4Var10;
                }
                return 0;
            case 28:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    r45.vb1 vb1Var3 = new r45.vb1();
                    if (bArr8 != null && bArr8.length > 0) {
                        vb1Var3.mo11468x92b714fd(bArr8);
                    }
                    mj4Var3.H = vb1Var3;
                }
                return 0;
            case 29:
                mj4Var3.I = aVar2.k(intValue);
                return 0;
            case 30:
                mj4Var3.f462095J.add(aVar2.k(intValue));
                return 0;
            case 31:
                mj4Var3.K = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
