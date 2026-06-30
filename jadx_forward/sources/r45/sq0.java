package r45;

/* loaded from: classes9.dex */
public class sq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f467439d;

    /* renamed from: e, reason: collision with root package name */
    public int f467440e;

    /* renamed from: f, reason: collision with root package name */
    public int f467441f;

    /* renamed from: g, reason: collision with root package name */
    public int f467442g;

    /* renamed from: h, reason: collision with root package name */
    public int f467443h;

    /* renamed from: i, reason: collision with root package name */
    public int f467444i;

    /* renamed from: m, reason: collision with root package name */
    public int f467445m;

    /* renamed from: n, reason: collision with root package name */
    public int f467446n;

    /* renamed from: o, reason: collision with root package name */
    public int f467447o;

    /* renamed from: p, reason: collision with root package name */
    public int f467448p;

    /* renamed from: q, reason: collision with root package name */
    public int f467449q;

    /* renamed from: r, reason: collision with root package name */
    public int f467450r;

    /* renamed from: s, reason: collision with root package name */
    public int f467451s;

    /* renamed from: t, reason: collision with root package name */
    public int f467452t;

    /* renamed from: u, reason: collision with root package name */
    public int f467453u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sq0)) {
            return false;
        }
        r45.sq0 sq0Var = (r45.sq0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f467439d), java.lang.Integer.valueOf(sq0Var.f467439d)) && n51.f.a(java.lang.Integer.valueOf(this.f467440e), java.lang.Integer.valueOf(sq0Var.f467440e)) && n51.f.a(java.lang.Integer.valueOf(this.f467441f), java.lang.Integer.valueOf(sq0Var.f467441f)) && n51.f.a(java.lang.Integer.valueOf(this.f467442g), java.lang.Integer.valueOf(sq0Var.f467442g)) && n51.f.a(java.lang.Integer.valueOf(this.f467443h), java.lang.Integer.valueOf(sq0Var.f467443h)) && n51.f.a(java.lang.Integer.valueOf(this.f467444i), java.lang.Integer.valueOf(sq0Var.f467444i)) && n51.f.a(java.lang.Integer.valueOf(this.f467445m), java.lang.Integer.valueOf(sq0Var.f467445m)) && n51.f.a(java.lang.Integer.valueOf(this.f467446n), java.lang.Integer.valueOf(sq0Var.f467446n)) && n51.f.a(java.lang.Integer.valueOf(this.f467447o), java.lang.Integer.valueOf(sq0Var.f467447o)) && n51.f.a(java.lang.Integer.valueOf(this.f467448p), java.lang.Integer.valueOf(sq0Var.f467448p)) && n51.f.a(java.lang.Integer.valueOf(this.f467449q), java.lang.Integer.valueOf(sq0Var.f467449q)) && n51.f.a(java.lang.Integer.valueOf(this.f467450r), java.lang.Integer.valueOf(sq0Var.f467450r)) && n51.f.a(java.lang.Integer.valueOf(this.f467451s), java.lang.Integer.valueOf(sq0Var.f467451s)) && n51.f.a(java.lang.Integer.valueOf(this.f467452t), java.lang.Integer.valueOf(sq0Var.f467452t)) && n51.f.a(java.lang.Integer.valueOf(this.f467453u), java.lang.Integer.valueOf(sq0Var.f467453u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f467439d);
            fVar.e(2, this.f467440e);
            fVar.e(3, this.f467441f);
            fVar.e(4, this.f467442g);
            fVar.e(5, this.f467443h);
            fVar.e(6, this.f467444i);
            fVar.e(7, this.f467445m);
            fVar.e(8, this.f467446n);
            fVar.e(9, this.f467447o);
            fVar.e(10, this.f467448p);
            fVar.e(11, this.f467449q);
            fVar.e(12, this.f467450r);
            fVar.e(13, this.f467451s);
            fVar.e(14, this.f467452t);
            fVar.e(15, this.f467453u);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f467439d) + 0 + b36.f.e(2, this.f467440e) + b36.f.e(3, this.f467441f) + b36.f.e(4, this.f467442g) + b36.f.e(5, this.f467443h) + b36.f.e(6, this.f467444i) + b36.f.e(7, this.f467445m) + b36.f.e(8, this.f467446n) + b36.f.e(9, this.f467447o) + b36.f.e(10, this.f467448p) + b36.f.e(11, this.f467449q) + b36.f.e(12, this.f467450r) + b36.f.e(13, this.f467451s) + b36.f.e(14, this.f467452t) + b36.f.e(15, this.f467453u);
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
        r45.sq0 sq0Var = (r45.sq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                sq0Var.f467439d = aVar2.g(intValue);
                return 0;
            case 2:
                sq0Var.f467440e = aVar2.g(intValue);
                return 0;
            case 3:
                sq0Var.f467441f = aVar2.g(intValue);
                return 0;
            case 4:
                sq0Var.f467442g = aVar2.g(intValue);
                return 0;
            case 5:
                sq0Var.f467443h = aVar2.g(intValue);
                return 0;
            case 6:
                sq0Var.f467444i = aVar2.g(intValue);
                return 0;
            case 7:
                sq0Var.f467445m = aVar2.g(intValue);
                return 0;
            case 8:
                sq0Var.f467446n = aVar2.g(intValue);
                return 0;
            case 9:
                sq0Var.f467447o = aVar2.g(intValue);
                return 0;
            case 10:
                sq0Var.f467448p = aVar2.g(intValue);
                return 0;
            case 11:
                sq0Var.f467449q = aVar2.g(intValue);
                return 0;
            case 12:
                sq0Var.f467450r = aVar2.g(intValue);
                return 0;
            case 13:
                sq0Var.f467451s = aVar2.g(intValue);
                return 0;
            case 14:
                sq0Var.f467452t = aVar2.g(intValue);
                return 0;
            case 15:
                sq0Var.f467453u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
