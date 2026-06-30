package r45;

/* loaded from: classes2.dex */
public class pj6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f464638d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464639e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464640f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464641g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464642h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464643i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464644m;

    /* renamed from: n, reason: collision with root package name */
    public int f464645n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f464646o;

    /* renamed from: p, reason: collision with root package name */
    public int f464647p;

    /* renamed from: q, reason: collision with root package name */
    public int f464648q;

    /* renamed from: r, reason: collision with root package name */
    public int f464649r;

    /* renamed from: s, reason: collision with root package name */
    public int f464650s;

    /* renamed from: t, reason: collision with root package name */
    public long f464651t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f464652u;

    /* renamed from: v, reason: collision with root package name */
    public int f464653v;

    /* renamed from: w, reason: collision with root package name */
    public int f464654w;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pj6)) {
            return false;
        }
        r45.pj6 pj6Var = (r45.pj6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f464638d), java.lang.Integer.valueOf(pj6Var.f464638d)) && n51.f.a(this.f464639e, pj6Var.f464639e) && n51.f.a(this.f464640f, pj6Var.f464640f) && n51.f.a(this.f464641g, pj6Var.f464641g) && n51.f.a(this.f464642h, pj6Var.f464642h) && n51.f.a(this.f464643i, pj6Var.f464643i) && n51.f.a(this.f464644m, pj6Var.f464644m) && n51.f.a(java.lang.Integer.valueOf(this.f464645n), java.lang.Integer.valueOf(pj6Var.f464645n)) && n51.f.a(this.f464646o, pj6Var.f464646o) && n51.f.a(java.lang.Integer.valueOf(this.f464647p), java.lang.Integer.valueOf(pj6Var.f464647p)) && n51.f.a(java.lang.Integer.valueOf(this.f464648q), java.lang.Integer.valueOf(pj6Var.f464648q)) && n51.f.a(java.lang.Integer.valueOf(this.f464649r), java.lang.Integer.valueOf(pj6Var.f464649r)) && n51.f.a(java.lang.Integer.valueOf(this.f464650s), java.lang.Integer.valueOf(pj6Var.f464650s)) && n51.f.a(java.lang.Long.valueOf(this.f464651t), java.lang.Long.valueOf(pj6Var.f464651t)) && n51.f.a(this.f464652u, pj6Var.f464652u) && n51.f.a(java.lang.Integer.valueOf(this.f464653v), java.lang.Integer.valueOf(pj6Var.f464653v)) && n51.f.a(java.lang.Integer.valueOf(this.f464654w), java.lang.Integer.valueOf(pj6Var.f464654w));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f464638d);
            java.lang.String str = this.f464639e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f464640f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f464641g;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f464642h;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f464643i;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f464644m;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            fVar.e(11, this.f464645n);
            java.lang.String str7 = this.f464646o;
            if (str7 != null) {
                fVar.j(15, str7);
            }
            fVar.e(16, this.f464647p);
            fVar.e(17, this.f464648q);
            fVar.e(18, this.f464649r);
            fVar.e(19, this.f464650s);
            fVar.h(20, this.f464651t);
            java.lang.String str8 = this.f464652u;
            if (str8 != null) {
                fVar.j(21, str8);
            }
            fVar.e(22, this.f464653v);
            fVar.e(23, this.f464654w);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f464638d) + 0;
            java.lang.String str9 = this.f464639e;
            if (str9 != null) {
                e17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f464640f;
            if (str10 != null) {
                e17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f464641g;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f464642h;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f464643i;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f464644m;
            if (str14 != null) {
                e17 += b36.f.j(10, str14);
            }
            int e18 = e17 + b36.f.e(11, this.f464645n);
            java.lang.String str15 = this.f464646o;
            if (str15 != null) {
                e18 += b36.f.j(15, str15);
            }
            int e19 = e18 + b36.f.e(16, this.f464647p) + b36.f.e(17, this.f464648q) + b36.f.e(18, this.f464649r) + b36.f.e(19, this.f464650s) + b36.f.h(20, this.f464651t);
            java.lang.String str16 = this.f464652u;
            if (str16 != null) {
                e19 += b36.f.j(21, str16);
            }
            return e19 + b36.f.e(22, this.f464653v) + b36.f.e(23, this.f464654w);
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
        r45.pj6 pj6Var = (r45.pj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pj6Var.f464638d = aVar2.g(intValue);
                return 0;
            case 2:
                pj6Var.f464639e = aVar2.k(intValue);
                return 0;
            case 3:
                pj6Var.f464640f = aVar2.k(intValue);
                return 0;
            case 4:
            case 5:
            case 7:
            case 12:
            case 13:
            case 14:
            default:
                return -1;
            case 6:
                pj6Var.f464641g = aVar2.k(intValue);
                return 0;
            case 8:
                pj6Var.f464642h = aVar2.k(intValue);
                return 0;
            case 9:
                pj6Var.f464643i = aVar2.k(intValue);
                return 0;
            case 10:
                pj6Var.f464644m = aVar2.k(intValue);
                return 0;
            case 11:
                pj6Var.f464645n = aVar2.g(intValue);
                return 0;
            case 15:
                pj6Var.f464646o = aVar2.k(intValue);
                return 0;
            case 16:
                pj6Var.f464647p = aVar2.g(intValue);
                return 0;
            case 17:
                pj6Var.f464648q = aVar2.g(intValue);
                return 0;
            case 18:
                pj6Var.f464649r = aVar2.g(intValue);
                return 0;
            case 19:
                pj6Var.f464650s = aVar2.g(intValue);
                return 0;
            case 20:
                pj6Var.f464651t = aVar2.i(intValue);
                return 0;
            case 21:
                pj6Var.f464652u = aVar2.k(intValue);
                return 0;
            case 22:
                pj6Var.f464653v = aVar2.g(intValue);
                return 0;
            case 23:
                pj6Var.f464654w = aVar2.g(intValue);
                return 0;
        }
    }
}
