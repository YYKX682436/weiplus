package r45;

/* loaded from: classes2.dex */
public class x65 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471350d;

    /* renamed from: e, reason: collision with root package name */
    public int f471351e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f471352f;

    /* renamed from: g, reason: collision with root package name */
    public int f471353g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471354h;

    /* renamed from: i, reason: collision with root package name */
    public int f471355i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f471356m;

    /* renamed from: n, reason: collision with root package name */
    public int f471357n;

    /* renamed from: o, reason: collision with root package name */
    public int f471358o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f471359p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f471360q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f471361r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f471362s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f471363t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f471364u;

    /* renamed from: v, reason: collision with root package name */
    public int f471365v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f471366w = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x65)) {
            return false;
        }
        r45.x65 x65Var = (r45.x65) fVar;
        return n51.f.a(this.f471350d, x65Var.f471350d) && n51.f.a(java.lang.Integer.valueOf(this.f471351e), java.lang.Integer.valueOf(x65Var.f471351e)) && n51.f.a(this.f471352f, x65Var.f471352f) && n51.f.a(java.lang.Integer.valueOf(this.f471353g), java.lang.Integer.valueOf(x65Var.f471353g)) && n51.f.a(this.f471354h, x65Var.f471354h) && n51.f.a(java.lang.Integer.valueOf(this.f471355i), java.lang.Integer.valueOf(x65Var.f471355i)) && n51.f.a(this.f471356m, x65Var.f471356m) && n51.f.a(java.lang.Integer.valueOf(this.f471357n), java.lang.Integer.valueOf(x65Var.f471357n)) && n51.f.a(java.lang.Integer.valueOf(this.f471358o), java.lang.Integer.valueOf(x65Var.f471358o)) && n51.f.a(this.f471359p, x65Var.f471359p) && n51.f.a(this.f471360q, x65Var.f471360q) && n51.f.a(this.f471361r, x65Var.f471361r) && n51.f.a(this.f471362s, x65Var.f471362s) && n51.f.a(this.f471363t, x65Var.f471363t) && n51.f.a(this.f471364u, x65Var.f471364u) && n51.f.a(java.lang.Integer.valueOf(this.f471365v), java.lang.Integer.valueOf(x65Var.f471365v)) && n51.f.a(this.f471366w, x65Var.f471366w);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f471366w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471350d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f471351e);
            java.lang.String str2 = this.f471352f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f471353g);
            java.lang.String str3 = this.f471354h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f471355i);
            java.lang.String str4 = this.f471356m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f471357n);
            fVar.e(9, this.f471358o);
            java.lang.String str5 = this.f471359p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f471360q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f471361r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            java.lang.String str8 = this.f471362s;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            java.lang.String str9 = this.f471363t;
            if (str9 != null) {
                fVar.j(14, str9);
            }
            java.lang.String str10 = this.f471364u;
            if (str10 != null) {
                fVar.j(15, str10);
            }
            fVar.e(16, this.f471365v);
            fVar.g(17, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f471350d;
            int j17 = (str11 != null ? b36.f.j(1, str11) + 0 : 0) + b36.f.e(2, this.f471351e);
            java.lang.String str12 = this.f471352f;
            if (str12 != null) {
                j17 += b36.f.j(3, str12);
            }
            int e17 = j17 + b36.f.e(4, this.f471353g);
            java.lang.String str13 = this.f471354h;
            if (str13 != null) {
                e17 += b36.f.j(5, str13);
            }
            int e18 = e17 + b36.f.e(6, this.f471355i);
            java.lang.String str14 = this.f471356m;
            if (str14 != null) {
                e18 += b36.f.j(7, str14);
            }
            int e19 = e18 + b36.f.e(8, this.f471357n) + b36.f.e(9, this.f471358o);
            java.lang.String str15 = this.f471359p;
            if (str15 != null) {
                e19 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f471360q;
            if (str16 != null) {
                e19 += b36.f.j(11, str16);
            }
            java.lang.String str17 = this.f471361r;
            if (str17 != null) {
                e19 += b36.f.j(12, str17);
            }
            java.lang.String str18 = this.f471362s;
            if (str18 != null) {
                e19 += b36.f.j(13, str18);
            }
            java.lang.String str19 = this.f471363t;
            if (str19 != null) {
                e19 += b36.f.j(14, str19);
            }
            java.lang.String str20 = this.f471364u;
            if (str20 != null) {
                e19 += b36.f.j(15, str20);
            }
            return e19 + b36.f.e(16, this.f471365v) + b36.f.g(17, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.x65 x65Var = (r45.x65) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x65Var.f471350d = aVar2.k(intValue);
                return 0;
            case 2:
                x65Var.f471351e = aVar2.g(intValue);
                return 0;
            case 3:
                x65Var.f471352f = aVar2.k(intValue);
                return 0;
            case 4:
                x65Var.f471353g = aVar2.g(intValue);
                return 0;
            case 5:
                x65Var.f471354h = aVar2.k(intValue);
                return 0;
            case 6:
                x65Var.f471355i = aVar2.g(intValue);
                return 0;
            case 7:
                x65Var.f471356m = aVar2.k(intValue);
                return 0;
            case 8:
                x65Var.f471357n = aVar2.g(intValue);
                return 0;
            case 9:
                x65Var.f471358o = aVar2.g(intValue);
                return 0;
            case 10:
                x65Var.f471359p = aVar2.k(intValue);
                return 0;
            case 11:
                x65Var.f471360q = aVar2.k(intValue);
                return 0;
            case 12:
                x65Var.f471361r = aVar2.k(intValue);
                return 0;
            case 13:
                x65Var.f471362s = aVar2.k(intValue);
                return 0;
            case 14:
                x65Var.f471363t = aVar2.k(intValue);
                return 0;
            case 15:
                x65Var.f471364u = aVar2.k(intValue);
                return 0;
            case 16:
                x65Var.f471365v = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.j66 j66Var = new r45.j66();
                    if (bArr2 != null && bArr2.length > 0) {
                        j66Var.mo11468x92b714fd(bArr2);
                    }
                    x65Var.f471366w.add(j66Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
