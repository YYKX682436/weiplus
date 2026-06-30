package r45;

/* loaded from: classes8.dex */
public class xh6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f471644d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471645e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f471646f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xh6)) {
            return false;
        }
        r45.xh6 xh6Var = (r45.xh6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f471644d), java.lang.Integer.valueOf(xh6Var.f471644d)) && n51.f.a(this.f471645e, xh6Var.f471645e) && n51.f.a(this.f471646f, xh6Var.f471646f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f471644d);
            java.lang.String str = this.f471645e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f471646f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f471644d) + 0;
            java.lang.String str3 = this.f471645e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f471646f;
            return str4 != null ? e17 + b36.f.j(3, str4) : e17;
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
        r45.xh6 xh6Var = (r45.xh6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xh6Var.f471644d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            xh6Var.f471645e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        xh6Var.f471646f = aVar2.k(intValue);
        return 0;
    }
}
