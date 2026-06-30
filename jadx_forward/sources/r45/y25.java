package r45;

/* loaded from: classes9.dex */
public class y25 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.vl5 f472263d;

    /* renamed from: e, reason: collision with root package name */
    public int f472264e;

    /* renamed from: f, reason: collision with root package name */
    public int f472265f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y25)) {
            return false;
        }
        r45.y25 y25Var = (r45.y25) fVar;
        return n51.f.a(this.f472263d, y25Var.f472263d) && n51.f.a(java.lang.Integer.valueOf(this.f472264e), java.lang.Integer.valueOf(y25Var.f472264e)) && n51.f.a(java.lang.Integer.valueOf(this.f472265f), java.lang.Integer.valueOf(y25Var.f472265f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.vl5 vl5Var = this.f472263d;
            if (vl5Var != null) {
                fVar.i(1, vl5Var.mo75928xcd1e8d8());
                this.f472263d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f472264e);
            fVar.e(3, this.f472265f);
            return 0;
        }
        if (i17 == 1) {
            r45.vl5 vl5Var2 = this.f472263d;
            return (vl5Var2 != null ? 0 + b36.f.i(1, vl5Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f472264e) + b36.f.e(3, this.f472265f);
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
        r45.y25 y25Var = (r45.y25) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                y25Var.f472264e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            y25Var.f472265f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.vl5 vl5Var3 = new r45.vl5();
            if (bArr != null && bArr.length > 0) {
                vl5Var3.mo11468x92b714fd(bArr);
            }
            y25Var.f472263d = vl5Var3;
        }
        return 0;
    }
}
