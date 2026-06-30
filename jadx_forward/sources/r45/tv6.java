package r45;

/* loaded from: classes7.dex */
public class tv6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f468355d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468356e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468357f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468358g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tv6)) {
            return false;
        }
        r45.tv6 tv6Var = (r45.tv6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f468355d), java.lang.Integer.valueOf(tv6Var.f468355d)) && n51.f.a(this.f468356e, tv6Var.f468356e) && n51.f.a(this.f468357f, tv6Var.f468357f) && n51.f.a(this.f468358g, tv6Var.f468358g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f468355d);
            java.lang.String str = this.f468356e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f468357f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f468358g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f468355d) + 0;
            java.lang.String str4 = this.f468356e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f468357f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f468358g;
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
        r45.tv6 tv6Var = (r45.tv6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tv6Var.f468355d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            tv6Var.f468356e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            tv6Var.f468357f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        tv6Var.f468358g = aVar2.k(intValue);
        return 0;
    }
}
