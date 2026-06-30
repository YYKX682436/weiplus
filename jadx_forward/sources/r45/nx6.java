package r45;

/* loaded from: classes4.dex */
public class nx6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463270d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463271e;

    /* renamed from: f, reason: collision with root package name */
    public long f463272f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nx6)) {
            return false;
        }
        r45.nx6 nx6Var = (r45.nx6) fVar;
        return n51.f.a(this.f463270d, nx6Var.f463270d) && n51.f.a(this.f463271e, nx6Var.f463271e) && n51.f.a(java.lang.Long.valueOf(this.f463272f), java.lang.Long.valueOf(nx6Var.f463272f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463270d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f463271e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f463272f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f463270d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f463271e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.h(3, this.f463272f);
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
        r45.nx6 nx6Var = (r45.nx6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nx6Var.f463270d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            nx6Var.f463271e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        nx6Var.f463272f = aVar2.i(intValue);
        return 0;
    }
}
