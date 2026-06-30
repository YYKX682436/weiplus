package r45;

/* loaded from: classes4.dex */
public class f63 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455565d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455566e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455567f;

    /* renamed from: g, reason: collision with root package name */
    public int f455568g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455569h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f63)) {
            return false;
        }
        r45.f63 f63Var = (r45.f63) fVar;
        return n51.f.a(this.f455565d, f63Var.f455565d) && n51.f.a(this.f455566e, f63Var.f455566e) && n51.f.a(this.f455567f, f63Var.f455567f) && n51.f.a(java.lang.Integer.valueOf(this.f455568g), java.lang.Integer.valueOf(f63Var.f455568g)) && n51.f.a(this.f455569h, f63Var.f455569h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f455565d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f455566e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f455567f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f455568g);
            java.lang.String str4 = this.f455569h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f455565d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f455566e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f455567f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f455568g);
            java.lang.String str8 = this.f455569h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        r45.f63 f63Var = (r45.f63) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f63Var.f455565d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            f63Var.f455566e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            f63Var.f455567f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            f63Var.f455568g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        f63Var.f455569h = aVar2.k(intValue);
        return 0;
    }
}
