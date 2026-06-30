package m53;

/* loaded from: classes2.dex */
public class d5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405162d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405163e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405164f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405165g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f405166h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f405167i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f405168m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.d5)) {
            return false;
        }
        m53.d5 d5Var = (m53.d5) fVar;
        return n51.f.a(this.f405162d, d5Var.f405162d) && n51.f.a(this.f405163e, d5Var.f405163e) && n51.f.a(this.f405164f, d5Var.f405164f) && n51.f.a(this.f405165g, d5Var.f405165g) && n51.f.a(this.f405166h, d5Var.f405166h) && n51.f.a(java.lang.Boolean.valueOf(this.f405167i), java.lang.Boolean.valueOf(d5Var.f405167i)) && n51.f.a(java.lang.Boolean.valueOf(this.f405168m), java.lang.Boolean.valueOf(d5Var.f405168m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405162d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405163e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f405164f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f405165g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f405166h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.a(6, this.f405167i);
            fVar.a(7, this.f405168m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f405162d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f405163e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f405164f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f405165g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f405166h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            return j17 + b36.f.a(6, this.f405167i) + b36.f.a(7, this.f405168m);
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
        m53.d5 d5Var = (m53.d5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d5Var.f405162d = aVar2.k(intValue);
                return 0;
            case 2:
                d5Var.f405163e = aVar2.k(intValue);
                return 0;
            case 3:
                d5Var.f405164f = aVar2.k(intValue);
                return 0;
            case 4:
                d5Var.f405165g = aVar2.k(intValue);
                return 0;
            case 5:
                d5Var.f405166h = aVar2.k(intValue);
                return 0;
            case 6:
                d5Var.f405167i = aVar2.c(intValue);
                return 0;
            case 7:
                d5Var.f405168m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
