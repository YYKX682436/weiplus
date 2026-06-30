package r45;

/* loaded from: classes4.dex */
public class n80 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462682d;

    /* renamed from: e, reason: collision with root package name */
    public int f462683e;

    /* renamed from: f, reason: collision with root package name */
    public r45.tn4 f462684f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n80)) {
            return false;
        }
        r45.n80 n80Var = (r45.n80) fVar;
        return n51.f.a(this.f462682d, n80Var.f462682d) && n51.f.a(java.lang.Integer.valueOf(this.f462683e), java.lang.Integer.valueOf(n80Var.f462683e)) && n51.f.a(this.f462684f, n80Var.f462684f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462682d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f462683e);
            r45.tn4 tn4Var = this.f462684f;
            if (tn4Var != null) {
                fVar.i(3, tn4Var.mo75928xcd1e8d8());
                this.f462684f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f462682d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f462683e);
            r45.tn4 tn4Var2 = this.f462684f;
            return tn4Var2 != null ? j17 + b36.f.i(3, tn4Var2.mo75928xcd1e8d8()) : j17;
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
        r45.n80 n80Var = (r45.n80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            n80Var.f462682d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            n80Var.f462683e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.tn4 tn4Var3 = new r45.tn4();
            if (bArr != null && bArr.length > 0) {
                tn4Var3.mo11468x92b714fd(bArr);
            }
            n80Var.f462684f = tn4Var3;
        }
        return 0;
    }
}
