package r45;

/* loaded from: classes2.dex */
public class fz6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f456286d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456287e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456288f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fz6)) {
            return false;
        }
        r45.fz6 fz6Var = (r45.fz6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f456286d), java.lang.Integer.valueOf(fz6Var.f456286d)) && n51.f.a(this.f456287e, fz6Var.f456287e) && n51.f.a(this.f456288f, fz6Var.f456288f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f456286d);
            java.lang.String str = this.f456287e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f456288f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f456286d) + 0;
            java.lang.String str3 = this.f456287e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f456288f;
            return str4 != null ? e17 + b36.f.j(3, str4) : e17;
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
        r45.fz6 fz6Var = (r45.fz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fz6Var.f456286d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            fz6Var.f456287e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        fz6Var.f456288f = aVar2.k(intValue);
        return 0;
    }
}
