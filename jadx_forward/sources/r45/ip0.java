package r45;

/* loaded from: classes9.dex */
public class ip0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String D;

    /* renamed from: d, reason: collision with root package name */
    public int f458762d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458764f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458766h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f458768m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f458770o;

    /* renamed from: q, reason: collision with root package name */
    public long f458772q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f458774s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f458776u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f458778w;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f458780y;

    /* renamed from: e, reason: collision with root package name */
    public boolean f458763e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f458765g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f458767i = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f458769n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f458771p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f458773r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f458775t = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f458777v = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f458779x = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f458781z = false;
    public boolean C = false;
    public boolean E = false;

    public final java.lang.String b() {
        return this.B;
    }

    public final java.lang.String c() {
        return this.f458764f;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ip0)) {
            return false;
        }
        r45.ip0 ip0Var = (r45.ip0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f458762d), java.lang.Integer.valueOf(ip0Var.f458762d)) && n51.f.a(this.f458764f, ip0Var.f458764f) && n51.f.a(this.f458766h, ip0Var.f458766h) && n51.f.a(this.f458768m, ip0Var.f458768m) && n51.f.a(this.f458770o, ip0Var.f458770o) && n51.f.a(java.lang.Long.valueOf(this.f458772q), java.lang.Long.valueOf(ip0Var.f458772q)) && n51.f.a(this.f458774s, ip0Var.f458774s) && n51.f.a(this.f458776u, ip0Var.f458776u) && n51.f.a(this.f458778w, ip0Var.f458778w) && n51.f.a(this.f458780y, ip0Var.f458780y) && n51.f.a(this.A, ip0Var.A) && n51.f.a(this.B, ip0Var.B) && n51.f.a(this.D, ip0Var.D);
    }

    public final java.lang.String d() {
        return this.D;
    }

    public final java.lang.String e() {
        return this.f458770o;
    }

    public final r45.ip0 f(java.lang.String str) {
        this.f458778w = str;
        this.f458779x = true;
        return this;
    }

    public final r45.ip0 g(java.lang.String str) {
        this.B = str;
        this.C = true;
        return this;
    }

    /* renamed from: getAppId */
    public final java.lang.String m161655x74292566() {
        return this.f458778w;
    }

    /* renamed from: getLink */
    public final java.lang.String m161656xfb821870() {
        return this.f458780y;
    }

    public final r45.ip0 i(java.lang.String str) {
        this.f458764f = str;
        this.f458765g = true;
        return this;
    }

    public final r45.ip0 j(java.lang.String str) {
        this.f458780y = str;
        this.f458781z = true;
        return this;
    }

    public final r45.ip0 k(java.lang.String str) {
        this.f458770o = str;
        this.f458771p = true;
        return this;
    }

    public final r45.ip0 l(int i17) {
        this.f458762d = i17;
        this.f458763e = true;
        return this;
    }

    public final r45.ip0 n(java.lang.String str) {
        this.f458766h = str;
        this.f458767i = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f458763e) {
                fVar.e(1, this.f458762d);
            }
            java.lang.String str = this.f458764f;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f458766h;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f458768m;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f458770o;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            if (this.f458773r) {
                fVar.h(6, this.f458772q);
            }
            java.lang.String str5 = this.f458774s;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f458776u;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f458778w;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f458780y;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.A;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            java.lang.String str10 = this.B;
            if (str10 != null) {
                fVar.j(12, str10);
            }
            java.lang.String str11 = this.D;
            if (str11 == null) {
                return 0;
            }
            fVar.j(13, str11);
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f458763e ? 0 + b36.f.e(1, this.f458762d) : 0;
            java.lang.String str12 = this.f458764f;
            if (str12 != null) {
                e17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f458766h;
            if (str13 != null) {
                e17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f458768m;
            if (str14 != null) {
                e17 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f458770o;
            if (str15 != null) {
                e17 += b36.f.j(5, str15);
            }
            if (this.f458773r) {
                e17 += b36.f.h(6, this.f458772q);
            }
            java.lang.String str16 = this.f458774s;
            if (str16 != null) {
                e17 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f458776u;
            if (str17 != null) {
                e17 += b36.f.j(8, str17);
            }
            java.lang.String str18 = this.f458778w;
            if (str18 != null) {
                e17 += b36.f.j(9, str18);
            }
            java.lang.String str19 = this.f458780y;
            if (str19 != null) {
                e17 += b36.f.j(10, str19);
            }
            java.lang.String str20 = this.A;
            if (str20 != null) {
                e17 += b36.f.j(11, str20);
            }
            java.lang.String str21 = this.B;
            if (str21 != null) {
                e17 += b36.f.j(12, str21);
            }
            java.lang.String str22 = this.D;
            return str22 != null ? e17 + b36.f.j(13, str22) : e17;
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
        r45.ip0 ip0Var = (r45.ip0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ip0Var.f458762d = aVar2.g(intValue);
                ip0Var.f458763e = true;
                return 0;
            case 2:
                ip0Var.f458764f = aVar2.k(intValue);
                ip0Var.f458765g = true;
                return 0;
            case 3:
                ip0Var.f458766h = aVar2.k(intValue);
                ip0Var.f458767i = true;
                return 0;
            case 4:
                ip0Var.f458768m = aVar2.k(intValue);
                ip0Var.f458769n = true;
                return 0;
            case 5:
                ip0Var.f458770o = aVar2.k(intValue);
                ip0Var.f458771p = true;
                return 0;
            case 6:
                ip0Var.f458772q = aVar2.i(intValue);
                ip0Var.f458773r = true;
                return 0;
            case 7:
                ip0Var.f458774s = aVar2.k(intValue);
                ip0Var.f458775t = true;
                return 0;
            case 8:
                ip0Var.f458776u = aVar2.k(intValue);
                ip0Var.f458777v = true;
                return 0;
            case 9:
                ip0Var.f458778w = aVar2.k(intValue);
                ip0Var.f458779x = true;
                return 0;
            case 10:
                ip0Var.f458780y = aVar2.k(intValue);
                ip0Var.f458781z = true;
                return 0;
            case 11:
                ip0Var.A = aVar2.k(intValue);
                return 0;
            case 12:
                ip0Var.B = aVar2.k(intValue);
                ip0Var.C = true;
                return 0;
            case 13:
                ip0Var.D = aVar2.k(intValue);
                ip0Var.E = true;
                return 0;
            default:
                return -1;
        }
    }
}
