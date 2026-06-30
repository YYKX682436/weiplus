package r45;

/* loaded from: classes9.dex */
public class xo extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f471809d;

    /* renamed from: e, reason: collision with root package name */
    public int f471810e;

    /* renamed from: f, reason: collision with root package name */
    public int f471811f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471812g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471813h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471814i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f471815m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f471816n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f471817o;

    /* renamed from: p, reason: collision with root package name */
    public int f471818p;

    /* renamed from: q, reason: collision with root package name */
    public int f471819q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.LinkedList f471820r = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xo)) {
            return false;
        }
        r45.xo xoVar = (r45.xo) fVar;
        return n51.f.a(this.f76494x2de60e5e, xoVar.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f471809d), java.lang.Integer.valueOf(xoVar.f471809d)) && n51.f.a(java.lang.Integer.valueOf(this.f471810e), java.lang.Integer.valueOf(xoVar.f471810e)) && n51.f.a(java.lang.Integer.valueOf(this.f471811f), java.lang.Integer.valueOf(xoVar.f471811f)) && n51.f.a(this.f471812g, xoVar.f471812g) && n51.f.a(this.f471813h, xoVar.f471813h) && n51.f.a(this.f471814i, xoVar.f471814i) && n51.f.a(this.f471815m, xoVar.f471815m) && n51.f.a(this.f471816n, xoVar.f471816n) && n51.f.a(this.f471817o, xoVar.f471817o) && n51.f.a(java.lang.Integer.valueOf(this.f471818p), java.lang.Integer.valueOf(xoVar.f471818p)) && n51.f.a(java.lang.Integer.valueOf(this.f471819q), java.lang.Integer.valueOf(xoVar.f471819q)) && n51.f.a(this.f471820r, xoVar.f471820r);
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
            fVar.e(2, this.f471809d);
            fVar.e(3, this.f471810e);
            fVar.e(4, this.f471811f);
            java.lang.String str = this.f471812g;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f471813h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f471814i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f471815m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f471816n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f471817o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            fVar.e(11, this.f471818p);
            fVar.e(12, this.f471819q);
            fVar.g(13, 8, this.f471820r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f471809d) + b36.f.e(3, this.f471810e) + b36.f.e(4, this.f471811f);
            java.lang.String str7 = this.f471812g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f471813h;
            if (str8 != null) {
                i18 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f471814i;
            if (str9 != null) {
                i18 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f471815m;
            if (str10 != null) {
                i18 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f471816n;
            if (str11 != null) {
                i18 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f471817o;
            if (str12 != null) {
                i18 += b36.f.j(10, str12);
            }
            return i18 + b36.f.e(11, this.f471818p) + b36.f.e(12, this.f471819q) + b36.f.g(13, 8, this.f471820r);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f471820r.clear();
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
        r45.xo xoVar = (r45.xo) objArr[1];
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
                    xoVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                xoVar.f471809d = aVar2.g(intValue);
                return 0;
            case 3:
                xoVar.f471810e = aVar2.g(intValue);
                return 0;
            case 4:
                xoVar.f471811f = aVar2.g(intValue);
                return 0;
            case 5:
                xoVar.f471812g = aVar2.k(intValue);
                return 0;
            case 6:
                xoVar.f471813h = aVar2.k(intValue);
                return 0;
            case 7:
                xoVar.f471814i = aVar2.k(intValue);
                return 0;
            case 8:
                xoVar.f471815m = aVar2.k(intValue);
                return 0;
            case 9:
                xoVar.f471816n = aVar2.k(intValue);
                return 0;
            case 10:
                xoVar.f471817o = aVar2.k(intValue);
                return 0;
            case 11:
                xoVar.f471818p = aVar2.g(intValue);
                return 0;
            case 12:
                xoVar.f471819q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ln0 ln0Var = new r45.ln0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ln0Var.mo11468x92b714fd(bArr3);
                    }
                    xoVar.f471820r.add(ln0Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
