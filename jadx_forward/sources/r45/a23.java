package r45;

/* loaded from: classes2.dex */
public class a23 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f451196d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451197e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451198f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a23)) {
            return false;
        }
        r45.a23 a23Var = (r45.a23) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f451196d), java.lang.Boolean.valueOf(a23Var.f451196d)) && n51.f.a(this.f451197e, a23Var.f451197e) && n51.f.a(this.f451198f, a23Var.f451198f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f451196d);
            java.lang.String str = this.f451197e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f451198f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f451196d) + 0;
            java.lang.String str3 = this.f451197e;
            if (str3 != null) {
                a17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f451198f;
            return str4 != null ? a17 + b36.f.j(3, str4) : a17;
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
        r45.a23 a23Var = (r45.a23) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a23Var.f451196d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            a23Var.f451197e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        a23Var.f451198f = aVar2.k(intValue);
        return 0;
    }
}
