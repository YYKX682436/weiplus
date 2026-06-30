package r45;

/* loaded from: classes9.dex */
public class od extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463687d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463688e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463689f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463690g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463691h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463692i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f463693m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f463694n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f463695o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.od)) {
            return false;
        }
        r45.od odVar = (r45.od) fVar;
        return n51.f.a(this.f463687d, odVar.f463687d) && n51.f.a(this.f463688e, odVar.f463688e) && n51.f.a(this.f463689f, odVar.f463689f) && n51.f.a(this.f463690g, odVar.f463690g) && n51.f.a(this.f463691h, odVar.f463691h) && n51.f.a(this.f463692i, odVar.f463692i) && n51.f.a(this.f463693m, odVar.f463693m) && n51.f.a(java.lang.Boolean.valueOf(this.f463694n), java.lang.Boolean.valueOf(odVar.f463694n)) && n51.f.a(this.f463695o, odVar.f463695o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463687d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f463688e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f463689f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f463690g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f463691h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f463692i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f463693m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.a(9, this.f463694n);
            java.lang.String str8 = this.f463695o;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f463687d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f463688e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f463689f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f463690g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f463691h;
            if (str13 != null) {
                j17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f463692i;
            if (str14 != null) {
                j17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f463693m;
            if (str15 != null) {
                j17 += b36.f.j(8, str15);
            }
            int a17 = j17 + b36.f.a(9, this.f463694n);
            java.lang.String str16 = this.f463695o;
            return str16 != null ? a17 + b36.f.j(10, str16) : a17;
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
        r45.od odVar = (r45.od) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                odVar.f463687d = aVar2.k(intValue);
                return 0;
            case 2:
                odVar.f463688e = aVar2.k(intValue);
                return 0;
            case 3:
                odVar.f463689f = aVar2.k(intValue);
                return 0;
            case 4:
                odVar.f463690g = aVar2.k(intValue);
                return 0;
            case 5:
                odVar.f463691h = aVar2.k(intValue);
                return 0;
            case 6:
                odVar.f463692i = aVar2.k(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                odVar.f463693m = aVar2.k(intValue);
                return 0;
            case 9:
                odVar.f463694n = aVar2.c(intValue);
                return 0;
            case 10:
                odVar.f463695o = aVar2.k(intValue);
                return 0;
        }
    }
}
