package r45;

/* loaded from: classes4.dex */
public class lf7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cf7 f460970d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460971e;

    /* renamed from: f, reason: collision with root package name */
    public int f460972f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460973g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lf7)) {
            return false;
        }
        r45.lf7 lf7Var = (r45.lf7) fVar;
        return n51.f.a(this.f460970d, lf7Var.f460970d) && n51.f.a(this.f460971e, lf7Var.f460971e) && n51.f.a(java.lang.Integer.valueOf(this.f460972f), java.lang.Integer.valueOf(lf7Var.f460972f)) && n51.f.a(this.f460973g, lf7Var.f460973g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cf7 cf7Var = this.f460970d;
            if (cf7Var != null) {
                fVar.i(1, cf7Var.mo75928xcd1e8d8());
                this.f460970d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f460971e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f460972f);
            java.lang.String str2 = this.f460973g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.cf7 cf7Var2 = this.f460970d;
            int i18 = cf7Var2 != null ? 0 + b36.f.i(1, cf7Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f460971e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f460972f);
            java.lang.String str4 = this.f460973g;
            return str4 != null ? e17 + b36.f.j(4, str4) : e17;
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
        r45.lf7 lf7Var = (r45.lf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                lf7Var.f460971e = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                lf7Var.f460972f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            lf7Var.f460973g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.cf7 cf7Var3 = new r45.cf7();
            if (bArr != null && bArr.length > 0) {
                cf7Var3.mo11468x92b714fd(bArr);
            }
            lf7Var.f460970d = cf7Var3;
        }
        return 0;
    }
}
