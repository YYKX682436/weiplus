package r45;

/* loaded from: classes2.dex */
public class ee7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454909d;

    /* renamed from: e, reason: collision with root package name */
    public int f454910e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454911f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454912g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454913h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454914i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ee7)) {
            return false;
        }
        r45.ee7 ee7Var = (r45.ee7) fVar;
        return n51.f.a(this.f454909d, ee7Var.f454909d) && n51.f.a(java.lang.Integer.valueOf(this.f454910e), java.lang.Integer.valueOf(ee7Var.f454910e)) && n51.f.a(this.f454911f, ee7Var.f454911f) && n51.f.a(this.f454912g, ee7Var.f454912g) && n51.f.a(this.f454913h, ee7Var.f454913h) && n51.f.a(this.f454914i, ee7Var.f454914i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454909d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f454910e);
            java.lang.String str2 = this.f454911f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f454912g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f454913h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f454914i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f454909d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f454910e);
            java.lang.String str7 = this.f454911f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f454912g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f454913h;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f454914i;
            return str10 != null ? j17 + b36.f.j(6, str10) : j17;
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
        r45.ee7 ee7Var = (r45.ee7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ee7Var.f454909d = aVar2.k(intValue);
                return 0;
            case 2:
                ee7Var.f454910e = aVar2.g(intValue);
                return 0;
            case 3:
                ee7Var.f454911f = aVar2.k(intValue);
                return 0;
            case 4:
                ee7Var.f454912g = aVar2.k(intValue);
                return 0;
            case 5:
                ee7Var.f454913h = aVar2.k(intValue);
                return 0;
            case 6:
                ee7Var.f454914i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
