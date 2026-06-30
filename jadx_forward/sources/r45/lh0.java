package r45;

/* loaded from: classes4.dex */
public class lh0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461006d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461007e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461008f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461009g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461010h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461011i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lh0)) {
            return false;
        }
        r45.lh0 lh0Var = (r45.lh0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461006d), java.lang.Integer.valueOf(lh0Var.f461006d)) && n51.f.a(this.f461007e, lh0Var.f461007e) && n51.f.a(this.f461008f, lh0Var.f461008f) && n51.f.a(this.f461009g, lh0Var.f461009g) && n51.f.a(this.f461010h, lh0Var.f461010h) && n51.f.a(this.f461011i, lh0Var.f461011i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461006d);
            java.lang.String str = this.f461007e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f461008f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f461009g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f461010h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f461011i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f461006d) + 0;
            java.lang.String str6 = this.f461007e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f461008f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f461009g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f461010h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f461011i;
            return str10 != null ? e17 + b36.f.j(6, str10) : e17;
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
        r45.lh0 lh0Var = (r45.lh0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lh0Var.f461006d = aVar2.g(intValue);
                return 0;
            case 2:
                lh0Var.f461007e = aVar2.k(intValue);
                return 0;
            case 3:
                lh0Var.f461008f = aVar2.k(intValue);
                return 0;
            case 4:
                lh0Var.f461009g = aVar2.k(intValue);
                return 0;
            case 5:
                lh0Var.f461010h = aVar2.k(intValue);
                return 0;
            case 6:
                lh0Var.f461011i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
