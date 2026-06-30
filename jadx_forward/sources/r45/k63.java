package r45;

/* loaded from: classes8.dex */
public class k63 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459958d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459959e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f459960f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459961g;

    /* renamed from: h, reason: collision with root package name */
    public int f459962h;

    /* renamed from: i, reason: collision with root package name */
    public int f459963i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f459964m;

    /* renamed from: n, reason: collision with root package name */
    public int f459965n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f459966o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k63)) {
            return false;
        }
        r45.k63 k63Var = (r45.k63) fVar;
        return n51.f.a(this.f459958d, k63Var.f459958d) && n51.f.a(this.f459959e, k63Var.f459959e) && n51.f.a(this.f459960f, k63Var.f459960f) && n51.f.a(this.f459961g, k63Var.f459961g) && n51.f.a(java.lang.Integer.valueOf(this.f459962h), java.lang.Integer.valueOf(k63Var.f459962h)) && n51.f.a(java.lang.Integer.valueOf(this.f459963i), java.lang.Integer.valueOf(k63Var.f459963i)) && n51.f.a(this.f459964m, k63Var.f459964m) && n51.f.a(java.lang.Integer.valueOf(this.f459965n), java.lang.Integer.valueOf(k63Var.f459965n)) && n51.f.a(this.f459966o, k63Var.f459966o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459958d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f459959e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f459960f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f459961g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f459962h);
            fVar.e(6, this.f459963i);
            java.lang.String str5 = this.f459964m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f459965n);
            java.lang.String str6 = this.f459966o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f459958d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f459959e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f459960f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f459961g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            int e17 = j17 + b36.f.e(5, this.f459962h) + b36.f.e(6, this.f459963i);
            java.lang.String str11 = this.f459964m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            int e18 = e17 + b36.f.e(8, this.f459965n);
            java.lang.String str12 = this.f459966o;
            return str12 != null ? e18 + b36.f.j(9, str12) : e18;
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
        r45.k63 k63Var = (r45.k63) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k63Var.f459958d = aVar2.k(intValue);
                return 0;
            case 2:
                k63Var.f459959e = aVar2.k(intValue);
                return 0;
            case 3:
                k63Var.f459960f = aVar2.k(intValue);
                return 0;
            case 4:
                k63Var.f459961g = aVar2.k(intValue);
                return 0;
            case 5:
                k63Var.f459962h = aVar2.g(intValue);
                return 0;
            case 6:
                k63Var.f459963i = aVar2.g(intValue);
                return 0;
            case 7:
                k63Var.f459964m = aVar2.k(intValue);
                return 0;
            case 8:
                k63Var.f459965n = aVar2.g(intValue);
                return 0;
            case 9:
                k63Var.f459966o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
