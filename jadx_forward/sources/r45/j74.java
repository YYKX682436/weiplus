package r45;

/* loaded from: classes2.dex */
public class j74 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f459156d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459157e;

    /* renamed from: f, reason: collision with root package name */
    public long f459158f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459159g;

    /* renamed from: h, reason: collision with root package name */
    public int f459160h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f459161i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j74)) {
            return false;
        }
        r45.j74 j74Var = (r45.j74) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f459156d), java.lang.Integer.valueOf(j74Var.f459156d)) && n51.f.a(this.f459157e, j74Var.f459157e) && n51.f.a(java.lang.Long.valueOf(this.f459158f), java.lang.Long.valueOf(j74Var.f459158f)) && n51.f.a(this.f459159g, j74Var.f459159g) && n51.f.a(java.lang.Integer.valueOf(this.f459160h), java.lang.Integer.valueOf(j74Var.f459160h)) && n51.f.a(this.f459161i, j74Var.f459161i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f459156d);
            java.lang.String str = this.f459157e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f459158f);
            java.lang.String str2 = this.f459159g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f459160h);
            java.lang.String str3 = this.f459161i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f459156d) + 0;
            java.lang.String str4 = this.f459157e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int h17 = e17 + b36.f.h(3, this.f459158f);
            java.lang.String str5 = this.f459159g;
            if (str5 != null) {
                h17 += b36.f.j(4, str5);
            }
            int e18 = h17 + b36.f.e(5, this.f459160h);
            java.lang.String str6 = this.f459161i;
            return str6 != null ? e18 + b36.f.j(6, str6) : e18;
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
        r45.j74 j74Var = (r45.j74) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                j74Var.f459156d = aVar2.g(intValue);
                return 0;
            case 2:
                j74Var.f459157e = aVar2.k(intValue);
                return 0;
            case 3:
                j74Var.f459158f = aVar2.i(intValue);
                return 0;
            case 4:
                j74Var.f459159g = aVar2.k(intValue);
                return 0;
            case 5:
                j74Var.f459160h = aVar2.g(intValue);
                return 0;
            case 6:
                j74Var.f459161i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
