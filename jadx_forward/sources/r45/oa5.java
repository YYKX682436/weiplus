package r45;

/* loaded from: classes9.dex */
public class oa5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463629d;

    /* renamed from: e, reason: collision with root package name */
    public int f463630e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463631f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463632g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463633h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463634i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f463635m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oa5)) {
            return false;
        }
        r45.oa5 oa5Var = (r45.oa5) fVar;
        return n51.f.a(this.f463629d, oa5Var.f463629d) && n51.f.a(java.lang.Integer.valueOf(this.f463630e), java.lang.Integer.valueOf(oa5Var.f463630e)) && n51.f.a(this.f463631f, oa5Var.f463631f) && n51.f.a(this.f463632g, oa5Var.f463632g) && n51.f.a(this.f463633h, oa5Var.f463633h) && n51.f.a(this.f463634i, oa5Var.f463634i) && n51.f.a(this.f463635m, oa5Var.f463635m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463629d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f463630e);
            java.lang.String str2 = this.f463631f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f463632g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f463633h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f463634i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f463635m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f463629d;
            int j17 = (str7 != null ? 0 + b36.f.j(1, str7) : 0) + b36.f.e(2, this.f463630e);
            java.lang.String str8 = this.f463631f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f463632g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f463633h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f463634i;
            if (str11 != null) {
                j17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f463635m;
            return str12 != null ? j17 + b36.f.j(7, str12) : j17;
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
        r45.oa5 oa5Var = (r45.oa5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oa5Var.f463629d = aVar2.k(intValue);
                return 0;
            case 2:
                oa5Var.f463630e = aVar2.g(intValue);
                return 0;
            case 3:
                oa5Var.f463631f = aVar2.k(intValue);
                return 0;
            case 4:
                oa5Var.f463632g = aVar2.k(intValue);
                return 0;
            case 5:
                oa5Var.f463633h = aVar2.k(intValue);
                return 0;
            case 6:
                oa5Var.f463634i = aVar2.k(intValue);
                return 0;
            case 7:
                oa5Var.f463635m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
