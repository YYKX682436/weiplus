package r45;

/* loaded from: classes4.dex */
public class iq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458794d;

    /* renamed from: e, reason: collision with root package name */
    public int f458795e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458796f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.iq0)) {
            return false;
        }
        r45.iq0 iq0Var = (r45.iq0) fVar;
        return n51.f.a(this.f458794d, iq0Var.f458794d) && n51.f.a(java.lang.Integer.valueOf(this.f458795e), java.lang.Integer.valueOf(iq0Var.f458795e)) && n51.f.a(this.f458796f, iq0Var.f458796f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458794d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f458795e);
            java.lang.String str2 = this.f458796f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f458794d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f458795e);
            java.lang.String str4 = this.f458796f;
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
        r45.iq0 iq0Var = (r45.iq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            iq0Var.f458794d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            iq0Var.f458795e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        iq0Var.f458796f = aVar2.k(intValue);
        return 0;
    }
}
