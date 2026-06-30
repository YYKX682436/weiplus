package m53;

/* loaded from: classes8.dex */
public class r5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public m53.o5 A;
    public boolean B;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405547d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405548e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405549f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405550g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f405551h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f405552i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f405553m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f405554n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f405555o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f405556p;

    /* renamed from: q, reason: collision with root package name */
    public int f405557q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f405558r;

    /* renamed from: s, reason: collision with root package name */
    public m53.p5 f405559s;

    /* renamed from: t, reason: collision with root package name */
    public m53.q5 f405560t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f405561u;

    /* renamed from: v, reason: collision with root package name */
    public int f405562v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f405563w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f405564x = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public boolean f405565y;

    /* renamed from: z, reason: collision with root package name */
    public int f405566z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.r5)) {
            return false;
        }
        m53.r5 r5Var = (m53.r5) fVar;
        return n51.f.a(this.f405547d, r5Var.f405547d) && n51.f.a(this.f405548e, r5Var.f405548e) && n51.f.a(this.f405549f, r5Var.f405549f) && n51.f.a(this.f405550g, r5Var.f405550g) && n51.f.a(this.f405551h, r5Var.f405551h) && n51.f.a(this.f405552i, r5Var.f405552i) && n51.f.a(this.f405553m, r5Var.f405553m) && n51.f.a(this.f405554n, r5Var.f405554n) && n51.f.a(this.f405555o, r5Var.f405555o) && n51.f.a(this.f405556p, r5Var.f405556p) && n51.f.a(java.lang.Integer.valueOf(this.f405557q), java.lang.Integer.valueOf(r5Var.f405557q)) && n51.f.a(this.f405558r, r5Var.f405558r) && n51.f.a(this.f405559s, r5Var.f405559s) && n51.f.a(this.f405560t, r5Var.f405560t) && n51.f.a(java.lang.Boolean.valueOf(this.f405561u), java.lang.Boolean.valueOf(r5Var.f405561u)) && n51.f.a(java.lang.Integer.valueOf(this.f405562v), java.lang.Integer.valueOf(r5Var.f405562v)) && n51.f.a(java.lang.Boolean.valueOf(this.f405563w), java.lang.Boolean.valueOf(r5Var.f405563w)) && n51.f.a(this.f405564x, r5Var.f405564x) && n51.f.a(java.lang.Boolean.valueOf(this.f405565y), java.lang.Boolean.valueOf(r5Var.f405565y)) && n51.f.a(java.lang.Integer.valueOf(this.f405566z), java.lang.Integer.valueOf(r5Var.f405566z)) && n51.f.a(this.A, r5Var.A) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(r5Var.B));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405564x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405547d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405548e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f405549f;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f405550g;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f405551h;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f405552i;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            java.lang.String str7 = this.f405553m;
            if (str7 != null) {
                fVar.j(3, str7);
            }
            java.lang.String str8 = this.f405554n;
            if (str8 != null) {
                fVar.j(4, str8);
            }
            java.lang.String str9 = this.f405555o;
            if (str9 != null) {
                fVar.j(9, str9);
            }
            java.lang.String str10 = this.f405556p;
            if (str10 != null) {
                fVar.j(10, str10);
            }
            fVar.e(5, this.f405557q);
            java.lang.String str11 = this.f405558r;
            if (str11 != null) {
                fVar.j(6, str11);
            }
            m53.p5 p5Var = this.f405559s;
            if (p5Var != null) {
                fVar.i(7, p5Var.mo75928xcd1e8d8());
                this.f405559s.mo75956x3d5d1f78(fVar);
            }
            m53.q5 q5Var = this.f405560t;
            if (q5Var != null) {
                fVar.i(8, q5Var.mo75928xcd1e8d8());
                this.f405560t.mo75956x3d5d1f78(fVar);
            }
            fVar.a(15, this.f405561u);
            fVar.e(16, this.f405562v);
            fVar.a(17, this.f405563w);
            fVar.g(18, 8, linkedList);
            fVar.a(19, this.f405565y);
            fVar.e(20, this.f405566z);
            m53.o5 o5Var = this.A;
            if (o5Var != null) {
                fVar.i(21, o5Var.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            fVar.a(22, this.B);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f405547d;
            int j17 = str12 != null ? b36.f.j(1, str12) + 0 : 0;
            java.lang.String str13 = this.f405548e;
            if (str13 != null) {
                j17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f405549f;
            if (str14 != null) {
                j17 += b36.f.j(11, str14);
            }
            java.lang.String str15 = this.f405550g;
            if (str15 != null) {
                j17 += b36.f.j(12, str15);
            }
            java.lang.String str16 = this.f405551h;
            if (str16 != null) {
                j17 += b36.f.j(13, str16);
            }
            java.lang.String str17 = this.f405552i;
            if (str17 != null) {
                j17 += b36.f.j(14, str17);
            }
            java.lang.String str18 = this.f405553m;
            if (str18 != null) {
                j17 += b36.f.j(3, str18);
            }
            java.lang.String str19 = this.f405554n;
            if (str19 != null) {
                j17 += b36.f.j(4, str19);
            }
            java.lang.String str20 = this.f405555o;
            if (str20 != null) {
                j17 += b36.f.j(9, str20);
            }
            java.lang.String str21 = this.f405556p;
            if (str21 != null) {
                j17 += b36.f.j(10, str21);
            }
            int e17 = j17 + b36.f.e(5, this.f405557q);
            java.lang.String str22 = this.f405558r;
            if (str22 != null) {
                e17 += b36.f.j(6, str22);
            }
            m53.p5 p5Var2 = this.f405559s;
            if (p5Var2 != null) {
                e17 += b36.f.i(7, p5Var2.mo75928xcd1e8d8());
            }
            m53.q5 q5Var2 = this.f405560t;
            if (q5Var2 != null) {
                e17 += b36.f.i(8, q5Var2.mo75928xcd1e8d8());
            }
            int a17 = e17 + b36.f.a(15, this.f405561u) + b36.f.e(16, this.f405562v) + b36.f.a(17, this.f405563w) + b36.f.g(18, 8, linkedList) + b36.f.a(19, this.f405565y) + b36.f.e(20, this.f405566z);
            m53.o5 o5Var2 = this.A;
            if (o5Var2 != null) {
                a17 += b36.f.i(21, o5Var2.mo75928xcd1e8d8());
            }
            return a17 + b36.f.a(22, this.B);
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
        m53.r5 r5Var = (m53.r5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                r5Var.f405547d = aVar2.k(intValue);
                return 0;
            case 2:
                r5Var.f405548e = aVar2.k(intValue);
                return 0;
            case 3:
                r5Var.f405553m = aVar2.k(intValue);
                return 0;
            case 4:
                r5Var.f405554n = aVar2.k(intValue);
                return 0;
            case 5:
                r5Var.f405557q = aVar2.g(intValue);
                return 0;
            case 6:
                r5Var.f405558r = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    m53.p5 p5Var3 = new m53.p5();
                    if (bArr2 != null && bArr2.length > 0) {
                        p5Var3.mo11468x92b714fd(bArr2);
                    }
                    r5Var.f405559s = p5Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    m53.q5 q5Var3 = new m53.q5();
                    if (bArr3 != null && bArr3.length > 0) {
                        q5Var3.mo11468x92b714fd(bArr3);
                    }
                    r5Var.f405560t = q5Var3;
                }
                return 0;
            case 9:
                r5Var.f405555o = aVar2.k(intValue);
                return 0;
            case 10:
                r5Var.f405556p = aVar2.k(intValue);
                return 0;
            case 11:
                r5Var.f405549f = aVar2.k(intValue);
                return 0;
            case 12:
                r5Var.f405550g = aVar2.k(intValue);
                return 0;
            case 13:
                r5Var.f405551h = aVar2.k(intValue);
                return 0;
            case 14:
                r5Var.f405552i = aVar2.k(intValue);
                return 0;
            case 15:
                r5Var.f405561u = aVar2.c(intValue);
                return 0;
            case 16:
                r5Var.f405562v = aVar2.g(intValue);
                return 0;
            case 17:
                r5Var.f405563w = aVar2.c(intValue);
                return 0;
            case 18:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    m53.m5 m5Var = new m53.m5();
                    if (bArr4 != null && bArr4.length > 0) {
                        m5Var.mo11468x92b714fd(bArr4);
                    }
                    r5Var.f405564x.add(m5Var);
                }
                return 0;
            case 19:
                r5Var.f405565y = aVar2.c(intValue);
                return 0;
            case 20:
                r5Var.f405566z = aVar2.g(intValue);
                return 0;
            case 21:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    m53.o5 o5Var3 = new m53.o5();
                    if (bArr5 != null && bArr5.length > 0) {
                        o5Var3.mo11468x92b714fd(bArr5);
                    }
                    r5Var.A = o5Var3;
                }
                return 0;
            case 22:
                r5Var.B = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
