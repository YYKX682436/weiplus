package r45;

/* loaded from: classes9.dex */
public class a80 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f451344d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451345e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451346f;

    /* renamed from: g, reason: collision with root package name */
    public int f451347g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451348h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451349i;

    /* renamed from: m, reason: collision with root package name */
    public int f451350m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a80)) {
            return false;
        }
        r45.a80 a80Var = (r45.a80) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f451344d), java.lang.Integer.valueOf(a80Var.f451344d)) && n51.f.a(this.f451345e, a80Var.f451345e) && n51.f.a(this.f451346f, a80Var.f451346f) && n51.f.a(java.lang.Integer.valueOf(this.f451347g), java.lang.Integer.valueOf(a80Var.f451347g)) && n51.f.a(this.f451348h, a80Var.f451348h) && n51.f.a(this.f451349i, a80Var.f451349i) && n51.f.a(java.lang.Integer.valueOf(this.f451350m), java.lang.Integer.valueOf(a80Var.f451350m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f451344d);
            java.lang.String str = this.f451345e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f451346f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f451347g);
            java.lang.String str3 = this.f451348h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f451349i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f451350m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f451344d) + 0;
            java.lang.String str5 = this.f451345e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f451346f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            int e18 = e17 + b36.f.e(4, this.f451347g);
            java.lang.String str7 = this.f451348h;
            if (str7 != null) {
                e18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f451349i;
            if (str8 != null) {
                e18 += b36.f.j(6, str8);
            }
            return e18 + b36.f.e(7, this.f451350m);
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
        r45.a80 a80Var = (r45.a80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a80Var.f451344d = aVar2.g(intValue);
                return 0;
            case 2:
                a80Var.f451345e = aVar2.k(intValue);
                return 0;
            case 3:
                a80Var.f451346f = aVar2.k(intValue);
                return 0;
            case 4:
                a80Var.f451347g = aVar2.g(intValue);
                return 0;
            case 5:
                a80Var.f451348h = aVar2.k(intValue);
                return 0;
            case 6:
                a80Var.f451349i = aVar2.k(intValue);
                return 0;
            case 7:
                a80Var.f451350m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
