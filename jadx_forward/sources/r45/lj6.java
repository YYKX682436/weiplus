package r45;

/* loaded from: classes4.dex */
public class lj6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461062d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ef7 f461063e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461064f;

    /* renamed from: g, reason: collision with root package name */
    public int f461065g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lj6)) {
            return false;
        }
        r45.lj6 lj6Var = (r45.lj6) fVar;
        return n51.f.a(this.f461062d, lj6Var.f461062d) && n51.f.a(this.f461063e, lj6Var.f461063e) && n51.f.a(this.f461064f, lj6Var.f461064f) && n51.f.a(java.lang.Integer.valueOf(this.f461065g), java.lang.Integer.valueOf(lj6Var.f461065g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461062d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.ef7 ef7Var = this.f461063e;
            if (ef7Var != null) {
                fVar.i(2, ef7Var.mo75928xcd1e8d8());
                this.f461063e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f461064f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f461065g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f461062d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.ef7 ef7Var2 = this.f461063e;
            if (ef7Var2 != null) {
                j17 += b36.f.i(2, ef7Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f461064f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f461065g);
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
        r45.lj6 lj6Var = (r45.lj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lj6Var.f461062d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                lj6Var.f461064f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            lj6Var.f461065g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.ef7 ef7Var3 = new r45.ef7();
            if (bArr != null && bArr.length > 0) {
                ef7Var3.mo11468x92b714fd(bArr);
            }
            lj6Var.f461063e = ef7Var3;
        }
        return 0;
    }
}
