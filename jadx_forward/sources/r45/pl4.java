package r45;

/* loaded from: classes10.dex */
public class pl4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464689d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464690e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464691f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464692g;

    /* renamed from: h, reason: collision with root package name */
    public int f464693h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464694i;

    /* renamed from: m, reason: collision with root package name */
    public int f464695m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f464696n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pl4)) {
            return false;
        }
        r45.pl4 pl4Var = (r45.pl4) fVar;
        return n51.f.a(this.f464689d, pl4Var.f464689d) && n51.f.a(this.f464690e, pl4Var.f464690e) && n51.f.a(this.f464691f, pl4Var.f464691f) && n51.f.a(this.f464692g, pl4Var.f464692g) && n51.f.a(java.lang.Integer.valueOf(this.f464693h), java.lang.Integer.valueOf(pl4Var.f464693h)) && n51.f.a(this.f464694i, pl4Var.f464694i) && n51.f.a(java.lang.Integer.valueOf(this.f464695m), java.lang.Integer.valueOf(pl4Var.f464695m)) && n51.f.a(this.f464696n, pl4Var.f464696n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464689d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f464690e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f464691f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f464692g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f464693h);
            java.lang.String str5 = this.f464694i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f464695m);
            java.lang.String str6 = this.f464696n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f464689d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f464690e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f464691f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f464692g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            int e17 = j17 + b36.f.e(5, this.f464693h);
            java.lang.String str11 = this.f464694i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            int e18 = e17 + b36.f.e(7, this.f464695m);
            java.lang.String str12 = this.f464696n;
            return str12 != null ? e18 + b36.f.j(8, str12) : e18;
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
        r45.pl4 pl4Var = (r45.pl4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pl4Var.f464689d = aVar2.k(intValue);
                return 0;
            case 2:
                pl4Var.f464690e = aVar2.k(intValue);
                return 0;
            case 3:
                pl4Var.f464691f = aVar2.k(intValue);
                return 0;
            case 4:
                pl4Var.f464692g = aVar2.k(intValue);
                return 0;
            case 5:
                pl4Var.f464693h = aVar2.g(intValue);
                return 0;
            case 6:
                pl4Var.f464694i = aVar2.k(intValue);
                return 0;
            case 7:
                pl4Var.f464695m = aVar2.g(intValue);
                return 0;
            case 8:
                pl4Var.f464696n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
