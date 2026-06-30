package r45;

/* loaded from: classes4.dex */
public class c64 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452843d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452844e;

    /* renamed from: f, reason: collision with root package name */
    public float f452845f;

    /* renamed from: g, reason: collision with root package name */
    public int f452846g;

    /* renamed from: i, reason: collision with root package name */
    public int f452848i;

    /* renamed from: n, reason: collision with root package name */
    public float f452850n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f452851o;

    /* renamed from: p, reason: collision with root package name */
    public int f452852p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cu5 f452853q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f452854r;

    /* renamed from: s, reason: collision with root package name */
    public r45.cu5 f452855s;

    /* renamed from: t, reason: collision with root package name */
    public int f452856t;

    /* renamed from: u, reason: collision with root package name */
    public int f452857u;

    /* renamed from: v, reason: collision with root package name */
    public float f452858v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f452859w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f452860x;

    /* renamed from: y, reason: collision with root package name */
    public double f452861y;

    /* renamed from: z, reason: collision with root package name */
    public double f452862z;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f452847h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f452849m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c64)) {
            return false;
        }
        r45.c64 c64Var = (r45.c64) fVar;
        return n51.f.a(this.f452843d, c64Var.f452843d) && n51.f.a(this.f452844e, c64Var.f452844e) && n51.f.a(java.lang.Float.valueOf(this.f452845f), java.lang.Float.valueOf(c64Var.f452845f)) && n51.f.a(java.lang.Integer.valueOf(this.f452846g), java.lang.Integer.valueOf(c64Var.f452846g)) && n51.f.a(this.f452847h, c64Var.f452847h) && n51.f.a(java.lang.Integer.valueOf(this.f452848i), java.lang.Integer.valueOf(c64Var.f452848i)) && n51.f.a(this.f452849m, c64Var.f452849m) && n51.f.a(java.lang.Float.valueOf(this.f452850n), java.lang.Float.valueOf(c64Var.f452850n)) && n51.f.a(this.f452851o, c64Var.f452851o) && n51.f.a(java.lang.Integer.valueOf(this.f452852p), java.lang.Integer.valueOf(c64Var.f452852p)) && n51.f.a(this.f452853q, c64Var.f452853q) && n51.f.a(this.f452854r, c64Var.f452854r) && n51.f.a(this.f452855s, c64Var.f452855s) && n51.f.a(java.lang.Integer.valueOf(this.f452856t), java.lang.Integer.valueOf(c64Var.f452856t)) && n51.f.a(java.lang.Integer.valueOf(this.f452857u), java.lang.Integer.valueOf(c64Var.f452857u)) && n51.f.a(java.lang.Float.valueOf(this.f452858v), java.lang.Float.valueOf(c64Var.f452858v)) && n51.f.a(this.f452859w, c64Var.f452859w) && n51.f.a(this.f452860x, c64Var.f452860x) && n51.f.a(java.lang.Double.valueOf(this.f452861y), java.lang.Double.valueOf(c64Var.f452861y)) && n51.f.a(java.lang.Double.valueOf(this.f452862z), java.lang.Double.valueOf(c64Var.f452862z)) && n51.f.a(this.A, c64Var.A);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452843d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452844e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.d(3, this.f452845f);
            fVar.e(4, this.f452846g);
            fVar.k(5, 2, this.f452847h);
            fVar.e(6, this.f452848i);
            fVar.g(7, 8, this.f452849m);
            fVar.d(8, this.f452850n);
            java.lang.String str3 = this.f452851o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f452852p);
            r45.cu5 cu5Var = this.f452853q;
            if (cu5Var != null) {
                fVar.i(11, cu5Var.mo75928xcd1e8d8());
                this.f452853q.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f452854r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            r45.cu5 cu5Var2 = this.f452855s;
            if (cu5Var2 != null) {
                fVar.i(13, cu5Var2.mo75928xcd1e8d8());
                this.f452855s.mo75956x3d5d1f78(fVar);
            }
            fVar.e(14, this.f452856t);
            fVar.e(15, this.f452857u);
            fVar.d(16, this.f452858v);
            java.lang.String str5 = this.f452859w;
            if (str5 != null) {
                fVar.j(17, str5);
            }
            java.lang.String str6 = this.f452860x;
            if (str6 != null) {
                fVar.j(18, str6);
            }
            fVar.c(19, this.f452861y);
            fVar.c(20, this.f452862z);
            java.lang.String str7 = this.A;
            if (str7 == null) {
                return 0;
            }
            fVar.j(21, str7);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f452843d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f452844e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int d17 = j17 + b36.f.d(3, this.f452845f) + b36.f.e(4, this.f452846g) + b36.f.k(5, 2, this.f452847h) + b36.f.e(6, this.f452848i) + b36.f.g(7, 8, this.f452849m) + b36.f.d(8, this.f452850n);
            java.lang.String str10 = this.f452851o;
            if (str10 != null) {
                d17 += b36.f.j(9, str10);
            }
            int e17 = d17 + b36.f.e(10, this.f452852p);
            r45.cu5 cu5Var3 = this.f452853q;
            if (cu5Var3 != null) {
                e17 += b36.f.i(11, cu5Var3.mo75928xcd1e8d8());
            }
            java.lang.String str11 = this.f452854r;
            if (str11 != null) {
                e17 += b36.f.j(12, str11);
            }
            r45.cu5 cu5Var4 = this.f452855s;
            if (cu5Var4 != null) {
                e17 += b36.f.i(13, cu5Var4.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(14, this.f452856t) + b36.f.e(15, this.f452857u) + b36.f.d(16, this.f452858v);
            java.lang.String str12 = this.f452859w;
            if (str12 != null) {
                e18 += b36.f.j(17, str12);
            }
            java.lang.String str13 = this.f452860x;
            if (str13 != null) {
                e18 += b36.f.j(18, str13);
            }
            int c17 = e18 + b36.f.c(19, this.f452861y) + b36.f.c(20, this.f452862z);
            java.lang.String str14 = this.A;
            return str14 != null ? c17 + b36.f.j(21, str14) : c17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f452847h.clear();
            this.f452849m.clear();
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
        r45.c64 c64Var = (r45.c64) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c64Var.f452843d = aVar2.k(intValue);
                return 0;
            case 2:
                c64Var.f452844e = aVar2.k(intValue);
                return 0;
            case 3:
                c64Var.f452845f = aVar2.f(intValue);
                return 0;
            case 4:
                c64Var.f452846g = aVar2.g(intValue);
                return 0;
            case 5:
                byte[] bArr2 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr2, 0, bArr2.length);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (aVar3.f329129c < aVar3.f329128b) {
                    linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                c64Var.f452847h = linkedList;
                return 0;
            case 6:
                c64Var.f452848i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr3 = (byte[]) j18.get(i18);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var.b(bArr3);
                    }
                    c64Var.f452849m.add(du5Var);
                }
                return 0;
            case 8:
                c64Var.f452850n = aVar2.f(intValue);
                return 0;
            case 9:
                c64Var.f452851o = aVar2.k(intValue);
                return 0;
            case 10:
                c64Var.f452852p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr4 = (byte[]) j19.get(i19);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var5.b(bArr4);
                    }
                    c64Var.f452853q = cu5Var5;
                }
                return 0;
            case 12:
                c64Var.f452854r = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr5 = (byte[]) j27.get(i27);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var6.b(bArr5);
                    }
                    c64Var.f452855s = cu5Var6;
                }
                return 0;
            case 14:
                c64Var.f452856t = aVar2.g(intValue);
                return 0;
            case 15:
                c64Var.f452857u = aVar2.g(intValue);
                return 0;
            case 16:
                c64Var.f452858v = aVar2.f(intValue);
                return 0;
            case 17:
                c64Var.f452859w = aVar2.k(intValue);
                return 0;
            case 18:
                c64Var.f452860x = aVar2.k(intValue);
                return 0;
            case 19:
                c64Var.f452861y = aVar2.e(intValue);
                return 0;
            case 20:
                c64Var.f452862z = aVar2.e(intValue);
                return 0;
            case 21:
                c64Var.A = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
