package r45;

/* loaded from: classes15.dex */
public class nd5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f462812d;

    /* renamed from: f, reason: collision with root package name */
    public int f462814f;

    /* renamed from: g, reason: collision with root package name */
    public int f462815g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462816h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462817i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462818m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f462819n;

    /* renamed from: o, reason: collision with root package name */
    public int f462820o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f462821p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f462822q;

    /* renamed from: r, reason: collision with root package name */
    public int f462823r;

    /* renamed from: s, reason: collision with root package name */
    public int f462824s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f462825t;

    /* renamed from: u, reason: collision with root package name */
    public int f462826u;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f462813e = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f462827v = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nd5)) {
            return false;
        }
        r45.nd5 nd5Var = (r45.nd5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462812d), java.lang.Integer.valueOf(nd5Var.f462812d)) && n51.f.a(this.f462813e, nd5Var.f462813e) && n51.f.a(java.lang.Integer.valueOf(this.f462814f), java.lang.Integer.valueOf(nd5Var.f462814f)) && n51.f.a(java.lang.Integer.valueOf(this.f462815g), java.lang.Integer.valueOf(nd5Var.f462815g)) && n51.f.a(this.f462816h, nd5Var.f462816h) && n51.f.a(this.f462817i, nd5Var.f462817i) && n51.f.a(this.f462818m, nd5Var.f462818m) && n51.f.a(this.f462819n, nd5Var.f462819n) && n51.f.a(java.lang.Integer.valueOf(this.f462820o), java.lang.Integer.valueOf(nd5Var.f462820o)) && n51.f.a(this.f462821p, nd5Var.f462821p) && n51.f.a(this.f462822q, nd5Var.f462822q) && n51.f.a(java.lang.Integer.valueOf(this.f462823r), java.lang.Integer.valueOf(nd5Var.f462823r)) && n51.f.a(java.lang.Integer.valueOf(this.f462824s), java.lang.Integer.valueOf(nd5Var.f462824s)) && n51.f.a(this.f462825t, nd5Var.f462825t) && n51.f.a(java.lang.Integer.valueOf(this.f462826u), java.lang.Integer.valueOf(nd5Var.f462826u)) && n51.f.a(this.f462827v, nd5Var.f462827v);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462812d);
            fVar.g(2, 8, this.f462813e);
            fVar.e(3, this.f462814f);
            fVar.e(4, this.f462815g);
            java.lang.String str = this.f462816h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f462817i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f462818m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f462819n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f462820o);
            java.lang.String str5 = this.f462821p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f462822q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.e(12, this.f462823r);
            fVar.e(13, this.f462824s);
            java.lang.String str7 = this.f462825t;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            fVar.e(15, this.f462826u);
            fVar.g(16, 8, this.f462827v);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462812d) + 0 + b36.f.g(2, 8, this.f462813e) + b36.f.e(3, this.f462814f) + b36.f.e(4, this.f462815g);
            java.lang.String str8 = this.f462816h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f462817i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f462818m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f462819n;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            int e18 = e17 + b36.f.e(9, this.f462820o);
            java.lang.String str12 = this.f462821p;
            if (str12 != null) {
                e18 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f462822q;
            if (str13 != null) {
                e18 += b36.f.j(11, str13);
            }
            int e19 = e18 + b36.f.e(12, this.f462823r) + b36.f.e(13, this.f462824s);
            java.lang.String str14 = this.f462825t;
            if (str14 != null) {
                e19 += b36.f.j(14, str14);
            }
            return e19 + b36.f.e(15, this.f462826u) + b36.f.g(16, 8, this.f462827v);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f462813e.clear();
            this.f462827v.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.nd5 nd5Var = (r45.nd5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nd5Var.f462812d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.c44 c44Var = new r45.c44();
                    if (bArr2 != null && bArr2.length > 0) {
                        c44Var.mo11468x92b714fd(bArr2);
                    }
                    nd5Var.f462813e.add(c44Var);
                }
                return 0;
            case 3:
                nd5Var.f462814f = aVar2.g(intValue);
                return 0;
            case 4:
                nd5Var.f462815g = aVar2.g(intValue);
                return 0;
            case 5:
                nd5Var.f462816h = aVar2.k(intValue);
                return 0;
            case 6:
                nd5Var.f462817i = aVar2.k(intValue);
                return 0;
            case 7:
                nd5Var.f462818m = aVar2.k(intValue);
                return 0;
            case 8:
                nd5Var.f462819n = aVar2.k(intValue);
                return 0;
            case 9:
                nd5Var.f462820o = aVar2.g(intValue);
                return 0;
            case 10:
                nd5Var.f462821p = aVar2.k(intValue);
                return 0;
            case 11:
                nd5Var.f462822q = aVar2.k(intValue);
                return 0;
            case 12:
                nd5Var.f462823r = aVar2.g(intValue);
                return 0;
            case 13:
                nd5Var.f462824s = aVar2.g(intValue);
                return 0;
            case 14:
                nd5Var.f462825t = aVar2.k(intValue);
                return 0;
            case 15:
                nd5Var.f462826u = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.we0 we0Var = new r45.we0();
                    if (bArr3 != null && bArr3.length > 0) {
                        we0Var.mo11468x92b714fd(bArr3);
                    }
                    nd5Var.f462827v.add(we0Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
