package r45;

/* loaded from: classes8.dex */
public class yo0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472784d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472785e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472786f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472787g;

    /* renamed from: h, reason: collision with root package name */
    public int f472788h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yo0)) {
            return false;
        }
        r45.yo0 yo0Var = (r45.yo0) fVar;
        return n51.f.a(this.f472784d, yo0Var.f472784d) && n51.f.a(this.f472785e, yo0Var.f472785e) && n51.f.a(this.f472786f, yo0Var.f472786f) && n51.f.a(this.f472787g, yo0Var.f472787g) && n51.f.a(java.lang.Integer.valueOf(this.f472788h), java.lang.Integer.valueOf(yo0Var.f472788h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472784d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472785e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f472786f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f472787g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f472788h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f472784d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f472785e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f472786f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f472787g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f472788h);
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
        r45.yo0 yo0Var = (r45.yo0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yo0Var.f472784d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            yo0Var.f472785e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            yo0Var.f472786f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            yo0Var.f472787g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        yo0Var.f472788h = aVar2.g(intValue);
        return 0;
    }
}
