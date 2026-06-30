package r45;

/* loaded from: classes7.dex */
public class vd7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f469671d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469672e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469673f;

    /* renamed from: g, reason: collision with root package name */
    public int f469674g;

    /* renamed from: h, reason: collision with root package name */
    public int f469675h;

    /* renamed from: i, reason: collision with root package name */
    public int f469676i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f469677m;

    /* renamed from: n, reason: collision with root package name */
    public int f469678n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vd7)) {
            return false;
        }
        r45.vd7 vd7Var = (r45.vd7) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f469671d), java.lang.Boolean.valueOf(vd7Var.f469671d)) && n51.f.a(this.f469672e, vd7Var.f469672e) && n51.f.a(this.f469673f, vd7Var.f469673f) && n51.f.a(java.lang.Integer.valueOf(this.f469674g), java.lang.Integer.valueOf(vd7Var.f469674g)) && n51.f.a(java.lang.Integer.valueOf(this.f469675h), java.lang.Integer.valueOf(vd7Var.f469675h)) && n51.f.a(java.lang.Integer.valueOf(this.f469676i), java.lang.Integer.valueOf(vd7Var.f469676i)) && n51.f.a(java.lang.Boolean.valueOf(this.f469677m), java.lang.Boolean.valueOf(vd7Var.f469677m)) && n51.f.a(java.lang.Integer.valueOf(this.f469678n), java.lang.Integer.valueOf(vd7Var.f469678n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f469671d);
            java.lang.String str = this.f469672e;
            if (str != null) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f469673f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f469674g);
            fVar.e(5, this.f469675h);
            fVar.e(6, this.f469676i);
            fVar.a(9, this.f469677m);
            fVar.e(10, this.f469678n);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f469671d) + 0;
            java.lang.String str2 = this.f469672e;
            if (str2 != null) {
                a17 += b36.f.j(2, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f469673f;
            if (gVar2 != null) {
                a17 += b36.f.b(3, gVar2);
            }
            return a17 + b36.f.e(4, this.f469674g) + b36.f.e(5, this.f469675h) + b36.f.e(6, this.f469676i) + b36.f.a(9, this.f469677m) + b36.f.e(10, this.f469678n);
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
        r45.vd7 vd7Var = (r45.vd7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vd7Var.f469671d = aVar2.c(intValue);
                return 0;
            case 2:
                vd7Var.f469672e = aVar2.k(intValue);
                return 0;
            case 3:
                vd7Var.f469673f = aVar2.d(intValue);
                return 0;
            case 4:
                vd7Var.f469674g = aVar2.g(intValue);
                return 0;
            case 5:
                vd7Var.f469675h = aVar2.g(intValue);
                return 0;
            case 6:
                vd7Var.f469676i = aVar2.g(intValue);
                return 0;
            case 7:
            case 8:
            default:
                return -1;
            case 9:
                vd7Var.f469677m = aVar2.c(intValue);
                return 0;
            case 10:
                vd7Var.f469678n = aVar2.g(intValue);
                return 0;
        }
    }
}
