package r45;

/* loaded from: classes11.dex */
public class pn4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464761d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464762e;

    /* renamed from: f, reason: collision with root package name */
    public int f464763f;

    /* renamed from: g, reason: collision with root package name */
    public int f464764g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pn4)) {
            return false;
        }
        r45.pn4 pn4Var = (r45.pn4) fVar;
        return n51.f.a(this.f464761d, pn4Var.f464761d) && n51.f.a(this.f464762e, pn4Var.f464762e) && n51.f.a(java.lang.Integer.valueOf(this.f464763f), java.lang.Integer.valueOf(pn4Var.f464763f)) && n51.f.a(java.lang.Integer.valueOf(this.f464764g), java.lang.Integer.valueOf(pn4Var.f464764g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464761d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f464762e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f464763f);
            fVar.e(4, this.f464764g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f464761d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f464762e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f464763f) + b36.f.e(4, this.f464764g);
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
        r45.pn4 pn4Var = (r45.pn4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            pn4Var.f464761d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            pn4Var.f464762e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            pn4Var.f464763f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        pn4Var.f464764g = aVar2.g(intValue);
        return 0;
    }
}
