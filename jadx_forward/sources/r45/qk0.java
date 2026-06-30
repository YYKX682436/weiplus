package r45;

/* loaded from: classes11.dex */
public class qk0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f465602d;

    /* renamed from: e, reason: collision with root package name */
    public int f465603e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465604f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465605g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f465606h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f465607i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f465608m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f465609n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qk0)) {
            return false;
        }
        r45.qk0 qk0Var = (r45.qk0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f465602d), java.lang.Integer.valueOf(qk0Var.f465602d)) && n51.f.a(java.lang.Integer.valueOf(this.f465603e), java.lang.Integer.valueOf(qk0Var.f465603e)) && n51.f.a(this.f465604f, qk0Var.f465604f) && n51.f.a(this.f465605g, qk0Var.f465605g) && n51.f.a(this.f465606h, qk0Var.f465606h) && n51.f.a(this.f465607i, qk0Var.f465607i) && n51.f.a(this.f465608m, qk0Var.f465608m) && n51.f.a(this.f465609n, qk0Var.f465609n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f465602d);
            fVar.e(2, this.f465603e);
            java.lang.String str = this.f465604f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f465605g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f465606h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f465607i;
            if (gVar2 != null) {
                fVar.b(6, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f465608m;
            if (gVar3 != null) {
                fVar.b(7, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f465609n;
            if (gVar4 != null) {
                fVar.b(8, gVar4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f465602d) + 0 + b36.f.e(2, this.f465603e);
            java.lang.String str3 = this.f465604f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f465605g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f465606h;
            if (gVar5 != null) {
                e17 += b36.f.b(5, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f465607i;
            if (gVar6 != null) {
                e17 += b36.f.b(6, gVar6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = this.f465608m;
            if (gVar7 != null) {
                e17 += b36.f.b(7, gVar7);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = this.f465609n;
            return gVar8 != null ? e17 + b36.f.b(8, gVar8) : e17;
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
        r45.qk0 qk0Var = (r45.qk0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qk0Var.f465602d = aVar2.g(intValue);
                return 0;
            case 2:
                qk0Var.f465603e = aVar2.g(intValue);
                return 0;
            case 3:
                qk0Var.f465604f = aVar2.k(intValue);
                return 0;
            case 4:
                qk0Var.f465605g = aVar2.k(intValue);
                return 0;
            case 5:
                qk0Var.f465606h = aVar2.d(intValue);
                return 0;
            case 6:
                qk0Var.f465607i = aVar2.d(intValue);
                return 0;
            case 7:
                qk0Var.f465608m = aVar2.d(intValue);
                return 0;
            case 8:
                qk0Var.f465609n = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
