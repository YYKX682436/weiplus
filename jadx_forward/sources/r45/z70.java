package r45;

/* loaded from: classes14.dex */
public class z70 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f473291d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473292e;

    /* renamed from: f, reason: collision with root package name */
    public int f473293f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f473294g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f473295h;

    /* renamed from: i, reason: collision with root package name */
    public int f473296i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f473297m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f473298n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f473299o;

    /* renamed from: p, reason: collision with root package name */
    public int f473300p;

    /* renamed from: q, reason: collision with root package name */
    public int f473301q;

    /* renamed from: r, reason: collision with root package name */
    public int f473302r;

    /* renamed from: s, reason: collision with root package name */
    public int f473303s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f473304t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f473305u;

    /* renamed from: v, reason: collision with root package name */
    public long f473306v;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z70)) {
            return false;
        }
        r45.z70 z70Var = (r45.z70) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f473291d), java.lang.Long.valueOf(z70Var.f473291d)) && n51.f.a(this.f473292e, z70Var.f473292e) && n51.f.a(java.lang.Integer.valueOf(this.f473293f), java.lang.Integer.valueOf(z70Var.f473293f)) && n51.f.a(java.lang.Boolean.valueOf(this.f473294g), java.lang.Boolean.valueOf(z70Var.f473294g)) && n51.f.a(java.lang.Boolean.valueOf(this.f473295h), java.lang.Boolean.valueOf(z70Var.f473295h)) && n51.f.a(java.lang.Integer.valueOf(this.f473296i), java.lang.Integer.valueOf(z70Var.f473296i)) && n51.f.a(this.f473297m, z70Var.f473297m) && n51.f.a(this.f473298n, z70Var.f473298n) && n51.f.a(this.f473299o, z70Var.f473299o) && n51.f.a(java.lang.Integer.valueOf(this.f473300p), java.lang.Integer.valueOf(z70Var.f473300p)) && n51.f.a(java.lang.Integer.valueOf(this.f473301q), java.lang.Integer.valueOf(z70Var.f473301q)) && n51.f.a(java.lang.Integer.valueOf(this.f473302r), java.lang.Integer.valueOf(z70Var.f473302r)) && n51.f.a(java.lang.Integer.valueOf(this.f473303s), java.lang.Integer.valueOf(z70Var.f473303s)) && n51.f.a(this.f473304t, z70Var.f473304t) && n51.f.a(this.f473305u, z70Var.f473305u) && n51.f.a(java.lang.Long.valueOf(this.f473306v), java.lang.Long.valueOf(z70Var.f473306v));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f473291d);
            java.lang.String str = this.f473292e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f473293f);
            fVar.a(4, this.f473294g);
            fVar.a(5, this.f473295h);
            fVar.e(6, this.f473296i);
            java.lang.String str2 = this.f473297m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f473298n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f473299o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f473300p);
            fVar.e(11, this.f473301q);
            fVar.e(12, this.f473302r);
            fVar.e(13, this.f473303s);
            java.lang.String str5 = this.f473304t;
            if (str5 != null) {
                fVar.j(14, str5);
            }
            java.lang.String str6 = this.f473305u;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            fVar.h(16, this.f473306v);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f473291d) + 0;
            java.lang.String str7 = this.f473292e;
            if (str7 != null) {
                h17 += b36.f.j(2, str7);
            }
            int e17 = h17 + b36.f.e(3, this.f473293f) + b36.f.a(4, this.f473294g) + b36.f.a(5, this.f473295h) + b36.f.e(6, this.f473296i);
            java.lang.String str8 = this.f473297m;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f473298n;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f473299o;
            if (str10 != null) {
                e17 += b36.f.j(9, str10);
            }
            int e18 = e17 + b36.f.e(10, this.f473300p) + b36.f.e(11, this.f473301q) + b36.f.e(12, this.f473302r) + b36.f.e(13, this.f473303s);
            java.lang.String str11 = this.f473304t;
            if (str11 != null) {
                e18 += b36.f.j(14, str11);
            }
            java.lang.String str12 = this.f473305u;
            if (str12 != null) {
                e18 += b36.f.j(15, str12);
            }
            return e18 + b36.f.h(16, this.f473306v);
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
        r45.z70 z70Var = (r45.z70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                z70Var.f473291d = aVar2.i(intValue);
                return 0;
            case 2:
                z70Var.f473292e = aVar2.k(intValue);
                return 0;
            case 3:
                z70Var.f473293f = aVar2.g(intValue);
                return 0;
            case 4:
                z70Var.f473294g = aVar2.c(intValue);
                return 0;
            case 5:
                z70Var.f473295h = aVar2.c(intValue);
                return 0;
            case 6:
                z70Var.f473296i = aVar2.g(intValue);
                return 0;
            case 7:
                z70Var.f473297m = aVar2.k(intValue);
                return 0;
            case 8:
                z70Var.f473298n = aVar2.k(intValue);
                return 0;
            case 9:
                z70Var.f473299o = aVar2.k(intValue);
                return 0;
            case 10:
                z70Var.f473300p = aVar2.g(intValue);
                return 0;
            case 11:
                z70Var.f473301q = aVar2.g(intValue);
                return 0;
            case 12:
                z70Var.f473302r = aVar2.g(intValue);
                return 0;
            case 13:
                z70Var.f473303s = aVar2.g(intValue);
                return 0;
            case 14:
                z70Var.f473304t = aVar2.k(intValue);
                return 0;
            case 15:
                z70Var.f473305u = aVar2.k(intValue);
                return 0;
            case 16:
                z70Var.f473306v = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
