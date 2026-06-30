package r45;

/* loaded from: classes9.dex */
public class dp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454167d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454168e;

    /* renamed from: f, reason: collision with root package name */
    public int f454169f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454170g;

    /* renamed from: h, reason: collision with root package name */
    public int f454171h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454172i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f454173m;

    /* renamed from: n, reason: collision with root package name */
    public int f454174n;

    /* renamed from: o, reason: collision with root package name */
    public int f454175o;

    /* renamed from: p, reason: collision with root package name */
    public int f454176p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f454177q;

    /* renamed from: r, reason: collision with root package name */
    public int f454178r;

    /* renamed from: s, reason: collision with root package name */
    public int f454179s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dp0)) {
            return false;
        }
        r45.dp0 dp0Var = (r45.dp0) fVar;
        return n51.f.a(this.f454167d, dp0Var.f454167d) && n51.f.a(this.f454168e, dp0Var.f454168e) && n51.f.a(java.lang.Integer.valueOf(this.f454169f), java.lang.Integer.valueOf(dp0Var.f454169f)) && n51.f.a(this.f454170g, dp0Var.f454170g) && n51.f.a(java.lang.Integer.valueOf(this.f454171h), java.lang.Integer.valueOf(dp0Var.f454171h)) && n51.f.a(this.f454172i, dp0Var.f454172i) && n51.f.a(this.f454173m, dp0Var.f454173m) && n51.f.a(java.lang.Integer.valueOf(this.f454174n), java.lang.Integer.valueOf(dp0Var.f454174n)) && n51.f.a(java.lang.Integer.valueOf(this.f454175o), java.lang.Integer.valueOf(dp0Var.f454175o)) && n51.f.a(java.lang.Integer.valueOf(this.f454176p), java.lang.Integer.valueOf(dp0Var.f454176p)) && n51.f.a(this.f454177q, dp0Var.f454177q) && n51.f.a(java.lang.Integer.valueOf(this.f454178r), java.lang.Integer.valueOf(dp0Var.f454178r)) && n51.f.a(java.lang.Integer.valueOf(this.f454179s), java.lang.Integer.valueOf(dp0Var.f454179s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454167d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454168e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f454169f);
            java.lang.String str3 = this.f454170g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f454171h);
            java.lang.String str4 = this.f454172i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f454173m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f454174n);
            fVar.e(9, this.f454175o);
            fVar.e(10, this.f454176p);
            java.lang.String str6 = this.f454177q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.e(12, this.f454178r);
            fVar.e(13, this.f454179s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f454167d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f454168e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int e17 = j17 + b36.f.e(3, this.f454169f);
            java.lang.String str9 = this.f454170g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            int e18 = e17 + b36.f.e(5, this.f454171h);
            java.lang.String str10 = this.f454172i;
            if (str10 != null) {
                e18 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f454173m;
            if (str11 != null) {
                e18 += b36.f.j(7, str11);
            }
            int e19 = e18 + b36.f.e(8, this.f454174n) + b36.f.e(9, this.f454175o) + b36.f.e(10, this.f454176p);
            java.lang.String str12 = this.f454177q;
            if (str12 != null) {
                e19 += b36.f.j(11, str12);
            }
            return e19 + b36.f.e(12, this.f454178r) + b36.f.e(13, this.f454179s);
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
        r45.dp0 dp0Var = (r45.dp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dp0Var.f454167d = aVar2.k(intValue);
                return 0;
            case 2:
                dp0Var.f454168e = aVar2.k(intValue);
                return 0;
            case 3:
                dp0Var.f454169f = aVar2.g(intValue);
                return 0;
            case 4:
                dp0Var.f454170g = aVar2.k(intValue);
                return 0;
            case 5:
                dp0Var.f454171h = aVar2.g(intValue);
                return 0;
            case 6:
                dp0Var.f454172i = aVar2.k(intValue);
                return 0;
            case 7:
                dp0Var.f454173m = aVar2.k(intValue);
                return 0;
            case 8:
                dp0Var.f454174n = aVar2.g(intValue);
                return 0;
            case 9:
                dp0Var.f454175o = aVar2.g(intValue);
                return 0;
            case 10:
                dp0Var.f454176p = aVar2.g(intValue);
                return 0;
            case 11:
                dp0Var.f454177q = aVar2.k(intValue);
                return 0;
            case 12:
                dp0Var.f454178r = aVar2.g(intValue);
                return 0;
            case 13:
                dp0Var.f454179s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
