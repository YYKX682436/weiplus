package r45;

/* loaded from: classes2.dex */
public class fg7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455859d;

    /* renamed from: e, reason: collision with root package name */
    public int f455860e;

    /* renamed from: f, reason: collision with root package name */
    public int f455861f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455862g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fg7)) {
            return false;
        }
        r45.fg7 fg7Var = (r45.fg7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455859d), java.lang.Integer.valueOf(fg7Var.f455859d)) && n51.f.a(java.lang.Integer.valueOf(this.f455860e), java.lang.Integer.valueOf(fg7Var.f455860e)) && n51.f.a(java.lang.Integer.valueOf(this.f455861f), java.lang.Integer.valueOf(fg7Var.f455861f)) && n51.f.a(this.f455862g, fg7Var.f455862g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455859d);
            fVar.e(2, this.f455860e);
            fVar.e(3, this.f455861f);
            java.lang.String str = this.f455862g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f455859d) + 0 + b36.f.e(2, this.f455860e) + b36.f.e(3, this.f455861f);
            java.lang.String str2 = this.f455862g;
            return str2 != null ? e17 + b36.f.j(4, str2) : e17;
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
        r45.fg7 fg7Var = (r45.fg7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fg7Var.f455859d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            fg7Var.f455860e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            fg7Var.f455861f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        fg7Var.f455862g = aVar2.k(intValue);
        return 0;
    }
}
