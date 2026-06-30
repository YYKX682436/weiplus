package r45;

/* loaded from: classes14.dex */
public class w27 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470341d;

    /* renamed from: e, reason: collision with root package name */
    public int f470342e;

    /* renamed from: g, reason: collision with root package name */
    public r45.k37 f470344g;

    /* renamed from: h, reason: collision with root package name */
    public r45.k37 f470345h;

    /* renamed from: i, reason: collision with root package name */
    public int f470346i;

    /* renamed from: m, reason: collision with root package name */
    public int f470347m;

    /* renamed from: n, reason: collision with root package name */
    public int f470348n;

    /* renamed from: o, reason: collision with root package name */
    public long f470349o;

    /* renamed from: p, reason: collision with root package name */
    public int f470350p;

    /* renamed from: q, reason: collision with root package name */
    public long f470351q;

    /* renamed from: r, reason: collision with root package name */
    public int f470352r;

    /* renamed from: s, reason: collision with root package name */
    public int f470353s;

    /* renamed from: t, reason: collision with root package name */
    public int f470354t;

    /* renamed from: u, reason: collision with root package name */
    public int f470355u;

    /* renamed from: w, reason: collision with root package name */
    public int f470357w;

    /* renamed from: x, reason: collision with root package name */
    public r45.n27 f470358x;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f470343f = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f470356v = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w27)) {
            return false;
        }
        r45.w27 w27Var = (r45.w27) fVar;
        return n51.f.a(this.f76494x2de60e5e, w27Var.f76494x2de60e5e) && n51.f.a(this.f470341d, w27Var.f470341d) && n51.f.a(java.lang.Integer.valueOf(this.f470342e), java.lang.Integer.valueOf(w27Var.f470342e)) && n51.f.a(this.f470343f, w27Var.f470343f) && n51.f.a(this.f470344g, w27Var.f470344g) && n51.f.a(this.f470345h, w27Var.f470345h) && n51.f.a(java.lang.Integer.valueOf(this.f470346i), java.lang.Integer.valueOf(w27Var.f470346i)) && n51.f.a(java.lang.Integer.valueOf(this.f470347m), java.lang.Integer.valueOf(w27Var.f470347m)) && n51.f.a(java.lang.Integer.valueOf(this.f470348n), java.lang.Integer.valueOf(w27Var.f470348n)) && n51.f.a(java.lang.Long.valueOf(this.f470349o), java.lang.Long.valueOf(w27Var.f470349o)) && n51.f.a(java.lang.Integer.valueOf(this.f470350p), java.lang.Integer.valueOf(w27Var.f470350p)) && n51.f.a(java.lang.Long.valueOf(this.f470351q), java.lang.Long.valueOf(w27Var.f470351q)) && n51.f.a(java.lang.Integer.valueOf(this.f470352r), java.lang.Integer.valueOf(w27Var.f470352r)) && n51.f.a(java.lang.Integer.valueOf(this.f470353s), java.lang.Integer.valueOf(w27Var.f470353s)) && n51.f.a(java.lang.Integer.valueOf(this.f470354t), java.lang.Integer.valueOf(w27Var.f470354t)) && n51.f.a(java.lang.Integer.valueOf(this.f470355u), java.lang.Integer.valueOf(w27Var.f470355u)) && n51.f.a(this.f470356v, w27Var.f470356v) && n51.f.a(java.lang.Integer.valueOf(this.f470357w), java.lang.Integer.valueOf(w27Var.f470357w)) && n51.f.a(this.f470358x, w27Var.f470358x);
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
            java.lang.String str = this.f470341d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f470342e);
            fVar.g(4, 8, this.f470343f);
            r45.k37 k37Var = this.f470344g;
            if (k37Var != null) {
                fVar.i(6, k37Var.mo75928xcd1e8d8());
                this.f470344g.mo75956x3d5d1f78(fVar);
            }
            r45.k37 k37Var2 = this.f470345h;
            if (k37Var2 != null) {
                fVar.i(7, k37Var2.mo75928xcd1e8d8());
                this.f470345h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f470346i);
            fVar.e(9, this.f470347m);
            fVar.e(10, this.f470348n);
            fVar.h(11, this.f470349o);
            fVar.e(12, this.f470350p);
            fVar.h(13, this.f470351q);
            fVar.e(14, this.f470352r);
            fVar.e(15, this.f470353s);
            fVar.e(16, this.f470354t);
            fVar.e(17, this.f470355u);
            fVar.g(18, 8, this.f470356v);
            fVar.e(19, this.f470357w);
            r45.n27 n27Var = this.f470358x;
            if (n27Var != null) {
                fVar.i(20, n27Var.mo75928xcd1e8d8());
                this.f470358x.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            java.lang.String str2 = this.f470341d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f470342e) + b36.f.g(4, 8, this.f470343f);
            r45.k37 k37Var3 = this.f470344g;
            if (k37Var3 != null) {
                e17 += b36.f.i(6, k37Var3.mo75928xcd1e8d8());
            }
            r45.k37 k37Var4 = this.f470345h;
            if (k37Var4 != null) {
                e17 += b36.f.i(7, k37Var4.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(8, this.f470346i) + b36.f.e(9, this.f470347m) + b36.f.e(10, this.f470348n) + b36.f.h(11, this.f470349o) + b36.f.e(12, this.f470350p) + b36.f.h(13, this.f470351q) + b36.f.e(14, this.f470352r) + b36.f.e(15, this.f470353s) + b36.f.e(16, this.f470354t) + b36.f.e(17, this.f470355u) + b36.f.g(18, 8, this.f470356v) + b36.f.e(19, this.f470357w);
            r45.n27 n27Var2 = this.f470358x;
            return n27Var2 != null ? e18 + b36.f.i(20, n27Var2.mo75928xcd1e8d8()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f470343f.clear();
            this.f470356v.clear();
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
        r45.w27 w27Var = (r45.w27) objArr[1];
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
                    w27Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                w27Var.f470341d = aVar2.k(intValue);
                return 0;
            case 3:
                w27Var.f470342e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var.b(bArr3);
                    }
                    w27Var.f470343f.add(du5Var);
                }
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.k37 k37Var5 = new r45.k37();
                    if (bArr4 != null && bArr4.length > 0) {
                        k37Var5.mo11468x92b714fd(bArr4);
                    }
                    w27Var.f470344g = k37Var5;
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.k37 k37Var6 = new r45.k37();
                    if (bArr5 != null && bArr5.length > 0) {
                        k37Var6.mo11468x92b714fd(bArr5);
                    }
                    w27Var.f470345h = k37Var6;
                }
                return 0;
            case 8:
                w27Var.f470346i = aVar2.g(intValue);
                return 0;
            case 9:
                w27Var.f470347m = aVar2.g(intValue);
                return 0;
            case 10:
                w27Var.f470348n = aVar2.g(intValue);
                return 0;
            case 11:
                w27Var.f470349o = aVar2.i(intValue);
                return 0;
            case 12:
                w27Var.f470350p = aVar2.g(intValue);
                return 0;
            case 13:
                w27Var.f470351q = aVar2.i(intValue);
                return 0;
            case 14:
                w27Var.f470352r = aVar2.g(intValue);
                return 0;
            case 15:
                w27Var.f470353s = aVar2.g(intValue);
                return 0;
            case 16:
                w27Var.f470354t = aVar2.g(intValue);
                return 0;
            case 17:
                w27Var.f470355u = aVar2.g(intValue);
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.et4 et4Var = new r45.et4();
                    if (bArr6 != null && bArr6.length > 0) {
                        et4Var.mo11468x92b714fd(bArr6);
                    }
                    w27Var.f470356v.add(et4Var);
                }
                return 0;
            case 19:
                w27Var.f470357w = aVar2.g(intValue);
                return 0;
            case 20:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.n27 n27Var3 = new r45.n27();
                    if (bArr7 != null && bArr7.length > 0) {
                        n27Var3.mo11468x92b714fd(bArr7);
                    }
                    w27Var.f470358x = n27Var3;
                }
                return 0;
        }
    }
}
