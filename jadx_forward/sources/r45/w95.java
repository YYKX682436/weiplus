package r45;

/* loaded from: classes2.dex */
public class w95 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470520d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470521e;

    /* renamed from: f, reason: collision with root package name */
    public int f470522f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w95)) {
            return false;
        }
        r45.w95 w95Var = (r45.w95) fVar;
        return n51.f.a(this.f470520d, w95Var.f470520d) && n51.f.a(this.f470521e, w95Var.f470521e) && n51.f.a(java.lang.Integer.valueOf(this.f470522f), java.lang.Integer.valueOf(w95Var.f470522f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470520d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f470521e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f470522f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f470520d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f470521e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f470522f);
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
        r45.w95 w95Var = (r45.w95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            w95Var.f470520d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            w95Var.f470521e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        w95Var.f470522f = aVar2.g(intValue);
        return 0;
    }
}
