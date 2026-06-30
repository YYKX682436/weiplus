package r45;

/* loaded from: classes7.dex */
public class m8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461755d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461756e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f461757f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f461758g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f461759h;

    /* renamed from: i, reason: collision with root package name */
    public int f461760i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m8)) {
            return false;
        }
        r45.m8 m8Var = (r45.m8) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461755d), java.lang.Integer.valueOf(m8Var.f461755d)) && n51.f.a(this.f461756e, m8Var.f461756e) && n51.f.a(java.lang.Boolean.valueOf(this.f461757f), java.lang.Boolean.valueOf(m8Var.f461757f)) && n51.f.a(java.lang.Boolean.valueOf(this.f461758g), java.lang.Boolean.valueOf(m8Var.f461758g)) && n51.f.a(java.lang.Boolean.valueOf(this.f461759h), java.lang.Boolean.valueOf(m8Var.f461759h)) && n51.f.a(java.lang.Integer.valueOf(this.f461760i), java.lang.Integer.valueOf(m8Var.f461760i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461755d);
            java.lang.String str = this.f461756e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f461757f);
            fVar.a(4, this.f461758g);
            fVar.a(5, this.f461759h);
            fVar.e(6, this.f461760i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f461755d) + 0;
            java.lang.String str2 = this.f461756e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.a(3, this.f461757f) + b36.f.a(4, this.f461758g) + b36.f.a(5, this.f461759h) + b36.f.e(6, this.f461760i);
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
        r45.m8 m8Var = (r45.m8) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m8Var.f461755d = aVar2.g(intValue);
                return 0;
            case 2:
                m8Var.f461756e = aVar2.k(intValue);
                return 0;
            case 3:
                m8Var.f461757f = aVar2.c(intValue);
                return 0;
            case 4:
                m8Var.f461758g = aVar2.c(intValue);
                return 0;
            case 5:
                m8Var.f461759h = aVar2.c(intValue);
                return 0;
            case 6:
                m8Var.f461760i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
