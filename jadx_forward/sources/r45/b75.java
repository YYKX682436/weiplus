package r45;

/* loaded from: classes2.dex */
public class b75 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452137d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452138e;

    /* renamed from: f, reason: collision with root package name */
    public int f452139f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452140g;

    /* renamed from: h, reason: collision with root package name */
    public int f452141h;

    /* renamed from: i, reason: collision with root package name */
    public long f452142i;

    /* renamed from: m, reason: collision with root package name */
    public int f452143m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f452144n;

    /* renamed from: o, reason: collision with root package name */
    public int f452145o;

    /* renamed from: p, reason: collision with root package name */
    public int f452146p;

    /* renamed from: q, reason: collision with root package name */
    public long f452147q;

    /* renamed from: r, reason: collision with root package name */
    public int f452148r;

    /* renamed from: s, reason: collision with root package name */
    public long f452149s;

    /* renamed from: t, reason: collision with root package name */
    public long f452150t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f452151u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b75)) {
            return false;
        }
        r45.b75 b75Var = (r45.b75) fVar;
        return n51.f.a(this.f452137d, b75Var.f452137d) && n51.f.a(this.f452138e, b75Var.f452138e) && n51.f.a(java.lang.Integer.valueOf(this.f452139f), java.lang.Integer.valueOf(b75Var.f452139f)) && n51.f.a(this.f452140g, b75Var.f452140g) && n51.f.a(java.lang.Integer.valueOf(this.f452141h), java.lang.Integer.valueOf(b75Var.f452141h)) && n51.f.a(java.lang.Long.valueOf(this.f452142i), java.lang.Long.valueOf(b75Var.f452142i)) && n51.f.a(java.lang.Integer.valueOf(this.f452143m), java.lang.Integer.valueOf(b75Var.f452143m)) && n51.f.a(this.f452144n, b75Var.f452144n) && n51.f.a(java.lang.Integer.valueOf(this.f452145o), java.lang.Integer.valueOf(b75Var.f452145o)) && n51.f.a(java.lang.Integer.valueOf(this.f452146p), java.lang.Integer.valueOf(b75Var.f452146p)) && n51.f.a(java.lang.Long.valueOf(this.f452147q), java.lang.Long.valueOf(b75Var.f452147q)) && n51.f.a(java.lang.Integer.valueOf(this.f452148r), java.lang.Integer.valueOf(b75Var.f452148r)) && n51.f.a(java.lang.Long.valueOf(this.f452149s), java.lang.Long.valueOf(b75Var.f452149s)) && n51.f.a(java.lang.Long.valueOf(this.f452150t), java.lang.Long.valueOf(b75Var.f452150t)) && n51.f.a(this.f452151u, b75Var.f452151u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452137d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452138e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f452139f);
            java.lang.String str3 = this.f452140g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f452141h);
            fVar.h(6, this.f452142i);
            fVar.e(7, this.f452143m);
            java.lang.String str4 = this.f452144n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f452145o);
            fVar.e(10, this.f452146p);
            fVar.h(11, this.f452147q);
            fVar.e(12, this.f452148r);
            fVar.h(13, this.f452149s);
            fVar.h(14, this.f452150t);
            java.lang.String str5 = this.f452151u;
            if (str5 != null) {
                fVar.j(15, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f452137d;
            int j17 = str6 != null ? b36.f.j(1, str6) + 0 : 0;
            java.lang.String str7 = this.f452138e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f452139f);
            java.lang.String str8 = this.f452140g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            int e18 = e17 + b36.f.e(5, this.f452141h) + b36.f.h(6, this.f452142i) + b36.f.e(7, this.f452143m);
            java.lang.String str9 = this.f452144n;
            if (str9 != null) {
                e18 += b36.f.j(8, str9);
            }
            int e19 = e18 + b36.f.e(9, this.f452145o) + b36.f.e(10, this.f452146p) + b36.f.h(11, this.f452147q) + b36.f.e(12, this.f452148r) + b36.f.h(13, this.f452149s) + b36.f.h(14, this.f452150t);
            java.lang.String str10 = this.f452151u;
            return str10 != null ? e19 + b36.f.j(15, str10) : e19;
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
        r45.b75 b75Var = (r45.b75) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b75Var.f452137d = aVar2.k(intValue);
                return 0;
            case 2:
                b75Var.f452138e = aVar2.k(intValue);
                return 0;
            case 3:
                b75Var.f452139f = aVar2.g(intValue);
                return 0;
            case 4:
                b75Var.f452140g = aVar2.k(intValue);
                return 0;
            case 5:
                b75Var.f452141h = aVar2.g(intValue);
                return 0;
            case 6:
                b75Var.f452142i = aVar2.i(intValue);
                return 0;
            case 7:
                b75Var.f452143m = aVar2.g(intValue);
                return 0;
            case 8:
                b75Var.f452144n = aVar2.k(intValue);
                return 0;
            case 9:
                b75Var.f452145o = aVar2.g(intValue);
                return 0;
            case 10:
                b75Var.f452146p = aVar2.g(intValue);
                return 0;
            case 11:
                b75Var.f452147q = aVar2.i(intValue);
                return 0;
            case 12:
                b75Var.f452148r = aVar2.g(intValue);
                return 0;
            case 13:
                b75Var.f452149s = aVar2.i(intValue);
                return 0;
            case 14:
                b75Var.f452150t = aVar2.i(intValue);
                return 0;
            case 15:
                b75Var.f452151u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
