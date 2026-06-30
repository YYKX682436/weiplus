package r45;

/* loaded from: classes11.dex */
public class kn4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460378d;

    /* renamed from: e, reason: collision with root package name */
    public int f460379e;

    /* renamed from: f, reason: collision with root package name */
    public int f460380f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460381g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460382h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460383i;

    /* renamed from: m, reason: collision with root package name */
    public int f460384m;

    /* renamed from: n, reason: collision with root package name */
    public int f460385n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f460386o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f460387p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f460388q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kn4)) {
            return false;
        }
        r45.kn4 kn4Var = (r45.kn4) fVar;
        return n51.f.a(this.f460378d, kn4Var.f460378d) && n51.f.a(java.lang.Integer.valueOf(this.f460379e), java.lang.Integer.valueOf(kn4Var.f460379e)) && n51.f.a(java.lang.Integer.valueOf(this.f460380f), java.lang.Integer.valueOf(kn4Var.f460380f)) && n51.f.a(this.f460381g, kn4Var.f460381g) && n51.f.a(this.f460382h, kn4Var.f460382h) && n51.f.a(this.f460383i, kn4Var.f460383i) && n51.f.a(java.lang.Integer.valueOf(this.f460384m), java.lang.Integer.valueOf(kn4Var.f460384m)) && n51.f.a(java.lang.Integer.valueOf(this.f460385n), java.lang.Integer.valueOf(kn4Var.f460385n)) && n51.f.a(this.f460386o, kn4Var.f460386o) && n51.f.a(this.f460387p, kn4Var.f460387p) && n51.f.a(this.f460388q, kn4Var.f460388q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460378d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f460379e);
            fVar.e(3, this.f460380f);
            java.lang.String str2 = this.f460381g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f460382h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f460383i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f460384m);
            fVar.e(8, this.f460385n);
            java.lang.String str5 = this.f460386o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f460387p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f460388q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f460378d;
            int j17 = (str8 != null ? 0 + b36.f.j(1, str8) : 0) + b36.f.e(2, this.f460379e) + b36.f.e(3, this.f460380f);
            java.lang.String str9 = this.f460381g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f460382h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f460383i;
            if (str11 != null) {
                j17 += b36.f.j(6, str11);
            }
            int e17 = j17 + b36.f.e(7, this.f460384m) + b36.f.e(8, this.f460385n);
            java.lang.String str12 = this.f460386o;
            if (str12 != null) {
                e17 += b36.f.j(9, str12);
            }
            java.lang.String str13 = this.f460387p;
            if (str13 != null) {
                e17 += b36.f.j(10, str13);
            }
            java.lang.String str14 = this.f460388q;
            return str14 != null ? e17 + b36.f.j(11, str14) : e17;
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
        r45.kn4 kn4Var = (r45.kn4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kn4Var.f460378d = aVar2.k(intValue);
                return 0;
            case 2:
                kn4Var.f460379e = aVar2.g(intValue);
                return 0;
            case 3:
                kn4Var.f460380f = aVar2.g(intValue);
                return 0;
            case 4:
                kn4Var.f460381g = aVar2.k(intValue);
                return 0;
            case 5:
                kn4Var.f460382h = aVar2.k(intValue);
                return 0;
            case 6:
                kn4Var.f460383i = aVar2.k(intValue);
                return 0;
            case 7:
                kn4Var.f460384m = aVar2.g(intValue);
                return 0;
            case 8:
                kn4Var.f460385n = aVar2.g(intValue);
                return 0;
            case 9:
                kn4Var.f460386o = aVar2.k(intValue);
                return 0;
            case 10:
                kn4Var.f460387p = aVar2.k(intValue);
                return 0;
            case 11:
                kn4Var.f460388q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
