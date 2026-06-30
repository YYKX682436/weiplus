package r45;

/* loaded from: classes11.dex */
public class ud extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468781d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468782e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468783f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468784g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468785h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f468786i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f468787m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ud)) {
            return false;
        }
        r45.ud udVar = (r45.ud) fVar;
        return n51.f.a(this.f468781d, udVar.f468781d) && n51.f.a(this.f468782e, udVar.f468782e) && n51.f.a(this.f468783f, udVar.f468783f) && n51.f.a(this.f468784g, udVar.f468784g) && n51.f.a(this.f468785h, udVar.f468785h) && n51.f.a(this.f468786i, udVar.f468786i) && n51.f.a(this.f468787m, udVar.f468787m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f468781d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f468782e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f468783f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f468784g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f468785h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f468786i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f468787m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f468781d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f468782e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f468783f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f468784g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f468785h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f468786i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f468787m;
            return str14 != null ? j17 + b36.f.j(7, str14) : j17;
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
        r45.ud udVar = (r45.ud) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                udVar.f468781d = aVar2.k(intValue);
                return 0;
            case 2:
                udVar.f468782e = aVar2.k(intValue);
                return 0;
            case 3:
                udVar.f468783f = aVar2.k(intValue);
                return 0;
            case 4:
                udVar.f468784g = aVar2.k(intValue);
                return 0;
            case 5:
                udVar.f468785h = aVar2.k(intValue);
                return 0;
            case 6:
                udVar.f468786i = aVar2.k(intValue);
                return 0;
            case 7:
                udVar.f468787m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
