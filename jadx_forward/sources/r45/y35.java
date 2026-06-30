package r45;

/* loaded from: classes8.dex */
public class y35 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472283d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472284e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472285f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472286g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472287h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f472288i;

    /* renamed from: m, reason: collision with root package name */
    public int f472289m;

    /* renamed from: n, reason: collision with root package name */
    public int f472290n;

    /* renamed from: o, reason: collision with root package name */
    public int f472291o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y35)) {
            return false;
        }
        r45.y35 y35Var = (r45.y35) fVar;
        return n51.f.a(this.f472283d, y35Var.f472283d) && n51.f.a(this.f472284e, y35Var.f472284e) && n51.f.a(this.f472285f, y35Var.f472285f) && n51.f.a(this.f472286g, y35Var.f472286g) && n51.f.a(this.f472287h, y35Var.f472287h) && n51.f.a(this.f472288i, y35Var.f472288i) && n51.f.a(java.lang.Integer.valueOf(this.f472289m), java.lang.Integer.valueOf(y35Var.f472289m)) && n51.f.a(java.lang.Integer.valueOf(this.f472290n), java.lang.Integer.valueOf(y35Var.f472290n)) && n51.f.a(java.lang.Integer.valueOf(this.f472291o), java.lang.Integer.valueOf(y35Var.f472291o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472283d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472284e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f472285f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f472286g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f472287h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f472288i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f472289m);
            fVar.e(8, this.f472290n);
            fVar.e(9, this.f472291o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f472283d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f472284e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f472285f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f472286g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f472287h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f472288i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            return j17 + b36.f.e(7, this.f472289m) + b36.f.e(8, this.f472290n) + b36.f.e(9, this.f472291o);
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
        r45.y35 y35Var = (r45.y35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y35Var.f472283d = aVar2.k(intValue);
                return 0;
            case 2:
                y35Var.f472284e = aVar2.k(intValue);
                return 0;
            case 3:
                y35Var.f472285f = aVar2.k(intValue);
                return 0;
            case 4:
                y35Var.f472286g = aVar2.k(intValue);
                return 0;
            case 5:
                y35Var.f472287h = aVar2.k(intValue);
                return 0;
            case 6:
                y35Var.f472288i = aVar2.k(intValue);
                return 0;
            case 7:
                y35Var.f472289m = aVar2.g(intValue);
                return 0;
            case 8:
                y35Var.f472290n = aVar2.g(intValue);
                return 0;
            case 9:
                y35Var.f472291o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
