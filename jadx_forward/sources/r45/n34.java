package r45;

/* loaded from: classes9.dex */
public class n34 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462581d;

    /* renamed from: e, reason: collision with root package name */
    public int f462582e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462583f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462584g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462585h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462586i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n34)) {
            return false;
        }
        r45.n34 n34Var = (r45.n34) fVar;
        return n51.f.a(this.f462581d, n34Var.f462581d) && n51.f.a(java.lang.Integer.valueOf(this.f462582e), java.lang.Integer.valueOf(n34Var.f462582e)) && n51.f.a(this.f462583f, n34Var.f462583f) && n51.f.a(this.f462584g, n34Var.f462584g) && n51.f.a(this.f462585h, n34Var.f462585h) && n51.f.a(this.f462586i, n34Var.f462586i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462581d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f462582e);
            java.lang.String str2 = this.f462583f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f462584g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f462585h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f462586i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f462581d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f462582e);
            java.lang.String str7 = this.f462583f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f462584g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f462585h;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f462586i;
            return str10 != null ? j17 + b36.f.j(6, str10) : j17;
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
        r45.n34 n34Var = (r45.n34) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n34Var.f462581d = aVar2.k(intValue);
                return 0;
            case 2:
                n34Var.f462582e = aVar2.g(intValue);
                return 0;
            case 3:
                n34Var.f462583f = aVar2.k(intValue);
                return 0;
            case 4:
                n34Var.f462584g = aVar2.k(intValue);
                return 0;
            case 5:
                n34Var.f462585h = aVar2.k(intValue);
                return 0;
            case 6:
                n34Var.f462586i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
