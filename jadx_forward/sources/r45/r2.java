package r45;

/* loaded from: classes4.dex */
public class r2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f465984d;

    /* renamed from: e, reason: collision with root package name */
    public float f465985e;

    /* renamed from: f, reason: collision with root package name */
    public float f465986f;

    /* renamed from: g, reason: collision with root package name */
    public float f465987g;

    /* renamed from: h, reason: collision with root package name */
    public float f465988h;

    /* renamed from: i, reason: collision with root package name */
    public float f465989i;

    /* renamed from: m, reason: collision with root package name */
    public float f465990m;

    /* renamed from: n, reason: collision with root package name */
    public float f465991n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r2)) {
            return false;
        }
        r45.r2 r2Var = (r45.r2) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f465984d), java.lang.Float.valueOf(r2Var.f465984d)) && n51.f.a(java.lang.Float.valueOf(this.f465985e), java.lang.Float.valueOf(r2Var.f465985e)) && n51.f.a(java.lang.Float.valueOf(this.f465986f), java.lang.Float.valueOf(r2Var.f465986f)) && n51.f.a(java.lang.Float.valueOf(this.f465987g), java.lang.Float.valueOf(r2Var.f465987g)) && n51.f.a(java.lang.Float.valueOf(this.f465988h), java.lang.Float.valueOf(r2Var.f465988h)) && n51.f.a(java.lang.Float.valueOf(this.f465989i), java.lang.Float.valueOf(r2Var.f465989i)) && n51.f.a(java.lang.Float.valueOf(this.f465990m), java.lang.Float.valueOf(r2Var.f465990m)) && n51.f.a(java.lang.Float.valueOf(this.f465991n), java.lang.Float.valueOf(r2Var.f465991n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f465984d);
            fVar.d(2, this.f465985e);
            fVar.d(3, this.f465986f);
            fVar.d(4, this.f465987g);
            fVar.d(5, this.f465988h);
            fVar.d(6, this.f465989i);
            fVar.d(7, this.f465990m);
            fVar.d(8, this.f465991n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f465984d) + 0 + b36.f.d(2, this.f465985e) + b36.f.d(3, this.f465986f) + b36.f.d(4, this.f465987g) + b36.f.d(5, this.f465988h) + b36.f.d(6, this.f465989i) + b36.f.d(7, this.f465990m) + b36.f.d(8, this.f465991n);
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
        r45.r2 r2Var = (r45.r2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                r2Var.f465984d = aVar2.f(intValue);
                return 0;
            case 2:
                r2Var.f465985e = aVar2.f(intValue);
                return 0;
            case 3:
                r2Var.f465986f = aVar2.f(intValue);
                return 0;
            case 4:
                r2Var.f465987g = aVar2.f(intValue);
                return 0;
            case 5:
                r2Var.f465988h = aVar2.f(intValue);
                return 0;
            case 6:
                r2Var.f465989i = aVar2.f(intValue);
                return 0;
            case 7:
                r2Var.f465990m = aVar2.f(intValue);
                return 0;
            case 8:
                r2Var.f465991n = aVar2.f(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
