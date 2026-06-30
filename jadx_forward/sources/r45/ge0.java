package r45;

/* loaded from: classes11.dex */
public class ge0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f456686d;

    /* renamed from: e, reason: collision with root package name */
    public int f456687e;

    /* renamed from: f, reason: collision with root package name */
    public int f456688f;

    /* renamed from: g, reason: collision with root package name */
    public int f456689g;

    /* renamed from: h, reason: collision with root package name */
    public int f456690h;

    /* renamed from: i, reason: collision with root package name */
    public int f456691i;

    /* renamed from: m, reason: collision with root package name */
    public int f456692m;

    /* renamed from: n, reason: collision with root package name */
    public int f456693n;

    /* renamed from: o, reason: collision with root package name */
    public int f456694o;

    /* renamed from: p, reason: collision with root package name */
    public int f456695p;

    /* renamed from: q, reason: collision with root package name */
    public int f456696q;

    /* renamed from: r, reason: collision with root package name */
    public int f456697r;

    /* renamed from: s, reason: collision with root package name */
    public int f456698s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ge0)) {
            return false;
        }
        r45.ge0 ge0Var = (r45.ge0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f456686d), java.lang.Integer.valueOf(ge0Var.f456686d)) && n51.f.a(java.lang.Integer.valueOf(this.f456687e), java.lang.Integer.valueOf(ge0Var.f456687e)) && n51.f.a(java.lang.Integer.valueOf(this.f456688f), java.lang.Integer.valueOf(ge0Var.f456688f)) && n51.f.a(java.lang.Integer.valueOf(this.f456689g), java.lang.Integer.valueOf(ge0Var.f456689g)) && n51.f.a(java.lang.Integer.valueOf(this.f456690h), java.lang.Integer.valueOf(ge0Var.f456690h)) && n51.f.a(java.lang.Integer.valueOf(this.f456691i), java.lang.Integer.valueOf(ge0Var.f456691i)) && n51.f.a(java.lang.Integer.valueOf(this.f456692m), java.lang.Integer.valueOf(ge0Var.f456692m)) && n51.f.a(java.lang.Integer.valueOf(this.f456693n), java.lang.Integer.valueOf(ge0Var.f456693n)) && n51.f.a(java.lang.Integer.valueOf(this.f456694o), java.lang.Integer.valueOf(ge0Var.f456694o)) && n51.f.a(java.lang.Integer.valueOf(this.f456695p), java.lang.Integer.valueOf(ge0Var.f456695p)) && n51.f.a(java.lang.Integer.valueOf(this.f456696q), java.lang.Integer.valueOf(ge0Var.f456696q)) && n51.f.a(java.lang.Integer.valueOf(this.f456697r), java.lang.Integer.valueOf(ge0Var.f456697r)) && n51.f.a(java.lang.Integer.valueOf(this.f456698s), java.lang.Integer.valueOf(ge0Var.f456698s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f456686d);
            fVar.e(2, this.f456687e);
            fVar.e(3, this.f456688f);
            fVar.e(4, this.f456689g);
            fVar.e(5, this.f456690h);
            fVar.e(6, this.f456691i);
            fVar.e(7, this.f456692m);
            fVar.e(8, this.f456693n);
            fVar.e(9, this.f456694o);
            fVar.e(10, this.f456695p);
            fVar.e(11, this.f456696q);
            fVar.e(12, this.f456697r);
            fVar.e(13, this.f456698s);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f456686d) + 0 + b36.f.e(2, this.f456687e) + b36.f.e(3, this.f456688f) + b36.f.e(4, this.f456689g) + b36.f.e(5, this.f456690h) + b36.f.e(6, this.f456691i) + b36.f.e(7, this.f456692m) + b36.f.e(8, this.f456693n) + b36.f.e(9, this.f456694o) + b36.f.e(10, this.f456695p) + b36.f.e(11, this.f456696q) + b36.f.e(12, this.f456697r) + b36.f.e(13, this.f456698s);
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
        r45.ge0 ge0Var = (r45.ge0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ge0Var.f456686d = aVar2.g(intValue);
                return 0;
            case 2:
                ge0Var.f456687e = aVar2.g(intValue);
                return 0;
            case 3:
                ge0Var.f456688f = aVar2.g(intValue);
                return 0;
            case 4:
                ge0Var.f456689g = aVar2.g(intValue);
                return 0;
            case 5:
                ge0Var.f456690h = aVar2.g(intValue);
                return 0;
            case 6:
                ge0Var.f456691i = aVar2.g(intValue);
                return 0;
            case 7:
                ge0Var.f456692m = aVar2.g(intValue);
                return 0;
            case 8:
                ge0Var.f456693n = aVar2.g(intValue);
                return 0;
            case 9:
                ge0Var.f456694o = aVar2.g(intValue);
                return 0;
            case 10:
                ge0Var.f456695p = aVar2.g(intValue);
                return 0;
            case 11:
                ge0Var.f456696q = aVar2.g(intValue);
                return 0;
            case 12:
                ge0Var.f456697r = aVar2.g(intValue);
                return 0;
            case 13:
                ge0Var.f456698s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
