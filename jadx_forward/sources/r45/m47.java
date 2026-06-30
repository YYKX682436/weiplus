package r45;

/* loaded from: classes7.dex */
public class m47 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461678d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461679e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461680f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461681g;

    /* renamed from: h, reason: collision with root package name */
    public int f461682h;

    /* renamed from: i, reason: collision with root package name */
    public float f461683i;

    /* renamed from: m, reason: collision with root package name */
    public float f461684m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f461685n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m47)) {
            return false;
        }
        r45.m47 m47Var = (r45.m47) fVar;
        return n51.f.a(this.f461678d, m47Var.f461678d) && n51.f.a(this.f461679e, m47Var.f461679e) && n51.f.a(this.f461680f, m47Var.f461680f) && n51.f.a(this.f461681g, m47Var.f461681g) && n51.f.a(java.lang.Integer.valueOf(this.f461682h), java.lang.Integer.valueOf(m47Var.f461682h)) && n51.f.a(java.lang.Float.valueOf(this.f461683i), java.lang.Float.valueOf(m47Var.f461683i)) && n51.f.a(java.lang.Float.valueOf(this.f461684m), java.lang.Float.valueOf(m47Var.f461684m)) && n51.f.a(this.f461685n, m47Var.f461685n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461678d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f461679e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f461680f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f461681g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f461682h);
            fVar.d(6, this.f461683i);
            fVar.d(7, this.f461684m);
            java.lang.String str5 = this.f461685n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f461678d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f461679e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f461680f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f461681g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f461682h) + b36.f.d(6, this.f461683i) + b36.f.d(7, this.f461684m);
            java.lang.String str10 = this.f461685n;
            return str10 != null ? e17 + b36.f.j(8, str10) : e17;
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
        r45.m47 m47Var = (r45.m47) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m47Var.f461678d = aVar2.k(intValue);
                return 0;
            case 2:
                m47Var.f461679e = aVar2.k(intValue);
                return 0;
            case 3:
                m47Var.f461680f = aVar2.k(intValue);
                return 0;
            case 4:
                m47Var.f461681g = aVar2.k(intValue);
                return 0;
            case 5:
                m47Var.f461682h = aVar2.g(intValue);
                return 0;
            case 6:
                m47Var.f461683i = aVar2.f(intValue);
                return 0;
            case 7:
                m47Var.f461684m = aVar2.f(intValue);
                return 0;
            case 8:
                m47Var.f461685n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
