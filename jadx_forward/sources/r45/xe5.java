package r45;

/* loaded from: classes8.dex */
public class xe5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f471547d;

    /* renamed from: e, reason: collision with root package name */
    public int f471548e;

    /* renamed from: f, reason: collision with root package name */
    public int f471549f;

    /* renamed from: g, reason: collision with root package name */
    public int f471550g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471551h;

    /* renamed from: i, reason: collision with root package name */
    public int f471552i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f471553m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xe5)) {
            return false;
        }
        r45.xe5 xe5Var = (r45.xe5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f471547d), java.lang.Integer.valueOf(xe5Var.f471547d)) && n51.f.a(java.lang.Integer.valueOf(this.f471548e), java.lang.Integer.valueOf(xe5Var.f471548e)) && n51.f.a(java.lang.Integer.valueOf(this.f471549f), java.lang.Integer.valueOf(xe5Var.f471549f)) && n51.f.a(java.lang.Integer.valueOf(this.f471550g), java.lang.Integer.valueOf(xe5Var.f471550g)) && n51.f.a(this.f471551h, xe5Var.f471551h) && n51.f.a(java.lang.Integer.valueOf(this.f471552i), java.lang.Integer.valueOf(xe5Var.f471552i)) && n51.f.a(this.f471553m, xe5Var.f471553m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f471547d);
            fVar.e(2, this.f471548e);
            fVar.e(3, this.f471549f);
            fVar.e(4, this.f471550g);
            java.lang.String str = this.f471551h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f471552i);
            java.lang.String str2 = this.f471553m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f471547d) + 0 + b36.f.e(2, this.f471548e) + b36.f.e(3, this.f471549f) + b36.f.e(4, this.f471550g);
            java.lang.String str3 = this.f471551h;
            if (str3 != null) {
                e17 += b36.f.j(5, str3);
            }
            int e18 = e17 + b36.f.e(6, this.f471552i);
            java.lang.String str4 = this.f471553m;
            return str4 != null ? e18 + b36.f.j(7, str4) : e18;
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
        r45.xe5 xe5Var = (r45.xe5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xe5Var.f471547d = aVar2.g(intValue);
                return 0;
            case 2:
                xe5Var.f471548e = aVar2.g(intValue);
                return 0;
            case 3:
                xe5Var.f471549f = aVar2.g(intValue);
                return 0;
            case 4:
                xe5Var.f471550g = aVar2.g(intValue);
                return 0;
            case 5:
                xe5Var.f471551h = aVar2.k(intValue);
                return 0;
            case 6:
                xe5Var.f471552i = aVar2.g(intValue);
                return 0;
            case 7:
                xe5Var.f471553m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
