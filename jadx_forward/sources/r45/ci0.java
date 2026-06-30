package r45;

/* loaded from: classes10.dex */
public class ci0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453098d;

    /* renamed from: e, reason: collision with root package name */
    public int f453099e;

    /* renamed from: f, reason: collision with root package name */
    public int f453100f;

    /* renamed from: g, reason: collision with root package name */
    public int f453101g;

    /* renamed from: h, reason: collision with root package name */
    public int f453102h;

    /* renamed from: i, reason: collision with root package name */
    public float f453103i;

    /* renamed from: m, reason: collision with root package name */
    public int f453104m;

    /* renamed from: n, reason: collision with root package name */
    public int f453105n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ci0)) {
            return false;
        }
        r45.ci0 ci0Var = (r45.ci0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453098d), java.lang.Integer.valueOf(ci0Var.f453098d)) && n51.f.a(java.lang.Integer.valueOf(this.f453099e), java.lang.Integer.valueOf(ci0Var.f453099e)) && n51.f.a(java.lang.Integer.valueOf(this.f453100f), java.lang.Integer.valueOf(ci0Var.f453100f)) && n51.f.a(java.lang.Integer.valueOf(this.f453101g), java.lang.Integer.valueOf(ci0Var.f453101g)) && n51.f.a(java.lang.Integer.valueOf(this.f453102h), java.lang.Integer.valueOf(ci0Var.f453102h)) && n51.f.a(java.lang.Float.valueOf(this.f453103i), java.lang.Float.valueOf(ci0Var.f453103i)) && n51.f.a(java.lang.Integer.valueOf(this.f453104m), java.lang.Integer.valueOf(ci0Var.f453104m)) && n51.f.a(java.lang.Integer.valueOf(this.f453105n), java.lang.Integer.valueOf(ci0Var.f453105n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453098d);
            fVar.e(2, this.f453099e);
            fVar.e(3, this.f453100f);
            fVar.e(4, this.f453101g);
            fVar.e(5, this.f453102h);
            fVar.d(6, this.f453103i);
            fVar.e(7, this.f453104m);
            fVar.e(8, this.f453105n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f453098d) + 0 + b36.f.e(2, this.f453099e) + b36.f.e(3, this.f453100f) + b36.f.e(4, this.f453101g) + b36.f.e(5, this.f453102h) + b36.f.d(6, this.f453103i) + b36.f.e(7, this.f453104m) + b36.f.e(8, this.f453105n);
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
        r45.ci0 ci0Var = (r45.ci0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ci0Var.f453098d = aVar2.g(intValue);
                return 0;
            case 2:
                ci0Var.f453099e = aVar2.g(intValue);
                return 0;
            case 3:
                ci0Var.f453100f = aVar2.g(intValue);
                return 0;
            case 4:
                ci0Var.f453101g = aVar2.g(intValue);
                return 0;
            case 5:
                ci0Var.f453102h = aVar2.g(intValue);
                return 0;
            case 6:
                ci0Var.f453103i = aVar2.f(intValue);
                return 0;
            case 7:
                ci0Var.f453104m = aVar2.g(intValue);
                return 0;
            case 8:
                ci0Var.f453105n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
