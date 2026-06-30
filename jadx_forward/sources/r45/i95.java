package r45;

/* loaded from: classes2.dex */
public class i95 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458377d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458378e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458379f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458380g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458381h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f458382i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f458383m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f458384n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i95)) {
            return false;
        }
        r45.i95 i95Var = (r45.i95) fVar;
        return n51.f.a(this.f458377d, i95Var.f458377d) && n51.f.a(this.f458378e, i95Var.f458378e) && n51.f.a(this.f458379f, i95Var.f458379f) && n51.f.a(this.f458380g, i95Var.f458380g) && n51.f.a(this.f458381h, i95Var.f458381h) && n51.f.a(this.f458382i, i95Var.f458382i) && n51.f.a(this.f458383m, i95Var.f458383m) && n51.f.a(this.f458384n, i95Var.f458384n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458377d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f458378e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f458379f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f458380g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f458381h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f458382i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f458383m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f458384n;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f458377d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f458378e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f458379f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f458380g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f458381h;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f458382i;
            if (str14 != null) {
                j17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f458383m;
            if (str15 != null) {
                j17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f458384n;
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
        r45.i95 i95Var = (r45.i95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i95Var.f458377d = aVar2.k(intValue);
                return 0;
            case 2:
                i95Var.f458378e = aVar2.k(intValue);
                return 0;
            case 3:
                i95Var.f458379f = aVar2.k(intValue);
                return 0;
            case 4:
                i95Var.f458380g = aVar2.k(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                i95Var.f458381h = aVar2.k(intValue);
                return 0;
            case 7:
                i95Var.f458382i = aVar2.k(intValue);
                return 0;
            case 8:
                i95Var.f458383m = aVar2.k(intValue);
                return 0;
            case 9:
                i95Var.f458384n = aVar2.k(intValue);
                return 0;
        }
    }
}
