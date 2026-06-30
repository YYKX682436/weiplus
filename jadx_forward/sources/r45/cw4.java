package r45;

/* loaded from: classes15.dex */
public class cw4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453395d;

    /* renamed from: e, reason: collision with root package name */
    public int f453396e;

    /* renamed from: f, reason: collision with root package name */
    public int f453397f;

    /* renamed from: g, reason: collision with root package name */
    public int f453398g;

    /* renamed from: h, reason: collision with root package name */
    public int f453399h;

    /* renamed from: i, reason: collision with root package name */
    public int f453400i;

    /* renamed from: m, reason: collision with root package name */
    public int f453401m;

    /* renamed from: n, reason: collision with root package name */
    public int f453402n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cw4)) {
            return false;
        }
        r45.cw4 cw4Var = (r45.cw4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453395d), java.lang.Integer.valueOf(cw4Var.f453395d)) && n51.f.a(java.lang.Integer.valueOf(this.f453396e), java.lang.Integer.valueOf(cw4Var.f453396e)) && n51.f.a(java.lang.Integer.valueOf(this.f453397f), java.lang.Integer.valueOf(cw4Var.f453397f)) && n51.f.a(java.lang.Integer.valueOf(this.f453398g), java.lang.Integer.valueOf(cw4Var.f453398g)) && n51.f.a(java.lang.Integer.valueOf(this.f453399h), java.lang.Integer.valueOf(cw4Var.f453399h)) && n51.f.a(java.lang.Integer.valueOf(this.f453400i), java.lang.Integer.valueOf(cw4Var.f453400i)) && n51.f.a(java.lang.Integer.valueOf(this.f453401m), java.lang.Integer.valueOf(cw4Var.f453401m)) && n51.f.a(java.lang.Integer.valueOf(this.f453402n), java.lang.Integer.valueOf(cw4Var.f453402n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453395d);
            fVar.e(2, this.f453396e);
            fVar.e(3, this.f453397f);
            fVar.e(4, this.f453398g);
            fVar.e(5, this.f453399h);
            fVar.e(6, this.f453400i);
            fVar.e(7, this.f453401m);
            fVar.e(8, this.f453402n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f453395d) + 0 + b36.f.e(2, this.f453396e) + b36.f.e(3, this.f453397f) + b36.f.e(4, this.f453398g) + b36.f.e(5, this.f453399h) + b36.f.e(6, this.f453400i) + b36.f.e(7, this.f453401m) + b36.f.e(8, this.f453402n);
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
        r45.cw4 cw4Var = (r45.cw4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cw4Var.f453395d = aVar2.g(intValue);
                return 0;
            case 2:
                cw4Var.f453396e = aVar2.g(intValue);
                return 0;
            case 3:
                cw4Var.f453397f = aVar2.g(intValue);
                return 0;
            case 4:
                cw4Var.f453398g = aVar2.g(intValue);
                return 0;
            case 5:
                cw4Var.f453399h = aVar2.g(intValue);
                return 0;
            case 6:
                cw4Var.f453400i = aVar2.g(intValue);
                return 0;
            case 7:
                cw4Var.f453401m = aVar2.g(intValue);
                return 0;
            case 8:
                cw4Var.f453402n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
