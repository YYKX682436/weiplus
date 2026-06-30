package r45;

/* loaded from: classes8.dex */
public class m00 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461573d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461574e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461575f;

    /* renamed from: g, reason: collision with root package name */
    public int f461576g;

    /* renamed from: h, reason: collision with root package name */
    public int f461577h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461578i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f461579m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m00)) {
            return false;
        }
        r45.m00 m00Var = (r45.m00) fVar;
        return n51.f.a(this.f461573d, m00Var.f461573d) && n51.f.a(this.f461574e, m00Var.f461574e) && n51.f.a(this.f461575f, m00Var.f461575f) && n51.f.a(java.lang.Integer.valueOf(this.f461576g), java.lang.Integer.valueOf(m00Var.f461576g)) && n51.f.a(java.lang.Integer.valueOf(this.f461577h), java.lang.Integer.valueOf(m00Var.f461577h)) && n51.f.a(this.f461578i, m00Var.f461578i) && n51.f.a(this.f461579m, m00Var.f461579m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461573d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f461574e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f461575f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f461576g);
            fVar.e(5, this.f461577h);
            java.lang.String str4 = this.f461578i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f461579m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f461573d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f461574e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f461575f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f461576g) + b36.f.e(5, this.f461577h);
            java.lang.String str9 = this.f461578i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f461579m;
            return str10 != null ? e17 + b36.f.j(7, str10) : e17;
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
        r45.m00 m00Var = (r45.m00) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m00Var.f461573d = aVar2.k(intValue);
                return 0;
            case 2:
                m00Var.f461574e = aVar2.k(intValue);
                return 0;
            case 3:
                m00Var.f461575f = aVar2.k(intValue);
                return 0;
            case 4:
                m00Var.f461576g = aVar2.g(intValue);
                return 0;
            case 5:
                m00Var.f461577h = aVar2.g(intValue);
                return 0;
            case 6:
                m00Var.f461578i = aVar2.k(intValue);
                return 0;
            case 7:
                m00Var.f461579m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
