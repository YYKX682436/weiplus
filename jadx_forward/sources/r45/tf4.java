package r45;

/* loaded from: classes9.dex */
public class tf4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f467906d;

    /* renamed from: e, reason: collision with root package name */
    public float f467907e;

    /* renamed from: f, reason: collision with root package name */
    public float f467908f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467909g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467910h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tf4)) {
            return false;
        }
        r45.tf4 tf4Var = (r45.tf4) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f467906d), java.lang.Float.valueOf(tf4Var.f467906d)) && n51.f.a(java.lang.Float.valueOf(this.f467907e), java.lang.Float.valueOf(tf4Var.f467907e)) && n51.f.a(java.lang.Float.valueOf(this.f467908f), java.lang.Float.valueOf(tf4Var.f467908f)) && n51.f.a(this.f467909g, tf4Var.f467909g) && n51.f.a(this.f467910h, tf4Var.f467910h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f467906d);
            fVar.d(2, this.f467907e);
            fVar.d(3, this.f467908f);
            java.lang.String str = this.f467909g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f467910h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f467906d) + 0 + b36.f.d(2, this.f467907e) + b36.f.d(3, this.f467908f);
            java.lang.String str3 = this.f467909g;
            if (str3 != null) {
                d17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f467910h;
            return str4 != null ? d17 + b36.f.j(5, str4) : d17;
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
        r45.tf4 tf4Var = (r45.tf4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tf4Var.f467906d = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            tf4Var.f467907e = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 3) {
            tf4Var.f467908f = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 4) {
            tf4Var.f467909g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        tf4Var.f467910h = aVar2.k(intValue);
        return 0;
    }
}
