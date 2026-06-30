package r45;

/* loaded from: classes7.dex */
public class t47 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467674d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467675e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467676f;

    /* renamed from: g, reason: collision with root package name */
    public long f467677g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t47)) {
            return false;
        }
        r45.t47 t47Var = (r45.t47) fVar;
        return n51.f.a(this.f467674d, t47Var.f467674d) && n51.f.a(this.f467675e, t47Var.f467675e) && n51.f.a(this.f467676f, t47Var.f467676f) && n51.f.a(java.lang.Long.valueOf(this.f467677g), java.lang.Long.valueOf(t47Var.f467677g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467674d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f467675e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f467676f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f467677g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f467674d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f467675e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f467676f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f467677g);
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
        r45.t47 t47Var = (r45.t47) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t47Var.f467674d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            t47Var.f467675e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            t47Var.f467676f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        t47Var.f467677g = aVar2.i(intValue);
        return 0;
    }
}
