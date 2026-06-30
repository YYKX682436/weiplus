package r45;

/* loaded from: classes12.dex */
public class lr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461298d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461299e;

    /* renamed from: f, reason: collision with root package name */
    public int f461300f;

    /* renamed from: g, reason: collision with root package name */
    public int f461301g;

    /* renamed from: h, reason: collision with root package name */
    public int f461302h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461303i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f461304m;

    /* renamed from: n, reason: collision with root package name */
    public int f461305n;

    /* renamed from: o, reason: collision with root package name */
    public int f461306o;

    /* renamed from: p, reason: collision with root package name */
    public int f461307p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f461308q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f461309r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f461310s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lr)) {
            return false;
        }
        r45.lr lrVar = (r45.lr) fVar;
        return n51.f.a(this.f461298d, lrVar.f461298d) && n51.f.a(this.f461299e, lrVar.f461299e) && n51.f.a(java.lang.Integer.valueOf(this.f461300f), java.lang.Integer.valueOf(lrVar.f461300f)) && n51.f.a(java.lang.Integer.valueOf(this.f461301g), java.lang.Integer.valueOf(lrVar.f461301g)) && n51.f.a(java.lang.Integer.valueOf(this.f461302h), java.lang.Integer.valueOf(lrVar.f461302h)) && n51.f.a(this.f461303i, lrVar.f461303i) && n51.f.a(this.f461304m, lrVar.f461304m) && n51.f.a(java.lang.Integer.valueOf(this.f461305n), java.lang.Integer.valueOf(lrVar.f461305n)) && n51.f.a(java.lang.Integer.valueOf(this.f461306o), java.lang.Integer.valueOf(lrVar.f461306o)) && n51.f.a(java.lang.Integer.valueOf(this.f461307p), java.lang.Integer.valueOf(lrVar.f461307p)) && n51.f.a(this.f461308q, lrVar.f461308q) && n51.f.a(this.f461309r, lrVar.f461309r) && n51.f.a(this.f461310s, lrVar.f461310s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461298d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f461299e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f461300f);
            fVar.e(4, this.f461301g);
            fVar.e(5, this.f461302h);
            java.lang.String str3 = this.f461303i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f461304m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f461305n);
            fVar.e(9, this.f461306o);
            fVar.e(10, this.f461307p);
            java.lang.String str5 = this.f461308q;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f461309r;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f461310s;
            if (str7 == null) {
                return 0;
            }
            fVar.j(13, str7);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f461298d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f461299e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int e17 = j17 + b36.f.e(3, this.f461300f) + b36.f.e(4, this.f461301g) + b36.f.e(5, this.f461302h);
            java.lang.String str10 = this.f461303i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f461304m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            int e18 = e17 + b36.f.e(8, this.f461305n) + b36.f.e(9, this.f461306o) + b36.f.e(10, this.f461307p);
            java.lang.String str12 = this.f461308q;
            if (str12 != null) {
                e18 += b36.f.j(11, str12);
            }
            java.lang.String str13 = this.f461309r;
            if (str13 != null) {
                e18 += b36.f.j(12, str13);
            }
            java.lang.String str14 = this.f461310s;
            return str14 != null ? e18 + b36.f.j(13, str14) : e18;
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
        r45.lr lrVar = (r45.lr) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lrVar.f461298d = aVar2.k(intValue);
                return 0;
            case 2:
                lrVar.f461299e = aVar2.k(intValue);
                return 0;
            case 3:
                lrVar.f461300f = aVar2.g(intValue);
                return 0;
            case 4:
                lrVar.f461301g = aVar2.g(intValue);
                return 0;
            case 5:
                lrVar.f461302h = aVar2.g(intValue);
                return 0;
            case 6:
                lrVar.f461303i = aVar2.k(intValue);
                return 0;
            case 7:
                lrVar.f461304m = aVar2.k(intValue);
                return 0;
            case 8:
                lrVar.f461305n = aVar2.g(intValue);
                return 0;
            case 9:
                lrVar.f461306o = aVar2.g(intValue);
                return 0;
            case 10:
                lrVar.f461307p = aVar2.g(intValue);
                return 0;
            case 11:
                lrVar.f461308q = aVar2.k(intValue);
                return 0;
            case 12:
                lrVar.f461309r = aVar2.k(intValue);
                return 0;
            case 13:
                lrVar.f461310s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
