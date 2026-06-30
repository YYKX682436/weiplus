package r45;

/* loaded from: classes7.dex */
public class z47 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.b47 f473247d;

    /* renamed from: e, reason: collision with root package name */
    public int f473248e;

    /* renamed from: f, reason: collision with root package name */
    public int f473249f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z47)) {
            return false;
        }
        r45.z47 z47Var = (r45.z47) fVar;
        return n51.f.a(this.f473247d, z47Var.f473247d) && n51.f.a(java.lang.Integer.valueOf(this.f473248e), java.lang.Integer.valueOf(z47Var.f473248e)) && n51.f.a(java.lang.Integer.valueOf(this.f473249f), java.lang.Integer.valueOf(z47Var.f473249f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.b47 b47Var = this.f473247d;
            if (b47Var != null) {
                fVar.i(1, b47Var.mo75928xcd1e8d8());
                this.f473247d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f473248e);
            fVar.e(3, this.f473249f);
            return 0;
        }
        if (i17 == 1) {
            r45.b47 b47Var2 = this.f473247d;
            return (b47Var2 != null ? 0 + b36.f.i(1, b47Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f473248e) + b36.f.e(3, this.f473249f);
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
        r45.z47 z47Var = (r45.z47) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                z47Var.f473248e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            z47Var.f473249f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.b47 b47Var3 = new r45.b47();
            if (bArr != null && bArr.length > 0) {
                b47Var3.mo11468x92b714fd(bArr);
            }
            z47Var.f473247d = b47Var3;
        }
        return 0;
    }
}
