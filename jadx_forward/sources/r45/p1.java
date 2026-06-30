package r45;

/* loaded from: classes8.dex */
public class p1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f464184d;

    /* renamed from: e, reason: collision with root package name */
    public int f464185e;

    /* renamed from: f, reason: collision with root package name */
    public int f464186f;

    /* renamed from: g, reason: collision with root package name */
    public int f464187g;

    /* renamed from: h, reason: collision with root package name */
    public int f464188h;

    /* renamed from: i, reason: collision with root package name */
    public int f464189i;

    /* renamed from: m, reason: collision with root package name */
    public int f464190m;

    /* renamed from: n, reason: collision with root package name */
    public int f464191n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p1)) {
            return false;
        }
        r45.p1 p1Var = (r45.p1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f464184d), java.lang.Integer.valueOf(p1Var.f464184d)) && n51.f.a(java.lang.Integer.valueOf(this.f464185e), java.lang.Integer.valueOf(p1Var.f464185e)) && n51.f.a(java.lang.Integer.valueOf(this.f464186f), java.lang.Integer.valueOf(p1Var.f464186f)) && n51.f.a(java.lang.Integer.valueOf(this.f464187g), java.lang.Integer.valueOf(p1Var.f464187g)) && n51.f.a(java.lang.Integer.valueOf(this.f464188h), java.lang.Integer.valueOf(p1Var.f464188h)) && n51.f.a(java.lang.Integer.valueOf(this.f464189i), java.lang.Integer.valueOf(p1Var.f464189i)) && n51.f.a(java.lang.Integer.valueOf(this.f464190m), java.lang.Integer.valueOf(p1Var.f464190m)) && n51.f.a(java.lang.Integer.valueOf(this.f464191n), java.lang.Integer.valueOf(p1Var.f464191n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f464184d);
            fVar.e(2, this.f464185e);
            fVar.e(3, this.f464186f);
            fVar.e(4, this.f464187g);
            fVar.e(5, this.f464188h);
            fVar.e(6, this.f464189i);
            fVar.e(7, this.f464190m);
            fVar.e(8, this.f464191n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f464184d) + 0 + b36.f.e(2, this.f464185e) + b36.f.e(3, this.f464186f) + b36.f.e(4, this.f464187g) + b36.f.e(5, this.f464188h) + b36.f.e(6, this.f464189i) + b36.f.e(7, this.f464190m) + b36.f.e(8, this.f464191n);
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
        r45.p1 p1Var = (r45.p1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p1Var.f464184d = aVar2.g(intValue);
                return 0;
            case 2:
                p1Var.f464185e = aVar2.g(intValue);
                return 0;
            case 3:
                p1Var.f464186f = aVar2.g(intValue);
                return 0;
            case 4:
                p1Var.f464187g = aVar2.g(intValue);
                return 0;
            case 5:
                p1Var.f464188h = aVar2.g(intValue);
                return 0;
            case 6:
                p1Var.f464189i = aVar2.g(intValue);
                return 0;
            case 7:
                p1Var.f464190m = aVar2.g(intValue);
                return 0;
            case 8:
                p1Var.f464191n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
