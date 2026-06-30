package r45;

/* loaded from: classes9.dex */
public class w43 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470405d;

    /* renamed from: e, reason: collision with root package name */
    public int f470406e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470407f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w43)) {
            return false;
        }
        r45.w43 w43Var = (r45.w43) fVar;
        return n51.f.a(this.f470405d, w43Var.f470405d) && n51.f.a(java.lang.Integer.valueOf(this.f470406e), java.lang.Integer.valueOf(w43Var.f470406e)) && n51.f.a(this.f470407f, w43Var.f470407f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470405d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f470406e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470407f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f470405d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f470406e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470407f;
            return gVar2 != null ? j17 + b36.f.b(3, gVar2) : j17;
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
        r45.w43 w43Var = (r45.w43) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            w43Var.f470405d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            w43Var.f470406e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        w43Var.f470407f = aVar2.d(intValue);
        return 0;
    }
}
