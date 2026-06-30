package r45;

/* loaded from: classes4.dex */
public class nn2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463057d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463058e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463059f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463060g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463061h;

    /* renamed from: i, reason: collision with root package name */
    public int f463062i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nn2)) {
            return false;
        }
        r45.nn2 nn2Var = (r45.nn2) fVar;
        return n51.f.a(this.f463057d, nn2Var.f463057d) && n51.f.a(this.f463058e, nn2Var.f463058e) && n51.f.a(this.f463059f, nn2Var.f463059f) && n51.f.a(this.f463060g, nn2Var.f463060g) && n51.f.a(this.f463061h, nn2Var.f463061h) && n51.f.a(java.lang.Integer.valueOf(this.f463062i), java.lang.Integer.valueOf(nn2Var.f463062i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463057d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f463058e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f463059f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f463060g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f463061h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f463062i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f463057d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f463058e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f463059f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f463060g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f463061h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            return j17 + b36.f.e(6, this.f463062i);
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
        r45.nn2 nn2Var = (r45.nn2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nn2Var.f463057d = aVar2.k(intValue);
                return 0;
            case 2:
                nn2Var.f463058e = aVar2.k(intValue);
                return 0;
            case 3:
                nn2Var.f463059f = aVar2.k(intValue);
                return 0;
            case 4:
                nn2Var.f463060g = aVar2.k(intValue);
                return 0;
            case 5:
                nn2Var.f463061h = aVar2.k(intValue);
                return 0;
            case 6:
                nn2Var.f463062i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
