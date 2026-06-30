package r45;

/* loaded from: classes12.dex */
public class ep0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455174d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455175e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455176f;

    /* renamed from: g, reason: collision with root package name */
    public int f455177g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455178h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455179i;

    /* renamed from: m, reason: collision with root package name */
    public int f455180m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f455181n;

    /* renamed from: o, reason: collision with root package name */
    public int f455182o;

    /* renamed from: p, reason: collision with root package name */
    public int f455183p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ep0)) {
            return false;
        }
        r45.ep0 ep0Var = (r45.ep0) fVar;
        return n51.f.a(this.f455174d, ep0Var.f455174d) && n51.f.a(this.f455175e, ep0Var.f455175e) && n51.f.a(this.f455176f, ep0Var.f455176f) && n51.f.a(java.lang.Integer.valueOf(this.f455177g), java.lang.Integer.valueOf(ep0Var.f455177g)) && n51.f.a(this.f455178h, ep0Var.f455178h) && n51.f.a(this.f455179i, ep0Var.f455179i) && n51.f.a(java.lang.Integer.valueOf(this.f455180m), java.lang.Integer.valueOf(ep0Var.f455180m)) && n51.f.a(this.f455181n, ep0Var.f455181n) && n51.f.a(java.lang.Integer.valueOf(this.f455182o), java.lang.Integer.valueOf(ep0Var.f455182o)) && n51.f.a(java.lang.Integer.valueOf(this.f455183p), java.lang.Integer.valueOf(ep0Var.f455183p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f455174d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f455175e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f455176f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f455177g);
            java.lang.String str4 = this.f455178h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f455179i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f455180m);
            java.lang.String str6 = this.f455181n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.e(9, this.f455182o);
            fVar.e(10, this.f455183p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f455174d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f455175e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f455176f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            int e17 = j17 + b36.f.e(4, this.f455177g);
            java.lang.String str10 = this.f455178h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f455179i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            int e18 = e17 + b36.f.e(7, this.f455180m);
            java.lang.String str12 = this.f455181n;
            if (str12 != null) {
                e18 += b36.f.j(8, str12);
            }
            return e18 + b36.f.e(9, this.f455182o) + b36.f.e(10, this.f455183p);
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
        r45.ep0 ep0Var = (r45.ep0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ep0Var.f455174d = aVar2.k(intValue);
                return 0;
            case 2:
                ep0Var.f455175e = aVar2.k(intValue);
                return 0;
            case 3:
                ep0Var.f455176f = aVar2.k(intValue);
                return 0;
            case 4:
                ep0Var.f455177g = aVar2.g(intValue);
                return 0;
            case 5:
                ep0Var.f455178h = aVar2.k(intValue);
                return 0;
            case 6:
                ep0Var.f455179i = aVar2.k(intValue);
                return 0;
            case 7:
                ep0Var.f455180m = aVar2.g(intValue);
                return 0;
            case 8:
                ep0Var.f455181n = aVar2.k(intValue);
                return 0;
            case 9:
                ep0Var.f455182o = aVar2.g(intValue);
                return 0;
            case 10:
                ep0Var.f455183p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
