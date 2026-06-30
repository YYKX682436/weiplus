package r45;

/* loaded from: classes9.dex */
public class jw extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f459675d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459676e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f459677f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459678g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459679h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f459680i;

    /* renamed from: m, reason: collision with root package name */
    public int f459681m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f459682n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f459683o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f459684p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f459685q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f459686r;

    /* renamed from: s, reason: collision with root package name */
    public int f459687s;

    /* renamed from: t, reason: collision with root package name */
    public int f459688t;

    /* renamed from: u, reason: collision with root package name */
    public r45.lj5 f459689u;

    /* renamed from: v, reason: collision with root package name */
    public r45.tw4 f459690v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f459691w;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jw)) {
            return false;
        }
        r45.jw jwVar = (r45.jw) fVar;
        return n51.f.a(this.f76492x92037252, jwVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f459675d), java.lang.Integer.valueOf(jwVar.f459675d)) && n51.f.a(this.f459676e, jwVar.f459676e) && n51.f.a(java.lang.Boolean.valueOf(this.f459677f), java.lang.Boolean.valueOf(jwVar.f459677f)) && n51.f.a(this.f459678g, jwVar.f459678g) && n51.f.a(this.f459679h, jwVar.f459679h) && n51.f.a(this.f459680i, jwVar.f459680i) && n51.f.a(java.lang.Integer.valueOf(this.f459681m), java.lang.Integer.valueOf(jwVar.f459681m)) && n51.f.a(this.f459682n, jwVar.f459682n) && n51.f.a(this.f459683o, jwVar.f459683o) && n51.f.a(this.f459684p, jwVar.f459684p) && n51.f.a(this.f459685q, jwVar.f459685q) && n51.f.a(this.f459686r, jwVar.f459686r) && n51.f.a(java.lang.Integer.valueOf(this.f459687s), java.lang.Integer.valueOf(jwVar.f459687s)) && n51.f.a(java.lang.Integer.valueOf(this.f459688t), java.lang.Integer.valueOf(jwVar.f459688t)) && n51.f.a(this.f459689u, jwVar.f459689u) && n51.f.a(this.f459690v, jwVar.f459690v) && n51.f.a(this.f459691w, jwVar.f459691w);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f459684p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f459675d);
            java.lang.String str = this.f459676e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.a(4, this.f459677f);
            java.lang.String str2 = this.f459678g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f459679h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f459680i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f459681m);
            java.lang.String str5 = this.f459682n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f459683o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            fVar.g(11, 2, linkedList);
            java.lang.String str7 = this.f459685q;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            java.lang.String str8 = this.f459686r;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            fVar.e(14, this.f459687s);
            fVar.e(15, this.f459688t);
            r45.lj5 lj5Var = this.f459689u;
            if (lj5Var != null) {
                fVar.i(16, lj5Var.mo75928xcd1e8d8());
                this.f459689u.mo75956x3d5d1f78(fVar);
            }
            r45.tw4 tw4Var = this.f459690v;
            if (tw4Var != null) {
                fVar.i(17, tw4Var.mo75928xcd1e8d8());
                this.f459690v.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str9 = this.f459691w;
            if (str9 != null) {
                fVar.j(18, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f459675d);
            java.lang.String str10 = this.f459676e;
            if (str10 != null) {
                i18 += b36.f.j(3, str10);
            }
            int a17 = i18 + b36.f.a(4, this.f459677f);
            java.lang.String str11 = this.f459678g;
            if (str11 != null) {
                a17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f459679h;
            if (str12 != null) {
                a17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f459680i;
            if (str13 != null) {
                a17 += b36.f.j(7, str13);
            }
            int e17 = a17 + b36.f.e(8, this.f459681m);
            java.lang.String str14 = this.f459682n;
            if (str14 != null) {
                e17 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f459683o;
            if (str15 != null) {
                e17 += b36.f.j(10, str15);
            }
            int g17 = e17 + b36.f.g(11, 2, linkedList);
            java.lang.String str16 = this.f459685q;
            if (str16 != null) {
                g17 += b36.f.j(12, str16);
            }
            java.lang.String str17 = this.f459686r;
            if (str17 != null) {
                g17 += b36.f.j(13, str17);
            }
            int e18 = g17 + b36.f.e(14, this.f459687s) + b36.f.e(15, this.f459688t);
            r45.lj5 lj5Var2 = this.f459689u;
            if (lj5Var2 != null) {
                e18 += b36.f.i(16, lj5Var2.mo75928xcd1e8d8());
            }
            r45.tw4 tw4Var2 = this.f459690v;
            if (tw4Var2 != null) {
                e18 += b36.f.i(17, tw4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str18 = this.f459691w;
            return str18 != null ? e18 + b36.f.j(18, str18) : e18;
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
        r45.jw jwVar = (r45.jw) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    jwVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                jwVar.f459675d = aVar2.g(intValue);
                return 0;
            case 3:
                jwVar.f459676e = aVar2.k(intValue);
                return 0;
            case 4:
                jwVar.f459677f = aVar2.c(intValue);
                return 0;
            case 5:
                jwVar.f459678g = aVar2.k(intValue);
                return 0;
            case 6:
                jwVar.f459679h = aVar2.k(intValue);
                return 0;
            case 7:
                jwVar.f459680i = aVar2.k(intValue);
                return 0;
            case 8:
                jwVar.f459681m = aVar2.g(intValue);
                return 0;
            case 9:
                jwVar.f459682n = aVar2.k(intValue);
                return 0;
            case 10:
                jwVar.f459683o = aVar2.k(intValue);
                return 0;
            case 11:
                jwVar.f459684p.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 12:
                jwVar.f459685q = aVar2.k(intValue);
                return 0;
            case 13:
                jwVar.f459686r = aVar2.k(intValue);
                return 0;
            case 14:
                jwVar.f459687s = aVar2.g(intValue);
                return 0;
            case 15:
                jwVar.f459688t = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.lj5 lj5Var3 = new r45.lj5();
                    if (bArr3 != null && bArr3.length > 0) {
                        lj5Var3.mo11468x92b714fd(bArr3);
                    }
                    jwVar.f459689u = lj5Var3;
                }
                return 0;
            case 17:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr4 != null && bArr4.length > 0) {
                        tw4Var3.mo11468x92b714fd(bArr4);
                    }
                    jwVar.f459690v = tw4Var3;
                }
                return 0;
            case 18:
                jwVar.f459691w = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
