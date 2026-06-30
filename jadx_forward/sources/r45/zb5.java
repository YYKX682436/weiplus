package r45;

/* loaded from: classes7.dex */
public class zb5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f473415d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473416e;

    /* renamed from: f, reason: collision with root package name */
    public int f473417f;

    /* renamed from: g, reason: collision with root package name */
    public int f473418g;

    /* renamed from: h, reason: collision with root package name */
    public int f473419h;

    /* renamed from: i, reason: collision with root package name */
    public int f473420i;

    /* renamed from: m, reason: collision with root package name */
    public int f473421m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f473422n = "";

    /* renamed from: o, reason: collision with root package name */
    public boolean f473423o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f473424p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f473425q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f473426r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f473427s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f473428t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f473429u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zb5)) {
            return false;
        }
        r45.zb5 zb5Var = (r45.zb5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f473415d), java.lang.Integer.valueOf(zb5Var.f473415d)) && n51.f.a(this.f473416e, zb5Var.f473416e) && n51.f.a(java.lang.Integer.valueOf(this.f473417f), java.lang.Integer.valueOf(zb5Var.f473417f)) && n51.f.a(java.lang.Integer.valueOf(this.f473418g), java.lang.Integer.valueOf(zb5Var.f473418g)) && n51.f.a(java.lang.Integer.valueOf(this.f473419h), java.lang.Integer.valueOf(zb5Var.f473419h)) && n51.f.a(java.lang.Integer.valueOf(this.f473420i), java.lang.Integer.valueOf(zb5Var.f473420i)) && n51.f.a(java.lang.Integer.valueOf(this.f473421m), java.lang.Integer.valueOf(zb5Var.f473421m)) && n51.f.a(this.f473422n, zb5Var.f473422n) && n51.f.a(java.lang.Boolean.valueOf(this.f473423o), java.lang.Boolean.valueOf(zb5Var.f473423o)) && n51.f.a(java.lang.Boolean.valueOf(this.f473424p), java.lang.Boolean.valueOf(zb5Var.f473424p)) && n51.f.a(java.lang.Boolean.valueOf(this.f473425q), java.lang.Boolean.valueOf(zb5Var.f473425q)) && n51.f.a(java.lang.Boolean.valueOf(this.f473426r), java.lang.Boolean.valueOf(zb5Var.f473426r)) && n51.f.a(java.lang.Boolean.valueOf(this.f473427s), java.lang.Boolean.valueOf(zb5Var.f473427s)) && n51.f.a(java.lang.Boolean.valueOf(this.f473428t), java.lang.Boolean.valueOf(zb5Var.f473428t)) && n51.f.a(java.lang.Boolean.valueOf(this.f473429u), java.lang.Boolean.valueOf(zb5Var.f473429u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f473415d);
            java.lang.String str = this.f473416e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f473417f);
            fVar.e(4, this.f473418g);
            fVar.e(5, this.f473419h);
            fVar.e(6, this.f473420i);
            fVar.e(7, this.f473421m);
            java.lang.String str2 = this.f473422n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            fVar.a(9, this.f473423o);
            fVar.a(10, this.f473424p);
            fVar.a(11, this.f473425q);
            fVar.a(12, this.f473426r);
            fVar.a(13, this.f473427s);
            fVar.a(14, this.f473428t);
            fVar.a(15, this.f473429u);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f473415d) + 0;
            java.lang.String str3 = this.f473416e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            int e18 = e17 + b36.f.e(3, this.f473417f) + b36.f.e(4, this.f473418g) + b36.f.e(5, this.f473419h) + b36.f.e(6, this.f473420i) + b36.f.e(7, this.f473421m);
            java.lang.String str4 = this.f473422n;
            if (str4 != null) {
                e18 += b36.f.j(8, str4);
            }
            return e18 + b36.f.a(9, this.f473423o) + b36.f.a(10, this.f473424p) + b36.f.a(11, this.f473425q) + b36.f.a(12, this.f473426r) + b36.f.a(13, this.f473427s) + b36.f.a(14, this.f473428t) + b36.f.a(15, this.f473429u);
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
        r45.zb5 zb5Var = (r45.zb5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zb5Var.f473415d = aVar2.g(intValue);
                return 0;
            case 2:
                zb5Var.f473416e = aVar2.k(intValue);
                return 0;
            case 3:
                zb5Var.f473417f = aVar2.g(intValue);
                return 0;
            case 4:
                zb5Var.f473418g = aVar2.g(intValue);
                return 0;
            case 5:
                zb5Var.f473419h = aVar2.g(intValue);
                return 0;
            case 6:
                zb5Var.f473420i = aVar2.g(intValue);
                return 0;
            case 7:
                zb5Var.f473421m = aVar2.g(intValue);
                return 0;
            case 8:
                zb5Var.f473422n = aVar2.k(intValue);
                return 0;
            case 9:
                zb5Var.f473423o = aVar2.c(intValue);
                return 0;
            case 10:
                zb5Var.f473424p = aVar2.c(intValue);
                return 0;
            case 11:
                zb5Var.f473425q = aVar2.c(intValue);
                return 0;
            case 12:
                zb5Var.f473426r = aVar2.c(intValue);
                return 0;
            case 13:
                zb5Var.f473427s = aVar2.c(intValue);
                return 0;
            case 14:
                zb5Var.f473428t = aVar2.c(intValue);
                return 0;
            case 15:
                zb5Var.f473429u = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
