package r45;

/* loaded from: classes10.dex */
public class hi0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public r45.se6 A;
    public int B;
    public long C;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457713d;

    /* renamed from: e, reason: collision with root package name */
    public long f457714e;

    /* renamed from: f, reason: collision with root package name */
    public long f457715f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457716g;

    /* renamed from: h, reason: collision with root package name */
    public int f457717h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457718i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f457719m;

    /* renamed from: n, reason: collision with root package name */
    public int f457720n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f457721o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f457722p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f457723q;

    /* renamed from: r, reason: collision with root package name */
    public int f457724r;

    /* renamed from: s, reason: collision with root package name */
    public int f457725s;

    /* renamed from: t, reason: collision with root package name */
    public int f457726t;

    /* renamed from: u, reason: collision with root package name */
    public int f457727u;

    /* renamed from: w, reason: collision with root package name */
    public long f457729w;

    /* renamed from: x, reason: collision with root package name */
    public int f457730x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f457731y;

    /* renamed from: z, reason: collision with root package name */
    public r45.tl5 f457732z;

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f457728v = new java.util.LinkedList();
    public final java.util.LinkedList D = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hi0)) {
            return false;
        }
        r45.hi0 hi0Var = (r45.hi0) fVar;
        return n51.f.a(this.f457713d, hi0Var.f457713d) && n51.f.a(java.lang.Long.valueOf(this.f457714e), java.lang.Long.valueOf(hi0Var.f457714e)) && n51.f.a(java.lang.Long.valueOf(this.f457715f), java.lang.Long.valueOf(hi0Var.f457715f)) && n51.f.a(this.f457716g, hi0Var.f457716g) && n51.f.a(java.lang.Integer.valueOf(this.f457717h), java.lang.Integer.valueOf(hi0Var.f457717h)) && n51.f.a(this.f457718i, hi0Var.f457718i) && n51.f.a(this.f457719m, hi0Var.f457719m) && n51.f.a(java.lang.Integer.valueOf(this.f457720n), java.lang.Integer.valueOf(hi0Var.f457720n)) && n51.f.a(this.f457721o, hi0Var.f457721o) && n51.f.a(java.lang.Boolean.valueOf(this.f457722p), java.lang.Boolean.valueOf(hi0Var.f457722p)) && n51.f.a(java.lang.Boolean.valueOf(this.f457723q), java.lang.Boolean.valueOf(hi0Var.f457723q)) && n51.f.a(java.lang.Integer.valueOf(this.f457724r), java.lang.Integer.valueOf(hi0Var.f457724r)) && n51.f.a(java.lang.Integer.valueOf(this.f457725s), java.lang.Integer.valueOf(hi0Var.f457725s)) && n51.f.a(java.lang.Integer.valueOf(this.f457726t), java.lang.Integer.valueOf(hi0Var.f457726t)) && n51.f.a(java.lang.Integer.valueOf(this.f457727u), java.lang.Integer.valueOf(hi0Var.f457727u)) && n51.f.a(this.f457728v, hi0Var.f457728v) && n51.f.a(java.lang.Long.valueOf(this.f457729w), java.lang.Long.valueOf(hi0Var.f457729w)) && n51.f.a(java.lang.Integer.valueOf(this.f457730x), java.lang.Integer.valueOf(hi0Var.f457730x)) && n51.f.a(java.lang.Boolean.valueOf(this.f457731y), java.lang.Boolean.valueOf(hi0Var.f457731y)) && n51.f.a(this.f457732z, hi0Var.f457732z) && n51.f.a(this.A, hi0Var.A) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(hi0Var.B)) && n51.f.a(java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(hi0Var.C)) && n51.f.a(this.D, hi0Var.D) && n51.f.a(this.E, hi0Var.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(hi0Var.F)) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(hi0Var.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(hi0Var.H)) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(hi0Var.I));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.D;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f457713d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f457714e);
            fVar.h(3, this.f457715f);
            java.lang.String str2 = this.f457716g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f457717h);
            java.lang.String str3 = this.f457718i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f457719m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f457720n);
            java.lang.String str5 = this.f457721o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.a(10, this.f457722p);
            fVar.a(11, this.f457723q);
            fVar.e(12, this.f457724r);
            fVar.e(13, this.f457725s);
            fVar.e(14, this.f457726t);
            fVar.e(15, this.f457727u);
            fVar.g(16, 8, this.f457728v);
            fVar.h(17, this.f457729w);
            fVar.e(18, this.f457730x);
            fVar.a(19, this.f457731y);
            r45.tl5 tl5Var = this.f457732z;
            if (tl5Var != null) {
                fVar.i(20, tl5Var.mo75928xcd1e8d8());
                this.f457732z.mo75956x3d5d1f78(fVar);
            }
            r45.se6 se6Var = this.A;
            if (se6Var != null) {
                fVar.i(21, se6Var.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            fVar.e(22, this.B);
            fVar.h(23, this.C);
            fVar.g(24, 1, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.E;
            if (gVar != null) {
                fVar.b(25, gVar);
            }
            fVar.e(26, this.F);
            fVar.e(27, this.G);
            fVar.e(28, this.H);
            fVar.e(29, this.I);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f457713d;
            int j17 = (str6 != null ? b36.f.j(1, str6) + 0 : 0) + b36.f.h(2, this.f457714e) + b36.f.h(3, this.f457715f);
            java.lang.String str7 = this.f457716g;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            int e17 = j17 + b36.f.e(5, this.f457717h);
            java.lang.String str8 = this.f457718i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f457719m;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            int e18 = e17 + b36.f.e(8, this.f457720n);
            java.lang.String str10 = this.f457721o;
            if (str10 != null) {
                e18 += b36.f.j(9, str10);
            }
            int a17 = e18 + b36.f.a(10, this.f457722p) + b36.f.a(11, this.f457723q) + b36.f.e(12, this.f457724r) + b36.f.e(13, this.f457725s) + b36.f.e(14, this.f457726t) + b36.f.e(15, this.f457727u) + b36.f.g(16, 8, this.f457728v) + b36.f.h(17, this.f457729w) + b36.f.e(18, this.f457730x) + b36.f.a(19, this.f457731y);
            r45.tl5 tl5Var2 = this.f457732z;
            if (tl5Var2 != null) {
                a17 += b36.f.i(20, tl5Var2.mo75928xcd1e8d8());
            }
            r45.se6 se6Var2 = this.A;
            if (se6Var2 != null) {
                a17 += b36.f.i(21, se6Var2.mo75928xcd1e8d8());
            }
            int e19 = a17 + b36.f.e(22, this.B) + b36.f.h(23, this.C) + b36.f.g(24, 1, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.E;
            if (gVar2 != null) {
                e19 += b36.f.b(25, gVar2);
            }
            return e19 + b36.f.e(26, this.F) + b36.f.e(27, this.G) + b36.f.e(28, this.H) + b36.f.e(29, this.I);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f457728v.clear();
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
        r45.hi0 hi0Var = (r45.hi0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hi0Var.f457713d = aVar2.k(intValue);
                return 0;
            case 2:
                hi0Var.f457714e = aVar2.i(intValue);
                return 0;
            case 3:
                hi0Var.f457715f = aVar2.i(intValue);
                return 0;
            case 4:
                hi0Var.f457716g = aVar2.k(intValue);
                return 0;
            case 5:
                hi0Var.f457717h = aVar2.g(intValue);
                return 0;
            case 6:
                hi0Var.f457718i = aVar2.k(intValue);
                return 0;
            case 7:
                hi0Var.f457719m = aVar2.k(intValue);
                return 0;
            case 8:
                hi0Var.f457720n = aVar2.g(intValue);
                return 0;
            case 9:
                hi0Var.f457721o = aVar2.k(intValue);
                return 0;
            case 10:
                hi0Var.f457722p = aVar2.c(intValue);
                return 0;
            case 11:
                hi0Var.f457723q = aVar2.c(intValue);
                return 0;
            case 12:
                hi0Var.f457724r = aVar2.g(intValue);
                return 0;
            case 13:
                hi0Var.f457725s = aVar2.g(intValue);
                return 0;
            case 14:
                hi0Var.f457726t = aVar2.g(intValue);
                return 0;
            case 15:
                hi0Var.f457727u = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.de deVar = new r45.de();
                    if (bArr2 != null && bArr2.length > 0) {
                        deVar.mo11468x92b714fd(bArr2);
                    }
                    hi0Var.f457728v.add(deVar);
                }
                return 0;
            case 17:
                hi0Var.f457729w = aVar2.i(intValue);
                return 0;
            case 18:
                hi0Var.f457730x = aVar2.g(intValue);
                return 0;
            case 19:
                hi0Var.f457731y = aVar2.c(intValue);
                return 0;
            case 20:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.tl5 tl5Var3 = new r45.tl5();
                    if (bArr3 != null && bArr3.length > 0) {
                        tl5Var3.mo11468x92b714fd(bArr3);
                    }
                    hi0Var.f457732z = tl5Var3;
                }
                return 0;
            case 21:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.se6 se6Var3 = new r45.se6();
                    if (bArr4 != null && bArr4.length > 0) {
                        se6Var3.mo11468x92b714fd(bArr4);
                    }
                    hi0Var.A = se6Var3;
                }
                return 0;
            case 22:
                hi0Var.B = aVar2.g(intValue);
                return 0;
            case 23:
                hi0Var.C = aVar2.i(intValue);
                return 0;
            case 24:
                hi0Var.D.add(aVar2.k(intValue));
                return 0;
            case 25:
                hi0Var.E = aVar2.d(intValue);
                return 0;
            case 26:
                hi0Var.F = aVar2.g(intValue);
                return 0;
            case 27:
                hi0Var.G = aVar2.g(intValue);
                return 0;
            case 28:
                hi0Var.H = aVar2.g(intValue);
                return 0;
            case 29:
                hi0Var.I = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
