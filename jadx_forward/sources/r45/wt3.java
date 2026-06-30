package r45;

/* loaded from: classes2.dex */
public class wt3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f470978d;

    /* renamed from: e, reason: collision with root package name */
    public int f470979e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f470980f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f470981g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wt3)) {
            return false;
        }
        r45.wt3 wt3Var = (r45.wt3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f470978d), java.lang.Integer.valueOf(wt3Var.f470978d)) && n51.f.a(java.lang.Integer.valueOf(this.f470979e), java.lang.Integer.valueOf(wt3Var.f470979e)) && n51.f.a(java.lang.Boolean.valueOf(this.f470980f), java.lang.Boolean.valueOf(wt3Var.f470980f)) && n51.f.a(java.lang.Boolean.valueOf(this.f470981g), java.lang.Boolean.valueOf(wt3Var.f470981g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f470978d);
            fVar.e(2, this.f470979e);
            fVar.a(3, this.f470980f);
            fVar.a(4, this.f470981g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f470978d) + 0 + b36.f.e(2, this.f470979e) + b36.f.a(3, this.f470980f) + b36.f.a(4, this.f470981g);
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
        r45.wt3 wt3Var = (r45.wt3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wt3Var.f470978d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            wt3Var.f470979e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            wt3Var.f470980f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        wt3Var.f470981g = aVar2.c(intValue);
        return 0;
    }
}
