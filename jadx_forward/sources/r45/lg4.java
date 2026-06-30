package r45;

/* loaded from: classes2.dex */
public class lg4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460978d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460979e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460980f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460981g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460982h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460983i;

    /* renamed from: m, reason: collision with root package name */
    public int f460984m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f460985n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f460986o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f460987p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f460988q;

    /* renamed from: r, reason: collision with root package name */
    public r45.tg4 f460989r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lg4)) {
            return false;
        }
        r45.lg4 lg4Var = (r45.lg4) fVar;
        return n51.f.a(this.f460978d, lg4Var.f460978d) && n51.f.a(this.f460979e, lg4Var.f460979e) && n51.f.a(this.f460980f, lg4Var.f460980f) && n51.f.a(this.f460981g, lg4Var.f460981g) && n51.f.a(this.f460982h, lg4Var.f460982h) && n51.f.a(this.f460983i, lg4Var.f460983i) && n51.f.a(java.lang.Integer.valueOf(this.f460984m), java.lang.Integer.valueOf(lg4Var.f460984m)) && n51.f.a(this.f460985n, lg4Var.f460985n) && n51.f.a(this.f460986o, lg4Var.f460986o) && n51.f.a(this.f460987p, lg4Var.f460987p) && n51.f.a(this.f460988q, lg4Var.f460988q) && n51.f.a(this.f460989r, lg4Var.f460989r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460978d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f460979e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f460980f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f460981g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f460982h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f460983i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(10, this.f460984m);
            java.lang.String str7 = this.f460985n;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f460986o;
            if (str8 != null) {
                fVar.j(7, str8);
            }
            java.lang.String str9 = this.f460987p;
            if (str9 != null) {
                fVar.j(8, str9);
            }
            java.lang.String str10 = this.f460988q;
            if (str10 != null) {
                fVar.j(9, str10);
            }
            r45.tg4 tg4Var = this.f460989r;
            if (tg4Var != null) {
                fVar.i(12, tg4Var.mo75928xcd1e8d8());
                this.f460989r.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f460978d;
            int j17 = str11 != null ? 0 + b36.f.j(1, str11) : 0;
            java.lang.String str12 = this.f460979e;
            if (str12 != null) {
                j17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f460980f;
            if (str13 != null) {
                j17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f460981g;
            if (str14 != null) {
                j17 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f460982h;
            if (str15 != null) {
                j17 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f460983i;
            if (str16 != null) {
                j17 += b36.f.j(6, str16);
            }
            int e17 = j17 + b36.f.e(10, this.f460984m);
            java.lang.String str17 = this.f460985n;
            if (str17 != null) {
                e17 += b36.f.j(11, str17);
            }
            java.lang.String str18 = this.f460986o;
            if (str18 != null) {
                e17 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f460987p;
            if (str19 != null) {
                e17 += b36.f.j(8, str19);
            }
            java.lang.String str20 = this.f460988q;
            if (str20 != null) {
                e17 += b36.f.j(9, str20);
            }
            r45.tg4 tg4Var2 = this.f460989r;
            return tg4Var2 != null ? e17 + b36.f.i(12, tg4Var2.mo75928xcd1e8d8()) : e17;
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
        r45.lg4 lg4Var = (r45.lg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lg4Var.f460978d = aVar2.k(intValue);
                return 0;
            case 2:
                lg4Var.f460979e = aVar2.k(intValue);
                return 0;
            case 3:
                lg4Var.f460980f = aVar2.k(intValue);
                return 0;
            case 4:
                lg4Var.f460981g = aVar2.k(intValue);
                return 0;
            case 5:
                lg4Var.f460982h = aVar2.k(intValue);
                return 0;
            case 6:
                lg4Var.f460983i = aVar2.k(intValue);
                return 0;
            case 7:
                lg4Var.f460986o = aVar2.k(intValue);
                return 0;
            case 8:
                lg4Var.f460987p = aVar2.k(intValue);
                return 0;
            case 9:
                lg4Var.f460988q = aVar2.k(intValue);
                return 0;
            case 10:
                lg4Var.f460984m = aVar2.g(intValue);
                return 0;
            case 11:
                lg4Var.f460985n = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.tg4 tg4Var3 = new r45.tg4();
                    if (bArr != null && bArr.length > 0) {
                        tg4Var3.mo11468x92b714fd(bArr);
                    }
                    lg4Var.f460989r = tg4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
