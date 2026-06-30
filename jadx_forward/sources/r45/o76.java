package r45;

/* loaded from: classes4.dex */
public class o76 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463540d;

    /* renamed from: e, reason: collision with root package name */
    public int f463541e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463542f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463543g;

    /* renamed from: h, reason: collision with root package name */
    public int f463544h;

    /* renamed from: i, reason: collision with root package name */
    public int f463545i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o76)) {
            return false;
        }
        r45.o76 o76Var = (r45.o76) fVar;
        return n51.f.a(this.f463540d, o76Var.f463540d) && n51.f.a(java.lang.Integer.valueOf(this.f463541e), java.lang.Integer.valueOf(o76Var.f463541e)) && n51.f.a(this.f463542f, o76Var.f463542f) && n51.f.a(this.f463543g, o76Var.f463543g) && n51.f.a(java.lang.Integer.valueOf(this.f463544h), java.lang.Integer.valueOf(o76Var.f463544h)) && n51.f.a(java.lang.Integer.valueOf(this.f463545i), java.lang.Integer.valueOf(o76Var.f463545i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463540d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f463541e);
            java.lang.String str2 = this.f463542f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f463543g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f463544h);
            fVar.e(6, this.f463545i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f463540d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f463541e);
            java.lang.String str5 = this.f463542f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f463543g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            return j17 + b36.f.e(5, this.f463544h) + b36.f.e(6, this.f463545i);
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
        r45.o76 o76Var = (r45.o76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                o76Var.f463540d = aVar2.k(intValue);
                return 0;
            case 2:
                o76Var.f463541e = aVar2.g(intValue);
                return 0;
            case 3:
                o76Var.f463542f = aVar2.k(intValue);
                return 0;
            case 4:
                o76Var.f463543g = aVar2.k(intValue);
                return 0;
            case 5:
                o76Var.f463544h = aVar2.g(intValue);
                return 0;
            case 6:
                o76Var.f463545i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
