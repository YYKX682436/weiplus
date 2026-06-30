package r45;

/* loaded from: classes10.dex */
public class in0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458692d;

    /* renamed from: e, reason: collision with root package name */
    public int f458693e;

    /* renamed from: f, reason: collision with root package name */
    public int f458694f;

    /* renamed from: g, reason: collision with root package name */
    public int f458695g;

    /* renamed from: h, reason: collision with root package name */
    public int f458696h;

    /* renamed from: i, reason: collision with root package name */
    public int f458697i;

    /* renamed from: m, reason: collision with root package name */
    public int f458698m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.in0)) {
            return false;
        }
        r45.in0 in0Var = (r45.in0) fVar;
        return n51.f.a(this.f458692d, in0Var.f458692d) && n51.f.a(java.lang.Integer.valueOf(this.f458693e), java.lang.Integer.valueOf(in0Var.f458693e)) && n51.f.a(java.lang.Integer.valueOf(this.f458694f), java.lang.Integer.valueOf(in0Var.f458694f)) && n51.f.a(java.lang.Integer.valueOf(this.f458695g), java.lang.Integer.valueOf(in0Var.f458695g)) && n51.f.a(java.lang.Integer.valueOf(this.f458696h), java.lang.Integer.valueOf(in0Var.f458696h)) && n51.f.a(java.lang.Integer.valueOf(this.f458697i), java.lang.Integer.valueOf(in0Var.f458697i)) && n51.f.a(java.lang.Integer.valueOf(this.f458698m), java.lang.Integer.valueOf(in0Var.f458698m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458692d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f458693e);
            fVar.e(3, this.f458694f);
            fVar.e(4, this.f458695g);
            fVar.e(5, this.f458696h);
            fVar.e(6, this.f458697i);
            fVar.e(7, this.f458698m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f458692d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f458693e) + b36.f.e(3, this.f458694f) + b36.f.e(4, this.f458695g) + b36.f.e(5, this.f458696h) + b36.f.e(6, this.f458697i) + b36.f.e(7, this.f458698m);
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
        r45.in0 in0Var = (r45.in0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                in0Var.f458692d = aVar2.k(intValue);
                return 0;
            case 2:
                in0Var.f458693e = aVar2.g(intValue);
                return 0;
            case 3:
                in0Var.f458694f = aVar2.g(intValue);
                return 0;
            case 4:
                in0Var.f458695g = aVar2.g(intValue);
                return 0;
            case 5:
                in0Var.f458696h = aVar2.g(intValue);
                return 0;
            case 6:
                in0Var.f458697i = aVar2.g(intValue);
                return 0;
            case 7:
                in0Var.f458698m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
