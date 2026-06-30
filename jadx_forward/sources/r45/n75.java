package r45;

/* loaded from: classes9.dex */
public class n75 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462667d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462668e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462669f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462670g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462671h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f462672i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462673m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n75)) {
            return false;
        }
        r45.n75 n75Var = (r45.n75) fVar;
        return n51.f.a(this.f462667d, n75Var.f462667d) && n51.f.a(this.f462668e, n75Var.f462668e) && n51.f.a(this.f462669f, n75Var.f462669f) && n51.f.a(this.f462670g, n75Var.f462670g) && n51.f.a(this.f462671h, n75Var.f462671h) && n51.f.a(java.lang.Boolean.valueOf(this.f462672i), java.lang.Boolean.valueOf(n75Var.f462672i)) && n51.f.a(this.f462673m, n75Var.f462673m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462667d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f462668e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f462669f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f462670g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f462671h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.a(6, this.f462672i);
            java.lang.String str6 = this.f462673m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f462667d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f462668e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f462669f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f462670g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f462671h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            int a17 = j17 + b36.f.a(6, this.f462672i);
            java.lang.String str12 = this.f462673m;
            return str12 != null ? a17 + b36.f.j(7, str12) : a17;
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
        r45.n75 n75Var = (r45.n75) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n75Var.f462667d = aVar2.k(intValue);
                return 0;
            case 2:
                n75Var.f462668e = aVar2.k(intValue);
                return 0;
            case 3:
                n75Var.f462669f = aVar2.k(intValue);
                return 0;
            case 4:
                n75Var.f462670g = aVar2.k(intValue);
                return 0;
            case 5:
                n75Var.f462671h = aVar2.k(intValue);
                return 0;
            case 6:
                n75Var.f462672i = aVar2.c(intValue);
                return 0;
            case 7:
                n75Var.f462673m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
