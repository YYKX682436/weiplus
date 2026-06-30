package m53;

/* loaded from: classes8.dex */
public class t3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405605d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405606e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405607f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.t3)) {
            return false;
        }
        m53.t3 t3Var = (m53.t3) fVar;
        return n51.f.a(this.f405605d, t3Var.f405605d) && n51.f.a(this.f405606e, t3Var.f405606e) && n51.f.a(this.f405607f, t3Var.f405607f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405605d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405606e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f405607f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f405605d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f405606e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f405607f;
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
        m53.t3 t3Var = (m53.t3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t3Var.f405605d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            t3Var.f405606e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        t3Var.f405607f = aVar2.k(intValue);
        return 0;
    }
}
