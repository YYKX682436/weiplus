package r45;

/* loaded from: classes4.dex */
public class xm4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471769d;

    /* renamed from: e, reason: collision with root package name */
    public int f471770e;

    /* renamed from: f, reason: collision with root package name */
    public int f471771f;

    /* renamed from: g, reason: collision with root package name */
    public int f471772g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471773h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471774i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xm4)) {
            return false;
        }
        r45.xm4 xm4Var = (r45.xm4) fVar;
        return n51.f.a(this.f471769d, xm4Var.f471769d) && n51.f.a(java.lang.Integer.valueOf(this.f471770e), java.lang.Integer.valueOf(xm4Var.f471770e)) && n51.f.a(java.lang.Integer.valueOf(this.f471771f), java.lang.Integer.valueOf(xm4Var.f471771f)) && n51.f.a(java.lang.Integer.valueOf(this.f471772g), java.lang.Integer.valueOf(xm4Var.f471772g)) && n51.f.a(this.f471773h, xm4Var.f471773h) && n51.f.a(this.f471774i, xm4Var.f471774i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471769d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f471770e);
            fVar.e(3, this.f471771f);
            fVar.e(4, this.f471772g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f471773h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            java.lang.String str2 = this.f471774i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f471769d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f471770e) + b36.f.e(3, this.f471771f) + b36.f.e(4, this.f471772g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f471773h;
            if (gVar2 != null) {
                j17 += b36.f.b(5, gVar2);
            }
            java.lang.String str4 = this.f471774i;
            return str4 != null ? j17 + b36.f.j(6, str4) : j17;
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
        r45.xm4 xm4Var = (r45.xm4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xm4Var.f471769d = aVar2.k(intValue);
                return 0;
            case 2:
                xm4Var.f471770e = aVar2.g(intValue);
                return 0;
            case 3:
                xm4Var.f471771f = aVar2.g(intValue);
                return 0;
            case 4:
                xm4Var.f471772g = aVar2.g(intValue);
                return 0;
            case 5:
                xm4Var.f471773h = aVar2.d(intValue);
                return 0;
            case 6:
                xm4Var.f471774i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
