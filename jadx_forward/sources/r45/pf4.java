package r45;

/* loaded from: classes8.dex */
public class pf4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f464536d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464537e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464538f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464539g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f464540h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public r45.of4 f464541i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pf4)) {
            return false;
        }
        r45.pf4 pf4Var = (r45.pf4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f464536d), java.lang.Integer.valueOf(pf4Var.f464536d)) && n51.f.a(this.f464537e, pf4Var.f464537e) && n51.f.a(this.f464538f, pf4Var.f464538f) && n51.f.a(this.f464539g, pf4Var.f464539g) && n51.f.a(this.f464540h, pf4Var.f464540h) && n51.f.a(this.f464541i, pf4Var.f464541i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f464536d);
            java.lang.String str = this.f464537e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f464538f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f464539g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.g(5, 2, this.f464540h);
            r45.of4 of4Var = this.f464541i;
            if (of4Var != null) {
                fVar.i(6, of4Var.mo75928xcd1e8d8());
                this.f464541i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f464536d) + 0;
            java.lang.String str4 = this.f464537e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f464538f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f464539g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            int g17 = e17 + b36.f.g(5, 2, this.f464540h);
            r45.of4 of4Var2 = this.f464541i;
            return of4Var2 != null ? g17 + b36.f.i(6, of4Var2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f464540h.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.pf4 pf4Var = (r45.pf4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pf4Var.f464536d = aVar2.g(intValue);
                return 0;
            case 2:
                pf4Var.f464537e = aVar2.k(intValue);
                return 0;
            case 3:
                pf4Var.f464538f = aVar2.k(intValue);
                return 0;
            case 4:
                pf4Var.f464539g = aVar2.k(intValue);
                return 0;
            case 5:
                pf4Var.f464540h.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.of4 of4Var3 = new r45.of4();
                    if (bArr2 != null && bArr2.length > 0) {
                        of4Var3.mo11468x92b714fd(bArr2);
                    }
                    pf4Var.f464541i = of4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
