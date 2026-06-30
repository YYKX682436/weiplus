package r45;

/* loaded from: classes8.dex */
public class b37 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452032d;

    /* renamed from: e, reason: collision with root package name */
    public int f452033e;

    /* renamed from: f, reason: collision with root package name */
    public int f452034f;

    /* renamed from: g, reason: collision with root package name */
    public int f452035g;

    /* renamed from: h, reason: collision with root package name */
    public int f452036h;

    /* renamed from: i, reason: collision with root package name */
    public int f452037i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b37)) {
            return false;
        }
        r45.b37 b37Var = (r45.b37) fVar;
        return n51.f.a(this.f452032d, b37Var.f452032d) && n51.f.a(java.lang.Integer.valueOf(this.f452033e), java.lang.Integer.valueOf(b37Var.f452033e)) && n51.f.a(java.lang.Integer.valueOf(this.f452034f), java.lang.Integer.valueOf(b37Var.f452034f)) && n51.f.a(java.lang.Integer.valueOf(this.f452035g), java.lang.Integer.valueOf(b37Var.f452035g)) && n51.f.a(java.lang.Integer.valueOf(this.f452036h), java.lang.Integer.valueOf(b37Var.f452036h)) && n51.f.a(java.lang.Integer.valueOf(this.f452037i), java.lang.Integer.valueOf(b37Var.f452037i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452032d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f452033e);
            fVar.e(3, this.f452034f);
            fVar.e(4, this.f452035g);
            fVar.e(5, this.f452036h);
            fVar.e(6, this.f452037i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f452032d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f452033e) + b36.f.e(3, this.f452034f) + b36.f.e(4, this.f452035g) + b36.f.e(5, this.f452036h) + b36.f.e(6, this.f452037i);
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
        r45.b37 b37Var = (r45.b37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b37Var.f452032d = aVar2.k(intValue);
                return 0;
            case 2:
                b37Var.f452033e = aVar2.g(intValue);
                return 0;
            case 3:
                b37Var.f452034f = aVar2.g(intValue);
                return 0;
            case 4:
                b37Var.f452035g = aVar2.g(intValue);
                return 0;
            case 5:
                b37Var.f452036h = aVar2.g(intValue);
                return 0;
            case 6:
                b37Var.f452037i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
