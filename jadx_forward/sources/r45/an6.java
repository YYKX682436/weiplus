package r45;

/* loaded from: classes9.dex */
public class an6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451689d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451690e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451691f;

    /* renamed from: g, reason: collision with root package name */
    public int f451692g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451693h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.an6)) {
            return false;
        }
        r45.an6 an6Var = (r45.an6) fVar;
        return n51.f.a(this.f451689d, an6Var.f451689d) && n51.f.a(this.f451690e, an6Var.f451690e) && n51.f.a(this.f451691f, an6Var.f451691f) && n51.f.a(java.lang.Integer.valueOf(this.f451692g), java.lang.Integer.valueOf(an6Var.f451692g)) && n51.f.a(this.f451693h, an6Var.f451693h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451689d;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f451690e;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f451691f;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f451692g);
            java.lang.String str4 = this.f451693h;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f451689d;
            int j17 = str5 != null ? 0 + b36.f.j(4, str5) : 0;
            java.lang.String str6 = this.f451690e;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f451691f;
            if (str7 != null) {
                j17 += b36.f.j(6, str7);
            }
            int e17 = j17 + b36.f.e(7, this.f451692g);
            java.lang.String str8 = this.f451693h;
            return str8 != null ? e17 + b36.f.j(8, str8) : e17;
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
        r45.an6 an6Var = (r45.an6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 4:
                an6Var.f451689d = aVar2.k(intValue);
                return 0;
            case 5:
                an6Var.f451690e = aVar2.k(intValue);
                return 0;
            case 6:
                an6Var.f451691f = aVar2.k(intValue);
                return 0;
            case 7:
                an6Var.f451692g = aVar2.g(intValue);
                return 0;
            case 8:
                an6Var.f451693h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
