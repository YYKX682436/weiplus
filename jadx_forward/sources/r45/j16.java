package r45;

/* loaded from: classes9.dex */
public class j16 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f459029d;

    /* renamed from: e, reason: collision with root package name */
    public int f459030e;

    /* renamed from: f, reason: collision with root package name */
    public int f459031f;

    /* renamed from: g, reason: collision with root package name */
    public int f459032g;

    /* renamed from: h, reason: collision with root package name */
    public int f459033h;

    /* renamed from: i, reason: collision with root package name */
    public int f459034i;

    /* renamed from: m, reason: collision with root package name */
    public int f459035m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j16)) {
            return false;
        }
        r45.j16 j16Var = (r45.j16) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f459029d), java.lang.Integer.valueOf(j16Var.f459029d)) && n51.f.a(java.lang.Integer.valueOf(this.f459030e), java.lang.Integer.valueOf(j16Var.f459030e)) && n51.f.a(java.lang.Integer.valueOf(this.f459031f), java.lang.Integer.valueOf(j16Var.f459031f)) && n51.f.a(java.lang.Integer.valueOf(this.f459032g), java.lang.Integer.valueOf(j16Var.f459032g)) && n51.f.a(java.lang.Integer.valueOf(this.f459033h), java.lang.Integer.valueOf(j16Var.f459033h)) && n51.f.a(java.lang.Integer.valueOf(this.f459034i), java.lang.Integer.valueOf(j16Var.f459034i)) && n51.f.a(java.lang.Integer.valueOf(this.f459035m), java.lang.Integer.valueOf(j16Var.f459035m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f459029d);
            fVar.e(2, this.f459030e);
            fVar.e(3, this.f459031f);
            fVar.e(4, this.f459032g);
            fVar.e(5, this.f459033h);
            fVar.e(6, this.f459034i);
            fVar.e(7, this.f459035m);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f459029d) + 0 + b36.f.e(2, this.f459030e) + b36.f.e(3, this.f459031f) + b36.f.e(4, this.f459032g) + b36.f.e(5, this.f459033h) + b36.f.e(6, this.f459034i) + b36.f.e(7, this.f459035m);
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
        r45.j16 j16Var = (r45.j16) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                j16Var.f459029d = aVar2.g(intValue);
                return 0;
            case 2:
                j16Var.f459030e = aVar2.g(intValue);
                return 0;
            case 3:
                j16Var.f459031f = aVar2.g(intValue);
                return 0;
            case 4:
                j16Var.f459032g = aVar2.g(intValue);
                return 0;
            case 5:
                j16Var.f459033h = aVar2.g(intValue);
                return 0;
            case 6:
                j16Var.f459034i = aVar2.g(intValue);
                return 0;
            case 7:
                j16Var.f459035m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
