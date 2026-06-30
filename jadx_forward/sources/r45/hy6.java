package r45;

/* loaded from: classes4.dex */
public class hy6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f458090d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458091e;

    /* renamed from: f, reason: collision with root package name */
    public int f458092f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458093g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458094h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hy6)) {
            return false;
        }
        r45.hy6 hy6Var = (r45.hy6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f458090d), java.lang.Integer.valueOf(hy6Var.f458090d)) && n51.f.a(this.f458091e, hy6Var.f458091e) && n51.f.a(java.lang.Integer.valueOf(this.f458092f), java.lang.Integer.valueOf(hy6Var.f458092f)) && n51.f.a(this.f458093g, hy6Var.f458093g) && n51.f.a(this.f458094h, hy6Var.f458094h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f458090d);
            java.lang.String str = this.f458091e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f458092f);
            java.lang.String str2 = this.f458093g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f458094h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f458090d) + 0;
            java.lang.String str4 = this.f458091e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int e18 = e17 + b36.f.e(3, this.f458092f);
            java.lang.String str5 = this.f458093g;
            if (str5 != null) {
                e18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f458094h;
            return str6 != null ? e18 + b36.f.j(6, str6) : e18;
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
        r45.hy6 hy6Var = (r45.hy6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hy6Var.f458090d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            hy6Var.f458091e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            hy6Var.f458092f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            hy6Var.f458093g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 6) {
            return -1;
        }
        hy6Var.f458094h = aVar2.k(intValue);
        return 0;
    }
}
