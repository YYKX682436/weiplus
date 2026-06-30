package r45;

/* loaded from: classes10.dex */
public class dy1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454377d;

    /* renamed from: e, reason: collision with root package name */
    public int f454378e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454379f;

    /* renamed from: g, reason: collision with root package name */
    public int f454380g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454381h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454382i;

    /* renamed from: m, reason: collision with root package name */
    public int f454383m;

    /* renamed from: n, reason: collision with root package name */
    public int f454384n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dy1)) {
            return false;
        }
        r45.dy1 dy1Var = (r45.dy1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454377d), java.lang.Integer.valueOf(dy1Var.f454377d)) && n51.f.a(java.lang.Integer.valueOf(this.f454378e), java.lang.Integer.valueOf(dy1Var.f454378e)) && n51.f.a(this.f454379f, dy1Var.f454379f) && n51.f.a(java.lang.Integer.valueOf(this.f454380g), java.lang.Integer.valueOf(dy1Var.f454380g)) && n51.f.a(this.f454381h, dy1Var.f454381h) && n51.f.a(this.f454382i, dy1Var.f454382i) && n51.f.a(java.lang.Integer.valueOf(this.f454383m), java.lang.Integer.valueOf(dy1Var.f454383m)) && n51.f.a(java.lang.Integer.valueOf(this.f454384n), java.lang.Integer.valueOf(dy1Var.f454384n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454377d);
            fVar.e(2, this.f454378e);
            java.lang.String str = this.f454379f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f454380g);
            java.lang.String str2 = this.f454381h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f454382i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f454383m);
            fVar.e(8, this.f454384n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f454377d) + 0 + b36.f.e(2, this.f454378e);
            java.lang.String str4 = this.f454379f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            int e18 = e17 + b36.f.e(4, this.f454380g);
            java.lang.String str5 = this.f454381h;
            if (str5 != null) {
                e18 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f454382i;
            if (str6 != null) {
                e18 += b36.f.j(6, str6);
            }
            return e18 + b36.f.e(7, this.f454383m) + b36.f.e(8, this.f454384n);
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
        r45.dy1 dy1Var = (r45.dy1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dy1Var.f454377d = aVar2.g(intValue);
                return 0;
            case 2:
                dy1Var.f454378e = aVar2.g(intValue);
                return 0;
            case 3:
                dy1Var.f454379f = aVar2.k(intValue);
                return 0;
            case 4:
                dy1Var.f454380g = aVar2.g(intValue);
                return 0;
            case 5:
                dy1Var.f454381h = aVar2.k(intValue);
                return 0;
            case 6:
                dy1Var.f454382i = aVar2.k(intValue);
                return 0;
            case 7:
                dy1Var.f454383m = aVar2.g(intValue);
                return 0;
            case 8:
                dy1Var.f454384n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
