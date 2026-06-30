package r45;

/* loaded from: classes9.dex */
public class q60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465234d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465235e;

    /* renamed from: f, reason: collision with root package name */
    public int f465236f;

    /* renamed from: g, reason: collision with root package name */
    public int f465237g;

    /* renamed from: h, reason: collision with root package name */
    public int f465238h;

    /* renamed from: i, reason: collision with root package name */
    public int f465239i;

    /* renamed from: m, reason: collision with root package name */
    public int f465240m;

    /* renamed from: n, reason: collision with root package name */
    public int f465241n;

    /* renamed from: o, reason: collision with root package name */
    public int f465242o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q60)) {
            return false;
        }
        r45.q60 q60Var = (r45.q60) fVar;
        return n51.f.a(this.f465234d, q60Var.f465234d) && n51.f.a(this.f465235e, q60Var.f465235e) && n51.f.a(java.lang.Integer.valueOf(this.f465236f), java.lang.Integer.valueOf(q60Var.f465236f)) && n51.f.a(java.lang.Integer.valueOf(this.f465237g), java.lang.Integer.valueOf(q60Var.f465237g)) && n51.f.a(java.lang.Integer.valueOf(this.f465238h), java.lang.Integer.valueOf(q60Var.f465238h)) && n51.f.a(java.lang.Integer.valueOf(this.f465239i), java.lang.Integer.valueOf(q60Var.f465239i)) && n51.f.a(java.lang.Integer.valueOf(this.f465240m), java.lang.Integer.valueOf(q60Var.f465240m)) && n51.f.a(java.lang.Integer.valueOf(this.f465241n), java.lang.Integer.valueOf(q60Var.f465241n)) && n51.f.a(java.lang.Integer.valueOf(this.f465242o), java.lang.Integer.valueOf(q60Var.f465242o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465234d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f465235e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f465236f);
            fVar.e(5, this.f465237g);
            fVar.e(6, this.f465238h);
            fVar.e(8, this.f465239i);
            fVar.e(9, this.f465240m);
            fVar.e(10, this.f465241n);
            fVar.e(11, this.f465242o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f465234d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f465235e;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f465236f) + b36.f.e(5, this.f465237g) + b36.f.e(6, this.f465238h) + b36.f.e(8, this.f465239i) + b36.f.e(9, this.f465240m) + b36.f.e(10, this.f465241n) + b36.f.e(11, this.f465242o);
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
        r45.q60 q60Var = (r45.q60) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q60Var.f465234d = aVar2.k(intValue);
                return 0;
            case 2:
            case 7:
            default:
                return -1;
            case 3:
                q60Var.f465235e = aVar2.k(intValue);
                return 0;
            case 4:
                q60Var.f465236f = aVar2.g(intValue);
                return 0;
            case 5:
                q60Var.f465237g = aVar2.g(intValue);
                return 0;
            case 6:
                q60Var.f465238h = aVar2.g(intValue);
                return 0;
            case 8:
                q60Var.f465239i = aVar2.g(intValue);
                return 0;
            case 9:
                q60Var.f465240m = aVar2.g(intValue);
                return 0;
            case 10:
                q60Var.f465241n = aVar2.g(intValue);
                return 0;
            case 11:
                q60Var.f465242o = aVar2.g(intValue);
                return 0;
        }
    }
}
