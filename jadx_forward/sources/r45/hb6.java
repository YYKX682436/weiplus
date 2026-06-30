package r45;

/* loaded from: classes4.dex */
public class hb6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457557d;

    /* renamed from: e, reason: collision with root package name */
    public int f457558e;

    /* renamed from: f, reason: collision with root package name */
    public int f457559f;

    /* renamed from: g, reason: collision with root package name */
    public int f457560g;

    /* renamed from: h, reason: collision with root package name */
    public int f457561h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hb6)) {
            return false;
        }
        r45.hb6 hb6Var = (r45.hb6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457557d), java.lang.Integer.valueOf(hb6Var.f457557d)) && n51.f.a(java.lang.Integer.valueOf(this.f457558e), java.lang.Integer.valueOf(hb6Var.f457558e)) && n51.f.a(java.lang.Integer.valueOf(this.f457559f), java.lang.Integer.valueOf(hb6Var.f457559f)) && n51.f.a(java.lang.Integer.valueOf(this.f457560g), java.lang.Integer.valueOf(hb6Var.f457560g)) && n51.f.a(java.lang.Integer.valueOf(this.f457561h), java.lang.Integer.valueOf(hb6Var.f457561h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457557d);
            fVar.e(2, this.f457558e);
            fVar.e(3, this.f457559f);
            fVar.e(4, this.f457560g);
            fVar.e(5, this.f457561h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f457557d) + 0 + b36.f.e(2, this.f457558e) + b36.f.e(3, this.f457559f) + b36.f.e(4, this.f457560g) + b36.f.e(5, this.f457561h);
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
        r45.hb6 hb6Var = (r45.hb6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hb6Var.f457557d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            hb6Var.f457558e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            hb6Var.f457559f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            hb6Var.f457560g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        hb6Var.f457561h = aVar2.g(intValue);
        return 0;
    }
}
