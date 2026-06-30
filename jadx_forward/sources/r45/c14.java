package r45;

/* loaded from: classes9.dex */
public class c14 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452739d;

    /* renamed from: e, reason: collision with root package name */
    public int f452740e;

    /* renamed from: f, reason: collision with root package name */
    public int f452741f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452742g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452743h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f452744i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f452745m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f452746n;

    /* renamed from: o, reason: collision with root package name */
    public int f452747o;

    /* renamed from: p, reason: collision with root package name */
    public int f452748p;

    /* renamed from: q, reason: collision with root package name */
    public int f452749q;

    /* renamed from: r, reason: collision with root package name */
    public int f452750r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c14)) {
            return false;
        }
        r45.c14 c14Var = (r45.c14) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452739d), java.lang.Integer.valueOf(c14Var.f452739d)) && n51.f.a(java.lang.Integer.valueOf(this.f452740e), java.lang.Integer.valueOf(c14Var.f452740e)) && n51.f.a(java.lang.Integer.valueOf(this.f452741f), java.lang.Integer.valueOf(c14Var.f452741f)) && n51.f.a(this.f452742g, c14Var.f452742g) && n51.f.a(this.f452743h, c14Var.f452743h) && n51.f.a(this.f452744i, c14Var.f452744i) && n51.f.a(this.f452745m, c14Var.f452745m) && n51.f.a(this.f452746n, c14Var.f452746n) && n51.f.a(java.lang.Integer.valueOf(this.f452747o), java.lang.Integer.valueOf(c14Var.f452747o)) && n51.f.a(java.lang.Integer.valueOf(this.f452748p), java.lang.Integer.valueOf(c14Var.f452748p)) && n51.f.a(java.lang.Integer.valueOf(this.f452749q), java.lang.Integer.valueOf(c14Var.f452749q)) && n51.f.a(java.lang.Integer.valueOf(this.f452750r), java.lang.Integer.valueOf(c14Var.f452750r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452739d);
            fVar.e(2, this.f452740e);
            fVar.e(3, this.f452741f);
            java.lang.String str = this.f452742g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f452743h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f452744i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f452745m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f452746n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f452747o);
            fVar.e(10, this.f452748p);
            fVar.e(11, this.f452749q);
            fVar.e(12, this.f452750r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452739d) + 0 + b36.f.e(2, this.f452740e) + b36.f.e(3, this.f452741f);
            java.lang.String str6 = this.f452742g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f452743h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f452744i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f452745m;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f452746n;
            if (str10 != null) {
                e17 += b36.f.j(8, str10);
            }
            return e17 + b36.f.e(9, this.f452747o) + b36.f.e(10, this.f452748p) + b36.f.e(11, this.f452749q) + b36.f.e(12, this.f452750r);
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
        r45.c14 c14Var = (r45.c14) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c14Var.f452739d = aVar2.g(intValue);
                return 0;
            case 2:
                c14Var.f452740e = aVar2.g(intValue);
                return 0;
            case 3:
                c14Var.f452741f = aVar2.g(intValue);
                return 0;
            case 4:
                c14Var.f452742g = aVar2.k(intValue);
                return 0;
            case 5:
                c14Var.f452743h = aVar2.k(intValue);
                return 0;
            case 6:
                c14Var.f452744i = aVar2.k(intValue);
                return 0;
            case 7:
                c14Var.f452745m = aVar2.k(intValue);
                return 0;
            case 8:
                c14Var.f452746n = aVar2.k(intValue);
                return 0;
            case 9:
                c14Var.f452747o = aVar2.g(intValue);
                return 0;
            case 10:
                c14Var.f452748p = aVar2.g(intValue);
                return 0;
            case 11:
                c14Var.f452749q = aVar2.g(intValue);
                return 0;
            case 12:
                c14Var.f452750r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
