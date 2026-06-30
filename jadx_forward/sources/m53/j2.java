package m53;

/* loaded from: classes7.dex */
public class j2 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f405344d;

    /* renamed from: e, reason: collision with root package name */
    public int f405345e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405346f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f405347g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f405348h;

    /* renamed from: i, reason: collision with root package name */
    public int f405349i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f405350m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.j2)) {
            return false;
        }
        m53.j2 j2Var = (m53.j2) fVar;
        return n51.f.a(this.f76494x2de60e5e, j2Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f405344d), java.lang.Integer.valueOf(j2Var.f405344d)) && n51.f.a(java.lang.Integer.valueOf(this.f405345e), java.lang.Integer.valueOf(j2Var.f405345e)) && n51.f.a(this.f405346f, j2Var.f405346f) && n51.f.a(this.f405347g, j2Var.f405347g) && n51.f.a(this.f405348h, j2Var.f405348h) && n51.f.a(java.lang.Integer.valueOf(this.f405349i), java.lang.Integer.valueOf(j2Var.f405349i)) && n51.f.a(java.lang.Boolean.valueOf(this.f405350m), java.lang.Boolean.valueOf(j2Var.f405350m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f405344d);
            fVar.e(3, this.f405345e);
            java.lang.String str = this.f405346f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.g(5, 1, this.f405347g);
            java.lang.String str2 = this.f405348h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f405349i);
            fVar.a(8, this.f405350m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f405344d) + b36.f.e(3, this.f405345e);
            java.lang.String str3 = this.f405346f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int g17 = i18 + b36.f.g(5, 1, this.f405347g);
            java.lang.String str4 = this.f405348h;
            if (str4 != null) {
                g17 += b36.f.j(6, str4);
            }
            return g17 + b36.f.e(7, this.f405349i) + b36.f.a(8, this.f405350m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f405347g.clear();
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
        m53.j2 j2Var = (m53.j2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    j2Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                j2Var.f405344d = aVar2.g(intValue);
                return 0;
            case 3:
                j2Var.f405345e = aVar2.g(intValue);
                return 0;
            case 4:
                j2Var.f405346f = aVar2.k(intValue);
                return 0;
            case 5:
                j2Var.f405347g.add(aVar2.k(intValue));
                return 0;
            case 6:
                j2Var.f405348h = aVar2.k(intValue);
                return 0;
            case 7:
                j2Var.f405349i = aVar2.g(intValue);
                return 0;
            case 8:
                j2Var.f405350m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
