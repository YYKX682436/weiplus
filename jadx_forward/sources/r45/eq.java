package r45;

/* loaded from: classes8.dex */
public class eq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455194d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455195e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455196f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455197g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455198h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455199i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f455200m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f455201n;

    /* renamed from: o, reason: collision with root package name */
    public int f455202o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.eq)) {
            return false;
        }
        r45.eq eqVar = (r45.eq) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455194d), java.lang.Integer.valueOf(eqVar.f455194d)) && n51.f.a(this.f455195e, eqVar.f455195e) && n51.f.a(this.f455196f, eqVar.f455196f) && n51.f.a(this.f455197g, eqVar.f455197g) && n51.f.a(this.f455198h, eqVar.f455198h) && n51.f.a(this.f455199i, eqVar.f455199i) && n51.f.a(this.f455200m, eqVar.f455200m) && n51.f.a(this.f455201n, eqVar.f455201n) && n51.f.a(java.lang.Integer.valueOf(this.f455202o), java.lang.Integer.valueOf(eqVar.f455202o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455194d);
            java.lang.String str = this.f455195e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f455196f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f455197g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f455198h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f455199i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f455200m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f455201n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.e(9, this.f455202o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f455194d) + 0;
            java.lang.String str8 = this.f455195e;
            if (str8 != null) {
                e17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f455196f;
            if (str9 != null) {
                e17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f455197g;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f455198h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f455199i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f455200m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f455201n;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            return e17 + b36.f.e(9, this.f455202o);
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
        r45.eq eqVar = (r45.eq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                eqVar.f455194d = aVar2.g(intValue);
                return 0;
            case 2:
                eqVar.f455195e = aVar2.k(intValue);
                return 0;
            case 3:
                eqVar.f455196f = aVar2.k(intValue);
                return 0;
            case 4:
                eqVar.f455197g = aVar2.k(intValue);
                return 0;
            case 5:
                eqVar.f455198h = aVar2.k(intValue);
                return 0;
            case 6:
                eqVar.f455199i = aVar2.k(intValue);
                return 0;
            case 7:
                eqVar.f455200m = aVar2.k(intValue);
                return 0;
            case 8:
                eqVar.f455201n = aVar2.k(intValue);
                return 0;
            case 9:
                eqVar.f455202o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
