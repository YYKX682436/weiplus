package m53;

/* loaded from: classes8.dex */
public class h extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public m53.e3 B;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405250d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405251e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405252f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405253g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f405254h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f405255i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f405256m;

    /* renamed from: n, reason: collision with root package name */
    public int f405257n;

    /* renamed from: o, reason: collision with root package name */
    public m53.b0 f405258o;

    /* renamed from: p, reason: collision with root package name */
    public int f405259p;

    /* renamed from: q, reason: collision with root package name */
    public int f405260q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f405261r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f405262s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f405264u;

    /* renamed from: v, reason: collision with root package name */
    public int f405265v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f405266w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f405267x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f405268y;

    /* renamed from: z, reason: collision with root package name */
    public m53.s3 f405269z;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f405263t = new java.util.LinkedList();
    public final java.util.LinkedList C = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.h)) {
            return false;
        }
        m53.h hVar = (m53.h) fVar;
        return n51.f.a(this.f405250d, hVar.f405250d) && n51.f.a(this.f405251e, hVar.f405251e) && n51.f.a(this.f405252f, hVar.f405252f) && n51.f.a(this.f405253g, hVar.f405253g) && n51.f.a(this.f405254h, hVar.f405254h) && n51.f.a(this.f405255i, hVar.f405255i) && n51.f.a(this.f405256m, hVar.f405256m) && n51.f.a(java.lang.Integer.valueOf(this.f405257n), java.lang.Integer.valueOf(hVar.f405257n)) && n51.f.a(this.f405258o, hVar.f405258o) && n51.f.a(java.lang.Integer.valueOf(this.f405259p), java.lang.Integer.valueOf(hVar.f405259p)) && n51.f.a(java.lang.Integer.valueOf(this.f405260q), java.lang.Integer.valueOf(hVar.f405260q)) && n51.f.a(this.f405261r, hVar.f405261r) && n51.f.a(java.lang.Boolean.valueOf(this.f405262s), java.lang.Boolean.valueOf(hVar.f405262s)) && n51.f.a(this.f405263t, hVar.f405263t) && n51.f.a(java.lang.Boolean.valueOf(this.f405264u), java.lang.Boolean.valueOf(hVar.f405264u)) && n51.f.a(java.lang.Integer.valueOf(this.f405265v), java.lang.Integer.valueOf(hVar.f405265v)) && n51.f.a(java.lang.Boolean.valueOf(this.f405266w), java.lang.Boolean.valueOf(hVar.f405266w)) && n51.f.a(java.lang.Boolean.valueOf(this.f405267x), java.lang.Boolean.valueOf(hVar.f405267x)) && n51.f.a(java.lang.Boolean.valueOf(this.f405268y), java.lang.Boolean.valueOf(hVar.f405268y)) && n51.f.a(this.f405269z, hVar.f405269z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(hVar.A)) && n51.f.a(this.B, hVar.B) && n51.f.a(this.C, hVar.C);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.C;
        java.util.LinkedList linkedList2 = this.f405263t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405250d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405251e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f405252f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f405253g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f405254h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f405255i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f405256m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.e(8, this.f405257n);
            m53.b0 b0Var = this.f405258o;
            if (b0Var != null) {
                fVar.i(9, b0Var.mo75928xcd1e8d8());
                this.f405258o.mo75956x3d5d1f78(fVar);
            }
            fVar.e(10, this.f405259p);
            fVar.e(11, this.f405260q);
            java.lang.String str8 = this.f405261r;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            fVar.a(13, this.f405262s);
            fVar.g(14, 1, linkedList2);
            fVar.a(15, this.f405264u);
            fVar.e(16, this.f405265v);
            fVar.a(17, this.f405266w);
            fVar.a(18, this.f405267x);
            fVar.a(19, this.f405268y);
            m53.s3 s3Var = this.f405269z;
            if (s3Var != null) {
                fVar.i(20, s3Var.mo75928xcd1e8d8());
                this.f405269z.mo75956x3d5d1f78(fVar);
            }
            fVar.e(21, this.A);
            m53.e3 e3Var = this.B;
            if (e3Var != null) {
                fVar.i(22, e3Var.mo75928xcd1e8d8());
                this.B.mo75956x3d5d1f78(fVar);
            }
            fVar.g(23, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f405250d;
            int j17 = str9 != null ? b36.f.j(1, str9) + 0 : 0;
            java.lang.String str10 = this.f405251e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f405252f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f405253g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f405254h;
            if (str13 != null) {
                j17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f405255i;
            if (str14 != null) {
                j17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f405256m;
            if (str15 != null) {
                j17 += b36.f.j(7, str15);
            }
            int e17 = j17 + b36.f.e(8, this.f405257n);
            m53.b0 b0Var2 = this.f405258o;
            if (b0Var2 != null) {
                e17 += b36.f.i(9, b0Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(10, this.f405259p) + b36.f.e(11, this.f405260q);
            java.lang.String str16 = this.f405261r;
            if (str16 != null) {
                e18 += b36.f.j(12, str16);
            }
            int a17 = e18 + b36.f.a(13, this.f405262s) + b36.f.g(14, 1, linkedList2) + b36.f.a(15, this.f405264u) + b36.f.e(16, this.f405265v) + b36.f.a(17, this.f405266w) + b36.f.a(18, this.f405267x) + b36.f.a(19, this.f405268y);
            m53.s3 s3Var2 = this.f405269z;
            if (s3Var2 != null) {
                a17 += b36.f.i(20, s3Var2.mo75928xcd1e8d8());
            }
            int e19 = a17 + b36.f.e(21, this.A);
            m53.e3 e3Var2 = this.B;
            if (e3Var2 != null) {
                e19 += b36.f.i(22, e3Var2.mo75928xcd1e8d8());
            }
            return e19 + b36.f.g(23, 1, linkedList);
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
        m53.h hVar = (m53.h) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hVar.f405250d = aVar2.k(intValue);
                return 0;
            case 2:
                hVar.f405251e = aVar2.k(intValue);
                return 0;
            case 3:
                hVar.f405252f = aVar2.k(intValue);
                return 0;
            case 4:
                hVar.f405253g = aVar2.k(intValue);
                return 0;
            case 5:
                hVar.f405254h = aVar2.k(intValue);
                return 0;
            case 6:
                hVar.f405255i = aVar2.k(intValue);
                return 0;
            case 7:
                hVar.f405256m = aVar2.k(intValue);
                return 0;
            case 8:
                hVar.f405257n = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    m53.b0 b0Var3 = new m53.b0();
                    if (bArr2 != null && bArr2.length > 0) {
                        b0Var3.mo11468x92b714fd(bArr2);
                    }
                    hVar.f405258o = b0Var3;
                }
                return 0;
            case 10:
                hVar.f405259p = aVar2.g(intValue);
                return 0;
            case 11:
                hVar.f405260q = aVar2.g(intValue);
                return 0;
            case 12:
                hVar.f405261r = aVar2.k(intValue);
                return 0;
            case 13:
                hVar.f405262s = aVar2.c(intValue);
                return 0;
            case 14:
                hVar.f405263t.add(aVar2.k(intValue));
                return 0;
            case 15:
                hVar.f405264u = aVar2.c(intValue);
                return 0;
            case 16:
                hVar.f405265v = aVar2.g(intValue);
                return 0;
            case 17:
                hVar.f405266w = aVar2.c(intValue);
                return 0;
            case 18:
                hVar.f405267x = aVar2.c(intValue);
                return 0;
            case 19:
                hVar.f405268y = aVar2.c(intValue);
                return 0;
            case 20:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    m53.s3 s3Var3 = new m53.s3();
                    if (bArr3 != null && bArr3.length > 0) {
                        s3Var3.mo11468x92b714fd(bArr3);
                    }
                    hVar.f405269z = s3Var3;
                }
                return 0;
            case 21:
                hVar.A = aVar2.g(intValue);
                return 0;
            case 22:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    m53.e3 e3Var3 = new m53.e3();
                    if (bArr4 != null && bArr4.length > 0) {
                        e3Var3.mo11468x92b714fd(bArr4);
                    }
                    hVar.B = e3Var3;
                }
                return 0;
            case 23:
                hVar.C.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }
}
