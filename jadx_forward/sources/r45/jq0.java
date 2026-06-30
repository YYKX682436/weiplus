package r45;

/* loaded from: classes9.dex */
public class jq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;
    public java.lang.String B;

    /* renamed from: d, reason: collision with root package name */
    public int f459567d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459569f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459571h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f459573m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f459575o;

    /* renamed from: q, reason: collision with root package name */
    public long f459577q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f459579s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f459581u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f459583w;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f459585y;

    /* renamed from: e, reason: collision with root package name */
    public boolean f459568e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f459570g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f459572i = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f459574n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f459576p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f459578r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f459580t = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f459582v = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f459584x = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f459586z = false;
    public boolean C = false;

    public final r45.jq0 b(java.lang.String str) {
        this.f459583w = str;
        this.f459584x = true;
        return this;
    }

    public final r45.jq0 c(long j17) {
        this.f459577q = j17;
        this.f459578r = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jq0)) {
            return false;
        }
        r45.jq0 jq0Var = (r45.jq0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f459567d), java.lang.Integer.valueOf(jq0Var.f459567d)) && n51.f.a(this.f459569f, jq0Var.f459569f) && n51.f.a(this.f459571h, jq0Var.f459571h) && n51.f.a(this.f459573m, jq0Var.f459573m) && n51.f.a(this.f459575o, jq0Var.f459575o) && n51.f.a(java.lang.Long.valueOf(this.f459577q), java.lang.Long.valueOf(jq0Var.f459577q)) && n51.f.a(this.f459579s, jq0Var.f459579s) && n51.f.a(this.f459581u, jq0Var.f459581u) && n51.f.a(this.f459583w, jq0Var.f459583w) && n51.f.a(this.f459585y, jq0Var.f459585y) && n51.f.a(this.A, jq0Var.A) && n51.f.a(this.B, jq0Var.B);
    }

    public final r45.jq0 d(java.lang.String str) {
        this.f459581u = str;
        this.f459582v = true;
        return this;
    }

    public final r45.jq0 e(java.lang.String str) {
        this.f459569f = str;
        this.f459570g = true;
        return this;
    }

    public final r45.jq0 f(java.lang.String str) {
        this.f459585y = str;
        this.f459586z = true;
        return this;
    }

    public final r45.jq0 g(int i17) {
        this.f459567d = i17;
        this.f459568e = true;
        return this;
    }

    public final r45.jq0 i(java.lang.String str) {
        this.f459573m = str;
        this.f459574n = true;
        return this;
    }

    public final r45.jq0 j(java.lang.String str) {
        this.f459571h = str;
        this.f459572i = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f459568e) {
                fVar.e(1, this.f459567d);
            }
            java.lang.String str = this.f459569f;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f459571h;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f459573m;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f459575o;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            if (this.f459578r) {
                fVar.h(6, this.f459577q);
            }
            java.lang.String str5 = this.f459579s;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f459581u;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f459583w;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f459585y;
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
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f459568e ? 0 + b36.f.e(1, this.f459567d) : 0;
            java.lang.String str11 = this.f459569f;
            if (str11 != null) {
                e17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f459571h;
            if (str12 != null) {
                e17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f459573m;
            if (str13 != null) {
                e17 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f459575o;
            if (str14 != null) {
                e17 += b36.f.j(5, str14);
            }
            if (this.f459578r) {
                e17 += b36.f.h(6, this.f459577q);
            }
            java.lang.String str15 = this.f459579s;
            if (str15 != null) {
                e17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f459581u;
            if (str16 != null) {
                e17 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f459583w;
            if (str17 != null) {
                e17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f459585y;
            if (str18 != null) {
                e17 += b36.f.j(10, str18);
            }
            java.lang.String str19 = this.A;
            if (str19 != null) {
                e17 += b36.f.j(11, str19);
            }
            java.lang.String str20 = this.B;
            return str20 != null ? e17 + b36.f.j(12, str20) : e17;
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
        r45.jq0 jq0Var = (r45.jq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jq0Var.f459567d = aVar2.g(intValue);
                jq0Var.f459568e = true;
                return 0;
            case 2:
                jq0Var.f459569f = aVar2.k(intValue);
                jq0Var.f459570g = true;
                return 0;
            case 3:
                jq0Var.f459571h = aVar2.k(intValue);
                jq0Var.f459572i = true;
                return 0;
            case 4:
                jq0Var.f459573m = aVar2.k(intValue);
                jq0Var.f459574n = true;
                return 0;
            case 5:
                jq0Var.f459575o = aVar2.k(intValue);
                jq0Var.f459576p = true;
                return 0;
            case 6:
                jq0Var.f459577q = aVar2.i(intValue);
                jq0Var.f459578r = true;
                return 0;
            case 7:
                jq0Var.f459579s = aVar2.k(intValue);
                jq0Var.f459580t = true;
                return 0;
            case 8:
                jq0Var.f459581u = aVar2.k(intValue);
                jq0Var.f459582v = true;
                return 0;
            case 9:
                jq0Var.f459583w = aVar2.k(intValue);
                jq0Var.f459584x = true;
                return 0;
            case 10:
                jq0Var.f459585y = aVar2.k(intValue);
                jq0Var.f459586z = true;
                return 0;
            case 11:
                jq0Var.A = aVar2.k(intValue);
                return 0;
            case 12:
                jq0Var.B = aVar2.k(intValue);
                jq0Var.C = true;
                return 0;
            default:
                return -1;
        }
    }
}
