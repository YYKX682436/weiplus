package r45;

/* loaded from: classes12.dex */
public class i37 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f458237d;

    /* renamed from: e, reason: collision with root package name */
    public long f458238e;

    /* renamed from: f, reason: collision with root package name */
    public int f458239f;

    /* renamed from: g, reason: collision with root package name */
    public int f458240g;

    /* renamed from: h, reason: collision with root package name */
    public int f458241h;

    /* renamed from: m, reason: collision with root package name */
    public int f458243m;

    /* renamed from: n, reason: collision with root package name */
    public int f458244n;

    /* renamed from: p, reason: collision with root package name */
    public int f458246p;

    /* renamed from: q, reason: collision with root package name */
    public int f458247q;

    /* renamed from: r, reason: collision with root package name */
    public long f458248r;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f458242i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f458245o = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i37)) {
            return false;
        }
        r45.i37 i37Var = (r45.i37) fVar;
        return n51.f.a(this.f76494x2de60e5e, i37Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f458237d), java.lang.Integer.valueOf(i37Var.f458237d)) && n51.f.a(java.lang.Long.valueOf(this.f458238e), java.lang.Long.valueOf(i37Var.f458238e)) && n51.f.a(java.lang.Integer.valueOf(this.f458239f), java.lang.Integer.valueOf(i37Var.f458239f)) && n51.f.a(java.lang.Integer.valueOf(this.f458240g), java.lang.Integer.valueOf(i37Var.f458240g)) && n51.f.a(java.lang.Integer.valueOf(this.f458241h), java.lang.Integer.valueOf(i37Var.f458241h)) && n51.f.a(this.f458242i, i37Var.f458242i) && n51.f.a(java.lang.Integer.valueOf(this.f458243m), java.lang.Integer.valueOf(i37Var.f458243m)) && n51.f.a(java.lang.Integer.valueOf(this.f458244n), java.lang.Integer.valueOf(i37Var.f458244n)) && n51.f.a(this.f458245o, i37Var.f458245o) && n51.f.a(java.lang.Integer.valueOf(this.f458246p), java.lang.Integer.valueOf(i37Var.f458246p)) && n51.f.a(java.lang.Integer.valueOf(this.f458247q), java.lang.Integer.valueOf(i37Var.f458247q)) && n51.f.a(java.lang.Long.valueOf(this.f458248r), java.lang.Long.valueOf(i37Var.f458248r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f458242i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f458237d);
            fVar.h(3, this.f458238e);
            fVar.e(4, this.f458239f);
            fVar.e(5, this.f458240g);
            fVar.e(6, this.f458241h);
            fVar.g(7, 8, linkedList);
            fVar.e(8, this.f458243m);
            fVar.e(9, this.f458244n);
            fVar.g(10, 8, this.f458245o);
            fVar.e(11, this.f458246p);
            fVar.e(12, this.f458247q);
            fVar.h(14, this.f458248r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            return (heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f458237d) + b36.f.h(3, this.f458238e) + b36.f.e(4, this.f458239f) + b36.f.e(5, this.f458240g) + b36.f.e(6, this.f458241h) + b36.f.g(7, 8, linkedList) + b36.f.e(8, this.f458243m) + b36.f.e(9, this.f458244n) + b36.f.g(10, 8, this.f458245o) + b36.f.e(11, this.f458246p) + b36.f.e(12, this.f458247q) + b36.f.h(14, this.f458248r);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f458245o.clear();
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
        r45.i37 i37Var = (r45.i37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    i37Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                i37Var.f458237d = aVar2.g(intValue);
                return 0;
            case 3:
                i37Var.f458238e = aVar2.i(intValue);
                return 0;
            case 4:
                i37Var.f458239f = aVar2.g(intValue);
                return 0;
            case 5:
                i37Var.f458240g = aVar2.g(intValue);
                return 0;
            case 6:
                i37Var.f458241h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.l37 l37Var = new r45.l37();
                    if (bArr3 != null && bArr3.length > 0) {
                        l37Var.mo11468x92b714fd(bArr3);
                    }
                    i37Var.f458242i.add(l37Var);
                }
                return 0;
            case 8:
                i37Var.f458243m = aVar2.g(intValue);
                return 0;
            case 9:
                i37Var.f458244n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.et4 et4Var = new r45.et4();
                    if (bArr4 != null && bArr4.length > 0) {
                        et4Var.mo11468x92b714fd(bArr4);
                    }
                    i37Var.f458245o.add(et4Var);
                }
                return 0;
            case 11:
                i37Var.f458246p = aVar2.g(intValue);
                return 0;
            case 12:
                i37Var.f458247q = aVar2.g(intValue);
                return 0;
            case 13:
            default:
                return -1;
            case 14:
                i37Var.f458248r = aVar2.i(intValue);
                return 0;
        }
    }
}
