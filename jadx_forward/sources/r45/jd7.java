package r45;

/* loaded from: classes7.dex */
public class jd7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459264d;

    /* renamed from: e, reason: collision with root package name */
    public int f459265e;

    /* renamed from: f, reason: collision with root package name */
    public int f459266f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f459267g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f459268h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f459269i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jd7)) {
            return false;
        }
        r45.jd7 jd7Var = (r45.jd7) fVar;
        return n51.f.a(this.f459264d, jd7Var.f459264d) && n51.f.a(java.lang.Integer.valueOf(this.f459265e), java.lang.Integer.valueOf(jd7Var.f459265e)) && n51.f.a(java.lang.Integer.valueOf(this.f459266f), java.lang.Integer.valueOf(jd7Var.f459266f)) && n51.f.a(this.f459267g, jd7Var.f459267g) && n51.f.a(this.f459268h, jd7Var.f459268h) && n51.f.a(this.f459269i, jd7Var.f459269i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459264d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f459265e);
            fVar.e(3, this.f459266f);
            java.lang.String str2 = this.f459267g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f459268h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f459269i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f459264d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f459265e) + b36.f.e(3, this.f459266f);
            java.lang.String str6 = this.f459267g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f459268h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f459269i;
            return str8 != null ? j17 + b36.f.j(6, str8) : j17;
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
        r45.jd7 jd7Var = (r45.jd7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jd7Var.f459264d = aVar2.k(intValue);
                return 0;
            case 2:
                jd7Var.f459265e = aVar2.g(intValue);
                return 0;
            case 3:
                jd7Var.f459266f = aVar2.g(intValue);
                return 0;
            case 4:
                jd7Var.f459267g = aVar2.k(intValue);
                return 0;
            case 5:
                jd7Var.f459268h = aVar2.k(intValue);
                return 0;
            case 6:
                jd7Var.f459269i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
