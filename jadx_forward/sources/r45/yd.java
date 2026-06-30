package r45;

/* loaded from: classes11.dex */
public class yd extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f472506d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472507e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f472508f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f472509g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472510h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f472511i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f472512m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f472513n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f472514o;

    /* renamed from: p, reason: collision with root package name */
    public int f472515p;

    /* renamed from: q, reason: collision with root package name */
    public int f472516q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f472517r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f472518s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f472519t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yd)) {
            return false;
        }
        r45.yd ydVar = (r45.yd) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f472506d), java.lang.Integer.valueOf(ydVar.f472506d)) && n51.f.a(this.f472507e, ydVar.f472507e) && n51.f.a(java.lang.Boolean.valueOf(this.f472508f), java.lang.Boolean.valueOf(ydVar.f472508f)) && n51.f.a(java.lang.Boolean.valueOf(this.f472509g), java.lang.Boolean.valueOf(ydVar.f472509g)) && n51.f.a(this.f472510h, ydVar.f472510h) && n51.f.a(this.f472511i, ydVar.f472511i) && n51.f.a(this.f472512m, ydVar.f472512m) && n51.f.a(this.f472513n, ydVar.f472513n) && n51.f.a(this.f472514o, ydVar.f472514o) && n51.f.a(java.lang.Integer.valueOf(this.f472515p), java.lang.Integer.valueOf(ydVar.f472515p)) && n51.f.a(java.lang.Integer.valueOf(this.f472516q), java.lang.Integer.valueOf(ydVar.f472516q)) && n51.f.a(this.f472517r, ydVar.f472517r) && n51.f.a(this.f472518s, ydVar.f472518s) && n51.f.a(this.f472519t, ydVar.f472519t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f472506d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f472507e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.a(3, this.f472508f);
            fVar.a(4, this.f472509g);
            java.lang.String str = this.f472510h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f472511i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f472512m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f472513n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f472514o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f472515p);
            fVar.e(11, this.f472516q);
            java.lang.String str6 = this.f472517r;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f472518s;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f472519t;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f472506d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f472507e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            int a17 = e17 + b36.f.a(3, this.f472508f) + b36.f.a(4, this.f472509g);
            java.lang.String str9 = this.f472510h;
            if (str9 != null) {
                a17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f472511i;
            if (str10 != null) {
                a17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f472512m;
            if (str11 != null) {
                a17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f472513n;
            if (str12 != null) {
                a17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f472514o;
            if (str13 != null) {
                a17 += b36.f.j(9, str13);
            }
            int e18 = a17 + b36.f.e(10, this.f472515p) + b36.f.e(11, this.f472516q);
            java.lang.String str14 = this.f472517r;
            if (str14 != null) {
                e18 += b36.f.j(12, str14);
            }
            java.lang.String str15 = this.f472518s;
            if (str15 != null) {
                e18 += b36.f.j(13, str15);
            }
            java.lang.String str16 = this.f472519t;
            return str16 != null ? e18 + b36.f.j(14, str16) : e18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.yd ydVar = (r45.yd) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ydVar.f472506d = aVar2.g(intValue);
                return 0;
            case 2:
                ydVar.f472507e = aVar2.d(intValue);
                return 0;
            case 3:
                ydVar.f472508f = aVar2.c(intValue);
                return 0;
            case 4:
                ydVar.f472509g = aVar2.c(intValue);
                return 0;
            case 5:
                ydVar.f472510h = aVar2.k(intValue);
                return 0;
            case 6:
                ydVar.f472511i = aVar2.k(intValue);
                return 0;
            case 7:
                ydVar.f472512m = aVar2.k(intValue);
                return 0;
            case 8:
                ydVar.f472513n = aVar2.k(intValue);
                return 0;
            case 9:
                ydVar.f472514o = aVar2.k(intValue);
                return 0;
            case 10:
                ydVar.f472515p = aVar2.g(intValue);
                return 0;
            case 11:
                ydVar.f472516q = aVar2.g(intValue);
                return 0;
            case 12:
                ydVar.f472517r = aVar2.k(intValue);
                return 0;
            case 13:
                ydVar.f472518s = aVar2.k(intValue);
                return 0;
            case 14:
                ydVar.f472519t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
