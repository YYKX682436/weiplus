package r45;

/* loaded from: classes7.dex */
public class uc7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f468764d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468765e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468766f;

    /* renamed from: g, reason: collision with root package name */
    public int f468767g;

    /* renamed from: h, reason: collision with root package name */
    public int f468768h;

    /* renamed from: i, reason: collision with root package name */
    public int f468769i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f468770m;

    /* renamed from: n, reason: collision with root package name */
    public int f468771n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f468772o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f468773p;

    /* renamed from: q, reason: collision with root package name */
    public int f468774q;

    /* renamed from: r, reason: collision with root package name */
    public int f468775r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f468776s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f468777t;

    /* renamed from: u, reason: collision with root package name */
    public int f468778u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f468779v;

    /* renamed from: w, reason: collision with root package name */
    public int f468780w;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uc7)) {
            return false;
        }
        r45.uc7 uc7Var = (r45.uc7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f468764d), java.lang.Integer.valueOf(uc7Var.f468764d)) && n51.f.a(this.f468765e, uc7Var.f468765e) && n51.f.a(this.f468766f, uc7Var.f468766f) && n51.f.a(java.lang.Integer.valueOf(this.f468767g), java.lang.Integer.valueOf(uc7Var.f468767g)) && n51.f.a(java.lang.Integer.valueOf(this.f468768h), java.lang.Integer.valueOf(uc7Var.f468768h)) && n51.f.a(java.lang.Integer.valueOf(this.f468769i), java.lang.Integer.valueOf(uc7Var.f468769i)) && n51.f.a(this.f468770m, uc7Var.f468770m) && n51.f.a(java.lang.Integer.valueOf(this.f468771n), java.lang.Integer.valueOf(uc7Var.f468771n)) && n51.f.a(this.f468772o, uc7Var.f468772o) && n51.f.a(this.f468773p, uc7Var.f468773p) && n51.f.a(java.lang.Integer.valueOf(this.f468774q), java.lang.Integer.valueOf(uc7Var.f468774q)) && n51.f.a(java.lang.Integer.valueOf(this.f468775r), java.lang.Integer.valueOf(uc7Var.f468775r)) && n51.f.a(this.f468776s, uc7Var.f468776s) && n51.f.a(this.f468777t, uc7Var.f468777t) && n51.f.a(java.lang.Integer.valueOf(this.f468778u), java.lang.Integer.valueOf(uc7Var.f468778u)) && n51.f.a(this.f468779v, uc7Var.f468779v) && n51.f.a(java.lang.Integer.valueOf(this.f468780w), java.lang.Integer.valueOf(uc7Var.f468780w));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f468764d);
            java.lang.String str = this.f468765e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f468766f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f468767g);
            fVar.e(5, this.f468768h);
            fVar.e(6, this.f468769i);
            java.lang.String str3 = this.f468770m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f468771n);
            java.lang.String str4 = this.f468772o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f468773p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            fVar.e(11, this.f468774q);
            fVar.e(12, this.f468775r);
            java.lang.String str6 = this.f468776s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            java.lang.String str7 = this.f468777t;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            fVar.e(15, this.f468778u);
            java.lang.String str8 = this.f468779v;
            if (str8 != null) {
                fVar.j(16, str8);
            }
            fVar.e(17, this.f468780w);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f468764d) + 0;
            java.lang.String str9 = this.f468765e;
            if (str9 != null) {
                e17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f468766f;
            if (str10 != null) {
                e17 += b36.f.j(3, str10);
            }
            int e18 = e17 + b36.f.e(4, this.f468767g) + b36.f.e(5, this.f468768h) + b36.f.e(6, this.f468769i);
            java.lang.String str11 = this.f468770m;
            if (str11 != null) {
                e18 += b36.f.j(7, str11);
            }
            int e19 = e18 + b36.f.e(8, this.f468771n);
            java.lang.String str12 = this.f468772o;
            if (str12 != null) {
                e19 += b36.f.j(9, str12);
            }
            java.lang.String str13 = this.f468773p;
            if (str13 != null) {
                e19 += b36.f.j(10, str13);
            }
            int e27 = e19 + b36.f.e(11, this.f468774q) + b36.f.e(12, this.f468775r);
            java.lang.String str14 = this.f468776s;
            if (str14 != null) {
                e27 += b36.f.j(13, str14);
            }
            java.lang.String str15 = this.f468777t;
            if (str15 != null) {
                e27 += b36.f.j(14, str15);
            }
            int e28 = e27 + b36.f.e(15, this.f468778u);
            java.lang.String str16 = this.f468779v;
            if (str16 != null) {
                e28 += b36.f.j(16, str16);
            }
            return e28 + b36.f.e(17, this.f468780w);
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
        r45.uc7 uc7Var = (r45.uc7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uc7Var.f468764d = aVar2.g(intValue);
                return 0;
            case 2:
                uc7Var.f468765e = aVar2.k(intValue);
                return 0;
            case 3:
                uc7Var.f468766f = aVar2.k(intValue);
                return 0;
            case 4:
                uc7Var.f468767g = aVar2.g(intValue);
                return 0;
            case 5:
                uc7Var.f468768h = aVar2.g(intValue);
                return 0;
            case 6:
                uc7Var.f468769i = aVar2.g(intValue);
                return 0;
            case 7:
                uc7Var.f468770m = aVar2.k(intValue);
                return 0;
            case 8:
                uc7Var.f468771n = aVar2.g(intValue);
                return 0;
            case 9:
                uc7Var.f468772o = aVar2.k(intValue);
                return 0;
            case 10:
                uc7Var.f468773p = aVar2.k(intValue);
                return 0;
            case 11:
                uc7Var.f468774q = aVar2.g(intValue);
                return 0;
            case 12:
                uc7Var.f468775r = aVar2.g(intValue);
                return 0;
            case 13:
                uc7Var.f468776s = aVar2.k(intValue);
                return 0;
            case 14:
                uc7Var.f468777t = aVar2.k(intValue);
                return 0;
            case 15:
                uc7Var.f468778u = aVar2.g(intValue);
                return 0;
            case 16:
                uc7Var.f468779v = aVar2.k(intValue);
                return 0;
            case 17:
                uc7Var.f468780w = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
