package r45;

/* loaded from: classes8.dex */
public class lf0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.n35 f460936d;

    /* renamed from: e, reason: collision with root package name */
    public int f460937e;

    /* renamed from: f, reason: collision with root package name */
    public int f460938f;

    /* renamed from: g, reason: collision with root package name */
    public int f460939g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lf0)) {
            return false;
        }
        r45.lf0 lf0Var = (r45.lf0) fVar;
        return n51.f.a(this.f76494x2de60e5e, lf0Var.f76494x2de60e5e) && n51.f.a(this.f460936d, lf0Var.f460936d) && n51.f.a(java.lang.Integer.valueOf(this.f460937e), java.lang.Integer.valueOf(lf0Var.f460937e)) && n51.f.a(java.lang.Integer.valueOf(this.f460938f), java.lang.Integer.valueOf(lf0Var.f460938f)) && n51.f.a(java.lang.Integer.valueOf(this.f460939g), java.lang.Integer.valueOf(lf0Var.f460939g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            r45.n35 n35Var = this.f460936d;
            if (n35Var != null) {
                fVar.i(2, n35Var.mo75928xcd1e8d8());
                this.f460936d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f460937e);
            fVar.e(4, this.f460938f);
            fVar.e(5, this.f460939g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.n35 n35Var2 = this.f460936d;
            if (n35Var2 != null) {
                i18 += b36.f.i(2, n35Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(3, this.f460937e) + b36.f.e(4, this.f460938f) + b36.f.e(5, this.f460939g);
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
        r45.lf0 lf0Var = (r45.lf0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                lf0Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                lf0Var.f460937e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 4) {
                lf0Var.f460938f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            lf0Var.f460939g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.n35 n35Var3 = new r45.n35();
            if (bArr2 != null && bArr2.length > 0) {
                n35Var3.mo11468x92b714fd(bArr2);
            }
            lf0Var.f460936d = n35Var3;
        }
        return 0;
    }
}
