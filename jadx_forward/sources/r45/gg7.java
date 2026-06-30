package r45;

/* loaded from: classes2.dex */
public class gg7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f456772d;

    /* renamed from: e, reason: collision with root package name */
    public int f456773e;

    /* renamed from: f, reason: collision with root package name */
    public int f456774f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456775g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gg7)) {
            return false;
        }
        r45.gg7 gg7Var = (r45.gg7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f456772d), java.lang.Integer.valueOf(gg7Var.f456772d)) && n51.f.a(java.lang.Integer.valueOf(this.f456773e), java.lang.Integer.valueOf(gg7Var.f456773e)) && n51.f.a(java.lang.Integer.valueOf(this.f456774f), java.lang.Integer.valueOf(gg7Var.f456774f)) && n51.f.a(this.f456775g, gg7Var.f456775g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f456772d);
            fVar.e(2, this.f456773e);
            fVar.e(3, this.f456774f);
            java.lang.String str = this.f456775g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f456772d) + 0 + b36.f.e(2, this.f456773e) + b36.f.e(3, this.f456774f);
            java.lang.String str2 = this.f456775g;
            return str2 != null ? e17 + b36.f.j(4, str2) : e17;
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
        r45.gg7 gg7Var = (r45.gg7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gg7Var.f456772d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            gg7Var.f456773e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            gg7Var.f456774f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        gg7Var.f456775g = aVar2.k(intValue);
        return 0;
    }
}
