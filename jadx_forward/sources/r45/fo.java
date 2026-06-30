package r45;

/* loaded from: classes9.dex */
public class fo extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456006d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456007e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456008f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456009g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456010h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f456011i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f456012m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fo)) {
            return false;
        }
        r45.fo foVar = (r45.fo) fVar;
        return n51.f.a(this.f456006d, foVar.f456006d) && n51.f.a(this.f456007e, foVar.f456007e) && n51.f.a(this.f456008f, foVar.f456008f) && n51.f.a(this.f456009g, foVar.f456009g) && n51.f.a(this.f456010h, foVar.f456010h) && n51.f.a(this.f456011i, foVar.f456011i) && n51.f.a(this.f456012m, foVar.f456012m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456006d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f456007e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f456008f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f456009g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f456010h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f456011i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f456012m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f456006d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f456007e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f456008f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f456009g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f456010h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f456011i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f456012m;
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
        r45.fo foVar = (r45.fo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                foVar.f456006d = aVar2.k(intValue);
                return 0;
            case 2:
                foVar.f456007e = aVar2.k(intValue);
                return 0;
            case 3:
                foVar.f456008f = aVar2.k(intValue);
                return 0;
            case 4:
                foVar.f456009g = aVar2.k(intValue);
                return 0;
            case 5:
                foVar.f456010h = aVar2.k(intValue);
                return 0;
            case 6:
                foVar.f456011i = aVar2.k(intValue);
                return 0;
            case 7:
                foVar.f456012m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
