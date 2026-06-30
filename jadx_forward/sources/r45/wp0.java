package r45;

/* loaded from: classes9.dex */
public class wp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470892d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470893e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470894f;

    /* renamed from: g, reason: collision with root package name */
    public int f470895g;

    /* renamed from: h, reason: collision with root package name */
    public int f470896h;

    public r45.wp0 b(java.lang.String str) {
        this.f470894f = str;
        return this;
    }

    public r45.wp0 c(int i17) {
        this.f470896h = i17;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wp0)) {
            return false;
        }
        r45.wp0 wp0Var = (r45.wp0) fVar;
        return n51.f.a(this.f470892d, wp0Var.f470892d) && n51.f.a(this.f470893e, wp0Var.f470893e) && n51.f.a(this.f470894f, wp0Var.f470894f) && n51.f.a(java.lang.Integer.valueOf(this.f470895g), java.lang.Integer.valueOf(wp0Var.f470895g)) && n51.f.a(java.lang.Integer.valueOf(this.f470896h), java.lang.Integer.valueOf(wp0Var.f470896h));
    }

    public r45.wp0 d(int i17) {
        this.f470895g = i17;
        return this;
    }

    public r45.wp0 e(java.lang.String str) {
        this.f470893e = str;
        return this;
    }

    public r45.wp0 f(java.lang.String str) {
        this.f470892d = str;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470892d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f470893e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f470894f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f470895g);
            fVar.e(5, this.f470896h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f470892d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f470893e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f470894f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.e(4, this.f470895g) + b36.f.e(5, this.f470896h);
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
        r45.wp0 wp0Var = (r45.wp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wp0Var.f470892d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            wp0Var.f470893e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            wp0Var.f470894f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            wp0Var.f470895g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        wp0Var.f470896h = aVar2.g(intValue);
        return 0;
    }
}
