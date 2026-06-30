package vr4;

/* loaded from: classes9.dex */
public class u0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f521336d;

    /* renamed from: e, reason: collision with root package name */
    public int f521337e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f521338f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof vr4.u0)) {
            return false;
        }
        vr4.u0 u0Var = (vr4.u0) fVar;
        return n51.f.a(this.f521336d, u0Var.f521336d) && n51.f.a(java.lang.Integer.valueOf(this.f521337e), java.lang.Integer.valueOf(u0Var.f521337e)) && n51.f.a(this.f521338f, u0Var.f521338f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f521336d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f521337e);
            java.lang.String str2 = this.f521338f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f521336d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f521337e);
            java.lang.String str4 = this.f521338f;
            return str4 != null ? j17 + b36.f.j(3, str4) : j17;
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
        vr4.u0 u0Var = (vr4.u0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            u0Var.f521336d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            u0Var.f521337e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        u0Var.f521338f = aVar2.k(intValue);
        return 0;
    }
}
