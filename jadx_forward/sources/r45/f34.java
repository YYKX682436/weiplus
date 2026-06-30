package r45;

/* loaded from: classes9.dex */
public class f34 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455516d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455517e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455518f;

    /* renamed from: g, reason: collision with root package name */
    public int f455519g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f34)) {
            return false;
        }
        r45.f34 f34Var = (r45.f34) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455516d), java.lang.Integer.valueOf(f34Var.f455516d)) && n51.f.a(this.f455517e, f34Var.f455517e) && n51.f.a(this.f455518f, f34Var.f455518f) && n51.f.a(java.lang.Integer.valueOf(this.f455519g), java.lang.Integer.valueOf(f34Var.f455519g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455516d);
            java.lang.String str = this.f455517e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f455518f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f455519g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f455516d) + 0;
            java.lang.String str3 = this.f455517e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f455518f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            return e17 + b36.f.e(4, this.f455519g);
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
        r45.f34 f34Var = (r45.f34) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f34Var.f455516d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            f34Var.f455517e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            f34Var.f455518f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        f34Var.f455519g = aVar2.g(intValue);
        return 0;
    }
}
