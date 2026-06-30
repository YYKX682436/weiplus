package r45;

/* loaded from: classes4.dex */
public class ka5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460094d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460095e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460096f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460097g;

    /* renamed from: h, reason: collision with root package name */
    public int f460098h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ka5)) {
            return false;
        }
        r45.ka5 ka5Var = (r45.ka5) fVar;
        return n51.f.a(this.f460094d, ka5Var.f460094d) && n51.f.a(this.f460095e, ka5Var.f460095e) && n51.f.a(this.f460096f, ka5Var.f460096f) && n51.f.a(this.f460097g, ka5Var.f460097g) && n51.f.a(java.lang.Integer.valueOf(this.f460098h), java.lang.Integer.valueOf(ka5Var.f460098h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460094d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f460095e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f460096f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f460097g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f460098h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f460094d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f460095e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f460096f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f460097g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f460098h);
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
        r45.ka5 ka5Var = (r45.ka5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ka5Var.f460094d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ka5Var.f460095e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ka5Var.f460096f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            ka5Var.f460097g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ka5Var.f460098h = aVar2.g(intValue);
        return 0;
    }
}
