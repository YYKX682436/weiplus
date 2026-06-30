package r45;

/* loaded from: classes8.dex */
public class x83 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471390d;

    /* renamed from: e, reason: collision with root package name */
    public int f471391e;

    /* renamed from: f, reason: collision with root package name */
    public int f471392f;

    /* renamed from: g, reason: collision with root package name */
    public int f471393g;

    /* renamed from: h, reason: collision with root package name */
    public int f471394h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471395i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f471396m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f471397n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x83)) {
            return false;
        }
        r45.x83 x83Var = (r45.x83) fVar;
        return n51.f.a(this.f471390d, x83Var.f471390d) && n51.f.a(java.lang.Integer.valueOf(this.f471391e), java.lang.Integer.valueOf(x83Var.f471391e)) && n51.f.a(java.lang.Integer.valueOf(this.f471392f), java.lang.Integer.valueOf(x83Var.f471392f)) && n51.f.a(java.lang.Integer.valueOf(this.f471393g), java.lang.Integer.valueOf(x83Var.f471393g)) && n51.f.a(java.lang.Integer.valueOf(this.f471394h), java.lang.Integer.valueOf(x83Var.f471394h)) && n51.f.a(this.f471395i, x83Var.f471395i) && n51.f.a(this.f471396m, x83Var.f471396m) && n51.f.a(this.f471397n, x83Var.f471397n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471390d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f471391e);
            fVar.e(3, this.f471392f);
            fVar.e(4, this.f471393g);
            fVar.e(5, this.f471394h);
            java.lang.String str2 = this.f471395i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f471396m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f471397n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f471390d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f471391e) + b36.f.e(3, this.f471392f) + b36.f.e(4, this.f471393g) + b36.f.e(5, this.f471394h);
            java.lang.String str6 = this.f471395i;
            if (str6 != null) {
                j17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f471396m;
            if (str7 != null) {
                j17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f471397n;
            return str8 != null ? j17 + b36.f.j(8, str8) : j17;
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
        r45.x83 x83Var = (r45.x83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x83Var.f471390d = aVar2.k(intValue);
                return 0;
            case 2:
                x83Var.f471391e = aVar2.g(intValue);
                return 0;
            case 3:
                x83Var.f471392f = aVar2.g(intValue);
                return 0;
            case 4:
                x83Var.f471393g = aVar2.g(intValue);
                return 0;
            case 5:
                x83Var.f471394h = aVar2.g(intValue);
                return 0;
            case 6:
                x83Var.f471395i = aVar2.k(intValue);
                return 0;
            case 7:
                x83Var.f471396m = aVar2.k(intValue);
                return 0;
            case 8:
                x83Var.f471397n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
