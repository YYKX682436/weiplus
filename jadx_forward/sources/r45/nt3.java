package r45;

/* loaded from: classes2.dex */
public class nt3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463188d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463189e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463190f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463191g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463192h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nt3)) {
            return false;
        }
        r45.nt3 nt3Var = (r45.nt3) fVar;
        return n51.f.a(this.f463188d, nt3Var.f463188d) && n51.f.a(this.f463189e, nt3Var.f463189e) && n51.f.a(this.f463190f, nt3Var.f463190f) && n51.f.a(this.f463191g, nt3Var.f463191g) && n51.f.a(this.f463192h, nt3Var.f463192h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463188d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f463189e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f463190f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f463191g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f463192h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f463188d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f463189e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f463190f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f463191g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f463192h;
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
        r45.nt3 nt3Var = (r45.nt3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nt3Var.f463188d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            nt3Var.f463189e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            nt3Var.f463190f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            nt3Var.f463191g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        nt3Var.f463192h = aVar2.k(intValue);
        return 0;
    }
}
