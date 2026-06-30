package r45;

/* loaded from: classes4.dex */
public class a64 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451308d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451309e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451310f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a64)) {
            return false;
        }
        r45.a64 a64Var = (r45.a64) fVar;
        return n51.f.a(this.f451308d, a64Var.f451308d) && n51.f.a(this.f451309e, a64Var.f451309e) && n51.f.a(this.f451310f, a64Var.f451310f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451308d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f451309e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f451310f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f451308d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f451309e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f451310f;
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
        r45.a64 a64Var = (r45.a64) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a64Var.f451308d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            a64Var.f451309e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        a64Var.f451310f = aVar2.k(intValue);
        return 0;
    }
}
