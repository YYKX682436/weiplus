package r45;

/* loaded from: classes8.dex */
public class u43 extends r45.js5 {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468543f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468544g;

    /* renamed from: h, reason: collision with root package name */
    public int f468545h;

    /* renamed from: i, reason: collision with root package name */
    public int f468546i;

    /* renamed from: m, reason: collision with root package name */
    public int f468547m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f468548n;

    /* renamed from: o, reason: collision with root package name */
    public int f468549o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f468550p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f468551q;

    /* renamed from: d, reason: collision with root package name */
    public int f468541d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468542e = "ok";

    /* renamed from: r, reason: collision with root package name */
    public boolean f468552r = false;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u43)) {
            return false;
        }
        r45.u43 u43Var = (r45.u43) fVar;
        return n51.f.a(this.f76492x92037252, u43Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f468541d), java.lang.Integer.valueOf(u43Var.f468541d)) && n51.f.a(this.f468542e, u43Var.f468542e) && n51.f.a(this.f468543f, u43Var.f468543f) && n51.f.a(this.f468544g, u43Var.f468544g) && n51.f.a(java.lang.Integer.valueOf(this.f468545h), java.lang.Integer.valueOf(u43Var.f468545h)) && n51.f.a(java.lang.Integer.valueOf(this.f468546i), java.lang.Integer.valueOf(u43Var.f468546i)) && n51.f.a(java.lang.Integer.valueOf(this.f468547m), java.lang.Integer.valueOf(u43Var.f468547m)) && n51.f.a(this.f468548n, u43Var.f468548n) && n51.f.a(java.lang.Integer.valueOf(this.f468549o), java.lang.Integer.valueOf(u43Var.f468549o)) && n51.f.a(this.f468550p, u43Var.f468550p) && n51.f.a(this.f468551q, u43Var.f468551q) && n51.f.a(java.lang.Boolean.valueOf(this.f468552r), java.lang.Boolean.valueOf(u43Var.f468552r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f468541d);
            java.lang.String str = this.f468542e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f468543f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f468544g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f468545h);
            fVar.e(7, this.f468546i);
            fVar.e(8, this.f468547m);
            java.lang.String str4 = this.f468548n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f468549o);
            java.lang.String str5 = this.f468550p;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f468551q;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            fVar.a(13, this.f468552r);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f468541d);
            java.lang.String str7 = this.f468542e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f468543f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f468544g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            int e17 = i18 + b36.f.e(6, this.f468545h) + b36.f.e(7, this.f468546i) + b36.f.e(8, this.f468547m);
            java.lang.String str10 = this.f468548n;
            if (str10 != null) {
                e17 += b36.f.j(9, str10);
            }
            int e18 = e17 + b36.f.e(10, this.f468549o);
            java.lang.String str11 = this.f468550p;
            if (str11 != null) {
                e18 += b36.f.j(11, str11);
            }
            java.lang.String str12 = this.f468551q;
            if (str12 != null) {
                e18 += b36.f.j(12, str12);
            }
            return e18 + b36.f.a(13, this.f468552r);
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
        r45.u43 u43Var = (r45.u43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    u43Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                u43Var.f468541d = aVar2.g(intValue);
                return 0;
            case 3:
                u43Var.f468542e = aVar2.k(intValue);
                return 0;
            case 4:
                u43Var.f468543f = aVar2.k(intValue);
                return 0;
            case 5:
                u43Var.f468544g = aVar2.k(intValue);
                return 0;
            case 6:
                u43Var.f468545h = aVar2.g(intValue);
                return 0;
            case 7:
                u43Var.f468546i = aVar2.g(intValue);
                return 0;
            case 8:
                u43Var.f468547m = aVar2.g(intValue);
                return 0;
            case 9:
                u43Var.f468548n = aVar2.k(intValue);
                return 0;
            case 10:
                u43Var.f468549o = aVar2.g(intValue);
                return 0;
            case 11:
                u43Var.f468550p = aVar2.k(intValue);
                return 0;
            case 12:
                u43Var.f468551q = aVar2.k(intValue);
                return 0;
            case 13:
                u43Var.f468552r = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
