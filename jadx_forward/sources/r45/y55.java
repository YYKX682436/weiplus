package r45;

/* loaded from: classes8.dex */
public class y55 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472335d;

    /* renamed from: e, reason: collision with root package name */
    public int f472336e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472337f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472338g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472339h;

    /* renamed from: i, reason: collision with root package name */
    public int f472340i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f472341m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f472342n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y55)) {
            return false;
        }
        r45.y55 y55Var = (r45.y55) fVar;
        return n51.f.a(this.f472335d, y55Var.f472335d) && n51.f.a(java.lang.Integer.valueOf(this.f472336e), java.lang.Integer.valueOf(y55Var.f472336e)) && n51.f.a(this.f472337f, y55Var.f472337f) && n51.f.a(this.f472338g, y55Var.f472338g) && n51.f.a(this.f472339h, y55Var.f472339h) && n51.f.a(java.lang.Integer.valueOf(this.f472340i), java.lang.Integer.valueOf(y55Var.f472340i)) && n51.f.a(this.f472341m, y55Var.f472341m) && n51.f.a(this.f472342n, y55Var.f472342n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472335d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f472336e);
            java.lang.String str2 = this.f472337f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f472338g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f472339h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f472340i);
            java.lang.String str5 = this.f472341m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f472342n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f472335d;
            int j17 = (str7 != null ? 0 + b36.f.j(1, str7) : 0) + b36.f.e(2, this.f472336e);
            java.lang.String str8 = this.f472337f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f472338g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f472339h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            int e17 = j17 + b36.f.e(6, this.f472340i);
            java.lang.String str11 = this.f472341m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f472342n;
            return str12 != null ? e17 + b36.f.j(8, str12) : e17;
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
        r45.y55 y55Var = (r45.y55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y55Var.f472335d = aVar2.k(intValue);
                return 0;
            case 2:
                y55Var.f472336e = aVar2.g(intValue);
                return 0;
            case 3:
                y55Var.f472337f = aVar2.k(intValue);
                return 0;
            case 4:
                y55Var.f472338g = aVar2.k(intValue);
                return 0;
            case 5:
                y55Var.f472339h = aVar2.k(intValue);
                return 0;
            case 6:
                y55Var.f472340i = aVar2.g(intValue);
                return 0;
            case 7:
                y55Var.f472341m = aVar2.k(intValue);
                return 0;
            case 8:
                y55Var.f472342n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
