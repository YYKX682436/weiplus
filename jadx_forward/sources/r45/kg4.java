package r45;

/* loaded from: classes2.dex */
public class kg4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460212d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460213e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460214f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460215g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460216h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460217i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f460218m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f460219n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kg4)) {
            return false;
        }
        r45.kg4 kg4Var = (r45.kg4) fVar;
        return n51.f.a(this.f460212d, kg4Var.f460212d) && n51.f.a(this.f460213e, kg4Var.f460213e) && n51.f.a(this.f460214f, kg4Var.f460214f) && n51.f.a(this.f460215g, kg4Var.f460215g) && n51.f.a(this.f460216h, kg4Var.f460216h) && n51.f.a(this.f460217i, kg4Var.f460217i) && n51.f.a(this.f460218m, kg4Var.f460218m) && n51.f.a(java.lang.Boolean.valueOf(this.f460219n), java.lang.Boolean.valueOf(kg4Var.f460219n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460212d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f460213e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f460214f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f460215g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f460216h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f460217i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f460218m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.a(9, this.f460219n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f460212d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f460213e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f460214f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f460215g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f460216h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f460217i;
            if (str13 != null) {
                j17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f460218m;
            if (str14 != null) {
                j17 += b36.f.j(8, str14);
            }
            return j17 + b36.f.a(9, this.f460219n);
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
        r45.kg4 kg4Var = (r45.kg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kg4Var.f460212d = aVar2.k(intValue);
                return 0;
            case 2:
                kg4Var.f460213e = aVar2.k(intValue);
                return 0;
            case 3:
                kg4Var.f460214f = aVar2.k(intValue);
                return 0;
            case 4:
                kg4Var.f460215g = aVar2.k(intValue);
                return 0;
            case 5:
                kg4Var.f460216h = aVar2.k(intValue);
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                kg4Var.f460217i = aVar2.k(intValue);
                return 0;
            case 8:
                kg4Var.f460218m = aVar2.k(intValue);
                return 0;
            case 9:
                kg4Var.f460219n = aVar2.c(intValue);
                return 0;
        }
    }
}
