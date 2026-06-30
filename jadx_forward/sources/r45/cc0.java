package r45;

/* loaded from: classes4.dex */
public class cc0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452980d;

    /* renamed from: e, reason: collision with root package name */
    public int f452981e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452982f;

    /* renamed from: g, reason: collision with root package name */
    public int f452983g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cc0)) {
            return false;
        }
        r45.cc0 cc0Var = (r45.cc0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452980d), java.lang.Integer.valueOf(cc0Var.f452980d)) && n51.f.a(java.lang.Integer.valueOf(this.f452981e), java.lang.Integer.valueOf(cc0Var.f452981e)) && n51.f.a(this.f452982f, cc0Var.f452982f) && n51.f.a(java.lang.Integer.valueOf(this.f452983g), java.lang.Integer.valueOf(cc0Var.f452983g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452980d);
            fVar.e(2, this.f452981e);
            java.lang.String str = this.f452982f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f452983g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452980d) + 0 + b36.f.e(2, this.f452981e);
            java.lang.String str2 = this.f452982f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.e(4, this.f452983g);
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
        r45.cc0 cc0Var = (r45.cc0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cc0Var.f452980d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            cc0Var.f452981e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            cc0Var.f452982f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        cc0Var.f452983g = aVar2.g(intValue);
        return 0;
    }
}
