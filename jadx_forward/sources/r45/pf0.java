package r45;

/* loaded from: classes8.dex */
public class pf0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464526d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464527e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464528f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464529g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464530h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464531i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464532m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f464533n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f464534o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pf0)) {
            return false;
        }
        r45.pf0 pf0Var = (r45.pf0) fVar;
        return n51.f.a(this.f464526d, pf0Var.f464526d) && n51.f.a(this.f464527e, pf0Var.f464527e) && n51.f.a(this.f464528f, pf0Var.f464528f) && n51.f.a(this.f464529g, pf0Var.f464529g) && n51.f.a(this.f464530h, pf0Var.f464530h) && n51.f.a(this.f464531i, pf0Var.f464531i) && n51.f.a(this.f464532m, pf0Var.f464532m) && n51.f.a(this.f464533n, pf0Var.f464533n) && n51.f.a(this.f464534o, pf0Var.f464534o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464526d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f464527e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f464528f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f464529g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f464530h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f464531i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f464532m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f464533n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f464534o;
            if (str9 != null) {
                fVar.j(9, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f464526d;
            int j17 = str10 != null ? 0 + b36.f.j(1, str10) : 0;
            java.lang.String str11 = this.f464527e;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f464528f;
            if (str12 != null) {
                j17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f464529g;
            if (str13 != null) {
                j17 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f464530h;
            if (str14 != null) {
                j17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f464531i;
            if (str15 != null) {
                j17 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f464532m;
            if (str16 != null) {
                j17 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f464533n;
            if (str17 != null) {
                j17 += b36.f.j(8, str17);
            }
            java.lang.String str18 = this.f464534o;
            return str18 != null ? j17 + b36.f.j(9, str18) : j17;
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
        r45.pf0 pf0Var = (r45.pf0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pf0Var.f464526d = aVar2.k(intValue);
                return 0;
            case 2:
                pf0Var.f464527e = aVar2.k(intValue);
                return 0;
            case 3:
                pf0Var.f464528f = aVar2.k(intValue);
                return 0;
            case 4:
                pf0Var.f464529g = aVar2.k(intValue);
                return 0;
            case 5:
                pf0Var.f464530h = aVar2.k(intValue);
                return 0;
            case 6:
                pf0Var.f464531i = aVar2.k(intValue);
                return 0;
            case 7:
                pf0Var.f464532m = aVar2.k(intValue);
                return 0;
            case 8:
                pf0Var.f464533n = aVar2.k(intValue);
                return 0;
            case 9:
                pf0Var.f464534o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
