package r45;

/* loaded from: classes9.dex */
public class eg0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f454959d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f454960e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454961f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.eg0)) {
            return false;
        }
        r45.eg0 eg0Var = (r45.eg0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f454959d), java.lang.Boolean.valueOf(eg0Var.f454959d)) && n51.f.a(java.lang.Boolean.valueOf(this.f454960e), java.lang.Boolean.valueOf(eg0Var.f454960e)) && n51.f.a(this.f454961f, eg0Var.f454961f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f454959d);
            fVar.a(2, this.f454960e);
            java.lang.String str = this.f454961f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f454959d) + 0 + b36.f.a(2, this.f454960e);
            java.lang.String str2 = this.f454961f;
            return str2 != null ? a17 + b36.f.j(3, str2) : a17;
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
        r45.eg0 eg0Var = (r45.eg0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            eg0Var.f454959d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            eg0Var.f454960e = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        eg0Var.f454961f = aVar2.k(intValue);
        return 0;
    }
}
