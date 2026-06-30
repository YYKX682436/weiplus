package r45;

/* loaded from: classes9.dex */
public class fu5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456133d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456134e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456135f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456136g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456137h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fu5)) {
            return false;
        }
        r45.fu5 fu5Var = (r45.fu5) fVar;
        return n51.f.a(this.f456133d, fu5Var.f456133d) && n51.f.a(this.f456134e, fu5Var.f456134e) && n51.f.a(this.f456135f, fu5Var.f456135f) && n51.f.a(this.f456136g, fu5Var.f456136g) && n51.f.a(this.f456137h, fu5Var.f456137h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456133d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f456134e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f456135f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f456136g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f456137h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f456133d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f456134e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f456135f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f456136g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f456137h;
            return str10 != null ? j17 + b36.f.j(5, str10) : j17;
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
        r45.fu5 fu5Var = (r45.fu5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fu5Var.f456133d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            fu5Var.f456134e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            fu5Var.f456135f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            fu5Var.f456136g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        fu5Var.f456137h = aVar2.k(intValue);
        return 0;
    }
}
