package r45;

/* loaded from: classes15.dex */
public class g83 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456512d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456513e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456514f;

    /* renamed from: g, reason: collision with root package name */
    public int f456515g;

    /* renamed from: h, reason: collision with root package name */
    public int f456516h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f456517i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f456518m;

    /* renamed from: n, reason: collision with root package name */
    public long f456519n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f456520o;

    /* renamed from: p, reason: collision with root package name */
    public int f456521p;

    /* renamed from: q, reason: collision with root package name */
    public int f456522q;

    /* renamed from: r, reason: collision with root package name */
    public int f456523r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g83)) {
            return false;
        }
        r45.g83 g83Var = (r45.g83) fVar;
        return n51.f.a(this.f456512d, g83Var.f456512d) && n51.f.a(this.f456513e, g83Var.f456513e) && n51.f.a(this.f456514f, g83Var.f456514f) && n51.f.a(java.lang.Integer.valueOf(this.f456515g), java.lang.Integer.valueOf(g83Var.f456515g)) && n51.f.a(java.lang.Integer.valueOf(this.f456516h), java.lang.Integer.valueOf(g83Var.f456516h)) && n51.f.a(this.f456517i, g83Var.f456517i) && n51.f.a(this.f456518m, g83Var.f456518m) && n51.f.a(java.lang.Long.valueOf(this.f456519n), java.lang.Long.valueOf(g83Var.f456519n)) && n51.f.a(java.lang.Boolean.valueOf(this.f456520o), java.lang.Boolean.valueOf(g83Var.f456520o)) && n51.f.a(java.lang.Integer.valueOf(this.f456521p), java.lang.Integer.valueOf(g83Var.f456521p)) && n51.f.a(java.lang.Integer.valueOf(this.f456522q), java.lang.Integer.valueOf(g83Var.f456522q)) && n51.f.a(java.lang.Integer.valueOf(this.f456523r), java.lang.Integer.valueOf(g83Var.f456523r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456512d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f456513e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f456514f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f456515g);
            fVar.e(5, this.f456516h);
            java.lang.String str4 = this.f456517i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f456518m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.h(8, this.f456519n);
            fVar.a(9, this.f456520o);
            fVar.e(10, this.f456521p);
            fVar.e(11, this.f456522q);
            fVar.e(12, this.f456523r);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f456512d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f456513e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f456514f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f456515g) + b36.f.e(5, this.f456516h);
            java.lang.String str9 = this.f456517i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f456518m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            return e17 + b36.f.h(8, this.f456519n) + b36.f.a(9, this.f456520o) + b36.f.e(10, this.f456521p) + b36.f.e(11, this.f456522q) + b36.f.e(12, this.f456523r);
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
        r45.g83 g83Var = (r45.g83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g83Var.f456512d = aVar2.k(intValue);
                return 0;
            case 2:
                g83Var.f456513e = aVar2.k(intValue);
                return 0;
            case 3:
                g83Var.f456514f = aVar2.k(intValue);
                return 0;
            case 4:
                g83Var.f456515g = aVar2.g(intValue);
                return 0;
            case 5:
                g83Var.f456516h = aVar2.g(intValue);
                return 0;
            case 6:
                g83Var.f456517i = aVar2.k(intValue);
                return 0;
            case 7:
                g83Var.f456518m = aVar2.k(intValue);
                return 0;
            case 8:
                g83Var.f456519n = aVar2.i(intValue);
                return 0;
            case 9:
                g83Var.f456520o = aVar2.c(intValue);
                return 0;
            case 10:
                g83Var.f456521p = aVar2.g(intValue);
                return 0;
            case 11:
                g83Var.f456522q = aVar2.g(intValue);
                return 0;
            case 12:
                g83Var.f456523r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
