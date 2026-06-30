package r45;

/* loaded from: classes9.dex */
public class pp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public boolean A;
    public java.lang.String C;
    public java.lang.String E;

    /* renamed from: d, reason: collision with root package name */
    public double f464799d;

    /* renamed from: f, reason: collision with root package name */
    public double f464801f;

    /* renamed from: h, reason: collision with root package name */
    public int f464803h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464805m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f464807o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f464809q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f464811s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f464813u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f464815w;

    /* renamed from: y, reason: collision with root package name */
    public float f464817y;

    /* renamed from: e, reason: collision with root package name */
    public boolean f464800e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f464802g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f464804i = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f464806n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f464808p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f464810r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f464812t = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f464814v = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f464816x = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f464818z = false;
    public boolean B = false;
    public boolean D = false;
    public boolean F = false;

    public final r45.pp0 A(float f17) {
        this.f464817y = f17;
        this.f464818z = true;
        return this;
    }

    public final r45.pp0 B(java.lang.String str) {
        this.f464809q = str;
        this.f464810r = true;
        return this;
    }

    public final r45.pp0 C(java.lang.String str) {
        this.f464807o = str;
        this.f464808p = true;
        return this;
    }

    public final r45.pp0 E(int i17) {
        this.f464803h = i17;
        this.f464804i = true;
        return this;
    }

    public final java.lang.String b() {
        return this.C;
    }

    public final java.lang.String c() {
        return this.E;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pp0)) {
            return false;
        }
        r45.pp0 pp0Var = (r45.pp0) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f464799d), java.lang.Double.valueOf(pp0Var.f464799d)) && n51.f.a(java.lang.Double.valueOf(this.f464801f), java.lang.Double.valueOf(pp0Var.f464801f)) && n51.f.a(java.lang.Integer.valueOf(this.f464803h), java.lang.Integer.valueOf(pp0Var.f464803h)) && n51.f.a(this.f464805m, pp0Var.f464805m) && n51.f.a(this.f464807o, pp0Var.f464807o) && n51.f.a(this.f464809q, pp0Var.f464809q) && n51.f.a(this.f464811s, pp0Var.f464811s) && n51.f.a(this.f464813u, pp0Var.f464813u) && n51.f.a(this.f464815w, pp0Var.f464815w) && n51.f.a(java.lang.Float.valueOf(this.f464817y), java.lang.Float.valueOf(pp0Var.f464817y)) && n51.f.a(java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(pp0Var.A)) && n51.f.a(this.C, pp0Var.C) && n51.f.a(this.E, pp0Var.E);
    }

    public final boolean d() {
        return this.A;
    }

    public final java.lang.String e() {
        return this.f464805m;
    }

    public final double f() {
        return this.f464801f;
    }

    public final double g() {
        return this.f464799d;
    }

    public final java.lang.String i() {
        return this.f464813u;
    }

    public final java.lang.String j() {
        return this.f464811s;
    }

    public final java.lang.String k() {
        return this.f464815w;
    }

    public final float l() {
        return this.f464817y;
    }

    public final java.lang.String n() {
        return this.f464809q;
    }

    public final java.lang.String o() {
        return this.f464807o;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f464800e) {
                fVar.c(1, this.f464799d);
            }
            if (this.f464802g) {
                fVar.c(2, this.f464801f);
            }
            if (this.f464804i) {
                fVar.e(3, this.f464803h);
            }
            java.lang.String str = this.f464805m;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f464807o;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f464809q;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f464811s;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f464813u;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f464815w;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            if (this.f464818z) {
                fVar.d(10, this.f464817y);
            }
            if (this.B) {
                fVar.a(11, this.A);
            }
            java.lang.String str7 = this.C;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            java.lang.String str8 = this.E;
            if (str8 == null) {
                return 0;
            }
            fVar.j(13, str8);
            return 0;
        }
        if (i17 == 1) {
            int c17 = this.f464800e ? b36.f.c(1, this.f464799d) + 0 : 0;
            if (this.f464802g) {
                c17 += b36.f.c(2, this.f464801f);
            }
            if (this.f464804i) {
                c17 += b36.f.e(3, this.f464803h);
            }
            java.lang.String str9 = this.f464805m;
            if (str9 != null) {
                c17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f464807o;
            if (str10 != null) {
                c17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f464809q;
            if (str11 != null) {
                c17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f464811s;
            if (str12 != null) {
                c17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f464813u;
            if (str13 != null) {
                c17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f464815w;
            if (str14 != null) {
                c17 += b36.f.j(9, str14);
            }
            if (this.f464818z) {
                c17 += b36.f.d(10, this.f464817y);
            }
            if (this.B) {
                c17 += b36.f.a(11, this.A);
            }
            java.lang.String str15 = this.C;
            if (str15 != null) {
                c17 += b36.f.j(12, str15);
            }
            java.lang.String str16 = this.E;
            return str16 != null ? c17 + b36.f.j(13, str16) : c17;
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
        r45.pp0 pp0Var = (r45.pp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pp0Var.f464799d = aVar2.e(intValue);
                pp0Var.f464800e = true;
                return 0;
            case 2:
                pp0Var.f464801f = aVar2.e(intValue);
                pp0Var.f464802g = true;
                return 0;
            case 3:
                pp0Var.f464803h = aVar2.g(intValue);
                pp0Var.f464804i = true;
                return 0;
            case 4:
                pp0Var.f464805m = aVar2.k(intValue);
                pp0Var.f464806n = true;
                return 0;
            case 5:
                pp0Var.f464807o = aVar2.k(intValue);
                pp0Var.f464808p = true;
                return 0;
            case 6:
                pp0Var.f464809q = aVar2.k(intValue);
                pp0Var.f464810r = true;
                return 0;
            case 7:
                pp0Var.f464811s = aVar2.k(intValue);
                pp0Var.f464812t = true;
                return 0;
            case 8:
                pp0Var.f464813u = aVar2.k(intValue);
                pp0Var.f464814v = true;
                return 0;
            case 9:
                pp0Var.f464815w = aVar2.k(intValue);
                pp0Var.f464816x = true;
                return 0;
            case 10:
                pp0Var.f464817y = aVar2.f(intValue);
                pp0Var.f464818z = true;
                return 0;
            case 11:
                pp0Var.A = aVar2.c(intValue);
                pp0Var.B = true;
                return 0;
            case 12:
                pp0Var.C = aVar2.k(intValue);
                pp0Var.D = true;
                return 0;
            case 13:
                pp0Var.E = aVar2.k(intValue);
                pp0Var.F = true;
                return 0;
            default:
                return -1;
        }
    }

    public final int p() {
        return this.f464803h;
    }

    public final r45.pp0 q(java.lang.String str) {
        this.C = str;
        this.D = true;
        return this;
    }

    public final r45.pp0 r(java.lang.String str) {
        this.E = str;
        this.F = true;
        return this;
    }

    public final r45.pp0 s(boolean z17) {
        this.A = z17;
        this.B = true;
        return this;
    }

    public final r45.pp0 t(java.lang.String str) {
        this.f464805m = str;
        this.f464806n = true;
        return this;
    }

    public final r45.pp0 u(double d17) {
        this.f464801f = d17;
        this.f464802g = true;
        return this;
    }

    public final r45.pp0 w(double d17) {
        this.f464799d = d17;
        this.f464800e = true;
        return this;
    }

    public final r45.pp0 x(java.lang.String str) {
        this.f464813u = str;
        this.f464814v = true;
        return this;
    }

    public final r45.pp0 y(java.lang.String str) {
        this.f464811s = str;
        this.f464812t = true;
        return this;
    }

    public final r45.pp0 z(java.lang.String str) {
        this.f464815w = str;
        this.f464816x = true;
        return this;
    }
}
