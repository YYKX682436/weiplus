package r45;

/* loaded from: classes4.dex */
public class n2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f462532d;

    /* renamed from: e, reason: collision with root package name */
    public int f462533e;

    /* renamed from: f, reason: collision with root package name */
    public int f462534f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f462535g;

    /* renamed from: h, reason: collision with root package name */
    public int f462536h;

    /* renamed from: i, reason: collision with root package name */
    public int f462537i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462538m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f462539n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f462540o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f462541p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f462542q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f462543r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f462544s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f462545t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n2)) {
            return false;
        }
        r45.n2 n2Var = (r45.n2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462532d), java.lang.Integer.valueOf(n2Var.f462532d)) && n51.f.a(java.lang.Integer.valueOf(this.f462533e), java.lang.Integer.valueOf(n2Var.f462533e)) && n51.f.a(java.lang.Integer.valueOf(this.f462534f), java.lang.Integer.valueOf(n2Var.f462534f)) && n51.f.a(this.f462535g, n2Var.f462535g) && n51.f.a(java.lang.Integer.valueOf(this.f462536h), java.lang.Integer.valueOf(n2Var.f462536h)) && n51.f.a(java.lang.Integer.valueOf(this.f462537i), java.lang.Integer.valueOf(n2Var.f462537i)) && n51.f.a(this.f462538m, n2Var.f462538m) && n51.f.a(this.f462539n, n2Var.f462539n) && n51.f.a(this.f462540o, n2Var.f462540o) && n51.f.a(this.f462541p, n2Var.f462541p) && n51.f.a(this.f462542q, n2Var.f462542q) && n51.f.a(this.f462543r, n2Var.f462543r) && n51.f.a(this.f462544s, n2Var.f462544s) && n51.f.a(this.f462545t, n2Var.f462545t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462532d);
            fVar.e(2, this.f462533e);
            fVar.e(3, this.f462534f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f462535g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f462536h);
            fVar.e(6, this.f462537i);
            java.lang.String str = this.f462538m;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f462539n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f462540o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f462541p;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            java.lang.String str5 = this.f462542q;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f462543r;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f462544s;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f462545t;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462532d) + 0 + b36.f.e(2, this.f462533e) + b36.f.e(3, this.f462534f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f462535g;
            if (gVar2 != null) {
                e17 += b36.f.b(4, gVar2);
            }
            int e18 = e17 + b36.f.e(5, this.f462536h) + b36.f.e(6, this.f462537i);
            java.lang.String str9 = this.f462538m;
            if (str9 != null) {
                e18 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f462539n;
            if (str10 != null) {
                e18 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f462540o;
            if (str11 != null) {
                e18 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f462541p;
            if (str12 != null) {
                e18 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f462542q;
            if (str13 != null) {
                e18 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f462543r;
            if (str14 != null) {
                e18 += b36.f.j(12, str14);
            }
            java.lang.String str15 = this.f462544s;
            if (str15 != null) {
                e18 += b36.f.j(13, str15);
            }
            java.lang.String str16 = this.f462545t;
            return str16 != null ? e18 + b36.f.j(14, str16) : e18;
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
        r45.n2 n2Var = (r45.n2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n2Var.f462532d = aVar2.g(intValue);
                return 0;
            case 2:
                n2Var.f462533e = aVar2.g(intValue);
                return 0;
            case 3:
                n2Var.f462534f = aVar2.g(intValue);
                return 0;
            case 4:
                n2Var.f462535g = aVar2.d(intValue);
                return 0;
            case 5:
                n2Var.f462536h = aVar2.g(intValue);
                return 0;
            case 6:
                n2Var.f462537i = aVar2.g(intValue);
                return 0;
            case 7:
                n2Var.f462538m = aVar2.k(intValue);
                return 0;
            case 8:
                n2Var.f462539n = aVar2.k(intValue);
                return 0;
            case 9:
                n2Var.f462540o = aVar2.k(intValue);
                return 0;
            case 10:
                n2Var.f462541p = aVar2.k(intValue);
                return 0;
            case 11:
                n2Var.f462542q = aVar2.k(intValue);
                return 0;
            case 12:
                n2Var.f462543r = aVar2.k(intValue);
                return 0;
            case 13:
                n2Var.f462544s = aVar2.k(intValue);
                return 0;
            case 14:
                n2Var.f462545t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
