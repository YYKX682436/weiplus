package r45;

/* loaded from: classes15.dex */
public class sf4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467206d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467207e;

    /* renamed from: f, reason: collision with root package name */
    public int f467208f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467209g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467210h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f467211i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f467212m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f467213n;

    /* renamed from: o, reason: collision with root package name */
    public int f467214o;

    /* renamed from: p, reason: collision with root package name */
    public int f467215p;

    /* renamed from: q, reason: collision with root package name */
    public r45.sx3 f467216q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sf4)) {
            return false;
        }
        r45.sf4 sf4Var = (r45.sf4) fVar;
        return n51.f.a(this.f467206d, sf4Var.f467206d) && n51.f.a(this.f467207e, sf4Var.f467207e) && n51.f.a(java.lang.Integer.valueOf(this.f467208f), java.lang.Integer.valueOf(sf4Var.f467208f)) && n51.f.a(this.f467209g, sf4Var.f467209g) && n51.f.a(this.f467210h, sf4Var.f467210h) && n51.f.a(this.f467211i, sf4Var.f467211i) && n51.f.a(this.f467212m, sf4Var.f467212m) && n51.f.a(this.f467213n, sf4Var.f467213n) && n51.f.a(java.lang.Integer.valueOf(this.f467214o), java.lang.Integer.valueOf(sf4Var.f467214o)) && n51.f.a(java.lang.Integer.valueOf(this.f467215p), java.lang.Integer.valueOf(sf4Var.f467215p)) && n51.f.a(this.f467216q, sf4Var.f467216q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467206d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f467207e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f467208f);
            java.lang.String str3 = this.f467209g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f467210h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f467211i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f467212m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f467213n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.e(9, this.f467214o);
            fVar.e(10, this.f467215p);
            r45.sx3 sx3Var = this.f467216q;
            if (sx3Var != null) {
                fVar.i(11, sx3Var.mo75928xcd1e8d8());
                this.f467216q.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f467206d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f467207e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int e17 = j17 + b36.f.e(3, this.f467208f);
            java.lang.String str10 = this.f467209g;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f467210h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f467211i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f467212m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f467213n;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            int e18 = e17 + b36.f.e(9, this.f467214o) + b36.f.e(10, this.f467215p);
            r45.sx3 sx3Var2 = this.f467216q;
            return sx3Var2 != null ? e18 + b36.f.i(11, sx3Var2.mo75928xcd1e8d8()) : e18;
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
        r45.sf4 sf4Var = (r45.sf4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                sf4Var.f467206d = aVar2.k(intValue);
                return 0;
            case 2:
                sf4Var.f467207e = aVar2.k(intValue);
                return 0;
            case 3:
                sf4Var.f467208f = aVar2.g(intValue);
                return 0;
            case 4:
                sf4Var.f467209g = aVar2.k(intValue);
                return 0;
            case 5:
                sf4Var.f467210h = aVar2.k(intValue);
                return 0;
            case 6:
                sf4Var.f467211i = aVar2.k(intValue);
                return 0;
            case 7:
                sf4Var.f467212m = aVar2.k(intValue);
                return 0;
            case 8:
                sf4Var.f467213n = aVar2.k(intValue);
                return 0;
            case 9:
                sf4Var.f467214o = aVar2.g(intValue);
                return 0;
            case 10:
                sf4Var.f467215p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.sx3 sx3Var3 = new r45.sx3();
                    if (bArr != null && bArr.length > 0) {
                        sx3Var3.mo11468x92b714fd(bArr);
                    }
                    sf4Var.f467216q = sx3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
