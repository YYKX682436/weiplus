package t45;

/* loaded from: classes2.dex */
public class y0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public t45.n0 f497196d;

    /* renamed from: e, reason: collision with root package name */
    public int f497197e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof t45.y0)) {
            return false;
        }
        t45.y0 y0Var = (t45.y0) fVar;
        return n51.f.a(this.f497196d, y0Var.f497196d) && n51.f.a(java.lang.Integer.valueOf(this.f497197e), java.lang.Integer.valueOf(y0Var.f497197e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            t45.n0 n0Var = this.f497196d;
            if (n0Var != null) {
                fVar.i(1, n0Var.mo75928xcd1e8d8());
                this.f497196d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f497197e);
            return 0;
        }
        if (i17 == 1) {
            t45.n0 n0Var2 = this.f497196d;
            return (n0Var2 != null ? 0 + b36.f.i(1, n0Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f497197e);
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
        t45.y0 y0Var = (t45.y0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            y0Var.f497197e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            t45.n0 n0Var3 = new t45.n0();
            if (bArr != null && bArr.length > 0) {
                n0Var3.mo11468x92b714fd(bArr);
            }
            y0Var.f497196d = n0Var3;
        }
        return 0;
    }
}
