package r45;

/* loaded from: classes8.dex */
public class x14 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471183d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471184e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471186g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471187h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471188i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f471189m;

    /* renamed from: n, reason: collision with root package name */
    public int f471190n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f471191o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f471193q;

    /* renamed from: r, reason: collision with root package name */
    public int f471194r;

    /* renamed from: s, reason: collision with root package name */
    public int f471195s;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f471185f = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f471192p = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x14)) {
            return false;
        }
        r45.x14 x14Var = (r45.x14) fVar;
        return n51.f.a(this.f76494x2de60e5e, x14Var.f76494x2de60e5e) && n51.f.a(this.f471183d, x14Var.f471183d) && n51.f.a(this.f471184e, x14Var.f471184e) && n51.f.a(this.f471185f, x14Var.f471185f) && n51.f.a(this.f471186g, x14Var.f471186g) && n51.f.a(this.f471187h, x14Var.f471187h) && n51.f.a(this.f471188i, x14Var.f471188i) && n51.f.a(this.f471189m, x14Var.f471189m) && n51.f.a(java.lang.Integer.valueOf(this.f471190n), java.lang.Integer.valueOf(x14Var.f471190n)) && n51.f.a(this.f471191o, x14Var.f471191o) && n51.f.a(this.f471192p, x14Var.f471192p) && n51.f.a(this.f471193q, x14Var.f471193q) && n51.f.a(java.lang.Integer.valueOf(this.f471194r), java.lang.Integer.valueOf(x14Var.f471194r)) && n51.f.a(java.lang.Integer.valueOf(this.f471195s), java.lang.Integer.valueOf(x14Var.f471195s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f471183d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f471184e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 1, this.f471185f);
            java.lang.String str3 = this.f471186g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f471187h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f471188i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f471189m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.e(9, this.f471190n);
            java.lang.String str7 = this.f471191o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            fVar.g(11, 1, this.f471192p);
            java.lang.String str8 = this.f471193q;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            fVar.e(13, this.f471194r);
            fVar.e(14, this.f471195s);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            java.lang.String str9 = this.f471183d;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f471184e;
            if (str10 != null) {
                i18 += b36.f.j(3, str10);
            }
            int g17 = i18 + b36.f.g(4, 1, this.f471185f);
            java.lang.String str11 = this.f471186g;
            if (str11 != null) {
                g17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f471187h;
            if (str12 != null) {
                g17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f471188i;
            if (str13 != null) {
                g17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f471189m;
            if (str14 != null) {
                g17 += b36.f.j(8, str14);
            }
            int e17 = g17 + b36.f.e(9, this.f471190n);
            java.lang.String str15 = this.f471191o;
            if (str15 != null) {
                e17 += b36.f.j(10, str15);
            }
            int g18 = e17 + b36.f.g(11, 1, this.f471192p);
            java.lang.String str16 = this.f471193q;
            if (str16 != null) {
                g18 += b36.f.j(12, str16);
            }
            return g18 + b36.f.e(13, this.f471194r) + b36.f.e(14, this.f471195s);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f471185f.clear();
            this.f471192p.clear();
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
        r45.x14 x14Var = (r45.x14) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    x14Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                x14Var.f471183d = aVar2.k(intValue);
                return 0;
            case 3:
                x14Var.f471184e = aVar2.k(intValue);
                return 0;
            case 4:
                x14Var.f471185f.add(aVar2.k(intValue));
                return 0;
            case 5:
                x14Var.f471186g = aVar2.k(intValue);
                return 0;
            case 6:
                x14Var.f471187h = aVar2.k(intValue);
                return 0;
            case 7:
                x14Var.f471188i = aVar2.k(intValue);
                return 0;
            case 8:
                x14Var.f471189m = aVar2.k(intValue);
                return 0;
            case 9:
                x14Var.f471190n = aVar2.g(intValue);
                return 0;
            case 10:
                x14Var.f471191o = aVar2.k(intValue);
                return 0;
            case 11:
                x14Var.f471192p.add(aVar2.k(intValue));
                return 0;
            case 12:
                x14Var.f471193q = aVar2.k(intValue);
                return 0;
            case 13:
                x14Var.f471194r = aVar2.g(intValue);
                return 0;
            case 14:
                x14Var.f471195s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
