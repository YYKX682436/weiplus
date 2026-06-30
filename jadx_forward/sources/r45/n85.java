package r45;

/* loaded from: classes8.dex */
public class n85 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f462696d;

    /* renamed from: e, reason: collision with root package name */
    public long f462697e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462698f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462699g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462700h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462701i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ro6 f462702m;

    /* renamed from: n, reason: collision with root package name */
    public r45.eq4 f462703n;

    /* renamed from: o, reason: collision with root package name */
    public r45.dn4 f462704o;

    /* renamed from: p, reason: collision with root package name */
    public int f462705p;

    /* renamed from: q, reason: collision with root package name */
    public int f462706q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f462707r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f462708s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f462709t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n85)) {
            return false;
        }
        r45.n85 n85Var = (r45.n85) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462696d), java.lang.Integer.valueOf(n85Var.f462696d)) && n51.f.a(java.lang.Long.valueOf(this.f462697e), java.lang.Long.valueOf(n85Var.f462697e)) && n51.f.a(this.f462698f, n85Var.f462698f) && n51.f.a(this.f462699g, n85Var.f462699g) && n51.f.a(this.f462700h, n85Var.f462700h) && n51.f.a(this.f462701i, n85Var.f462701i) && n51.f.a(this.f462702m, n85Var.f462702m) && n51.f.a(this.f462703n, n85Var.f462703n) && n51.f.a(this.f462704o, n85Var.f462704o) && n51.f.a(java.lang.Integer.valueOf(this.f462705p), java.lang.Integer.valueOf(n85Var.f462705p)) && n51.f.a(java.lang.Integer.valueOf(this.f462706q), java.lang.Integer.valueOf(n85Var.f462706q)) && n51.f.a(this.f462707r, n85Var.f462707r) && n51.f.a(this.f462708s, n85Var.f462708s) && n51.f.a(this.f462709t, n85Var.f462709t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462696d);
            fVar.h(2, this.f462697e);
            java.lang.String str = this.f462698f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f462699g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f462700h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f462701i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            r45.ro6 ro6Var = this.f462702m;
            if (ro6Var != null) {
                fVar.i(7, ro6Var.mo75928xcd1e8d8());
                this.f462702m.mo75956x3d5d1f78(fVar);
            }
            r45.eq4 eq4Var = this.f462703n;
            if (eq4Var != null) {
                fVar.i(8, eq4Var.mo75928xcd1e8d8());
                this.f462703n.mo75956x3d5d1f78(fVar);
            }
            r45.dn4 dn4Var = this.f462704o;
            if (dn4Var != null) {
                fVar.i(9, dn4Var.mo75928xcd1e8d8());
                this.f462704o.mo75956x3d5d1f78(fVar);
            }
            fVar.e(10, this.f462705p);
            fVar.e(11, this.f462706q);
            java.lang.String str5 = this.f462707r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            java.lang.String str6 = this.f462708s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            java.lang.String str7 = this.f462709t;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462696d) + 0 + b36.f.h(2, this.f462697e);
            java.lang.String str8 = this.f462698f;
            if (str8 != null) {
                e17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f462699g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f462700h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f462701i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            r45.ro6 ro6Var2 = this.f462702m;
            if (ro6Var2 != null) {
                e17 += b36.f.i(7, ro6Var2.mo75928xcd1e8d8());
            }
            r45.eq4 eq4Var2 = this.f462703n;
            if (eq4Var2 != null) {
                e17 += b36.f.i(8, eq4Var2.mo75928xcd1e8d8());
            }
            r45.dn4 dn4Var2 = this.f462704o;
            if (dn4Var2 != null) {
                e17 += b36.f.i(9, dn4Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(10, this.f462705p) + b36.f.e(11, this.f462706q);
            java.lang.String str12 = this.f462707r;
            if (str12 != null) {
                e18 += b36.f.j(12, str12);
            }
            java.lang.String str13 = this.f462708s;
            if (str13 != null) {
                e18 += b36.f.j(13, str13);
            }
            java.lang.String str14 = this.f462709t;
            return str14 != null ? e18 + b36.f.j(14, str14) : e18;
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
        r45.n85 n85Var = (r45.n85) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n85Var.f462696d = aVar2.g(intValue);
                return 0;
            case 2:
                n85Var.f462697e = aVar2.i(intValue);
                return 0;
            case 3:
                n85Var.f462698f = aVar2.k(intValue);
                return 0;
            case 4:
                n85Var.f462699g = aVar2.k(intValue);
                return 0;
            case 5:
                n85Var.f462700h = aVar2.k(intValue);
                return 0;
            case 6:
                n85Var.f462701i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.ro6 ro6Var3 = new r45.ro6();
                    if (bArr != null && bArr.length > 0) {
                        ro6Var3.mo11468x92b714fd(bArr);
                    }
                    n85Var.f462702m = ro6Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.eq4 eq4Var3 = new r45.eq4();
                    if (bArr2 != null && bArr2.length > 0) {
                        eq4Var3.mo11468x92b714fd(bArr2);
                    }
                    n85Var.f462703n = eq4Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.dn4 dn4Var3 = new r45.dn4();
                    if (bArr3 != null && bArr3.length > 0) {
                        dn4Var3.mo11468x92b714fd(bArr3);
                    }
                    n85Var.f462704o = dn4Var3;
                }
                return 0;
            case 10:
                n85Var.f462705p = aVar2.g(intValue);
                return 0;
            case 11:
                n85Var.f462706q = aVar2.g(intValue);
                return 0;
            case 12:
                n85Var.f462707r = aVar2.k(intValue);
                return 0;
            case 13:
                n85Var.f462708s = aVar2.k(intValue);
                return 0;
            case 14:
                n85Var.f462709t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
