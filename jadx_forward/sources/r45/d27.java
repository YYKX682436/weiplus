package r45;

/* loaded from: classes14.dex */
public class d27 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453548d;

    /* renamed from: e, reason: collision with root package name */
    public int f453549e;

    /* renamed from: f, reason: collision with root package name */
    public int f453550f;

    /* renamed from: g, reason: collision with root package name */
    public r45.k37 f453551g;

    /* renamed from: h, reason: collision with root package name */
    public r45.k37 f453552h;

    /* renamed from: i, reason: collision with root package name */
    public long f453553i;

    /* renamed from: m, reason: collision with root package name */
    public int f453554m;

    /* renamed from: n, reason: collision with root package name */
    public long f453555n;

    /* renamed from: o, reason: collision with root package name */
    public int f453556o;

    /* renamed from: p, reason: collision with root package name */
    public int f453557p;

    /* renamed from: q, reason: collision with root package name */
    public int f453558q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.LinkedList f453559r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public int f453560s;

    /* renamed from: t, reason: collision with root package name */
    public r45.n27 f453561t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d27)) {
            return false;
        }
        r45.d27 d27Var = (r45.d27) fVar;
        return n51.f.a(this.f76494x2de60e5e, d27Var.f76494x2de60e5e) && n51.f.a(this.f453548d, d27Var.f453548d) && n51.f.a(java.lang.Integer.valueOf(this.f453549e), java.lang.Integer.valueOf(d27Var.f453549e)) && n51.f.a(java.lang.Integer.valueOf(this.f453550f), java.lang.Integer.valueOf(d27Var.f453550f)) && n51.f.a(this.f453551g, d27Var.f453551g) && n51.f.a(this.f453552h, d27Var.f453552h) && n51.f.a(java.lang.Long.valueOf(this.f453553i), java.lang.Long.valueOf(d27Var.f453553i)) && n51.f.a(java.lang.Integer.valueOf(this.f453554m), java.lang.Integer.valueOf(d27Var.f453554m)) && n51.f.a(java.lang.Long.valueOf(this.f453555n), java.lang.Long.valueOf(d27Var.f453555n)) && n51.f.a(java.lang.Integer.valueOf(this.f453556o), java.lang.Integer.valueOf(d27Var.f453556o)) && n51.f.a(java.lang.Integer.valueOf(this.f453557p), java.lang.Integer.valueOf(d27Var.f453557p)) && n51.f.a(java.lang.Integer.valueOf(this.f453558q), java.lang.Integer.valueOf(d27Var.f453558q)) && n51.f.a(this.f453559r, d27Var.f453559r) && n51.f.a(java.lang.Integer.valueOf(this.f453560s), java.lang.Integer.valueOf(d27Var.f453560s)) && n51.f.a(this.f453561t, d27Var.f453561t);
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
            java.lang.String str = this.f453548d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f453549e);
            fVar.e(4, this.f453550f);
            r45.k37 k37Var = this.f453551g;
            if (k37Var != null) {
                fVar.i(5, k37Var.mo75928xcd1e8d8());
                this.f453551g.mo75956x3d5d1f78(fVar);
            }
            r45.k37 k37Var2 = this.f453552h;
            if (k37Var2 != null) {
                fVar.i(6, k37Var2.mo75928xcd1e8d8());
                this.f453552h.mo75956x3d5d1f78(fVar);
            }
            fVar.h(7, this.f453553i);
            fVar.e(8, this.f453554m);
            fVar.h(9, this.f453555n);
            fVar.e(10, this.f453556o);
            fVar.e(11, this.f453557p);
            fVar.e(12, this.f453558q);
            fVar.g(13, 8, this.f453559r);
            fVar.e(14, this.f453560s);
            r45.n27 n27Var = this.f453561t;
            if (n27Var != null) {
                fVar.i(15, n27Var.mo75928xcd1e8d8());
                this.f453561t.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            java.lang.String str2 = this.f453548d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f453549e) + b36.f.e(4, this.f453550f);
            r45.k37 k37Var3 = this.f453551g;
            if (k37Var3 != null) {
                e17 += b36.f.i(5, k37Var3.mo75928xcd1e8d8());
            }
            r45.k37 k37Var4 = this.f453552h;
            if (k37Var4 != null) {
                e17 += b36.f.i(6, k37Var4.mo75928xcd1e8d8());
            }
            int h17 = e17 + b36.f.h(7, this.f453553i) + b36.f.e(8, this.f453554m) + b36.f.h(9, this.f453555n) + b36.f.e(10, this.f453556o) + b36.f.e(11, this.f453557p) + b36.f.e(12, this.f453558q) + b36.f.g(13, 8, this.f453559r) + b36.f.e(14, this.f453560s);
            r45.n27 n27Var2 = this.f453561t;
            return n27Var2 != null ? h17 + b36.f.i(15, n27Var2.mo75928xcd1e8d8()) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f453559r.clear();
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
        r45.d27 d27Var = (r45.d27) objArr[1];
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
                    d27Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                d27Var.f453548d = aVar2.k(intValue);
                return 0;
            case 3:
                d27Var.f453549e = aVar2.g(intValue);
                return 0;
            case 4:
                d27Var.f453550f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.k37 k37Var5 = new r45.k37();
                    if (bArr3 != null && bArr3.length > 0) {
                        k37Var5.mo11468x92b714fd(bArr3);
                    }
                    d27Var.f453551g = k37Var5;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.k37 k37Var6 = new r45.k37();
                    if (bArr4 != null && bArr4.length > 0) {
                        k37Var6.mo11468x92b714fd(bArr4);
                    }
                    d27Var.f453552h = k37Var6;
                }
                return 0;
            case 7:
                d27Var.f453553i = aVar2.i(intValue);
                return 0;
            case 8:
                d27Var.f453554m = aVar2.g(intValue);
                return 0;
            case 9:
                d27Var.f453555n = aVar2.i(intValue);
                return 0;
            case 10:
                d27Var.f453556o = aVar2.g(intValue);
                return 0;
            case 11:
                d27Var.f453557p = aVar2.g(intValue);
                return 0;
            case 12:
                d27Var.f453558q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.et4 et4Var = new r45.et4();
                    if (bArr5 != null && bArr5.length > 0) {
                        et4Var.mo11468x92b714fd(bArr5);
                    }
                    d27Var.f453559r.add(et4Var);
                }
                return 0;
            case 14:
                d27Var.f453560s = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.n27 n27Var3 = new r45.n27();
                    if (bArr6 != null && bArr6.length > 0) {
                        n27Var3.mo11468x92b714fd(bArr6);
                    }
                    d27Var.f453561t = n27Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
