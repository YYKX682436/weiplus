package r45;

/* loaded from: classes4.dex */
public class rf7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f466350d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466351e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466352f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466353g;

    /* renamed from: h, reason: collision with root package name */
    public int f466354h;

    /* renamed from: i, reason: collision with root package name */
    public int f466355i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rf7)) {
            return false;
        }
        r45.rf7 rf7Var = (r45.rf7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f466350d), java.lang.Integer.valueOf(rf7Var.f466350d)) && n51.f.a(this.f466351e, rf7Var.f466351e) && n51.f.a(this.f466352f, rf7Var.f466352f) && n51.f.a(this.f466353g, rf7Var.f466353g) && n51.f.a(java.lang.Integer.valueOf(this.f466354h), java.lang.Integer.valueOf(rf7Var.f466354h)) && n51.f.a(java.lang.Integer.valueOf(this.f466355i), java.lang.Integer.valueOf(rf7Var.f466355i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f466350d);
            java.lang.String str = this.f466351e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f466352f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f466353g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f466354h);
            fVar.e(6, this.f466355i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f466350d) + 0;
            java.lang.String str4 = this.f466351e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f466352f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f466353g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            return e17 + b36.f.e(5, this.f466354h) + b36.f.e(6, this.f466355i);
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
        r45.rf7 rf7Var = (r45.rf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rf7Var.f466350d = aVar2.g(intValue);
                return 0;
            case 2:
                rf7Var.f466351e = aVar2.k(intValue);
                return 0;
            case 3:
                rf7Var.f466352f = aVar2.k(intValue);
                return 0;
            case 4:
                rf7Var.f466353g = aVar2.k(intValue);
                return 0;
            case 5:
                rf7Var.f466354h = aVar2.g(intValue);
                return 0;
            case 6:
                rf7Var.f466355i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
