package r45;

/* loaded from: classes7.dex */
public class p97 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464433d;

    /* renamed from: e, reason: collision with root package name */
    public int f464434e;

    /* renamed from: f, reason: collision with root package name */
    public int f464435f;

    /* renamed from: g, reason: collision with root package name */
    public int f464436g;

    /* renamed from: h, reason: collision with root package name */
    public int f464437h;

    /* renamed from: i, reason: collision with root package name */
    public int f464438i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464439m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f464440n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p97)) {
            return false;
        }
        r45.p97 p97Var = (r45.p97) fVar;
        return n51.f.a(this.f464433d, p97Var.f464433d) && n51.f.a(java.lang.Integer.valueOf(this.f464434e), java.lang.Integer.valueOf(p97Var.f464434e)) && n51.f.a(java.lang.Integer.valueOf(this.f464435f), java.lang.Integer.valueOf(p97Var.f464435f)) && n51.f.a(java.lang.Integer.valueOf(this.f464436g), java.lang.Integer.valueOf(p97Var.f464436g)) && n51.f.a(java.lang.Integer.valueOf(this.f464437h), java.lang.Integer.valueOf(p97Var.f464437h)) && n51.f.a(java.lang.Integer.valueOf(this.f464438i), java.lang.Integer.valueOf(p97Var.f464438i)) && n51.f.a(this.f464439m, p97Var.f464439m) && n51.f.a(this.f464440n, p97Var.f464440n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464433d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f464434e);
            fVar.e(3, this.f464435f);
            fVar.e(4, this.f464436g);
            fVar.e(5, this.f464437h);
            fVar.e(6, this.f464438i);
            java.lang.String str2 = this.f464439m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f464440n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f464433d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f464434e) + b36.f.e(3, this.f464435f) + b36.f.e(4, this.f464436g) + b36.f.e(5, this.f464437h) + b36.f.e(6, this.f464438i);
            java.lang.String str5 = this.f464439m;
            if (str5 != null) {
                j17 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f464440n;
            return str6 != null ? j17 + b36.f.j(8, str6) : j17;
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
        r45.p97 p97Var = (r45.p97) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p97Var.f464433d = aVar2.k(intValue);
                return 0;
            case 2:
                p97Var.f464434e = aVar2.g(intValue);
                return 0;
            case 3:
                p97Var.f464435f = aVar2.g(intValue);
                return 0;
            case 4:
                p97Var.f464436g = aVar2.g(intValue);
                return 0;
            case 5:
                p97Var.f464437h = aVar2.g(intValue);
                return 0;
            case 6:
                p97Var.f464438i = aVar2.g(intValue);
                return 0;
            case 7:
                p97Var.f464439m = aVar2.k(intValue);
                return 0;
            case 8:
                p97Var.f464440n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
