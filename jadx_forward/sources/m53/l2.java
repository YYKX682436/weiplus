package m53;

/* loaded from: classes8.dex */
public class l2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405400d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405401e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405402f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f405403g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f405404h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f405405i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f405406m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f405407n;

    /* renamed from: o, reason: collision with root package name */
    public double f405408o;

    /* renamed from: p, reason: collision with root package name */
    public int f405409p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f405410q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f405411r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f405412s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.l2)) {
            return false;
        }
        m53.l2 l2Var = (m53.l2) fVar;
        return n51.f.a(this.f405400d, l2Var.f405400d) && n51.f.a(this.f405401e, l2Var.f405401e) && n51.f.a(this.f405402f, l2Var.f405402f) && n51.f.a(java.lang.Boolean.valueOf(this.f405403g), java.lang.Boolean.valueOf(l2Var.f405403g)) && n51.f.a(java.lang.Boolean.valueOf(this.f405404h), java.lang.Boolean.valueOf(l2Var.f405404h)) && n51.f.a(java.lang.Boolean.valueOf(this.f405405i), java.lang.Boolean.valueOf(l2Var.f405405i)) && n51.f.a(this.f405406m, l2Var.f405406m) && n51.f.a(java.lang.Boolean.valueOf(this.f405407n), java.lang.Boolean.valueOf(l2Var.f405407n)) && n51.f.a(java.lang.Double.valueOf(this.f405408o), java.lang.Double.valueOf(l2Var.f405408o)) && n51.f.a(java.lang.Integer.valueOf(this.f405409p), java.lang.Integer.valueOf(l2Var.f405409p)) && n51.f.a(java.lang.Boolean.valueOf(this.f405410q), java.lang.Boolean.valueOf(l2Var.f405410q)) && n51.f.a(this.f405411r, l2Var.f405411r) && n51.f.a(java.lang.Boolean.valueOf(this.f405412s), java.lang.Boolean.valueOf(l2Var.f405412s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405400d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405401e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f405402f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.a(4, this.f405403g);
            fVar.a(5, this.f405404h);
            fVar.a(6, this.f405405i);
            java.lang.String str4 = this.f405406m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.a(8, this.f405407n);
            fVar.c(9, this.f405408o);
            fVar.e(10, this.f405409p);
            fVar.a(11, this.f405410q);
            java.lang.String str5 = this.f405411r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            fVar.a(13, this.f405412s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f405400d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f405401e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f405402f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int a17 = j17 + b36.f.a(4, this.f405403g) + b36.f.a(5, this.f405404h) + b36.f.a(6, this.f405405i);
            java.lang.String str9 = this.f405406m;
            if (str9 != null) {
                a17 += b36.f.j(7, str9);
            }
            int a18 = a17 + b36.f.a(8, this.f405407n) + b36.f.c(9, this.f405408o) + b36.f.e(10, this.f405409p) + b36.f.a(11, this.f405410q);
            java.lang.String str10 = this.f405411r;
            if (str10 != null) {
                a18 += b36.f.j(12, str10);
            }
            return a18 + b36.f.a(13, this.f405412s);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        m53.l2 l2Var = (m53.l2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l2Var.f405400d = aVar2.k(intValue);
                return 0;
            case 2:
                l2Var.f405401e = aVar2.k(intValue);
                return 0;
            case 3:
                l2Var.f405402f = aVar2.k(intValue);
                return 0;
            case 4:
                l2Var.f405403g = aVar2.c(intValue);
                return 0;
            case 5:
                l2Var.f405404h = aVar2.c(intValue);
                return 0;
            case 6:
                l2Var.f405405i = aVar2.c(intValue);
                return 0;
            case 7:
                l2Var.f405406m = aVar2.k(intValue);
                return 0;
            case 8:
                l2Var.f405407n = aVar2.c(intValue);
                return 0;
            case 9:
                l2Var.f405408o = aVar2.e(intValue);
                return 0;
            case 10:
                l2Var.f405409p = aVar2.g(intValue);
                return 0;
            case 11:
                l2Var.f405410q = aVar2.c(intValue);
                return 0;
            case 12:
                l2Var.f405411r = aVar2.k(intValue);
                return 0;
            case 13:
                l2Var.f405412s = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
