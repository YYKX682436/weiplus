package r45;

/* loaded from: classes7.dex */
public class od7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f463710d;

    /* renamed from: e, reason: collision with root package name */
    public int f463711e;

    /* renamed from: f, reason: collision with root package name */
    public int f463712f;

    /* renamed from: g, reason: collision with root package name */
    public int f463713g;

    /* renamed from: h, reason: collision with root package name */
    public int f463714h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.od7)) {
            return false;
        }
        r45.od7 od7Var = (r45.od7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f463710d), java.lang.Integer.valueOf(od7Var.f463710d)) && n51.f.a(java.lang.Integer.valueOf(this.f463711e), java.lang.Integer.valueOf(od7Var.f463711e)) && n51.f.a(java.lang.Integer.valueOf(this.f463712f), java.lang.Integer.valueOf(od7Var.f463712f)) && n51.f.a(java.lang.Integer.valueOf(this.f463713g), java.lang.Integer.valueOf(od7Var.f463713g)) && n51.f.a(java.lang.Integer.valueOf(this.f463714h), java.lang.Integer.valueOf(od7Var.f463714h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f463710d);
            fVar.e(2, this.f463711e);
            fVar.e(3, this.f463712f);
            fVar.e(5, this.f463713g);
            fVar.e(6, this.f463714h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f463710d) + 0 + b36.f.e(2, this.f463711e) + b36.f.e(3, this.f463712f) + b36.f.e(5, this.f463713g) + b36.f.e(6, this.f463714h);
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
        r45.od7 od7Var = (r45.od7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            od7Var.f463710d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            od7Var.f463711e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            od7Var.f463712f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            od7Var.f463713g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 6) {
            return -1;
        }
        od7Var.f463714h = aVar2.g(intValue);
        return 0;
    }
}
