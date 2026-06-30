package r45;

/* loaded from: classes9.dex */
public class l64 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460703d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460704e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460705f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460706g;

    /* renamed from: h, reason: collision with root package name */
    public r45.fv6 f460707h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460708i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f460709m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f460710n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f460711o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l64)) {
            return false;
        }
        r45.l64 l64Var = (r45.l64) fVar;
        return n51.f.a(this.f460703d, l64Var.f460703d) && n51.f.a(this.f460704e, l64Var.f460704e) && n51.f.a(this.f460705f, l64Var.f460705f) && n51.f.a(this.f460706g, l64Var.f460706g) && n51.f.a(this.f460707h, l64Var.f460707h) && n51.f.a(this.f460708i, l64Var.f460708i) && n51.f.a(this.f460709m, l64Var.f460709m) && n51.f.a(this.f460710n, l64Var.f460710n) && n51.f.a(this.f460711o, l64Var.f460711o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460703d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f460704e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f460705f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f460706g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            r45.fv6 fv6Var = this.f460707h;
            if (fv6Var != null) {
                fVar.i(5, fv6Var.mo75928xcd1e8d8());
                this.f460707h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f460708i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f460709m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f460710n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f460711o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f460703d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f460704e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f460705f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f460706g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            r45.fv6 fv6Var2 = this.f460707h;
            if (fv6Var2 != null) {
                j17 += b36.f.i(5, fv6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str13 = this.f460708i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f460709m;
            if (str14 != null) {
                j17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f460710n;
            if (str15 != null) {
                j17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f460711o;
            return str16 != null ? j17 + b36.f.j(9, str16) : j17;
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
        r45.l64 l64Var = (r45.l64) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l64Var.f460703d = aVar2.k(intValue);
                return 0;
            case 2:
                l64Var.f460704e = aVar2.k(intValue);
                return 0;
            case 3:
                l64Var.f460705f = aVar2.k(intValue);
                return 0;
            case 4:
                l64Var.f460706g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.fv6 fv6Var3 = new r45.fv6();
                    if (bArr != null && bArr.length > 0) {
                        fv6Var3.mo11468x92b714fd(bArr);
                    }
                    l64Var.f460707h = fv6Var3;
                }
                return 0;
            case 6:
                l64Var.f460708i = aVar2.k(intValue);
                return 0;
            case 7:
                l64Var.f460709m = aVar2.k(intValue);
                return 0;
            case 8:
                l64Var.f460710n = aVar2.k(intValue);
                return 0;
            case 9:
                l64Var.f460711o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
