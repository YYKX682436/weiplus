package r45;

/* loaded from: classes2.dex */
public class u11 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f468458d;

    /* renamed from: e, reason: collision with root package name */
    public r45.qb1 f468459e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u11)) {
            return false;
        }
        r45.u11 u11Var = (r45.u11) fVar;
        return n51.f.a(this.f468458d, u11Var.f468458d) && n51.f.a(this.f468459e, u11Var.f468459e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f468458d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            r45.qb1 qb1Var = this.f468459e;
            if (qb1Var != null) {
                fVar.i(2, qb1Var.mo75928xcd1e8d8());
                this.f468459e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f468458d;
            int b17 = gVar2 != null ? 0 + b36.f.b(1, gVar2) : 0;
            r45.qb1 qb1Var2 = this.f468459e;
            return qb1Var2 != null ? b17 + b36.f.i(2, qb1Var2.mo75928xcd1e8d8()) : b17;
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
        r45.u11 u11Var = (r45.u11) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            u11Var.f468458d = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.qb1 qb1Var3 = new r45.qb1();
            if (bArr != null && bArr.length > 0) {
                qb1Var3.mo11468x92b714fd(bArr);
            }
            u11Var.f468459e = qb1Var3;
        }
        return 0;
    }
}
