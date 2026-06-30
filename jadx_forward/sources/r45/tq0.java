package r45;

/* loaded from: classes9.dex */
public class tq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468197d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468199f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468201h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f468203m;

    /* renamed from: o, reason: collision with root package name */
    public int f468205o;

    /* renamed from: q, reason: collision with root package name */
    public int f468207q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f468209s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f468211u;

    /* renamed from: w, reason: collision with root package name */
    public int f468213w;

    /* renamed from: e, reason: collision with root package name */
    public boolean f468198e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f468200g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f468202i = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f468204n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f468206p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f468208r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f468210t = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f468212v = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f468214x = false;

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f468215y = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public boolean f468216z = false;
    public boolean B = false;

    public final java.lang.String b() {
        return this.f468201h;
    }

    public final int c() {
        return this.f468207q;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tq0)) {
            return false;
        }
        r45.tq0 tq0Var = (r45.tq0) fVar;
        return n51.f.a(this.f468197d, tq0Var.f468197d) && n51.f.a(this.f468199f, tq0Var.f468199f) && n51.f.a(this.f468201h, tq0Var.f468201h) && n51.f.a(this.f468203m, tq0Var.f468203m) && n51.f.a(java.lang.Integer.valueOf(this.f468205o), java.lang.Integer.valueOf(tq0Var.f468205o)) && n51.f.a(java.lang.Integer.valueOf(this.f468207q), java.lang.Integer.valueOf(tq0Var.f468207q)) && n51.f.a(this.f468209s, tq0Var.f468209s) && n51.f.a(this.f468211u, tq0Var.f468211u) && n51.f.a(java.lang.Integer.valueOf(this.f468213w), java.lang.Integer.valueOf(tq0Var.f468213w)) && n51.f.a(this.f468215y, tq0Var.f468215y) && n51.f.a(this.A, tq0Var.A);
    }

    public final java.lang.String d() {
        return this.f468199f;
    }

    public final java.lang.String e() {
        return this.A;
    }

    public final int f() {
        return this.f468213w;
    }

    public final int g() {
        return this.f468205o;
    }

    /* renamed from: getThumbUrl */
    public final java.lang.String m161748xd93f812f() {
        return this.f468203m;
    }

    /* renamed from: getTitle */
    public final java.lang.String m161749x7531c8a2() {
        return this.f468197d;
    }

    public final r45.tq0 i(java.lang.String str) {
        this.f468201h = str;
        this.f468202i = true;
        return this;
    }

    public final r45.tq0 j(java.lang.String str) {
        this.f468199f = str;
        this.f468200g = true;
        return this;
    }

    public final r45.tq0 k(java.lang.String str) {
        this.A = str;
        this.B = true;
        return this;
    }

    public final r45.tq0 l(int i17) {
        this.f468213w = i17;
        this.f468214x = true;
        return this;
    }

    public final r45.tq0 n(int i17) {
        this.f468205o = i17;
        this.f468206p = true;
        return this;
    }

    public final r45.tq0 o(java.lang.String str) {
        this.f468203m = str;
        this.f468204n = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f468197d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f468199f;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f468201h;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f468203m;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            if (this.f468206p) {
                fVar.e(5, this.f468205o);
            }
            if (this.f468208r) {
                fVar.e(6, this.f468207q);
            }
            java.lang.String str5 = this.f468209s;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f468211u;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            if (this.f468214x) {
                fVar.e(9, this.f468213w);
            }
            fVar.g(10, 8, this.f468215y);
            java.lang.String str7 = this.A;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f468197d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f468199f;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f468201h;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f468203m;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            if (this.f468206p) {
                j17 += b36.f.e(5, this.f468205o);
            }
            if (this.f468208r) {
                j17 += b36.f.e(6, this.f468207q);
            }
            java.lang.String str12 = this.f468209s;
            if (str12 != null) {
                j17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f468211u;
            if (str13 != null) {
                j17 += b36.f.j(8, str13);
            }
            if (this.f468214x) {
                j17 += b36.f.e(9, this.f468213w);
            }
            int g17 = j17 + b36.f.g(10, 8, this.f468215y);
            java.lang.String str14 = this.A;
            return str14 != null ? g17 + b36.f.j(11, str14) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f468215y.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.tq0 tq0Var = (r45.tq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tq0Var.f468197d = aVar2.k(intValue);
                tq0Var.f468198e = true;
                return 0;
            case 2:
                tq0Var.f468199f = aVar2.k(intValue);
                tq0Var.f468200g = true;
                return 0;
            case 3:
                tq0Var.f468201h = aVar2.k(intValue);
                tq0Var.f468202i = true;
                return 0;
            case 4:
                tq0Var.f468203m = aVar2.k(intValue);
                tq0Var.f468204n = true;
                return 0;
            case 5:
                tq0Var.f468205o = aVar2.g(intValue);
                tq0Var.f468206p = true;
                return 0;
            case 6:
                tq0Var.f468207q = aVar2.g(intValue);
                tq0Var.f468208r = true;
                return 0;
            case 7:
                tq0Var.f468209s = aVar2.k(intValue);
                tq0Var.f468210t = true;
                return 0;
            case 8:
                tq0Var.f468211u = aVar2.k(intValue);
                tq0Var.f468212v = true;
                return 0;
            case 9:
                tq0Var.f468213w = aVar2.g(intValue);
                tq0Var.f468214x = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.np0 np0Var = new r45.np0();
                    if (bArr2 != null && bArr2.length > 0) {
                        np0Var.mo11468x92b714fd(bArr2);
                    }
                    tq0Var.f468215y.add(np0Var);
                }
                tq0Var.f468216z = true;
                return 0;
            case 11:
                tq0Var.A = aVar2.k(intValue);
                tq0Var.B = true;
                return 0;
            default:
                return -1;
        }
    }

    public final r45.tq0 p(java.lang.String str) {
        this.f468197d = str;
        this.f468198e = true;
        return this;
    }

    public final r45.tq0 q(java.lang.String str) {
        this.f468211u = str;
        this.f468212v = true;
        return this;
    }
}
