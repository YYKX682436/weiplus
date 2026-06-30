package r45;

/* loaded from: classes2.dex */
public class tk5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f468056d;

    /* renamed from: e, reason: collision with root package name */
    public int f468057e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468058f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468059g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468060h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f468061i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f468062m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f468063n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f468064o;

    /* renamed from: p, reason: collision with root package name */
    public double f468065p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f468066q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f468067r;

    /* renamed from: s, reason: collision with root package name */
    public r45.wt3 f468068s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f468069t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f468070u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f468071v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f468072w;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tk5)) {
            return false;
        }
        r45.tk5 tk5Var = (r45.tk5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f468056d), java.lang.Integer.valueOf(tk5Var.f468056d)) && n51.f.a(java.lang.Integer.valueOf(this.f468057e), java.lang.Integer.valueOf(tk5Var.f468057e)) && n51.f.a(this.f468058f, tk5Var.f468058f) && n51.f.a(this.f468059g, tk5Var.f468059g) && n51.f.a(this.f468060h, tk5Var.f468060h) && n51.f.a(this.f468061i, tk5Var.f468061i) && n51.f.a(this.f468062m, tk5Var.f468062m) && n51.f.a(this.f468063n, tk5Var.f468063n) && n51.f.a(this.f468064o, tk5Var.f468064o) && n51.f.a(java.lang.Double.valueOf(this.f468065p), java.lang.Double.valueOf(tk5Var.f468065p)) && n51.f.a(this.f468066q, tk5Var.f468066q) && n51.f.a(this.f468067r, tk5Var.f468067r) && n51.f.a(this.f468068s, tk5Var.f468068s) && n51.f.a(this.f468069t, tk5Var.f468069t) && n51.f.a(this.f468070u, tk5Var.f468070u) && n51.f.a(this.f468071v, tk5Var.f468071v) && n51.f.a(this.f468072w, tk5Var.f468072w);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f468056d);
            fVar.e(2, this.f468057e);
            java.lang.String str = this.f468058f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f468059g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f468060h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f468061i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f468062m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f468063n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f468064o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            fVar.c(10, this.f468065p);
            java.lang.String str8 = this.f468066q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f468067r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            r45.wt3 wt3Var = this.f468068s;
            if (wt3Var != null) {
                fVar.i(14, wt3Var.mo75928xcd1e8d8());
                this.f468068s.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str10 = this.f468069t;
            if (str10 != null) {
                fVar.j(15, str10);
            }
            java.lang.String str11 = this.f468070u;
            if (str11 != null) {
                fVar.j(16, str11);
            }
            java.lang.String str12 = this.f468071v;
            if (str12 != null) {
                fVar.j(17, str12);
            }
            java.lang.String str13 = this.f468072w;
            if (str13 != null) {
                fVar.j(18, str13);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f468056d) + 0 + b36.f.e(2, this.f468057e);
            java.lang.String str14 = this.f468058f;
            if (str14 != null) {
                e17 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f468059g;
            if (str15 != null) {
                e17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f468060h;
            if (str16 != null) {
                e17 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f468061i;
            if (str17 != null) {
                e17 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f468062m;
            if (str18 != null) {
                e17 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f468063n;
            if (str19 != null) {
                e17 += b36.f.j(8, str19);
            }
            java.lang.String str20 = this.f468064o;
            if (str20 != null) {
                e17 += b36.f.j(9, str20);
            }
            int c17 = e17 + b36.f.c(10, this.f468065p);
            java.lang.String str21 = this.f468066q;
            if (str21 != null) {
                c17 += b36.f.j(11, str21);
            }
            java.lang.String str22 = this.f468067r;
            if (str22 != null) {
                c17 += b36.f.j(12, str22);
            }
            r45.wt3 wt3Var2 = this.f468068s;
            if (wt3Var2 != null) {
                c17 += b36.f.i(14, wt3Var2.mo75928xcd1e8d8());
            }
            java.lang.String str23 = this.f468069t;
            if (str23 != null) {
                c17 += b36.f.j(15, str23);
            }
            java.lang.String str24 = this.f468070u;
            if (str24 != null) {
                c17 += b36.f.j(16, str24);
            }
            java.lang.String str25 = this.f468071v;
            if (str25 != null) {
                c17 += b36.f.j(17, str25);
            }
            java.lang.String str26 = this.f468072w;
            return str26 != null ? c17 + b36.f.j(18, str26) : c17;
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
        r45.tk5 tk5Var = (r45.tk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tk5Var.f468056d = aVar2.g(intValue);
                return 0;
            case 2:
                tk5Var.f468057e = aVar2.g(intValue);
                return 0;
            case 3:
                tk5Var.f468058f = aVar2.k(intValue);
                return 0;
            case 4:
                tk5Var.f468059g = aVar2.k(intValue);
                return 0;
            case 5:
                tk5Var.f468060h = aVar2.k(intValue);
                return 0;
            case 6:
                tk5Var.f468061i = aVar2.k(intValue);
                return 0;
            case 7:
                tk5Var.f468062m = aVar2.k(intValue);
                return 0;
            case 8:
                tk5Var.f468063n = aVar2.k(intValue);
                return 0;
            case 9:
                tk5Var.f468064o = aVar2.k(intValue);
                return 0;
            case 10:
                tk5Var.f468065p = aVar2.e(intValue);
                return 0;
            case 11:
                tk5Var.f468066q = aVar2.k(intValue);
                return 0;
            case 12:
                tk5Var.f468067r = aVar2.k(intValue);
                return 0;
            case 13:
            default:
                return -1;
            case 14:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.wt3 wt3Var3 = new r45.wt3();
                    if (bArr != null && bArr.length > 0) {
                        wt3Var3.mo11468x92b714fd(bArr);
                    }
                    tk5Var.f468068s = wt3Var3;
                }
                return 0;
            case 15:
                tk5Var.f468069t = aVar2.k(intValue);
                return 0;
            case 16:
                tk5Var.f468070u = aVar2.k(intValue);
                return 0;
            case 17:
                tk5Var.f468071v = aVar2.k(intValue);
                return 0;
            case 18:
                tk5Var.f468072w = aVar2.k(intValue);
                return 0;
        }
    }
}
