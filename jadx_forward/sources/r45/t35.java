package r45;

/* loaded from: classes9.dex */
public class t35 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f467627d;

    /* renamed from: e, reason: collision with root package name */
    public float f467628e;

    /* renamed from: f, reason: collision with root package name */
    public float f467629f;

    /* renamed from: g, reason: collision with root package name */
    public float f467630g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t35)) {
            return false;
        }
        r45.t35 t35Var = (r45.t35) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f467627d), java.lang.Float.valueOf(t35Var.f467627d)) && n51.f.a(java.lang.Float.valueOf(this.f467628e), java.lang.Float.valueOf(t35Var.f467628e)) && n51.f.a(java.lang.Float.valueOf(this.f467629f), java.lang.Float.valueOf(t35Var.f467629f)) && n51.f.a(java.lang.Float.valueOf(this.f467630g), java.lang.Float.valueOf(t35Var.f467630g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f467627d);
            fVar.d(2, this.f467628e);
            fVar.d(3, this.f467629f);
            fVar.d(4, this.f467630g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f467627d) + 0 + b36.f.d(2, this.f467628e) + b36.f.d(3, this.f467629f) + b36.f.d(4, this.f467630g);
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
        r45.t35 t35Var = (r45.t35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t35Var.f467627d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            t35Var.f467628e = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 3) {
            t35Var.f467629f = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        t35Var.f467630g = aVar2.f(intValue);
        return 0;
    }
}
