package m53;

/* loaded from: classes4.dex */
public class f0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405201d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405202e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405203f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.f0)) {
            return false;
        }
        m53.f0 f0Var = (m53.f0) fVar;
        return n51.f.a(this.f405201d, f0Var.f405201d) && n51.f.a(this.f405202e, f0Var.f405202e) && n51.f.a(this.f405203f, f0Var.f405203f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405201d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405202e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f405203f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f405201d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f405202e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f405203f;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
        m53.f0 f0Var = (m53.f0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f0Var.f405201d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            f0Var.f405202e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        f0Var.f405203f = aVar2.k(intValue);
        return 0;
    }
}
