package r45;

/* loaded from: classes8.dex */
public class xr6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f471895d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471896e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f471897f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471898g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xr6)) {
            return false;
        }
        r45.xr6 xr6Var = (r45.xr6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f471895d), java.lang.Integer.valueOf(xr6Var.f471895d)) && n51.f.a(this.f471896e, xr6Var.f471896e) && n51.f.a(this.f471897f, xr6Var.f471897f) && n51.f.a(this.f471898g, xr6Var.f471898g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f471895d);
            java.lang.String str = this.f471896e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f471897f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f471898g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f471895d) + 0;
            java.lang.String str4 = this.f471896e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f471897f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f471898g;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
        r45.xr6 xr6Var = (r45.xr6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xr6Var.f471895d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            xr6Var.f471896e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            xr6Var.f471897f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        xr6Var.f471898g = aVar2.k(intValue);
        return 0;
    }
}
