package r45;

/* loaded from: classes4.dex */
public class y8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472379d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472380e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472381f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472382g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472383h;

    /* renamed from: i, reason: collision with root package name */
    public int f472384i;

    /* renamed from: m, reason: collision with root package name */
    public int f472385m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y8)) {
            return false;
        }
        r45.y8 y8Var = (r45.y8) fVar;
        return n51.f.a(this.f472379d, y8Var.f472379d) && n51.f.a(this.f472380e, y8Var.f472380e) && n51.f.a(this.f472381f, y8Var.f472381f) && n51.f.a(this.f472382g, y8Var.f472382g) && n51.f.a(this.f472383h, y8Var.f472383h) && n51.f.a(java.lang.Integer.valueOf(this.f472384i), java.lang.Integer.valueOf(y8Var.f472384i)) && n51.f.a(java.lang.Integer.valueOf(this.f472385m), java.lang.Integer.valueOf(y8Var.f472385m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472379d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472380e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f472381f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f472382g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f472383h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f472384i);
            fVar.e(7, this.f472385m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f472379d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f472380e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f472381f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f472382g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f472383h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            return j17 + b36.f.e(6, this.f472384i) + b36.f.e(7, this.f472385m);
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
        r45.y8 y8Var = (r45.y8) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y8Var.f472379d = aVar2.k(intValue);
                return 0;
            case 2:
                y8Var.f472380e = aVar2.k(intValue);
                return 0;
            case 3:
                y8Var.f472381f = aVar2.k(intValue);
                return 0;
            case 4:
                y8Var.f472382g = aVar2.k(intValue);
                return 0;
            case 5:
                y8Var.f472383h = aVar2.k(intValue);
                return 0;
            case 6:
                y8Var.f472384i = aVar2.g(intValue);
                return 0;
            case 7:
                y8Var.f472385m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
