package r45;

/* loaded from: classes4.dex */
public class i05 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458156d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458157e = "WGS84";

    /* renamed from: f, reason: collision with root package name */
    public double f458158f;

    /* renamed from: g, reason: collision with root package name */
    public double f458159g;

    /* renamed from: h, reason: collision with root package name */
    public double f458160h;

    /* renamed from: i, reason: collision with root package name */
    public int f458161i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i05)) {
            return false;
        }
        r45.i05 i05Var = (r45.i05) fVar;
        return n51.f.a(this.f458156d, i05Var.f458156d) && n51.f.a(this.f458157e, i05Var.f458157e) && n51.f.a(java.lang.Double.valueOf(this.f458158f), java.lang.Double.valueOf(i05Var.f458158f)) && n51.f.a(java.lang.Double.valueOf(this.f458159g), java.lang.Double.valueOf(i05Var.f458159g)) && n51.f.a(java.lang.Double.valueOf(this.f458160h), java.lang.Double.valueOf(i05Var.f458160h)) && n51.f.a(java.lang.Integer.valueOf(this.f458161i), java.lang.Integer.valueOf(i05Var.f458161i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458156d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f458157e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.c(3, this.f458158f);
            fVar.c(4, this.f458159g);
            fVar.c(5, this.f458160h);
            fVar.e(6, this.f458161i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f458156d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f458157e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.c(3, this.f458158f) + b36.f.c(4, this.f458159g) + b36.f.c(5, this.f458160h) + b36.f.e(6, this.f458161i);
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
        r45.i05 i05Var = (r45.i05) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i05Var.f458156d = aVar2.k(intValue);
                return 0;
            case 2:
                i05Var.f458157e = aVar2.k(intValue);
                return 0;
            case 3:
                i05Var.f458158f = aVar2.e(intValue);
                return 0;
            case 4:
                i05Var.f458159g = aVar2.e(intValue);
                return 0;
            case 5:
                i05Var.f458160h = aVar2.e(intValue);
                return 0;
            case 6:
                i05Var.f458161i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
