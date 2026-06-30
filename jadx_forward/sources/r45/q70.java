package r45;

/* loaded from: classes8.dex */
public class q70 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f465252d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f465253e;

    /* renamed from: f, reason: collision with root package name */
    public int f465254f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465255g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f465256h;

    /* renamed from: i, reason: collision with root package name */
    public int f465257i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q70)) {
            return false;
        }
        r45.q70 q70Var = (r45.q70) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f465252d), java.lang.Integer.valueOf(q70Var.f465252d)) && n51.f.a(this.f465253e, q70Var.f465253e) && n51.f.a(java.lang.Integer.valueOf(this.f465254f), java.lang.Integer.valueOf(q70Var.f465254f)) && n51.f.a(this.f465255g, q70Var.f465255g) && n51.f.a(java.lang.Boolean.valueOf(this.f465256h), java.lang.Boolean.valueOf(q70Var.f465256h)) && n51.f.a(java.lang.Integer.valueOf(this.f465257i), java.lang.Integer.valueOf(q70Var.f465257i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f465252d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f465253e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f465254f);
            java.lang.String str = this.f465255g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.a(5, this.f465256h);
            fVar.e(6, this.f465257i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f465252d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f465253e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            int e18 = e17 + b36.f.e(3, this.f465254f);
            java.lang.String str2 = this.f465255g;
            if (str2 != null) {
                e18 += b36.f.j(4, str2);
            }
            return e18 + b36.f.a(5, this.f465256h) + b36.f.e(6, this.f465257i);
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
        r45.q70 q70Var = (r45.q70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q70Var.f465252d = aVar2.g(intValue);
                return 0;
            case 2:
                q70Var.f465253e = aVar2.d(intValue);
                return 0;
            case 3:
                q70Var.f465254f = aVar2.g(intValue);
                return 0;
            case 4:
                q70Var.f465255g = aVar2.k(intValue);
                return 0;
            case 5:
                q70Var.f465256h = aVar2.c(intValue);
                return 0;
            case 6:
                q70Var.f465257i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
