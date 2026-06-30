package r45;

/* loaded from: classes9.dex */
public class ev0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455270d;

    /* renamed from: e, reason: collision with root package name */
    public int f455271e;

    /* renamed from: f, reason: collision with root package name */
    public int f455272f;

    /* renamed from: g, reason: collision with root package name */
    public int f455273g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ev0)) {
            return false;
        }
        r45.ev0 ev0Var = (r45.ev0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455270d), java.lang.Integer.valueOf(ev0Var.f455270d)) && n51.f.a(java.lang.Integer.valueOf(this.f455271e), java.lang.Integer.valueOf(ev0Var.f455271e)) && n51.f.a(java.lang.Integer.valueOf(this.f455272f), java.lang.Integer.valueOf(ev0Var.f455272f)) && n51.f.a(java.lang.Integer.valueOf(this.f455273g), java.lang.Integer.valueOf(ev0Var.f455273g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455270d);
            fVar.e(2, this.f455271e);
            fVar.e(3, this.f455272f);
            fVar.e(4, this.f455273g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f455270d) + 0 + b36.f.e(2, this.f455271e) + b36.f.e(3, this.f455272f) + b36.f.e(4, this.f455273g);
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
        r45.ev0 ev0Var = (r45.ev0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ev0Var.f455270d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ev0Var.f455271e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ev0Var.f455272f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        ev0Var.f455273g = aVar2.g(intValue);
        return 0;
    }
}
