package r45;

/* loaded from: classes4.dex */
public class oa4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public r45.mz6 A;
    public r45.mz6 B;
    public r45.mz6 C;
    public r45.mz6 D;
    public r45.mz6 E;
    public r45.mz6 F;
    public int G;
    public int H;
    public final java.util.LinkedList I = new java.util.LinkedList();

    /* renamed from: J, reason: collision with root package name */
    public int f463608J;

    /* renamed from: d, reason: collision with root package name */
    public int f463609d;

    /* renamed from: e, reason: collision with root package name */
    public int f463610e;

    /* renamed from: f, reason: collision with root package name */
    public int f463611f;

    /* renamed from: g, reason: collision with root package name */
    public int f463612g;

    /* renamed from: h, reason: collision with root package name */
    public int f463613h;

    /* renamed from: i, reason: collision with root package name */
    public int f463614i;

    /* renamed from: m, reason: collision with root package name */
    public int f463615m;

    /* renamed from: n, reason: collision with root package name */
    public int f463616n;

    /* renamed from: o, reason: collision with root package name */
    public int f463617o;

    /* renamed from: p, reason: collision with root package name */
    public int f463618p;

    /* renamed from: q, reason: collision with root package name */
    public int f463619q;

    /* renamed from: r, reason: collision with root package name */
    public int f463620r;

    /* renamed from: s, reason: collision with root package name */
    public int f463621s;

    /* renamed from: t, reason: collision with root package name */
    public int f463622t;

    /* renamed from: u, reason: collision with root package name */
    public int f463623u;

    /* renamed from: v, reason: collision with root package name */
    public int f463624v;

    /* renamed from: w, reason: collision with root package name */
    public r45.mz6 f463625w;

    /* renamed from: x, reason: collision with root package name */
    public r45.mz6 f463626x;

    /* renamed from: y, reason: collision with root package name */
    public r45.mz6 f463627y;

    /* renamed from: z, reason: collision with root package name */
    public int f463628z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oa4)) {
            return false;
        }
        r45.oa4 oa4Var = (r45.oa4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f463609d), java.lang.Integer.valueOf(oa4Var.f463609d)) && n51.f.a(java.lang.Integer.valueOf(this.f463610e), java.lang.Integer.valueOf(oa4Var.f463610e)) && n51.f.a(java.lang.Integer.valueOf(this.f463611f), java.lang.Integer.valueOf(oa4Var.f463611f)) && n51.f.a(java.lang.Integer.valueOf(this.f463612g), java.lang.Integer.valueOf(oa4Var.f463612g)) && n51.f.a(java.lang.Integer.valueOf(this.f463613h), java.lang.Integer.valueOf(oa4Var.f463613h)) && n51.f.a(java.lang.Integer.valueOf(this.f463614i), java.lang.Integer.valueOf(oa4Var.f463614i)) && n51.f.a(java.lang.Integer.valueOf(this.f463615m), java.lang.Integer.valueOf(oa4Var.f463615m)) && n51.f.a(java.lang.Integer.valueOf(this.f463616n), java.lang.Integer.valueOf(oa4Var.f463616n)) && n51.f.a(java.lang.Integer.valueOf(this.f463617o), java.lang.Integer.valueOf(oa4Var.f463617o)) && n51.f.a(java.lang.Integer.valueOf(this.f463618p), java.lang.Integer.valueOf(oa4Var.f463618p)) && n51.f.a(java.lang.Integer.valueOf(this.f463619q), java.lang.Integer.valueOf(oa4Var.f463619q)) && n51.f.a(java.lang.Integer.valueOf(this.f463620r), java.lang.Integer.valueOf(oa4Var.f463620r)) && n51.f.a(java.lang.Integer.valueOf(this.f463621s), java.lang.Integer.valueOf(oa4Var.f463621s)) && n51.f.a(java.lang.Integer.valueOf(this.f463622t), java.lang.Integer.valueOf(oa4Var.f463622t)) && n51.f.a(java.lang.Integer.valueOf(this.f463623u), java.lang.Integer.valueOf(oa4Var.f463623u)) && n51.f.a(java.lang.Integer.valueOf(this.f463624v), java.lang.Integer.valueOf(oa4Var.f463624v)) && n51.f.a(this.f463625w, oa4Var.f463625w) && n51.f.a(this.f463626x, oa4Var.f463626x) && n51.f.a(this.f463627y, oa4Var.f463627y) && n51.f.a(java.lang.Integer.valueOf(this.f463628z), java.lang.Integer.valueOf(oa4Var.f463628z)) && n51.f.a(this.A, oa4Var.A) && n51.f.a(this.B, oa4Var.B) && n51.f.a(this.C, oa4Var.C) && n51.f.a(this.D, oa4Var.D) && n51.f.a(this.E, oa4Var.E) && n51.f.a(this.F, oa4Var.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(oa4Var.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(oa4Var.H)) && n51.f.a(this.I, oa4Var.I) && n51.f.a(java.lang.Integer.valueOf(this.f463608J), java.lang.Integer.valueOf(oa4Var.f463608J));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.I;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f463609d);
            fVar.e(2, this.f463610e);
            fVar.e(3, this.f463611f);
            fVar.e(4, this.f463612g);
            fVar.e(5, this.f463613h);
            fVar.e(6, this.f463614i);
            fVar.e(7, this.f463615m);
            fVar.e(8, this.f463616n);
            fVar.e(9, this.f463617o);
            fVar.e(10, this.f463618p);
            fVar.e(11, this.f463619q);
            fVar.e(12, this.f463620r);
            fVar.e(13, this.f463621s);
            fVar.e(14, this.f463622t);
            fVar.e(15, this.f463623u);
            fVar.e(16, this.f463624v);
            r45.mz6 mz6Var = this.f463625w;
            if (mz6Var != null) {
                fVar.i(23, mz6Var.mo75928xcd1e8d8());
                this.f463625w.mo75956x3d5d1f78(fVar);
            }
            r45.mz6 mz6Var2 = this.f463626x;
            if (mz6Var2 != null) {
                fVar.i(24, mz6Var2.mo75928xcd1e8d8());
                this.f463626x.mo75956x3d5d1f78(fVar);
            }
            r45.mz6 mz6Var3 = this.f463627y;
            if (mz6Var3 != null) {
                fVar.i(25, mz6Var3.mo75928xcd1e8d8());
                this.f463627y.mo75956x3d5d1f78(fVar);
            }
            fVar.e(26, this.f463628z);
            r45.mz6 mz6Var4 = this.A;
            if (mz6Var4 != null) {
                fVar.i(27, mz6Var4.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            r45.mz6 mz6Var5 = this.B;
            if (mz6Var5 != null) {
                fVar.i(29, mz6Var5.mo75928xcd1e8d8());
                this.B.mo75956x3d5d1f78(fVar);
            }
            r45.mz6 mz6Var6 = this.C;
            if (mz6Var6 != null) {
                fVar.i(30, mz6Var6.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            r45.mz6 mz6Var7 = this.D;
            if (mz6Var7 != null) {
                fVar.i(31, mz6Var7.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            r45.mz6 mz6Var8 = this.E;
            if (mz6Var8 != null) {
                fVar.i(32, mz6Var8.mo75928xcd1e8d8());
                this.E.mo75956x3d5d1f78(fVar);
            }
            r45.mz6 mz6Var9 = this.F;
            if (mz6Var9 != null) {
                fVar.i(33, mz6Var9.mo75928xcd1e8d8());
                this.F.mo75956x3d5d1f78(fVar);
            }
            fVar.e(34, this.G);
            fVar.e(35, this.H);
            fVar.g(36, 8, linkedList);
            fVar.e(37, this.f463608J);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f463609d) + 0 + b36.f.e(2, this.f463610e) + b36.f.e(3, this.f463611f) + b36.f.e(4, this.f463612g) + b36.f.e(5, this.f463613h) + b36.f.e(6, this.f463614i) + b36.f.e(7, this.f463615m) + b36.f.e(8, this.f463616n) + b36.f.e(9, this.f463617o) + b36.f.e(10, this.f463618p) + b36.f.e(11, this.f463619q) + b36.f.e(12, this.f463620r) + b36.f.e(13, this.f463621s) + b36.f.e(14, this.f463622t) + b36.f.e(15, this.f463623u) + b36.f.e(16, this.f463624v);
            r45.mz6 mz6Var10 = this.f463625w;
            if (mz6Var10 != null) {
                e17 += b36.f.i(23, mz6Var10.mo75928xcd1e8d8());
            }
            r45.mz6 mz6Var11 = this.f463626x;
            if (mz6Var11 != null) {
                e17 += b36.f.i(24, mz6Var11.mo75928xcd1e8d8());
            }
            r45.mz6 mz6Var12 = this.f463627y;
            if (mz6Var12 != null) {
                e17 += b36.f.i(25, mz6Var12.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(26, this.f463628z);
            r45.mz6 mz6Var13 = this.A;
            if (mz6Var13 != null) {
                e18 += b36.f.i(27, mz6Var13.mo75928xcd1e8d8());
            }
            r45.mz6 mz6Var14 = this.B;
            if (mz6Var14 != null) {
                e18 += b36.f.i(29, mz6Var14.mo75928xcd1e8d8());
            }
            r45.mz6 mz6Var15 = this.C;
            if (mz6Var15 != null) {
                e18 += b36.f.i(30, mz6Var15.mo75928xcd1e8d8());
            }
            r45.mz6 mz6Var16 = this.D;
            if (mz6Var16 != null) {
                e18 += b36.f.i(31, mz6Var16.mo75928xcd1e8d8());
            }
            r45.mz6 mz6Var17 = this.E;
            if (mz6Var17 != null) {
                e18 += b36.f.i(32, mz6Var17.mo75928xcd1e8d8());
            }
            r45.mz6 mz6Var18 = this.F;
            if (mz6Var18 != null) {
                e18 += b36.f.i(33, mz6Var18.mo75928xcd1e8d8());
            }
            return e18 + b36.f.e(34, this.G) + b36.f.e(35, this.H) + b36.f.g(36, 8, linkedList) + b36.f.e(37, this.f463608J);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.oa4 oa4Var = (r45.oa4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oa4Var.f463609d = aVar2.g(intValue);
                return 0;
            case 2:
                oa4Var.f463610e = aVar2.g(intValue);
                return 0;
            case 3:
                oa4Var.f463611f = aVar2.g(intValue);
                return 0;
            case 4:
                oa4Var.f463612g = aVar2.g(intValue);
                return 0;
            case 5:
                oa4Var.f463613h = aVar2.g(intValue);
                return 0;
            case 6:
                oa4Var.f463614i = aVar2.g(intValue);
                return 0;
            case 7:
                oa4Var.f463615m = aVar2.g(intValue);
                return 0;
            case 8:
                oa4Var.f463616n = aVar2.g(intValue);
                return 0;
            case 9:
                oa4Var.f463617o = aVar2.g(intValue);
                return 0;
            case 10:
                oa4Var.f463618p = aVar2.g(intValue);
                return 0;
            case 11:
                oa4Var.f463619q = aVar2.g(intValue);
                return 0;
            case 12:
                oa4Var.f463620r = aVar2.g(intValue);
                return 0;
            case 13:
                oa4Var.f463621s = aVar2.g(intValue);
                return 0;
            case 14:
                oa4Var.f463622t = aVar2.g(intValue);
                return 0;
            case 15:
                oa4Var.f463623u = aVar2.g(intValue);
                return 0;
            case 16:
                oa4Var.f463624v = aVar2.g(intValue);
                return 0;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 28:
            default:
                return -1;
            case 23:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.mz6 mz6Var19 = new r45.mz6();
                    if (bArr2 != null && bArr2.length > 0) {
                        mz6Var19.mo11468x92b714fd(bArr2);
                    }
                    oa4Var.f463625w = mz6Var19;
                }
                return 0;
            case 24:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.mz6 mz6Var20 = new r45.mz6();
                    if (bArr3 != null && bArr3.length > 0) {
                        mz6Var20.mo11468x92b714fd(bArr3);
                    }
                    oa4Var.f463626x = mz6Var20;
                }
                return 0;
            case 25:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.mz6 mz6Var21 = new r45.mz6();
                    if (bArr4 != null && bArr4.length > 0) {
                        mz6Var21.mo11468x92b714fd(bArr4);
                    }
                    oa4Var.f463627y = mz6Var21;
                }
                return 0;
            case 26:
                oa4Var.f463628z = aVar2.g(intValue);
                return 0;
            case 27:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.mz6 mz6Var22 = new r45.mz6();
                    if (bArr5 != null && bArr5.length > 0) {
                        mz6Var22.mo11468x92b714fd(bArr5);
                    }
                    oa4Var.A = mz6Var22;
                }
                return 0;
            case 29:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.mz6 mz6Var23 = new r45.mz6();
                    if (bArr6 != null && bArr6.length > 0) {
                        mz6Var23.mo11468x92b714fd(bArr6);
                    }
                    oa4Var.B = mz6Var23;
                }
                return 0;
            case 30:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.mz6 mz6Var24 = new r45.mz6();
                    if (bArr7 != null && bArr7.length > 0) {
                        mz6Var24.mo11468x92b714fd(bArr7);
                    }
                    oa4Var.C = mz6Var24;
                }
                return 0;
            case 31:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    r45.mz6 mz6Var25 = new r45.mz6();
                    if (bArr8 != null && bArr8.length > 0) {
                        mz6Var25.mo11468x92b714fd(bArr8);
                    }
                    oa4Var.D = mz6Var25;
                }
                return 0;
            case 32:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr9 = (byte[]) j38.get(i39);
                    r45.mz6 mz6Var26 = new r45.mz6();
                    if (bArr9 != null && bArr9.length > 0) {
                        mz6Var26.mo11468x92b714fd(bArr9);
                    }
                    oa4Var.E = mz6Var26;
                }
                return 0;
            case 33:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr10 = (byte[]) j39.get(i47);
                    r45.mz6 mz6Var27 = new r45.mz6();
                    if (bArr10 != null && bArr10.length > 0) {
                        mz6Var27.mo11468x92b714fd(bArr10);
                    }
                    oa4Var.F = mz6Var27;
                }
                return 0;
            case 34:
                oa4Var.G = aVar2.g(intValue);
                return 0;
            case 35:
                oa4Var.H = aVar2.g(intValue);
                return 0;
            case 36:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr11 = (byte[]) j47.get(i48);
                    r45.nz6 nz6Var = new r45.nz6();
                    if (bArr11 != null && bArr11.length > 0) {
                        nz6Var.mo11468x92b714fd(bArr11);
                    }
                    oa4Var.I.add(nz6Var);
                }
                return 0;
            case 37:
                oa4Var.f463608J = aVar2.g(intValue);
                return 0;
        }
    }
}
