package r45;

/* loaded from: classes11.dex */
public class fq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f456072d;

    /* renamed from: e, reason: collision with root package name */
    public int f456073e;

    /* renamed from: f, reason: collision with root package name */
    public int f456074f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456075g;

    /* renamed from: h, reason: collision with root package name */
    public int f456076h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f456077i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fq0)) {
            return false;
        }
        r45.fq0 fq0Var = (r45.fq0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f456072d), java.lang.Integer.valueOf(fq0Var.f456072d)) && n51.f.a(java.lang.Integer.valueOf(this.f456073e), java.lang.Integer.valueOf(fq0Var.f456073e)) && n51.f.a(java.lang.Integer.valueOf(this.f456074f), java.lang.Integer.valueOf(fq0Var.f456074f)) && n51.f.a(this.f456075g, fq0Var.f456075g) && n51.f.a(java.lang.Integer.valueOf(this.f456076h), java.lang.Integer.valueOf(fq0Var.f456076h)) && n51.f.a(this.f456077i, fq0Var.f456077i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f456072d);
            fVar.e(2, this.f456073e);
            fVar.e(3, this.f456074f);
            java.lang.String str = this.f456075g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f456076h);
            java.lang.String str2 = this.f456077i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f456072d) + 0 + b36.f.e(2, this.f456073e) + b36.f.e(3, this.f456074f);
            java.lang.String str3 = this.f456075g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            int e18 = e17 + b36.f.e(5, this.f456076h);
            java.lang.String str4 = this.f456077i;
            return str4 != null ? e18 + b36.f.j(6, str4) : e18;
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
        r45.fq0 fq0Var = (r45.fq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fq0Var.f456072d = aVar2.g(intValue);
                return 0;
            case 2:
                fq0Var.f456073e = aVar2.g(intValue);
                return 0;
            case 3:
                fq0Var.f456074f = aVar2.g(intValue);
                return 0;
            case 4:
                fq0Var.f456075g = aVar2.k(intValue);
                return 0;
            case 5:
                fq0Var.f456076h = aVar2.g(intValue);
                return 0;
            case 6:
                fq0Var.f456077i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
