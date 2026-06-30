package r45;

/* loaded from: classes11.dex */
public class h05 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457247d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457248e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457249f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457250g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457251h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457252i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f457253m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f457254n;

    /* renamed from: o, reason: collision with root package name */
    public int f457255o;

    /* renamed from: p, reason: collision with root package name */
    public r45.b05 f457256p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f457257q;

    /* renamed from: r, reason: collision with root package name */
    public r45.m05 f457258r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f457259s;

    /* renamed from: t, reason: collision with root package name */
    public int f457260t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f457261u;

    /* renamed from: v, reason: collision with root package name */
    public int f457262v;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h05)) {
            return false;
        }
        r45.h05 h05Var = (r45.h05) fVar;
        return n51.f.a(this.f457247d, h05Var.f457247d) && n51.f.a(this.f457248e, h05Var.f457248e) && n51.f.a(this.f457249f, h05Var.f457249f) && n51.f.a(this.f457250g, h05Var.f457250g) && n51.f.a(this.f457251h, h05Var.f457251h) && n51.f.a(this.f457252i, h05Var.f457252i) && n51.f.a(this.f457253m, h05Var.f457253m) && n51.f.a(this.f457254n, h05Var.f457254n) && n51.f.a(java.lang.Integer.valueOf(this.f457255o), java.lang.Integer.valueOf(h05Var.f457255o)) && n51.f.a(this.f457256p, h05Var.f457256p) && n51.f.a(this.f457257q, h05Var.f457257q) && n51.f.a(this.f457258r, h05Var.f457258r) && n51.f.a(this.f457259s, h05Var.f457259s) && n51.f.a(java.lang.Integer.valueOf(this.f457260t), java.lang.Integer.valueOf(h05Var.f457260t)) && n51.f.a(this.f457261u, h05Var.f457261u) && n51.f.a(java.lang.Integer.valueOf(this.f457262v), java.lang.Integer.valueOf(h05Var.f457262v));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f457247d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f457248e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f457249f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f457250g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f457251h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f457252i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f457253m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f457254n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            fVar.e(9, this.f457255o);
            r45.b05 b05Var = this.f457256p;
            if (b05Var != null) {
                fVar.i(10, b05Var.mo75928xcd1e8d8());
                this.f457256p.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str9 = this.f457257q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            r45.m05 m05Var = this.f457258r;
            if (m05Var != null) {
                fVar.i(12, m05Var.mo75928xcd1e8d8());
                this.f457258r.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str10 = this.f457259s;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            fVar.e(15, this.f457260t);
            java.lang.String str11 = this.f457261u;
            if (str11 != null) {
                fVar.j(16, str11);
            }
            fVar.e(17, this.f457262v);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f457247d;
            int j17 = str12 != null ? b36.f.j(1, str12) + 0 : 0;
            java.lang.String str13 = this.f457248e;
            if (str13 != null) {
                j17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f457249f;
            if (str14 != null) {
                j17 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f457250g;
            if (str15 != null) {
                j17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f457251h;
            if (str16 != null) {
                j17 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f457252i;
            if (str17 != null) {
                j17 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f457253m;
            if (str18 != null) {
                j17 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f457254n;
            if (str19 != null) {
                j17 += b36.f.j(8, str19);
            }
            int e17 = j17 + b36.f.e(9, this.f457255o);
            r45.b05 b05Var2 = this.f457256p;
            if (b05Var2 != null) {
                e17 += b36.f.i(10, b05Var2.mo75928xcd1e8d8());
            }
            java.lang.String str20 = this.f457257q;
            if (str20 != null) {
                e17 += b36.f.j(11, str20);
            }
            r45.m05 m05Var2 = this.f457258r;
            if (m05Var2 != null) {
                e17 += b36.f.i(12, m05Var2.mo75928xcd1e8d8());
            }
            java.lang.String str21 = this.f457259s;
            if (str21 != null) {
                e17 += b36.f.j(13, str21);
            }
            int e18 = e17 + b36.f.e(15, this.f457260t);
            java.lang.String str22 = this.f457261u;
            if (str22 != null) {
                e18 += b36.f.j(16, str22);
            }
            return e18 + b36.f.e(17, this.f457262v);
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
        r45.h05 h05Var = (r45.h05) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                h05Var.f457247d = aVar2.k(intValue);
                return 0;
            case 2:
                h05Var.f457248e = aVar2.k(intValue);
                return 0;
            case 3:
                h05Var.f457249f = aVar2.k(intValue);
                return 0;
            case 4:
                h05Var.f457250g = aVar2.k(intValue);
                return 0;
            case 5:
                h05Var.f457251h = aVar2.k(intValue);
                return 0;
            case 6:
                h05Var.f457252i = aVar2.k(intValue);
                return 0;
            case 7:
                h05Var.f457253m = aVar2.k(intValue);
                return 0;
            case 8:
                h05Var.f457254n = aVar2.k(intValue);
                return 0;
            case 9:
                h05Var.f457255o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.b05 b05Var3 = new r45.b05();
                    if (bArr != null && bArr.length > 0) {
                        b05Var3.mo11468x92b714fd(bArr);
                    }
                    h05Var.f457256p = b05Var3;
                }
                return 0;
            case 11:
                h05Var.f457257q = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.m05 m05Var3 = new r45.m05();
                    if (bArr2 != null && bArr2.length > 0) {
                        m05Var3.mo11468x92b714fd(bArr2);
                    }
                    h05Var.f457258r = m05Var3;
                }
                return 0;
            case 13:
                h05Var.f457259s = aVar2.k(intValue);
                return 0;
            case 14:
            default:
                return -1;
            case 15:
                h05Var.f457260t = aVar2.g(intValue);
                return 0;
            case 16:
                h05Var.f457261u = aVar2.k(intValue);
                return 0;
            case 17:
                h05Var.f457262v = aVar2.g(intValue);
                return 0;
        }
    }
}
