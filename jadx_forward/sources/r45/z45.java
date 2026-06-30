package r45;

/* loaded from: classes12.dex */
public class z45 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f473231d;

    /* renamed from: e, reason: collision with root package name */
    public int f473232e;

    /* renamed from: f, reason: collision with root package name */
    public int f473233f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f473234g;

    /* renamed from: h, reason: collision with root package name */
    public int f473235h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f473236i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f473237m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f473238n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f473239o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f473240p;

    /* renamed from: q, reason: collision with root package name */
    public int f473241q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f473242r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f473243s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f473244t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f473245u;

    /* renamed from: v, reason: collision with root package name */
    public int f473246v;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z45)) {
            return false;
        }
        r45.z45 z45Var = (r45.z45) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f473231d), java.lang.Integer.valueOf(z45Var.f473231d)) && n51.f.a(java.lang.Integer.valueOf(this.f473232e), java.lang.Integer.valueOf(z45Var.f473232e)) && n51.f.a(java.lang.Integer.valueOf(this.f473233f), java.lang.Integer.valueOf(z45Var.f473233f)) && n51.f.a(this.f473234g, z45Var.f473234g) && n51.f.a(java.lang.Integer.valueOf(this.f473235h), java.lang.Integer.valueOf(z45Var.f473235h)) && n51.f.a(this.f473236i, z45Var.f473236i) && n51.f.a(this.f473237m, z45Var.f473237m) && n51.f.a(this.f473238n, z45Var.f473238n) && n51.f.a(this.f473239o, z45Var.f473239o) && n51.f.a(this.f473240p, z45Var.f473240p) && n51.f.a(java.lang.Integer.valueOf(this.f473241q), java.lang.Integer.valueOf(z45Var.f473241q)) && n51.f.a(this.f473242r, z45Var.f473242r) && n51.f.a(this.f473243s, z45Var.f473243s) && n51.f.a(this.f473244t, z45Var.f473244t) && n51.f.a(this.f473245u, z45Var.f473245u) && n51.f.a(java.lang.Integer.valueOf(this.f473246v), java.lang.Integer.valueOf(z45Var.f473246v));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f473231d);
            fVar.e(2, this.f473232e);
            fVar.e(3, this.f473233f);
            java.lang.String str = this.f473234g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f473235h);
            java.lang.String str2 = this.f473236i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f473237m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f473238n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f473239o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f473240p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.e(12, this.f473241q);
            java.lang.String str7 = this.f473242r;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f473243s;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            java.lang.String str9 = this.f473244t;
            if (str9 != null) {
                fVar.j(15, str9);
            }
            java.lang.String str10 = this.f473245u;
            if (str10 != null) {
                fVar.j(18, str10);
            }
            fVar.e(19, this.f473246v);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f473231d) + 0 + b36.f.e(2, this.f473232e) + b36.f.e(3, this.f473233f);
            java.lang.String str11 = this.f473234g;
            if (str11 != null) {
                e17 += b36.f.j(4, str11);
            }
            int e18 = e17 + b36.f.e(5, this.f473235h);
            java.lang.String str12 = this.f473236i;
            if (str12 != null) {
                e18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f473237m;
            if (str13 != null) {
                e18 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f473238n;
            if (str14 != null) {
                e18 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f473239o;
            if (str15 != null) {
                e18 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f473240p;
            if (str16 != null) {
                e18 += b36.f.j(11, str16);
            }
            int e19 = e18 + b36.f.e(12, this.f473241q);
            java.lang.String str17 = this.f473242r;
            if (str17 != null) {
                e19 += b36.f.j(13, str17);
            }
            java.lang.String str18 = this.f473243s;
            if (str18 != null) {
                e19 += b36.f.j(14, str18);
            }
            java.lang.String str19 = this.f473244t;
            if (str19 != null) {
                e19 += b36.f.j(15, str19);
            }
            java.lang.String str20 = this.f473245u;
            if (str20 != null) {
                e19 += b36.f.j(18, str20);
            }
            return e19 + b36.f.e(19, this.f473246v);
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
        r45.z45 z45Var = (r45.z45) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                z45Var.f473231d = aVar2.g(intValue);
                return 0;
            case 2:
                z45Var.f473232e = aVar2.g(intValue);
                return 0;
            case 3:
                z45Var.f473233f = aVar2.g(intValue);
                return 0;
            case 4:
                z45Var.f473234g = aVar2.k(intValue);
                return 0;
            case 5:
                z45Var.f473235h = aVar2.g(intValue);
                return 0;
            case 6:
                z45Var.f473236i = aVar2.k(intValue);
                return 0;
            case 7:
                z45Var.f473237m = aVar2.k(intValue);
                return 0;
            case 8:
                z45Var.f473238n = aVar2.k(intValue);
                return 0;
            case 9:
            case 16:
            case 17:
            default:
                return -1;
            case 10:
                z45Var.f473239o = aVar2.k(intValue);
                return 0;
            case 11:
                z45Var.f473240p = aVar2.k(intValue);
                return 0;
            case 12:
                z45Var.f473241q = aVar2.g(intValue);
                return 0;
            case 13:
                z45Var.f473242r = aVar2.k(intValue);
                return 0;
            case 14:
                z45Var.f473243s = aVar2.k(intValue);
                return 0;
            case 15:
                z45Var.f473244t = aVar2.k(intValue);
                return 0;
            case 18:
                z45Var.f473245u = aVar2.k(intValue);
                return 0;
            case 19:
                z45Var.f473246v = aVar2.g(intValue);
                return 0;
        }
    }
}
