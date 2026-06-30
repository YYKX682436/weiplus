package t45;

/* loaded from: classes2.dex */
public class m0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f497141d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f497142e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f497143f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f497144g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f497145h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof t45.m0)) {
            return false;
        }
        t45.m0 m0Var = (t45.m0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f497141d), java.lang.Boolean.valueOf(m0Var.f497141d)) && n51.f.a(this.f497142e, m0Var.f497142e) && n51.f.a(this.f497143f, m0Var.f497143f) && n51.f.a(this.f497144g, m0Var.f497144g) && n51.f.a(this.f497145h, m0Var.f497145h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f497141d);
            java.lang.String str = this.f497142e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f497143f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f497144g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f497145h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f497141d) + 0;
            java.lang.String str5 = this.f497142e;
            if (str5 != null) {
                a17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f497143f;
            if (str6 != null) {
                a17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f497144g;
            if (str7 != null) {
                a17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f497145h;
            return str8 != null ? a17 + b36.f.j(5, str8) : a17;
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
        t45.m0 m0Var = (t45.m0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            m0Var.f497141d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            m0Var.f497142e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            m0Var.f497143f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            m0Var.f497144g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        m0Var.f497145h = aVar2.k(intValue);
        return 0;
    }
}
