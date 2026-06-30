package r45;

/* loaded from: classes2.dex */
public class wa6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470547d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470548e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470549f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470550g;

    /* renamed from: h, reason: collision with root package name */
    public int f470551h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wa6)) {
            return false;
        }
        r45.wa6 wa6Var = (r45.wa6) fVar;
        return n51.f.a(this.f470547d, wa6Var.f470547d) && n51.f.a(this.f470548e, wa6Var.f470548e) && n51.f.a(this.f470549f, wa6Var.f470549f) && n51.f.a(this.f470550g, wa6Var.f470550g) && n51.f.a(java.lang.Integer.valueOf(this.f470551h), java.lang.Integer.valueOf(wa6Var.f470551h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470547d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f470548e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f470549f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f470550g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f470551h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f470547d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f470548e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f470549f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f470550g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f470551h);
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
        r45.wa6 wa6Var = (r45.wa6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wa6Var.f470547d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            wa6Var.f470548e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            wa6Var.f470549f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            wa6Var.f470550g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        wa6Var.f470551h = aVar2.g(intValue);
        return 0;
    }
}
