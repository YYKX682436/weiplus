package r45;

/* loaded from: classes2.dex */
public class k95 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460044d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460045e;

    /* renamed from: f, reason: collision with root package name */
    public float f460046f;

    /* renamed from: g, reason: collision with root package name */
    public float f460047g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460048h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460049i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k95)) {
            return false;
        }
        r45.k95 k95Var = (r45.k95) fVar;
        return n51.f.a(this.f460044d, k95Var.f460044d) && n51.f.a(this.f460045e, k95Var.f460045e) && n51.f.a(java.lang.Float.valueOf(this.f460046f), java.lang.Float.valueOf(k95Var.f460046f)) && n51.f.a(java.lang.Float.valueOf(this.f460047g), java.lang.Float.valueOf(k95Var.f460047g)) && n51.f.a(this.f460048h, k95Var.f460048h) && n51.f.a(this.f460049i, k95Var.f460049i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460044d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f460045e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.d(3, this.f460046f);
            fVar.d(4, this.f460047g);
            java.lang.String str3 = this.f460048h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f460049i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f460044d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f460045e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int d17 = j17 + b36.f.d(3, this.f460046f) + b36.f.d(4, this.f460047g);
            java.lang.String str7 = this.f460048h;
            if (str7 != null) {
                d17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f460049i;
            return str8 != null ? d17 + b36.f.j(6, str8) : d17;
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
        r45.k95 k95Var = (r45.k95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k95Var.f460044d = aVar2.k(intValue);
                return 0;
            case 2:
                k95Var.f460045e = aVar2.k(intValue);
                return 0;
            case 3:
                k95Var.f460046f = aVar2.f(intValue);
                return 0;
            case 4:
                k95Var.f460047g = aVar2.f(intValue);
                return 0;
            case 5:
                k95Var.f460048h = aVar2.k(intValue);
                return 0;
            case 6:
                k95Var.f460049i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
