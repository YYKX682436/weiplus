package r45;

/* loaded from: classes10.dex */
public class i70 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public r45.y25 A;
    public boolean B;
    public int C;
    public float D;
    public int E;
    public int F;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458308d;

    /* renamed from: e, reason: collision with root package name */
    public int f458309e;

    /* renamed from: f, reason: collision with root package name */
    public int f458310f;

    /* renamed from: g, reason: collision with root package name */
    public r45.vl5 f458311g;

    /* renamed from: h, reason: collision with root package name */
    public float f458312h;

    /* renamed from: i, reason: collision with root package name */
    public int f458313i;

    /* renamed from: m, reason: collision with root package name */
    public int f458314m;

    /* renamed from: n, reason: collision with root package name */
    public int f458315n;

    /* renamed from: o, reason: collision with root package name */
    public int f458316o;

    /* renamed from: p, reason: collision with root package name */
    public int f458317p;

    /* renamed from: q, reason: collision with root package name */
    public int f458318q;

    /* renamed from: r, reason: collision with root package name */
    public int f458319r;

    /* renamed from: s, reason: collision with root package name */
    public int f458320s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f458321t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public int f458322u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f458323v;

    /* renamed from: w, reason: collision with root package name */
    public int f458324w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f458325x;

    /* renamed from: y, reason: collision with root package name */
    public r45.vl5 f458326y;

    /* renamed from: z, reason: collision with root package name */
    public r45.y25 f458327z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i70)) {
            return false;
        }
        r45.i70 i70Var = (r45.i70) fVar;
        return n51.f.a(this.f458308d, i70Var.f458308d) && n51.f.a(java.lang.Integer.valueOf(this.f458309e), java.lang.Integer.valueOf(i70Var.f458309e)) && n51.f.a(java.lang.Integer.valueOf(this.f458310f), java.lang.Integer.valueOf(i70Var.f458310f)) && n51.f.a(this.f458311g, i70Var.f458311g) && n51.f.a(java.lang.Float.valueOf(this.f458312h), java.lang.Float.valueOf(i70Var.f458312h)) && n51.f.a(java.lang.Integer.valueOf(this.f458313i), java.lang.Integer.valueOf(i70Var.f458313i)) && n51.f.a(java.lang.Integer.valueOf(this.f458314m), java.lang.Integer.valueOf(i70Var.f458314m)) && n51.f.a(java.lang.Integer.valueOf(this.f458315n), java.lang.Integer.valueOf(i70Var.f458315n)) && n51.f.a(java.lang.Integer.valueOf(this.f458316o), java.lang.Integer.valueOf(i70Var.f458316o)) && n51.f.a(java.lang.Integer.valueOf(this.f458317p), java.lang.Integer.valueOf(i70Var.f458317p)) && n51.f.a(java.lang.Integer.valueOf(this.f458318q), java.lang.Integer.valueOf(i70Var.f458318q)) && n51.f.a(java.lang.Integer.valueOf(this.f458319r), java.lang.Integer.valueOf(i70Var.f458319r)) && n51.f.a(java.lang.Integer.valueOf(this.f458320s), java.lang.Integer.valueOf(i70Var.f458320s)) && n51.f.a(this.f458321t, i70Var.f458321t) && n51.f.a(java.lang.Integer.valueOf(this.f458322u), java.lang.Integer.valueOf(i70Var.f458322u)) && n51.f.a(java.lang.Boolean.valueOf(this.f458323v), java.lang.Boolean.valueOf(i70Var.f458323v)) && n51.f.a(java.lang.Integer.valueOf(this.f458324w), java.lang.Integer.valueOf(i70Var.f458324w)) && n51.f.a(java.lang.Boolean.valueOf(this.f458325x), java.lang.Boolean.valueOf(i70Var.f458325x)) && n51.f.a(this.f458326y, i70Var.f458326y) && n51.f.a(this.f458327z, i70Var.f458327z) && n51.f.a(this.A, i70Var.A) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(i70Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(i70Var.C)) && n51.f.a(java.lang.Float.valueOf(this.D), java.lang.Float.valueOf(i70Var.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(i70Var.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(i70Var.F));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f458321t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458308d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(4, this.f458309e);
            fVar.e(5, this.f458310f);
            r45.vl5 vl5Var = this.f458311g;
            if (vl5Var != null) {
                fVar.i(6, vl5Var.mo75928xcd1e8d8());
                this.f458311g.mo75956x3d5d1f78(fVar);
            }
            fVar.d(7, this.f458312h);
            fVar.e(8, this.f458313i);
            fVar.e(9, this.f458314m);
            fVar.e(10, this.f458315n);
            fVar.e(11, this.f458316o);
            fVar.e(12, this.f458317p);
            fVar.e(13, this.f458318q);
            fVar.e(14, this.f458319r);
            fVar.e(15, this.f458320s);
            fVar.g(16, 2, linkedList);
            fVar.e(17, this.f458322u);
            fVar.a(18, this.f458323v);
            fVar.e(19, this.f458324w);
            fVar.a(20, this.f458325x);
            r45.vl5 vl5Var2 = this.f458326y;
            if (vl5Var2 != null) {
                fVar.i(21, vl5Var2.mo75928xcd1e8d8());
                this.f458326y.mo75956x3d5d1f78(fVar);
            }
            r45.y25 y25Var = this.f458327z;
            if (y25Var != null) {
                fVar.i(22, y25Var.mo75928xcd1e8d8());
                this.f458327z.mo75956x3d5d1f78(fVar);
            }
            r45.y25 y25Var2 = this.A;
            if (y25Var2 != null) {
                fVar.i(23, y25Var2.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            fVar.a(24, this.B);
            fVar.e(25, this.C);
            fVar.d(26, this.D);
            fVar.e(27, this.E);
            fVar.e(28, this.F);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f458308d;
            int j17 = (str2 != null ? b36.f.j(1, str2) + 0 : 0) + b36.f.e(4, this.f458309e) + b36.f.e(5, this.f458310f);
            r45.vl5 vl5Var3 = this.f458311g;
            if (vl5Var3 != null) {
                j17 += b36.f.i(6, vl5Var3.mo75928xcd1e8d8());
            }
            int d17 = j17 + b36.f.d(7, this.f458312h) + b36.f.e(8, this.f458313i) + b36.f.e(9, this.f458314m) + b36.f.e(10, this.f458315n) + b36.f.e(11, this.f458316o) + b36.f.e(12, this.f458317p) + b36.f.e(13, this.f458318q) + b36.f.e(14, this.f458319r) + b36.f.e(15, this.f458320s) + b36.f.g(16, 2, linkedList) + b36.f.e(17, this.f458322u) + b36.f.a(18, this.f458323v) + b36.f.e(19, this.f458324w) + b36.f.a(20, this.f458325x);
            r45.vl5 vl5Var4 = this.f458326y;
            if (vl5Var4 != null) {
                d17 += b36.f.i(21, vl5Var4.mo75928xcd1e8d8());
            }
            r45.y25 y25Var3 = this.f458327z;
            if (y25Var3 != null) {
                d17 += b36.f.i(22, y25Var3.mo75928xcd1e8d8());
            }
            r45.y25 y25Var4 = this.A;
            if (y25Var4 != null) {
                d17 += b36.f.i(23, y25Var4.mo75928xcd1e8d8());
            }
            return d17 + b36.f.a(24, this.B) + b36.f.e(25, this.C) + b36.f.d(26, this.D) + b36.f.e(27, this.E) + b36.f.e(28, this.F);
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
        r45.i70 i70Var = (r45.i70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i70Var.f458308d = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 4:
                i70Var.f458309e = aVar2.g(intValue);
                return 0;
            case 5:
                i70Var.f458310f = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.vl5 vl5Var5 = new r45.vl5();
                    if (bArr2 != null && bArr2.length > 0) {
                        vl5Var5.mo11468x92b714fd(bArr2);
                    }
                    i70Var.f458311g = vl5Var5;
                }
                return 0;
            case 7:
                i70Var.f458312h = aVar2.f(intValue);
                return 0;
            case 8:
                i70Var.f458313i = aVar2.g(intValue);
                return 0;
            case 9:
                i70Var.f458314m = aVar2.g(intValue);
                return 0;
            case 10:
                i70Var.f458315n = aVar2.g(intValue);
                return 0;
            case 11:
                i70Var.f458316o = aVar2.g(intValue);
                return 0;
            case 12:
                i70Var.f458317p = aVar2.g(intValue);
                return 0;
            case 13:
                i70Var.f458318q = aVar2.g(intValue);
                return 0;
            case 14:
                i70Var.f458319r = aVar2.g(intValue);
                return 0;
            case 15:
                i70Var.f458320s = aVar2.g(intValue);
                return 0;
            case 16:
                i70Var.f458321t.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 17:
                i70Var.f458322u = aVar2.g(intValue);
                return 0;
            case 18:
                i70Var.f458323v = aVar2.c(intValue);
                return 0;
            case 19:
                i70Var.f458324w = aVar2.g(intValue);
                return 0;
            case 20:
                i70Var.f458325x = aVar2.c(intValue);
                return 0;
            case 21:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.vl5 vl5Var6 = new r45.vl5();
                    if (bArr3 != null && bArr3.length > 0) {
                        vl5Var6.mo11468x92b714fd(bArr3);
                    }
                    i70Var.f458326y = vl5Var6;
                }
                return 0;
            case 22:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.y25 y25Var5 = new r45.y25();
                    if (bArr4 != null && bArr4.length > 0) {
                        y25Var5.mo11468x92b714fd(bArr4);
                    }
                    i70Var.f458327z = y25Var5;
                }
                return 0;
            case 23:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.y25 y25Var6 = new r45.y25();
                    if (bArr5 != null && bArr5.length > 0) {
                        y25Var6.mo11468x92b714fd(bArr5);
                    }
                    i70Var.A = y25Var6;
                }
                return 0;
            case 24:
                i70Var.B = aVar2.c(intValue);
                return 0;
            case 25:
                i70Var.C = aVar2.g(intValue);
                return 0;
            case 26:
                i70Var.D = aVar2.f(intValue);
                return 0;
            case 27:
                i70Var.E = aVar2.g(intValue);
                return 0;
            case 28:
                i70Var.F = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
