package r45;

/* loaded from: classes4.dex */
public class lv6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461393d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461394e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461395f;

    /* renamed from: g, reason: collision with root package name */
    public int f461396g;

    /* renamed from: h, reason: collision with root package name */
    public int f461397h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461398i;

    /* renamed from: m, reason: collision with root package name */
    public int f461399m;

    /* renamed from: n, reason: collision with root package name */
    public int f461400n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lv6)) {
            return false;
        }
        r45.lv6 lv6Var = (r45.lv6) fVar;
        return n51.f.a(this.f461393d, lv6Var.f461393d) && n51.f.a(this.f461394e, lv6Var.f461394e) && n51.f.a(this.f461395f, lv6Var.f461395f) && n51.f.a(java.lang.Integer.valueOf(this.f461396g), java.lang.Integer.valueOf(lv6Var.f461396g)) && n51.f.a(java.lang.Integer.valueOf(this.f461397h), java.lang.Integer.valueOf(lv6Var.f461397h)) && n51.f.a(this.f461398i, lv6Var.f461398i) && n51.f.a(java.lang.Integer.valueOf(this.f461399m), java.lang.Integer.valueOf(lv6Var.f461399m)) && n51.f.a(java.lang.Integer.valueOf(this.f461400n), java.lang.Integer.valueOf(lv6Var.f461400n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461393d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f461394e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f461395f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f461396g);
            fVar.e(5, this.f461397h);
            java.lang.String str4 = this.f461398i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f461399m);
            fVar.e(8, this.f461400n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f461393d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f461394e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f461395f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f461396g) + b36.f.e(5, this.f461397h);
            java.lang.String str8 = this.f461398i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            return e17 + b36.f.e(7, this.f461399m) + b36.f.e(8, this.f461400n);
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
        r45.lv6 lv6Var = (r45.lv6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lv6Var.f461393d = aVar2.k(intValue);
                return 0;
            case 2:
                lv6Var.f461394e = aVar2.k(intValue);
                return 0;
            case 3:
                lv6Var.f461395f = aVar2.k(intValue);
                return 0;
            case 4:
                lv6Var.f461396g = aVar2.g(intValue);
                return 0;
            case 5:
                lv6Var.f461397h = aVar2.g(intValue);
                return 0;
            case 6:
                lv6Var.f461398i = aVar2.k(intValue);
                return 0;
            case 7:
                lv6Var.f461399m = aVar2.g(intValue);
                return 0;
            case 8:
                lv6Var.f461400n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
