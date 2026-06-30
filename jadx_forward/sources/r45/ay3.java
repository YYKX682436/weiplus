package r45;

/* loaded from: classes15.dex */
public class ay3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f451895d;

    /* renamed from: e, reason: collision with root package name */
    public int f451896e;

    /* renamed from: f, reason: collision with root package name */
    public int f451897f;

    /* renamed from: g, reason: collision with root package name */
    public int f451898g;

    /* renamed from: h, reason: collision with root package name */
    public int f451899h;

    /* renamed from: i, reason: collision with root package name */
    public int f451900i;

    /* renamed from: m, reason: collision with root package name */
    public int f451901m;

    /* renamed from: n, reason: collision with root package name */
    public int f451902n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ay3)) {
            return false;
        }
        r45.ay3 ay3Var = (r45.ay3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f451895d), java.lang.Integer.valueOf(ay3Var.f451895d)) && n51.f.a(java.lang.Integer.valueOf(this.f451896e), java.lang.Integer.valueOf(ay3Var.f451896e)) && n51.f.a(java.lang.Integer.valueOf(this.f451897f), java.lang.Integer.valueOf(ay3Var.f451897f)) && n51.f.a(java.lang.Integer.valueOf(this.f451898g), java.lang.Integer.valueOf(ay3Var.f451898g)) && n51.f.a(java.lang.Integer.valueOf(this.f451899h), java.lang.Integer.valueOf(ay3Var.f451899h)) && n51.f.a(java.lang.Integer.valueOf(this.f451900i), java.lang.Integer.valueOf(ay3Var.f451900i)) && n51.f.a(java.lang.Integer.valueOf(this.f451901m), java.lang.Integer.valueOf(ay3Var.f451901m)) && n51.f.a(java.lang.Integer.valueOf(this.f451902n), java.lang.Integer.valueOf(ay3Var.f451902n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f451895d);
            fVar.e(2, this.f451896e);
            fVar.e(3, this.f451897f);
            fVar.e(4, this.f451898g);
            fVar.e(5, this.f451899h);
            fVar.e(6, this.f451900i);
            fVar.e(7, this.f451901m);
            fVar.e(8, this.f451902n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f451895d) + 0 + b36.f.e(2, this.f451896e) + b36.f.e(3, this.f451897f) + b36.f.e(4, this.f451898g) + b36.f.e(5, this.f451899h) + b36.f.e(6, this.f451900i) + b36.f.e(7, this.f451901m) + b36.f.e(8, this.f451902n);
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
        r45.ay3 ay3Var = (r45.ay3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ay3Var.f451895d = aVar2.g(intValue);
                return 0;
            case 2:
                ay3Var.f451896e = aVar2.g(intValue);
                return 0;
            case 3:
                ay3Var.f451897f = aVar2.g(intValue);
                return 0;
            case 4:
                ay3Var.f451898g = aVar2.g(intValue);
                return 0;
            case 5:
                ay3Var.f451899h = aVar2.g(intValue);
                return 0;
            case 6:
                ay3Var.f451900i = aVar2.g(intValue);
                return 0;
            case 7:
                ay3Var.f451901m = aVar2.g(intValue);
                return 0;
            case 8:
                ay3Var.f451902n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
