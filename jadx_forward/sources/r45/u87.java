package r45;

/* loaded from: classes7.dex */
public class u87 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f468671d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468672e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f468673f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f468674g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f468675h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f468676i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f468677m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f468678n = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u87)) {
            return false;
        }
        r45.u87 u87Var = (r45.u87) fVar;
        return n51.f.a(this.f76494x2de60e5e, u87Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f468671d), java.lang.Integer.valueOf(u87Var.f468671d)) && n51.f.a(this.f468672e, u87Var.f468672e) && n51.f.a(this.f468673f, u87Var.f468673f) && n51.f.a(java.lang.Integer.valueOf(this.f468674g), java.lang.Integer.valueOf(u87Var.f468674g)) && n51.f.a(java.lang.Integer.valueOf(this.f468675h), java.lang.Integer.valueOf(u87Var.f468675h)) && n51.f.a(java.lang.Integer.valueOf(this.f468676i), java.lang.Integer.valueOf(u87Var.f468676i)) && n51.f.a(java.lang.Integer.valueOf(this.f468677m), java.lang.Integer.valueOf(u87Var.f468677m)) && n51.f.a(java.lang.Integer.valueOf(this.f468678n), java.lang.Integer.valueOf(u87Var.f468678n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f468673f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f468671d);
            java.lang.String str = this.f468672e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            fVar.e(5, this.f468674g);
            fVar.e(6, this.f468675h);
            fVar.e(7, this.f468676i);
            fVar.e(8, this.f468677m);
            fVar.e(9, this.f468678n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f468671d);
            java.lang.String str2 = this.f468672e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.g(4, 8, linkedList) + b36.f.e(5, this.f468674g) + b36.f.e(6, this.f468675h) + b36.f.e(7, this.f468676i) + b36.f.e(8, this.f468677m) + b36.f.e(9, this.f468678n);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.u87 u87Var = (r45.u87) objArr[1];
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
                    u87Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                u87Var.f468671d = aVar2.g(intValue);
                return 0;
            case 3:
                u87Var.f468672e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.w87 w87Var = new r45.w87();
                    if (bArr3 != null && bArr3.length > 0) {
                        w87Var.mo11468x92b714fd(bArr3);
                    }
                    u87Var.f468673f.add(w87Var);
                }
                return 0;
            case 5:
                u87Var.f468674g = aVar2.g(intValue);
                return 0;
            case 6:
                u87Var.f468675h = aVar2.g(intValue);
                return 0;
            case 7:
                u87Var.f468676i = aVar2.g(intValue);
                return 0;
            case 8:
                u87Var.f468677m = aVar2.g(intValue);
                return 0;
            case 9:
                u87Var.f468678n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
