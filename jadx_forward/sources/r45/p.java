package r45;

/* loaded from: classes9.dex */
public class p extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464165d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464166e;

    /* renamed from: f, reason: collision with root package name */
    public long f464167f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464168g;

    /* renamed from: h, reason: collision with root package name */
    public int f464169h;

    /* renamed from: i, reason: collision with root package name */
    public int f464170i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464171m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f464172n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f464173o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p)) {
            return false;
        }
        r45.p pVar = (r45.p) fVar;
        return n51.f.a(this.f464165d, pVar.f464165d) && n51.f.a(this.f464166e, pVar.f464166e) && n51.f.a(java.lang.Long.valueOf(this.f464167f), java.lang.Long.valueOf(pVar.f464167f)) && n51.f.a(this.f464168g, pVar.f464168g) && n51.f.a(java.lang.Integer.valueOf(this.f464169h), java.lang.Integer.valueOf(pVar.f464169h)) && n51.f.a(java.lang.Integer.valueOf(this.f464170i), java.lang.Integer.valueOf(pVar.f464170i)) && n51.f.a(this.f464171m, pVar.f464171m) && n51.f.a(this.f464172n, pVar.f464172n) && n51.f.a(this.f464173o, pVar.f464173o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464165d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f464166e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f464167f);
            java.lang.String str3 = this.f464168g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(10, this.f464169h);
            fVar.e(11, this.f464170i);
            java.lang.String str4 = this.f464171m;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f464172n;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f464173o;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f464165d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f464166e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int h17 = j17 + b36.f.h(3, this.f464167f);
            java.lang.String str9 = this.f464168g;
            if (str9 != null) {
                h17 += b36.f.j(5, str9);
            }
            int e17 = h17 + b36.f.e(10, this.f464169h) + b36.f.e(11, this.f464170i);
            java.lang.String str10 = this.f464171m;
            if (str10 != null) {
                e17 += b36.f.j(12, str10);
            }
            java.lang.String str11 = this.f464172n;
            if (str11 != null) {
                e17 += b36.f.j(13, str11);
            }
            java.lang.String str12 = this.f464173o;
            return str12 != null ? e17 + b36.f.j(14, str12) : e17;
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
        r45.p pVar = (r45.p) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pVar.f464165d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            pVar.f464166e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            pVar.f464167f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 5) {
            pVar.f464168g = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 10:
                pVar.f464169h = aVar2.g(intValue);
                return 0;
            case 11:
                pVar.f464170i = aVar2.g(intValue);
                return 0;
            case 12:
                pVar.f464171m = aVar2.k(intValue);
                return 0;
            case 13:
                pVar.f464172n = aVar2.k(intValue);
                return 0;
            case 14:
                pVar.f464173o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
