package r45;

/* loaded from: classes4.dex */
public class p76 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f464347d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464348e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f464349f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p76)) {
            return false;
        }
        r45.p76 p76Var = (r45.p76) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f464347d), java.lang.Integer.valueOf(p76Var.f464347d)) && n51.f.a(this.f464348e, p76Var.f464348e) && n51.f.a(java.lang.Boolean.valueOf(this.f464349f), java.lang.Boolean.valueOf(p76Var.f464349f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f464347d);
            java.lang.String str = this.f464348e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f464349f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f464347d) + 0;
            java.lang.String str2 = this.f464348e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.a(3, this.f464349f);
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
        r45.p76 p76Var = (r45.p76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p76Var.f464347d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            p76Var.f464348e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        p76Var.f464349f = aVar2.c(intValue);
        return 0;
    }
}
