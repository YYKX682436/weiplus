package r45;

/* loaded from: classes2.dex */
public class u95 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f468687d;

    /* renamed from: e, reason: collision with root package name */
    public float f468688e;

    /* renamed from: f, reason: collision with root package name */
    public float f468689f;

    /* renamed from: g, reason: collision with root package name */
    public float f468690g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u95)) {
            return false;
        }
        r45.u95 u95Var = (r45.u95) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f468687d), java.lang.Float.valueOf(u95Var.f468687d)) && n51.f.a(java.lang.Float.valueOf(this.f468688e), java.lang.Float.valueOf(u95Var.f468688e)) && n51.f.a(java.lang.Float.valueOf(this.f468689f), java.lang.Float.valueOf(u95Var.f468689f)) && n51.f.a(java.lang.Float.valueOf(this.f468690g), java.lang.Float.valueOf(u95Var.f468690g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f468687d);
            fVar.d(2, this.f468688e);
            fVar.d(3, this.f468689f);
            fVar.d(4, this.f468690g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f468687d) + 0 + b36.f.d(2, this.f468688e) + b36.f.d(3, this.f468689f) + b36.f.d(4, this.f468690g);
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
        r45.u95 u95Var = (r45.u95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            u95Var.f468687d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            u95Var.f468688e = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 3) {
            u95Var.f468689f = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        u95Var.f468690g = aVar2.f(intValue);
        return 0;
    }
}
