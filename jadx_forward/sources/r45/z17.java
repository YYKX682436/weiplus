package r45;

/* loaded from: classes14.dex */
public class z17 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f473143d;

    /* renamed from: e, reason: collision with root package name */
    public long f473144e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473145f;

    /* renamed from: g, reason: collision with root package name */
    public int f473146g;

    /* renamed from: h, reason: collision with root package name */
    public r45.k37 f473147h;

    /* renamed from: i, reason: collision with root package name */
    public r45.k37 f473148i;

    /* renamed from: m, reason: collision with root package name */
    public int f473149m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f473150n;

    /* renamed from: o, reason: collision with root package name */
    public int f473151o;

    /* renamed from: p, reason: collision with root package name */
    public long f473152p;

    /* renamed from: q, reason: collision with root package name */
    public int f473153q;

    /* renamed from: r, reason: collision with root package name */
    public int f473154r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.LinkedList f473155s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public int f473156t;

    /* renamed from: u, reason: collision with root package name */
    public r45.n27 f473157u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z17)) {
            return false;
        }
        r45.z17 z17Var = (r45.z17) fVar;
        return n51.f.a(this.f76494x2de60e5e, z17Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f473143d), java.lang.Integer.valueOf(z17Var.f473143d)) && n51.f.a(java.lang.Long.valueOf(this.f473144e), java.lang.Long.valueOf(z17Var.f473144e)) && n51.f.a(this.f473145f, z17Var.f473145f) && n51.f.a(java.lang.Integer.valueOf(this.f473146g), java.lang.Integer.valueOf(z17Var.f473146g)) && n51.f.a(this.f473147h, z17Var.f473147h) && n51.f.a(this.f473148i, z17Var.f473148i) && n51.f.a(java.lang.Integer.valueOf(this.f473149m), java.lang.Integer.valueOf(z17Var.f473149m)) && n51.f.a(this.f473150n, z17Var.f473150n) && n51.f.a(java.lang.Integer.valueOf(this.f473151o), java.lang.Integer.valueOf(z17Var.f473151o)) && n51.f.a(java.lang.Long.valueOf(this.f473152p), java.lang.Long.valueOf(z17Var.f473152p)) && n51.f.a(java.lang.Integer.valueOf(this.f473153q), java.lang.Integer.valueOf(z17Var.f473153q)) && n51.f.a(java.lang.Integer.valueOf(this.f473154r), java.lang.Integer.valueOf(z17Var.f473154r)) && n51.f.a(this.f473155s, z17Var.f473155s) && n51.f.a(java.lang.Integer.valueOf(this.f473156t), java.lang.Integer.valueOf(z17Var.f473156t)) && n51.f.a(this.f473157u, z17Var.f473157u);
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
            fVar.e(2, this.f473143d);
            fVar.h(3, this.f473144e);
            java.lang.String str = this.f473145f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f473146g);
            r45.k37 k37Var = this.f473147h;
            if (k37Var != null) {
                fVar.i(6, k37Var.mo75928xcd1e8d8());
                this.f473147h.mo75956x3d5d1f78(fVar);
            }
            r45.k37 k37Var2 = this.f473148i;
            if (k37Var2 != null) {
                fVar.i(7, k37Var2.mo75928xcd1e8d8());
                this.f473148i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f473149m);
            java.lang.String str2 = this.f473150n;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            fVar.e(10, this.f473151o);
            fVar.h(11, this.f473152p);
            fVar.e(12, this.f473153q);
            fVar.e(13, this.f473154r);
            fVar.g(14, 8, this.f473155s);
            fVar.e(15, this.f473156t);
            r45.n27 n27Var = this.f473157u;
            if (n27Var != null) {
                fVar.i(16, n27Var.mo75928xcd1e8d8());
                this.f473157u.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f473143d) + b36.f.h(3, this.f473144e);
            java.lang.String str3 = this.f473145f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int e17 = i18 + b36.f.e(5, this.f473146g);
            r45.k37 k37Var3 = this.f473147h;
            if (k37Var3 != null) {
                e17 += b36.f.i(6, k37Var3.mo75928xcd1e8d8());
            }
            r45.k37 k37Var4 = this.f473148i;
            if (k37Var4 != null) {
                e17 += b36.f.i(7, k37Var4.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(8, this.f473149m);
            java.lang.String str4 = this.f473150n;
            if (str4 != null) {
                e18 += b36.f.j(9, str4);
            }
            int e19 = e18 + b36.f.e(10, this.f473151o) + b36.f.h(11, this.f473152p) + b36.f.e(12, this.f473153q) + b36.f.e(13, this.f473154r) + b36.f.g(14, 8, this.f473155s) + b36.f.e(15, this.f473156t);
            r45.n27 n27Var2 = this.f473157u;
            return n27Var2 != null ? e19 + b36.f.i(16, n27Var2.mo75928xcd1e8d8()) : e19;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f473155s.clear();
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
        r45.z17 z17Var = (r45.z17) objArr[1];
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
                    z17Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                z17Var.f473143d = aVar2.g(intValue);
                return 0;
            case 3:
                z17Var.f473144e = aVar2.i(intValue);
                return 0;
            case 4:
                z17Var.f473145f = aVar2.k(intValue);
                return 0;
            case 5:
                z17Var.f473146g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.k37 k37Var5 = new r45.k37();
                    if (bArr3 != null && bArr3.length > 0) {
                        k37Var5.mo11468x92b714fd(bArr3);
                    }
                    z17Var.f473147h = k37Var5;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.k37 k37Var6 = new r45.k37();
                    if (bArr4 != null && bArr4.length > 0) {
                        k37Var6.mo11468x92b714fd(bArr4);
                    }
                    z17Var.f473148i = k37Var6;
                }
                return 0;
            case 8:
                z17Var.f473149m = aVar2.g(intValue);
                return 0;
            case 9:
                z17Var.f473150n = aVar2.k(intValue);
                return 0;
            case 10:
                z17Var.f473151o = aVar2.g(intValue);
                return 0;
            case 11:
                z17Var.f473152p = aVar2.i(intValue);
                return 0;
            case 12:
                z17Var.f473153q = aVar2.g(intValue);
                return 0;
            case 13:
                z17Var.f473154r = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.et4 et4Var = new r45.et4();
                    if (bArr5 != null && bArr5.length > 0) {
                        et4Var.mo11468x92b714fd(bArr5);
                    }
                    z17Var.f473155s.add(et4Var);
                }
                return 0;
            case 15:
                z17Var.f473156t = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.n27 n27Var3 = new r45.n27();
                    if (bArr6 != null && bArr6.length > 0) {
                        n27Var3.mo11468x92b714fd(bArr6);
                    }
                    z17Var.f473157u = n27Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
