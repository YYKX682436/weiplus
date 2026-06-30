package r45;

/* loaded from: classes4.dex */
public class ed4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f454844d;

    /* renamed from: e, reason: collision with root package name */
    public float f454845e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454846f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454847g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454848h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454849i;

    /* renamed from: m, reason: collision with root package name */
    public int f454850m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f454851n;

    /* renamed from: o, reason: collision with root package name */
    public int f454852o;

    /* renamed from: p, reason: collision with root package name */
    public int f454853p;

    /* renamed from: q, reason: collision with root package name */
    public int f454854q;

    /* renamed from: r, reason: collision with root package name */
    public float f454855r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f454856s;

    /* renamed from: t, reason: collision with root package name */
    public int f454857t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f454858u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f454859v;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ed4)) {
            return false;
        }
        r45.ed4 ed4Var = (r45.ed4) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f454844d), java.lang.Float.valueOf(ed4Var.f454844d)) && n51.f.a(java.lang.Float.valueOf(this.f454845e), java.lang.Float.valueOf(ed4Var.f454845e)) && n51.f.a(this.f454846f, ed4Var.f454846f) && n51.f.a(this.f454847g, ed4Var.f454847g) && n51.f.a(this.f454848h, ed4Var.f454848h) && n51.f.a(this.f454849i, ed4Var.f454849i) && n51.f.a(java.lang.Integer.valueOf(this.f454850m), java.lang.Integer.valueOf(ed4Var.f454850m)) && n51.f.a(this.f454851n, ed4Var.f454851n) && n51.f.a(java.lang.Integer.valueOf(this.f454852o), java.lang.Integer.valueOf(ed4Var.f454852o)) && n51.f.a(java.lang.Integer.valueOf(this.f454853p), java.lang.Integer.valueOf(ed4Var.f454853p)) && n51.f.a(java.lang.Integer.valueOf(this.f454854q), java.lang.Integer.valueOf(ed4Var.f454854q)) && n51.f.a(java.lang.Float.valueOf(this.f454855r), java.lang.Float.valueOf(ed4Var.f454855r)) && n51.f.a(this.f454856s, ed4Var.f454856s) && n51.f.a(java.lang.Integer.valueOf(this.f454857t), java.lang.Integer.valueOf(ed4Var.f454857t)) && n51.f.a(this.f454858u, ed4Var.f454858u) && n51.f.a(this.f454859v, ed4Var.f454859v);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f454844d);
            fVar.d(2, this.f454845e);
            java.lang.String str = this.f454846f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f454847g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f454848h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f454849i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f454850m);
            java.lang.String str5 = this.f454851n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f454852o);
            fVar.e(10, this.f454853p);
            fVar.e(11, this.f454854q);
            fVar.d(12, this.f454855r);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f454856s;
            if (gVar != null) {
                fVar.b(13, gVar);
            }
            fVar.e(14, this.f454857t);
            java.lang.String str6 = this.f454858u;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.f454859v;
            if (str7 != null) {
                fVar.j(16, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f454844d) + 0 + b36.f.d(2, this.f454845e);
            java.lang.String str8 = this.f454846f;
            if (str8 != null) {
                d17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f454847g;
            if (str9 != null) {
                d17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f454848h;
            if (str10 != null) {
                d17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f454849i;
            if (str11 != null) {
                d17 += b36.f.j(6, str11);
            }
            int e17 = d17 + b36.f.e(7, this.f454850m);
            java.lang.String str12 = this.f454851n;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            int e18 = e17 + b36.f.e(9, this.f454852o) + b36.f.e(10, this.f454853p) + b36.f.e(11, this.f454854q) + b36.f.d(12, this.f454855r);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f454856s;
            if (gVar2 != null) {
                e18 += b36.f.b(13, gVar2);
            }
            int e19 = e18 + b36.f.e(14, this.f454857t);
            java.lang.String str13 = this.f454858u;
            if (str13 != null) {
                e19 += b36.f.j(15, str13);
            }
            java.lang.String str14 = this.f454859v;
            return str14 != null ? e19 + b36.f.j(16, str14) : e19;
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
        r45.ed4 ed4Var = (r45.ed4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ed4Var.f454844d = aVar2.f(intValue);
                return 0;
            case 2:
                ed4Var.f454845e = aVar2.f(intValue);
                return 0;
            case 3:
                ed4Var.f454846f = aVar2.k(intValue);
                return 0;
            case 4:
                ed4Var.f454847g = aVar2.k(intValue);
                return 0;
            case 5:
                ed4Var.f454848h = aVar2.k(intValue);
                return 0;
            case 6:
                ed4Var.f454849i = aVar2.k(intValue);
                return 0;
            case 7:
                ed4Var.f454850m = aVar2.g(intValue);
                return 0;
            case 8:
                ed4Var.f454851n = aVar2.k(intValue);
                return 0;
            case 9:
                ed4Var.f454852o = aVar2.g(intValue);
                return 0;
            case 10:
                ed4Var.f454853p = aVar2.g(intValue);
                return 0;
            case 11:
                ed4Var.f454854q = aVar2.g(intValue);
                return 0;
            case 12:
                ed4Var.f454855r = aVar2.f(intValue);
                return 0;
            case 13:
                ed4Var.f454856s = aVar2.d(intValue);
                return 0;
            case 14:
                ed4Var.f454857t = aVar2.g(intValue);
                return 0;
            case 15:
                ed4Var.f454858u = aVar2.k(intValue);
                return 0;
            case 16:
                ed4Var.f454859v = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
