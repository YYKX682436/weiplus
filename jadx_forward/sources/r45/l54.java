package r45;

/* loaded from: classes2.dex */
public class l54 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f460683d;

    /* renamed from: e, reason: collision with root package name */
    public r45.lq4 f460684e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l54)) {
            return false;
        }
        r45.l54 l54Var = (r45.l54) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f460683d), java.lang.Integer.valueOf(l54Var.f460683d)) && n51.f.a(this.f460684e, l54Var.f460684e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f460683d);
            r45.lq4 lq4Var = this.f460684e;
            if (lq4Var != null) {
                fVar.i(2, lq4Var.mo75928xcd1e8d8());
                this.f460684e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f460683d) + 0;
            r45.lq4 lq4Var2 = this.f460684e;
            return lq4Var2 != null ? e17 + b36.f.i(2, lq4Var2.mo75928xcd1e8d8()) : e17;
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
        r45.l54 l54Var = (r45.l54) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l54Var.f460683d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.lq4 lq4Var3 = new r45.lq4();
            if (bArr != null && bArr.length > 0) {
                lq4Var3.mo11468x92b714fd(bArr);
            }
            l54Var.f460684e = lq4Var3;
        }
        return 0;
    }
}
